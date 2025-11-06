package com.huaweicloud.sdk.codeartsrepo.v3;

import com.huaweicloud.sdk.codeartsrepo.v3.model.AddDeployKeyRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.AddDeployKeyResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.AddDeployKeyV2Request;
import com.huaweicloud.sdk.codeartsrepo.v3.model.AddDeployKeyV2Response;
import com.huaweicloud.sdk.codeartsrepo.v3.model.AddHooksRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.AddHooksResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.AddProtectBranchV2Request;
import com.huaweicloud.sdk.codeartsrepo.v3.model.AddProtectBranchV2Response;
import com.huaweicloud.sdk.codeartsrepo.v3.model.AddRepoMembersRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.AddRepoMembersResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.AddSshKeyRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.AddSshKeyResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.AddTagV2Request;
import com.huaweicloud.sdk.codeartsrepo.v3.model.AddTagV2Response;
import com.huaweicloud.sdk.codeartsrepo.v3.model.AssociateIssuesRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.AssociateIssuesResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.CreateCommitRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.CreateCommitResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.CreateMergeRequestDiscussionNoteRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.CreateMergeRequestDiscussionNoteResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.CreateMergeRequestDiscussionRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.CreateMergeRequestDiscussionResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.CreateNewBranchRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.CreateNewBranchResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.CreateProjectAndRepositoriesRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.CreateProjectAndRepositoriesResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.CreateProjectAndforkRepositoriesRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.CreateProjectAndforkRepositoriesResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.CreateRepositoryRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.CreateRepositoryResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.DeleteDeployKeyRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.DeleteDeployKeyResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.DeleteDeployKeyV2Request;
import com.huaweicloud.sdk.codeartsrepo.v3.model.DeleteDeployKeyV2Response;
import com.huaweicloud.sdk.codeartsrepo.v3.model.DeleteHooksRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.DeleteHooksResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.DeleteRepoMemberRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.DeleteRepoMemberResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.DeleteRepositoryRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.DeleteRepositoryResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.DeleteSShkeyRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.DeleteSShkeyResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.GetAllRepositoryByProjectIdRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.GetAllRepositoryByProjectIdResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.GetProductTemplatesRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.GetProductTemplatesResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.GetRepositoryByProjectIdRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.GetRepositoryByProjectIdResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.GetTemplatesRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.GetTemplatesResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListBranchesByRepositoryIdRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListBranchesByRepositoryIdResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListCommitStatisticsRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListCommitStatisticsResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListCommitsRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListCommitsResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListFilesByQueryRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListFilesByQueryResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListFilesRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListFilesResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListHooksRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListHooksResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListMergeChangesRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListMergeChangesResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListMergeChangesTreesRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListMergeChangesTreesResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListMergeRequestRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListMergeRequestResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListMergeRequestReviewersRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListMergeRequestReviewersResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListProductTwoTemplatesRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListProductTwoTemplatesResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListRelatedCommitsRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListRelatedCommitsResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListRepoMembersRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListRepoMembersResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListRepositoryStatusRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListRepositoryStatusResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListSshKeysRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListSshKeysResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListSubfilesRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListSubfilesResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListTemplatesTwoRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListTemplatesTwoResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListTwoTemplatesRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListTwoTemplatesResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListUserAllRepositoriesRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ListUserAllRepositoriesResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.SetRepoRoleRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.SetRepoRoleResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShareTemplatesRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShareTemplatesResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowAllRepositoryByTwoProjectIdRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowAllRepositoryByTwoProjectIdResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowBranchesByRepositoryIdRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowBranchesByRepositoryIdResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowBranchesByTwoRepositoryIdRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowBranchesByTwoRepositoryIdResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowCommitsByBranchRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowCommitsByBranchResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowCommitsByRepoIdRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowCommitsByRepoIdResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowDiffCommitRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowDiffCommitResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowFileRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowFileResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowHasPipelineRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowHasPipelineResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowImageBlobRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowImageBlobResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowMasterRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowMasterResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowMergeRequestRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowMergeRequestResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowPrivateKeyVerifyRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowPrivateKeyVerifyResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowRepoIdRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowRepoIdResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowRepositoryArchiveRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowRepositoryArchiveResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowRepositoryByUuidRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowRepositoryByUuidResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowRepositoryNameExistRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowRepositoryNameExistResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowRepositoryStatisticsRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowRepositoryStatisticsResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowReviewSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowReviewSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowSingleCommitRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowSingleCommitResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowStatisticCommitRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowStatisticCommitResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowStatisticCommitV3Request;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowStatisticCommitV3Response;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowStatisticalDataRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ShowStatisticalDataResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.UpdateMergeRequestApprovalStateRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.UpdateMergeRequestApprovalStateResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ValidateHttpsInfoRequest;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ValidateHttpsInfoResponse;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ValidateHttpsInfoV2Request;
import com.huaweicloud.sdk.codeartsrepo.v3.model.ValidateHttpsInfoV2Response;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CodeArtsRepoClient {

    protected HcClient hcClient;

    public CodeArtsRepoClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeArtsRepoClient> newBuilder() {
        ClientBuilder<CodeArtsRepoClient> clientBuilder = new ClientBuilder<>(CodeArtsRepoClient::new);
        return clientBuilder;
    }

    /**
     * 创建提交
     *
     * 能够一次提交位于不同目录的多个文件，目录不存在时，能自动创建目录。支持强制覆盖选项，当选择强制覆盖标志为true时，忽略冲突，强制提交。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCommitRequest 请求对象
     * @return CreateCommitResponse
     */
    public CreateCommitResponse createCommit(CreateCommitRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.createCommit);
    }

    /**
     * 创建提交
     *
     * 能够一次提交位于不同目录的多个文件，目录不存在时，能自动创建目录。支持强制覆盖选项，当选择强制覆盖标志为true时，忽略冲突，强制提交。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCommitRequest 请求对象
     * @return SyncInvoker<CreateCommitRequest, CreateCommitResponse>
     */
    public SyncInvoker<CreateCommitRequest, CreateCommitResponse> createCommitInvoker(CreateCommitRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.createCommit, hcClient);
    }

    /**
     * 查询某个仓库的提交信息
     *
     * 根据仓库短ID获取提交信息，支持根据文件路径，查询这个路径下所有的commits列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommitsRequest 请求对象
     * @return ListCommitsResponse
     */
    public ListCommitsResponse listCommits(ListCommitsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.listCommits);
    }

    /**
     * 查询某个仓库的提交信息
     *
     * 根据仓库短ID获取提交信息，支持根据文件路径，查询这个路径下所有的commits列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommitsRequest 请求对象
     * @return SyncInvoker<ListCommitsRequest, ListCommitsResponse>
     */
    public SyncInvoker<ListCommitsRequest, ListCommitsResponse> listCommitsInvoker(ListCommitsRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.listCommits, hcClient);
    }

    /**
     * 查询某个仓库的提交差异信息
     *
     * 根据commit id查询提交差异信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiffCommitRequest 请求对象
     * @return ShowDiffCommitResponse
     */
    public ShowDiffCommitResponse showDiffCommit(ShowDiffCommitRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.showDiffCommit);
    }

    /**
     * 查询某个仓库的提交差异信息
     *
     * 根据commit id查询提交差异信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiffCommitRequest 请求对象
     * @return SyncInvoker<ShowDiffCommitRequest, ShowDiffCommitResponse>
     */
    public SyncInvoker<ShowDiffCommitRequest, ShowDiffCommitResponse> showDiffCommitInvoker(
        ShowDiffCommitRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.showDiffCommit, hcClient);
    }

    /**
     * 查询某个仓库的特定提交信息
     *
     * 获取由commit id或分支或标记的名称标识的特定提交。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSingleCommitRequest 请求对象
     * @return ShowSingleCommitResponse
     */
    public ShowSingleCommitResponse showSingleCommit(ShowSingleCommitRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.showSingleCommit);
    }

    /**
     * 查询某个仓库的特定提交信息
     *
     * 获取由commit id或分支或标记的名称标识的特定提交。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSingleCommitRequest 请求对象
     * @return SyncInvoker<ShowSingleCommitRequest, ShowSingleCommitResponse>
     */
    public SyncInvoker<ShowSingleCommitRequest, ShowSingleCommitResponse> showSingleCommitInvoker(
        ShowSingleCommitRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.showSingleCommit, hcClient);
    }

    /**
     * 创建MR检视意见
     *
     * 创建MR检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeRequestDiscussionRequest 请求对象
     * @return CreateMergeRequestDiscussionResponse
     */
    public CreateMergeRequestDiscussionResponse createMergeRequestDiscussion(
        CreateMergeRequestDiscussionRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.createMergeRequestDiscussion);
    }

    /**
     * 创建MR检视意见
     *
     * 创建MR检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeRequestDiscussionRequest 请求对象
     * @return SyncInvoker<CreateMergeRequestDiscussionRequest, CreateMergeRequestDiscussionResponse>
     */
    public SyncInvoker<CreateMergeRequestDiscussionRequest, CreateMergeRequestDiscussionResponse> createMergeRequestDiscussionInvoker(
        CreateMergeRequestDiscussionRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.createMergeRequestDiscussion, hcClient);
    }

    /**
     * 回复MR检视意见
     *
     * 回复MR检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeRequestDiscussionNoteRequest 请求对象
     * @return CreateMergeRequestDiscussionNoteResponse
     */
    public CreateMergeRequestDiscussionNoteResponse createMergeRequestDiscussionNote(
        CreateMergeRequestDiscussionNoteRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.createMergeRequestDiscussionNote);
    }

    /**
     * 回复MR检视意见
     *
     * 回复MR检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeRequestDiscussionNoteRequest 请求对象
     * @return SyncInvoker<CreateMergeRequestDiscussionNoteRequest, CreateMergeRequestDiscussionNoteResponse>
     */
    public SyncInvoker<CreateMergeRequestDiscussionNoteRequest, CreateMergeRequestDiscussionNoteResponse> createMergeRequestDiscussionNoteInvoker(
        CreateMergeRequestDiscussionNoteRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.createMergeRequestDiscussionNote, hcClient);
    }

    /**
     * 获取检视意见设置
     *
     * 获取检视意见设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReviewSettingRequest 请求对象
     * @return ShowReviewSettingResponse
     */
    public ShowReviewSettingResponse showReviewSetting(ShowReviewSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.showReviewSetting);
    }

    /**
     * 获取检视意见设置
     *
     * 获取检视意见设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReviewSettingRequest 请求对象
     * @return SyncInvoker<ShowReviewSettingRequest, ShowReviewSettingResponse>
     */
    public SyncInvoker<ShowReviewSettingRequest, ShowReviewSettingResponse> showReviewSettingInvoker(
        ShowReviewSettingRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.showReviewSetting, hcClient);
    }

    /**
     * 查询某个仓库的文件信息
     *
     * 获取仓库中文件的信息，如名称、大小、内容。请注意，文件内容是Base64编码的。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFilesByQueryRequest 请求对象
     * @return ListFilesByQueryResponse
     */
    public ListFilesByQueryResponse listFilesByQuery(ListFilesByQueryRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.listFilesByQuery);
    }

    /**
     * 查询某个仓库的文件信息
     *
     * 获取仓库中文件的信息，如名称、大小、内容。请注意，文件内容是Base64编码的。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFilesByQueryRequest 请求对象
     * @return SyncInvoker<ListFilesByQueryRequest, ListFilesByQueryResponse>
     */
    public SyncInvoker<ListFilesByQueryRequest, ListFilesByQueryResponse> listFilesByQueryInvoker(
        ListFilesByQueryRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.listFilesByQuery, hcClient);
    }

    /**
     * 查询某个仓库的文件信息
     *
     * 获取仓库中文件的信息，如名称、大小、内容。请注意，文件内容是Base64编码的。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileRequest 请求对象
     * @return ShowFileResponse
     */
    @Deprecated
    public ShowFileResponse showFile(ShowFileRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.showFile);
    }

    /**
     * 查询某个仓库的文件信息
     *
     * 获取仓库中文件的信息，如名称、大小、内容。请注意，文件内容是Base64编码的。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileRequest 请求对象
     * @return SyncInvoker<ShowFileRequest, ShowFileResponse>
     */
    @Deprecated
    public SyncInvoker<ShowFileRequest, ShowFileResponse> showFileInvoker(ShowFileRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.showFile, hcClient);
    }

    /**
     * 获取项目下所有仓库信息
     *
     * 获取仓库列表 模糊查询支持范围,如果未传入project_id，则支持按仓库名或项目名模糊查询，否则，只按仓库名模糊匹配。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetAllRepositoryByProjectIdRequest 请求对象
     * @return GetAllRepositoryByProjectIdResponse
     */
    @Deprecated
    public GetAllRepositoryByProjectIdResponse getAllRepositoryByProjectId(GetAllRepositoryByProjectIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.getAllRepositoryByProjectId);
    }

    /**
     * 获取项目下所有仓库信息
     *
     * 获取仓库列表 模糊查询支持范围,如果未传入project_id，则支持按仓库名或项目名模糊查询，否则，只按仓库名模糊匹配。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetAllRepositoryByProjectIdRequest 请求对象
     * @return SyncInvoker<GetAllRepositoryByProjectIdRequest, GetAllRepositoryByProjectIdResponse>
     */
    @Deprecated
    public SyncInvoker<GetAllRepositoryByProjectIdRequest, GetAllRepositoryByProjectIdResponse> getAllRepositoryByProjectIdInvoker(
        GetAllRepositoryByProjectIdRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.getAllRepositoryByProjectId, hcClient);
    }

    /**
     * 获取一个项目下可以设置为公开状态的仓库列表
     *
     * 获取一个项目下可以设置为公开状态的仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetProductTemplatesRequest 请求对象
     * @return GetProductTemplatesResponse
     */
    @Deprecated
    public GetProductTemplatesResponse getProductTemplates(GetProductTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.getProductTemplates);
    }

    /**
     * 获取一个项目下可以设置为公开状态的仓库列表
     *
     * 获取一个项目下可以设置为公开状态的仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetProductTemplatesRequest 请求对象
     * @return SyncInvoker<GetProductTemplatesRequest, GetProductTemplatesResponse>
     */
    @Deprecated
    public SyncInvoker<GetProductTemplatesRequest, GetProductTemplatesResponse> getProductTemplatesInvoker(
        GetProductTemplatesRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.getProductTemplates, hcClient);
    }

    /**
     * 获取一个项目下可以设置为公开状态的仓库列表
     *
     * 获取一个项目下可以设置为公开状态的仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductTwoTemplatesRequest 请求对象
     * @return ListProductTwoTemplatesResponse
     */
    public ListProductTwoTemplatesResponse listProductTwoTemplates(ListProductTwoTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.listProductTwoTemplates);
    }

    /**
     * 获取一个项目下可以设置为公开状态的仓库列表
     *
     * 获取一个项目下可以设置为公开状态的仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductTwoTemplatesRequest 请求对象
     * @return SyncInvoker<ListProductTwoTemplatesRequest, ListProductTwoTemplatesResponse>
     */
    public SyncInvoker<ListProductTwoTemplatesRequest, ListProductTwoTemplatesResponse> listProductTwoTemplatesInvoker(
        ListProductTwoTemplatesRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.listProductTwoTemplates, hcClient);
    }

    /**
     * 校验指定项目下的仓库名
     *
     * 一般创建仓库时调用。通过传入项目ID，获取方式请参见[获取项目ID](codehub_api_0014.xml)。,仓库名，来判断仓库是否重名。仓库存在result:false,仓库不存在result:true。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryNameExistRequest 请求对象
     * @return ShowRepositoryNameExistResponse
     */
    public ShowRepositoryNameExistResponse showRepositoryNameExist(ShowRepositoryNameExistRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.showRepositoryNameExist);
    }

    /**
     * 校验指定项目下的仓库名
     *
     * 一般创建仓库时调用。通过传入项目ID，获取方式请参见[获取项目ID](codehub_api_0014.xml)。,仓库名，来判断仓库是否重名。仓库存在result:false,仓库不存在result:true。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryNameExistRequest 请求对象
     * @return SyncInvoker<ShowRepositoryNameExistRequest, ShowRepositoryNameExistResponse>
     */
    public SyncInvoker<ShowRepositoryNameExistRequest, ShowRepositoryNameExistResponse> showRepositoryNameExistInvoker(
        ShowRepositoryNameExistRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.showRepositoryNameExist, hcClient);
    }

    /**
     * 添加仓库成员
     *
     * 添加仓库成员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRepoMembersRequest 请求对象
     * @return AddRepoMembersResponse
     */
    public AddRepoMembersResponse addRepoMembers(AddRepoMembersRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.addRepoMembers);
    }

    /**
     * 添加仓库成员
     *
     * 添加仓库成员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRepoMembersRequest 请求对象
     * @return SyncInvoker<AddRepoMembersRequest, AddRepoMembersResponse>
     */
    public SyncInvoker<AddRepoMembersRequest, AddRepoMembersResponse> addRepoMembersInvoker(
        AddRepoMembersRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.addRepoMembers, hcClient);
    }

    /**
     * 删除仓库成员
     *
     * 删除仓库成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepoMemberRequest 请求对象
     * @return DeleteRepoMemberResponse
     */
    public DeleteRepoMemberResponse deleteRepoMember(DeleteRepoMemberRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.deleteRepoMember);
    }

    /**
     * 删除仓库成员
     *
     * 删除仓库成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepoMemberRequest 请求对象
     * @return SyncInvoker<DeleteRepoMemberRequest, DeleteRepoMemberResponse>
     */
    public SyncInvoker<DeleteRepoMemberRequest, DeleteRepoMemberResponse> deleteRepoMemberInvoker(
        DeleteRepoMemberRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.deleteRepoMember, hcClient);
    }

    /**
     * 获取仓库所有成员记录
     *
     * 获取仓库成员列表,可通过关键字搜索某成员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepoMembersRequest 请求对象
     * @return ListRepoMembersResponse
     */
    public ListRepoMembersResponse listRepoMembers(ListRepoMembersRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.listRepoMembers);
    }

    /**
     * 获取仓库所有成员记录
     *
     * 获取仓库成员列表,可通过关键字搜索某成员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepoMembersRequest 请求对象
     * @return SyncInvoker<ListRepoMembersRequest, ListRepoMembersResponse>
     */
    public SyncInvoker<ListRepoMembersRequest, ListRepoMembersResponse> listRepoMembersInvoker(
        ListRepoMembersRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.listRepoMembers, hcClient);
    }

    /**
     * 设置成员在仓库中的角色
     *
     * 给仓库中成员设置仓库的操作权限，
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRepoRoleRequest 请求对象
     * @return SetRepoRoleResponse
     */
    public SetRepoRoleResponse setRepoRole(SetRepoRoleRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.setRepoRole);
    }

    /**
     * 设置成员在仓库中的角色
     *
     * 给仓库中成员设置仓库的操作权限，
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRepoRoleRequest 请求对象
     * @return SyncInvoker<SetRepoRoleRequest, SetRepoRoleResponse>
     */
    public SyncInvoker<SetRepoRoleRequest, SetRepoRoleResponse> setRepoRoleInvoker(SetRepoRoleRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.setRepoRole, hcClient);
    }

    /**
     * 添加部署密钥
     *
     * 添加部署密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDeployKeyRequest 请求对象
     * @return AddDeployKeyResponse
     */
    @Deprecated
    public AddDeployKeyResponse addDeployKey(AddDeployKeyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.addDeployKey);
    }

    /**
     * 添加部署密钥
     *
     * 添加部署密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDeployKeyRequest 请求对象
     * @return SyncInvoker<AddDeployKeyRequest, AddDeployKeyResponse>
     */
    @Deprecated
    public SyncInvoker<AddDeployKeyRequest, AddDeployKeyResponse> addDeployKeyInvoker(AddDeployKeyRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.addDeployKey, hcClient);
    }

    /**
     * 添加部署密钥
     *
     * 添加部署密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDeployKeyV2Request 请求对象
     * @return AddDeployKeyV2Response
     */
    public AddDeployKeyV2Response addDeployKeyV2(AddDeployKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.addDeployKeyV2);
    }

    /**
     * 添加部署密钥
     *
     * 添加部署密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDeployKeyV2Request 请求对象
     * @return SyncInvoker<AddDeployKeyV2Request, AddDeployKeyV2Response>
     */
    public SyncInvoker<AddDeployKeyV2Request, AddDeployKeyV2Response> addDeployKeyV2Invoker(
        AddDeployKeyV2Request request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.addDeployKeyV2, hcClient);
    }

    /**
     * 新建保护分支
     *
     * 新建保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddProtectBranchV2Request 请求对象
     * @return AddProtectBranchV2Response
     */
    public AddProtectBranchV2Response addProtectBranchV2(AddProtectBranchV2Request request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.addProtectBranchV2);
    }

    /**
     * 新建保护分支
     *
     * 新建保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddProtectBranchV2Request 请求对象
     * @return SyncInvoker<AddProtectBranchV2Request, AddProtectBranchV2Response>
     */
    public SyncInvoker<AddProtectBranchV2Request, AddProtectBranchV2Response> addProtectBranchV2Invoker(
        AddProtectBranchV2Request request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.addProtectBranchV2, hcClient);
    }

    /**
     * 新建标签
     *
     * 新建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTagV2Request 请求对象
     * @return AddTagV2Response
     */
    public AddTagV2Response addTagV2(AddTagV2Request request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.addTagV2);
    }

    /**
     * 新建标签
     *
     * 新建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTagV2Request 请求对象
     * @return SyncInvoker<AddTagV2Request, AddTagV2Response>
     */
    public SyncInvoker<AddTagV2Request, AddTagV2Response> addTagV2Invoker(AddTagV2Request request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.addTagV2, hcClient);
    }

    /**
     * 创建仓库
     *
     * 用指定的名称在指定项目上创建仓库。传入参数：仓库名、模板id、是否导入项目成员、归属项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepositoryRequest 请求对象
     * @return CreateRepositoryResponse
     */
    public CreateRepositoryResponse createRepository(CreateRepositoryRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.createRepository);
    }

    /**
     * 创建仓库
     *
     * 用指定的名称在指定项目上创建仓库。传入参数：仓库名、模板id、是否导入项目成员、归属项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepositoryRequest 请求对象
     * @return SyncInvoker<CreateRepositoryRequest, CreateRepositoryResponse>
     */
    public SyncInvoker<CreateRepositoryRequest, CreateRepositoryResponse> createRepositoryInvoker(
        CreateRepositoryRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.createRepository, hcClient);
    }

    /**
     * 删除仓库部署密钥
     *
     * 删除仓库部署密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeployKeyRequest 请求对象
     * @return DeleteDeployKeyResponse
     */
    @Deprecated
    public DeleteDeployKeyResponse deleteDeployKey(DeleteDeployKeyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.deleteDeployKey);
    }

    /**
     * 删除仓库部署密钥
     *
     * 删除仓库部署密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeployKeyRequest 请求对象
     * @return SyncInvoker<DeleteDeployKeyRequest, DeleteDeployKeyResponse>
     */
    @Deprecated
    public SyncInvoker<DeleteDeployKeyRequest, DeleteDeployKeyResponse> deleteDeployKeyInvoker(
        DeleteDeployKeyRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.deleteDeployKey, hcClient);
    }

    /**
     * 删除仓库部署密钥
     *
     * 删除仓库部署密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeployKeyV2Request 请求对象
     * @return DeleteDeployKeyV2Response
     */
    public DeleteDeployKeyV2Response deleteDeployKeyV2(DeleteDeployKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.deleteDeployKeyV2);
    }

    /**
     * 删除仓库部署密钥
     *
     * 删除仓库部署密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeployKeyV2Request 请求对象
     * @return SyncInvoker<DeleteDeployKeyV2Request, DeleteDeployKeyV2Response>
     */
    public SyncInvoker<DeleteDeployKeyV2Request, DeleteDeployKeyV2Response> deleteDeployKeyV2Invoker(
        DeleteDeployKeyV2Request request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.deleteDeployKeyV2, hcClient);
    }

    /**
     * 删除仓库
     *
     * 根据仓库32位uuid删除指定的仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepositoryRequest 请求对象
     * @return DeleteRepositoryResponse
     */
    public DeleteRepositoryResponse deleteRepository(DeleteRepositoryRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.deleteRepository);
    }

    /**
     * 删除仓库
     *
     * 根据仓库32位uuid删除指定的仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepositoryRequest 请求对象
     * @return SyncInvoker<DeleteRepositoryRequest, DeleteRepositoryResponse>
     */
    public SyncInvoker<DeleteRepositoryRequest, DeleteRepositoryResponse> deleteRepositoryInvoker(
        DeleteRepositoryRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.deleteRepository, hcClient);
    }

    /**
     * 查询项目下的某个仓库
     *
     * 不建议再使用,建议使用/{repository_uuid}/status
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetRepositoryByProjectIdRequest 请求对象
     * @return GetRepositoryByProjectIdResponse
     */
    @Deprecated
    public GetRepositoryByProjectIdResponse getRepositoryByProjectId(GetRepositoryByProjectIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.getRepositoryByProjectId);
    }

    /**
     * 查询项目下的某个仓库
     *
     * 不建议再使用,建议使用/{repository_uuid}/status
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetRepositoryByProjectIdRequest 请求对象
     * @return SyncInvoker<GetRepositoryByProjectIdRequest, GetRepositoryByProjectIdResponse>
     */
    @Deprecated
    public SyncInvoker<GetRepositoryByProjectIdRequest, GetRepositoryByProjectIdResponse> getRepositoryByProjectIdInvoker(
        GetRepositoryByProjectIdRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.getRepositoryByProjectId, hcClient);
    }

    /**
     * 获取公开示例模板列表
     *
     * 获取公开示例模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetTemplatesRequest 请求对象
     * @return GetTemplatesResponse
     */
    @Deprecated
    public GetTemplatesResponse getTemplates(GetTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.getTemplates);
    }

    /**
     * 获取公开示例模板列表
     *
     * 获取公开示例模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetTemplatesRequest 请求对象
     * @return SyncInvoker<GetTemplatesRequest, GetTemplatesResponse>
     */
    @Deprecated
    public SyncInvoker<GetTemplatesRequest, GetTemplatesResponse> getTemplatesInvoker(GetTemplatesRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.getTemplates, hcClient);
    }

    /**
     * 获取仓库分支列表
     *
     * 获取仓库分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBranchesByRepositoryIdRequest 请求对象
     * @return ListBranchesByRepositoryIdResponse
     */
    public ListBranchesByRepositoryIdResponse listBranchesByRepositoryId(ListBranchesByRepositoryIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.listBranchesByRepositoryId);
    }

    /**
     * 获取仓库分支列表
     *
     * 获取仓库分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBranchesByRepositoryIdRequest 请求对象
     * @return SyncInvoker<ListBranchesByRepositoryIdRequest, ListBranchesByRepositoryIdResponse>
     */
    public SyncInvoker<ListBranchesByRepositoryIdRequest, ListBranchesByRepositoryIdResponse> listBranchesByRepositoryIdInvoker(
        ListBranchesByRepositoryIdRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.listBranchesByRepositoryId, hcClient);
    }

    /**
     * 获取仓库上一次的提交统计信息
     *
     * 获取仓库上一次的提交统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommitStatisticsRequest 请求对象
     * @return ListCommitStatisticsResponse
     */
    public ListCommitStatisticsResponse listCommitStatistics(ListCommitStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.listCommitStatistics);
    }

    /**
     * 获取仓库上一次的提交统计信息
     *
     * 获取仓库上一次的提交统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommitStatisticsRequest 请求对象
     * @return SyncInvoker<ListCommitStatisticsRequest, ListCommitStatisticsResponse>
     */
    public SyncInvoker<ListCommitStatisticsRequest, ListCommitStatisticsResponse> listCommitStatisticsInvoker(
        ListCommitStatisticsRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.listCommitStatistics, hcClient);
    }

    /**
     * 获取一个仓库下特定分支指定文件内容
     *
     * 获取一个仓库下特定分支指定文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFilesRequest 请求对象
     * @return ListFilesResponse
     */
    public ListFilesResponse listFiles(ListFilesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.listFiles);
    }

    /**
     * 获取一个仓库下特定分支指定文件内容
     *
     * 获取一个仓库下特定分支指定文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFilesRequest 请求对象
     * @return SyncInvoker<ListFilesRequest, ListFilesResponse>
     */
    public SyncInvoker<ListFilesRequest, ListFilesResponse> listFilesInvoker(ListFilesRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.listFiles, hcClient);
    }

    /**
     * 获取变更文件
     *
     * 获取变更文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeChangesRequest 请求对象
     * @return ListMergeChangesResponse
     */
    public ListMergeChangesResponse listMergeChanges(ListMergeChangesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.listMergeChanges);
    }

    /**
     * 获取变更文件
     *
     * 获取变更文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeChangesRequest 请求对象
     * @return SyncInvoker<ListMergeChangesRequest, ListMergeChangesResponse>
     */
    public SyncInvoker<ListMergeChangesRequest, ListMergeChangesResponse> listMergeChangesInvoker(
        ListMergeChangesRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.listMergeChanges, hcClient);
    }

    /**
     * 获取变更文件列表
     *
     * 获取变更文件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeChangesTreesRequest 请求对象
     * @return ListMergeChangesTreesResponse
     */
    public ListMergeChangesTreesResponse listMergeChangesTrees(ListMergeChangesTreesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.listMergeChangesTrees);
    }

    /**
     * 获取变更文件列表
     *
     * 获取变更文件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeChangesTreesRequest 请求对象
     * @return SyncInvoker<ListMergeChangesTreesRequest, ListMergeChangesTreesResponse>
     */
    public SyncInvoker<ListMergeChangesTreesRequest, ListMergeChangesTreesResponse> listMergeChangesTreesInvoker(
        ListMergeChangesTreesRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.listMergeChangesTrees, hcClient);
    }

    /**
     * 获取仓库合并请求列表
     *
     * 获取仓库合并请求列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestRequest 请求对象
     * @return ListMergeRequestResponse
     */
    public ListMergeRequestResponse listMergeRequest(ListMergeRequestRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.listMergeRequest);
    }

    /**
     * 获取仓库合并请求列表
     *
     * 获取仓库合并请求列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestRequest 请求对象
     * @return SyncInvoker<ListMergeRequestRequest, ListMergeRequestResponse>
     */
    public SyncInvoker<ListMergeRequestRequest, ListMergeRequestResponse> listMergeRequestInvoker(
        ListMergeRequestRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.listMergeRequest, hcClient);
    }

    /**
     * 根据仓库短ID和合并请求短ID获取检视人信息
     *
     * 根据仓库短ID和合并请求短ID获取检视人信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestReviewersRequest 请求对象
     * @return ListMergeRequestReviewersResponse
     */
    public ListMergeRequestReviewersResponse listMergeRequestReviewers(ListMergeRequestReviewersRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.listMergeRequestReviewers);
    }

    /**
     * 根据仓库短ID和合并请求短ID获取检视人信息
     *
     * 根据仓库短ID和合并请求短ID获取检视人信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestReviewersRequest 请求对象
     * @return SyncInvoker<ListMergeRequestReviewersRequest, ListMergeRequestReviewersResponse>
     */
    public SyncInvoker<ListMergeRequestReviewersRequest, ListMergeRequestReviewersResponse> listMergeRequestReviewersInvoker(
        ListMergeRequestReviewersRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.listMergeRequestReviewers, hcClient);
    }

    /**
     * 获取关联工作项信息
     *
     * 获取关联工作项信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRelatedCommitsRequest 请求对象
     * @return ListRelatedCommitsResponse
     */
    public ListRelatedCommitsResponse listRelatedCommits(ListRelatedCommitsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.listRelatedCommits);
    }

    /**
     * 获取关联工作项信息
     *
     * 获取关联工作项信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRelatedCommitsRequest 请求对象
     * @return SyncInvoker<ListRelatedCommitsRequest, ListRelatedCommitsResponse>
     */
    public SyncInvoker<ListRelatedCommitsRequest, ListRelatedCommitsResponse> listRelatedCommitsInvoker(
        ListRelatedCommitsRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.listRelatedCommits, hcClient);
    }

    /**
     * 查看仓库的创建状态
     *
     * 获取仓库状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryStatusRequest 请求对象
     * @return ListRepositoryStatusResponse
     */
    public ListRepositoryStatusResponse listRepositoryStatus(ListRepositoryStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.listRepositoryStatus);
    }

    /**
     * 查看仓库的创建状态
     *
     * 获取仓库状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryStatusRequest 请求对象
     * @return SyncInvoker<ListRepositoryStatusRequest, ListRepositoryStatusResponse>
     */
    public SyncInvoker<ListRepositoryStatusRequest, ListRepositoryStatusResponse> listRepositoryStatusInvoker(
        ListRepositoryStatusRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.listRepositoryStatus, hcClient);
    }

    /**
     * 获取分支目录下的文件
     *
     * 获取分支目录下的文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubfilesRequest 请求对象
     * @return ListSubfilesResponse
     */
    public ListSubfilesResponse listSubfiles(ListSubfilesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.listSubfiles);
    }

    /**
     * 获取分支目录下的文件
     *
     * 获取分支目录下的文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubfilesRequest 请求对象
     * @return SyncInvoker<ListSubfilesRequest, ListSubfilesResponse>
     */
    public SyncInvoker<ListSubfilesRequest, ListSubfilesResponse> listSubfilesInvoker(ListSubfilesRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.listSubfiles, hcClient);
    }

    /**
     * 设置仓库是公开状态还是私有状态
     *
     * 设置仓库是公开状态还是私有状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesTwoRequest 请求对象
     * @return ListTemplatesTwoResponse
     */
    public ListTemplatesTwoResponse listTemplatesTwo(ListTemplatesTwoRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.listTemplatesTwo);
    }

    /**
     * 设置仓库是公开状态还是私有状态
     *
     * 设置仓库是公开状态还是私有状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesTwoRequest 请求对象
     * @return SyncInvoker<ListTemplatesTwoRequest, ListTemplatesTwoResponse>
     */
    public SyncInvoker<ListTemplatesTwoRequest, ListTemplatesTwoResponse> listTemplatesTwoInvoker(
        ListTemplatesTwoRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.listTemplatesTwo, hcClient);
    }

    /**
     * 获取公开示例模板列表
     *
     * 获取公开示例模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTwoTemplatesRequest 请求对象
     * @return ListTwoTemplatesResponse
     */
    public ListTwoTemplatesResponse listTwoTemplates(ListTwoTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.listTwoTemplates);
    }

    /**
     * 获取公开示例模板列表
     *
     * 获取公开示例模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTwoTemplatesRequest 请求对象
     * @return SyncInvoker<ListTwoTemplatesRequest, ListTwoTemplatesResponse>
     */
    public SyncInvoker<ListTwoTemplatesRequest, ListTwoTemplatesResponse> listTwoTemplatesInvoker(
        ListTwoTemplatesRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.listTwoTemplates, hcClient);
    }

    /**
     * 设置仓库是公开状态还是私有状态
     *
     * 设置仓库是公开状态还是私有状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShareTemplatesRequest 请求对象
     * @return ShareTemplatesResponse
     */
    @Deprecated
    public ShareTemplatesResponse shareTemplates(ShareTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.shareTemplates);
    }

    /**
     * 设置仓库是公开状态还是私有状态
     *
     * 设置仓库是公开状态还是私有状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShareTemplatesRequest 请求对象
     * @return SyncInvoker<ShareTemplatesRequest, ShareTemplatesResponse>
     */
    @Deprecated
    public SyncInvoker<ShareTemplatesRequest, ShareTemplatesResponse> shareTemplatesInvoker(
        ShareTemplatesRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.shareTemplates, hcClient);
    }

    /**
     * 查询某仓库对应的分支
     *
     * 根据仓库id获取指定仓库的分支列表.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBranchesByRepositoryIdRequest 请求对象
     * @return ShowBranchesByRepositoryIdResponse
     */
    public ShowBranchesByRepositoryIdResponse showBranchesByRepositoryId(ShowBranchesByRepositoryIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.showBranchesByRepositoryId);
    }

    /**
     * 查询某仓库对应的分支
     *
     * 根据仓库id获取指定仓库的分支列表.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBranchesByRepositoryIdRequest 请求对象
     * @return SyncInvoker<ShowBranchesByRepositoryIdRequest, ShowBranchesByRepositoryIdResponse>
     */
    public SyncInvoker<ShowBranchesByRepositoryIdRequest, ShowBranchesByRepositoryIdResponse> showBranchesByRepositoryIdInvoker(
        ShowBranchesByRepositoryIdRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.showBranchesByRepositoryId, hcClient);
    }

    /**
     * 查询某仓库的标签列表
     *
     * 查询指定仓库对应的分支。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBranchesByTwoRepositoryIdRequest 请求对象
     * @return ShowBranchesByTwoRepositoryIdResponse
     */
    public ShowBranchesByTwoRepositoryIdResponse showBranchesByTwoRepositoryId(
        ShowBranchesByTwoRepositoryIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.showBranchesByTwoRepositoryId);
    }

    /**
     * 查询某仓库的标签列表
     *
     * 查询指定仓库对应的分支。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBranchesByTwoRepositoryIdRequest 请求对象
     * @return SyncInvoker<ShowBranchesByTwoRepositoryIdRequest, ShowBranchesByTwoRepositoryIdResponse>
     */
    public SyncInvoker<ShowBranchesByTwoRepositoryIdRequest, ShowBranchesByTwoRepositoryIdResponse> showBranchesByTwoRepositoryIdInvoker(
        ShowBranchesByTwoRepositoryIdRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.showBranchesByTwoRepositoryId, hcClient);
    }

    /**
     * 根据组名和仓库名查询某仓库某分支对应的提交
     *
     * 根据仓库组名、仓库名和分支获取提交列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommitsByBranchRequest 请求对象
     * @return ShowCommitsByBranchResponse
     */
    public ShowCommitsByBranchResponse showCommitsByBranch(ShowCommitsByBranchRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.showCommitsByBranch);
    }

    /**
     * 根据组名和仓库名查询某仓库某分支对应的提交
     *
     * 根据仓库组名、仓库名和分支获取提交列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommitsByBranchRequest 请求对象
     * @return SyncInvoker<ShowCommitsByBranchRequest, ShowCommitsByBranchResponse>
     */
    public SyncInvoker<ShowCommitsByBranchRequest, ShowCommitsByBranchResponse> showCommitsByBranchInvoker(
        ShowCommitsByBranchRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.showCommitsByBranch, hcClient);
    }

    /**
     * 根据仓库id查询仓库某分支对应的提交，提供更多可选参数
     *
     * 根据仓库id查询仓库某分支对应的提交.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommitsByRepoIdRequest 请求对象
     * @return ShowCommitsByRepoIdResponse
     */
    public ShowCommitsByRepoIdResponse showCommitsByRepoId(ShowCommitsByRepoIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.showCommitsByRepoId);
    }

    /**
     * 根据仓库id查询仓库某分支对应的提交，提供更多可选参数
     *
     * 根据仓库id查询仓库某分支对应的提交.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommitsByRepoIdRequest 请求对象
     * @return SyncInvoker<ShowCommitsByRepoIdRequest, ShowCommitsByRepoIdResponse>
     */
    public SyncInvoker<ShowCommitsByRepoIdRequest, ShowCommitsByRepoIdResponse> showCommitsByRepoIdInvoker(
        ShowCommitsByRepoIdRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.showCommitsByRepoId, hcClient);
    }

    /**
     * 修改被流水线引用的仓库状态
     *
     * 修改被流水线引用的仓库状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHasPipelineRequest 请求对象
     * @return ShowHasPipelineResponse
     */
    public ShowHasPipelineResponse showHasPipeline(ShowHasPipelineRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.showHasPipeline);
    }

    /**
     * 修改被流水线引用的仓库状态
     *
     * 修改被流水线引用的仓库状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHasPipelineRequest 请求对象
     * @return SyncInvoker<ShowHasPipelineRequest, ShowHasPipelineResponse>
     */
    public SyncInvoker<ShowHasPipelineRequest, ShowHasPipelineResponse> showHasPipelineInvoker(
        ShowHasPipelineRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.showHasPipeline, hcClient);
    }

    /**
     * 获取一个仓库下特定分支的图片文件
     *
     * 获取一个仓库下特定分支的图片文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageBlobRequest 请求对象
     * @return ShowImageBlobResponse
     */
    public ShowImageBlobResponse showImageBlob(ShowImageBlobRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.showImageBlob);
    }

    /**
     * 获取一个仓库下特定分支的图片文件
     *
     * 获取一个仓库下特定分支的图片文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageBlobRequest 请求对象
     * @return SyncInvoker<ShowImageBlobRequest, ShowImageBlobResponse>
     */
    public SyncInvoker<ShowImageBlobRequest, ShowImageBlobResponse> showImageBlobInvoker(ShowImageBlobRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.showImageBlob, hcClient);
    }

    /**
     * 判断用户是否有仓库的管理员权限
     *
     * 判断用户是否有仓库的管理员权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMasterRequest 请求对象
     * @return ShowMasterResponse
     */
    public ShowMasterResponse showMaster(ShowMasterRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.showMaster);
    }

    /**
     * 判断用户是否有仓库的管理员权限
     *
     * 判断用户是否有仓库的管理员权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMasterRequest 请求对象
     * @return SyncInvoker<ShowMasterRequest, ShowMasterResponse>
     */
    public SyncInvoker<ShowMasterRequest, ShowMasterResponse> showMasterInvoker(ShowMasterRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.showMaster, hcClient);
    }

    /**
     * 获取仓库合并请求详情
     *
     * 获取仓库合并请求详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeRequestRequest 请求对象
     * @return ShowMergeRequestResponse
     */
    public ShowMergeRequestResponse showMergeRequest(ShowMergeRequestRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.showMergeRequest);
    }

    /**
     * 获取仓库合并请求详情
     *
     * 获取仓库合并请求详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeRequestRequest 请求对象
     * @return SyncInvoker<ShowMergeRequestRequest, ShowMergeRequestResponse>
     */
    public SyncInvoker<ShowMergeRequestRequest, ShowMergeRequestResponse> showMergeRequestInvoker(
        ShowMergeRequestRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.showMergeRequest, hcClient);
    }

    /**
     * 根据仓库名组名获取仓库短id，用以拼接与commitid对应提交详情页面url
     *
     * 获取仓库短id,用于获取仓库详情页面url
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepoIdRequest 请求对象
     * @return ShowRepoIdResponse
     */
    public ShowRepoIdResponse showRepoId(ShowRepoIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.showRepoId);
    }

    /**
     * 根据仓库名组名获取仓库短id，用以拼接与commitid对应提交详情页面url
     *
     * 获取仓库短id,用于获取仓库详情页面url
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepoIdRequest 请求对象
     * @return SyncInvoker<ShowRepoIdRequest, ShowRepoIdResponse>
     */
    public SyncInvoker<ShowRepoIdRequest, ShowRepoIdResponse> showRepoIdInvoker(ShowRepoIdRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.showRepoId, hcClient);
    }

    /**
     * 下载仓库
     *
     * 按照指定格式下载仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryArchiveRequest 请求对象
     * @return ShowRepositoryArchiveResponse
     */
    public ShowRepositoryArchiveResponse showRepositoryArchive(ShowRepositoryArchiveRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.showRepositoryArchive);
    }

    /**
     * 下载仓库
     *
     * 按照指定格式下载仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryArchiveRequest 请求对象
     * @return SyncInvoker<ShowRepositoryArchiveRequest, ShowRepositoryArchiveResponse>
     */
    public SyncInvoker<ShowRepositoryArchiveRequest, ShowRepositoryArchiveResponse> showRepositoryArchiveInvoker(
        ShowRepositoryArchiveRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.showRepositoryArchive, hcClient);
    }

    /**
     * 查询某个仓库的详细信息
     *
     * 根据仓库UUID(由CreateRepository接口返回)获取仓库信息仓库信息。返回 包含id，name，组名，仓库访问URL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryByUuidRequest 请求对象
     * @return ShowRepositoryByUuidResponse
     */
    public ShowRepositoryByUuidResponse showRepositoryByUuid(ShowRepositoryByUuidRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.showRepositoryByUuid);
    }

    /**
     * 查询某个仓库的详细信息
     *
     * 根据仓库UUID(由CreateRepository接口返回)获取仓库信息仓库信息。返回 包含id，name，组名，仓库访问URL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryByUuidRequest 请求对象
     * @return SyncInvoker<ShowRepositoryByUuidRequest, ShowRepositoryByUuidResponse>
     */
    public SyncInvoker<ShowRepositoryByUuidRequest, ShowRepositoryByUuidResponse> showRepositoryByUuidInvoker(
        ShowRepositoryByUuidRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.showRepositoryByUuid, hcClient);
    }

    /**
     * 仓库统计
     *
     * 根据仓库短id，查询仓库的代码提交记录统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryStatisticsRequest 请求对象
     * @return ShowRepositoryStatisticsResponse
     */
    public ShowRepositoryStatisticsResponse showRepositoryStatistics(ShowRepositoryStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.showRepositoryStatistics);
    }

    /**
     * 仓库统计
     *
     * 根据仓库短id，查询仓库的代码提交记录统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryStatisticsRequest 请求对象
     * @return SyncInvoker<ShowRepositoryStatisticsRequest, ShowRepositoryStatisticsResponse>
     */
    public SyncInvoker<ShowRepositoryStatisticsRequest, ShowRepositoryStatisticsResponse> showRepositoryStatisticsInvoker(
        ShowRepositoryStatisticsRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.showRepositoryStatistics, hcClient);
    }

    /**
     * 获取代码提交行数
     *
     * 获取指定日期内代码仓指定分支的代码提交行数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticCommitRequest 请求对象
     * @return ShowStatisticCommitResponse
     */
    @Deprecated
    public ShowStatisticCommitResponse showStatisticCommit(ShowStatisticCommitRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.showStatisticCommit);
    }

    /**
     * 获取代码提交行数
     *
     * 获取指定日期内代码仓指定分支的代码提交行数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticCommitRequest 请求对象
     * @return SyncInvoker<ShowStatisticCommitRequest, ShowStatisticCommitResponse>
     */
    @Deprecated
    public SyncInvoker<ShowStatisticCommitRequest, ShowStatisticCommitResponse> showStatisticCommitInvoker(
        ShowStatisticCommitRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.showStatisticCommit, hcClient);
    }

    /**
     * 获取代码提交行数
     *
     * 获取指定日期内代码仓指定分支的代码提交行数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticCommitV3Request 请求对象
     * @return ShowStatisticCommitV3Response
     */
    public ShowStatisticCommitV3Response showStatisticCommitV3(ShowStatisticCommitV3Request request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.showStatisticCommitV3);
    }

    /**
     * 获取代码提交行数
     *
     * 获取指定日期内代码仓指定分支的代码提交行数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticCommitV3Request 请求对象
     * @return SyncInvoker<ShowStatisticCommitV3Request, ShowStatisticCommitV3Response>
     */
    public SyncInvoker<ShowStatisticCommitV3Request, ShowStatisticCommitV3Response> showStatisticCommitV3Invoker(
        ShowStatisticCommitV3Request request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.showStatisticCommitV3, hcClient);
    }

    /**
     * 获取仓库统计数据
     *
     * 获取仓库统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticalDataRequest 请求对象
     * @return ShowStatisticalDataResponse
     */
    public ShowStatisticalDataResponse showStatisticalData(ShowStatisticalDataRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.showStatisticalData);
    }

    /**
     * 获取仓库统计数据
     *
     * 获取仓库统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticalDataRequest 请求对象
     * @return SyncInvoker<ShowStatisticalDataRequest, ShowStatisticalDataResponse>
     */
    public SyncInvoker<ShowStatisticalDataRequest, ShowStatisticalDataResponse> showStatisticalDataInvoker(
        ShowStatisticalDataRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.showStatisticalData, hcClient);
    }

    /**
     * 合并请求代码审核
     *
     * 合并请求代码审核
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestApprovalStateRequest 请求对象
     * @return UpdateMergeRequestApprovalStateResponse
     */
    public UpdateMergeRequestApprovalStateResponse updateMergeRequestApprovalState(
        UpdateMergeRequestApprovalStateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.updateMergeRequestApprovalState);
    }

    /**
     * 合并请求代码审核
     *
     * 合并请求代码审核
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestApprovalStateRequest 请求对象
     * @return SyncInvoker<UpdateMergeRequestApprovalStateRequest, UpdateMergeRequestApprovalStateResponse>
     */
    public SyncInvoker<UpdateMergeRequestApprovalStateRequest, UpdateMergeRequestApprovalStateResponse> updateMergeRequestApprovalStateInvoker(
        UpdateMergeRequestApprovalStateRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.updateMergeRequestApprovalState, hcClient);
    }

    /**
     * 添加ssh key
     *
     * 添加ssh key
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSshKeyRequest 请求对象
     * @return AddSshKeyResponse
     */
    public AddSshKeyResponse addSshKey(AddSshKeyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.addSshKey);
    }

    /**
     * 添加ssh key
     *
     * 添加ssh key
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSshKeyRequest 请求对象
     * @return SyncInvoker<AddSshKeyRequest, AddSshKeyResponse>
     */
    public SyncInvoker<AddSshKeyRequest, AddSshKeyResponse> addSshKeyInvoker(AddSshKeyRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.addSshKey, hcClient);
    }

    /**
     * 删除用户公钥
     *
     * 删除用户公钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSShkeyRequest 请求对象
     * @return DeleteSShkeyResponse
     */
    @Deprecated
    public DeleteSShkeyResponse deleteSShkey(DeleteSShkeyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.deleteSShkey);
    }

    /**
     * 删除用户公钥
     *
     * 删除用户公钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSShkeyRequest 请求对象
     * @return SyncInvoker<DeleteSShkeyRequest, DeleteSShkeyResponse>
     */
    @Deprecated
    public SyncInvoker<DeleteSShkeyRequest, DeleteSShkeyResponse> deleteSShkeyInvoker(DeleteSShkeyRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.deleteSShkey, hcClient);
    }

    /**
     * 获取ssh key列表
     *
     * 获取ssh key列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSshKeysRequest 请求对象
     * @return ListSshKeysResponse
     */
    public ListSshKeysResponse listSshKeys(ListSshKeysRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.listSshKeys);
    }

    /**
     * 获取ssh key列表
     *
     * 获取ssh key列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSshKeysRequest 请求对象
     * @return SyncInvoker<ListSshKeysRequest, ListSshKeysResponse>
     */
    public SyncInvoker<ListSshKeysRequest, ListSshKeysResponse> listSshKeysInvoker(ListSshKeysRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.listSshKeys, hcClient);
    }

    /**
     * 检验私钥是否有拉取代码的权限
     *
     * 检验私钥是否有拉取代码的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPrivateKeyVerifyRequest 请求对象
     * @return ShowPrivateKeyVerifyResponse
     */
    public ShowPrivateKeyVerifyResponse showPrivateKeyVerify(ShowPrivateKeyVerifyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.showPrivateKeyVerify);
    }

    /**
     * 检验私钥是否有拉取代码的权限
     *
     * 检验私钥是否有拉取代码的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPrivateKeyVerifyRequest 请求对象
     * @return SyncInvoker<ShowPrivateKeyVerifyRequest, ShowPrivateKeyVerifyResponse>
     */
    public SyncInvoker<ShowPrivateKeyVerifyRequest, ShowPrivateKeyVerifyResponse> showPrivateKeyVerifyInvoker(
        ShowPrivateKeyVerifyRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.showPrivateKeyVerify, hcClient);
    }

    /**
     *  https账号密码校验
     *
     * 判断用户使用 https 上传/下载代码时输入的用户名和密码是否合法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateHttpsInfoRequest 请求对象
     * @return ValidateHttpsInfoResponse
     */
    @Deprecated
    public ValidateHttpsInfoResponse validateHttpsInfo(ValidateHttpsInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.validateHttpsInfo);
    }

    /**
     *  https账号密码校验
     *
     * 判断用户使用 https 上传/下载代码时输入的用户名和密码是否合法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateHttpsInfoRequest 请求对象
     * @return SyncInvoker<ValidateHttpsInfoRequest, ValidateHttpsInfoResponse>
     */
    @Deprecated
    public SyncInvoker<ValidateHttpsInfoRequest, ValidateHttpsInfoResponse> validateHttpsInfoInvoker(
        ValidateHttpsInfoRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.validateHttpsInfo, hcClient);
    }

    /**
     * https账号密码校验
     *
     * 判断用户使用 https 上传/下载代码时输入的用户名和密码是否合法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateHttpsInfoV2Request 请求对象
     * @return ValidateHttpsInfoV2Response
     */
    public ValidateHttpsInfoV2Response validateHttpsInfoV2(ValidateHttpsInfoV2Request request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.validateHttpsInfoV2);
    }

    /**
     * https账号密码校验
     *
     * 判断用户使用 https 上传/下载代码时输入的用户名和密码是否合法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateHttpsInfoV2Request 请求对象
     * @return SyncInvoker<ValidateHttpsInfoV2Request, ValidateHttpsInfoV2Response>
     */
    public SyncInvoker<ValidateHttpsInfoV2Request, ValidateHttpsInfoV2Response> validateHttpsInfoV2Invoker(
        ValidateHttpsInfoV2Request request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.validateHttpsInfoV2, hcClient);
    }

    /**
     * 创建分支
     *
     * 根据仓库id在指定仓库中创建分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNewBranchRequest 请求对象
     * @return CreateNewBranchResponse
     */
    public CreateNewBranchResponse createNewBranch(CreateNewBranchRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.createNewBranch);
    }

    /**
     * 创建分支
     *
     * 根据仓库id在指定仓库中创建分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNewBranchRequest 请求对象
     * @return SyncInvoker<CreateNewBranchRequest, CreateNewBranchResponse>
     */
    public SyncInvoker<CreateNewBranchRequest, CreateNewBranchResponse> createNewBranchInvoker(
        CreateNewBranchRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.createNewBranch, hcClient);
    }

    /**
     * 分支关联工作项
     *
     * 分支关联工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateIssuesRequest 请求对象
     * @return AssociateIssuesResponse
     */
    public AssociateIssuesResponse associateIssues(AssociateIssuesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.associateIssues);
    }

    /**
     * 分支关联工作项
     *
     * 分支关联工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateIssuesRequest 请求对象
     * @return SyncInvoker<AssociateIssuesRequest, AssociateIssuesResponse>
     */
    public SyncInvoker<AssociateIssuesRequest, AssociateIssuesResponse> associateIssuesInvoker(
        AssociateIssuesRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.associateIssues, hcClient);
    }

    /**
     * 创建项目、仓库
     *
     * 创建项目后，创建仓库组由后台生成方式 传入参数：仓库名、模板id、是否导入项目成员、归属项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectAndRepositoriesRequest 请求对象
     * @return CreateProjectAndRepositoriesResponse
     */
    public CreateProjectAndRepositoriesResponse createProjectAndRepositories(
        CreateProjectAndRepositoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.createProjectAndRepositories);
    }

    /**
     * 创建项目、仓库
     *
     * 创建项目后，创建仓库组由后台生成方式 传入参数：仓库名、模板id、是否导入项目成员、归属项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectAndRepositoriesRequest 请求对象
     * @return SyncInvoker<CreateProjectAndRepositoriesRequest, CreateProjectAndRepositoriesResponse>
     */
    public SyncInvoker<CreateProjectAndRepositoriesRequest, CreateProjectAndRepositoriesResponse> createProjectAndRepositoriesInvoker(
        CreateProjectAndRepositoriesRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.createProjectAndRepositories, hcClient);
    }

    /**
     * 创建项目并fork仓库
     *
     * 创建仓库后fork仓库 传入参数：仓库名、是否导入项目成员、归属项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectAndforkRepositoriesRequest 请求对象
     * @return CreateProjectAndforkRepositoriesResponse
     */
    public CreateProjectAndforkRepositoriesResponse createProjectAndforkRepositories(
        CreateProjectAndforkRepositoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.createProjectAndforkRepositories);
    }

    /**
     * 创建项目并fork仓库
     *
     * 创建仓库后fork仓库 传入参数：仓库名、是否导入项目成员、归属项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectAndforkRepositoriesRequest 请求对象
     * @return SyncInvoker<CreateProjectAndforkRepositoriesRequest, CreateProjectAndforkRepositoriesResponse>
     */
    public SyncInvoker<CreateProjectAndforkRepositoriesRequest, CreateProjectAndforkRepositoriesResponse> createProjectAndforkRepositoriesInvoker(
        CreateProjectAndforkRepositoriesRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.createProjectAndforkRepositories, hcClient);
    }

    /**
     * 查询用户的所有仓库
     *
     * 获取用户的所有仓库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserAllRepositoriesRequest 请求对象
     * @return ListUserAllRepositoriesResponse
     */
    public ListUserAllRepositoriesResponse listUserAllRepositories(ListUserAllRepositoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.listUserAllRepositories);
    }

    /**
     * 查询用户的所有仓库
     *
     * 获取用户的所有仓库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserAllRepositoriesRequest 请求对象
     * @return SyncInvoker<ListUserAllRepositoriesRequest, ListUserAllRepositoriesResponse>
     */
    public SyncInvoker<ListUserAllRepositoriesRequest, ListUserAllRepositoriesResponse> listUserAllRepositoriesInvoker(
        ListUserAllRepositoriesRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.listUserAllRepositories, hcClient);
    }

    /**
     * 查询项目下的所有仓库
     *
     * 获取仓库列表,模糊查询支持范围,如果未传入project uuid，则支持按仓库名或项目名模糊查询，否则，只按仓库名模糊匹配
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllRepositoryByTwoProjectIdRequest 请求对象
     * @return ShowAllRepositoryByTwoProjectIdResponse
     */
    public ShowAllRepositoryByTwoProjectIdResponse showAllRepositoryByTwoProjectId(
        ShowAllRepositoryByTwoProjectIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.showAllRepositoryByTwoProjectId);
    }

    /**
     * 查询项目下的所有仓库
     *
     * 获取仓库列表,模糊查询支持范围,如果未传入project uuid，则支持按仓库名或项目名模糊查询，否则，只按仓库名模糊匹配
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllRepositoryByTwoProjectIdRequest 请求对象
     * @return SyncInvoker<ShowAllRepositoryByTwoProjectIdRequest, ShowAllRepositoryByTwoProjectIdResponse>
     */
    public SyncInvoker<ShowAllRepositoryByTwoProjectIdRequest, ShowAllRepositoryByTwoProjectIdResponse> showAllRepositoryByTwoProjectIdInvoker(
        ShowAllRepositoryByTwoProjectIdRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.showAllRepositoryByTwoProjectId, hcClient);
    }

    /**
     * 为指定仓库添加hook
     *
     * 提交代码自动触发编译构建，添加仓库钩子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddHooksRequest 请求对象
     * @return AddHooksResponse
     */
    public AddHooksResponse addHooks(AddHooksRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.addHooks);
    }

    /**
     * 为指定仓库添加hook
     *
     * 提交代码自动触发编译构建，添加仓库钩子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddHooksRequest 请求对象
     * @return SyncInvoker<AddHooksRequest, AddHooksResponse>
     */
    public SyncInvoker<AddHooksRequest, AddHooksResponse> addHooksInvoker(AddHooksRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.addHooks, hcClient);
    }

    /**
     * 删除指定仓库的 hook
     *
     * 提交代码自动触发编译构建，删除仓库钩子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHooksRequest 请求对象
     * @return DeleteHooksResponse
     */
    public DeleteHooksResponse deleteHooks(DeleteHooksRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.deleteHooks);
    }

    /**
     * 删除指定仓库的 hook
     *
     * 提交代码自动触发编译构建，删除仓库钩子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHooksRequest 请求对象
     * @return SyncInvoker<DeleteHooksRequest, DeleteHooksResponse>
     */
    public SyncInvoker<DeleteHooksRequest, DeleteHooksResponse> deleteHooksInvoker(DeleteHooksRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.deleteHooks, hcClient);
    }

    /**
     * 查询指定仓库的webhook
     *
     * 获取仓库webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHooksRequest 请求对象
     * @return ListHooksResponse
     */
    public ListHooksResponse listHooks(ListHooksRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsRepoMeta.listHooks);
    }

    /**
     * 查询指定仓库的webhook
     *
     * 获取仓库webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHooksRequest 请求对象
     * @return SyncInvoker<ListHooksRequest, ListHooksResponse>
     */
    public SyncInvoker<ListHooksRequest, ListHooksResponse> listHooksInvoker(ListHooksRequest request) {
        return new SyncInvoker<>(request, CodeArtsRepoMeta.listHooks, hcClient);
    }

}
