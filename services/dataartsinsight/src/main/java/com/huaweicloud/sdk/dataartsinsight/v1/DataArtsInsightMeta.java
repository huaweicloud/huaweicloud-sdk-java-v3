package com.huaweicloud.sdk.dataartsinsight.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dataartsinsight.v1.model.BatchSaveAuthRequest;
import com.huaweicloud.sdk.dataartsinsight.v1.model.BatchSaveAuthResponse;
import com.huaweicloud.sdk.dataartsinsight.v1.model.CooperateAuthorizationDto;
import com.huaweicloud.sdk.dataartsinsight.v1.model.CooperateAuthorizationRuleDto;
import com.huaweicloud.sdk.dataartsinsight.v1.model.CreateWorkspaceRequest;
import com.huaweicloud.sdk.dataartsinsight.v1.model.CreateWorkspaceResponse;
import com.huaweicloud.sdk.dataartsinsight.v1.model.DeleteWorkspaceRequest;
import com.huaweicloud.sdk.dataartsinsight.v1.model.DeleteWorkspaceResponse;
import com.huaweicloud.sdk.dataartsinsight.v1.model.ListAuthPropertiesRequest;
import com.huaweicloud.sdk.dataartsinsight.v1.model.ListAuthPropertiesResponse;
import com.huaweicloud.sdk.dataartsinsight.v1.model.ListAuthedRequest;
import com.huaweicloud.sdk.dataartsinsight.v1.model.ListAuthedResponse;
import com.huaweicloud.sdk.dataartsinsight.v1.model.ListWorkspacesRequest;
import com.huaweicloud.sdk.dataartsinsight.v1.model.ListWorkspacesResponse;
import com.huaweicloud.sdk.dataartsinsight.v1.model.SaveOrUpdateAuthPropertiesRequest;
import com.huaweicloud.sdk.dataartsinsight.v1.model.SaveOrUpdateAuthPropertiesResponse;
import com.huaweicloud.sdk.dataartsinsight.v1.model.UpdateWorkspaceRequest;
import com.huaweicloud.sdk.dataartsinsight.v1.model.UpdateWorkspaceResponse;
import com.huaweicloud.sdk.dataartsinsight.v1.model.WorkspaceDTO;

import java.util.List;

@SuppressWarnings("unchecked")
public class DataArtsInsightMeta {

    public static final HttpRequestDef<BatchSaveAuthRequest, BatchSaveAuthResponse> batchSaveAuth =
        genForBatchSaveAuth();

