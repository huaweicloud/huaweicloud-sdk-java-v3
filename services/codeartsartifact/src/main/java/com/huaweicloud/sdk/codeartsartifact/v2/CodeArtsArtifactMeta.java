package com.huaweicloud.sdk.codeartsartifact.v2;

import com.huaweicloud.sdk.codeartsartifact.v2.model.AttentionDO;
import com.huaweicloud.sdk.codeartsartifact.v2.model.BatchDeleteTrashesRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.BatchDeleteTrashesResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.BatchRestoreRepoRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.BatchRestoreRepoResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.CreateArtifactoryRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.CreateArtifactoryResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.CreateAttentionRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.CreateAttentionResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.CreateDockerRepositoriesRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.CreateDockerRepositoriesResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.CreateDockerRepositoryDO;
import com.huaweicloud.sdk.codeartsartifact.v2.model.CreateMavenRepoRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.CreateMavenRepoResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.CreateNotMavenRepoDO;
import com.huaweicloud.sdk.codeartsartifact.v2.model.CreateProjectRelatedRepositoryRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.CreateProjectRelatedRepositoryResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.DeleteArtifactFileRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.DeleteArtifactFileResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.DeleteRepositoryRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.DeleteRepositoryResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.IDEPrivilageProjectInfo;
import com.huaweicloud.sdk.codeartsartifact.v2.model.IDERepoRevisionModel;
import com.huaweicloud.sdk.codeartsartifact.v2.model.IDERepoSearchDO;
import com.huaweicloud.sdk.codeartsartifact.v2.model.IDERepositoryDO;
import com.huaweicloud.sdk.codeartsartifact.v2.model.IDERepositoryPair;
import com.huaweicloud.sdk.codeartsartifact.v2.model.IDETrashArtifactModel;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListAllRepositoriesRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListAllRepositoriesResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListArtifactoryComponentRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListArtifactoryComponentResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListArtifactoryStorageStatisticRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListArtifactoryStorageStatisticResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListAttentionsRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListAttentionsResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ModifyRepositoryRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ModifyRepositoryResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.PathMap;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ResetUserPasswordRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ResetUserPasswordResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.SearchArtifactsRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.SearchArtifactsResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.SearchByChecksumRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.SearchByChecksumResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowAuditRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowAuditResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowFileTreeRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowFileTreeResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowMavenInfoRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowMavenInfoResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowProjectListRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowProjectListResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowProjectReleaseFilesRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowProjectReleaseFilesResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowReleaseProjectFilesRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowReleaseProjectFilesResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowRepositoryInfoRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowRepositoryInfoResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowRepositoryRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowRepositoryResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowStorageRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowStorageResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.TrashArtifactModelForDelete;
import com.huaweicloud.sdk.codeartsartifact.v2.model.UpdateArtifactoryRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.UpdateArtifactoryResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.UpdateNotMavenRepoDO;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class CodeArtsArtifactMeta {

    public static final HttpRequestDef<BatchDeleteTrashesRequest, BatchDeleteTrashesResponse> batchDeleteTrashes =
        genForbatchDeleteTrashes();

    private static HttpRequestDef<BatchDeleteTrashesRequest, BatchDeleteTrashesResponse> genForbatchDeleteTrashes() {
        // basic
        HttpRequestDef.Builder<BatchDeleteTrashesRequest, BatchDeleteTrashesResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, BatchDeleteTrashesRequest.class, BatchDeleteTrashesResponse.class)
                .withName("BatchDeleteTrashes")
                .withUri("/cloudartifact/v5/trashes")
                .withContentType("application/json");

        // requests
        builder.<List<TrashArtifactModelForDelete>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchDeleteTrashesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(TrashArtifactModelForDelete.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRestoreRepoRequest, BatchRestoreRepoResponse> batchRestoreRepo =
        genForbatchRestoreRepo();

    private static HttpRequestDef<BatchRestoreRepoRequest, BatchRestoreRepoResponse> genForbatchRestoreRepo() {
        // basic
        HttpRequestDef.Builder<BatchRestoreRepoRequest, BatchRestoreRepoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchRestoreRepoRequest.class, BatchRestoreRepoResponse.class)
                .withName("BatchRestoreRepo")
                .withUri("/cloudartifact/v5/trashes")
                .withContentType("application/json");

        // requests
        builder.<List<IDETrashArtifactModel>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchRestoreRepoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(IDETrashArtifactModel.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateArtifactoryRequest, CreateArtifactoryResponse> createArtifactory =
        genForcreateArtifactory();

    private static HttpRequestDef<CreateArtifactoryRequest, CreateArtifactoryResponse> genForcreateArtifactory() {
        // basic
        HttpRequestDef.Builder<CreateArtifactoryRequest, CreateArtifactoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateArtifactoryRequest.class, CreateArtifactoryResponse.class)
                .withName("CreateArtifactory")
                .withUri("/cloudartifact/v5/artifact/")
                .withContentType("application/json");

        // requests
        builder.<CreateNotMavenRepoDO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNotMavenRepoDO.class),
            f -> f.withMarshaller(CreateArtifactoryRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAttentionRequest, CreateAttentionResponse> createAttention =
        genForcreateAttention();

    private static HttpRequestDef<CreateAttentionRequest, CreateAttentionResponse> genForcreateAttention() {
        // basic
        HttpRequestDef.Builder<CreateAttentionRequest, CreateAttentionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAttentionRequest.class, CreateAttentionResponse.class)
                .withName("CreateAttention")
                .withUri("/cloudartifact/v5/attention")
                .withContentType("application/json");

        // requests
        builder.<AttentionDO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttentionDO.class),
            f -> f.withMarshaller(CreateAttentionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDockerRepositoriesRequest, CreateDockerRepositoriesResponse> createDockerRepositories =
        genForcreateDockerRepositories();

    private static HttpRequestDef<CreateDockerRepositoriesRequest, CreateDockerRepositoriesResponse> genForcreateDockerRepositories() {
        // basic
        HttpRequestDef.Builder<CreateDockerRepositoriesRequest, CreateDockerRepositoriesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateDockerRepositoriesRequest.class, CreateDockerRepositoriesResponse.class)
                .withName("CreateDockerRepositories")
                .withUri("/cloudartifact/v5/repositories")
                .withContentType("application/json");

        // requests
        builder.<CreateDockerRepositoryDO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDockerRepositoryDO.class),
            f -> f.withMarshaller(CreateDockerRepositoriesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMavenRepoRequest, CreateMavenRepoResponse> createMavenRepo =
        genForcreateMavenRepo();

    private static HttpRequestDef<CreateMavenRepoRequest, CreateMavenRepoResponse> genForcreateMavenRepo() {
        // basic
        HttpRequestDef.Builder<CreateMavenRepoRequest, CreateMavenRepoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMavenRepoRequest.class, CreateMavenRepoResponse.class)
                .withName("CreateMavenRepo")
                .withUri("/cloudartifact/v5/maven/repositories")
                .withContentType("application/json");

        // requests
        builder.<IDERepositoryDO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IDERepositoryDO.class),
            f -> f.withMarshaller(CreateMavenRepoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectRelatedRepositoryRequest, CreateProjectRelatedRepositoryResponse> createProjectRelatedRepository =
        genForcreateProjectRelatedRepository();

    private static HttpRequestDef<CreateProjectRelatedRepositoryRequest, CreateProjectRelatedRepositoryResponse> genForcreateProjectRelatedRepository() {
        // basic
        HttpRequestDef.Builder<CreateProjectRelatedRepositoryRequest, CreateProjectRelatedRepositoryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateProjectRelatedRepositoryRequest.class,
                    CreateProjectRelatedRepositoryResponse.class)
                .withName("CreateProjectRelatedRepository")
                .withUri("/cloudartifact/v5/maven/project/repository")
                .withContentType("application/json");

        // requests
        builder.<IDEPrivilageProjectInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(IDEPrivilageProjectInfo.class),
            f -> f.withMarshaller(CreateProjectRelatedRepositoryRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteArtifactFileRequest, DeleteArtifactFileResponse> deleteArtifactFile =
        genFordeleteArtifactFile();

    private static HttpRequestDef<DeleteArtifactFileRequest, DeleteArtifactFileResponse> genFordeleteArtifactFile() {
        // basic
        HttpRequestDef.Builder<DeleteArtifactFileRequest, DeleteArtifactFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteArtifactFileRequest.class, DeleteArtifactFileResponse.class)
                .withName("DeleteArtifactFile")
                .withUri("/cloudartifact/v5/file")
                .withContentType("application/json");

        // requests
        builder.<PathMap>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PathMap.class),
            f -> f.withMarshaller(DeleteArtifactFileRequest::getBody, (req, v) -> {
                req.setBody(v);
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
                .withUri("/cloudartifact/v5/repositories")
                .withContentType("application/json");

        // requests
        builder.<IDERepoRevisionModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IDERepoRevisionModel.class),
            f -> f.withMarshaller(DeleteRepositoryRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllRepositoriesRequest, ListAllRepositoriesResponse> listAllRepositories =
        genForlistAllRepositories();

    private static HttpRequestDef<ListAllRepositoriesRequest, ListAllRepositoriesResponse> genForlistAllRepositories() {
        // basic
        HttpRequestDef.Builder<ListAllRepositoriesRequest, ListAllRepositoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAllRepositoriesRequest.class, ListAllRepositoriesResponse.class)
                .withName("ListAllRepositories")
                .withUri("/cloudartifact/v5/{tenant_id}/{project_id}/repositories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tenant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllRepositoriesRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            }));
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllRepositoriesRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllRepositoriesRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllRepositoriesRequest::getPageNo, (req, v) -> {
                req.setPageNo(v);
            }));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllRepositoriesRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllRepositoriesRequest::getSort, (req, v) -> {
                req.setSort(v);
            }));
        builder.<String>withRequestField("qname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllRepositoriesRequest::getQname, (req, v) -> {
                req.setQname(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllRepositoriesRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("format",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllRepositoriesRequest::getFormat, (req, v) -> {
                req.setFormat(v);
            }));
        builder.<String>withRequestField("format_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllRepositoriesRequest::getFormatList, (req, v) -> {
                req.setFormatList(v);
            }));
        builder.<Boolean>withRequestField("is_recycle_bin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAllRepositoriesRequest::getIsRecycleBin, (req, v) -> {
                req.setIsRecycleBin(v);
            }));
        builder.<Boolean>withRequestField("is_need_paging",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAllRepositoriesRequest::getIsNeedPaging, (req, v) -> {
                req.setIsNeedPaging(v);
            }));
        builder.<Boolean>withRequestField("in_project",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAllRepositoriesRequest::getInProject, (req, v) -> {
                req.setInProject(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListArtifactoryComponentRequest, ListArtifactoryComponentResponse> listArtifactoryComponent =
        genForlistArtifactoryComponent();

    private static HttpRequestDef<ListArtifactoryComponentRequest, ListArtifactoryComponentResponse> genForlistArtifactoryComponent() {
        // basic
        HttpRequestDef.Builder<ListArtifactoryComponentRequest, ListArtifactoryComponentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListArtifactoryComponentRequest.class, ListArtifactoryComponentResponse.class)
                .withName("ListArtifactoryComponent")
                .withUri("/cloudartifact/v5/{tenant_id}/{project_id}/{repo_name}/file-detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tenant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArtifactoryComponentRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            }));
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArtifactoryComponentRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("repo_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArtifactoryComponentRequest::getRepoName, (req, v) -> {
                req.setRepoName(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArtifactoryComponentRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));
        builder.<String>withRequestField("format",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArtifactoryComponentRequest::getFormat, (req, v) -> {
                req.setFormat(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArtifactoryComponentRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListArtifactoryStorageStatisticRequest, ListArtifactoryStorageStatisticResponse> listArtifactoryStorageStatistic =
        genForlistArtifactoryStorageStatistic();

    private static HttpRequestDef<ListArtifactoryStorageStatisticRequest, ListArtifactoryStorageStatisticResponse> genForlistArtifactoryStorageStatistic() {
        // basic
        HttpRequestDef.Builder<ListArtifactoryStorageStatisticRequest, ListArtifactoryStorageStatisticResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListArtifactoryStorageStatisticRequest.class,
                    ListArtifactoryStorageStatisticResponse.class)
                .withName("ListArtifactoryStorageStatistic")
                .withUri("/cloudartifact/v5/{tenant_id}/{project_id}/storageinfo/statistic")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tenant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArtifactoryStorageStatisticRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            }));
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArtifactoryStorageStatisticRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("repo",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArtifactoryStorageStatisticRequest::getRepo, (req, v) -> {
                req.setRepo(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArtifactoryStorageStatisticRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArtifactoryStorageStatisticRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArtifactoryStorageStatisticRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAttentionsRequest, ListAttentionsResponse> listAttentions =
        genForlistAttentions();

    private static HttpRequestDef<ListAttentionsRequest, ListAttentionsResponse> genForlistAttentions() {
        // basic
        HttpRequestDef.Builder<ListAttentionsRequest, ListAttentionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAttentionsRequest.class, ListAttentionsResponse.class)
                .withName("ListAttentions")
                .withUri("/cloudartifact/v5/attention/artifacts")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAttentionsRequest::getPageNo, (req, v) -> {
                req.setPageNo(v);
            }));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAttentionsRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttentionsRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyRepositoryRequest, ModifyRepositoryResponse> modifyRepository =
        genFormodifyRepository();

    private static HttpRequestDef<ModifyRepositoryRequest, ModifyRepositoryResponse> genFormodifyRepository() {
        // basic
        HttpRequestDef.Builder<ModifyRepositoryRequest, ModifyRepositoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyRepositoryRequest.class, ModifyRepositoryResponse.class)
                .withName("ModifyRepository")
                .withUri("/cloudartifact/v5/repositories/tab/{tab_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tab_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyRepositoryRequest::getTabId, (req, v) -> {
                req.setTabId(v);
            }));
        builder.<IDERepositoryPair>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IDERepositoryPair.class),
            f -> f.withMarshaller(ModifyRepositoryRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetUserPasswordRequest, ResetUserPasswordResponse> resetUserPassword =
        genForresetUserPassword();

    private static HttpRequestDef<ResetUserPasswordRequest, ResetUserPasswordResponse> genForresetUserPassword() {
        // basic
        HttpRequestDef.Builder<ResetUserPasswordRequest, ResetUserPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetUserPasswordRequest.class, ResetUserPasswordResponse.class)
                .withName("ResetUserPassword")
                .withUri("/cloudartifact/v5/maven/users/me")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchArtifactsRequest, SearchArtifactsResponse> searchArtifacts =
        genForsearchArtifacts();

    private static HttpRequestDef<SearchArtifactsRequest, SearchArtifactsResponse> genForsearchArtifacts() {
        // basic
        HttpRequestDef.Builder<SearchArtifactsRequest, SearchArtifactsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SearchArtifactsRequest.class, SearchArtifactsResponse.class)
                .withName("SearchArtifacts")
                .withUri("/cloudartifact/v5/tree/repos/artifacts")
                .withContentType("application/json");

        // requests
        builder.<IDERepoSearchDO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IDERepoSearchDO.class),
            f -> f.withMarshaller(SearchArtifactsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchByChecksumRequest, SearchByChecksumResponse> searchByChecksum =
        genForsearchByChecksum();

    private static HttpRequestDef<SearchByChecksumRequest, SearchByChecksumResponse> genForsearchByChecksum() {
        // basic
        HttpRequestDef.Builder<SearchByChecksumRequest, SearchByChecksumResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchByChecksumRequest.class, SearchByChecksumResponse.class)
                .withName("SearchByChecksum")
                .withUri("/cloudartifact/v5/search/checksum")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("checksum",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchByChecksumRequest::getChecksum, (req, v) -> {
                req.setChecksum(v);
            }));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchByChecksumRequest::getPageNo, (req, v) -> {
                req.setPageNo(v);
            }));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchByChecksumRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<String>withRequestField("format",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchByChecksumRequest::getFormat, (req, v) -> {
                req.setFormat(v);
            }));
        builder.<String>withRequestField("in_project",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchByChecksumRequest::getInProject, (req, v) -> {
                req.setInProject(v);
            }));
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchByChecksumRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuditRequest, ShowAuditResponse> showAudit = genForshowAudit();

    private static HttpRequestDef<ShowAuditRequest, ShowAuditResponse> genForshowAudit() {
        // basic
        HttpRequestDef.Builder<ShowAuditRequest, ShowAuditResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAuditRequest.class, ShowAuditResponse.class)
                .withName("ShowAudit")
                .withUri("/cloudartifact/v5/{tenant_id}/{project_id}/{module}/{repo}/audit")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tenant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            }));
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("module",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditRequest::getModule, (req, v) -> {
                req.setModule(v);
            }));
        builder.<String>withRequestField("repo",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditRequest::getRepo, (req, v) -> {
                req.setRepo(v);
            }));
        builder.<String>withRequestField("user_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("page_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAuditRequest::getPageNum, (req, v) -> {
                req.setPageNum(v);
            }));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAuditRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFileTreeRequest, ShowFileTreeResponse> showFileTree = genForshowFileTree();

    private static HttpRequestDef<ShowFileTreeRequest, ShowFileTreeResponse> genForshowFileTree() {
        // basic
        HttpRequestDef.Builder<ShowFileTreeRequest, ShowFileTreeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFileTreeRequest.class, ShowFileTreeResponse.class)
                .withName("ShowFileTree")
                .withUri("/cloudartifact/v5/{tenant_id}/{project_id}/{repo_name}/file-tree")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tenant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFileTreeRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            }));
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFileTreeRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("repo_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFileTreeRequest::getRepoName, (req, v) -> {
                req.setRepoName(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFileTreeRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFileTreeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Boolean>withRequestField("is_recycle_bin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowFileTreeRequest::getIsRecycleBin, (req, v) -> {
                req.setIsRecycleBin(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMavenInfoRequest, ShowMavenInfoResponse> showMavenInfo =
        genForshowMavenInfo();

    private static HttpRequestDef<ShowMavenInfoRequest, ShowMavenInfoResponse> genForshowMavenInfo() {
        // basic
        HttpRequestDef.Builder<ShowMavenInfoRequest, ShowMavenInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMavenInfoRequest.class, ShowMavenInfoResponse.class)
                .withName("ShowMavenInfo")
                .withUri("/cloudartifact/v5/maven/info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMavenInfoRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("policy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMavenInfoRequest::getPolicy, (req, v) -> {
                req.setPolicy(v);
            }));
        builder.<String>withRequestField("access",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMavenInfoRequest::getAccess, (req, v) -> {
                req.setAccess(v);
            }));
        builder.<String>withRequestField("default",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMavenInfoRequest::getDefault, (req, v) -> {
                req.setDefault(v);
            }));
        builder.<String>withRequestField("ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMavenInfoRequest::getIds, (req, v) -> {
                req.setIds(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectListRequest, ShowProjectListResponse> showProjectList =
        genForshowProjectList();

    private static HttpRequestDef<ShowProjectListRequest, ShowProjectListResponse> genForshowProjectList() {
        // basic
        HttpRequestDef.Builder<ShowProjectListRequest, ShowProjectListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProjectListRequest.class, ShowProjectListResponse.class)
                .withName("ShowProjectList")
                .withUri("/cloudartifact/v5/maven/repository/list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectListRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectReleaseFilesRequest, ShowProjectReleaseFilesResponse> showProjectReleaseFiles =
        genForshowProjectReleaseFiles();

    private static HttpRequestDef<ShowProjectReleaseFilesRequest, ShowProjectReleaseFilesResponse> genForshowProjectReleaseFiles() {
        // basic
        HttpRequestDef.Builder<ShowProjectReleaseFilesRequest, ShowProjectReleaseFilesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowProjectReleaseFilesRequest.class, ShowProjectReleaseFilesResponse.class)
            .withName("ShowProjectReleaseFiles")
            .withUri("/v2/{project_id}/release/files")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectReleaseFilesRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectReleaseFilesRequest::getFileName, (req, v) -> {
                req.setFileName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProjectReleaseFilesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProjectReleaseFilesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReleaseProjectFilesRequest, ShowReleaseProjectFilesResponse> showReleaseProjectFiles =
        genForshowReleaseProjectFiles();

    private static HttpRequestDef<ShowReleaseProjectFilesRequest, ShowReleaseProjectFilesResponse> genForshowReleaseProjectFiles() {
        // basic
        HttpRequestDef.Builder<ShowReleaseProjectFilesRequest, ShowReleaseProjectFilesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowReleaseProjectFilesRequest.class, ShowReleaseProjectFilesResponse.class)
            .withName("ShowReleaseProjectFiles")
            .withUri("/devreposerver/v2/release/{project_id}/files")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReleaseProjectFilesRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReleaseProjectFilesRequest::getFileName, (req, v) -> {
                req.setFileName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowReleaseProjectFilesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowReleaseProjectFilesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryRequest, ShowRepositoryResponse> showRepository =
        genForshowRepository();

    private static HttpRequestDef<ShowRepositoryRequest, ShowRepositoryResponse> genForshowRepository() {
        // basic
        HttpRequestDef.Builder<ShowRepositoryRequest, ShowRepositoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRepositoryRequest.class, ShowRepositoryResponse.class)
                .withName("ShowRepository")
                .withUri("/cloudartifact/v5/{tenant_id}/{project_id}/{repo_id}/repositories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tenant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryRequest::getTenantId, (req, v) -> {
                req.setTenantId(v);
            }));
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryRequest::getProjectId, (req, v) -> {
                req.setProjectId(v);
            }));
        builder.<String>withRequestField("repo_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryRequest::getRepoId, (req, v) -> {
                req.setRepoId(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryInfoRequest, ShowRepositoryInfoResponse> showRepositoryInfo =
        genForshowRepositoryInfo();

    private static HttpRequestDef<ShowRepositoryInfoRequest, ShowRepositoryInfoResponse> genForshowRepositoryInfo() {
        // basic
        HttpRequestDef.Builder<ShowRepositoryInfoRequest, ShowRepositoryInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRepositoryInfoRequest.class, ShowRepositoryInfoResponse.class)
                .withName("ShowRepositoryInfo")
                .withUri("/cloudartifact/v5/repositories/{repo_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repo_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryInfoRequest::getRepoId, (req, v) -> {
                req.setRepoId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStorageRequest, ShowStorageResponse> showStorage = genForshowStorage();

    private static HttpRequestDef<ShowStorageRequest, ShowStorageResponse> genForshowStorage() {
        // basic
        HttpRequestDef.Builder<ShowStorageRequest, ShowStorageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowStorageRequest.class, ShowStorageResponse.class)
                .withName("ShowStorage")
                .withUri("/cloudartifact/v5/storage")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("format_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStorageRequest::getFormatList, (req, v) -> {
                req.setFormatList(v);
            }));
        builder.<String>withRequestField("in_project",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStorageRequest::getInProject, (req, v) -> {
                req.setInProject(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateArtifactoryRequest, UpdateArtifactoryResponse> updateArtifactory =
        genForupdateArtifactory();

    private static HttpRequestDef<UpdateArtifactoryRequest, UpdateArtifactoryResponse> genForupdateArtifactory() {
        // basic
        HttpRequestDef.Builder<UpdateArtifactoryRequest, UpdateArtifactoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateArtifactoryRequest.class, UpdateArtifactoryResponse.class)
                .withName("UpdateArtifactory")
                .withUri("/cloudartifact/v5/artifact/")
                .withContentType("application/json");

        // requests
        builder.<UpdateNotMavenRepoDO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNotMavenRepoDO.class),
            f -> f.withMarshaller(UpdateArtifactoryRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
