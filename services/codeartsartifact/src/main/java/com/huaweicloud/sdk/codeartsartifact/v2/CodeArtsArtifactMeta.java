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
import com.huaweicloud.sdk.codeartsartifact.v2.model.DeleteCompletelyUpdateFileStateRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.DeleteCompletelyUpdateFileStateResponse;
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
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListCapacityMessageSettingRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListCapacityMessageSettingResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListChildProxyRepositoriesListRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListChildProxyRepositoriesListResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListDomainIpConfigRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListDomainIpConfigResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListFileBuildArchivesRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListFileBuildArchivesResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListFilesRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListFilesResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListLatestVersionFilesRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListLatestVersionFilesResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListMavenListRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListMavenListResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListMavenUserRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListMavenUserResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListNetProxyRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListNetProxyResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListProjectRolePermissionsRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListProjectRolePermissionsResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListProjectUsersRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListProjectUsersResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListSecGuardListRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ListSecGuardListResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ModifyRepositoryRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ModifyRepositoryResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.PathMap;
import com.huaweicloud.sdk.codeartsartifact.v2.model.RepoFileQueryDTOV5;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ResetUserPasswordRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ResetUserPasswordResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.SearchArtifactsRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.SearchArtifactsResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.SearchByChecksumRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.SearchByChecksumResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowAuditRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowAuditResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowAutoDeleteJobSettingsRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowAutoDeleteJobSettingsResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowDomainReleaseRepoStorageRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowDomainReleaseRepoStorageResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowFileDetailByFullNameRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowFileDetailByFullNameResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowFileDetailRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowFileDetailResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowFileTreeRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowFileTreeResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowLatestVersionFilesCountRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowLatestVersionFilesCountResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowMavenInfoRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowMavenInfoResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowMultiRolesUserPermissionsRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowMultiRolesUserPermissionsResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowOpenSourceEnabledRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowOpenSourceEnabledResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowPackageDataDetailRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowPackageDataDetailResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowPackageInfoRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowPackageInfoResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowProjectListRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowProjectListResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowProjectReleaseFilesRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowProjectReleaseFilesResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowProjectStorageInfoRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowProjectStorageInfoResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowReleaseProjectFilesRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowReleaseProjectFilesResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowRepoUserInfoRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowRepoUserInfoResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowRepositoryInfoRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowRepositoryInfoResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowRepositoryRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowRepositoryResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowStorageRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowStorageResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowUserPrivilegesRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowUserPrivilegesResponse;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowUserTicketRequest;
import com.huaweicloud.sdk.codeartsartifact.v2.model.ShowUserTicketResponse;
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
        genForBatchDeleteTrashes();

    private static HttpRequestDef<BatchDeleteTrashesRequest, BatchDeleteTrashesResponse> genForBatchDeleteTrashes() {
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
            f -> f.withMarshaller(BatchDeleteTrashesRequest::getBody, BatchDeleteTrashesRequest::setBody)
                .withInnerContainerType(TrashArtifactModelForDelete.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRestoreRepoRequest, BatchRestoreRepoResponse> batchRestoreRepo =
        genForBatchRestoreRepo();

    private static HttpRequestDef<BatchRestoreRepoRequest, BatchRestoreRepoResponse> genForBatchRestoreRepo() {
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
            f -> f.withMarshaller(BatchRestoreRepoRequest::getBody, BatchRestoreRepoRequest::setBody)
                .withInnerContainerType(IDETrashArtifactModel.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateArtifactoryRequest, CreateArtifactoryResponse> createArtifactory =
        genForCreateArtifactory();

    private static HttpRequestDef<CreateArtifactoryRequest, CreateArtifactoryResponse> genForCreateArtifactory() {
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
            f -> f.withMarshaller(CreateArtifactoryRequest::getBody, CreateArtifactoryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAttentionRequest, CreateAttentionResponse> createAttention =
        genForCreateAttention();

    private static HttpRequestDef<CreateAttentionRequest, CreateAttentionResponse> genForCreateAttention() {
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
            f -> f.withMarshaller(CreateAttentionRequest::getBody, CreateAttentionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDockerRepositoriesRequest, CreateDockerRepositoriesResponse> createDockerRepositories =
        genForCreateDockerRepositories();

    private static HttpRequestDef<CreateDockerRepositoriesRequest, CreateDockerRepositoriesResponse> genForCreateDockerRepositories() {
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
            f -> f.withMarshaller(CreateDockerRepositoriesRequest::getBody, CreateDockerRepositoriesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMavenRepoRequest, CreateMavenRepoResponse> createMavenRepo =
        genForCreateMavenRepo();

    private static HttpRequestDef<CreateMavenRepoRequest, CreateMavenRepoResponse> genForCreateMavenRepo() {
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
            f -> f.withMarshaller(CreateMavenRepoRequest::getBody, CreateMavenRepoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectRelatedRepositoryRequest, CreateProjectRelatedRepositoryResponse> createProjectRelatedRepository =
        genForCreateProjectRelatedRepository();

    private static HttpRequestDef<CreateProjectRelatedRepositoryRequest, CreateProjectRelatedRepositoryResponse> genForCreateProjectRelatedRepository() {
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
            f -> f.withMarshaller(CreateProjectRelatedRepositoryRequest::getBody,
                CreateProjectRelatedRepositoryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteArtifactFileRequest, DeleteArtifactFileResponse> deleteArtifactFile =
        genForDeleteArtifactFile();

    private static HttpRequestDef<DeleteArtifactFileRequest, DeleteArtifactFileResponse> genForDeleteArtifactFile() {
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
            f -> f.withMarshaller(DeleteArtifactFileRequest::getBody, DeleteArtifactFileRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCompletelyUpdateFileStateRequest, DeleteCompletelyUpdateFileStateResponse> deleteCompletelyUpdateFileState =
        genForDeleteCompletelyUpdateFileState();

    private static HttpRequestDef<DeleteCompletelyUpdateFileStateRequest, DeleteCompletelyUpdateFileStateResponse> genForDeleteCompletelyUpdateFileState() {
        // basic
        HttpRequestDef.Builder<DeleteCompletelyUpdateFileStateRequest, DeleteCompletelyUpdateFileStateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteCompletelyUpdateFileStateRequest.class,
                    DeleteCompletelyUpdateFileStateResponse.class)
                .withName("DeleteCompletelyUpdateFileState")
                .withUri("/devreposerver/v5/files/compeletion")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(DeleteCompletelyUpdateFileStateRequest::getBody,
                    DeleteCompletelyUpdateFileStateRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRepositoryRequest, DeleteRepositoryResponse> deleteRepository =
        genForDeleteRepository();

    private static HttpRequestDef<DeleteRepositoryRequest, DeleteRepositoryResponse> genForDeleteRepository() {
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
            f -> f.withMarshaller(DeleteRepositoryRequest::getBody, DeleteRepositoryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllRepositoriesRequest, ListAllRepositoriesResponse> listAllRepositories =
        genForListAllRepositories();

    private static HttpRequestDef<ListAllRepositoriesRequest, ListAllRepositoriesResponse> genForListAllRepositories() {
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
            f -> f.withMarshaller(ListAllRepositoriesRequest::getTenantId, ListAllRepositoriesRequest::setTenantId));
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllRepositoriesRequest::getProjectId, ListAllRepositoriesRequest::setProjectId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllRepositoriesRequest::getGroupId, ListAllRepositoriesRequest::setGroupId));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllRepositoriesRequest::getPageNo, ListAllRepositoriesRequest::setPageNo));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllRepositoriesRequest::getPageSize, ListAllRepositoriesRequest::setPageSize));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllRepositoriesRequest::getSort, ListAllRepositoriesRequest::setSort));
        builder.<String>withRequestField("qname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllRepositoriesRequest::getQname, ListAllRepositoriesRequest::setQname));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllRepositoriesRequest::getType, ListAllRepositoriesRequest::setType));
        builder.<String>withRequestField("format",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllRepositoriesRequest::getFormat, ListAllRepositoriesRequest::setFormat));
        builder.<String>withRequestField("format_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllRepositoriesRequest::getFormatList,
                ListAllRepositoriesRequest::setFormatList));
        builder.<Boolean>withRequestField("is_recycle_bin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAllRepositoriesRequest::getIsRecycleBin,
                ListAllRepositoriesRequest::setIsRecycleBin));
        builder.<Boolean>withRequestField("is_need_paging",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAllRepositoriesRequest::getIsNeedPaging,
                ListAllRepositoriesRequest::setIsNeedPaging));
        builder.<Boolean>withRequestField("in_project",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAllRepositoriesRequest::getInProject, ListAllRepositoriesRequest::setInProject));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListArtifactoryComponentRequest, ListArtifactoryComponentResponse> listArtifactoryComponent =
        genForListArtifactoryComponent();

    private static HttpRequestDef<ListArtifactoryComponentRequest, ListArtifactoryComponentResponse> genForListArtifactoryComponent() {
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
            f -> f.withMarshaller(ListArtifactoryComponentRequest::getTenantId,
                ListArtifactoryComponentRequest::setTenantId));
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArtifactoryComponentRequest::getProjectId,
                ListArtifactoryComponentRequest::setProjectId));
        builder.<String>withRequestField("repo_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArtifactoryComponentRequest::getRepoName,
                ListArtifactoryComponentRequest::setRepoName));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArtifactoryComponentRequest::getPath, ListArtifactoryComponentRequest::setPath));
        builder.<String>withRequestField("format",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArtifactoryComponentRequest::getFormat,
                ListArtifactoryComponentRequest::setFormat));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArtifactoryComponentRequest::getInstanceId,
                ListArtifactoryComponentRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListArtifactoryStorageStatisticRequest, ListArtifactoryStorageStatisticResponse> listArtifactoryStorageStatistic =
        genForListArtifactoryStorageStatistic();

    private static HttpRequestDef<ListArtifactoryStorageStatisticRequest, ListArtifactoryStorageStatisticResponse> genForListArtifactoryStorageStatistic() {
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
            f -> f.withMarshaller(ListArtifactoryStorageStatisticRequest::getTenantId,
                ListArtifactoryStorageStatisticRequest::setTenantId));
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArtifactoryStorageStatisticRequest::getProjectId,
                ListArtifactoryStorageStatisticRequest::setProjectId));
        builder.<String>withRequestField("repo",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArtifactoryStorageStatisticRequest::getRepo,
                ListArtifactoryStorageStatisticRequest::setRepo));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArtifactoryStorageStatisticRequest::getStartTime,
                ListArtifactoryStorageStatisticRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArtifactoryStorageStatisticRequest::getEndTime,
                ListArtifactoryStorageStatisticRequest::setEndTime));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListArtifactoryStorageStatisticRequest::getInstanceId,
                ListArtifactoryStorageStatisticRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAttentionsRequest, ListAttentionsResponse> listAttentions =
        genForListAttentions();

    private static HttpRequestDef<ListAttentionsRequest, ListAttentionsResponse> genForListAttentions() {
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
            f -> f.withMarshaller(ListAttentionsRequest::getPageNo, ListAttentionsRequest::setPageNo));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAttentionsRequest::getPageSize, ListAttentionsRequest::setPageSize));
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttentionsRequest::getProjectId, ListAttentionsRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCapacityMessageSettingRequest, ListCapacityMessageSettingResponse> listCapacityMessageSetting =
        genForListCapacityMessageSetting();

    private static HttpRequestDef<ListCapacityMessageSettingRequest, ListCapacityMessageSettingResponse> genForListCapacityMessageSetting() {
        // basic
        HttpRequestDef.Builder<ListCapacityMessageSettingRequest, ListCapacityMessageSettingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListCapacityMessageSettingRequest.class,
                    ListCapacityMessageSettingResponse.class)
                .withName("ListCapacityMessageSetting")
                .withUri("/devreposerver/v5/capacity-notice/settings")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListChildProxyRepositoriesListRequest, ListChildProxyRepositoriesListResponse> listChildProxyRepositoriesList =
        genForListChildProxyRepositoriesList();

    private static HttpRequestDef<ListChildProxyRepositoriesListRequest, ListChildProxyRepositoriesListResponse> genForListChildProxyRepositoriesList() {
        // basic
        HttpRequestDef.Builder<ListChildProxyRepositoriesListRequest, ListChildProxyRepositoriesListResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListChildProxyRepositoriesListRequest.class,
                    ListChildProxyRepositoriesListResponse.class)
                .withName("ListChildProxyRepositoriesList")
                .withUri("/cloudartifact/v5/repositories/proxy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repo_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListChildProxyRepositoriesListRequest::getRepoId,
                ListChildProxyRepositoriesListRequest::setRepoId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListChildProxyRepositoriesListRequest::getType,
                ListChildProxyRepositoriesListRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainIpConfigRequest, ListDomainIpConfigResponse> listDomainIpConfig =
        genForListDomainIpConfig();

    private static HttpRequestDef<ListDomainIpConfigRequest, ListDomainIpConfigResponse> genForListDomainIpConfig() {
        // basic
        HttpRequestDef.Builder<ListDomainIpConfigRequest, ListDomainIpConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDomainIpConfigRequest.class, ListDomainIpConfigResponse.class)
                .withName("ListDomainIpConfig")
                .withUri("/cloudartifact/v5/domain/ipconfig")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainIpConfigRequest::getPageNo, ListDomainIpConfigRequest::setPageNo));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainIpConfigRequest::getPageSize, ListDomainIpConfigRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFileBuildArchivesRequest, ListFileBuildArchivesResponse> listFileBuildArchives =
        genForListFileBuildArchives();

    private static HttpRequestDef<ListFileBuildArchivesRequest, ListFileBuildArchivesResponse> genForListFileBuildArchives() {
        // basic
        HttpRequestDef.Builder<ListFileBuildArchivesRequest, ListFileBuildArchivesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListFileBuildArchivesRequest.class, ListFileBuildArchivesResponse.class)
            .withName("ListFileBuildArchives")
            .withUri("/devreposerver/v5/files/archives")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFileBuildArchivesRequest::getParentId,
                ListFileBuildArchivesRequest::setParentId));
        builder.<String>withRequestField("build_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFileBuildArchivesRequest::getBuildId, ListFileBuildArchivesRequest::setBuildId));
        builder.<String>withRequestField("build_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFileBuildArchivesRequest::getBuildNo, ListFileBuildArchivesRequest::setBuildNo));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFileBuildArchivesRequest::getPageNo, ListFileBuildArchivesRequest::setPageNo));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFileBuildArchivesRequest::getPageSize,
                ListFileBuildArchivesRequest::setPageSize));
        builder.<String>withRequestField("repo_branch",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFileBuildArchivesRequest::getRepoBranch,
                ListFileBuildArchivesRequest::setRepoBranch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFilesRequest, ListFilesResponse> listFiles = genForListFiles();

    private static HttpRequestDef<ListFilesRequest, ListFilesResponse> genForListFiles() {
        // basic
        HttpRequestDef.Builder<ListFilesRequest, ListFilesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListFilesRequest.class, ListFilesResponse.class)
                .withName("ListFiles")
                .withUri("/devreposerver/v5/files/list")
                .withContentType("application/json");

        // requests
        builder.<RepoFileQueryDTOV5>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RepoFileQueryDTOV5.class),
            f -> f.withMarshaller(ListFilesRequest::getBody, ListFilesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLatestVersionFilesRequest, ListLatestVersionFilesResponse> listLatestVersionFiles =
        genForListLatestVersionFiles();

    private static HttpRequestDef<ListLatestVersionFilesRequest, ListLatestVersionFilesResponse> genForListLatestVersionFiles() {
        // basic
        HttpRequestDef.Builder<ListLatestVersionFilesRequest, ListLatestVersionFilesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListLatestVersionFilesRequest.class, ListLatestVersionFilesResponse.class)
            .withName("ListLatestVersionFiles")
            .withUri("/devreposerver/v5/{project_id}/files/version")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLatestVersionFilesRequest::getProjectId,
                ListLatestVersionFilesRequest::setProjectId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLatestVersionFilesRequest::getName, ListLatestVersionFilesRequest::setName));
        builder.<String>withRequestField("sort_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLatestVersionFilesRequest::getSortBy, ListLatestVersionFilesRequest::setSortBy));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLatestVersionFilesRequest::getSortDir,
                ListLatestVersionFilesRequest::setSortDir));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLatestVersionFilesRequest::getOffset, ListLatestVersionFilesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLatestVersionFilesRequest::getLimit, ListLatestVersionFilesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMavenListRequest, ListMavenListResponse> listMavenList =
        genForListMavenList();

    private static HttpRequestDef<ListMavenListRequest, ListMavenListResponse> genForListMavenList() {
        // basic
        HttpRequestDef.Builder<ListMavenListRequest, ListMavenListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMavenListRequest.class, ListMavenListResponse.class)
                .withName("ListMavenList")
                .withUri("/cloudartifact/v5/maven/list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMavenListRequest::getProjectId, ListMavenListRequest::setProjectId));
        builder.<Boolean>withRequestField("default",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListMavenListRequest::getDefault, ListMavenListRequest::setDefault));
        builder.<String>withRequestField("policy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMavenListRequest::getPolicy, ListMavenListRequest::setPolicy));
        builder.<String>withRequestField("repo_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMavenListRequest::getRepoIds, ListMavenListRequest::setRepoIds));
        builder.<String>withRequestField("access",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMavenListRequest::getAccess, ListMavenListRequest::setAccess));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMavenUserRequest, ListMavenUserResponse> listMavenUser =
        genForListMavenUser();

    private static HttpRequestDef<ListMavenUserRequest, ListMavenUserResponse> genForListMavenUser() {
        // basic
        HttpRequestDef.Builder<ListMavenUserRequest, ListMavenUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMavenUserRequest.class, ListMavenUserResponse.class)
                .withName("ListMavenUser")
                .withUri("/cloudartifact/v5/repositories/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMavenUserRequest::getUserName, ListMavenUserRequest::setUserName));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMavenUserRequest::getPageNo, ListMavenUserRequest::setPageNo));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMavenUserRequest::getPageSize, ListMavenUserRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNetProxyRequest, ListNetProxyResponse> listNetProxy = genForListNetProxy();

    private static HttpRequestDef<ListNetProxyRequest, ListNetProxyResponse> genForListNetProxy() {
        // basic
        HttpRequestDef.Builder<ListNetProxyRequest, ListNetProxyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNetProxyRequest.class, ListNetProxyResponse.class)
                .withName("ListNetProxy")
                .withUri("/cloudartifact/v5/tree/net/proxy")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectRolePermissionsRequest, ListProjectRolePermissionsResponse> listProjectRolePermissions =
        genForListProjectRolePermissions();

    private static HttpRequestDef<ListProjectRolePermissionsRequest, ListProjectRolePermissionsResponse> genForListProjectRolePermissions() {
        // basic
        HttpRequestDef.Builder<ListProjectRolePermissionsRequest, ListProjectRolePermissionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListProjectRolePermissionsRequest.class,
                    ListProjectRolePermissionsResponse.class)
                .withName("ListProjectRolePermissions")
                .withUri("/devreposerver/v5/project-role/permissions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectRolePermissionsRequest::getProjectId,
                ListProjectRolePermissionsRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectUsersRequest, ListProjectUsersResponse> listProjectUsers =
        genForListProjectUsers();

    private static HttpRequestDef<ListProjectUsersRequest, ListProjectUsersResponse> genForListProjectUsers() {
        // basic
        HttpRequestDef.Builder<ListProjectUsersRequest, ListProjectUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectUsersRequest.class, ListProjectUsersResponse.class)
                .withName("ListProjectUsers")
                .withUri("/cloudartifact/v5/projects/{project_id}/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectUsersRequest::getProjectId, ListProjectUsersRequest::setProjectId));
        builder.<String>withRequestField("repo_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectUsersRequest::getRepoId, ListProjectUsersRequest::setRepoId));
        builder.<String>withRequestField("scene",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectUsersRequest::getScene, ListProjectUsersRequest::setScene));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectUsersRequest::getPageNo, ListProjectUsersRequest::setPageNo));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectUsersRequest::getPageSize, ListProjectUsersRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecGuardListRequest, ListSecGuardListResponse> listSecGuardList =
        genForListSecGuardList();

    private static HttpRequestDef<ListSecGuardListRequest, ListSecGuardListResponse> genForListSecGuardList() {
        // basic
        HttpRequestDef.Builder<ListSecGuardListRequest, ListSecGuardListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSecGuardListRequest.class, ListSecGuardListResponse.class)
                .withName("ListSecGuardList")
                .withUri("/cloudartifact/v5/sec-guard/task/list")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecGuardListRequest::getDate, ListSecGuardListRequest::setDate));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecGuardListRequest::getPageNo, ListSecGuardListRequest::setPageNo));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecGuardListRequest::getPageSize, ListSecGuardListRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyRepositoryRequest, ModifyRepositoryResponse> modifyRepository =
        genForModifyRepository();

    private static HttpRequestDef<ModifyRepositoryRequest, ModifyRepositoryResponse> genForModifyRepository() {
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
            f -> f.withMarshaller(ModifyRepositoryRequest::getTabId, ModifyRepositoryRequest::setTabId));
        builder.<IDERepositoryPair>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IDERepositoryPair.class),
            f -> f.withMarshaller(ModifyRepositoryRequest::getBody, ModifyRepositoryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetUserPasswordRequest, ResetUserPasswordResponse> resetUserPassword =
        genForResetUserPassword();

    private static HttpRequestDef<ResetUserPasswordRequest, ResetUserPasswordResponse> genForResetUserPassword() {
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
        genForSearchArtifacts();

    private static HttpRequestDef<SearchArtifactsRequest, SearchArtifactsResponse> genForSearchArtifacts() {
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
            f -> f.withMarshaller(SearchArtifactsRequest::getBody, SearchArtifactsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchByChecksumRequest, SearchByChecksumResponse> searchByChecksum =
        genForSearchByChecksum();

    private static HttpRequestDef<SearchByChecksumRequest, SearchByChecksumResponse> genForSearchByChecksum() {
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
            f -> f.withMarshaller(SearchByChecksumRequest::getChecksum, SearchByChecksumRequest::setChecksum));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchByChecksumRequest::getPageNo, SearchByChecksumRequest::setPageNo));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchByChecksumRequest::getPageSize, SearchByChecksumRequest::setPageSize));
        builder.<String>withRequestField("format",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchByChecksumRequest::getFormat, SearchByChecksumRequest::setFormat));
        builder.<String>withRequestField("in_project",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchByChecksumRequest::getInProject, SearchByChecksumRequest::setInProject));
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchByChecksumRequest::getProjectId, SearchByChecksumRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuditRequest, ShowAuditResponse> showAudit = genForShowAudit();

    private static HttpRequestDef<ShowAuditRequest, ShowAuditResponse> genForShowAudit() {
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
            f -> f.withMarshaller(ShowAuditRequest::getTenantId, ShowAuditRequest::setTenantId));
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditRequest::getProjectId, ShowAuditRequest::setProjectId));
        builder.<String>withRequestField("module",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditRequest::getModule, ShowAuditRequest::setModule));
        builder.<String>withRequestField("repo",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditRequest::getRepo, ShowAuditRequest::setRepo));
        builder.<String>withRequestField("user_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditRequest::getUserId, ShowAuditRequest::setUserId));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditRequest::getInstanceId, ShowAuditRequest::setInstanceId));
        builder.<Integer>withRequestField("page_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAuditRequest::getPageNum, ShowAuditRequest::setPageNum));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAuditRequest::getPageSize, ShowAuditRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoDeleteJobSettingsRequest, ShowAutoDeleteJobSettingsResponse> showAutoDeleteJobSettings =
        genForShowAutoDeleteJobSettings();

    private static HttpRequestDef<ShowAutoDeleteJobSettingsRequest, ShowAutoDeleteJobSettingsResponse> genForShowAutoDeleteJobSettings() {
        // basic
        HttpRequestDef.Builder<ShowAutoDeleteJobSettingsRequest, ShowAutoDeleteJobSettingsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAutoDeleteJobSettingsRequest.class,
                    ShowAutoDeleteJobSettingsResponse.class)
                .withName("ShowAutoDeleteJobSettings")
                .withUri("/devreposerver/v5/release/{project_id}/auto-deletion/settings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoDeleteJobSettingsRequest::getProjectId,
                ShowAutoDeleteJobSettingsRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainReleaseRepoStorageRequest, ShowDomainReleaseRepoStorageResponse> showDomainReleaseRepoStorage =
        genForShowDomainReleaseRepoStorage();

    private static HttpRequestDef<ShowDomainReleaseRepoStorageRequest, ShowDomainReleaseRepoStorageResponse> genForShowDomainReleaseRepoStorage() {
        // basic
        HttpRequestDef.Builder<ShowDomainReleaseRepoStorageRequest, ShowDomainReleaseRepoStorageResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDomainReleaseRepoStorageRequest.class,
                    ShowDomainReleaseRepoStorageResponse.class)
                .withName("ShowDomainReleaseRepoStorage")
                .withUri("/devreposerver/v5/storage")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFileDetailRequest, ShowFileDetailResponse> showFileDetail =
        genForShowFileDetail();

    private static HttpRequestDef<ShowFileDetailRequest, ShowFileDetailResponse> genForShowFileDetail() {
        // basic
        HttpRequestDef.Builder<ShowFileDetailRequest, ShowFileDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFileDetailRequest.class, ShowFileDetailResponse.class)
                .withName("ShowFileDetail")
                .withUri("/devreposerver/v5/files/{id}/info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFileDetailRequest::getId, ShowFileDetailRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFileDetailByFullNameRequest, ShowFileDetailByFullNameResponse> showFileDetailByFullName =
        genForShowFileDetailByFullName();

    private static HttpRequestDef<ShowFileDetailByFullNameRequest, ShowFileDetailByFullNameResponse> genForShowFileDetailByFullName() {
        // basic
        HttpRequestDef.Builder<ShowFileDetailByFullNameRequest, ShowFileDetailByFullNameResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowFileDetailByFullNameRequest.class, ShowFileDetailByFullNameResponse.class)
                .withName("ShowFileDetailByFullName")
                .withUri("/devreposerver/v5/files/info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFileDetailByFullNameRequest::getFileName,
                ShowFileDetailByFullNameRequest::setFileName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFileTreeRequest, ShowFileTreeResponse> showFileTree = genForShowFileTree();

    private static HttpRequestDef<ShowFileTreeRequest, ShowFileTreeResponse> genForShowFileTree() {
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
            f -> f.withMarshaller(ShowFileTreeRequest::getTenantId, ShowFileTreeRequest::setTenantId));
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFileTreeRequest::getProjectId, ShowFileTreeRequest::setProjectId));
        builder.<String>withRequestField("repo_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFileTreeRequest::getRepoName, ShowFileTreeRequest::setRepoName));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFileTreeRequest::getPath, ShowFileTreeRequest::setPath));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFileTreeRequest::getInstanceId, ShowFileTreeRequest::setInstanceId));
        builder.<Boolean>withRequestField("is_recycle_bin",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowFileTreeRequest::getIsRecycleBin, ShowFileTreeRequest::setIsRecycleBin));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLatestVersionFilesCountRequest, ShowLatestVersionFilesCountResponse> showLatestVersionFilesCount =
        genForShowLatestVersionFilesCount();

    private static HttpRequestDef<ShowLatestVersionFilesCountRequest, ShowLatestVersionFilesCountResponse> genForShowLatestVersionFilesCount() {
        // basic
        HttpRequestDef.Builder<ShowLatestVersionFilesCountRequest, ShowLatestVersionFilesCountResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowLatestVersionFilesCountRequest.class,
                    ShowLatestVersionFilesCountResponse.class)
                .withName("ShowLatestVersionFilesCount")
                .withUri("/devreposerver/v5/{project_id}/files/version/count")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLatestVersionFilesCountRequest::getProjectId,
                ShowLatestVersionFilesCountRequest::setProjectId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLatestVersionFilesCountRequest::getName,
                ShowLatestVersionFilesCountRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMavenInfoRequest, ShowMavenInfoResponse> showMavenInfo =
        genForShowMavenInfo();

    private static HttpRequestDef<ShowMavenInfoRequest, ShowMavenInfoResponse> genForShowMavenInfo() {
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
            f -> f.withMarshaller(ShowMavenInfoRequest::getProjectId, ShowMavenInfoRequest::setProjectId));
        builder.<String>withRequestField("policy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMavenInfoRequest::getPolicy, ShowMavenInfoRequest::setPolicy));
        builder.<String>withRequestField("access",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMavenInfoRequest::getAccess, ShowMavenInfoRequest::setAccess));
        builder.<String>withRequestField("default",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMavenInfoRequest::getDefault, ShowMavenInfoRequest::setDefault));
        builder.<String>withRequestField("ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMavenInfoRequest::getIds, ShowMavenInfoRequest::setIds));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMultiRolesUserPermissionsRequest, ShowMultiRolesUserPermissionsResponse> showMultiRolesUserPermissions =
        genForShowMultiRolesUserPermissions();

    private static HttpRequestDef<ShowMultiRolesUserPermissionsRequest, ShowMultiRolesUserPermissionsResponse> genForShowMultiRolesUserPermissions() {
        // basic
        HttpRequestDef.Builder<ShowMultiRolesUserPermissionsRequest, ShowMultiRolesUserPermissionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowMultiRolesUserPermissionsRequest.class,
                    ShowMultiRolesUserPermissionsResponse.class)
                .withName("ShowMultiRolesUserPermissions")
                .withUri("/devreposerver/v5/user/permissions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMultiRolesUserPermissionsRequest::getProjectId,
                ShowMultiRolesUserPermissionsRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOpenSourceEnabledRequest, ShowOpenSourceEnabledResponse> showOpenSourceEnabled =
        genForShowOpenSourceEnabled();

    private static HttpRequestDef<ShowOpenSourceEnabledRequest, ShowOpenSourceEnabledResponse> genForShowOpenSourceEnabled() {
        // basic
        HttpRequestDef.Builder<ShowOpenSourceEnabledRequest, ShowOpenSourceEnabledResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowOpenSourceEnabledRequest.class, ShowOpenSourceEnabledResponse.class)
            .withName("ShowOpenSourceEnabled")
            .withUri("/cloudartifact/v5/opensource/enabled")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPackageDataDetailRequest, ShowPackageDataDetailResponse> showPackageDataDetail =
        genForShowPackageDataDetail();

    private static HttpRequestDef<ShowPackageDataDetailRequest, ShowPackageDataDetailResponse> genForShowPackageDataDetail() {
        // basic
        HttpRequestDef.Builder<ShowPackageDataDetailRequest, ShowPackageDataDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPackageDataDetailRequest.class, ShowPackageDataDetailResponse.class)
            .withName("ShowPackageDataDetail")
            .withUri("/devreposerver/v5/data/package")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPackageDataDetailRequest::getProjectId,
                ShowPackageDataDetailRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPackageInfoRequest, ShowPackageInfoResponse> showPackageInfo =
        genForShowPackageInfo();

    private static HttpRequestDef<ShowPackageInfoRequest, ShowPackageInfoResponse> genForShowPackageInfo() {
        // basic
        HttpRequestDef.Builder<ShowPackageInfoRequest, ShowPackageInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPackageInfoRequest.class, ShowPackageInfoResponse.class)
                .withName("ShowPackageInfo")
                .withUri("/devreposerver/v5/data/package/info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPackageInfoRequest::getProjectId, ShowPackageInfoRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectListRequest, ShowProjectListResponse> showProjectList =
        genForShowProjectList();

    private static HttpRequestDef<ShowProjectListRequest, ShowProjectListResponse> genForShowProjectList() {
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
            f -> f.withMarshaller(ShowProjectListRequest::getProjectId, ShowProjectListRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectReleaseFilesRequest, ShowProjectReleaseFilesResponse> showProjectReleaseFiles =
        genForShowProjectReleaseFiles();

    private static HttpRequestDef<ShowProjectReleaseFilesRequest, ShowProjectReleaseFilesResponse> genForShowProjectReleaseFiles() {
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
            f -> f.withMarshaller(ShowProjectReleaseFilesRequest::getProjectId,
                ShowProjectReleaseFilesRequest::setProjectId));
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectReleaseFilesRequest::getFileName,
                ShowProjectReleaseFilesRequest::setFileName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProjectReleaseFilesRequest::getLimit, ShowProjectReleaseFilesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProjectReleaseFilesRequest::getOffset,
                ShowProjectReleaseFilesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectStorageInfoRequest, ShowProjectStorageInfoResponse> showProjectStorageInfo =
        genForShowProjectStorageInfo();

    private static HttpRequestDef<ShowProjectStorageInfoRequest, ShowProjectStorageInfoResponse> genForShowProjectStorageInfo() {
        // basic
        HttpRequestDef.Builder<ShowProjectStorageInfoRequest, ShowProjectStorageInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowProjectStorageInfoRequest.class, ShowProjectStorageInfoResponse.class)
            .withName("ShowProjectStorageInfo")
            .withUri("/devreposerver/v5/{project_id}/storage")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectStorageInfoRequest::getProjectId,
                ShowProjectStorageInfoRequest::setProjectId));
        builder.<String>withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectStorageInfoRequest::getParentId,
                ShowProjectStorageInfoRequest::setParentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReleaseProjectFilesRequest, ShowReleaseProjectFilesResponse> showReleaseProjectFiles =
        genForShowReleaseProjectFiles();

    private static HttpRequestDef<ShowReleaseProjectFilesRequest, ShowReleaseProjectFilesResponse> genForShowReleaseProjectFiles() {
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
            f -> f.withMarshaller(ShowReleaseProjectFilesRequest::getProjectId,
                ShowReleaseProjectFilesRequest::setProjectId));
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReleaseProjectFilesRequest::getFileName,
                ShowReleaseProjectFilesRequest::setFileName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowReleaseProjectFilesRequest::getLimit, ShowReleaseProjectFilesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowReleaseProjectFilesRequest::getOffset,
                ShowReleaseProjectFilesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepoUserInfoRequest, ShowRepoUserInfoResponse> showRepoUserInfo =
        genForShowRepoUserInfo();

    private static HttpRequestDef<ShowRepoUserInfoRequest, ShowRepoUserInfoResponse> genForShowRepoUserInfo() {
        // basic
        HttpRequestDef.Builder<ShowRepoUserInfoRequest, ShowRepoUserInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRepoUserInfoRequest.class, ShowRepoUserInfoResponse.class)
                .withName("ShowRepoUserInfo")
                .withUri("/cloudartifact/v5/repositories/user/info")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryRequest, ShowRepositoryResponse> showRepository =
        genForShowRepository();

    private static HttpRequestDef<ShowRepositoryRequest, ShowRepositoryResponse> genForShowRepository() {
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
            f -> f.withMarshaller(ShowRepositoryRequest::getTenantId, ShowRepositoryRequest::setTenantId));
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryRequest::getProjectId, ShowRepositoryRequest::setProjectId));
        builder.<String>withRequestField("repo_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryRequest::getRepoId, ShowRepositoryRequest::setRepoId));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryRequest::getRegion, ShowRepositoryRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryInfoRequest, ShowRepositoryInfoResponse> showRepositoryInfo =
        genForShowRepositoryInfo();

    private static HttpRequestDef<ShowRepositoryInfoRequest, ShowRepositoryInfoResponse> genForShowRepositoryInfo() {
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
            f -> f.withMarshaller(ShowRepositoryInfoRequest::getRepoId, ShowRepositoryInfoRequest::setRepoId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStorageRequest, ShowStorageResponse> showStorage = genForShowStorage();

    private static HttpRequestDef<ShowStorageRequest, ShowStorageResponse> genForShowStorage() {
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
            f -> f.withMarshaller(ShowStorageRequest::getFormatList, ShowStorageRequest::setFormatList));
        builder.<String>withRequestField("in_project",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStorageRequest::getInProject, ShowStorageRequest::setInProject));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserPrivilegesRequest, ShowUserPrivilegesResponse> showUserPrivileges =
        genForShowUserPrivileges();

    private static HttpRequestDef<ShowUserPrivilegesRequest, ShowUserPrivilegesResponse> genForShowUserPrivileges() {
        // basic
        HttpRequestDef.Builder<ShowUserPrivilegesRequest, ShowUserPrivilegesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserPrivilegesRequest.class, ShowUserPrivilegesResponse.class)
                .withName("ShowUserPrivileges")
                .withUri("/cloudartifact/v3/user/{project_id}/privileges")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserPrivilegesRequest::getProjectId, ShowUserPrivilegesRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserTicketRequest, ShowUserTicketResponse> showUserTicket =
        genForShowUserTicket();

    private static HttpRequestDef<ShowUserTicketRequest, ShowUserTicketResponse> genForShowUserTicket() {
        // basic
        HttpRequestDef.Builder<ShowUserTicketRequest, ShowUserTicketResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserTicketRequest.class, ShowUserTicketResponse.class)
                .withName("ShowUserTicket")
                .withUri("/cloudartifact/v5/ticket")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateArtifactoryRequest, UpdateArtifactoryResponse> updateArtifactory =
        genForUpdateArtifactory();

    private static HttpRequestDef<UpdateArtifactoryRequest, UpdateArtifactoryResponse> genForUpdateArtifactory() {
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
            f -> f.withMarshaller(UpdateArtifactoryRequest::getBody, UpdateArtifactoryRequest::setBody));

        // response

        return builder.build();
    }

}
