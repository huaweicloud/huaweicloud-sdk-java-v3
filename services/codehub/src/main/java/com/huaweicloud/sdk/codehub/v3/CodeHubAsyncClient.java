package com.huaweicloud.sdk.codehub.v3;

import com.huaweicloud.sdk.codehub.v3.model.AddDeployKeyRequest;
import com.huaweicloud.sdk.codehub.v3.model.AddDeployKeyResponse;
import com.huaweicloud.sdk.codehub.v3.model.AddDeployKeyV2Request;
import com.huaweicloud.sdk.codehub.v3.model.AddDeployKeyV2Response;
import com.huaweicloud.sdk.codehub.v3.model.AddHooksRequest;
import com.huaweicloud.sdk.codehub.v3.model.AddHooksResponse;
import com.huaweicloud.sdk.codehub.v3.model.AddProtectBranchV2Request;
import com.huaweicloud.sdk.codehub.v3.model.AddProtectBranchV2Response;
import com.huaweicloud.sdk.codehub.v3.model.AddRepoMembersRequest;
import com.huaweicloud.sdk.codehub.v3.model.AddRepoMembersResponse;
import com.huaweicloud.sdk.codehub.v3.model.AddSshKeyRequest;
import com.huaweicloud.sdk.codehub.v3.model.AddSshKeyResponse;
import com.huaweicloud.sdk.codehub.v3.model.AddTagV2Request;
import com.huaweicloud.sdk.codehub.v3.model.AddTagV2Response;
import com.huaweicloud.sdk.codehub.v3.model.AssociateIssuesRequest;
import com.huaweicloud.sdk.codehub.v3.model.AssociateIssuesResponse;
import com.huaweicloud.sdk.codehub.v3.model.CreateCommitRequest;
import com.huaweicloud.sdk.codehub.v3.model.CreateCommitResponse;
import com.huaweicloud.sdk.codehub.v3.model.CreateMergeRequestDiscussionNoteRequest;
import com.huaweicloud.sdk.codehub.v3.model.CreateMergeRequestDiscussionNoteResponse;
import com.huaweicloud.sdk.codehub.v3.model.CreateMergeRequestDiscussionRequest;
import com.huaweicloud.sdk.codehub.v3.model.CreateMergeRequestDiscussionResponse;
import com.huaweicloud.sdk.codehub.v3.model.CreateNewBranchRequest;
import com.huaweicloud.sdk.codehub.v3.model.CreateNewBranchResponse;
import com.huaweicloud.sdk.codehub.v3.model.CreateProjectAndRepositoriesRequest;
import com.huaweicloud.sdk.codehub.v3.model.CreateProjectAndRepositoriesResponse;
import com.huaweicloud.sdk.codehub.v3.model.CreateProjectAndforkRepositoriesRequest;
import com.huaweicloud.sdk.codehub.v3.model.CreateProjectAndforkRepositoriesResponse;
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
import com.huaweicloud.sdk.codehub.v3.model.ListMergeRequestRequest;
import com.huaweicloud.sdk.codehub.v3.model.ListMergeRequestResponse;
import com.huaweicloud.sdk.codehub.v3.model.ListProductTwoTemplatesRequest;
import com.huaweicloud.sdk.codehub.v3.model.ListProductTwoTemplatesResponse;
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
import com.huaweicloud.sdk.codehub.v3.model.SetRepoRoleRequest;
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
import com.huaweicloud.sdk.codehub.v3.model.ValidateHttpsInfoRequest;
import com.huaweicloud.sdk.codehub.v3.model.ValidateHttpsInfoResponse;
import com.huaweicloud.sdk.codehub.v3.model.ValidateHttpsInfoV2Request;
import com.huaweicloud.sdk.codehub.v3.model.ValidateHttpsInfoV2Response;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CodeHubAsyncClient {

    protected HcClient hcClient;

    public CodeHubAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeHubAsyncClient> newBuilder() {
        ClientBuilder<CodeHubAsyncClient> clientBuilder = new ClientBuilder<>(CodeHubAsyncClient::new);
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
     * @return CompletableFuture<CreateCommitResponse>
     */
    public CompletableFuture<CreateCommitResponse> createCommitAsync(CreateCommitRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.createCommit);
    }

    /**
     * 创建提交
     *
     * 能够一次提交位于不同目录的多个文件，目录不存在时，能自动创建目录。支持强制覆盖选项，当选择强制覆盖标志为true时，忽略冲突，强制提交。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCommitRequest 请求对象
     * @return AsyncInvoker<CreateCommitRequest, CreateCommitResponse>
     */
    public AsyncInvoker<CreateCommitRequest, CreateCommitResponse> createCommitAsyncInvoker(
        CreateCommitRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.createCommit, hcClient);
    }

    /**
     * 查询某个仓库的提交信息
     *
     * 根据仓库短ID获取提交信息，支持根据文件路径，查询这个路径下所有的commits列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommitsRequest 请求对象
     * @return CompletableFuture<ListCommitsResponse>
     */
    public CompletableFuture<ListCommitsResponse> listCommitsAsync(ListCommitsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.listCommits);
    }

    /**
     * 查询某个仓库的提交信息
     *
     * 根据仓库短ID获取提交信息，支持根据文件路径，查询这个路径下所有的commits列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommitsRequest 请求对象
     * @return AsyncInvoker<ListCommitsRequest, ListCommitsResponse>
     */
    public AsyncInvoker<ListCommitsRequest, ListCommitsResponse> listCommitsAsyncInvoker(ListCommitsRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.listCommits, hcClient);
    }

    /**
     * 查询某个仓库的提交差异信息
     *
     * 根据commit id查询提交差异信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiffCommitRequest 请求对象
     * @return CompletableFuture<ShowDiffCommitResponse>
     */
    public CompletableFuture<ShowDiffCommitResponse> showDiffCommitAsync(ShowDiffCommitRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.showDiffCommit);
    }

    /**
     * 查询某个仓库的提交差异信息
     *
     * 根据commit id查询提交差异信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiffCommitRequest 请求对象
     * @return AsyncInvoker<ShowDiffCommitRequest, ShowDiffCommitResponse>
     */
    public AsyncInvoker<ShowDiffCommitRequest, ShowDiffCommitResponse> showDiffCommitAsyncInvoker(
        ShowDiffCommitRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.showDiffCommit, hcClient);
    }

    /**
     * 查询某个仓库的特定提交信息
     *
     * 获取由commit id或分支或标记的名称标识的特定提交。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSingleCommitRequest 请求对象
     * @return CompletableFuture<ShowSingleCommitResponse>
     */
    public CompletableFuture<ShowSingleCommitResponse> showSingleCommitAsync(ShowSingleCommitRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.showSingleCommit);
    }

    /**
     * 查询某个仓库的特定提交信息
     *
     * 获取由commit id或分支或标记的名称标识的特定提交。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSingleCommitRequest 请求对象
     * @return AsyncInvoker<ShowSingleCommitRequest, ShowSingleCommitResponse>
     */
    public AsyncInvoker<ShowSingleCommitRequest, ShowSingleCommitResponse> showSingleCommitAsyncInvoker(
        ShowSingleCommitRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.showSingleCommit, hcClient);
    }

    /**
     * 创建MR检视意见
     *
     * 创建MR检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeRequestDiscussionRequest 请求对象
     * @return CompletableFuture<CreateMergeRequestDiscussionResponse>
     */
    public CompletableFuture<CreateMergeRequestDiscussionResponse> createMergeRequestDiscussionAsync(
        CreateMergeRequestDiscussionRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.createMergeRequestDiscussion);
    }

    /**
     * 创建MR检视意见
     *
     * 创建MR检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeRequestDiscussionRequest 请求对象
     * @return AsyncInvoker<CreateMergeRequestDiscussionRequest, CreateMergeRequestDiscussionResponse>
     */
    public AsyncInvoker<CreateMergeRequestDiscussionRequest, CreateMergeRequestDiscussionResponse> createMergeRequestDiscussionAsyncInvoker(
        CreateMergeRequestDiscussionRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.createMergeRequestDiscussion, hcClient);
    }

    /**
     * 回复MR检视意见
     *
     * 回复MR检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeRequestDiscussionNoteRequest 请求对象
     * @return CompletableFuture<CreateMergeRequestDiscussionNoteResponse>
     */
    public CompletableFuture<CreateMergeRequestDiscussionNoteResponse> createMergeRequestDiscussionNoteAsync(
        CreateMergeRequestDiscussionNoteRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.createMergeRequestDiscussionNote);
    }

    /**
     * 回复MR检视意见
     *
     * 回复MR检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeRequestDiscussionNoteRequest 请求对象
     * @return AsyncInvoker<CreateMergeRequestDiscussionNoteRequest, CreateMergeRequestDiscussionNoteResponse>
     */
    public AsyncInvoker<CreateMergeRequestDiscussionNoteRequest, CreateMergeRequestDiscussionNoteResponse> createMergeRequestDiscussionNoteAsyncInvoker(
        CreateMergeRequestDiscussionNoteRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.createMergeRequestDiscussionNote, hcClient);
    }

    /**
     * 获取检视意见设置
     *
     * 获取检视意见设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReviewSettingRequest 请求对象
     * @return CompletableFuture<ShowReviewSettingResponse>
     */
    public CompletableFuture<ShowReviewSettingResponse> showReviewSettingAsync(ShowReviewSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.showReviewSetting);
    }

    /**
     * 获取检视意见设置
     *
     * 获取检视意见设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReviewSettingRequest 请求对象
     * @return AsyncInvoker<ShowReviewSettingRequest, ShowReviewSettingResponse>
     */
    public AsyncInvoker<ShowReviewSettingRequest, ShowReviewSettingResponse> showReviewSettingAsyncInvoker(
        ShowReviewSettingRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.showReviewSetting, hcClient);
    }

    /**
     * 查询某个仓库的文件信息
     *
     * 获取仓库中文件的信息，如名称、大小、内容。请注意，文件内容是Base64编码的。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFilesByQueryRequest 请求对象
     * @return CompletableFuture<ListFilesByQueryResponse>
     */
    public CompletableFuture<ListFilesByQueryResponse> listFilesByQueryAsync(ListFilesByQueryRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.listFilesByQuery);
    }

    /**
     * 查询某个仓库的文件信息
     *
     * 获取仓库中文件的信息，如名称、大小、内容。请注意，文件内容是Base64编码的。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFilesByQueryRequest 请求对象
     * @return AsyncInvoker<ListFilesByQueryRequest, ListFilesByQueryResponse>
     */
    public AsyncInvoker<ListFilesByQueryRequest, ListFilesByQueryResponse> listFilesByQueryAsyncInvoker(
        ListFilesByQueryRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.listFilesByQuery, hcClient);
    }

    /**
     * 查询某个仓库的文件信息
     *
     * 获取仓库中文件的信息，如名称、大小、内容。请注意，文件内容是Base64编码的。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileRequest 请求对象
     * @return CompletableFuture<ShowFileResponse>
     */
    @Deprecated
    public CompletableFuture<ShowFileResponse> showFileAsync(ShowFileRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.showFile);
    }

    /**
     * 查询某个仓库的文件信息
     *
     * 获取仓库中文件的信息，如名称、大小、内容。请注意，文件内容是Base64编码的。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileRequest 请求对象
     * @return AsyncInvoker<ShowFileRequest, ShowFileResponse>
     */
    @Deprecated
    public AsyncInvoker<ShowFileRequest, ShowFileResponse> showFileAsyncInvoker(ShowFileRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.showFile, hcClient);
    }

    /**
     * 获取项目下所有仓库信息
     *
     * 获取仓库列表 模糊查询支持范围,如果未传入project_id，则支持按仓库名或项目名模糊查询，否则，只按仓库名模糊匹配。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetAllRepositoryByProjectIdRequest 请求对象
     * @return CompletableFuture<GetAllRepositoryByProjectIdResponse>
     */
    @Deprecated
    public CompletableFuture<GetAllRepositoryByProjectIdResponse> getAllRepositoryByProjectIdAsync(
        GetAllRepositoryByProjectIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.getAllRepositoryByProjectId);
    }

    /**
     * 获取项目下所有仓库信息
     *
     * 获取仓库列表 模糊查询支持范围,如果未传入project_id，则支持按仓库名或项目名模糊查询，否则，只按仓库名模糊匹配。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetAllRepositoryByProjectIdRequest 请求对象
     * @return AsyncInvoker<GetAllRepositoryByProjectIdRequest, GetAllRepositoryByProjectIdResponse>
     */
    @Deprecated
    public AsyncInvoker<GetAllRepositoryByProjectIdRequest, GetAllRepositoryByProjectIdResponse> getAllRepositoryByProjectIdAsyncInvoker(
        GetAllRepositoryByProjectIdRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.getAllRepositoryByProjectId, hcClient);
    }

    /**
     * 获取一个项目下可以设置为公开状态的仓库列表
     *
     * 获取一个项目下可以设置为公开状态的仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetProductTemplatesRequest 请求对象
     * @return CompletableFuture<GetProductTemplatesResponse>
     */
    @Deprecated
    public CompletableFuture<GetProductTemplatesResponse> getProductTemplatesAsync(GetProductTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.getProductTemplates);
    }

    /**
     * 获取一个项目下可以设置为公开状态的仓库列表
     *
     * 获取一个项目下可以设置为公开状态的仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetProductTemplatesRequest 请求对象
     * @return AsyncInvoker<GetProductTemplatesRequest, GetProductTemplatesResponse>
     */
    @Deprecated
    public AsyncInvoker<GetProductTemplatesRequest, GetProductTemplatesResponse> getProductTemplatesAsyncInvoker(
        GetProductTemplatesRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.getProductTemplates, hcClient);
    }

    /**
     * 获取一个项目下可以设置为公开状态的仓库列表
     *
     * 获取一个项目下可以设置为公开状态的仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductTwoTemplatesRequest 请求对象
     * @return CompletableFuture<ListProductTwoTemplatesResponse>
     */
    public CompletableFuture<ListProductTwoTemplatesResponse> listProductTwoTemplatesAsync(
        ListProductTwoTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.listProductTwoTemplates);
    }

    /**
     * 获取一个项目下可以设置为公开状态的仓库列表
     *
     * 获取一个项目下可以设置为公开状态的仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductTwoTemplatesRequest 请求对象
     * @return AsyncInvoker<ListProductTwoTemplatesRequest, ListProductTwoTemplatesResponse>
     */
    public AsyncInvoker<ListProductTwoTemplatesRequest, ListProductTwoTemplatesResponse> listProductTwoTemplatesAsyncInvoker(
        ListProductTwoTemplatesRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.listProductTwoTemplates, hcClient);
    }

    /**
     * 校验指定项目下的仓库名
     *
     * 一般创建仓库时调用。通过传入项目ID，获取方式请参见[获取项目ID](codehub_api_0014.xml)。,仓库名，来判断仓库是否重名。仓库存在result:false,仓库不存在result:true。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryNameExistRequest 请求对象
     * @return CompletableFuture<ShowRepositoryNameExistResponse>
     */
    public CompletableFuture<ShowRepositoryNameExistResponse> showRepositoryNameExistAsync(
        ShowRepositoryNameExistRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.showRepositoryNameExist);
    }

    /**
     * 校验指定项目下的仓库名
     *
     * 一般创建仓库时调用。通过传入项目ID，获取方式请参见[获取项目ID](codehub_api_0014.xml)。,仓库名，来判断仓库是否重名。仓库存在result:false,仓库不存在result:true。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryNameExistRequest 请求对象
     * @return AsyncInvoker<ShowRepositoryNameExistRequest, ShowRepositoryNameExistResponse>
     */
    public AsyncInvoker<ShowRepositoryNameExistRequest, ShowRepositoryNameExistResponse> showRepositoryNameExistAsyncInvoker(
        ShowRepositoryNameExistRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.showRepositoryNameExist, hcClient);
    }

    /**
     * 添加仓库成员
     *
     * 添加仓库成员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRepoMembersRequest 请求对象
     * @return CompletableFuture<AddRepoMembersResponse>
     */
    public CompletableFuture<AddRepoMembersResponse> addRepoMembersAsync(AddRepoMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.addRepoMembers);
    }

    /**
     * 添加仓库成员
     *
     * 添加仓库成员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRepoMembersRequest 请求对象
     * @return AsyncInvoker<AddRepoMembersRequest, AddRepoMembersResponse>
     */
    public AsyncInvoker<AddRepoMembersRequest, AddRepoMembersResponse> addRepoMembersAsyncInvoker(
        AddRepoMembersRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.addRepoMembers, hcClient);
    }

    /**
     * 删除仓库成员
     *
     * 删除仓库成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepoMemberRequest 请求对象
     * @return CompletableFuture<DeleteRepoMemberResponse>
     */
    public CompletableFuture<DeleteRepoMemberResponse> deleteRepoMemberAsync(DeleteRepoMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.deleteRepoMember);
    }

    /**
     * 删除仓库成员
     *
     * 删除仓库成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepoMemberRequest 请求对象
     * @return AsyncInvoker<DeleteRepoMemberRequest, DeleteRepoMemberResponse>
     */
    public AsyncInvoker<DeleteRepoMemberRequest, DeleteRepoMemberResponse> deleteRepoMemberAsyncInvoker(
        DeleteRepoMemberRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.deleteRepoMember, hcClient);
    }

    /**
     * 获取仓库所有成员记录
     *
     * 获取仓库成员列表,可通过关键字搜索某成员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepoMembersRequest 请求对象
     * @return CompletableFuture<ListRepoMembersResponse>
     */
    public CompletableFuture<ListRepoMembersResponse> listRepoMembersAsync(ListRepoMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.listRepoMembers);
    }

    /**
     * 获取仓库所有成员记录
     *
     * 获取仓库成员列表,可通过关键字搜索某成员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepoMembersRequest 请求对象
     * @return AsyncInvoker<ListRepoMembersRequest, ListRepoMembersResponse>
     */
    public AsyncInvoker<ListRepoMembersRequest, ListRepoMembersResponse> listRepoMembersAsyncInvoker(
        ListRepoMembersRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.listRepoMembers, hcClient);
    }

    /**
     * 设置成员在仓库中的角色
     *
     * 给仓库中成员设置仓库的操作权限，
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRepoRoleRequest 请求对象
     * @return CompletableFuture<SetRepoRoleResponse>
     */
    public CompletableFuture<SetRepoRoleResponse> setRepoRoleAsync(SetRepoRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.setRepoRole);
    }

    /**
     * 设置成员在仓库中的角色
     *
     * 给仓库中成员设置仓库的操作权限，
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRepoRoleRequest 请求对象
     * @return AsyncInvoker<SetRepoRoleRequest, SetRepoRoleResponse>
     */
    public AsyncInvoker<SetRepoRoleRequest, SetRepoRoleResponse> setRepoRoleAsyncInvoker(SetRepoRoleRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.setRepoRole, hcClient);
    }

    /**
     * 添加部署密钥
     *
     * 添加部署密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDeployKeyRequest 请求对象
     * @return CompletableFuture<AddDeployKeyResponse>
     */
    @Deprecated
    public CompletableFuture<AddDeployKeyResponse> addDeployKeyAsync(AddDeployKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.addDeployKey);
    }

    /**
     * 添加部署密钥
     *
     * 添加部署密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDeployKeyRequest 请求对象
     * @return AsyncInvoker<AddDeployKeyRequest, AddDeployKeyResponse>
     */
    @Deprecated
    public AsyncInvoker<AddDeployKeyRequest, AddDeployKeyResponse> addDeployKeyAsyncInvoker(
        AddDeployKeyRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.addDeployKey, hcClient);
    }

    /**
     * 添加部署密钥
     *
     * 添加部署密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDeployKeyV2Request 请求对象
     * @return CompletableFuture<AddDeployKeyV2Response>
     */
    public CompletableFuture<AddDeployKeyV2Response> addDeployKeyV2Async(AddDeployKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.addDeployKeyV2);
    }

    /**
     * 添加部署密钥
     *
     * 添加部署密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDeployKeyV2Request 请求对象
     * @return AsyncInvoker<AddDeployKeyV2Request, AddDeployKeyV2Response>
     */
    public AsyncInvoker<AddDeployKeyV2Request, AddDeployKeyV2Response> addDeployKeyV2AsyncInvoker(
        AddDeployKeyV2Request request) {
        return new AsyncInvoker<>(request, CodeHubMeta.addDeployKeyV2, hcClient);
    }

    /**
     * 新建保护分支
     *
     * 新建保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddProtectBranchV2Request 请求对象
     * @return CompletableFuture<AddProtectBranchV2Response>
     */
    public CompletableFuture<AddProtectBranchV2Response> addProtectBranchV2Async(AddProtectBranchV2Request request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.addProtectBranchV2);
    }

    /**
     * 新建保护分支
     *
     * 新建保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddProtectBranchV2Request 请求对象
     * @return AsyncInvoker<AddProtectBranchV2Request, AddProtectBranchV2Response>
     */
    public AsyncInvoker<AddProtectBranchV2Request, AddProtectBranchV2Response> addProtectBranchV2AsyncInvoker(
        AddProtectBranchV2Request request) {
        return new AsyncInvoker<>(request, CodeHubMeta.addProtectBranchV2, hcClient);
    }

    /**
     * 新建标签
     *
     * 新建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTagV2Request 请求对象
     * @return CompletableFuture<AddTagV2Response>
     */
    public CompletableFuture<AddTagV2Response> addTagV2Async(AddTagV2Request request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.addTagV2);
    }

    /**
     * 新建标签
     *
     * 新建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTagV2Request 请求对象
     * @return AsyncInvoker<AddTagV2Request, AddTagV2Response>
     */
    public AsyncInvoker<AddTagV2Request, AddTagV2Response> addTagV2AsyncInvoker(AddTagV2Request request) {
        return new AsyncInvoker<>(request, CodeHubMeta.addTagV2, hcClient);
    }

    /**
     * 创建仓库
     *
     * 用指定的名称在指定项目上创建仓库。传入参数：仓库名、模板id、是否导入项目成员、归属项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepositoryRequest 请求对象
     * @return CompletableFuture<CreateRepositoryResponse>
     */
    public CompletableFuture<CreateRepositoryResponse> createRepositoryAsync(CreateRepositoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.createRepository);
    }

    /**
     * 创建仓库
     *
     * 用指定的名称在指定项目上创建仓库。传入参数：仓库名、模板id、是否导入项目成员、归属项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepositoryRequest 请求对象
     * @return AsyncInvoker<CreateRepositoryRequest, CreateRepositoryResponse>
     */
    public AsyncInvoker<CreateRepositoryRequest, CreateRepositoryResponse> createRepositoryAsyncInvoker(
        CreateRepositoryRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.createRepository, hcClient);
    }

    /**
     * 删除仓库部署密钥
     *
     * 删除仓库部署密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeployKeyRequest 请求对象
     * @return CompletableFuture<DeleteDeployKeyResponse>
     */
    @Deprecated
    public CompletableFuture<DeleteDeployKeyResponse> deleteDeployKeyAsync(DeleteDeployKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.deleteDeployKey);
    }

    /**
     * 删除仓库部署密钥
     *
     * 删除仓库部署密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeployKeyRequest 请求对象
     * @return AsyncInvoker<DeleteDeployKeyRequest, DeleteDeployKeyResponse>
     */
    @Deprecated
    public AsyncInvoker<DeleteDeployKeyRequest, DeleteDeployKeyResponse> deleteDeployKeyAsyncInvoker(
        DeleteDeployKeyRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.deleteDeployKey, hcClient);
    }

    /**
     * 删除仓库部署密钥
     *
     * 删除仓库部署密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeployKeyV2Request 请求对象
     * @return CompletableFuture<DeleteDeployKeyV2Response>
     */
    public CompletableFuture<DeleteDeployKeyV2Response> deleteDeployKeyV2Async(DeleteDeployKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.deleteDeployKeyV2);
    }

    /**
     * 删除仓库部署密钥
     *
     * 删除仓库部署密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDeployKeyV2Request 请求对象
     * @return AsyncInvoker<DeleteDeployKeyV2Request, DeleteDeployKeyV2Response>
     */
    public AsyncInvoker<DeleteDeployKeyV2Request, DeleteDeployKeyV2Response> deleteDeployKeyV2AsyncInvoker(
        DeleteDeployKeyV2Request request) {
        return new AsyncInvoker<>(request, CodeHubMeta.deleteDeployKeyV2, hcClient);
    }

    /**
     * 删除仓库
     *
     * 根据仓库32位uuid删除指定的仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepositoryRequest 请求对象
     * @return CompletableFuture<DeleteRepositoryResponse>
     */
    public CompletableFuture<DeleteRepositoryResponse> deleteRepositoryAsync(DeleteRepositoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.deleteRepository);
    }

    /**
     * 删除仓库
     *
     * 根据仓库32位uuid删除指定的仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepositoryRequest 请求对象
     * @return AsyncInvoker<DeleteRepositoryRequest, DeleteRepositoryResponse>
     */
    public AsyncInvoker<DeleteRepositoryRequest, DeleteRepositoryResponse> deleteRepositoryAsyncInvoker(
        DeleteRepositoryRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.deleteRepository, hcClient);
    }

    /**
     * 查询项目下的某个仓库
     *
     * 不建议再使用,建议使用/{repository_uuid}/status
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetRepositoryByProjectIdRequest 请求对象
     * @return CompletableFuture<GetRepositoryByProjectIdResponse>
     */
    @Deprecated
    public CompletableFuture<GetRepositoryByProjectIdResponse> getRepositoryByProjectIdAsync(
        GetRepositoryByProjectIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.getRepositoryByProjectId);
    }

    /**
     * 查询项目下的某个仓库
     *
     * 不建议再使用,建议使用/{repository_uuid}/status
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetRepositoryByProjectIdRequest 请求对象
     * @return AsyncInvoker<GetRepositoryByProjectIdRequest, GetRepositoryByProjectIdResponse>
     */
    @Deprecated
    public AsyncInvoker<GetRepositoryByProjectIdRequest, GetRepositoryByProjectIdResponse> getRepositoryByProjectIdAsyncInvoker(
        GetRepositoryByProjectIdRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.getRepositoryByProjectId, hcClient);
    }

    /**
     * 获取公开示例模板列表
     *
     * 获取公开示例模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetTemplatesRequest 请求对象
     * @return CompletableFuture<GetTemplatesResponse>
     */
    @Deprecated
    public CompletableFuture<GetTemplatesResponse> getTemplatesAsync(GetTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.getTemplates);
    }

    /**
     * 获取公开示例模板列表
     *
     * 获取公开示例模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetTemplatesRequest 请求对象
     * @return AsyncInvoker<GetTemplatesRequest, GetTemplatesResponse>
     */
    @Deprecated
    public AsyncInvoker<GetTemplatesRequest, GetTemplatesResponse> getTemplatesAsyncInvoker(
        GetTemplatesRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.getTemplates, hcClient);
    }

    /**
     * 获取仓库分支列表
     *
     * 获取仓库分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBranchesByRepositoryIdRequest 请求对象
     * @return CompletableFuture<ListBranchesByRepositoryIdResponse>
     */
    public CompletableFuture<ListBranchesByRepositoryIdResponse> listBranchesByRepositoryIdAsync(
        ListBranchesByRepositoryIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.listBranchesByRepositoryId);
    }

    /**
     * 获取仓库分支列表
     *
     * 获取仓库分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBranchesByRepositoryIdRequest 请求对象
     * @return AsyncInvoker<ListBranchesByRepositoryIdRequest, ListBranchesByRepositoryIdResponse>
     */
    public AsyncInvoker<ListBranchesByRepositoryIdRequest, ListBranchesByRepositoryIdResponse> listBranchesByRepositoryIdAsyncInvoker(
        ListBranchesByRepositoryIdRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.listBranchesByRepositoryId, hcClient);
    }

    /**
     * 获取仓库上一次的提交统计信息
     *
     * 获取仓库上一次的提交统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommitStatisticsRequest 请求对象
     * @return CompletableFuture<ListCommitStatisticsResponse>
     */
    public CompletableFuture<ListCommitStatisticsResponse> listCommitStatisticsAsync(
        ListCommitStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.listCommitStatistics);
    }

    /**
     * 获取仓库上一次的提交统计信息
     *
     * 获取仓库上一次的提交统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommitStatisticsRequest 请求对象
     * @return AsyncInvoker<ListCommitStatisticsRequest, ListCommitStatisticsResponse>
     */
    public AsyncInvoker<ListCommitStatisticsRequest, ListCommitStatisticsResponse> listCommitStatisticsAsyncInvoker(
        ListCommitStatisticsRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.listCommitStatistics, hcClient);
    }

    /**
     * 获取一个仓库下特定分支指定文件内容
     *
     * 获取一个仓库下特定分支指定文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFilesRequest 请求对象
     * @return CompletableFuture<ListFilesResponse>
     */
    public CompletableFuture<ListFilesResponse> listFilesAsync(ListFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.listFiles);
    }

    /**
     * 获取一个仓库下特定分支指定文件内容
     *
     * 获取一个仓库下特定分支指定文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFilesRequest 请求对象
     * @return AsyncInvoker<ListFilesRequest, ListFilesResponse>
     */
    public AsyncInvoker<ListFilesRequest, ListFilesResponse> listFilesAsyncInvoker(ListFilesRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.listFiles, hcClient);
    }

    /**
     * 获取仓库合并请求列表
     *
     * 获取仓库合并请求列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestRequest 请求对象
     * @return CompletableFuture<ListMergeRequestResponse>
     */
    public CompletableFuture<ListMergeRequestResponse> listMergeRequestAsync(ListMergeRequestRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.listMergeRequest);
    }

    /**
     * 获取仓库合并请求列表
     *
     * 获取仓库合并请求列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestRequest 请求对象
     * @return AsyncInvoker<ListMergeRequestRequest, ListMergeRequestResponse>
     */
    public AsyncInvoker<ListMergeRequestRequest, ListMergeRequestResponse> listMergeRequestAsyncInvoker(
        ListMergeRequestRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.listMergeRequest, hcClient);
    }

    /**
     * 查看仓库的创建状态
     *
     * 获取仓库状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryStatusRequest 请求对象
     * @return CompletableFuture<ListRepositoryStatusResponse>
     */
    public CompletableFuture<ListRepositoryStatusResponse> listRepositoryStatusAsync(
        ListRepositoryStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.listRepositoryStatus);
    }

    /**
     * 查看仓库的创建状态
     *
     * 获取仓库状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryStatusRequest 请求对象
     * @return AsyncInvoker<ListRepositoryStatusRequest, ListRepositoryStatusResponse>
     */
    public AsyncInvoker<ListRepositoryStatusRequest, ListRepositoryStatusResponse> listRepositoryStatusAsyncInvoker(
        ListRepositoryStatusRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.listRepositoryStatus, hcClient);
    }

    /**
     * 获取分支目录下的文件
     *
     * 获取分支目录下的文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubfilesRequest 请求对象
     * @return CompletableFuture<ListSubfilesResponse>
     */
    public CompletableFuture<ListSubfilesResponse> listSubfilesAsync(ListSubfilesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.listSubfiles);
    }

    /**
     * 获取分支目录下的文件
     *
     * 获取分支目录下的文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubfilesRequest 请求对象
     * @return AsyncInvoker<ListSubfilesRequest, ListSubfilesResponse>
     */
    public AsyncInvoker<ListSubfilesRequest, ListSubfilesResponse> listSubfilesAsyncInvoker(
        ListSubfilesRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.listSubfiles, hcClient);
    }

    /**
     * 设置仓库是公开状态还是私有状态
     *
     * 设置仓库是公开状态还是私有状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesTwoRequest 请求对象
     * @return CompletableFuture<ListTemplatesTwoResponse>
     */
    public CompletableFuture<ListTemplatesTwoResponse> listTemplatesTwoAsync(ListTemplatesTwoRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.listTemplatesTwo);
    }

    /**
     * 设置仓库是公开状态还是私有状态
     *
     * 设置仓库是公开状态还是私有状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesTwoRequest 请求对象
     * @return AsyncInvoker<ListTemplatesTwoRequest, ListTemplatesTwoResponse>
     */
    public AsyncInvoker<ListTemplatesTwoRequest, ListTemplatesTwoResponse> listTemplatesTwoAsyncInvoker(
        ListTemplatesTwoRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.listTemplatesTwo, hcClient);
    }

    /**
     * 获取公开示例模板列表
     *
     * 获取公开示例模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTwoTemplatesRequest 请求对象
     * @return CompletableFuture<ListTwoTemplatesResponse>
     */
    public CompletableFuture<ListTwoTemplatesResponse> listTwoTemplatesAsync(ListTwoTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.listTwoTemplates);
    }

    /**
     * 获取公开示例模板列表
     *
     * 获取公开示例模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTwoTemplatesRequest 请求对象
     * @return AsyncInvoker<ListTwoTemplatesRequest, ListTwoTemplatesResponse>
     */
    public AsyncInvoker<ListTwoTemplatesRequest, ListTwoTemplatesResponse> listTwoTemplatesAsyncInvoker(
        ListTwoTemplatesRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.listTwoTemplates, hcClient);
    }

    /**
     * 设置仓库是公开状态还是私有状态
     *
     * 设置仓库是公开状态还是私有状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShareTemplatesRequest 请求对象
     * @return CompletableFuture<ShareTemplatesResponse>
     */
    @Deprecated
    public CompletableFuture<ShareTemplatesResponse> shareTemplatesAsync(ShareTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.shareTemplates);
    }

    /**
     * 设置仓库是公开状态还是私有状态
     *
     * 设置仓库是公开状态还是私有状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShareTemplatesRequest 请求对象
     * @return AsyncInvoker<ShareTemplatesRequest, ShareTemplatesResponse>
     */
    @Deprecated
    public AsyncInvoker<ShareTemplatesRequest, ShareTemplatesResponse> shareTemplatesAsyncInvoker(
        ShareTemplatesRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.shareTemplates, hcClient);
    }

    /**
     * 查询某仓库对应的分支
     *
     * 根据仓库id获取指定仓库的分支列表.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBranchesByRepositoryIdRequest 请求对象
     * @return CompletableFuture<ShowBranchesByRepositoryIdResponse>
     */
    public CompletableFuture<ShowBranchesByRepositoryIdResponse> showBranchesByRepositoryIdAsync(
        ShowBranchesByRepositoryIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.showBranchesByRepositoryId);
    }

    /**
     * 查询某仓库对应的分支
     *
     * 根据仓库id获取指定仓库的分支列表.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBranchesByRepositoryIdRequest 请求对象
     * @return AsyncInvoker<ShowBranchesByRepositoryIdRequest, ShowBranchesByRepositoryIdResponse>
     */
    public AsyncInvoker<ShowBranchesByRepositoryIdRequest, ShowBranchesByRepositoryIdResponse> showBranchesByRepositoryIdAsyncInvoker(
        ShowBranchesByRepositoryIdRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.showBranchesByRepositoryId, hcClient);
    }

    /**
     * 查询某仓库的标签列表
     *
     * 查询指定仓库对应的分支。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBranchesByTwoRepositoryIdRequest 请求对象
     * @return CompletableFuture<ShowBranchesByTwoRepositoryIdResponse>
     */
    public CompletableFuture<ShowBranchesByTwoRepositoryIdResponse> showBranchesByTwoRepositoryIdAsync(
        ShowBranchesByTwoRepositoryIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.showBranchesByTwoRepositoryId);
    }

    /**
     * 查询某仓库的标签列表
     *
     * 查询指定仓库对应的分支。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBranchesByTwoRepositoryIdRequest 请求对象
     * @return AsyncInvoker<ShowBranchesByTwoRepositoryIdRequest, ShowBranchesByTwoRepositoryIdResponse>
     */
    public AsyncInvoker<ShowBranchesByTwoRepositoryIdRequest, ShowBranchesByTwoRepositoryIdResponse> showBranchesByTwoRepositoryIdAsyncInvoker(
        ShowBranchesByTwoRepositoryIdRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.showBranchesByTwoRepositoryId, hcClient);
    }

    /**
     * 根据组名和仓库名查询某仓库某分支对应的提交
     *
     * 根据仓库组名、仓库名和分支获取提交列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommitsByBranchRequest 请求对象
     * @return CompletableFuture<ShowCommitsByBranchResponse>
     */
    public CompletableFuture<ShowCommitsByBranchResponse> showCommitsByBranchAsync(ShowCommitsByBranchRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.showCommitsByBranch);
    }

    /**
     * 根据组名和仓库名查询某仓库某分支对应的提交
     *
     * 根据仓库组名、仓库名和分支获取提交列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommitsByBranchRequest 请求对象
     * @return AsyncInvoker<ShowCommitsByBranchRequest, ShowCommitsByBranchResponse>
     */
    public AsyncInvoker<ShowCommitsByBranchRequest, ShowCommitsByBranchResponse> showCommitsByBranchAsyncInvoker(
        ShowCommitsByBranchRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.showCommitsByBranch, hcClient);
    }

    /**
     * 根据仓库id查询仓库某分支对应的提交，提供更多可选参数
     *
     * 根据仓库id查询仓库某分支对应的提交.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommitsByRepoIdRequest 请求对象
     * @return CompletableFuture<ShowCommitsByRepoIdResponse>
     */
    public CompletableFuture<ShowCommitsByRepoIdResponse> showCommitsByRepoIdAsync(ShowCommitsByRepoIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.showCommitsByRepoId);
    }

    /**
     * 根据仓库id查询仓库某分支对应的提交，提供更多可选参数
     *
     * 根据仓库id查询仓库某分支对应的提交.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommitsByRepoIdRequest 请求对象
     * @return AsyncInvoker<ShowCommitsByRepoIdRequest, ShowCommitsByRepoIdResponse>
     */
    public AsyncInvoker<ShowCommitsByRepoIdRequest, ShowCommitsByRepoIdResponse> showCommitsByRepoIdAsyncInvoker(
        ShowCommitsByRepoIdRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.showCommitsByRepoId, hcClient);
    }

    /**
     * 修改被流水线引用的仓库状态
     *
     * 修改被流水线引用的仓库状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHasPipelineRequest 请求对象
     * @return CompletableFuture<ShowHasPipelineResponse>
     */
    public CompletableFuture<ShowHasPipelineResponse> showHasPipelineAsync(ShowHasPipelineRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.showHasPipeline);
    }

    /**
     * 修改被流水线引用的仓库状态
     *
     * 修改被流水线引用的仓库状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHasPipelineRequest 请求对象
     * @return AsyncInvoker<ShowHasPipelineRequest, ShowHasPipelineResponse>
     */
    public AsyncInvoker<ShowHasPipelineRequest, ShowHasPipelineResponse> showHasPipelineAsyncInvoker(
        ShowHasPipelineRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.showHasPipeline, hcClient);
    }

    /**
     * 获取一个仓库下特定分支的图片文件
     *
     * 获取一个仓库下特定分支的图片文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageBlobRequest 请求对象
     * @return CompletableFuture<ShowImageBlobResponse>
     */
    public CompletableFuture<ShowImageBlobResponse> showImageBlobAsync(ShowImageBlobRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.showImageBlob);
    }

    /**
     * 获取一个仓库下特定分支的图片文件
     *
     * 获取一个仓库下特定分支的图片文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowImageBlobRequest 请求对象
     * @return AsyncInvoker<ShowImageBlobRequest, ShowImageBlobResponse>
     */
    public AsyncInvoker<ShowImageBlobRequest, ShowImageBlobResponse> showImageBlobAsyncInvoker(
        ShowImageBlobRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.showImageBlob, hcClient);
    }

    /**
     * 判断用户是否有仓库的管理员权限
     *
     * 判断用户是否有仓库的管理员权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMasterRequest 请求对象
     * @return CompletableFuture<ShowMasterResponse>
     */
    public CompletableFuture<ShowMasterResponse> showMasterAsync(ShowMasterRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.showMaster);
    }

    /**
     * 判断用户是否有仓库的管理员权限
     *
     * 判断用户是否有仓库的管理员权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMasterRequest 请求对象
     * @return AsyncInvoker<ShowMasterRequest, ShowMasterResponse>
     */
    public AsyncInvoker<ShowMasterRequest, ShowMasterResponse> showMasterAsyncInvoker(ShowMasterRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.showMaster, hcClient);
    }

    /**
     * 获取仓库合并请求详情
     *
     * 获取仓库合并请求详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeRequestRequest 请求对象
     * @return CompletableFuture<ShowMergeRequestResponse>
     */
    public CompletableFuture<ShowMergeRequestResponse> showMergeRequestAsync(ShowMergeRequestRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.showMergeRequest);
    }

    /**
     * 获取仓库合并请求详情
     *
     * 获取仓库合并请求详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeRequestRequest 请求对象
     * @return AsyncInvoker<ShowMergeRequestRequest, ShowMergeRequestResponse>
     */
    public AsyncInvoker<ShowMergeRequestRequest, ShowMergeRequestResponse> showMergeRequestAsyncInvoker(
        ShowMergeRequestRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.showMergeRequest, hcClient);
    }

    /**
     * 根据仓库名组名获取仓库短id，用以拼接与commitid对应提交详情页面url
     *
     * 获取仓库短id,用于获取仓库详情页面url
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepoIdRequest 请求对象
     * @return CompletableFuture<ShowRepoIdResponse>
     */
    public CompletableFuture<ShowRepoIdResponse> showRepoIdAsync(ShowRepoIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.showRepoId);
    }

    /**
     * 根据仓库名组名获取仓库短id，用以拼接与commitid对应提交详情页面url
     *
     * 获取仓库短id,用于获取仓库详情页面url
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepoIdRequest 请求对象
     * @return AsyncInvoker<ShowRepoIdRequest, ShowRepoIdResponse>
     */
    public AsyncInvoker<ShowRepoIdRequest, ShowRepoIdResponse> showRepoIdAsyncInvoker(ShowRepoIdRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.showRepoId, hcClient);
    }

    /**
     * 下载仓库
     *
     * 按照指定格式下载仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryArchiveRequest 请求对象
     * @return CompletableFuture<ShowRepositoryArchiveResponse>
     */
    public CompletableFuture<ShowRepositoryArchiveResponse> showRepositoryArchiveAsync(
        ShowRepositoryArchiveRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.showRepositoryArchive);
    }

    /**
     * 下载仓库
     *
     * 按照指定格式下载仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryArchiveRequest 请求对象
     * @return AsyncInvoker<ShowRepositoryArchiveRequest, ShowRepositoryArchiveResponse>
     */
    public AsyncInvoker<ShowRepositoryArchiveRequest, ShowRepositoryArchiveResponse> showRepositoryArchiveAsyncInvoker(
        ShowRepositoryArchiveRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.showRepositoryArchive, hcClient);
    }

    /**
     * 查询某个仓库的详细信息
     *
     * 根据仓库UUID(由CreateRepository接口返回)获取仓库信息仓库信息。返回 包含id，name，组名，仓库访问URL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryByUuidRequest 请求对象
     * @return CompletableFuture<ShowRepositoryByUuidResponse>
     */
    public CompletableFuture<ShowRepositoryByUuidResponse> showRepositoryByUuidAsync(
        ShowRepositoryByUuidRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.showRepositoryByUuid);
    }

    /**
     * 查询某个仓库的详细信息
     *
     * 根据仓库UUID(由CreateRepository接口返回)获取仓库信息仓库信息。返回 包含id，name，组名，仓库访问URL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryByUuidRequest 请求对象
     * @return AsyncInvoker<ShowRepositoryByUuidRequest, ShowRepositoryByUuidResponse>
     */
    public AsyncInvoker<ShowRepositoryByUuidRequest, ShowRepositoryByUuidResponse> showRepositoryByUuidAsyncInvoker(
        ShowRepositoryByUuidRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.showRepositoryByUuid, hcClient);
    }

    /**
     * 仓库统计
     *
     * 根据仓库短id，查询仓库的代码提交记录统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryStatisticsRequest 请求对象
     * @return CompletableFuture<ShowRepositoryStatisticsResponse>
     */
    public CompletableFuture<ShowRepositoryStatisticsResponse> showRepositoryStatisticsAsync(
        ShowRepositoryStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.showRepositoryStatistics);
    }

    /**
     * 仓库统计
     *
     * 根据仓库短id，查询仓库的代码提交记录统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowRepositoryStatisticsRequest, ShowRepositoryStatisticsResponse>
     */
    public AsyncInvoker<ShowRepositoryStatisticsRequest, ShowRepositoryStatisticsResponse> showRepositoryStatisticsAsyncInvoker(
        ShowRepositoryStatisticsRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.showRepositoryStatistics, hcClient);
    }

    /**
     * 获取代码提交行数
     *
     * 获取指定日期内代码仓指定分支的代码提交行数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticCommitRequest 请求对象
     * @return CompletableFuture<ShowStatisticCommitResponse>
     */
    @Deprecated
    public CompletableFuture<ShowStatisticCommitResponse> showStatisticCommitAsync(ShowStatisticCommitRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.showStatisticCommit);
    }

    /**
     * 获取代码提交行数
     *
     * 获取指定日期内代码仓指定分支的代码提交行数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticCommitRequest 请求对象
     * @return AsyncInvoker<ShowStatisticCommitRequest, ShowStatisticCommitResponse>
     */
    @Deprecated
    public AsyncInvoker<ShowStatisticCommitRequest, ShowStatisticCommitResponse> showStatisticCommitAsyncInvoker(
        ShowStatisticCommitRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.showStatisticCommit, hcClient);
    }

    /**
     * 获取代码提交行数
     *
     * 获取指定日期内代码仓指定分支的代码提交行数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticCommitV3Request 请求对象
     * @return CompletableFuture<ShowStatisticCommitV3Response>
     */
    public CompletableFuture<ShowStatisticCommitV3Response> showStatisticCommitV3Async(
        ShowStatisticCommitV3Request request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.showStatisticCommitV3);
    }

    /**
     * 获取代码提交行数
     *
     * 获取指定日期内代码仓指定分支的代码提交行数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticCommitV3Request 请求对象
     * @return AsyncInvoker<ShowStatisticCommitV3Request, ShowStatisticCommitV3Response>
     */
    public AsyncInvoker<ShowStatisticCommitV3Request, ShowStatisticCommitV3Response> showStatisticCommitV3AsyncInvoker(
        ShowStatisticCommitV3Request request) {
        return new AsyncInvoker<>(request, CodeHubMeta.showStatisticCommitV3, hcClient);
    }

    /**
     * 获取仓库统计数据
     *
     * 获取仓库统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticalDataRequest 请求对象
     * @return CompletableFuture<ShowStatisticalDataResponse>
     */
    public CompletableFuture<ShowStatisticalDataResponse> showStatisticalDataAsync(ShowStatisticalDataRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.showStatisticalData);
    }

    /**
     * 获取仓库统计数据
     *
     * 获取仓库统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticalDataRequest 请求对象
     * @return AsyncInvoker<ShowStatisticalDataRequest, ShowStatisticalDataResponse>
     */
    public AsyncInvoker<ShowStatisticalDataRequest, ShowStatisticalDataResponse> showStatisticalDataAsyncInvoker(
        ShowStatisticalDataRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.showStatisticalData, hcClient);
    }

    /**
     * 添加ssh key
     *
     * 添加ssh key
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSshKeyRequest 请求对象
     * @return CompletableFuture<AddSshKeyResponse>
     */
    public CompletableFuture<AddSshKeyResponse> addSshKeyAsync(AddSshKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.addSshKey);
    }

    /**
     * 添加ssh key
     *
     * 添加ssh key
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSshKeyRequest 请求对象
     * @return AsyncInvoker<AddSshKeyRequest, AddSshKeyResponse>
     */
    public AsyncInvoker<AddSshKeyRequest, AddSshKeyResponse> addSshKeyAsyncInvoker(AddSshKeyRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.addSshKey, hcClient);
    }

    /**
     * 删除用户公钥
     *
     * 删除用户公钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSShkeyRequest 请求对象
     * @return CompletableFuture<DeleteSShkeyResponse>
     */
    @Deprecated
    public CompletableFuture<DeleteSShkeyResponse> deleteSShkeyAsync(DeleteSShkeyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.deleteSShkey);
    }

    /**
     * 删除用户公钥
     *
     * 删除用户公钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSShkeyRequest 请求对象
     * @return AsyncInvoker<DeleteSShkeyRequest, DeleteSShkeyResponse>
     */
    @Deprecated
    public AsyncInvoker<DeleteSShkeyRequest, DeleteSShkeyResponse> deleteSShkeyAsyncInvoker(
        DeleteSShkeyRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.deleteSShkey, hcClient);
    }

    /**
     * 获取ssh key列表
     *
     * 获取ssh key列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSshKeysRequest 请求对象
     * @return CompletableFuture<ListSshKeysResponse>
     */
    public CompletableFuture<ListSshKeysResponse> listSshKeysAsync(ListSshKeysRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.listSshKeys);
    }

    /**
     * 获取ssh key列表
     *
     * 获取ssh key列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSshKeysRequest 请求对象
     * @return AsyncInvoker<ListSshKeysRequest, ListSshKeysResponse>
     */
    public AsyncInvoker<ListSshKeysRequest, ListSshKeysResponse> listSshKeysAsyncInvoker(ListSshKeysRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.listSshKeys, hcClient);
    }

    /**
     * 检验私钥是否有拉取代码的权限
     *
     * 检验私钥是否有拉取代码的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPrivateKeyVerifyRequest 请求对象
     * @return CompletableFuture<ShowPrivateKeyVerifyResponse>
     */
    public CompletableFuture<ShowPrivateKeyVerifyResponse> showPrivateKeyVerifyAsync(
        ShowPrivateKeyVerifyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.showPrivateKeyVerify);
    }

    /**
     * 检验私钥是否有拉取代码的权限
     *
     * 检验私钥是否有拉取代码的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPrivateKeyVerifyRequest 请求对象
     * @return AsyncInvoker<ShowPrivateKeyVerifyRequest, ShowPrivateKeyVerifyResponse>
     */
    public AsyncInvoker<ShowPrivateKeyVerifyRequest, ShowPrivateKeyVerifyResponse> showPrivateKeyVerifyAsyncInvoker(
        ShowPrivateKeyVerifyRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.showPrivateKeyVerify, hcClient);
    }

    /**
     *  https账号密码校验
     *
     * 判断用户使用 https 上传/下载代码时输入的用户名和密码是否合法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateHttpsInfoRequest 请求对象
     * @return CompletableFuture<ValidateHttpsInfoResponse>
     */
    @Deprecated
    public CompletableFuture<ValidateHttpsInfoResponse> validateHttpsInfoAsync(ValidateHttpsInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.validateHttpsInfo);
    }

    /**
     *  https账号密码校验
     *
     * 判断用户使用 https 上传/下载代码时输入的用户名和密码是否合法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateHttpsInfoRequest 请求对象
     * @return AsyncInvoker<ValidateHttpsInfoRequest, ValidateHttpsInfoResponse>
     */
    @Deprecated
    public AsyncInvoker<ValidateHttpsInfoRequest, ValidateHttpsInfoResponse> validateHttpsInfoAsyncInvoker(
        ValidateHttpsInfoRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.validateHttpsInfo, hcClient);
    }

    /**
     * https账号密码校验
     *
     * 判断用户使用 https 上传/下载代码时输入的用户名和密码是否合法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateHttpsInfoV2Request 请求对象
     * @return CompletableFuture<ValidateHttpsInfoV2Response>
     */
    public CompletableFuture<ValidateHttpsInfoV2Response> validateHttpsInfoV2Async(ValidateHttpsInfoV2Request request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.validateHttpsInfoV2);
    }

    /**
     * https账号密码校验
     *
     * 判断用户使用 https 上传/下载代码时输入的用户名和密码是否合法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateHttpsInfoV2Request 请求对象
     * @return AsyncInvoker<ValidateHttpsInfoV2Request, ValidateHttpsInfoV2Response>
     */
    public AsyncInvoker<ValidateHttpsInfoV2Request, ValidateHttpsInfoV2Response> validateHttpsInfoV2AsyncInvoker(
        ValidateHttpsInfoV2Request request) {
        return new AsyncInvoker<>(request, CodeHubMeta.validateHttpsInfoV2, hcClient);
    }

    /**
     * 创建分支
     *
     * 根据仓库id在指定仓库中创建分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNewBranchRequest 请求对象
     * @return CompletableFuture<CreateNewBranchResponse>
     */
    public CompletableFuture<CreateNewBranchResponse> createNewBranchAsync(CreateNewBranchRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.createNewBranch);
    }

    /**
     * 创建分支
     *
     * 根据仓库id在指定仓库中创建分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNewBranchRequest 请求对象
     * @return AsyncInvoker<CreateNewBranchRequest, CreateNewBranchResponse>
     */
    public AsyncInvoker<CreateNewBranchRequest, CreateNewBranchResponse> createNewBranchAsyncInvoker(
        CreateNewBranchRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.createNewBranch, hcClient);
    }

    /**
     * 分支关联工作项
     *
     * 分支关联工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateIssuesRequest 请求对象
     * @return CompletableFuture<AssociateIssuesResponse>
     */
    public CompletableFuture<AssociateIssuesResponse> associateIssuesAsync(AssociateIssuesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.associateIssues);
    }

    /**
     * 分支关联工作项
     *
     * 分支关联工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateIssuesRequest 请求对象
     * @return AsyncInvoker<AssociateIssuesRequest, AssociateIssuesResponse>
     */
    public AsyncInvoker<AssociateIssuesRequest, AssociateIssuesResponse> associateIssuesAsyncInvoker(
        AssociateIssuesRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.associateIssues, hcClient);
    }

    /**
     * 创建项目、仓库
     *
     * 创建项目后，创建仓库组由后台生成方式 传入参数：仓库名、模板id、是否导入项目成员、归属项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectAndRepositoriesRequest 请求对象
     * @return CompletableFuture<CreateProjectAndRepositoriesResponse>
     */
    public CompletableFuture<CreateProjectAndRepositoriesResponse> createProjectAndRepositoriesAsync(
        CreateProjectAndRepositoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.createProjectAndRepositories);
    }

    /**
     * 创建项目、仓库
     *
     * 创建项目后，创建仓库组由后台生成方式 传入参数：仓库名、模板id、是否导入项目成员、归属项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectAndRepositoriesRequest 请求对象
     * @return AsyncInvoker<CreateProjectAndRepositoriesRequest, CreateProjectAndRepositoriesResponse>
     */
    public AsyncInvoker<CreateProjectAndRepositoriesRequest, CreateProjectAndRepositoriesResponse> createProjectAndRepositoriesAsyncInvoker(
        CreateProjectAndRepositoriesRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.createProjectAndRepositories, hcClient);
    }

    /**
     * 创建项目并fork仓库
     *
     * 创建仓库后fork仓库 传入参数：仓库名、是否导入项目成员、归属项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectAndforkRepositoriesRequest 请求对象
     * @return CompletableFuture<CreateProjectAndforkRepositoriesResponse>
     */
    public CompletableFuture<CreateProjectAndforkRepositoriesResponse> createProjectAndforkRepositoriesAsync(
        CreateProjectAndforkRepositoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.createProjectAndforkRepositories);
    }

    /**
     * 创建项目并fork仓库
     *
     * 创建仓库后fork仓库 传入参数：仓库名、是否导入项目成员、归属项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectAndforkRepositoriesRequest 请求对象
     * @return AsyncInvoker<CreateProjectAndforkRepositoriesRequest, CreateProjectAndforkRepositoriesResponse>
     */
    public AsyncInvoker<CreateProjectAndforkRepositoriesRequest, CreateProjectAndforkRepositoriesResponse> createProjectAndforkRepositoriesAsyncInvoker(
        CreateProjectAndforkRepositoriesRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.createProjectAndforkRepositories, hcClient);
    }

    /**
     * 查询用户的所有仓库
     *
     * 获取用户的所有仓库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserAllRepositoriesRequest 请求对象
     * @return CompletableFuture<ListUserAllRepositoriesResponse>
     */
    public CompletableFuture<ListUserAllRepositoriesResponse> listUserAllRepositoriesAsync(
        ListUserAllRepositoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.listUserAllRepositories);
    }

    /**
     * 查询用户的所有仓库
     *
     * 获取用户的所有仓库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserAllRepositoriesRequest 请求对象
     * @return AsyncInvoker<ListUserAllRepositoriesRequest, ListUserAllRepositoriesResponse>
     */
    public AsyncInvoker<ListUserAllRepositoriesRequest, ListUserAllRepositoriesResponse> listUserAllRepositoriesAsyncInvoker(
        ListUserAllRepositoriesRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.listUserAllRepositories, hcClient);
    }

    /**
     * 查询项目下的所有仓库
     *
     * 获取仓库列表,模糊查询支持范围,如果未传入project uuid，则支持按仓库名或项目名模糊查询，否则，只按仓库名模糊匹配
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllRepositoryByTwoProjectIdRequest 请求对象
     * @return CompletableFuture<ShowAllRepositoryByTwoProjectIdResponse>
     */
    public CompletableFuture<ShowAllRepositoryByTwoProjectIdResponse> showAllRepositoryByTwoProjectIdAsync(
        ShowAllRepositoryByTwoProjectIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.showAllRepositoryByTwoProjectId);
    }

    /**
     * 查询项目下的所有仓库
     *
     * 获取仓库列表,模糊查询支持范围,如果未传入project uuid，则支持按仓库名或项目名模糊查询，否则，只按仓库名模糊匹配
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllRepositoryByTwoProjectIdRequest 请求对象
     * @return AsyncInvoker<ShowAllRepositoryByTwoProjectIdRequest, ShowAllRepositoryByTwoProjectIdResponse>
     */
    public AsyncInvoker<ShowAllRepositoryByTwoProjectIdRequest, ShowAllRepositoryByTwoProjectIdResponse> showAllRepositoryByTwoProjectIdAsyncInvoker(
        ShowAllRepositoryByTwoProjectIdRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.showAllRepositoryByTwoProjectId, hcClient);
    }

    /**
     * 为指定仓库添加hook
     *
     * 提交代码自动触发编译构建，添加仓库钩子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddHooksRequest 请求对象
     * @return CompletableFuture<AddHooksResponse>
     */
    public CompletableFuture<AddHooksResponse> addHooksAsync(AddHooksRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.addHooks);
    }

    /**
     * 为指定仓库添加hook
     *
     * 提交代码自动触发编译构建，添加仓库钩子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddHooksRequest 请求对象
     * @return AsyncInvoker<AddHooksRequest, AddHooksResponse>
     */
    public AsyncInvoker<AddHooksRequest, AddHooksResponse> addHooksAsyncInvoker(AddHooksRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.addHooks, hcClient);
    }

    /**
     * 删除指定仓库的 hook
     *
     * 提交代码自动触发编译构建，删除仓库钩子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHooksRequest 请求对象
     * @return CompletableFuture<DeleteHooksResponse>
     */
    public CompletableFuture<DeleteHooksResponse> deleteHooksAsync(DeleteHooksRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.deleteHooks);
    }

    /**
     * 删除指定仓库的 hook
     *
     * 提交代码自动触发编译构建，删除仓库钩子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHooksRequest 请求对象
     * @return AsyncInvoker<DeleteHooksRequest, DeleteHooksResponse>
     */
    public AsyncInvoker<DeleteHooksRequest, DeleteHooksResponse> deleteHooksAsyncInvoker(DeleteHooksRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.deleteHooks, hcClient);
    }

    /**
     * 查询指定仓库的webhook
     *
     * 获取仓库webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHooksRequest 请求对象
     * @return CompletableFuture<ListHooksResponse>
     */
    public CompletableFuture<ListHooksResponse> listHooksAsync(ListHooksRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeHubMeta.listHooks);
    }

    /**
     * 查询指定仓库的webhook
     *
     * 获取仓库webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHooksRequest 请求对象
     * @return AsyncInvoker<ListHooksRequest, ListHooksResponse>
     */
    public AsyncInvoker<ListHooksRequest, ListHooksResponse> listHooksAsyncInvoker(ListHooksRequest request) {
        return new AsyncInvoker<>(request, CodeHubMeta.listHooks, hcClient);
    }

}
