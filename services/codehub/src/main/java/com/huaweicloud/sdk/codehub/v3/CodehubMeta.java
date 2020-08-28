package com.huaweicloud.sdk.codehub.v3;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.codehub.v3.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class CodehubMeta {

    public static final HttpRequestDef<GetAllRepositoryByProjectIdRequest, GetAllRepositoryByProjectIdResponse> getAllRepositoryByProjectId = genForgetAllRepositoryByProjectId();

    private static HttpRequestDef<GetAllRepositoryByProjectIdRequest, GetAllRepositoryByProjectIdResponse> genForgetAllRepositoryByProjectId() {
        // basic
        HttpRequestDef.Builder<GetAllRepositoryByProjectIdRequest, GetAllRepositoryByProjectIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetAllRepositoryByProjectIdRequest.class, GetAllRepositoryByProjectIdResponse.class)
                .withUri("/v1/projects/{project_uuid}/repositories");

        // requests
        builder.withRequestField("project_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(GetAllRepositoryByProjectIdRequest::getProjectUuid, (req, v) -> {
                req.setProjectUuid(v);
            })
        );
        builder.withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(GetAllRepositoryByProjectIdRequest::getPageIndex, (req, v) -> {
                req.setPageIndex(v);
            })
        );
        builder.withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(GetAllRepositoryByProjectIdRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            })
        );
        builder.withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetAllRepositoryByProjectIdRequest::getSearch, (req, v) -> {
                req.setSearch(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetProductTemplatesRequest, GetProductTemplatesResponse> getProductTemplates = genForgetProductTemplates();

    private static HttpRequestDef<GetProductTemplatesRequest, GetProductTemplatesResponse> genForgetProductTemplates() {
        // basic
        HttpRequestDef.Builder<GetProductTemplatesRequest, GetProductTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetProductTemplatesRequest.class, GetProductTemplatesResponse.class)
                .withUri("/v1/projects/{project_uuid}/repositories/template_status");

        // requests
        builder.withRequestField("project_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(GetProductTemplatesRequest::getProjectUuid, (req, v) -> {
                req.setProjectUuid(v);
            })
        );
        builder.withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetProductTemplatesRequest::getPageNo, (req, v) -> {
                req.setPageNo(v);
            })
        );
        builder.withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetProductTemplatesRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProductTwoTemplatesRequest, ListProductTwoTemplatesResponse> listProductTwoTemplates = genForlistProductTwoTemplates();

    private static HttpRequestDef<ListProductTwoTemplatesRequest, ListProductTwoTemplatesResponse> genForlistProductTwoTemplates() {
        // basic
        HttpRequestDef.Builder<ListProductTwoTemplatesRequest, ListProductTwoTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProductTwoTemplatesRequest.class, ListProductTwoTemplatesResponse.class)
                .withUri("/v2/projects/{project_uuid}/repositories/template-status");

        // requests
        builder.withRequestField("project_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListProductTwoTemplatesRequest::getProjectUuid, (req, v) -> {
                req.setProjectUuid(v);
            })
        );
        builder.withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProductTwoTemplatesRequest::getPageNo, (req, v) -> {
                req.setPageNo(v);
            })
        );
        builder.withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProductTwoTemplatesRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryNameExistRequest, ShowRepositoryNameExistResponse> showRepositoryNameExist = genForshowRepositoryNameExist();

    private static HttpRequestDef<ShowRepositoryNameExistRequest, ShowRepositoryNameExistResponse> genForshowRepositoryNameExist() {
        // basic
        HttpRequestDef.Builder<ShowRepositoryNameExistRequest, ShowRepositoryNameExistResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRepositoryNameExistRequest.class, ShowRepositoryNameExistResponse.class)
                .withUri("/v1/projects/{project_uuid}/repositories/validation/{repository_name}");

        // requests
        builder.withRequestField("project_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowRepositoryNameExistRequest::getProjectUuid, (req, v) -> {
                req.setProjectUuid(v);
            })
        );
        builder.withRequestField("repository_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowRepositoryNameExistRequest::getRepositoryName, (req, v) -> {
                req.setRepositoryName(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddRepoMembersRequest, AddRepoMembersResponse> addRepoMembers = genForaddRepoMembers();

    private static HttpRequestDef<AddRepoMembersRequest, AddRepoMembersResponse> genForaddRepoMembers() {
        // basic
        HttpRequestDef.Builder<AddRepoMembersRequest, AddRepoMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddRepoMembersRequest.class, AddRepoMembersResponse.class)
                .withUri("/v1/repositories/{repository_uuid}/members")
                .withContentType("application/json");

        // requests
        builder.withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AddRepoMembersRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateRepoMemberRequest.class,
            f -> f.withMarshaller(AddRepoMembersRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRepoMemberRequest, DeleteRepoMemberResponse> deleteRepoMember = genFordeleteRepoMember();

    private static HttpRequestDef<DeleteRepoMemberRequest, DeleteRepoMemberResponse> genFordeleteRepoMember() {
        // basic
        HttpRequestDef.Builder<DeleteRepoMemberRequest, DeleteRepoMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRepoMemberRequest.class, DeleteRepoMemberResponse.class)
                .withUri("/v1/repositories/{repository_uuid}/members/{member_id}");

        // requests
        builder.withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRepoMemberRequest::getMemberId, (req, v) -> {
                req.setMemberId(v);
            })
        );
        builder.withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRepoMemberRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRepoMembersRequest, ListRepoMembersResponse> listRepoMembers = genForlistRepoMembers();

    private static HttpRequestDef<ListRepoMembersRequest, ListRepoMembersResponse> genForlistRepoMembers() {
        // basic
        HttpRequestDef.Builder<ListRepoMembersRequest, ListRepoMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRepoMembersRequest.class, ListRepoMembersResponse.class)
                .withUri("/v1/repositories/{repository_uuid}/members");

        // requests
        builder.withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRepoMembersRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            })
        );
        builder.withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRepoMembersRequest::getPageIndex, (req, v) -> {
                req.setPageIndex(v);
            })
        );
        builder.withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRepoMembersRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            })
        );
        builder.withRequestField("subject",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRepoMembersRequest::getSubject, (req, v) -> {
                req.setSubject(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetRepoRoleRequest, SetRepoRoleResponse> setRepoRole = genForsetRepoRole();

    private static HttpRequestDef<SetRepoRoleRequest, SetRepoRoleResponse> genForsetRepoRole() {
        // basic
        HttpRequestDef.Builder<SetRepoRoleRequest, SetRepoRoleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetRepoRoleRequest.class, SetRepoRoleResponse.class)
                .withUri("/v1/repositories/{repository_uuid}/members/{member_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SetRepoRoleRequest::getMemberId, (req, v) -> {
                req.setMemberId(v);
            })
        );
        builder.withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SetRepoRoleRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SetRepoRoleRequestBody.class,
            f -> f.withMarshaller(SetRepoRoleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddDeployKeyRequest, AddDeployKeyResponse> addDeployKey = genForaddDeployKey();

    private static HttpRequestDef<AddDeployKeyRequest, AddDeployKeyResponse> genForaddDeployKey() {
        // basic
        HttpRequestDef.Builder<AddDeployKeyRequest, AddDeployKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddDeployKeyRequest.class, AddDeployKeyResponse.class)
                .withUri("/v1/repositories/{repository_id}/deploy_keys")
                .withContentType("application/json");

        // requests
        builder.withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(AddDeployKeyRequest::getRepositoryId, (req, v) -> {
                req.setRepositoryId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AddDeployKeyRequest.class,
            f -> f.withMarshaller(AddDeployKeyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddDeployKeyV2Request, AddDeployKeyV2Response> addDeployKeyV2 = genForaddDeployKeyV2();

    private static HttpRequestDef<AddDeployKeyV2Request, AddDeployKeyV2Response> genForaddDeployKeyV2() {
        // basic
        HttpRequestDef.Builder<AddDeployKeyV2Request, AddDeployKeyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddDeployKeyV2Request.class, AddDeployKeyV2Response.class)
                .withUri("/v2/repositories/{repository_id}/deploy-keys")
                .withContentType("application/json");

        // requests
        builder.withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(AddDeployKeyV2Request::getRepositoryId, (req, v) -> {
                req.setRepositoryId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AddDeployKeyRequestBody.class,
            f -> f.withMarshaller(AddDeployKeyV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRepositoryRequest, CreateRepositoryResponse> createRepository = genForcreateRepository();

    private static HttpRequestDef<CreateRepositoryRequest, CreateRepositoryResponse> genForcreateRepository() {
        // basic
        HttpRequestDef.Builder<CreateRepositoryRequest, CreateRepositoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRepositoryRequest.class, CreateRepositoryResponse.class)
                .withUri("/v1/repositories")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateRepoRequest.class,
            f -> f.withMarshaller(CreateRepositoryRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeployKeyRequest, DeleteDeployKeyResponse> deleteDeployKey = genFordeleteDeployKey();

    private static HttpRequestDef<DeleteDeployKeyRequest, DeleteDeployKeyResponse> genFordeleteDeployKey() {
        // basic
        HttpRequestDef.Builder<DeleteDeployKeyRequest, DeleteDeployKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDeployKeyRequest.class, DeleteDeployKeyResponse.class)
                .withUri("/v1/repositories/{repository_id}/deploy_keys/{key_id}");

        // requests
        builder.withRequestField("key_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeleteDeployKeyRequest::getKeyId, (req, v) -> {
                req.setKeyId(v);
            })
        );
        builder.withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeleteDeployKeyRequest::getRepositoryId, (req, v) -> {
                req.setRepositoryId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeployKeyV2Request, DeleteDeployKeyV2Response> deleteDeployKeyV2 = genFordeleteDeployKeyV2();

    private static HttpRequestDef<DeleteDeployKeyV2Request, DeleteDeployKeyV2Response> genFordeleteDeployKeyV2() {
        // basic
        HttpRequestDef.Builder<DeleteDeployKeyV2Request, DeleteDeployKeyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDeployKeyV2Request.class, DeleteDeployKeyV2Response.class)
                .withUri("/v2/repositories/{repository_id}/deploy-keys/{key_id}");

        // requests
        builder.withRequestField("key_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeleteDeployKeyV2Request::getKeyId, (req, v) -> {
                req.setKeyId(v);
            })
        );
        builder.withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeleteDeployKeyV2Request::getRepositoryId, (req, v) -> {
                req.setRepositoryId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRepositoryRequest, DeleteRepositoryResponse> deleteRepository = genFordeleteRepository();

    private static HttpRequestDef<DeleteRepositoryRequest, DeleteRepositoryResponse> genFordeleteRepository() {
        // basic
        HttpRequestDef.Builder<DeleteRepositoryRequest, DeleteRepositoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRepositoryRequest.class, DeleteRepositoryResponse.class)
                .withUri("/v1/repositories/{repository_uuid}");

        // requests
        builder.withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRepositoryRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetRepositoryByProjectIdRequest, GetRepositoryByProjectIdResponse> getRepositoryByProjectId = genForgetRepositoryByProjectId();

    private static HttpRequestDef<GetRepositoryByProjectIdRequest, GetRepositoryByProjectIdResponse> genForgetRepositoryByProjectId() {
        // basic
        HttpRequestDef.Builder<GetRepositoryByProjectIdRequest, GetRepositoryByProjectIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetRepositoryByProjectIdRequest.class, GetRepositoryByProjectIdResponse.class)
                .withUri("/v1/repositories/{repository_uuid}");

        // requests
        builder.withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(GetRepositoryByProjectIdRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetTemplatesRequest, GetTemplatesResponse> getTemplates = genForgetTemplates();

    private static HttpRequestDef<GetTemplatesRequest, GetTemplatesResponse> genForgetTemplates() {
        // basic
        HttpRequestDef.Builder<GetTemplatesRequest, GetTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetTemplatesRequest.class, GetTemplatesResponse.class)
                .withUri("/v1/repositories/repository_templates");

        // requests
        builder.withRequestField("platform",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetTemplatesRequest::getPlatform, (req, v) -> {
                req.setPlatform(v);
            })
        );
        builder.withRequestField("language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetTemplatesRequest::getLanguage, (req, v) -> {
                req.setLanguage(v);
            })
        );
        builder.withRequestField("pipeline",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetTemplatesRequest::getPipeline, (req, v) -> {
                req.setPipeline(v);
            })
        );
        builder.withRequestField("entertype",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetTemplatesRequest::getEntertype, (req, v) -> {
                req.setEntertype(v);
            })
        );
        builder.withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetTemplatesRequest::getSearch, (req, v) -> {
                req.setSearch(v);
            })
        );
        builder.withRequestField("dateorder",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetTemplatesRequest::getDateorder, (req, v) -> {
                req.setDateorder(v);
            })
        );
        builder.withRequestField("usedtimeorder",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetTemplatesRequest::getUsedtimeorder, (req, v) -> {
                req.setUsedtimeorder(v);
            })
        );
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetTemplatesRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(GetTemplatesRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            })
        );
        builder.withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(GetTemplatesRequest::getPageNo, (req, v) -> {
                req.setPageNo(v);
            })
        );
        builder.withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(GetTemplatesRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<LaunchStatisticsRequest, LaunchStatisticsResponse> launchStatistics = genForlaunchStatistics();

    private static HttpRequestDef<LaunchStatisticsRequest, LaunchStatisticsResponse> genForlaunchStatistics() {
        // basic
        HttpRequestDef.Builder<LaunchStatisticsRequest, LaunchStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, LaunchStatisticsRequest.class, LaunchStatisticsResponse.class)
                .withUri("/v1/repositories/{repository_id}/statistics")
                .withContentType("application/json");

        // requests
        builder.withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(LaunchStatisticsRequest::getRepositoryId, (req, v) -> {
                req.setRepositoryId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            LaunchRepoStatisticsRequest.class,
            f -> f.withMarshaller(LaunchStatisticsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCommitStatisticsRequest, ListCommitStatisticsResponse> listCommitStatistics = genForlistCommitStatistics();

    private static HttpRequestDef<ListCommitStatisticsRequest, ListCommitStatisticsResponse> genForlistCommitStatistics() {
        // basic
        HttpRequestDef.Builder<ListCommitStatisticsRequest, ListCommitStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCommitStatisticsRequest.class, ListCommitStatisticsResponse.class)
                .withUri("/v1/repositories/{repository_id}/statistics");

        // requests
        builder.withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListCommitStatisticsRequest::getRepositoryId, (req, v) -> {
                req.setRepositoryId(v);
            })
        );
        builder.withRequestField("branch_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListCommitStatisticsRequest::getBranchName, (req, v) -> {
                req.setBranchName(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFilesRequest, ListFilesResponse> listFiles = genForlistFiles();

    private static HttpRequestDef<ListFilesRequest, ListFilesResponse> genForlistFiles() {
        // basic
        HttpRequestDef.Builder<ListFilesRequest, ListFilesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFilesRequest.class, ListFilesResponse.class)
                .withUri("/v1/repositories/{repository_uuid}/branch/{branch_name}/file");

        // requests
        builder.withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListFilesRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            })
        );
        builder.withRequestField("branch_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListFilesRequest::getBranchName, (req, v) -> {
                req.setBranchName(v);
            })
        );
        builder.withRequestField("path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListFilesRequest::getPath, (req, v) -> {
                req.setPath(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRepositoryStatusRequest, ListRepositoryStatusResponse> listRepositoryStatus = genForlistRepositoryStatus();

    private static HttpRequestDef<ListRepositoryStatusRequest, ListRepositoryStatusResponse> genForlistRepositoryStatus() {
        // basic
        HttpRequestDef.Builder<ListRepositoryStatusRequest, ListRepositoryStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRepositoryStatusRequest.class, ListRepositoryStatusResponse.class)
                .withUri("/v1/repositories/{repository_uuid}/status");

        // requests
        builder.withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRepositoryStatusRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubfilesRequest, ListSubfilesResponse> listSubfiles = genForlistSubfiles();

    private static HttpRequestDef<ListSubfilesRequest, ListSubfilesResponse> genForlistSubfiles() {
        // basic
        HttpRequestDef.Builder<ListSubfilesRequest, ListSubfilesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSubfilesRequest.class, ListSubfilesResponse.class)
                .withUri("/v1/repositories/{repository_uuid}/branch/{branch_name}/sub-files");

        // requests
        builder.withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSubfilesRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            })
        );
        builder.withRequestField("branch_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSubfilesRequest::getBranchName, (req, v) -> {
                req.setBranchName(v);
            })
        );
        builder.withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubfilesRequest::getPath, (req, v) -> {
                req.setPath(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSubfilesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSubfilesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplatesTwoRequest, ListTemplatesTwoResponse> listTemplatesTwo = genForlistTemplatesTwo();

    private static HttpRequestDef<ListTemplatesTwoRequest, ListTemplatesTwoResponse> genForlistTemplatesTwo() {
        // basic
        HttpRequestDef.Builder<ListTemplatesTwoRequest, ListTemplatesTwoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ListTemplatesTwoRequest.class, ListTemplatesTwoResponse.class)
                .withUri("/v2/repositories/{repository_uuid}/template-status")
                .withContentType("application/json");

        // requests
        builder.withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListTemplatesTwoRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RepositoryTemplateVO2.class,
            f -> f.withMarshaller(ListTemplatesTwoRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTwoTemplatesRequest, ListTwoTemplatesResponse> listTwoTemplates = genForlistTwoTemplates();

    private static HttpRequestDef<ListTwoTemplatesRequest, ListTwoTemplatesResponse> genForlistTwoTemplates() {
        // basic
        HttpRequestDef.Builder<ListTwoTemplatesRequest, ListTwoTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTwoTemplatesRequest.class, ListTwoTemplatesResponse.class)
                .withUri("/v2/repositories/repository-templates");

        // requests
        builder.withRequestField("platform",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTwoTemplatesRequest::getPlatform, (req, v) -> {
                req.setPlatform(v);
            })
        );
        builder.withRequestField("language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTwoTemplatesRequest::getLanguage, (req, v) -> {
                req.setLanguage(v);
            })
        );
        builder.withRequestField("pipeline",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTwoTemplatesRequest::getPipeline, (req, v) -> {
                req.setPipeline(v);
            })
        );
        builder.withRequestField("enter_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTwoTemplatesRequest::getEnterType, (req, v) -> {
                req.setEnterType(v);
            })
        );
        builder.withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTwoTemplatesRequest::getSearch, (req, v) -> {
                req.setSearch(v);
            })
        );
        builder.withRequestField("date_order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTwoTemplatesRequest::getDateOrder, (req, v) -> {
                req.setDateOrder(v);
            })
        );
        builder.withRequestField("used_time_order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTwoTemplatesRequest::getUsedTimeOrder, (req, v) -> {
                req.setUsedTimeOrder(v);
            })
        );
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTwoTemplatesRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTwoTemplatesRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            })
        );
        builder.withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListTwoTemplatesRequest::getPageNo, (req, v) -> {
                req.setPageNo(v);
            })
        );
        builder.withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListTwoTemplatesRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShareTemplatesRequest, ShareTemplatesResponse> shareTemplates = genForshareTemplates();

    private static HttpRequestDef<ShareTemplatesRequest, ShareTemplatesResponse> genForshareTemplates() {
        // basic
        HttpRequestDef.Builder<ShareTemplatesRequest, ShareTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ShareTemplatesRequest.class, ShareTemplatesResponse.class)
                .withUri("/v1/repositories/{repository_uuid}/template_status")
                .withContentType("application/json");

        // requests
        builder.withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShareTemplatesRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RepositoryTemplateVO.class,
            f -> f.withMarshaller(ShareTemplatesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBranchesByRepositoryIdRequest, ShowBranchesByRepositoryIdResponse> showBranchesByRepositoryId = genForshowBranchesByRepositoryId();

    private static HttpRequestDef<ShowBranchesByRepositoryIdRequest, ShowBranchesByRepositoryIdResponse> genForshowBranchesByRepositoryId() {
        // basic
        HttpRequestDef.Builder<ShowBranchesByRepositoryIdRequest, ShowBranchesByRepositoryIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBranchesByRepositoryIdRequest.class, ShowBranchesByRepositoryIdResponse.class)
                .withUri("/v1/repositories/{repository_id}/branches");

        // requests
        builder.withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowBranchesByRepositoryIdRequest::getRepositoryId, (req, v) -> {
                req.setRepositoryId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBranchesByTwoRepositoryIdRequest, ShowBranchesByTwoRepositoryIdResponse> showBranchesByTwoRepositoryId = genForshowBranchesByTwoRepositoryId();

    private static HttpRequestDef<ShowBranchesByTwoRepositoryIdRequest, ShowBranchesByTwoRepositoryIdResponse> genForshowBranchesByTwoRepositoryId() {
        // basic
        HttpRequestDef.Builder<ShowBranchesByTwoRepositoryIdRequest, ShowBranchesByTwoRepositoryIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBranchesByTwoRepositoryIdRequest.class, ShowBranchesByTwoRepositoryIdResponse.class)
                .withUri("/v2/repositories/{repository_id}/tags");

        // requests
        builder.withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowBranchesByTwoRepositoryIdRequest::getRepositoryId, (req, v) -> {
                req.setRepositoryId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCommitsByBranchRequest, ShowCommitsByBranchResponse> showCommitsByBranch = genForshowCommitsByBranch();

    private static HttpRequestDef<ShowCommitsByBranchRequest, ShowCommitsByBranchResponse> genForshowCommitsByBranch() {
        // basic
        HttpRequestDef.Builder<ShowCommitsByBranchRequest, ShowCommitsByBranchResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCommitsByBranchRequest.class, ShowCommitsByBranchResponse.class)
                .withUri("/v1/repositories/{group_name}/{repository_name}/commits");

        // requests
        builder.withRequestField("group_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCommitsByBranchRequest::getGroupName, (req, v) -> {
                req.setGroupName(v);
            })
        );
        builder.withRequestField("repository_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCommitsByBranchRequest::getRepositoryName, (req, v) -> {
                req.setRepositoryName(v);
            })
        );
        builder.withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowCommitsByBranchRequest::getPageIndex, (req, v) -> {
                req.setPageIndex(v);
            })
        );
        builder.withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowCommitsByBranchRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            })
        );
        builder.withRequestField("ref_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCommitsByBranchRequest::getRefName, (req, v) -> {
                req.setRefName(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCommitsByRepoIdRequest, ShowCommitsByRepoIdResponse> showCommitsByRepoId = genForshowCommitsByRepoId();

    private static HttpRequestDef<ShowCommitsByRepoIdRequest, ShowCommitsByRepoIdResponse> genForshowCommitsByRepoId() {
        // basic
        HttpRequestDef.Builder<ShowCommitsByRepoIdRequest, ShowCommitsByRepoIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCommitsByRepoIdRequest.class, ShowCommitsByRepoIdResponse.class)
                .withUri("/v1/repositories/{repository_id}/commits");

        // requests
        builder.withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getRepositoryId, (req, v) -> {
                req.setRepositoryId(v);
            })
        );
        builder.withRequestField("author",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getAuthor, (req, v) -> {
                req.setAuthor(v);
            })
        );
        builder.withRequestField("begin_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getBeginDate, (req, v) -> {
                req.setBeginDate(v);
            })
        );
        builder.withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            })
        );
        builder.withRequestField("message",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getMessage, (req, v) -> {
                req.setMessage(v);
            })
        );
        builder.withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getPageIndex, (req, v) -> {
                req.setPageIndex(v);
            })
        );
        builder.withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            })
        );
        builder.withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getPath, (req, v) -> {
                req.setPath(v);
            })
        );
        builder.withRequestField("ref_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getRefName, (req, v) -> {
                req.setRefName(v);
            })
        );
        builder.withRequestField("stat_format",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getStatFormat, (req, v) -> {
                req.setStatFormat(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHasPipelineRequest, ShowHasPipelineResponse> showHasPipeline = genForshowHasPipeline();

    private static HttpRequestDef<ShowHasPipelineRequest, ShowHasPipelineResponse> genForshowHasPipeline() {
        // basic
        HttpRequestDef.Builder<ShowHasPipelineRequest, ShowHasPipelineResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ShowHasPipelineRequest.class, ShowHasPipelineResponse.class)
                .withUri("/v1/repositories/{repository_uuid}/pipeline");

        // requests
        builder.withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowHasPipelineRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowImageBlobRequest, ShowImageBlobResponse> showImageBlob = genForshowImageBlob();

    private static HttpRequestDef<ShowImageBlobRequest, ShowImageBlobResponse> genForshowImageBlob() {
        // basic
        HttpRequestDef.Builder<ShowImageBlobRequest, ShowImageBlobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowImageBlobRequest.class, ShowImageBlobResponse.class)
                .withUri("/v1/repositories/{repository_uuid}/branch/{branch_name}/image");

        // requests
        builder.withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowImageBlobRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            })
        );
        builder.withRequestField("branch_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowImageBlobRequest::getBranchName, (req, v) -> {
                req.setBranchName(v);
            })
        );
        builder.withRequestField("path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowImageBlobRequest::getPath, (req, v) -> {
                req.setPath(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMasterRequest, ShowMasterResponse> showMaster = genForshowMaster();

    private static HttpRequestDef<ShowMasterRequest, ShowMasterResponse> genForshowMaster() {
        // basic
        HttpRequestDef.Builder<ShowMasterRequest, ShowMasterResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMasterRequest.class, ShowMasterResponse.class)
                .withUri("/v1/repositories/{repository_uuid}/master");

        // requests
        builder.withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowMasterRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepoIdRequest, ShowRepoIdResponse> showRepoId = genForshowRepoId();

    private static HttpRequestDef<ShowRepoIdRequest, ShowRepoIdResponse> genForshowRepoId() {
        // basic
        HttpRequestDef.Builder<ShowRepoIdRequest, ShowRepoIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRepoIdRequest.class, ShowRepoIdResponse.class)
                .withUri("/v1/repositories/repoid");

        // requests
        builder.withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowRepoIdRequest::getGroupName, (req, v) -> {
                req.setGroupName(v);
            })
        );
        builder.withRequestField("repository_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowRepoIdRequest::getRepositoryName, (req, v) -> {
                req.setRepositoryName(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryByUUIdRequest, ShowRepositoryByUUIdResponse> showRepositoryByUUId = genForshowRepositoryByUUId();

    private static HttpRequestDef<ShowRepositoryByUUIdRequest, ShowRepositoryByUUIdResponse> genForshowRepositoryByUUId() {
        // basic
        HttpRequestDef.Builder<ShowRepositoryByUUIdRequest, ShowRepositoryByUUIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRepositoryByUUIdRequest.class, ShowRepositoryByUUIdResponse.class)
                .withUri("/v2/repositories/{repository_uuid}");

        // requests
        builder.withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowRepositoryByUUIdRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStatisticalDataRequest, ShowStatisticalDataResponse> showStatisticalData = genForshowStatisticalData();

    private static HttpRequestDef<ShowStatisticalDataRequest, ShowStatisticalDataResponse> genForshowStatisticalData() {
        // basic
        HttpRequestDef.Builder<ShowStatisticalDataRequest, ShowStatisticalDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowStatisticalDataRequest.class, ShowStatisticalDataResponse.class)
                .withUri("/v1/repositories/{repository_uuid}/statistic-data");

        // requests
        builder.withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowStatisticalDataRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddSshKeyRequest, AddSshKeyResponse> addSshKey = genForaddSshKey();

    private static HttpRequestDef<AddSshKeyRequest, AddSshKeyResponse> genForaddSshKey() {
        // basic
        HttpRequestDef.Builder<AddSshKeyRequest, AddSshKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddSshKeyRequest.class, AddSshKeyResponse.class)
                .withUri("/v1/users/sshkey")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            PublicKey.class,
            f -> f.withMarshaller(AddSshKeyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSShkeyRequest, DeleteSShkeyResponse> deleteSShkey = genFordeleteSShkey();

    private static HttpRequestDef<DeleteSShkeyRequest, DeleteSShkeyResponse> genFordeleteSShkey() {
        // basic
        HttpRequestDef.Builder<DeleteSShkeyRequest, DeleteSShkeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSShkeyRequest.class, DeleteSShkeyResponse.class)
                .withUri("/v1/users/sshkey/{id}");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSShkeyRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSSHKeysRequest, ListSSHKeysResponse> listSSHKeys = genForlistSSHKeys();

    private static HttpRequestDef<ListSSHKeysRequest, ListSSHKeysResponse> genForlistSSHKeys() {
        // basic
        HttpRequestDef.Builder<ListSSHKeysRequest, ListSSHKeysResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSSHKeysRequest.class, ListSSHKeysResponse.class)
                .withUri("/v1/users/sshkey");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPrivateKeyVerifyRequest, ShowPrivateKeyVerifyResponse> showPrivateKeyVerify = genForshowPrivateKeyVerify();

    private static HttpRequestDef<ShowPrivateKeyVerifyRequest, ShowPrivateKeyVerifyResponse> genForshowPrivateKeyVerify() {
        // basic
        HttpRequestDef.Builder<ShowPrivateKeyVerifyRequest, ShowPrivateKeyVerifyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowPrivateKeyVerifyRequest.class, ShowPrivateKeyVerifyResponse.class)
                .withUri("/v1/users/sshkey/privatekey/verify")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            PrivateKeyVerify.class,
            f -> f.withMarshaller(ShowPrivateKeyVerifyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateHttpsInfoRequest, ValidateHttpsInfoResponse> validateHttpsInfo = genForvalidateHttpsInfo();

    private static HttpRequestDef<ValidateHttpsInfoRequest, ValidateHttpsInfoResponse> genForvalidateHttpsInfo() {
        // basic
        HttpRequestDef.Builder<ValidateHttpsInfoRequest, ValidateHttpsInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ValidateHttpsInfoRequest.class, ValidateHttpsInfoResponse.class)
                .withUri("/v1/user/{iam_user_uuid}/validateHttpsInfo")
                .withContentType("application/json");

        // requests
        builder.withRequestField("iam_user_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ValidateHttpsInfoRequest::getIamUserUuid, (req, v) -> {
                req.setIamUserUuid(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            PasswordRequest.class,
            f -> f.withMarshaller(ValidateHttpsInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateHttpsInfoV2Request, ValidateHttpsInfoV2Response> validateHttpsInfoV2 = genForvalidateHttpsInfoV2();

    private static HttpRequestDef<ValidateHttpsInfoV2Request, ValidateHttpsInfoV2Response> genForvalidateHttpsInfoV2() {
        // basic
        HttpRequestDef.Builder<ValidateHttpsInfoV2Request, ValidateHttpsInfoV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, ValidateHttpsInfoV2Request.class, ValidateHttpsInfoV2Response.class)
                .withUri("/v2/user/{iam_user_uuid}/validate-https-info")
                .withContentType("application/json");

        // requests
        builder.withRequestField("iam_user_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ValidateHttpsInfoV2Request::getIamUserUuid, (req, v) -> {
                req.setIamUserUuid(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            PasswordRequest.class,
            f -> f.withMarshaller(ValidateHttpsInfoV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectAndRepositoriesRequest, CreateProjectAndRepositoriesResponse> createProjectAndRepositories = genForcreateProjectAndRepositories();

    private static HttpRequestDef<CreateProjectAndRepositoriesRequest, CreateProjectAndRepositoriesResponse> genForcreateProjectAndRepositories() {
        // basic
        HttpRequestDef.Builder<CreateProjectAndRepositoriesRequest, CreateProjectAndRepositoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateProjectAndRepositoriesRequest.class, CreateProjectAndRepositoriesResponse.class)
                .withUri("/v2/projects/repositories")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateProjectRepoRequest.class,
            f -> f.withMarshaller(CreateProjectAndRepositoriesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectAndforkRepositoriesRequest, CreateProjectAndforkRepositoriesResponse> createProjectAndforkRepositories = genForcreateProjectAndforkRepositories();

    private static HttpRequestDef<CreateProjectAndforkRepositoriesRequest, CreateProjectAndforkRepositoriesResponse> genForcreateProjectAndforkRepositories() {
        // basic
        HttpRequestDef.Builder<CreateProjectAndforkRepositoriesRequest, CreateProjectAndforkRepositoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateProjectAndforkRepositoriesRequest.class, CreateProjectAndforkRepositoriesResponse.class)
                .withUri("/v2/projects/repositories/fork")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ForkProjectRepoRequest.class,
            f -> f.withMarshaller(CreateProjectAndforkRepositoriesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserAllRepositoriesRequest, ListUserAllRepositoriesResponse> listUserAllRepositories = genForlistUserAllRepositories();

    private static HttpRequestDef<ListUserAllRepositoriesRequest, ListUserAllRepositoriesResponse> genForlistUserAllRepositories() {
        // basic
        HttpRequestDef.Builder<ListUserAllRepositoriesRequest, ListUserAllRepositoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserAllRepositoriesRequest.class, ListUserAllRepositoriesResponse.class)
                .withUri("/v2/projects/repositories");

        // requests
        builder.withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListUserAllRepositoriesRequest::getPageIndex, (req, v) -> {
                req.setPageIndex(v);
            })
        );
        builder.withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListUserAllRepositoriesRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            })
        );
        builder.withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListUserAllRepositoriesRequest::getSearch, (req, v) -> {
                req.setSearch(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAllRepositoryByTwoProjectIdRequest, ShowAllRepositoryByTwoProjectIdResponse> showAllRepositoryByTwoProjectId = genForshowAllRepositoryByTwoProjectId();

    private static HttpRequestDef<ShowAllRepositoryByTwoProjectIdRequest, ShowAllRepositoryByTwoProjectIdResponse> genForshowAllRepositoryByTwoProjectId() {
        // basic
        HttpRequestDef.Builder<ShowAllRepositoryByTwoProjectIdRequest, ShowAllRepositoryByTwoProjectIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAllRepositoryByTwoProjectIdRequest.class, ShowAllRepositoryByTwoProjectIdResponse.class)
                .withUri("/v2/projects/{project_uuid}/repositories");

        // requests
        builder.withRequestField("project_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowAllRepositoryByTwoProjectIdRequest::getProjectUuid, (req, v) -> {
                req.setProjectUuid(v);
            })
        );
        builder.withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowAllRepositoryByTwoProjectIdRequest::getPageIndex, (req, v) -> {
                req.setPageIndex(v);
            })
        );
        builder.withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowAllRepositoryByTwoProjectIdRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            })
        );
        builder.withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAllRepositoryByTwoProjectIdRequest::getSearch, (req, v) -> {
                req.setSearch(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddHooksRequest, AddHooksResponse> addHooks = genForaddHooks();

    private static HttpRequestDef<AddHooksRequest, AddHooksResponse> genForaddHooks() {
        // basic
        HttpRequestDef.Builder<AddHooksRequest, AddHooksResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddHooksRequest.class, AddHooksResponse.class)
                .withUri("/v1/repositories/{group_name}/{repository_name}/hooks")
                .withContentType("application/json");

        // requests
        builder.withRequestField("group_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AddHooksRequest::getGroupName, (req, v) -> {
                req.setGroupName(v);
            })
        );
        builder.withRequestField("repository_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AddHooksRequest::getRepositoryName, (req, v) -> {
                req.setRepositoryName(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RepositoryHookRequest.class,
            f -> f.withMarshaller(AddHooksRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHooksRequest, DeleteHooksResponse> deleteHooks = genFordeleteHooks();

    private static HttpRequestDef<DeleteHooksRequest, DeleteHooksResponse> genFordeleteHooks() {
        // basic
        HttpRequestDef.Builder<DeleteHooksRequest, DeleteHooksResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteHooksRequest.class, DeleteHooksResponse.class)
                .withUri("/v1/repositories/{group_name}/{repository_name}/hooks/{hook_id}");

        // requests
        builder.withRequestField("group_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteHooksRequest::getGroupName, (req, v) -> {
                req.setGroupName(v);
            })
        );
        builder.withRequestField("hook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeleteHooksRequest::getHookId, (req, v) -> {
                req.setHookId(v);
            })
        );
        builder.withRequestField("repository_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteHooksRequest::getRepositoryName, (req, v) -> {
                req.setRepositoryName(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHooksRequest, ListHooksResponse> listHooks = genForlistHooks();

    private static HttpRequestDef<ListHooksRequest, ListHooksResponse> genForlistHooks() {
        // basic
        HttpRequestDef.Builder<ListHooksRequest, ListHooksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHooksRequest.class, ListHooksResponse.class)
                .withUri("/v1/repositories/{group_name}/{repository_name}/hooks");

        // requests
        builder.withRequestField("group_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListHooksRequest::getGroupName, (req, v) -> {
                req.setGroupName(v);
            })
        );
        builder.withRequestField("repository_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListHooksRequest::getRepositoryName, (req, v) -> {
                req.setRepositoryName(v);
            })
        );
        builder.withRequestField("hook_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHooksRequest::getHookId, (req, v) -> {
                req.setHookId(v);
            })
        );

        // response

        return builder.build();
    }

}