    private static HttpRequestDef<BatchSaveAuthRequest, BatchSaveAuthResponse> genForBatchSaveAuth() {
        // basic
        HttpRequestDef.Builder<BatchSaveAuthRequest, BatchSaveAuthResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchSaveAuthRequest.class, BatchSaveAuthResponse.class)
                .withName("BatchSaveAuth")
                .withUri("/v1/{project_id}/authorization/cooperate-authorization/rules/batch-save")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Workspace-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchSaveAuthRequest::getXWorkspaceId, BatchSaveAuthRequest::setXWorkspaceId));
        builder.<List<CooperateAuthorizationRuleDto>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchSaveAuthRequest::getBody, BatchSaveAuthRequest::setBody)
                .withInnerContainerType(CooperateAuthorizationRuleDto.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkspaceRequest, CreateWorkspaceResponse> createWorkspace =
        genForCreateWorkspace();

    private static HttpRequestDef<CreateWorkspaceRequest, CreateWorkspaceResponse> genForCreateWorkspace() {
        // basic
        HttpRequestDef.Builder<CreateWorkspaceRequest, CreateWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWorkspaceRequest.class, CreateWorkspaceResponse.class)
                .withName("CreateWorkspace")
                .withUri("/v1/{project_id}/instances/{instance_id}/workspaces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWorkspaceRequest::getInstanceId, CreateWorkspaceRequest::setInstanceId));
        builder.<WorkspaceDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkspaceDTO.class),
            f -> f.withMarshaller(CreateWorkspaceRequest::getBody, CreateWorkspaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWorkspaceRequest, DeleteWorkspaceResponse> deleteWorkspace =
        genForDeleteWorkspace();

    private static HttpRequestDef<DeleteWorkspaceRequest, DeleteWorkspaceResponse> genForDeleteWorkspace() {
        // basic
        HttpRequestDef.Builder<DeleteWorkspaceRequest, DeleteWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteWorkspaceRequest.class, DeleteWorkspaceResponse.class)
                .withName("DeleteWorkspace")
                .withUri("/v1/{project_id}/instances/{instance_id}/workspaces/{workspace_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkspaceRequest::getInstanceId, DeleteWorkspaceRequest::setInstanceId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkspaceRequest::getWorkspaceId, DeleteWorkspaceRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuthPropertiesRequest, ListAuthPropertiesResponse> listAuthProperties =
        genForListAuthProperties();

    private static HttpRequestDef<ListAuthPropertiesRequest, ListAuthPropertiesResponse> genForListAuthProperties() {
        // basic
        HttpRequestDef.Builder<ListAuthPropertiesRequest, ListAuthPropertiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuthPropertiesRequest.class, ListAuthPropertiesResponse.class)
                .withName("ListAuthProperties")
                .withUri("/v1/{project_id}/authorization/cooperate-authorization/properties")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthPropertiesRequest::getResourceId, ListAuthPropertiesRequest::setResourceId));
        builder.<String>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthPropertiesRequest::getResourceType,
                ListAuthPropertiesRequest::setResourceType));
        builder.<String>withRequestField("X-Workspace-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthPropertiesRequest::getXWorkspaceId,
                ListAuthPropertiesRequest::setXWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuthedRequest, ListAuthedResponse> listAuthed = genForListAuthed();

    private static HttpRequestDef<ListAuthedRequest, ListAuthedResponse> genForListAuthed() {
        // basic
        HttpRequestDef.Builder<ListAuthedRequest, ListAuthedResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuthedRequest.class, ListAuthedResponse.class)
                .withName("ListAuthed")
                .withUri("/v1/{project_id}/authorization/cooperate-authorization/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("auth_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthedRequest::getAuthLevel, ListAuthedRequest::setAuthLevel));
        builder.<Boolean>withRequestField("filter_authed",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAuthedRequest::getFilterAuthed, ListAuthedRequest::setFilterAuthed));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthedRequest::getResourceId, ListAuthedRequest::setResourceId));
        builder.<String>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthedRequest::getResourceType, ListAuthedRequest::setResourceType));
        builder.<String>withRequestField("auth_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthedRequest::getAuthName, ListAuthedRequest::setAuthName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthedRequest::getLimit, ListAuthedRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthedRequest::getOffset, ListAuthedRequest::setOffset));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthedRequest::getSortDir, ListAuthedRequest::setSortDir));
        builder.<String>withRequestField("X-Workspace-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthedRequest::getXWorkspaceId, ListAuthedRequest::setXWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkspacesRequest, ListWorkspacesResponse> listWorkspaces =
        genForListWorkspaces();

    private static HttpRequestDef<ListWorkspacesRequest, ListWorkspacesResponse> genForListWorkspaces() {
        // basic
        HttpRequestDef.Builder<ListWorkspacesRequest, ListWorkspacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkspacesRequest.class, ListWorkspacesResponse.class)
                .withName("ListWorkspaces")
                .withUri("/v1/{project_id}/instances/{instance_id}/workspaces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getInstanceId, ListWorkspacesRequest::setInstanceId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getName, ListWorkspacesRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getOffset, ListWorkspacesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getLimit, ListWorkspacesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveOrUpdateAuthPropertiesRequest, SaveOrUpdateAuthPropertiesResponse> saveOrUpdateAuthProperties =
        genForSaveOrUpdateAuthProperties();

    private static HttpRequestDef<SaveOrUpdateAuthPropertiesRequest, SaveOrUpdateAuthPropertiesResponse> genForSaveOrUpdateAuthProperties() {
        // basic
        HttpRequestDef.Builder<SaveOrUpdateAuthPropertiesRequest, SaveOrUpdateAuthPropertiesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SaveOrUpdateAuthPropertiesRequest.class,
                    SaveOrUpdateAuthPropertiesResponse.class)
                .withName("SaveOrUpdateAuthProperties")
                .withUri("/v1/{project_id}/authorization/cooperate-authorization/properties")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Workspace-Id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveOrUpdateAuthPropertiesRequest::getXWorkspaceId,
                SaveOrUpdateAuthPropertiesRequest::setXWorkspaceId));
        builder.<CooperateAuthorizationDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CooperateAuthorizationDto.class),
            f -> f.withMarshaller(SaveOrUpdateAuthPropertiesRequest::getBody,
                SaveOrUpdateAuthPropertiesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkspaceRequest, UpdateWorkspaceResponse> updateWorkspace =
        genForUpdateWorkspace();

    private static HttpRequestDef<UpdateWorkspaceRequest, UpdateWorkspaceResponse> genForUpdateWorkspace() {
        // basic
        HttpRequestDef.Builder<UpdateWorkspaceRequest, UpdateWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateWorkspaceRequest.class, UpdateWorkspaceResponse.class)
                .withName("UpdateWorkspace")
                .withUri("/v1/{project_id}/instances/{instance_id}/workspaces/{workspace_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkspaceRequest::getInstanceId, UpdateWorkspaceRequest::setInstanceId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkspaceRequest::getWorkspaceId, UpdateWorkspaceRequest::setWorkspaceId));
        builder.<WorkspaceDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WorkspaceDTO.class),
            f -> f.withMarshaller(UpdateWorkspaceRequest::getBody, UpdateWorkspaceRequest::setBody));

        // response

        return builder.build();
    }

}
