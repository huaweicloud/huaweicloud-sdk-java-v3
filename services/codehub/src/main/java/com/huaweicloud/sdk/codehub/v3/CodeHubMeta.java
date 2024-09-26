package com.huaweicloud.sdk.codehub.v3;

import com.huaweicloud.sdk.codehub.v3.model.AddDeployKeyRequest;
import com.huaweicloud.sdk.codehub.v3.model.AddDeployKeyRequestBody;
import com.huaweicloud.sdk.codehub.v3.model.AddDeployKeyResponse;
import com.huaweicloud.sdk.codehub.v3.model.AddDeployKeyV2Request;
import com.huaweicloud.sdk.codehub.v3.model.AddDeployKeyV2Response;
import com.huaweicloud.sdk.codehub.v3.model.AddHooksRequest;
import com.huaweicloud.sdk.codehub.v3.model.AddHooksResponse;
import com.huaweicloud.sdk.codehub.v3.model.AddProtectBranchV2Request;
import com.huaweicloud.sdk.codehub.v3.model.AddProtectBranchV2Response;
import com.huaweicloud.sdk.codehub.v3.model.AddProtectRequest;
import com.huaweicloud.sdk.codehub.v3.model.AddRepoMembersRequest;
import com.huaweicloud.sdk.codehub.v3.model.AddRepoMembersResponse;
import com.huaweicloud.sdk.codehub.v3.model.AddSshKeyRequest;
import com.huaweicloud.sdk.codehub.v3.model.AddSshKeyRequestBody;
import com.huaweicloud.sdk.codehub.v3.model.AddSshKeyResponse;
import com.huaweicloud.sdk.codehub.v3.model.AddTagV2Request;
import com.huaweicloud.sdk.codehub.v3.model.AddTagV2Response;
import com.huaweicloud.sdk.codehub.v3.model.AddTagsRequest;
import com.huaweicloud.sdk.codehub.v3.model.ApprovalActionTypeDto;
import com.huaweicloud.sdk.codehub.v3.model.AssociateIssuesRequest;
import com.huaweicloud.sdk.codehub.v3.model.AssociateIssuesRequestBody;
import com.huaweicloud.sdk.codehub.v3.model.AssociateIssuesResponse;
import com.huaweicloud.sdk.codehub.v3.model.CreateCommitRequest;
import com.huaweicloud.sdk.codehub.v3.model.CreateCommitRequestBody;
import com.huaweicloud.sdk.codehub.v3.model.CreateCommitResponse;
import com.huaweicloud.sdk.codehub.v3.model.CreateMergeRequestDiscussionBodyDto;
import com.huaweicloud.sdk.codehub.v3.model.CreateMergeRequestDiscussionNoteDto;
import com.huaweicloud.sdk.codehub.v3.model.CreateMergeRequestDiscussionNoteRequest;
import com.huaweicloud.sdk.codehub.v3.model.CreateMergeRequestDiscussionNoteResponse;
import com.huaweicloud.sdk.codehub.v3.model.CreateMergeRequestDiscussionRequest;
import com.huaweicloud.sdk.codehub.v3.model.CreateMergeRequestDiscussionResponse;
import com.huaweicloud.sdk.codehub.v3.model.CreateNewBranchRequest;
import com.huaweicloud.sdk.codehub.v3.model.CreateNewBranchRequestBody;
import com.huaweicloud.sdk.codehub.v3.model.CreateNewBranchResponse;
import com.huaweicloud.sdk.codehub.v3.model.CreateProjectAndRepositoriesRequest;
import com.huaweicloud.sdk.codehub.v3.model.CreateProjectAndRepositoriesResponse;
import com.huaweicloud.sdk.codehub.v3.model.CreateProjectAndforkRepositoriesRequest;
import com.huaweicloud.sdk.codehub.v3.model.CreateProjectAndforkRepositoriesResponse;
import com.huaweicloud.sdk.codehub.v3.model.CreateProjectRepoRequest;
import com.huaweicloud.sdk.codehub.v3.model.CreateRepoMemberRequest;
import com.huaweicloud.sdk.codehub.v3.model.CreateRepoRequest;
import com.huaweicloud.sdk.codehub.v3.model.CreateRepositoryRequest;
import com.huaweicloud.sdk.codehub.v3.model.CreateRepositoryResponse;
import com.huaweicloud.sdk.codehub.v3.model.DeleteDeployKeyRequest;
import com.huaweicloud.sdk.codehub.v3.model.DeleteDeployKeyResponse;
import com.huaweicloud.sdk.codehub.v3.model.DeleteDeployKeyV2Request;
import com.huaweicloud.sdk.codehub.v3.model.DeleteDeployKeyV2Response;
import com.huaweicloud.sdk.codehub.v3.model.DeleteHooksRequest;
import com.huaweicloud.sdk.codehub.v3.model.DeleteHooksResponse;
import com.huaweicloud.sdk.codehub.v3.model.DeleteRepoMemberRequest;
import com.huaweicloud.sdk.codehub.v3.model.DeleteRepoMemberResponse;
import com.huaweicloud.sdk.codehub.v3.model.DeleteRepositoryRequest;
import com.huaweicloud.sdk.codehub.v3.model.DeleteRepositoryResponse;
import com.huaweicloud.sdk.codehub.v3.model.DeleteSShkeyRequest;
import com.huaweicloud.sdk.codehub.v3.model.DeleteSShkeyResponse;
import com.huaweicloud.sdk.codehub.v3.model.ForkProjectRepoRequest;
import com.huaweicloud.sdk.codehub.v3.model.GetAllRepositoryByProjectIdRequest;
import com.huaweicloud.sdk.codehub.v3.model.GetAllRepositoryByProjectIdResponse;
import com.huaweicloud.sdk.codehub.v3.model.GetProductTemplatesRequest;
import com.huaweicloud.sdk.codehub.v3.model.GetProductTemplatesResponse;
import com.huaweicloud.sdk.codehub.v3.model.GetRepositoryByProjectIdRequest;
import com.huaweicloud.sdk.codehub.v3.model.GetRepositoryByProjectIdResponse;
import com.huaweicloud.sdk.codehub.v3.model.GetTemplatesRequest;
import com.huaweicloud.sdk.codehub.v3.model.GetTemplatesResponse;
import com.huaweicloud.sdk.codehub.v3.model.ListBranchesByRepositoryIdRequest;
import com.huaweicloud.sdk.codehub.v3.model.ListBranchesByRepositoryIdResponse;
import com.huaweicloud.sdk.codehub.v3.model.ListCommitStatisticsRequest;
import com.huaweicloud.sdk.codehub.v3.model.ListCommitStatisticsResponse;
import com.huaweicloud.sdk.codehub.v3.model.ListCommitsRequest;
import com.huaweicloud.sdk.codehub.v3.model.ListCommitsResponse;
import com.huaweicloud.sdk.codehub.v3.model.ListFilesByQueryRequest;
import com.huaweicloud.sdk.codehub.v3.model.ListFilesByQueryResponse;
import com.huaweicloud.sdk.codehub.v3.model.ListFilesRequest;
import com.huaweicloud.sdk.codehub.v3.model.ListFilesResponse;
import com.huaweicloud.sdk.codehub.v3.model.ListHooksRequest;
import com.huaweicloud.sdk.codehub.v3.model.ListHooksResponse;
import com.huaweicloud.sdk.codehub.v3.model.ListMergeChangesRequest;
import com.huaweicloud.sdk.codehub.v3.model.ListMergeChangesResponse;
import com.huaweicloud.sdk.codehub.v3.model.ListMergeChangesTreesRequest;
import com.huaweicloud.sdk.codehub.v3.model.ListMergeChangesTreesResponse;
import com.huaweicloud.sdk.codehub.v3.model.ListMergeRequestRequest;
import com.huaweicloud.sdk.codehub.v3.model.ListMergeRequestResponse;
import com.huaweicloud.sdk.codehub.v3.model.ListMergeRequestReviewersRequest;
import com.huaweicloud.sdk.codehub.v3.model.ListMergeRequestReviewersResponse;
import com.huaweicloud.sdk.codehub.v3.model.ListProductTwoTemplatesRequest;
import com.huaweicloud.sdk.codehub.v3.model.ListProductTwoTemplatesResponse;
import com.huaweicloud.sdk.codehub.v3.model.ListRelatedCommitsRequest;
import com.huaweicloud.sdk.codehub.v3.model.ListRelatedCommitsResponse;
import com.huaweicloud.sdk.codehub.v3.model.ListRepoMembersRequest;
import com.huaweicloud.sdk.codehub.v3.model.ListRepoMembersResponse;
import com.huaweicloud.sdk.codehub.v3.model.ListRepositoryStatusRequest;
import com.huaweicloud.sdk.codehub.v3.model.ListRepositoryStatusResponse;
import com.huaweicloud.sdk.codehub.v3.model.ListSshKeysRequest;
import com.huaweicloud.sdk.codehub.v3.model.ListSshKeysResponse;
import com.huaweicloud.sdk.codehub.v3.model.ListSubfilesRequest;
import com.huaweicloud.sdk.codehub.v3.model.ListSubfilesResponse;
import com.huaweicloud.sdk.codehub.v3.model.ListTemplatesTwoRequest;
import com.huaweicloud.sdk.codehub.v3.model.ListTemplatesTwoResponse;
import com.huaweicloud.sdk.codehub.v3.model.ListTwoTemplatesRequest;
import com.huaweicloud.sdk.codehub.v3.model.ListTwoTemplatesResponse;
import com.huaweicloud.sdk.codehub.v3.model.ListUserAllRepositoriesRequest;
import com.huaweicloud.sdk.codehub.v3.model.ListUserAllRepositoriesResponse;
import com.huaweicloud.sdk.codehub.v3.model.PasswordRequest;
import com.huaweicloud.sdk.codehub.v3.model.PrivateKeyVerify;
import com.huaweicloud.sdk.codehub.v3.model.RepositoryHookRequest;
import com.huaweicloud.sdk.codehub.v3.model.RepositoryTemplateVO;
import com.huaweicloud.sdk.codehub.v3.model.RepositoryTemplateVO2;
import com.huaweicloud.sdk.codehub.v3.model.SetRepoRoleRequest;
import com.huaweicloud.sdk.codehub.v3.model.SetRepoRoleRequestBody;
import com.huaweicloud.sdk.codehub.v3.model.SetRepoRoleResponse;
import com.huaweicloud.sdk.codehub.v3.model.ShareTemplatesRequest;
import com.huaweicloud.sdk.codehub.v3.model.ShareTemplatesResponse;
import com.huaweicloud.sdk.codehub.v3.model.ShowAllRepositoryByTwoProjectIdRequest;
import com.huaweicloud.sdk.codehub.v3.model.ShowAllRepositoryByTwoProjectIdResponse;
import com.huaweicloud.sdk.codehub.v3.model.ShowBranchesByRepositoryIdRequest;
import com.huaweicloud.sdk.codehub.v3.model.ShowBranchesByRepositoryIdResponse;
import com.huaweicloud.sdk.codehub.v3.model.ShowBranchesByTwoRepositoryIdRequest;
import com.huaweicloud.sdk.codehub.v3.model.ShowBranchesByTwoRepositoryIdResponse;
import com.huaweicloud.sdk.codehub.v3.model.ShowCommitsByBranchRequest;
import com.huaweicloud.sdk.codehub.v3.model.ShowCommitsByBranchResponse;
import com.huaweicloud.sdk.codehub.v3.model.ShowCommitsByRepoIdRequest;
import com.huaweicloud.sdk.codehub.v3.model.ShowCommitsByRepoIdResponse;
import com.huaweicloud.sdk.codehub.v3.model.ShowDiffCommitRequest;
import com.huaweicloud.sdk.codehub.v3.model.ShowDiffCommitResponse;
import com.huaweicloud.sdk.codehub.v3.model.ShowFileRequest;
import com.huaweicloud.sdk.codehub.v3.model.ShowFileResponse;
import com.huaweicloud.sdk.codehub.v3.model.ShowHasPipelineRequest;
import com.huaweicloud.sdk.codehub.v3.model.ShowHasPipelineResponse;
import com.huaweicloud.sdk.codehub.v3.model.ShowImageBlobRequest;
import com.huaweicloud.sdk.codehub.v3.model.ShowImageBlobResponse;
import com.huaweicloud.sdk.codehub.v3.model.ShowMasterRequest;
import com.huaweicloud.sdk.codehub.v3.model.ShowMasterResponse;
import com.huaweicloud.sdk.codehub.v3.model.ShowMergeRequestRequest;
import com.huaweicloud.sdk.codehub.v3.model.ShowMergeRequestResponse;
import com.huaweicloud.sdk.codehub.v3.model.ShowPrivateKeyVerifyRequest;
import com.huaweicloud.sdk.codehub.v3.model.ShowPrivateKeyVerifyResponse;
import com.huaweicloud.sdk.codehub.v3.model.ShowRepoIdRequest;
import com.huaweicloud.sdk.codehub.v3.model.ShowRepoIdResponse;
import com.huaweicloud.sdk.codehub.v3.model.ShowRepositoryArchiveRequest;
import com.huaweicloud.sdk.codehub.v3.model.ShowRepositoryArchiveResponse;
import com.huaweicloud.sdk.codehub.v3.model.ShowRepositoryByUuidRequest;
import com.huaweicloud.sdk.codehub.v3.model.ShowRepositoryByUuidResponse;
import com.huaweicloud.sdk.codehub.v3.model.ShowRepositoryNameExistRequest;
import com.huaweicloud.sdk.codehub.v3.model.ShowRepositoryNameExistResponse;
import com.huaweicloud.sdk.codehub.v3.model.ShowRepositoryStatisticsRequest;
import com.huaweicloud.sdk.codehub.v3.model.ShowRepositoryStatisticsRequestBody;
import com.huaweicloud.sdk.codehub.v3.model.ShowRepositoryStatisticsResponse;
import com.huaweicloud.sdk.codehub.v3.model.ShowReviewSettingRequest;
import com.huaweicloud.sdk.codehub.v3.model.ShowReviewSettingResponse;
import com.huaweicloud.sdk.codehub.v3.model.ShowSingleCommitRequest;
import com.huaweicloud.sdk.codehub.v3.model.ShowSingleCommitResponse;
import com.huaweicloud.sdk.codehub.v3.model.ShowStatisticCommitRequest;
import com.huaweicloud.sdk.codehub.v3.model.ShowStatisticCommitResponse;
import com.huaweicloud.sdk.codehub.v3.model.ShowStatisticCommitV3Request;
import com.huaweicloud.sdk.codehub.v3.model.ShowStatisticCommitV3Response;
import com.huaweicloud.sdk.codehub.v3.model.ShowStatisticalDataRequest;
import com.huaweicloud.sdk.codehub.v3.model.ShowStatisticalDataResponse;
import com.huaweicloud.sdk.codehub.v3.model.UpdateMergeRequestApprovalStateRequest;
import com.huaweicloud.sdk.codehub.v3.model.UpdateMergeRequestApprovalStateResponse;
import com.huaweicloud.sdk.codehub.v3.model.ValidateHttpsInfoRequest;
import com.huaweicloud.sdk.codehub.v3.model.ValidateHttpsInfoResponse;
import com.huaweicloud.sdk.codehub.v3.model.ValidateHttpsInfoV2Request;
import com.huaweicloud.sdk.codehub.v3.model.ValidateHttpsInfoV2Response;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CodeHubMeta {

    public static final HttpRequestDef<CreateCommitRequest, CreateCommitResponse> createCommit = genForCreateCommit();

    private static HttpRequestDef<CreateCommitRequest, CreateCommitResponse> genForCreateCommit() {
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
            f -> f.withMarshaller(CreateCommitRequest::getRepoId, CreateCommitRequest::setRepoId));
        builder.<CreateCommitRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCommitRequestBody.class),
            f -> f.withMarshaller(CreateCommitRequest::getBody, CreateCommitRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCommitsRequest, ListCommitsResponse> listCommits = genForListCommits();

    private static HttpRequestDef<ListCommitsRequest, ListCommitsResponse> genForListCommits() {
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
            f -> f.withMarshaller(ListCommitsRequest::getRepoId, ListCommitsRequest::setRepoId));
        builder.<String>withRequestField("ref_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitsRequest::getRefName, ListCommitsRequest::setRefName));
        builder.<String>withRequestField("since",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitsRequest::getSince, ListCommitsRequest::setSince));
        builder.<String>withRequestField("until",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitsRequest::getUntil, ListCommitsRequest::setUntil));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitsRequest::getPath, ListCommitsRequest::setPath));
        builder.<Boolean>withRequestField("all",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCommitsRequest::getAll, ListCommitsRequest::setAll));
        builder.<Boolean>withRequestField("with_stats",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCommitsRequest::getWithStats, ListCommitsRequest::setWithStats));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCommitsRequest::getPage, ListCommitsRequest::setPage));
        builder.<Integer>withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCommitsRequest::getPerPage, ListCommitsRequest::setPerPage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDiffCommitRequest, ShowDiffCommitResponse> showDiffCommit =
        genForShowDiffCommit();

    private static HttpRequestDef<ShowDiffCommitRequest, ShowDiffCommitResponse> genForShowDiffCommit() {
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
            f -> f.withMarshaller(ShowDiffCommitRequest::getRepoId, ShowDiffCommitRequest::setRepoId));
        builder.<String>withRequestField("sha",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDiffCommitRequest::getSha, ShowDiffCommitRequest::setSha));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSingleCommitRequest, ShowSingleCommitResponse> showSingleCommit =
        genForShowSingleCommit();

    private static HttpRequestDef<ShowSingleCommitRequest, ShowSingleCommitResponse> genForShowSingleCommit() {
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
            f -> f.withMarshaller(ShowSingleCommitRequest::getRepoId, ShowSingleCommitRequest::setRepoId));
        builder.<String>withRequestField("sha",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSingleCommitRequest::getSha, ShowSingleCommitRequest::setSha));
        builder.<Boolean>withRequestField("stats",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowSingleCommitRequest::getStats, ShowSingleCommitRequest::setStats));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMergeRequestDiscussionRequest, CreateMergeRequestDiscussionResponse> createMergeRequestDiscussion =
        genForCreateMergeRequestDiscussion();

    private static HttpRequestDef<CreateMergeRequestDiscussionRequest, CreateMergeRequestDiscussionResponse> genForCreateMergeRequestDiscussion() {
        // basic
        HttpRequestDef.Builder<CreateMergeRequestDiscussionRequest, CreateMergeRequestDiscussionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateMergeRequestDiscussionRequest.class,
                    CreateMergeRequestDiscussionResponse.class)
                .withName("CreateMergeRequestDiscussion")
                .withUri("/v2/repositories/{repository_id}/merge_requests/{merge_request_iid}/discussions")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateMergeRequestDiscussionRequest::getRepositoryId,
                CreateMergeRequestDiscussionRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateMergeRequestDiscussionRequest::getMergeRequestIid,
                CreateMergeRequestDiscussionRequest::setMergeRequestIid));
        builder.<CreateMergeRequestDiscussionBodyDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMergeRequestDiscussionBodyDto.class),
            f -> f.withMarshaller(CreateMergeRequestDiscussionRequest::getBody,
                CreateMergeRequestDiscussionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMergeRequestDiscussionNoteRequest, CreateMergeRequestDiscussionNoteResponse> createMergeRequestDiscussionNote =
        genForCreateMergeRequestDiscussionNote();

    private static HttpRequestDef<CreateMergeRequestDiscussionNoteRequest, CreateMergeRequestDiscussionNoteResponse> genForCreateMergeRequestDiscussionNote() {
        // basic
        HttpRequestDef.Builder<CreateMergeRequestDiscussionNoteRequest, CreateMergeRequestDiscussionNoteResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateMergeRequestDiscussionNoteRequest.class,
                    CreateMergeRequestDiscussionNoteResponse.class)
                .withName("CreateMergeRequestDiscussionNote")
                .withUri(
                    "/v2/repositories/{repository_id}/merge_requests/{merge_request_iid}/discussions/{discussion_id}/notes")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateMergeRequestDiscussionNoteRequest::getRepositoryId,
                CreateMergeRequestDiscussionNoteRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateMergeRequestDiscussionNoteRequest::getMergeRequestIid,
                CreateMergeRequestDiscussionNoteRequest::setMergeRequestIid));
        builder.<String>withRequestField("discussion_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMergeRequestDiscussionNoteRequest::getDiscussionId,
                CreateMergeRequestDiscussionNoteRequest::setDiscussionId));
        builder.<CreateMergeRequestDiscussionNoteDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMergeRequestDiscussionNoteDto.class),
            f -> f.withMarshaller(CreateMergeRequestDiscussionNoteRequest::getBody,
                CreateMergeRequestDiscussionNoteRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReviewSettingRequest, ShowReviewSettingResponse> showReviewSetting =
        genForShowReviewSetting();

    private static HttpRequestDef<ShowReviewSettingRequest, ShowReviewSettingResponse> genForShowReviewSetting() {
        // basic
        HttpRequestDef.Builder<ShowReviewSettingRequest, ShowReviewSettingResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowReviewSettingRequest.class, ShowReviewSettingResponse.class)
                .withName("ShowReviewSetting")
                .withUri("/v2/repositories/{repository_id}/review_setting")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowReviewSettingRequest::getRepositoryId,
                ShowReviewSettingRequest::setRepositoryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFilesByQueryRequest, ListFilesByQueryResponse> listFilesByQuery =
        genForListFilesByQuery();

    private static HttpRequestDef<ListFilesByQueryRequest, ListFilesByQueryResponse> genForListFilesByQuery() {
        // basic
        HttpRequestDef.Builder<ListFilesByQueryRequest, ListFilesByQueryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFilesByQueryRequest.class, ListFilesByQueryResponse.class)
                .withName("ListFilesByQuery")
                .withUri("/v2/projects/{repo_id}/repository/files")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repo_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFilesByQueryRequest::getRepoId, ListFilesByQueryRequest::setRepoId));
        builder.<String>withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFilesByQueryRequest::getFilePath, ListFilesByQueryRequest::setFilePath));
        builder.<String>withRequestField("ref",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFilesByQueryRequest::getRef, ListFilesByQueryRequest::setRef));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFileRequest, ShowFileResponse> showFile = genForShowFile();

    private static HttpRequestDef<ShowFileRequest, ShowFileResponse> genForShowFile() {
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
            f -> f.withMarshaller(ShowFileRequest::getRepoId, ShowFileRequest::setRepoId));
        builder.<String>withRequestField("file_path",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFileRequest::getFilePath, ShowFileRequest::setFilePath));
        builder.<String>withRequestField("ref",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFileRequest::getRef, ShowFileRequest::setRef));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetAllRepositoryByProjectIdRequest, GetAllRepositoryByProjectIdResponse> getAllRepositoryByProjectId =
        genForGetAllRepositoryByProjectId();

    private static HttpRequestDef<GetAllRepositoryByProjectIdRequest, GetAllRepositoryByProjectIdResponse> genForGetAllRepositoryByProjectId() {
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
            f -> f.withMarshaller(GetAllRepositoryByProjectIdRequest::getProjectUuid,
                GetAllRepositoryByProjectIdRequest::setProjectUuid));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(GetAllRepositoryByProjectIdRequest::getPageIndex,
                GetAllRepositoryByProjectIdRequest::setPageIndex));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(GetAllRepositoryByProjectIdRequest::getPageSize,
                GetAllRepositoryByProjectIdRequest::setPageSize));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetAllRepositoryByProjectIdRequest::getSearch,
                GetAllRepositoryByProjectIdRequest::setSearch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetProductTemplatesRequest, GetProductTemplatesResponse> getProductTemplates =
        genForGetProductTemplates();

    private static HttpRequestDef<GetProductTemplatesRequest, GetProductTemplatesResponse> genForGetProductTemplates() {
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
            f -> f.withMarshaller(GetProductTemplatesRequest::getProjectUuid,
                GetProductTemplatesRequest::setProjectUuid));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(GetProductTemplatesRequest::getPageNo, GetProductTemplatesRequest::setPageNo));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(GetProductTemplatesRequest::getPageSize, GetProductTemplatesRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProductTwoTemplatesRequest, ListProductTwoTemplatesResponse> listProductTwoTemplates =
        genForListProductTwoTemplates();

    private static HttpRequestDef<ListProductTwoTemplatesRequest, ListProductTwoTemplatesResponse> genForListProductTwoTemplates() {
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
            f -> f.withMarshaller(ListProductTwoTemplatesRequest::getProjectUuid,
                ListProductTwoTemplatesRequest::setProjectUuid));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductTwoTemplatesRequest::getPageNo,
                ListProductTwoTemplatesRequest::setPageNo));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductTwoTemplatesRequest::getPageSize,
                ListProductTwoTemplatesRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryNameExistRequest, ShowRepositoryNameExistResponse> showRepositoryNameExist =
        genForShowRepositoryNameExist();

    private static HttpRequestDef<ShowRepositoryNameExistRequest, ShowRepositoryNameExistResponse> genForShowRepositoryNameExist() {
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
            f -> f.withMarshaller(ShowRepositoryNameExistRequest::getProjectUuid,
                ShowRepositoryNameExistRequest::setProjectUuid));
        builder.<String>withRequestField("repository_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryNameExistRequest::getRepositoryName,
                ShowRepositoryNameExistRequest::setRepositoryName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddRepoMembersRequest, AddRepoMembersResponse> addRepoMembers =
        genForAddRepoMembers();

    private static HttpRequestDef<AddRepoMembersRequest, AddRepoMembersResponse> genForAddRepoMembers() {
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
            f -> f.withMarshaller(AddRepoMembersRequest::getRepositoryUuid, AddRepoMembersRequest::setRepositoryUuid));
        builder.<CreateRepoMemberRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRepoMemberRequest.class),
            f -> f.withMarshaller(AddRepoMembersRequest::getBody, AddRepoMembersRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRepoMemberRequest, DeleteRepoMemberResponse> deleteRepoMember =
        genForDeleteRepoMember();

    private static HttpRequestDef<DeleteRepoMemberRequest, DeleteRepoMemberResponse> genForDeleteRepoMember() {
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
            f -> f.withMarshaller(DeleteRepoMemberRequest::getMemberId, DeleteRepoMemberRequest::setMemberId));
        builder.<String>withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRepoMemberRequest::getRepositoryUuid,
                DeleteRepoMemberRequest::setRepositoryUuid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRepoMembersRequest, ListRepoMembersResponse> listRepoMembers =
        genForListRepoMembers();

    private static HttpRequestDef<ListRepoMembersRequest, ListRepoMembersResponse> genForListRepoMembers() {
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
            f -> f.withMarshaller(ListRepoMembersRequest::getRepositoryUuid,
                ListRepoMembersRequest::setRepositoryUuid));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepoMembersRequest::getPageIndex, ListRepoMembersRequest::setPageIndex));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRepoMembersRequest::getPageSize, ListRepoMembersRequest::setPageSize));
        builder.<String>withRequestField("subject",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepoMembersRequest::getSubject, ListRepoMembersRequest::setSubject));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetRepoRoleRequest, SetRepoRoleResponse> setRepoRole = genForSetRepoRole();

    private static HttpRequestDef<SetRepoRoleRequest, SetRepoRoleResponse> genForSetRepoRole() {
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
            f -> f.withMarshaller(SetRepoRoleRequest::getMemberId, SetRepoRoleRequest::setMemberId));
        builder.<String>withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetRepoRoleRequest::getRepositoryUuid, SetRepoRoleRequest::setRepositoryUuid));
        builder.<SetRepoRoleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetRepoRoleRequestBody.class),
            f -> f.withMarshaller(SetRepoRoleRequest::getBody, SetRepoRoleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddDeployKeyRequest, AddDeployKeyResponse> addDeployKey = genForAddDeployKey();

    private static HttpRequestDef<AddDeployKeyRequest, AddDeployKeyResponse> genForAddDeployKey() {
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
            f -> f.withMarshaller(AddDeployKeyRequest::getRepositoryId, AddDeployKeyRequest::setRepositoryId));
        builder.<AddDeployKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddDeployKeyRequestBody.class),
            f -> f.withMarshaller(AddDeployKeyRequest::getBody, AddDeployKeyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddDeployKeyV2Request, AddDeployKeyV2Response> addDeployKeyV2 =
        genForAddDeployKeyV2();

    private static HttpRequestDef<AddDeployKeyV2Request, AddDeployKeyV2Response> genForAddDeployKeyV2() {
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
            f -> f.withMarshaller(AddDeployKeyV2Request::getRepositoryId, AddDeployKeyV2Request::setRepositoryId));
        builder.<AddDeployKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddDeployKeyRequestBody.class),
            f -> f.withMarshaller(AddDeployKeyV2Request::getBody, AddDeployKeyV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddProtectBranchV2Request, AddProtectBranchV2Response> addProtectBranchV2 =
        genForAddProtectBranchV2();

    private static HttpRequestDef<AddProtectBranchV2Request, AddProtectBranchV2Response> genForAddProtectBranchV2() {
        // basic
        HttpRequestDef.Builder<AddProtectBranchV2Request, AddProtectBranchV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, AddProtectBranchV2Request.class, AddProtectBranchV2Response.class)
                .withName("AddProtectBranchV2")
                .withUri("/v2/repositories/{repository_id}/branch/{branch_name}/protect")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(AddProtectBranchV2Request::getRepositoryId,
                AddProtectBranchV2Request::setRepositoryId));
        builder.<String>withRequestField("branch_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddProtectBranchV2Request::getBranchName, AddProtectBranchV2Request::setBranchName));
        builder.<AddProtectRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddProtectRequest.class),
            f -> f.withMarshaller(AddProtectBranchV2Request::getBody, AddProtectBranchV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddTagV2Request, AddTagV2Response> addTagV2 = genForAddTagV2();

    private static HttpRequestDef<AddTagV2Request, AddTagV2Response> genForAddTagV2() {
        // basic
        HttpRequestDef.Builder<AddTagV2Request, AddTagV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddTagV2Request.class, AddTagV2Response.class)
                .withName("AddTagV2")
                .withUri("/v2/repositories/{repository_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(AddTagV2Request::getRepositoryId, AddTagV2Request::setRepositoryId));
        builder.<AddTagsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddTagsRequest.class),
            f -> f.withMarshaller(AddTagV2Request::getBody, AddTagV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRepositoryRequest, CreateRepositoryResponse> createRepository =
        genForCreateRepository();

    private static HttpRequestDef<CreateRepositoryRequest, CreateRepositoryResponse> genForCreateRepository() {
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
            f -> f.withMarshaller(CreateRepositoryRequest::getBody, CreateRepositoryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeployKeyRequest, DeleteDeployKeyResponse> deleteDeployKey =
        genForDeleteDeployKey();

    private static HttpRequestDef<DeleteDeployKeyRequest, DeleteDeployKeyResponse> genForDeleteDeployKey() {
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
            f -> f.withMarshaller(DeleteDeployKeyRequest::getKeyId, DeleteDeployKeyRequest::setKeyId));
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteDeployKeyRequest::getRepositoryId, DeleteDeployKeyRequest::setRepositoryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeployKeyV2Request, DeleteDeployKeyV2Response> deleteDeployKeyV2 =
        genForDeleteDeployKeyV2();

    private static HttpRequestDef<DeleteDeployKeyV2Request, DeleteDeployKeyV2Response> genForDeleteDeployKeyV2() {
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
            f -> f.withMarshaller(DeleteDeployKeyV2Request::getKeyId, DeleteDeployKeyV2Request::setKeyId));
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteDeployKeyV2Request::getRepositoryId,
                DeleteDeployKeyV2Request::setRepositoryId));

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
                .withUri("/v1/repositories/{repository_uuid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRepositoryRequest::getRepositoryUuid,
                DeleteRepositoryRequest::setRepositoryUuid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetRepositoryByProjectIdRequest, GetRepositoryByProjectIdResponse> getRepositoryByProjectId =
        genForGetRepositoryByProjectId();

    private static HttpRequestDef<GetRepositoryByProjectIdRequest, GetRepositoryByProjectIdResponse> genForGetRepositoryByProjectId() {
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
            f -> f.withMarshaller(GetRepositoryByProjectIdRequest::getRepositoryUuid,
                GetRepositoryByProjectIdRequest::setRepositoryUuid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetTemplatesRequest, GetTemplatesResponse> getTemplates = genForGetTemplates();

    private static HttpRequestDef<GetTemplatesRequest, GetTemplatesResponse> genForGetTemplates() {
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
            f -> f.withMarshaller(GetTemplatesRequest::getPlatform, GetTemplatesRequest::setPlatform));
        builder.<String>withRequestField("language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetTemplatesRequest::getLanguage, GetTemplatesRequest::setLanguage));
        builder.<String>withRequestField("pipeline",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetTemplatesRequest::getPipeline, GetTemplatesRequest::setPipeline));
        builder.<String>withRequestField("entertype",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetTemplatesRequest::getEntertype, GetTemplatesRequest::setEntertype));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetTemplatesRequest::getSearch, GetTemplatesRequest::setSearch));
        builder.<String>withRequestField("dateorder",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetTemplatesRequest::getDateorder, GetTemplatesRequest::setDateorder));
        builder.<String>withRequestField("usedtimeorder",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetTemplatesRequest::getUsedtimeorder, GetTemplatesRequest::setUsedtimeorder));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetTemplatesRequest::getType, GetTemplatesRequest::setType));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetTemplatesRequest::getRegion, GetTemplatesRequest::setRegion));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(GetTemplatesRequest::getPageNo, GetTemplatesRequest::setPageNo));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(GetTemplatesRequest::getPageSize, GetTemplatesRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBranchesByRepositoryIdRequest, ListBranchesByRepositoryIdResponse> listBranchesByRepositoryId =
        genForListBranchesByRepositoryId();

    private static HttpRequestDef<ListBranchesByRepositoryIdRequest, ListBranchesByRepositoryIdResponse> genForListBranchesByRepositoryId() {
        // basic
        HttpRequestDef.Builder<ListBranchesByRepositoryIdRequest, ListBranchesByRepositoryIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListBranchesByRepositoryIdRequest.class,
                    ListBranchesByRepositoryIdResponse.class)
                .withName("ListBranchesByRepositoryId")
                .withUri("/v2/repositories/{repository_id}/branches")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBranchesByRepositoryIdRequest::getRepositoryId,
                ListBranchesByRepositoryIdRequest::setRepositoryId));
        builder.<String>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBranchesByRepositoryIdRequest::getPage,
                ListBranchesByRepositoryIdRequest::setPage));
        builder.<String>withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBranchesByRepositoryIdRequest::getPerPage,
                ListBranchesByRepositoryIdRequest::setPerPage));
        builder.<String>withRequestField("match",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBranchesByRepositoryIdRequest::getMatch,
                ListBranchesByRepositoryIdRequest::setMatch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCommitStatisticsRequest, ListCommitStatisticsResponse> listCommitStatistics =
        genForListCommitStatistics();

    private static HttpRequestDef<ListCommitStatisticsRequest, ListCommitStatisticsResponse> genForListCommitStatistics() {
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
            f -> f.withMarshaller(ListCommitStatisticsRequest::getRepositoryId,
                ListCommitStatisticsRequest::setRepositoryId));
        builder.<String>withRequestField("branch_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitStatisticsRequest::getBranchName,
                ListCommitStatisticsRequest::setBranchName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFilesRequest, ListFilesResponse> listFiles = genForListFiles();

    private static HttpRequestDef<ListFilesRequest, ListFilesResponse> genForListFiles() {
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
            f -> f.withMarshaller(ListFilesRequest::getRepositoryUuid, ListFilesRequest::setRepositoryUuid));
        builder.<String>withRequestField("branch_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFilesRequest::getBranchName, ListFilesRequest::setBranchName));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFilesRequest::getPath, ListFilesRequest::setPath));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMergeChangesRequest, ListMergeChangesResponse> listMergeChanges =
        genForListMergeChanges();

    private static HttpRequestDef<ListMergeChangesRequest, ListMergeChangesResponse> genForListMergeChanges() {
        // basic
        HttpRequestDef.Builder<ListMergeChangesRequest, ListMergeChangesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMergeChangesRequest.class, ListMergeChangesResponse.class)
                .withName("ListMergeChanges")
                .withUri("/v2/repositories/{repository_id}/merge-requests/{merge_request_iid}/changes")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeChangesRequest::getRepositoryId, ListMergeChangesRequest::setRepositoryId));
        builder.<String>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeChangesRequest::getMergeRequestIid,
                ListMergeChangesRequest::setMergeRequestIid));
        builder.<String>withRequestField("file_path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeChangesRequest::getFilePath, ListMergeChangesRequest::setFilePath));
        builder.<Boolean>withRequestField("ignore_whitespace_change",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListMergeChangesRequest::getIgnoreWhitespaceChange,
                ListMergeChangesRequest::setIgnoreWhitespaceChange));
        builder.<Boolean>withRequestField("force_encode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListMergeChangesRequest::getForceEncode, ListMergeChangesRequest::setForceEncode));
        builder.<ListMergeChangesRequest.ViewEnum>withRequestField("view",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListMergeChangesRequest.ViewEnum.class),
            f -> f.withMarshaller(ListMergeChangesRequest::getView, ListMergeChangesRequest::setView));
        builder.<String>withRequestField("commit_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeChangesRequest::getCommitId, ListMergeChangesRequest::setCommitId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMergeChangesTreesRequest, ListMergeChangesTreesResponse> listMergeChangesTrees =
        genForListMergeChangesTrees();

    private static HttpRequestDef<ListMergeChangesTreesRequest, ListMergeChangesTreesResponse> genForListMergeChangesTrees() {
        // basic
        HttpRequestDef.Builder<ListMergeChangesTreesRequest, ListMergeChangesTreesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListMergeChangesTreesRequest.class, ListMergeChangesTreesResponse.class)
            .withName("ListMergeChangesTrees")
            .withUri("/v2/repositories/{repository_id}/merge-requests/{merge_request_iid}/changes-trees")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeChangesTreesRequest::getRepositoryId,
                ListMergeChangesTreesRequest::setRepositoryId));
        builder.<String>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeChangesTreesRequest::getMergeRequestIid,
                ListMergeChangesTreesRequest::setMergeRequestIid));
        builder.<ListMergeChangesTreesRequest.ViewEnum>withRequestField("view",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListMergeChangesTreesRequest.ViewEnum.class),
            f -> f.withMarshaller(ListMergeChangesTreesRequest::getView, ListMergeChangesTreesRequest::setView));
        builder.<String>withRequestField("commit_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeChangesTreesRequest::getCommitId,
                ListMergeChangesTreesRequest::setCommitId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMergeRequestRequest, ListMergeRequestResponse> listMergeRequest =
        genForListMergeRequest();

    private static HttpRequestDef<ListMergeRequestRequest, ListMergeRequestResponse> genForListMergeRequest() {
        // basic
        HttpRequestDef.Builder<ListMergeRequestRequest, ListMergeRequestResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMergeRequestRequest.class, ListMergeRequestResponse.class)
                .withName("ListMergeRequest")
                .withUri("/v2/repositories/{repository_id}/merge_request")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestRequest::getRepositoryId, ListMergeRequestRequest::setRepositoryId));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeRequestRequest::getState, ListMergeRequestRequest::setState));
        builder.<String>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeRequestRequest::getPage, ListMergeRequestRequest::setPage));
        builder.<String>withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeRequestRequest::getPerPage, ListMergeRequestRequest::setPerPage));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeRequestRequest::getSearch, ListMergeRequestRequest::setSearch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMergeRequestReviewersRequest, ListMergeRequestReviewersResponse> listMergeRequestReviewers =
        genForListMergeRequestReviewers();

    private static HttpRequestDef<ListMergeRequestReviewersRequest, ListMergeRequestReviewersResponse> genForListMergeRequestReviewers() {
        // basic
        HttpRequestDef.Builder<ListMergeRequestReviewersRequest, ListMergeRequestReviewersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListMergeRequestReviewersRequest.class,
                    ListMergeRequestReviewersResponse.class)
                .withName("ListMergeRequestReviewers")
                .withUri("/v2/repositories/{repository_id}/merge-requests/{merge_request_iid}/approval-reviewers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMergeRequestReviewersRequest::getRepositoryId,
                ListMergeRequestReviewersRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestReviewersRequest::getMergeRequestIid,
                ListMergeRequestReviewersRequest::setMergeRequestIid));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestReviewersRequest::getPage,
                ListMergeRequestReviewersRequest::setPage));
        builder.<Integer>withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMergeRequestReviewersRequest::getPerPage,
                ListMergeRequestReviewersRequest::setPerPage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRelatedCommitsRequest, ListRelatedCommitsResponse> listRelatedCommits =
        genForListRelatedCommits();

    private static HttpRequestDef<ListRelatedCommitsRequest, ListRelatedCommitsResponse> genForListRelatedCommits() {
        // basic
        HttpRequestDef.Builder<ListRelatedCommitsRequest, ListRelatedCommitsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRelatedCommitsRequest.class, ListRelatedCommitsResponse.class)
                .withName("ListRelatedCommits")
                .withUri("/v2/repositories/{repository_uuid}/related-commits")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repository_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelatedCommitsRequest::getRepositoryUuid,
                ListRelatedCommitsRequest::setRepositoryUuid));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelatedCommitsRequest::getType, ListRelatedCommitsRequest::setType));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRelatedCommitsRequest::getSearch, ListRelatedCommitsRequest::setSearch));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelatedCommitsRequest::getPage, ListRelatedCommitsRequest::setPage));
        builder.<Integer>withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRelatedCommitsRequest::getPerPage, ListRelatedCommitsRequest::setPerPage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRepositoryStatusRequest, ListRepositoryStatusResponse> listRepositoryStatus =
        genForListRepositoryStatus();

    private static HttpRequestDef<ListRepositoryStatusRequest, ListRepositoryStatusResponse> genForListRepositoryStatus() {
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
            f -> f.withMarshaller(ListRepositoryStatusRequest::getRepositoryUuid,
                ListRepositoryStatusRequest::setRepositoryUuid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubfilesRequest, ListSubfilesResponse> listSubfiles = genForListSubfiles();

    private static HttpRequestDef<ListSubfilesRequest, ListSubfilesResponse> genForListSubfiles() {
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
            f -> f.withMarshaller(ListSubfilesRequest::getRepositoryUuid, ListSubfilesRequest::setRepositoryUuid));
        builder.<String>withRequestField("branch_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubfilesRequest::getBranchName, ListSubfilesRequest::setBranchName));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubfilesRequest::getPath, ListSubfilesRequest::setPath));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubfilesRequest::getOffset, ListSubfilesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubfilesRequest::getLimit, ListSubfilesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplatesTwoRequest, ListTemplatesTwoResponse> listTemplatesTwo =
        genForListTemplatesTwo();

    private static HttpRequestDef<ListTemplatesTwoRequest, ListTemplatesTwoResponse> genForListTemplatesTwo() {
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
            f -> f.withMarshaller(ListTemplatesTwoRequest::getRepositoryUuid,
                ListTemplatesTwoRequest::setRepositoryUuid));
        builder.<RepositoryTemplateVO2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RepositoryTemplateVO2.class),
            f -> f.withMarshaller(ListTemplatesTwoRequest::getBody, ListTemplatesTwoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTwoTemplatesRequest, ListTwoTemplatesResponse> listTwoTemplates =
        genForListTwoTemplates();

    private static HttpRequestDef<ListTwoTemplatesRequest, ListTwoTemplatesResponse> genForListTwoTemplates() {
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
            f -> f.withMarshaller(ListTwoTemplatesRequest::getPlatform, ListTwoTemplatesRequest::setPlatform));
        builder.<String>withRequestField("language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTwoTemplatesRequest::getLanguage, ListTwoTemplatesRequest::setLanguage));
        builder.<String>withRequestField("pipeline",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTwoTemplatesRequest::getPipeline, ListTwoTemplatesRequest::setPipeline));
        builder.<String>withRequestField("enter_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTwoTemplatesRequest::getEnterType, ListTwoTemplatesRequest::setEnterType));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTwoTemplatesRequest::getSearch, ListTwoTemplatesRequest::setSearch));
        builder.<String>withRequestField("date_order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTwoTemplatesRequest::getDateOrder, ListTwoTemplatesRequest::setDateOrder));
        builder.<String>withRequestField("used_time_order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTwoTemplatesRequest::getUsedTimeOrder,
                ListTwoTemplatesRequest::setUsedTimeOrder));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTwoTemplatesRequest::getType, ListTwoTemplatesRequest::setType));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTwoTemplatesRequest::getRegion, ListTwoTemplatesRequest::setRegion));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTwoTemplatesRequest::getPageNo, ListTwoTemplatesRequest::setPageNo));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTwoTemplatesRequest::getPageSize, ListTwoTemplatesRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShareTemplatesRequest, ShareTemplatesResponse> shareTemplates =
        genForShareTemplates();

    private static HttpRequestDef<ShareTemplatesRequest, ShareTemplatesResponse> genForShareTemplates() {
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
            f -> f.withMarshaller(ShareTemplatesRequest::getRepositoryUuid, ShareTemplatesRequest::setRepositoryUuid));
        builder.<RepositoryTemplateVO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RepositoryTemplateVO.class),
            f -> f.withMarshaller(ShareTemplatesRequest::getBody, ShareTemplatesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBranchesByRepositoryIdRequest, ShowBranchesByRepositoryIdResponse> showBranchesByRepositoryId =
        genForShowBranchesByRepositoryId();

    private static HttpRequestDef<ShowBranchesByRepositoryIdRequest, ShowBranchesByRepositoryIdResponse> genForShowBranchesByRepositoryId() {
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
            f -> f.withMarshaller(ShowBranchesByRepositoryIdRequest::getRepositoryId,
                ShowBranchesByRepositoryIdRequest::setRepositoryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBranchesByTwoRepositoryIdRequest, ShowBranchesByTwoRepositoryIdResponse> showBranchesByTwoRepositoryId =
        genForShowBranchesByTwoRepositoryId();

    private static HttpRequestDef<ShowBranchesByTwoRepositoryIdRequest, ShowBranchesByTwoRepositoryIdResponse> genForShowBranchesByTwoRepositoryId() {
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
            f -> f.withMarshaller(ShowBranchesByTwoRepositoryIdRequest::getRepositoryId,
                ShowBranchesByTwoRepositoryIdRequest::setRepositoryId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCommitsByBranchRequest, ShowCommitsByBranchResponse> showCommitsByBranch =
        genForShowCommitsByBranch();

    private static HttpRequestDef<ShowCommitsByBranchRequest, ShowCommitsByBranchResponse> genForShowCommitsByBranch() {
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
            f -> f.withMarshaller(ShowCommitsByBranchRequest::getGroupName, ShowCommitsByBranchRequest::setGroupName));
        builder.<String>withRequestField("repository_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommitsByBranchRequest::getRepositoryName,
                ShowCommitsByBranchRequest::setRepositoryName));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCommitsByBranchRequest::getPageIndex, ShowCommitsByBranchRequest::setPageIndex));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCommitsByBranchRequest::getPageSize, ShowCommitsByBranchRequest::setPageSize));
        builder.<String>withRequestField("ref_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommitsByBranchRequest::getRefName, ShowCommitsByBranchRequest::setRefName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCommitsByRepoIdRequest, ShowCommitsByRepoIdResponse> showCommitsByRepoId =
        genForShowCommitsByRepoId();

    private static HttpRequestDef<ShowCommitsByRepoIdRequest, ShowCommitsByRepoIdResponse> genForShowCommitsByRepoId() {
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
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getRepositoryId,
                ShowCommitsByRepoIdRequest::setRepositoryId));
        builder.<String>withRequestField("author",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getAuthor, ShowCommitsByRepoIdRequest::setAuthor));
        builder.<String>withRequestField("begin_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getBeginDate, ShowCommitsByRepoIdRequest::setBeginDate));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getEndDate, ShowCommitsByRepoIdRequest::setEndDate));
        builder.<String>withRequestField("message",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getMessage, ShowCommitsByRepoIdRequest::setMessage));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getPageIndex, ShowCommitsByRepoIdRequest::setPageIndex));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getPageSize, ShowCommitsByRepoIdRequest::setPageSize));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getPath, ShowCommitsByRepoIdRequest::setPath));
        builder.<String>withRequestField("ref_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getRefName, ShowCommitsByRepoIdRequest::setRefName));
        builder.<String>withRequestField("stat_format",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCommitsByRepoIdRequest::getStatFormat,
                ShowCommitsByRepoIdRequest::setStatFormat));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHasPipelineRequest, ShowHasPipelineResponse> showHasPipeline =
        genForShowHasPipeline();

    private static HttpRequestDef<ShowHasPipelineRequest, ShowHasPipelineResponse> genForShowHasPipeline() {
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
            f -> f.withMarshaller(ShowHasPipelineRequest::getRepositoryUuid,
                ShowHasPipelineRequest::setRepositoryUuid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowImageBlobRequest, ShowImageBlobResponse> showImageBlob =
        genForShowImageBlob();

    private static HttpRequestDef<ShowImageBlobRequest, ShowImageBlobResponse> genForShowImageBlob() {
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
            f -> f.withMarshaller(ShowImageBlobRequest::getRepositoryUuid, ShowImageBlobRequest::setRepositoryUuid));
        builder.<String>withRequestField("branch_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageBlobRequest::getBranchName, ShowImageBlobRequest::setBranchName));
        builder.<String>withRequestField("path",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowImageBlobRequest::getPath, ShowImageBlobRequest::setPath));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMasterRequest, ShowMasterResponse> showMaster = genForShowMaster();

    private static HttpRequestDef<ShowMasterRequest, ShowMasterResponse> genForShowMaster() {
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
            f -> f.withMarshaller(ShowMasterRequest::getRepositoryUuid, ShowMasterRequest::setRepositoryUuid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMergeRequestRequest, ShowMergeRequestResponse> showMergeRequest =
        genForShowMergeRequest();

    private static HttpRequestDef<ShowMergeRequestRequest, ShowMergeRequestResponse> genForShowMergeRequest() {
        // basic
        HttpRequestDef.Builder<ShowMergeRequestRequest, ShowMergeRequestResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMergeRequestRequest.class, ShowMergeRequestResponse.class)
                .withName("ShowMergeRequest")
                .withUri("/v2/repositories/{repository_id}/merge_request/{merge_request_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMergeRequestRequest::getRepositoryId, ShowMergeRequestRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMergeRequestRequest::getMergeRequestId,
                ShowMergeRequestRequest::setMergeRequestId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepoIdRequest, ShowRepoIdResponse> showRepoId = genForShowRepoId();

    private static HttpRequestDef<ShowRepoIdRequest, ShowRepoIdResponse> genForShowRepoId() {
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
            f -> f.withMarshaller(ShowRepoIdRequest::getGroupName, ShowRepoIdRequest::setGroupName));
        builder.<String>withRequestField("repository_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepoIdRequest::getRepositoryName, ShowRepoIdRequest::setRepositoryName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryArchiveRequest, ShowRepositoryArchiveResponse> showRepositoryArchive =
        genForShowRepositoryArchive();

    private static HttpRequestDef<ShowRepositoryArchiveRequest, ShowRepositoryArchiveResponse> genForShowRepositoryArchive() {
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
            f -> f.withMarshaller(ShowRepositoryArchiveRequest::getRepositoryUuid,
                ShowRepositoryArchiveRequest::setRepositoryUuid));
        builder.<String>withRequestField("sha",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryArchiveRequest::getSha, ShowRepositoryArchiveRequest::setSha));
        builder.<String>withRequestField("format",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryArchiveRequest::getFormat, ShowRepositoryArchiveRequest::setFormat));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryByUuidRequest, ShowRepositoryByUuidResponse> showRepositoryByUuid =
        genForShowRepositoryByUuid();

    private static HttpRequestDef<ShowRepositoryByUuidRequest, ShowRepositoryByUuidResponse> genForShowRepositoryByUuid() {
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
            f -> f.withMarshaller(ShowRepositoryByUuidRequest::getRepositoryUuid,
                ShowRepositoryByUuidRequest::setRepositoryUuid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryStatisticsRequest, ShowRepositoryStatisticsResponse> showRepositoryStatistics =
        genForShowRepositoryStatistics();

    private static HttpRequestDef<ShowRepositoryStatisticsRequest, ShowRepositoryStatisticsResponse> genForShowRepositoryStatistics() {
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
            f -> f.withMarshaller(ShowRepositoryStatisticsRequest::getRepositoryId,
                ShowRepositoryStatisticsRequest::setRepositoryId));
        builder.<ShowRepositoryStatisticsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowRepositoryStatisticsRequestBody.class),
            f -> f.withMarshaller(ShowRepositoryStatisticsRequest::getBody, ShowRepositoryStatisticsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStatisticCommitRequest, ShowStatisticCommitResponse> showStatisticCommit =
        genForShowStatisticCommit();

    private static HttpRequestDef<ShowStatisticCommitRequest, ShowStatisticCommitResponse> genForShowStatisticCommit() {
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
            f -> f.withMarshaller(ShowStatisticCommitRequest::getRepositoryId,
                ShowStatisticCommitRequest::setRepositoryId));
        builder.<String>withRequestField("ref_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStatisticCommitRequest::getRefName, ShowStatisticCommitRequest::setRefName));
        builder.<String>withRequestField("begin_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStatisticCommitRequest::getBeginDate, ShowStatisticCommitRequest::setBeginDate));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStatisticCommitRequest::getEndDate, ShowStatisticCommitRequest::setEndDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStatisticCommitV3Request, ShowStatisticCommitV3Response> showStatisticCommitV3 =
        genForShowStatisticCommitV3();

    private static HttpRequestDef<ShowStatisticCommitV3Request, ShowStatisticCommitV3Response> genForShowStatisticCommitV3() {
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
            f -> f.withMarshaller(ShowStatisticCommitV3Request::getRepositoryId,
                ShowStatisticCommitV3Request::setRepositoryId));
        builder.<String>withRequestField("ref_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStatisticCommitV3Request::getRefName, ShowStatisticCommitV3Request::setRefName));
        builder.<String>withRequestField("begin_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStatisticCommitV3Request::getBeginDate,
                ShowStatisticCommitV3Request::setBeginDate));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStatisticCommitV3Request::getEndDate, ShowStatisticCommitV3Request::setEndDate));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStatisticalDataRequest, ShowStatisticalDataResponse> showStatisticalData =
        genForShowStatisticalData();

    private static HttpRequestDef<ShowStatisticalDataRequest, ShowStatisticalDataResponse> genForShowStatisticalData() {
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
            f -> f.withMarshaller(ShowStatisticalDataRequest::getRepositoryUuid,
                ShowStatisticalDataRequest::setRepositoryUuid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMergeRequestApprovalStateRequest, UpdateMergeRequestApprovalStateResponse> updateMergeRequestApprovalState =
        genForUpdateMergeRequestApprovalState();

    private static HttpRequestDef<UpdateMergeRequestApprovalStateRequest, UpdateMergeRequestApprovalStateResponse> genForUpdateMergeRequestApprovalState() {
        // basic
        HttpRequestDef.Builder<UpdateMergeRequestApprovalStateRequest, UpdateMergeRequestApprovalStateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateMergeRequestApprovalStateRequest.class,
                    UpdateMergeRequestApprovalStateResponse.class)
                .withName("UpdateMergeRequestApprovalState")
                .withUri("/v2/repositories/{repository_id}/merge-requests/{merge_request_iid}/approval")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMergeRequestApprovalStateRequest::getRepositoryId,
                UpdateMergeRequestApprovalStateRequest::setRepositoryId));
        builder.<Integer>withRequestField("merge_request_iid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateMergeRequestApprovalStateRequest::getMergeRequestIid,
                UpdateMergeRequestApprovalStateRequest::setMergeRequestIid));
        builder.<ApprovalActionTypeDto>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApprovalActionTypeDto.class),
            f -> f.withMarshaller(UpdateMergeRequestApprovalStateRequest::getBody,
                UpdateMergeRequestApprovalStateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddSshKeyRequest, AddSshKeyResponse> addSshKey = genForAddSshKey();

    private static HttpRequestDef<AddSshKeyRequest, AddSshKeyResponse> genForAddSshKey() {
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
            f -> f.withMarshaller(AddSshKeyRequest::getBody, AddSshKeyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSShkeyRequest, DeleteSShkeyResponse> deleteSShkey = genForDeleteSShkey();

    private static HttpRequestDef<DeleteSShkeyRequest, DeleteSShkeyResponse> genForDeleteSShkey() {
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
            f -> f.withMarshaller(DeleteSShkeyRequest::getId, DeleteSShkeyRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSshKeysRequest, ListSshKeysResponse> listSshKeys = genForListSshKeys();

    private static HttpRequestDef<ListSshKeysRequest, ListSshKeysResponse> genForListSshKeys() {
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
        genForShowPrivateKeyVerify();

    private static HttpRequestDef<ShowPrivateKeyVerifyRequest, ShowPrivateKeyVerifyResponse> genForShowPrivateKeyVerify() {
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
            f -> f.withMarshaller(ShowPrivateKeyVerifyRequest::getBody, ShowPrivateKeyVerifyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateHttpsInfoRequest, ValidateHttpsInfoResponse> validateHttpsInfo =
        genForValidateHttpsInfo();

    private static HttpRequestDef<ValidateHttpsInfoRequest, ValidateHttpsInfoResponse> genForValidateHttpsInfo() {
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
            f -> f.withMarshaller(ValidateHttpsInfoRequest::getIamUserUuid, ValidateHttpsInfoRequest::setIamUserUuid));
        builder.<PasswordRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PasswordRequest.class),
            f -> f.withMarshaller(ValidateHttpsInfoRequest::getBody, ValidateHttpsInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateHttpsInfoV2Request, ValidateHttpsInfoV2Response> validateHttpsInfoV2 =
        genForValidateHttpsInfoV2();

    private static HttpRequestDef<ValidateHttpsInfoV2Request, ValidateHttpsInfoV2Response> genForValidateHttpsInfoV2() {
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
            f -> f.withMarshaller(ValidateHttpsInfoV2Request::getIamUserUuid,
                ValidateHttpsInfoV2Request::setIamUserUuid));
        builder.<PasswordRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PasswordRequest.class),
            f -> f.withMarshaller(ValidateHttpsInfoV2Request::getBody, ValidateHttpsInfoV2Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNewBranchRequest, CreateNewBranchResponse> createNewBranch =
        genForCreateNewBranch();

    private static HttpRequestDef<CreateNewBranchRequest, CreateNewBranchResponse> genForCreateNewBranch() {
        // basic
        HttpRequestDef.Builder<CreateNewBranchRequest, CreateNewBranchResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNewBranchRequest.class, CreateNewBranchResponse.class)
                .withName("CreateNewBranch")
                .withUri("/v2/repositories/{repository_id}/branches")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repository_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNewBranchRequest::getRepositoryId, CreateNewBranchRequest::setRepositoryId));
        builder.<CreateNewBranchRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNewBranchRequestBody.class),
            f -> f.withMarshaller(CreateNewBranchRequest::getBody, CreateNewBranchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateIssuesRequest, AssociateIssuesResponse> associateIssues =
        genForAssociateIssues();

    private static HttpRequestDef<AssociateIssuesRequest, AssociateIssuesResponse> genForAssociateIssues() {
        // basic
        HttpRequestDef.Builder<AssociateIssuesRequest, AssociateIssuesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateIssuesRequest.class, AssociateIssuesResponse.class)
                .withName("AssociateIssues")
                .withUri("/v2/projects/issues")
                .withContentType("application/json");

        // requests
        builder.<AssociateIssuesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateIssuesRequestBody.class),
            f -> f.withMarshaller(AssociateIssuesRequest::getBody, AssociateIssuesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectAndRepositoriesRequest, CreateProjectAndRepositoriesResponse> createProjectAndRepositories =
        genForCreateProjectAndRepositories();

    private static HttpRequestDef<CreateProjectAndRepositoriesRequest, CreateProjectAndRepositoriesResponse> genForCreateProjectAndRepositories() {
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
            f -> f.withMarshaller(CreateProjectAndRepositoriesRequest::getBody,
                CreateProjectAndRepositoriesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectAndforkRepositoriesRequest, CreateProjectAndforkRepositoriesResponse> createProjectAndforkRepositories =
        genForCreateProjectAndforkRepositories();

    private static HttpRequestDef<CreateProjectAndforkRepositoriesRequest, CreateProjectAndforkRepositoriesResponse> genForCreateProjectAndforkRepositories() {
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
            f -> f.withMarshaller(CreateProjectAndforkRepositoriesRequest::getBody,
                CreateProjectAndforkRepositoriesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserAllRepositoriesRequest, ListUserAllRepositoriesResponse> listUserAllRepositories =
        genForListUserAllRepositories();

    private static HttpRequestDef<ListUserAllRepositoriesRequest, ListUserAllRepositoriesResponse> genForListUserAllRepositories() {
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
            f -> f.withMarshaller(ListUserAllRepositoriesRequest::getPageIndex,
                ListUserAllRepositoriesRequest::setPageIndex));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUserAllRepositoriesRequest::getPageSize,
                ListUserAllRepositoriesRequest::setPageSize));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserAllRepositoriesRequest::getSearch,
                ListUserAllRepositoriesRequest::setSearch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAllRepositoryByTwoProjectIdRequest, ShowAllRepositoryByTwoProjectIdResponse> showAllRepositoryByTwoProjectId =
        genForShowAllRepositoryByTwoProjectId();

    private static HttpRequestDef<ShowAllRepositoryByTwoProjectIdRequest, ShowAllRepositoryByTwoProjectIdResponse> genForShowAllRepositoryByTwoProjectId() {
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
            f -> f.withMarshaller(ShowAllRepositoryByTwoProjectIdRequest::getProjectUuid,
                ShowAllRepositoryByTwoProjectIdRequest::setProjectUuid));
        builder.<Integer>withRequestField("page_index",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAllRepositoryByTwoProjectIdRequest::getPageIndex,
                ShowAllRepositoryByTwoProjectIdRequest::setPageIndex));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAllRepositoryByTwoProjectIdRequest::getPageSize,
                ShowAllRepositoryByTwoProjectIdRequest::setPageSize));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllRepositoryByTwoProjectIdRequest::getSearch,
                ShowAllRepositoryByTwoProjectIdRequest::setSearch));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddHooksRequest, AddHooksResponse> addHooks = genForAddHooks();

    private static HttpRequestDef<AddHooksRequest, AddHooksResponse> genForAddHooks() {
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
            f -> f.withMarshaller(AddHooksRequest::getGroupName, AddHooksRequest::setGroupName));
        builder.<String>withRequestField("repository_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddHooksRequest::getRepositoryName, AddHooksRequest::setRepositoryName));
        builder.<RepositoryHookRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RepositoryHookRequest.class),
            f -> f.withMarshaller(AddHooksRequest::getBody, AddHooksRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHooksRequest, DeleteHooksResponse> deleteHooks = genForDeleteHooks();

    private static HttpRequestDef<DeleteHooksRequest, DeleteHooksResponse> genForDeleteHooks() {
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
            f -> f.withMarshaller(DeleteHooksRequest::getGroupName, DeleteHooksRequest::setGroupName));
        builder.<Integer>withRequestField("hook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteHooksRequest::getHookId, DeleteHooksRequest::setHookId));
        builder.<String>withRequestField("repository_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHooksRequest::getRepositoryName, DeleteHooksRequest::setRepositoryName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHooksRequest, ListHooksResponse> listHooks = genForListHooks();

    private static HttpRequestDef<ListHooksRequest, ListHooksResponse> genForListHooks() {
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
            f -> f.withMarshaller(ListHooksRequest::getGroupName, ListHooksRequest::setGroupName));
        builder.<String>withRequestField("repository_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHooksRequest::getRepositoryName, ListHooksRequest::setRepositoryName));
        builder.<String>withRequestField("hook_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHooksRequest::getHookId, ListHooksRequest::setHookId));

        // response

        return builder.build();
    }

}
