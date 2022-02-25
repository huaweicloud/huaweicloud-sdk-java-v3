package com.huaweicloud.sdk.codehub.v3;

import com.huaweicloud.sdk.codehub.v3.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CodeHubMeta {

    public static final HttpRequestDef<CreateCommitRequest, CreateCommitResponse> createCommit = genForcreateCommit();

    private static HttpRequestDef<CreateCommitRequest, CreateCommitResponse> genForcreateCommit() {
        // basic
        HttpRequestDef.Builder<CreateCommitRequest, CreateCommitResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCommitRequest.class, CreateCommitResponse.class)
                .withName("CreateCommit")
                .withUri("/v2/projects/{repo_id}/repository/commits")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repo_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateCommitRequest::getRepoId, (req, v) -> {
                req.setRepoId(v);
            }));
        builder.<CreateCommitRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCommitRequestBody.class),
            f -> f.withMarshaller(CreateCommitRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCommitsRequest, ListCommitsResponse> listCommits = genForlistCommits();

    private static HttpRequestDef<ListCommitsRequest, ListCommitsResponse> genForlistCommits() {
        // basic
        HttpRequestDef.Builder<ListCommitsRequest, ListCommitsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCommitsRequest.class, ListCommitsResponse.class)
                .withName("ListCommits")
                .withUri("/v2/projects/{repo_id}/repository/commits")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repo_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCommitsRequest::getRepoId, (req, v) -> {
                req.setRepoId(v);
            }));
        builder.<String>withRequestField("ref_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitsRequest::getRefName, (req, v) -> {
                req.setRefName(v);
            }));
        builder.<String>withRequestField("since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitsRequest::getSince, (req, v) -> {
                req.setSince(v);
            }));
        builder.<String>withRequestField("until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitsRequest::getUntil, (req, v) -> {
                req.setUntil(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitsRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));
        builder.<Boolean>withRequestField("all",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCommitsRequest::getAll, (req, v) -> {
                req.setAll(v);
            }));
        builder.<Boolean>withRequestField("with_stats",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCommitsRequest::getWithStats, (req, v) -> {
                req.setWithStats(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDiffCommitRequest, ShowDiffCommitResponse> showDiffCommit =
        genForshowDiffCommit();

    private static HttpRequestDef<ShowDiffCommitRequest, ShowDiffCommitResponse> genForshowDiffCommit() {
        // basic
        HttpRequestDef.Builder<ShowDiffCommitRequest, ShowDiffCommitResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDiffCommitRequest.class, ShowDiffCommitResponse.class)
                .withName("ShowDiffCommit")
                .withUri("/v2/projects/{repo_id}/repository/commits/{sha}/diff")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repo_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDiffCommitRequest::getRepoId, (req, v) -> {
                req.setRepoId(v);
            }));
        builder.<String>withRequestField("sha",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDiffCommitRequest::getSha, (req, v) -> {
                req.setSha(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSingleCommitRequest, ShowSingleCommitResponse> showSingleCommit =
        genForshowSingleCommit();

    private static HttpRequestDef<ShowSingleCommitRequest, ShowSingleCommitResponse> genForshowSingleCommit() {
        // basic
        HttpRequestDef.Builder<ShowSingleCommitRequest, ShowSingleCommitResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSingleCommitRequest.class, ShowSingleCommitResponse.class)
                .withName("ShowSingleCommit")
                .withUri("/v2/projects/{repo_id}/repository/commits/{sha}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repo_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSingleCommitRequest::getRepoId, (req, v) -> {
                req.setRepoId(v);
            }));
        builder.<String>withRequestField("sha",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSingleCommitRequest::getSha, (req, v) -> {
                req.setSha(v);
            }));
        builder.<Boolean>withRequestField("stats",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowSingleCommitRequest::getStats, (req, v) -> {
                req.setStats(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFileRequest, ShowFileResponse> showFile = genForshowFile();

    private static HttpRequestDef<ShowFileRequest, ShowFileResponse> genForshowFile() {
        // basic
        HttpRequestDef.Builder<ShowFileRequest, ShowFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFileRequest.class, ShowFileResponse.class)
                .withName("ShowFile")
                .withUri("/v2/projects/{repo_id}/repository/files/{file_path}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repo_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFileRequest::getRepoId, (req, v) -> {
                req.setRepoId(v);
            }));
        builder.<String>withRequestField("file_path",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFileRequest::getFilePath, (req, v) -> {
                req.setFilePath(v);
            }));
        builder.<String>withRequestField("ref",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFileRequest::getRef, (req, v) -> {
                req.setRef(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetAllRepositoryByProjectIdRequest, GetAllRepositoryByProjectIdResponse> getAllRepositoryByProjectId =
        genForgetAllRepositoryByProjectId();

    private static HttpRequestDef<GetAllRepositoryByProjectIdRequest, GetAllRepositoryByProjectIdResponse> genForgetAllRepositoryByProjectId() {
        // basic
        HttpRequestDef.Builder<GetAllRepositoryByProjectIdRequest, GetAllRepositoryByProjectIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    GetAllRepositoryByProjectIdRequest.class,
                    GetAllRepositoryByProjectIdResponse.class)
                .withName("GetAllRepositoryByProjectId")
                .withUri("/v1/projects/{project_uuid}/repositories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetAllRepositoryByProjectIdRequest::getProjectUuid, (req, v) -> {
                req.setProjectUuid(v);
            }));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(GetAllRepositoryByProjectIdRequest::getPageIndex, (req, v) -> {
                req.setPageIndex(v);
            }));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(GetAllRepositoryByProjectIdRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetAllRepositoryByProjectIdRequest::getSearch, (req, v) -> {
                req.setSearch(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetProductTemplatesRequest, GetProductTemplatesResponse> getProductTemplates =
        genForgetProductTemplates();

    private static HttpRequestDef<GetProductTemplatesRequest, GetProductTemplatesResponse> genForgetProductTemplates() {
        // basic
        HttpRequestDef.Builder<GetProductTemplatesRequest, GetProductTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetProductTemplatesRequest.class, GetProductTemplatesResponse.class)
                .withName("GetProductTemplates")
                .withUri("/v1/projects/{project_uuid}/repositories/template_status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetProductTemplatesRequest::getProjectUuid, (req, v) -> {
                req.setProjectUuid(v);
            }));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(GetProductTemplatesRequest::getPageNo, (req, v) -> {
                req.setPageNo(v);
            }));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(GetProductTemplatesRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProductTwoTemplatesRequest, ListProductTwoTemplatesResponse> listProductTwoTemplates =
        genForlistProductTwoTemplates();

    private static HttpRequestDef<ListProductTwoTemplatesRequest, ListProductTwoTemplatesResponse> genForlistProductTwoTemplates() {
        // basic
        HttpRequestDef.Builder<ListProductTwoTemplatesRequest, ListProductTwoTemplatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProductTwoTemplatesRequest.class, ListProductTwoTemplatesResponse.class)
            .withName("ListProductTwoTemplates")
            .withUri("/v2/projects/{project_uuid}/repositories/template-status")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductTwoTemplatesRequest::getProjectUuid, (req, v) -> {
                req.setProjectUuid(v);
            }));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductTwoTemplatesRequest::getPageNo, (req, v) -> {
                req.setPageNo(v);
            }));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductTwoTemplatesRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryNameExistRequest, ShowRepositoryNameExistResponse> showRepositoryNameExist =
        genForshowRepositoryNameExist();

    private static HttpRequestDef<ShowRepositoryNameExistRequest, ShowRepositoryNameExistResponse> genForshowRepositoryNameExist() {
        // basic
        HttpRequestDef.Builder<ShowRepositoryNameExistRequest, ShowRepositoryNameExistResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowRepositoryNameExistRequest.class, ShowRepositoryNameExistResponse.class)
            .withName("ShowRepositoryNameExist")
            .withUri("/v1/projects/{project_uuid}/repositories/validation/{repository_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryNameExistRequest::getProjectUuid, (req, v) -> {
                req.setProjectUuid(v);
            }));
        builder.<String>withRequestField("repository_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryNameExistRequest::getRepositoryName, (req, v) -> {
                req.setRepositoryName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddRepoMembersRequest, AddRepoMembersResponse> addRepoMembers =
        genForaddRepoMembers();

    private static HttpRequestDef<AddRepoMembersRequest, AddRepoMembersResponse> genForaddRepoMembers() {
        // basic
        HttpRequestDef.Builder<AddRepoMembersRequest, AddRepoMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddRepoMembersRequest.class, AddRepoMembersResponse.class)
                .withName("AddRepoMembers")
                .withUri("/v1/repositories/{repository_uuid}/members")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddRepoMembersRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            }));
        builder.<CreateRepoMemberRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRepoMemberRequest.class),
            f -> f.withMarshaller(AddRepoMembersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRepoMemberRequest, DeleteRepoMemberResponse> deleteRepoMember =
        genFordeleteRepoMember();

    private static HttpRequestDef<DeleteRepoMemberRequest, DeleteRepoMemberResponse> genFordeleteRepoMember() {
        // basic
        HttpRequestDef.Builder<DeleteRepoMemberRequest, DeleteRepoMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRepoMemberRequest.class, DeleteRepoMemberResponse.class)
                .withName("DeleteRepoMember")
                .withUri("/v1/repositories/{repository_uuid}/members/{member_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRepoMemberRequest::getMemberId, (req, v) -> {
                req.setMemberId(v);
            }));
        builder.<String>withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRepoMemberRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRepoMembersRequest, ListRepoMembersResponse> listRepoMembers =
        genForlistRepoMembers();

    private static HttpRequestDef<ListRepoMembersRequest, ListRepoMembersResponse> genForlistRepoMembers() {
        // basic
        HttpRequestDef.Builder<ListRepoMembersRequest, ListRepoMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRepoMembersRequest.class, ListRepoMembersResponse.class)
                .withName("ListRepoMembers")
                .withUri("/v1/repositories/{repository_uuid}/members")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepoMembersRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            }));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepoMembersRequest::getPageIndex, (req, v) -> {
                req.setPageIndex(v);
            }));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepoMembersRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<String>withRequestField("subject",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepoMembersRequest::getSubject, (req, v) -> {
                req.setSubject(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetRepoRoleRequest, SetRepoRoleResponse> setRepoRole = genForsetRepoRole();

    private static HttpRequestDef<SetRepoRoleRequest, SetRepoRoleResponse> genForsetRepoRole() {
        // basic
        HttpRequestDef.Builder<SetRepoRoleRequest, SetRepoRoleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetRepoRoleRequest.class, SetRepoRoleResponse.class)
                .withName("SetRepoRole")
                .withUri("/v1/repositories/{repository_uuid}/members/{member_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetRepoRoleRequest::getMemberId, (req, v) -> {
                req.setMemberId(v);
            }));
        builder.<String>withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetRepoRoleRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            }));
        builder.<SetRepoRoleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetRepoRoleRequestBody.class),
            f -> f.withMarshaller(SetRepoRoleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddDeployKeyRequest, AddDeployKeyResponse> addDeployKey = genForaddDeployKey();

    private static HttpRequestDef<AddDeployKeyRequest, AddDeployKeyResponse> genForaddDeployKey() {
        // basic
        HttpRequestDef.Builder<AddDeployKeyRequest, AddDeployKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddDeployKeyRequest.class, AddDeployKeyResponse.class)
                .withName("AddDeployKey")
                .withUri("/v1/repositories/{repository_id}/deploy_keys")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(AddDeployKeyRequest::getRepositoryId, (req, v) -> {
                req.setRepositoryId(v);
            }));
        builder.<AddDeployKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddDeployKeyRequestBody.class),
            f -> f.withMarshaller(AddDeployKeyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddDeployKeyV2Request, AddDeployKeyV2Response> addDeployKeyV2 =
        genForaddDeployKeyV2();

    private static HttpRequestDef<AddDeployKeyV2Request, AddDeployKeyV2Response> genForaddDeployKeyV2() {
        // basic
        HttpRequestDef.Builder<AddDeployKeyV2Request, AddDeployKeyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddDeployKeyV2Request.class, AddDeployKeyV2Response.class)
                .withName("AddDeployKeyV2")
                .withUri("/v2/repositories/{repository_id}/deploy-keys")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(AddDeployKeyV2Request::getRepositoryId, (req, v) -> {
                req.setRepositoryId(v);
            }));
        builder.<AddDeployKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddDeployKeyRequestBody.class),
            f -> f.withMarshaller(AddDeployKeyV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRepositoryRequest, CreateRepositoryResponse> createRepository =
        genForcreateRepository();

    private static HttpRequestDef<CreateRepositoryRequest, CreateRepositoryResponse> genForcreateRepository() {
        // basic
        HttpRequestDef.Builder<CreateRepositoryRequest, CreateRepositoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRepositoryRequest.class, CreateRepositoryResponse.class)
                .withName("CreateRepository")
                .withUri("/v1/repositories")
                .withContentType("application/json");

        // requests
        builder.<CreateRepoRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRepoRequest.class),
            f -> f.withMarshaller(CreateRepositoryRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeployKeyRequest, DeleteDeployKeyResponse> deleteDeployKey =
        genFordeleteDeployKey();

    private static HttpRequestDef<DeleteDeployKeyRequest, DeleteDeployKeyResponse> genFordeleteDeployKey() {
        // basic
        HttpRequestDef.Builder<DeleteDeployKeyRequest, DeleteDeployKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDeployKeyRequest.class, DeleteDeployKeyResponse.class)
                .withName("DeleteDeployKey")
                .withUri("/v1/repositories/{repository_id}/deploy_keys/{key_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("key_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteDeployKeyRequest::getKeyId, (req, v) -> {
                req.setKeyId(v);
            }));
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteDeployKeyRequest::getRepositoryId, (req, v) -> {
                req.setRepositoryId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeployKeyV2Request, DeleteDeployKeyV2Response> deleteDeployKeyV2 =
        genFordeleteDeployKeyV2();

    private static HttpRequestDef<DeleteDeployKeyV2Request, DeleteDeployKeyV2Response> genFordeleteDeployKeyV2() {
        // basic
        HttpRequestDef.Builder<DeleteDeployKeyV2Request, DeleteDeployKeyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDeployKeyV2Request.class, DeleteDeployKeyV2Response.class)
                .withName("DeleteDeployKeyV2")
                .withUri("/v2/repositories/{repository_id}/deploy-keys/{key_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("key_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteDeployKeyV2Request::getKeyId, (req, v) -> {
                req.setKeyId(v);
            }));
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteDeployKeyV2Request::getRepositoryId, (req, v) -> {
                req.setRepositoryId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRepositoryRequest, DeleteRepositoryResponse> deleteRepository =
        genFordeleteRepository();

    private static HttpRequestDef<DeleteRepositoryRequest, DeleteRepositoryResponse> genFordeleteRepository() {
        // basic
        HttpRequestDef.Builder<DeleteRepositoryRequest, DeleteRepositoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRepositoryRequest.class, DeleteRepositoryResponse.class)
                .withName("DeleteRepository")
                .withUri("/v1/repositories/{repository_uuid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRepositoryRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetRepositoryByProjectIdRequest, GetRepositoryByProjectIdResponse> getRepositoryByProjectId =
        genForgetRepositoryByProjectId();

    private static HttpRequestDef<GetRepositoryByProjectIdRequest, GetRepositoryByProjectIdResponse> genForgetRepositoryByProjectId() {
        // basic
        HttpRequestDef.Builder<GetRepositoryByProjectIdRequest, GetRepositoryByProjectIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, GetRepositoryByProjectIdRequest.class, GetRepositoryByProjectIdResponse.class)
                .withName("GetRepositoryByProjectId")
                .withUri("/v1/repositories/{repository_uuid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetRepositoryByProjectIdRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetTemplatesRequest, GetTemplatesResponse> getTemplates = genForgetTemplates();

    private static HttpRequestDef<GetTemplatesRequest, GetTemplatesResponse> genForgetTemplates() {
        // basic
        HttpRequestDef.Builder<GetTemplatesRequest, GetTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetTemplatesRequest.class, GetTemplatesResponse.class)
                .withName("GetTemplates")
                .withUri("/v1/repositories/repository_templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("platform",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetTemplatesRequest::getPlatform, (req, v) -> {
                req.setPlatform(v);
            }));
        builder.<String>withRequestField("language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetTemplatesRequest::getLanguage, (req, v) -> {
                req.setLanguage(v);
            }));
        builder.<String>withRequestField("pipeline",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetTemplatesRequest::getPipeline, (req, v) -> {
                req.setPipeline(v);
            }));
        builder.<String>withRequestField("entertype",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetTemplatesRequest::getEntertype, (req, v) -> {
                req.setEntertype(v);
            }));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetTemplatesRequest::getSearch, (req, v) -> {
                req.setSearch(v);
            }));
        builder.<String>withRequestField("dateorder",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetTemplatesRequest::getDateorder, (req, v) -> {
                req.setDateorder(v);
            }));
        builder.<String>withRequestField("usedtimeorder",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetTemplatesRequest::getUsedtimeorder, (req, v) -> {
                req.setUsedtimeorder(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetTemplatesRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetTemplatesRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(GetTemplatesRequest::getPageNo, (req, v) -> {
                req.setPageNo(v);
            }));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(GetTemplatesRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCommitStatisticsRequest, ListCommitStatisticsResponse> listCommitStatistics =
        genForlistCommitStatistics();

    private static HttpRequestDef<ListCommitStatisticsRequest, ListCommitStatisticsResponse> genForlistCommitStatistics() {
        // basic
        HttpRequestDef.Builder<ListCommitStatisticsRequest, ListCommitStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCommitStatisticsRequest.class, ListCommitStatisticsResponse.class)
            .withName("ListCommitStatistics")
            .withUri("/v1/repositories/{repository_id}/statistics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitStatisticsRequest::getRepositoryId, (req, v) -> {
                req.setRepositoryId(v);
            }));
        builder.<String>withRequestField("branch_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitStatisticsRequest::getBranchName, (req, v) -> {
                req.setBranchName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFilesRequest, ListFilesResponse> listFiles = genForlistFiles();

    private static HttpRequestDef<ListFilesRequest, ListFilesResponse> genForlistFiles() {
        // basic
        HttpRequestDef.Builder<ListFilesRequest, ListFilesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFilesRequest.class, ListFilesResponse.class)
                .withName("ListFiles")
                .withUri("/v1/repositories/{repository_uuid}/branch/{branch_name}/file")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFilesRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            }));
        builder.<String>withRequestField("branch_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFilesRequest::getBranchName, (req, v) -> {
                req.setBranchName(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFilesRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRepositoryStatusRequest, ListRepositoryStatusResponse> listRepositoryStatus =
        genForlistRepositoryStatus();

    private static HttpRequestDef<ListRepositoryStatusRequest, ListRepositoryStatusResponse> genForlistRepositoryStatus() {
        // basic
        HttpRequestDef.Builder<ListRepositoryStatusRequest, ListRepositoryStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRepositoryStatusRequest.class, ListRepositoryStatusResponse.class)
            .withName("ListRepositoryStatus")
            .withUri("/v1/repositories/{repository_uuid}/status")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryStatusRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubfilesRequest, ListSubfilesResponse> listSubfiles = genForlistSubfiles();

    private static HttpRequestDef<ListSubfilesRequest, ListSubfilesResponse> genForlistSubfiles() {
        // basic
        HttpRequestDef.Builder<ListSubfilesRequest, ListSubfilesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSubfilesRequest.class, ListSubfilesResponse.class)
                .withName("ListSubfiles")
                .withUri("/v1/repositories/{repository_uuid}/branch/{branch_name}/sub-files")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubfilesRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            }));
        builder.<String>withRequestField("branch_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubfilesRequest::getBranchName, (req, v) -> {
                req.setBranchName(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubfilesRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubfilesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubfilesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplatesTwoRequest, ListTemplatesTwoResponse> listTemplatesTwo =
        genForlistTemplatesTwo();

    private static HttpRequestDef<ListTemplatesTwoRequest, ListTemplatesTwoResponse> genForlistTemplatesTwo() {
        // basic
        HttpRequestDef.Builder<ListTemplatesTwoRequest, ListTemplatesTwoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ListTemplatesTwoRequest.class, ListTemplatesTwoResponse.class)
                .withName("ListTemplatesTwo")
                .withUri("/v2/repositories/{repository_uuid}/template-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplatesTwoRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            }));
        builder.<RepositoryTemplateVO2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RepositoryTemplateVO2.class),
            f -> f.withMarshaller(ListTemplatesTwoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTwoTemplatesRequest, ListTwoTemplatesResponse> listTwoTemplates =
        genForlistTwoTemplates();

    private static HttpRequestDef<ListTwoTemplatesRequest, ListTwoTemplatesResponse> genForlistTwoTemplates() {
        // basic
        HttpRequestDef.Builder<ListTwoTemplatesRequest, ListTwoTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTwoTemplatesRequest.class, ListTwoTemplatesResponse.class)
                .withName("ListTwoTemplates")
                .withUri("/v2/repositories/repository-templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("platform",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTwoTemplatesRequest::getPlatform, (req, v) -> {
                req.setPlatform(v);
            }));
        builder.<String>withRequestField("language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTwoTemplatesRequest::getLanguage, (req, v) -> {
                req.setLanguage(v);
            }));
        builder.<String>withRequestField("pipeline",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTwoTemplatesRequest::getPipeline, (req, v) -> {
                req.setPipeline(v);
            }));
        builder.<String>withRequestField("enter_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTwoTemplatesRequest::getEnterType, (req, v) -> {
                req.setEnterType(v);
            }));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTwoTemplatesRequest::getSearch, (req, v) -> {
                req.setSearch(v);
            }));
        builder.<String>withRequestField("date_order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTwoTemplatesRequest::getDateOrder, (req, v) -> {
                req.setDateOrder(v);
            }));
        builder.<String>withRequestField("used_time_order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTwoTemplatesRequest::getUsedTimeOrder, (req, v) -> {
                req.setUsedTimeOrder(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTwoTemplatesRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTwoTemplatesRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTwoTemplatesRequest::getPageNo, (req, v) -> {
                req.setPageNo(v);
            }));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTwoTemplatesRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShareTemplatesRequest, ShareTemplatesResponse> shareTemplates =
        genForshareTemplates();

    private static HttpRequestDef<ShareTemplatesRequest, ShareTemplatesResponse> genForshareTemplates() {
        // basic
        HttpRequestDef.Builder<ShareTemplatesRequest, ShareTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ShareTemplatesRequest.class, ShareTemplatesResponse.class)
                .withName("ShareTemplates")
                .withUri("/v1/repositories/{repository_uuid}/template_status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShareTemplatesRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            }));
        builder.<RepositoryTemplateVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RepositoryTemplateVO.class),
            f -> f.withMarshaller(ShareTemplatesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBranchesByRepositoryIdRequest, ShowBranchesByRepositoryIdResponse> showBranchesByRepositoryId =
        genForshowBranchesByRepositoryId();

    private static HttpRequestDef<ShowBranchesByRepositoryIdRequest, ShowBranchesByRepositoryIdResponse> genForshowBranchesByRepositoryId() {
        // basic
        HttpRequestDef.Builder<ShowBranchesByRepositoryIdRequest, ShowBranchesByRepositoryIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowBranchesByRepositoryIdRequest.class,
                    ShowBranchesByRepositoryIdResponse.class)
                .withName("ShowBranchesByRepositoryId")
                .withUri("/v1/repositories/{repository_id}/branches")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBranchesByRepositoryIdRequest::getRepositoryId, (req, v) -> {
                req.setRepositoryId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBranchesByTwoRepositoryIdRequest, ShowBranchesByTwoRepositoryIdResponse> showBranchesByTwoRepositoryId =
        genForshowBranchesByTwoRepositoryId();

    private static HttpRequestDef<ShowBranchesByTwoRepositoryIdRequest, ShowBranchesByTwoRepositoryIdResponse> genForshowBranchesByTwoRepositoryId() {
        // basic
        HttpRequestDef.Builder<ShowBranchesByTwoRepositoryIdRequest, ShowBranchesByTwoRepositoryIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowBranchesByTwoRepositoryIdRequest.class,
                    ShowBranchesByTwoRepositoryIdResponse.class)
                .withName("ShowBranchesByTwoRepositoryId")
                .withUri("/v2/repositories/{repository_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBranchesByTwoRepositoryIdRequest::getRepositoryId, (req, v) -> {
                req.setRepositoryId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCommitsByBranchRequest, ShowCommitsByBranchResponse> showCommitsByBranch =
        genForshowCommitsByBranch();

    private static HttpRequestDef<ShowCommitsByBranchRequest, ShowCommitsByBranchResponse> genForshowCommitsByBranch() {
        // basic
        HttpRequestDef.Builder<ShowCommitsByBranchRequest, ShowCommitsByBranchResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCommitsByBranchRequest.class, ShowCommitsByBranchResponse.class)
                .withName("ShowCommitsByBranch")
                .withUri("/v1/repositories/{group_name}/{repository_name}/commits")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommitsByBranchRequest::getGroupName, (req, v) -> {
                req.setGroupName(v);
            }));
        builder.<String>withRequestField("repository_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommitsByBranchRequest::getRepositoryName, (req, v) -> {
                req.setRepositoryName(v);
            }));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCommitsByBranchRequest::getPageIndex, (req, v) -> {
                req.setPageIndex(v);
            }));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCommitsByBranchRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<String>withRequestField("ref_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommitsByBranchRequest::getRefName, (req, v) -> {
                req.setRefName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCommitsByRepoIdRequest, ShowCommitsByRepoIdResponse> showCommitsByRepoId =
        genForshowCommitsByRepoId();

    private static HttpRequestDef<ShowCommitsByRepoIdRequest, ShowCommitsByRepoIdResponse> genForshowCommitsByRepoId() {
        // basic
        HttpRequestDef.Builder<ShowCommitsByRepoIdRequest, ShowCommitsByRepoIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCommitsByRepoIdRequest.class, ShowCommitsByRepoIdResponse.class)
                .withName("ShowCommitsByRepoId")
                .withUri("/v1/repositories/{repository_id}/commits")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getRepositoryId, (req, v) -> {
                req.setRepositoryId(v);
            }));
        builder.<String>withRequestField("author",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getAuthor, (req, v) -> {
                req.setAuthor(v);
            }));
        builder.<String>withRequestField("begin_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getBeginDate, (req, v) -> {
                req.setBeginDate(v);
            }));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            }));
        builder.<String>withRequestField("message",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getMessage, (req, v) -> {
                req.setMessage(v);
            }));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getPageIndex, (req, v) -> {
                req.setPageIndex(v);
            }));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));
        builder.<String>withRequestField("ref_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getRefName, (req, v) -> {
                req.setRefName(v);
            }));
        builder.<String>withRequestField("stat_format",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getStatFormat, (req, v) -> {
                req.setStatFormat(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHasPipelineRequest, ShowHasPipelineResponse> showHasPipeline =
        genForshowHasPipeline();

    private static HttpRequestDef<ShowHasPipelineRequest, ShowHasPipelineResponse> genForshowHasPipeline() {
        // basic
        HttpRequestDef.Builder<ShowHasPipelineRequest, ShowHasPipelineResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ShowHasPipelineRequest.class, ShowHasPipelineResponse.class)
                .withName("ShowHasPipeline")
                .withUri("/v1/repositories/{repository_uuid}/pipeline")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHasPipelineRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowImageBlobRequest, ShowImageBlobResponse> showImageBlob =
        genForshowImageBlob();

    private static HttpRequestDef<ShowImageBlobRequest, ShowImageBlobResponse> genForshowImageBlob() {
        // basic
        HttpRequestDef.Builder<ShowImageBlobRequest, ShowImageBlobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowImageBlobRequest.class, ShowImageBlobResponse.class)
                .withName("ShowImageBlob")
                .withUri("/v1/repositories/{repository_uuid}/branch/{branch_name}/image")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageBlobRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            }));
        builder.<String>withRequestField("branch_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageBlobRequest::getBranchName, (req, v) -> {
                req.setBranchName(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageBlobRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMasterRequest, ShowMasterResponse> showMaster = genForshowMaster();

    private static HttpRequestDef<ShowMasterRequest, ShowMasterResponse> genForshowMaster() {
        // basic
        HttpRequestDef.Builder<ShowMasterRequest, ShowMasterResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMasterRequest.class, ShowMasterResponse.class)
                .withName("ShowMaster")
                .withUri("/v1/repositories/{repository_uuid}/master")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMasterRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepoIdRequest, ShowRepoIdResponse> showRepoId = genForshowRepoId();

    private static HttpRequestDef<ShowRepoIdRequest, ShowRepoIdResponse> genForshowRepoId() {
        // basic
        HttpRequestDef.Builder<ShowRepoIdRequest, ShowRepoIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRepoIdRequest.class, ShowRepoIdResponse.class)
                .withName("ShowRepoId")
                .withUri("/v1/repositories/repoid")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepoIdRequest::getGroupName, (req, v) -> {
                req.setGroupName(v);
            }));
        builder.<String>withRequestField("repository_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepoIdRequest::getRepositoryName, (req, v) -> {
                req.setRepositoryName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryArchiveRequest, ShowRepositoryArchiveResponse> showRepositoryArchive =
        genForshowRepositoryArchive();

    private static HttpRequestDef<ShowRepositoryArchiveRequest, ShowRepositoryArchiveResponse> genForshowRepositoryArchive() {
        // basic
        HttpRequestDef.Builder<ShowRepositoryArchiveRequest, ShowRepositoryArchiveResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowRepositoryArchiveRequest.class, ShowRepositoryArchiveResponse.class)
            .withName("ShowRepositoryArchive")
            .withUri("/v2/repositories/{repository_uuid}/archive")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryArchiveRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            }));
        builder.<String>withRequestField("sha",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryArchiveRequest::getSha, (req, v) -> {
                req.setSha(v);
            }));
        builder.<String>withRequestField("format",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryArchiveRequest::getFormat, (req, v) -> {
                req.setFormat(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryByUuidRequest, ShowRepositoryByUuidResponse> showRepositoryByUuid =
        genForshowRepositoryByUuid();

    private static HttpRequestDef<ShowRepositoryByUuidRequest, ShowRepositoryByUuidResponse> genForshowRepositoryByUuid() {
        // basic
        HttpRequestDef.Builder<ShowRepositoryByUuidRequest, ShowRepositoryByUuidResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowRepositoryByUuidRequest.class, ShowRepositoryByUuidResponse.class)
            .withName("ShowRepositoryByUuid")
            .withUri("/v2/repositories/{repository_uuid}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryByUuidRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryStatisticsRequest, ShowRepositoryStatisticsResponse> showRepositoryStatistics =
        genForshowRepositoryStatistics();

    private static HttpRequestDef<ShowRepositoryStatisticsRequest, ShowRepositoryStatisticsResponse> genForshowRepositoryStatistics() {
        // basic
        HttpRequestDef.Builder<ShowRepositoryStatisticsRequest, ShowRepositoryStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ShowRepositoryStatisticsRequest.class, ShowRepositoryStatisticsResponse.class)
                .withName("ShowRepositoryStatistics")
                .withUri("/v1/repositories/{repository_id}/statistics")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRepositoryStatisticsRequest::getRepositoryId, (req, v) -> {
                req.setRepositoryId(v);
            }));
        builder.<ShowRepositoryStatisticsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowRepositoryStatisticsRequestBody.class),
            f -> f.withMarshaller(ShowRepositoryStatisticsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStatisticCommitRequest, ShowStatisticCommitResponse> showStatisticCommit =
        genForshowStatisticCommit();

    private static HttpRequestDef<ShowStatisticCommitRequest, ShowStatisticCommitResponse> genForshowStatisticCommit() {
        // basic
        HttpRequestDef.Builder<ShowStatisticCommitRequest, ShowStatisticCommitResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowStatisticCommitRequest.class, ShowStatisticCommitResponse.class)
                .withName("ShowStatisticCommit")
                .withUri("/v2/repositories/{repository_id}/commit_lines")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowStatisticCommitRequest::getRepositoryId, (req, v) -> {
                req.setRepositoryId(v);
            }));
        builder.<String>withRequestField("ref_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStatisticCommitRequest::getRefName, (req, v) -> {
                req.setRefName(v);
            }));
        builder.<String>withRequestField("begin_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStatisticCommitRequest::getBeginDate, (req, v) -> {
                req.setBeginDate(v);
            }));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStatisticCommitRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStatisticCommitV3Request, ShowStatisticCommitV3Response> showStatisticCommitV3 =
        genForshowStatisticCommitV3();

    private static HttpRequestDef<ShowStatisticCommitV3Request, ShowStatisticCommitV3Response> genForshowStatisticCommitV3() {
        // basic
        HttpRequestDef.Builder<ShowStatisticCommitV3Request, ShowStatisticCommitV3Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowStatisticCommitV3Request.class, ShowStatisticCommitV3Response.class)
            .withName("ShowStatisticCommitV3")
            .withUri("/v3/repositories/{repository_id}/commit-lines")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowStatisticCommitV3Request::getRepositoryId, (req, v) -> {
                req.setRepositoryId(v);
            }));
        builder.<String>withRequestField("ref_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStatisticCommitV3Request::getRefName, (req, v) -> {
                req.setRefName(v);
            }));
        builder.<String>withRequestField("begin_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStatisticCommitV3Request::getBeginDate, (req, v) -> {
                req.setBeginDate(v);
            }));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStatisticCommitV3Request::getEndDate, (req, v) -> {
                req.setEndDate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStatisticalDataRequest, ShowStatisticalDataResponse> showStatisticalData =
        genForshowStatisticalData();

    private static HttpRequestDef<ShowStatisticalDataRequest, ShowStatisticalDataResponse> genForshowStatisticalData() {
        // basic
        HttpRequestDef.Builder<ShowStatisticalDataRequest, ShowStatisticalDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowStatisticalDataRequest.class, ShowStatisticalDataResponse.class)
                .withName("ShowStatisticalData")
                .withUri("/v1/repositories/{repository_uuid}/statistic-data")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStatisticalDataRequest::getRepositoryUuid, (req, v) -> {
                req.setRepositoryUuid(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddSshKeyRequest, AddSshKeyResponse> addSshKey = genForaddSshKey();

    private static HttpRequestDef<AddSshKeyRequest, AddSshKeyResponse> genForaddSshKey() {
        // basic
        HttpRequestDef.Builder<AddSshKeyRequest, AddSshKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddSshKeyRequest.class, AddSshKeyResponse.class)
                .withName("AddSshKey")
                .withUri("/v1/users/sshkey")
                .withContentType("application/json");

        // requests
        builder.<AddSshKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddSshKeyRequestBody.class),
            f -> f.withMarshaller(AddSshKeyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSShkeyRequest, DeleteSShkeyResponse> deleteSShkey = genFordeleteSShkey();

    private static HttpRequestDef<DeleteSShkeyRequest, DeleteSShkeyResponse> genFordeleteSShkey() {
        // basic
        HttpRequestDef.Builder<DeleteSShkeyRequest, DeleteSShkeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSShkeyRequest.class, DeleteSShkeyResponse.class)
                .withName("DeleteSShkey")
                .withUri("/v1/users/sshkey/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSShkeyRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSshKeysRequest, ListSshKeysResponse> listSshKeys = genForlistSshKeys();

    private static HttpRequestDef<ListSshKeysRequest, ListSshKeysResponse> genForlistSshKeys() {
        // basic
        HttpRequestDef.Builder<ListSshKeysRequest, ListSshKeysResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSshKeysRequest.class, ListSshKeysResponse.class)
                .withName("ListSshKeys")
                .withUri("/v1/users/sshkey")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPrivateKeyVerifyRequest, ShowPrivateKeyVerifyResponse> showPrivateKeyVerify =
        genForshowPrivateKeyVerify();

    private static HttpRequestDef<ShowPrivateKeyVerifyRequest, ShowPrivateKeyVerifyResponse> genForshowPrivateKeyVerify() {
        // basic
        HttpRequestDef.Builder<ShowPrivateKeyVerifyRequest, ShowPrivateKeyVerifyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowPrivateKeyVerifyRequest.class, ShowPrivateKeyVerifyResponse.class)
            .withName("ShowPrivateKeyVerify")
            .withUri("/v1/users/sshkey/privatekey/verify")
            .withContentType("application/json");

        // requests
        builder.<PrivateKeyVerify>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PrivateKeyVerify.class),
            f -> f.withMarshaller(ShowPrivateKeyVerifyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateHttpsInfoRequest, ValidateHttpsInfoResponse> validateHttpsInfo =
        genForvalidateHttpsInfo();

    private static HttpRequestDef<ValidateHttpsInfoRequest, ValidateHttpsInfoResponse> genForvalidateHttpsInfo() {
        // basic
        HttpRequestDef.Builder<ValidateHttpsInfoRequest, ValidateHttpsInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ValidateHttpsInfoRequest.class, ValidateHttpsInfoResponse.class)
                .withName("ValidateHttpsInfo")
                .withUri("/v1/user/{iam_user_uuid}/validateHttpsInfo")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("iam_user_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidateHttpsInfoRequest::getIamUserUuid, (req, v) -> {
                req.setIamUserUuid(v);
            }));
        builder.<PasswordRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PasswordRequest.class),
            f -> f.withMarshaller(ValidateHttpsInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateHttpsInfoV2Request, ValidateHttpsInfoV2Response> validateHttpsInfoV2 =
        genForvalidateHttpsInfoV2();

    private static HttpRequestDef<ValidateHttpsInfoV2Request, ValidateHttpsInfoV2Response> genForvalidateHttpsInfoV2() {
        // basic
        HttpRequestDef.Builder<ValidateHttpsInfoV2Request, ValidateHttpsInfoV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, ValidateHttpsInfoV2Request.class, ValidateHttpsInfoV2Response.class)
                .withName("ValidateHttpsInfoV2")
                .withUri("/v2/user/{iam_user_uuid}/validate-https-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("iam_user_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidateHttpsInfoV2Request::getIamUserUuid, (req, v) -> {
                req.setIamUserUuid(v);
            }));
        builder.<PasswordRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PasswordRequest.class),
            f -> f.withMarshaller(ValidateHttpsInfoV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectAndRepositoriesRequest, CreateProjectAndRepositoriesResponse> createProjectAndRepositories =
        genForcreateProjectAndRepositories();

    private static HttpRequestDef<CreateProjectAndRepositoriesRequest, CreateProjectAndRepositoriesResponse> genForcreateProjectAndRepositories() {
        // basic
        HttpRequestDef.Builder<CreateProjectAndRepositoriesRequest, CreateProjectAndRepositoriesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateProjectAndRepositoriesRequest.class,
                    CreateProjectAndRepositoriesResponse.class)
                .withName("CreateProjectAndRepositories")
                .withUri("/v2/projects/repositories")
                .withContentType("application/json");

        // requests
        builder.<CreateProjectRepoRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateProjectRepoRequest.class),
            f -> f.withMarshaller(CreateProjectAndRepositoriesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectAndforkRepositoriesRequest, CreateProjectAndforkRepositoriesResponse> createProjectAndforkRepositories =
        genForcreateProjectAndforkRepositories();

    private static HttpRequestDef<CreateProjectAndforkRepositoriesRequest, CreateProjectAndforkRepositoriesResponse> genForcreateProjectAndforkRepositories() {
        // basic
        HttpRequestDef.Builder<CreateProjectAndforkRepositoriesRequest, CreateProjectAndforkRepositoriesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateProjectAndforkRepositoriesRequest.class,
                    CreateProjectAndforkRepositoriesResponse.class)
                .withName("CreateProjectAndforkRepositories")
                .withUri("/v2/projects/repositories/fork")
                .withContentType("application/json");

        // requests
        builder.<ForkProjectRepoRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ForkProjectRepoRequest.class),
            f -> f.withMarshaller(CreateProjectAndforkRepositoriesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserAllRepositoriesRequest, ListUserAllRepositoriesResponse> listUserAllRepositories =
        genForlistUserAllRepositories();

    private static HttpRequestDef<ListUserAllRepositoriesRequest, ListUserAllRepositoriesResponse> genForlistUserAllRepositories() {
        // basic
        HttpRequestDef.Builder<ListUserAllRepositoriesRequest, ListUserAllRepositoriesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListUserAllRepositoriesRequest.class, ListUserAllRepositoriesResponse.class)
            .withName("ListUserAllRepositories")
            .withUri("/v2/projects/repositories")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserAllRepositoriesRequest::getPageIndex, (req, v) -> {
                req.setPageIndex(v);
            }));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserAllRepositoriesRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserAllRepositoriesRequest::getSearch, (req, v) -> {
                req.setSearch(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAllRepositoryByTwoProjectIdRequest, ShowAllRepositoryByTwoProjectIdResponse> showAllRepositoryByTwoProjectId =
        genForshowAllRepositoryByTwoProjectId();

    private static HttpRequestDef<ShowAllRepositoryByTwoProjectIdRequest, ShowAllRepositoryByTwoProjectIdResponse> genForshowAllRepositoryByTwoProjectId() {
        // basic
        HttpRequestDef.Builder<ShowAllRepositoryByTwoProjectIdRequest, ShowAllRepositoryByTwoProjectIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAllRepositoryByTwoProjectIdRequest.class,
                    ShowAllRepositoryByTwoProjectIdResponse.class)
                .withName("ShowAllRepositoryByTwoProjectId")
                .withUri("/v2/projects/{project_uuid}/repositories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllRepositoryByTwoProjectIdRequest::getProjectUuid, (req, v) -> {
                req.setProjectUuid(v);
            }));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAllRepositoryByTwoProjectIdRequest::getPageIndex, (req, v) -> {
                req.setPageIndex(v);
            }));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAllRepositoryByTwoProjectIdRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllRepositoryByTwoProjectIdRequest::getSearch, (req, v) -> {
                req.setSearch(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddHooksRequest, AddHooksResponse> addHooks = genForaddHooks();

    private static HttpRequestDef<AddHooksRequest, AddHooksResponse> genForaddHooks() {
        // basic
        HttpRequestDef.Builder<AddHooksRequest, AddHooksResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddHooksRequest.class, AddHooksResponse.class)
                .withName("AddHooks")
                .withUri("/v1/repositories/{group_name}/{repository_name}/hooks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddHooksRequest::getGroupName, (req, v) -> {
                req.setGroupName(v);
            }));
        builder.<String>withRequestField("repository_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddHooksRequest::getRepositoryName, (req, v) -> {
                req.setRepositoryName(v);
            }));
        builder.<RepositoryHookRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RepositoryHookRequest.class),
            f -> f.withMarshaller(AddHooksRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHooksRequest, DeleteHooksResponse> deleteHooks = genFordeleteHooks();

    private static HttpRequestDef<DeleteHooksRequest, DeleteHooksResponse> genFordeleteHooks() {
        // basic
        HttpRequestDef.Builder<DeleteHooksRequest, DeleteHooksResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteHooksRequest.class, DeleteHooksResponse.class)
                .withName("DeleteHooks")
                .withUri("/v1/repositories/{group_name}/{repository_name}/hooks/{hook_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHooksRequest::getGroupName, (req, v) -> {
                req.setGroupName(v);
            }));
        builder.<Integer>withRequestField("hook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteHooksRequest::getHookId, (req, v) -> {
                req.setHookId(v);
            }));
        builder.<String>withRequestField("repository_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHooksRequest::getRepositoryName, (req, v) -> {
                req.setRepositoryName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHooksRequest, ListHooksResponse> listHooks = genForlistHooks();

    private static HttpRequestDef<ListHooksRequest, ListHooksResponse> genForlistHooks() {
        // basic
        HttpRequestDef.Builder<ListHooksRequest, ListHooksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHooksRequest.class, ListHooksResponse.class)
                .withName("ListHooks")
                .withUri("/v1/repositories/{group_name}/{repository_name}/hooks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHooksRequest::getGroupName, (req, v) -> {
                req.setGroupName(v);
            }));
        builder.<String>withRequestField("repository_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHooksRequest::getRepositoryName, (req, v) -> {
                req.setRepositoryName(v);
            }));
        builder.<String>withRequestField("hook_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHooksRequest::getHookId, (req, v) -> {
                req.setHookId(v);
            }));

        // response

        return builder.build();
    }

}
