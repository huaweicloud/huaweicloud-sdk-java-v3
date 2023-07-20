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
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CodeHubClient {

    protected HcClient hcClient;

    public CodeHubClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeHubClient> newBuilder() {
        ClientBuilder<CodeHubClient> clientBuilder = new ClientBuilder<>(CodeHubClient::new);
        return clientBuilder;
    }

    /**
     * 创建提交
     *
     * 能够一次提交位于不同目录的多个文件，目录不存在时，能自动创建目录。支持强制覆盖选项，当选择强制覆盖标志为true时，忽略冲突，强制提交。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCommitRequest 请求对象
     * @return CreateCommitResponse
     */
    public CreateCommitResponse createCommit(CreateCommitRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createCommit);
    }

    /**
     * 创建提交
     *
     * 能够一次提交位于不同目录的多个文件，目录不存在时，能自动创建目录。支持强制覆盖选项，当选择强制覆盖标志为true时，忽略冲突，强制提交。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCommitRequest 请求对象
     * @return SyncInvoker<CreateCommitRequest, CreateCommitResponse>
     */
    public SyncInvoker<CreateCommitRequest, CreateCommitResponse> createCommitInvoker(CreateCommitRequest request) {
        return new SyncInvoker<CreateCommitRequest, CreateCommitResponse>(request, CodeHubMeta.createCommit, hcClient);
    }

    /**
     * 查询某个仓库的提交信息
     *
     * 根据仓库短ID获取提交信息，支持根据文件路径，查询这个路径下所有的commits列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCommitsRequest 请求对象
     * @return ListCommitsResponse
     */
    public ListCommitsResponse listCommits(ListCommitsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listCommits);
    }

    /**
     * 查询某个仓库的提交信息
     *
     * 根据仓库短ID获取提交信息，支持根据文件路径，查询这个路径下所有的commits列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCommitsRequest 请求对象
     * @return SyncInvoker<ListCommitsRequest, ListCommitsResponse>
     */
    public SyncInvoker<ListCommitsRequest, ListCommitsResponse> listCommitsInvoker(ListCommitsRequest request) {
        return new SyncInvoker<ListCommitsRequest, ListCommitsResponse>(request, CodeHubMeta.listCommits, hcClient);
    }

    /**
     * 查询某个仓库的提交差异信息
     *
     * 根据commit id查询提交差异信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDiffCommitRequest 请求对象
     * @return ShowDiffCommitResponse
     */
    public ShowDiffCommitResponse showDiffCommit(ShowDiffCommitRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showDiffCommit);
    }

    /**
     * 查询某个仓库的提交差异信息
     *
     * 根据commit id查询提交差异信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDiffCommitRequest 请求对象
     * @return SyncInvoker<ShowDiffCommitRequest, ShowDiffCommitResponse>
     */
    public SyncInvoker<ShowDiffCommitRequest, ShowDiffCommitResponse> showDiffCommitInvoker(
        ShowDiffCommitRequest request) {
        return new SyncInvoker<ShowDiffCommitRequest, ShowDiffCommitResponse>(request, CodeHubMeta.showDiffCommit,
            hcClient);
    }

    /**
     * 查询某个仓库的特定提交信息
     *
     * 获取由commit id或分支或标记的名称标识的特定提交。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSingleCommitRequest 请求对象
     * @return ShowSingleCommitResponse
     */
    public ShowSingleCommitResponse showSingleCommit(ShowSingleCommitRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showSingleCommit);
    }

    /**
     * 查询某个仓库的特定提交信息
     *
     * 获取由commit id或分支或标记的名称标识的特定提交。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSingleCommitRequest 请求对象
     * @return SyncInvoker<ShowSingleCommitRequest, ShowSingleCommitResponse>
     */
    public SyncInvoker<ShowSingleCommitRequest, ShowSingleCommitResponse> showSingleCommitInvoker(
        ShowSingleCommitRequest request) {
        return new SyncInvoker<ShowSingleCommitRequest, ShowSingleCommitResponse>(request, CodeHubMeta.showSingleCommit,
            hcClient);
    }

    /**
     * 查询某个仓库的文件信息
     *
     * 获取仓库中文件的信息，如名称、大小、内容。请注意，文件内容是Base64编码的。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFilesByQueryRequest 请求对象
     * @return ListFilesByQueryResponse
     */
    public ListFilesByQueryResponse listFilesByQuery(ListFilesByQueryRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listFilesByQuery);
    }

    /**
     * 查询某个仓库的文件信息
     *
     * 获取仓库中文件的信息，如名称、大小、内容。请注意，文件内容是Base64编码的。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFilesByQueryRequest 请求对象
     * @return SyncInvoker<ListFilesByQueryRequest, ListFilesByQueryResponse>
     */
    public SyncInvoker<ListFilesByQueryRequest, ListFilesByQueryResponse> listFilesByQueryInvoker(
        ListFilesByQueryRequest request) {
        return new SyncInvoker<ListFilesByQueryRequest, ListFilesByQueryResponse>(request, CodeHubMeta.listFilesByQuery,
            hcClient);
    }

    /**
     * 查询某个仓库的文件信息
     *
     * 获取仓库中文件的信息，如名称、大小、内容。请注意，文件内容是Base64编码的。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFileRequest 请求对象
     * @return ShowFileResponse
     */
    public ShowFileResponse showFile(ShowFileRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showFile);
    }

    /**
     * 查询某个仓库的文件信息
     *
     * 获取仓库中文件的信息，如名称、大小、内容。请注意，文件内容是Base64编码的。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFileRequest 请求对象
     * @return SyncInvoker<ShowFileRequest, ShowFileResponse>
     */
    public SyncInvoker<ShowFileRequest, ShowFileResponse> showFileInvoker(ShowFileRequest request) {
        return new SyncInvoker<ShowFileRequest, ShowFileResponse>(request, CodeHubMeta.showFile, hcClient);
    }

    /**
     * 获取项目下所有仓库信息
     *
     * 获取仓库列表 模糊查询支持范围,如果未传入project_id，则支持按仓库名或项目名模糊查询，否则，只按仓库名模糊匹配。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param GetAllRepositoryByProjectIdRequest 请求对象
     * @return GetAllRepositoryByProjectIdResponse
     */
    public GetAllRepositoryByProjectIdResponse getAllRepositoryByProjectId(GetAllRepositoryByProjectIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.getAllRepositoryByProjectId);
    }

    /**
     * 获取项目下所有仓库信息
     *
     * 获取仓库列表 模糊查询支持范围,如果未传入project_id，则支持按仓库名或项目名模糊查询，否则，只按仓库名模糊匹配。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param GetAllRepositoryByProjectIdRequest 请求对象
     * @return SyncInvoker<GetAllRepositoryByProjectIdRequest, GetAllRepositoryByProjectIdResponse>
     */
    public SyncInvoker<GetAllRepositoryByProjectIdRequest, GetAllRepositoryByProjectIdResponse> getAllRepositoryByProjectIdInvoker(
        GetAllRepositoryByProjectIdRequest request) {
        return new SyncInvoker<GetAllRepositoryByProjectIdRequest, GetAllRepositoryByProjectIdResponse>(request,
            CodeHubMeta.getAllRepositoryByProjectId, hcClient);
    }

    /**
     * 获取一个项目下可以设置为公开状态的仓库列表
     *
     * 获取一个项目下可以设置为公开状态的仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param GetProductTemplatesRequest 请求对象
     * @return GetProductTemplatesResponse
     */
    public GetProductTemplatesResponse getProductTemplates(GetProductTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.getProductTemplates);
    }

    /**
     * 获取一个项目下可以设置为公开状态的仓库列表
     *
     * 获取一个项目下可以设置为公开状态的仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param GetProductTemplatesRequest 请求对象
     * @return SyncInvoker<GetProductTemplatesRequest, GetProductTemplatesResponse>
     */
    public SyncInvoker<GetProductTemplatesRequest, GetProductTemplatesResponse> getProductTemplatesInvoker(
        GetProductTemplatesRequest request) {
        return new SyncInvoker<GetProductTemplatesRequest, GetProductTemplatesResponse>(request,
            CodeHubMeta.getProductTemplates, hcClient);
    }

    /**
     * 获取一个项目下可以设置为公开状态的仓库列表
     *
     * 获取一个项目下可以设置为公开状态的仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProductTwoTemplatesRequest 请求对象
     * @return ListProductTwoTemplatesResponse
     */
    public ListProductTwoTemplatesResponse listProductTwoTemplates(ListProductTwoTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listProductTwoTemplates);
    }

    /**
     * 获取一个项目下可以设置为公开状态的仓库列表
     *
     * 获取一个项目下可以设置为公开状态的仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProductTwoTemplatesRequest 请求对象
     * @return SyncInvoker<ListProductTwoTemplatesRequest, ListProductTwoTemplatesResponse>
     */
    public SyncInvoker<ListProductTwoTemplatesRequest, ListProductTwoTemplatesResponse> listProductTwoTemplatesInvoker(
        ListProductTwoTemplatesRequest request) {
        return new SyncInvoker<ListProductTwoTemplatesRequest, ListProductTwoTemplatesResponse>(request,
            CodeHubMeta.listProductTwoTemplates, hcClient);
    }

    /**
     * 校验指定项目下的仓库名
     *
     * 一般创建仓库时调用。通过传入项目uuid,仓库名，来判断仓库是否重名。仓库存在result:false,仓库不存在result:true。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRepositoryNameExistRequest 请求对象
     * @return ShowRepositoryNameExistResponse
     */
    public ShowRepositoryNameExistResponse showRepositoryNameExist(ShowRepositoryNameExistRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showRepositoryNameExist);
    }

    /**
     * 校验指定项目下的仓库名
     *
     * 一般创建仓库时调用。通过传入项目uuid,仓库名，来判断仓库是否重名。仓库存在result:false,仓库不存在result:true。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRepositoryNameExistRequest 请求对象
     * @return SyncInvoker<ShowRepositoryNameExistRequest, ShowRepositoryNameExistResponse>
     */
    public SyncInvoker<ShowRepositoryNameExistRequest, ShowRepositoryNameExistResponse> showRepositoryNameExistInvoker(
        ShowRepositoryNameExistRequest request) {
        return new SyncInvoker<ShowRepositoryNameExistRequest, ShowRepositoryNameExistResponse>(request,
            CodeHubMeta.showRepositoryNameExist, hcClient);
    }

    /**
     * 添加仓库成员
     *
     * 添加仓库成员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddRepoMembersRequest 请求对象
     * @return AddRepoMembersResponse
     */
    public AddRepoMembersResponse addRepoMembers(AddRepoMembersRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.addRepoMembers);
    }

    /**
     * 添加仓库成员
     *
     * 添加仓库成员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddRepoMembersRequest 请求对象
     * @return SyncInvoker<AddRepoMembersRequest, AddRepoMembersResponse>
     */
    public SyncInvoker<AddRepoMembersRequest, AddRepoMembersResponse> addRepoMembersInvoker(
        AddRepoMembersRequest request) {
        return new SyncInvoker<AddRepoMembersRequest, AddRepoMembersResponse>(request, CodeHubMeta.addRepoMembers,
            hcClient);
    }

    /**
     * 删除仓库成员
     *
     * 删除仓库成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRepoMemberRequest 请求对象
     * @return DeleteRepoMemberResponse
     */
    public DeleteRepoMemberResponse deleteRepoMember(DeleteRepoMemberRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.deleteRepoMember);
    }

    /**
     * 删除仓库成员
     *
     * 删除仓库成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRepoMemberRequest 请求对象
     * @return SyncInvoker<DeleteRepoMemberRequest, DeleteRepoMemberResponse>
     */
    public SyncInvoker<DeleteRepoMemberRequest, DeleteRepoMemberResponse> deleteRepoMemberInvoker(
        DeleteRepoMemberRequest request) {
        return new SyncInvoker<DeleteRepoMemberRequest, DeleteRepoMemberResponse>(request, CodeHubMeta.deleteRepoMember,
            hcClient);
    }

    /**
     * 获取仓库所有成员记录
     *
     * 获取仓库成员列表,可通过关键字搜索某成员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRepoMembersRequest 请求对象
     * @return ListRepoMembersResponse
     */
    public ListRepoMembersResponse listRepoMembers(ListRepoMembersRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listRepoMembers);
    }

    /**
     * 获取仓库所有成员记录
     *
     * 获取仓库成员列表,可通过关键字搜索某成员。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRepoMembersRequest 请求对象
     * @return SyncInvoker<ListRepoMembersRequest, ListRepoMembersResponse>
     */
    public SyncInvoker<ListRepoMembersRequest, ListRepoMembersResponse> listRepoMembersInvoker(
        ListRepoMembersRequest request) {
        return new SyncInvoker<ListRepoMembersRequest, ListRepoMembersResponse>(request, CodeHubMeta.listRepoMembers,
            hcClient);
    }

    /**
     * 设置成员在仓库中的角色
     *
     * 给仓库中成员设置仓库的操作权限，
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetRepoRoleRequest 请求对象
     * @return SetRepoRoleResponse
     */
    public SetRepoRoleResponse setRepoRole(SetRepoRoleRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.setRepoRole);
    }

    /**
     * 设置成员在仓库中的角色
     *
     * 给仓库中成员设置仓库的操作权限，
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetRepoRoleRequest 请求对象
     * @return SyncInvoker<SetRepoRoleRequest, SetRepoRoleResponse>
     */
    public SyncInvoker<SetRepoRoleRequest, SetRepoRoleResponse> setRepoRoleInvoker(SetRepoRoleRequest request) {
        return new SyncInvoker<SetRepoRoleRequest, SetRepoRoleResponse>(request, CodeHubMeta.setRepoRole, hcClient);
    }

    /**
     * 添加部署密钥
     *
     * 添加部署密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddDeployKeyRequest 请求对象
     * @return AddDeployKeyResponse
     */
    public AddDeployKeyResponse addDeployKey(AddDeployKeyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.addDeployKey);
    }

    /**
     * 添加部署密钥
     *
     * 添加部署密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddDeployKeyRequest 请求对象
     * @return SyncInvoker<AddDeployKeyRequest, AddDeployKeyResponse>
     */
    public SyncInvoker<AddDeployKeyRequest, AddDeployKeyResponse> addDeployKeyInvoker(AddDeployKeyRequest request) {
        return new SyncInvoker<AddDeployKeyRequest, AddDeployKeyResponse>(request, CodeHubMeta.addDeployKey, hcClient);
    }

    /**
     * 添加部署密钥
     *
     * 添加部署密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddDeployKeyV2Request 请求对象
     * @return AddDeployKeyV2Response
     */
    public AddDeployKeyV2Response addDeployKeyV2(AddDeployKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.addDeployKeyV2);
    }

    /**
     * 添加部署密钥
     *
     * 添加部署密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddDeployKeyV2Request 请求对象
     * @return SyncInvoker<AddDeployKeyV2Request, AddDeployKeyV2Response>
     */
    public SyncInvoker<AddDeployKeyV2Request, AddDeployKeyV2Response> addDeployKeyV2Invoker(
        AddDeployKeyV2Request request) {
        return new SyncInvoker<AddDeployKeyV2Request, AddDeployKeyV2Response>(request, CodeHubMeta.addDeployKeyV2,
            hcClient);
    }

    /**
     * 新建保护分支
     *
     * 新建保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddProtectBranchV2Request 请求对象
     * @return AddProtectBranchV2Response
     */
    public AddProtectBranchV2Response addProtectBranchV2(AddProtectBranchV2Request request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.addProtectBranchV2);
    }

    /**
     * 新建保护分支
     *
     * 新建保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddProtectBranchV2Request 请求对象
     * @return SyncInvoker<AddProtectBranchV2Request, AddProtectBranchV2Response>
     */
    public SyncInvoker<AddProtectBranchV2Request, AddProtectBranchV2Response> addProtectBranchV2Invoker(
        AddProtectBranchV2Request request) {
        return new SyncInvoker<AddProtectBranchV2Request, AddProtectBranchV2Response>(request,
            CodeHubMeta.addProtectBranchV2, hcClient);
    }

    /**
     * 新建标签
     *
     * 新建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddTagV2Request 请求对象
     * @return AddTagV2Response
     */
    public AddTagV2Response addTagV2(AddTagV2Request request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.addTagV2);
    }

    /**
     * 新建标签
     *
     * 新建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddTagV2Request 请求对象
     * @return SyncInvoker<AddTagV2Request, AddTagV2Response>
     */
    public SyncInvoker<AddTagV2Request, AddTagV2Response> addTagV2Invoker(AddTagV2Request request) {
        return new SyncInvoker<AddTagV2Request, AddTagV2Response>(request, CodeHubMeta.addTagV2, hcClient);
    }

    /**
     * 创建仓库
     *
     * 用指定的名称在指定项目上创建仓库。传入参数：仓库名、模板id、是否导入项目成员、归属项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRepositoryRequest 请求对象
     * @return CreateRepositoryResponse
     */
    public CreateRepositoryResponse createRepository(CreateRepositoryRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createRepository);
    }

    /**
     * 创建仓库
     *
     * 用指定的名称在指定项目上创建仓库。传入参数：仓库名、模板id、是否导入项目成员、归属项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRepositoryRequest 请求对象
     * @return SyncInvoker<CreateRepositoryRequest, CreateRepositoryResponse>
     */
    public SyncInvoker<CreateRepositoryRequest, CreateRepositoryResponse> createRepositoryInvoker(
        CreateRepositoryRequest request) {
        return new SyncInvoker<CreateRepositoryRequest, CreateRepositoryResponse>(request, CodeHubMeta.createRepository,
            hcClient);
    }

    /**
     * 删除仓库部署密钥
     *
     * 删除仓库部署密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeployKeyRequest 请求对象
     * @return DeleteDeployKeyResponse
     */
    public DeleteDeployKeyResponse deleteDeployKey(DeleteDeployKeyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.deleteDeployKey);
    }

    /**
     * 删除仓库部署密钥
     *
     * 删除仓库部署密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeployKeyRequest 请求对象
     * @return SyncInvoker<DeleteDeployKeyRequest, DeleteDeployKeyResponse>
     */
    public SyncInvoker<DeleteDeployKeyRequest, DeleteDeployKeyResponse> deleteDeployKeyInvoker(
        DeleteDeployKeyRequest request) {
        return new SyncInvoker<DeleteDeployKeyRequest, DeleteDeployKeyResponse>(request, CodeHubMeta.deleteDeployKey,
            hcClient);
    }

    /**
     * 删除仓库部署密钥
     *
     * 删除仓库部署密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeployKeyV2Request 请求对象
     * @return DeleteDeployKeyV2Response
     */
    public DeleteDeployKeyV2Response deleteDeployKeyV2(DeleteDeployKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.deleteDeployKeyV2);
    }

    /**
     * 删除仓库部署密钥
     *
     * 删除仓库部署密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeployKeyV2Request 请求对象
     * @return SyncInvoker<DeleteDeployKeyV2Request, DeleteDeployKeyV2Response>
     */
    public SyncInvoker<DeleteDeployKeyV2Request, DeleteDeployKeyV2Response> deleteDeployKeyV2Invoker(
        DeleteDeployKeyV2Request request) {
        return new SyncInvoker<DeleteDeployKeyV2Request, DeleteDeployKeyV2Response>(request,
            CodeHubMeta.deleteDeployKeyV2, hcClient);
    }

    /**
     * 删除仓库
     *
     * 根据仓库32位uuid删除指定的仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRepositoryRequest 请求对象
     * @return DeleteRepositoryResponse
     */
    public DeleteRepositoryResponse deleteRepository(DeleteRepositoryRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.deleteRepository);
    }

    /**
     * 删除仓库
     *
     * 根据仓库32位uuid删除指定的仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRepositoryRequest 请求对象
     * @return SyncInvoker<DeleteRepositoryRequest, DeleteRepositoryResponse>
     */
    public SyncInvoker<DeleteRepositoryRequest, DeleteRepositoryResponse> deleteRepositoryInvoker(
        DeleteRepositoryRequest request) {
        return new SyncInvoker<DeleteRepositoryRequest, DeleteRepositoryResponse>(request, CodeHubMeta.deleteRepository,
            hcClient);
    }

    /**
     * 查询项目下的某个仓库
     *
     * 不建议再使用,建议使用/{repository_uuid}/status
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param GetRepositoryByProjectIdRequest 请求对象
     * @return GetRepositoryByProjectIdResponse
     */
    public GetRepositoryByProjectIdResponse getRepositoryByProjectId(GetRepositoryByProjectIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.getRepositoryByProjectId);
    }

    /**
     * 查询项目下的某个仓库
     *
     * 不建议再使用,建议使用/{repository_uuid}/status
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param GetRepositoryByProjectIdRequest 请求对象
     * @return SyncInvoker<GetRepositoryByProjectIdRequest, GetRepositoryByProjectIdResponse>
     */
    public SyncInvoker<GetRepositoryByProjectIdRequest, GetRepositoryByProjectIdResponse> getRepositoryByProjectIdInvoker(
        GetRepositoryByProjectIdRequest request) {
        return new SyncInvoker<GetRepositoryByProjectIdRequest, GetRepositoryByProjectIdResponse>(request,
            CodeHubMeta.getRepositoryByProjectId, hcClient);
    }

    /**
     * 获取公开示例模板列表
     *
     * 获取公开示例模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param GetTemplatesRequest 请求对象
     * @return GetTemplatesResponse
     */
    public GetTemplatesResponse getTemplates(GetTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.getTemplates);
    }

    /**
     * 获取公开示例模板列表
     *
     * 获取公开示例模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param GetTemplatesRequest 请求对象
     * @return SyncInvoker<GetTemplatesRequest, GetTemplatesResponse>
     */
    public SyncInvoker<GetTemplatesRequest, GetTemplatesResponse> getTemplatesInvoker(GetTemplatesRequest request) {
        return new SyncInvoker<GetTemplatesRequest, GetTemplatesResponse>(request, CodeHubMeta.getTemplates, hcClient);
    }

    /**
     * 获取仓库分支列表
     *
     * 获取仓库分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBranchesByRepositoryIdRequest 请求对象
     * @return ListBranchesByRepositoryIdResponse
     */
    public ListBranchesByRepositoryIdResponse listBranchesByRepositoryId(ListBranchesByRepositoryIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listBranchesByRepositoryId);
    }

    /**
     * 获取仓库分支列表
     *
     * 获取仓库分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListBranchesByRepositoryIdRequest 请求对象
     * @return SyncInvoker<ListBranchesByRepositoryIdRequest, ListBranchesByRepositoryIdResponse>
     */
    public SyncInvoker<ListBranchesByRepositoryIdRequest, ListBranchesByRepositoryIdResponse> listBranchesByRepositoryIdInvoker(
        ListBranchesByRepositoryIdRequest request) {
        return new SyncInvoker<ListBranchesByRepositoryIdRequest, ListBranchesByRepositoryIdResponse>(request,
            CodeHubMeta.listBranchesByRepositoryId, hcClient);
    }

    /**
     * 获取仓库上一次的提交统计信息
     *
     * 获取仓库上一次的提交统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCommitStatisticsRequest 请求对象
     * @return ListCommitStatisticsResponse
     */
    public ListCommitStatisticsResponse listCommitStatistics(ListCommitStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listCommitStatistics);
    }

    /**
     * 获取仓库上一次的提交统计信息
     *
     * 获取仓库上一次的提交统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCommitStatisticsRequest 请求对象
     * @return SyncInvoker<ListCommitStatisticsRequest, ListCommitStatisticsResponse>
     */
    public SyncInvoker<ListCommitStatisticsRequest, ListCommitStatisticsResponse> listCommitStatisticsInvoker(
        ListCommitStatisticsRequest request) {
        return new SyncInvoker<ListCommitStatisticsRequest, ListCommitStatisticsResponse>(request,
            CodeHubMeta.listCommitStatistics, hcClient);
    }

    /**
     * 获取一个仓库下特定分支指定文件内容
     *
     * 获取一个仓库下特定分支指定文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFilesRequest 请求对象
     * @return ListFilesResponse
     */
    public ListFilesResponse listFiles(ListFilesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listFiles);
    }

    /**
     * 获取一个仓库下特定分支指定文件内容
     *
     * 获取一个仓库下特定分支指定文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFilesRequest 请求对象
     * @return SyncInvoker<ListFilesRequest, ListFilesResponse>
     */
    public SyncInvoker<ListFilesRequest, ListFilesResponse> listFilesInvoker(ListFilesRequest request) {
        return new SyncInvoker<ListFilesRequest, ListFilesResponse>(request, CodeHubMeta.listFiles, hcClient);
    }

    /**
     * 获取仓库合并请求列表
     *
     * 获取仓库合并请求列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMergeRequestRequest 请求对象
     * @return ListMergeRequestResponse
     */
    public ListMergeRequestResponse listMergeRequest(ListMergeRequestRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listMergeRequest);
    }

    /**
     * 获取仓库合并请求列表
     *
     * 获取仓库合并请求列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListMergeRequestRequest 请求对象
     * @return SyncInvoker<ListMergeRequestRequest, ListMergeRequestResponse>
     */
    public SyncInvoker<ListMergeRequestRequest, ListMergeRequestResponse> listMergeRequestInvoker(
        ListMergeRequestRequest request) {
        return new SyncInvoker<ListMergeRequestRequest, ListMergeRequestResponse>(request, CodeHubMeta.listMergeRequest,
            hcClient);
    }

    /**
     * 查看仓库的创建状态
     *
     * 获取仓库状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRepositoryStatusRequest 请求对象
     * @return ListRepositoryStatusResponse
     */
    public ListRepositoryStatusResponse listRepositoryStatus(ListRepositoryStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listRepositoryStatus);
    }

    /**
     * 查看仓库的创建状态
     *
     * 获取仓库状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRepositoryStatusRequest 请求对象
     * @return SyncInvoker<ListRepositoryStatusRequest, ListRepositoryStatusResponse>
     */
    public SyncInvoker<ListRepositoryStatusRequest, ListRepositoryStatusResponse> listRepositoryStatusInvoker(
        ListRepositoryStatusRequest request) {
        return new SyncInvoker<ListRepositoryStatusRequest, ListRepositoryStatusResponse>(request,
            CodeHubMeta.listRepositoryStatus, hcClient);
    }

    /**
     * 获取分支目录下的文件
     *
     * 获取分支目录下的文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubfilesRequest 请求对象
     * @return ListSubfilesResponse
     */
    public ListSubfilesResponse listSubfiles(ListSubfilesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listSubfiles);
    }

    /**
     * 获取分支目录下的文件
     *
     * 获取分支目录下的文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSubfilesRequest 请求对象
     * @return SyncInvoker<ListSubfilesRequest, ListSubfilesResponse>
     */
    public SyncInvoker<ListSubfilesRequest, ListSubfilesResponse> listSubfilesInvoker(ListSubfilesRequest request) {
        return new SyncInvoker<ListSubfilesRequest, ListSubfilesResponse>(request, CodeHubMeta.listSubfiles, hcClient);
    }

    /**
     * 设置仓库是公开状态还是私有状态
     *
     * 设置仓库是公开状态还是私有状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplatesTwoRequest 请求对象
     * @return ListTemplatesTwoResponse
     */
    public ListTemplatesTwoResponse listTemplatesTwo(ListTemplatesTwoRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listTemplatesTwo);
    }

    /**
     * 设置仓库是公开状态还是私有状态
     *
     * 设置仓库是公开状态还是私有状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplatesTwoRequest 请求对象
     * @return SyncInvoker<ListTemplatesTwoRequest, ListTemplatesTwoResponse>
     */
    public SyncInvoker<ListTemplatesTwoRequest, ListTemplatesTwoResponse> listTemplatesTwoInvoker(
        ListTemplatesTwoRequest request) {
        return new SyncInvoker<ListTemplatesTwoRequest, ListTemplatesTwoResponse>(request, CodeHubMeta.listTemplatesTwo,
            hcClient);
    }

    /**
     * 获取公开示例模板列表
     *
     * 获取公开示例模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTwoTemplatesRequest 请求对象
     * @return ListTwoTemplatesResponse
     */
    public ListTwoTemplatesResponse listTwoTemplates(ListTwoTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listTwoTemplates);
    }

    /**
     * 获取公开示例模板列表
     *
     * 获取公开示例模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTwoTemplatesRequest 请求对象
     * @return SyncInvoker<ListTwoTemplatesRequest, ListTwoTemplatesResponse>
     */
    public SyncInvoker<ListTwoTemplatesRequest, ListTwoTemplatesResponse> listTwoTemplatesInvoker(
        ListTwoTemplatesRequest request) {
        return new SyncInvoker<ListTwoTemplatesRequest, ListTwoTemplatesResponse>(request, CodeHubMeta.listTwoTemplates,
            hcClient);
    }

    /**
     * 设置仓库是公开状态还是私有状态
     *
     * 设置仓库是公开状态还是私有状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShareTemplatesRequest 请求对象
     * @return ShareTemplatesResponse
     */
    public ShareTemplatesResponse shareTemplates(ShareTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.shareTemplates);
    }

    /**
     * 设置仓库是公开状态还是私有状态
     *
     * 设置仓库是公开状态还是私有状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShareTemplatesRequest 请求对象
     * @return SyncInvoker<ShareTemplatesRequest, ShareTemplatesResponse>
     */
    public SyncInvoker<ShareTemplatesRequest, ShareTemplatesResponse> shareTemplatesInvoker(
        ShareTemplatesRequest request) {
        return new SyncInvoker<ShareTemplatesRequest, ShareTemplatesResponse>(request, CodeHubMeta.shareTemplates,
            hcClient);
    }

    /**
     * 查询某仓库对应的分支
     *
     * 根据仓库id获取指定仓库的分支列表.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBranchesByRepositoryIdRequest 请求对象
     * @return ShowBranchesByRepositoryIdResponse
     */
    public ShowBranchesByRepositoryIdResponse showBranchesByRepositoryId(ShowBranchesByRepositoryIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showBranchesByRepositoryId);
    }

    /**
     * 查询某仓库对应的分支
     *
     * 根据仓库id获取指定仓库的分支列表.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBranchesByRepositoryIdRequest 请求对象
     * @return SyncInvoker<ShowBranchesByRepositoryIdRequest, ShowBranchesByRepositoryIdResponse>
     */
    public SyncInvoker<ShowBranchesByRepositoryIdRequest, ShowBranchesByRepositoryIdResponse> showBranchesByRepositoryIdInvoker(
        ShowBranchesByRepositoryIdRequest request) {
        return new SyncInvoker<ShowBranchesByRepositoryIdRequest, ShowBranchesByRepositoryIdResponse>(request,
            CodeHubMeta.showBranchesByRepositoryId, hcClient);
    }

    /**
     * 查询某仓库的标签列表
     *
     * 查询指定仓库对应的分支。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBranchesByTwoRepositoryIdRequest 请求对象
     * @return ShowBranchesByTwoRepositoryIdResponse
     */
    public ShowBranchesByTwoRepositoryIdResponse showBranchesByTwoRepositoryId(
        ShowBranchesByTwoRepositoryIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showBranchesByTwoRepositoryId);
    }

    /**
     * 查询某仓库的标签列表
     *
     * 查询指定仓库对应的分支。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBranchesByTwoRepositoryIdRequest 请求对象
     * @return SyncInvoker<ShowBranchesByTwoRepositoryIdRequest, ShowBranchesByTwoRepositoryIdResponse>
     */
    public SyncInvoker<ShowBranchesByTwoRepositoryIdRequest, ShowBranchesByTwoRepositoryIdResponse> showBranchesByTwoRepositoryIdInvoker(
        ShowBranchesByTwoRepositoryIdRequest request) {
        return new SyncInvoker<ShowBranchesByTwoRepositoryIdRequest, ShowBranchesByTwoRepositoryIdResponse>(request,
            CodeHubMeta.showBranchesByTwoRepositoryId, hcClient);
    }

    /**
     * 根据组名和仓库名查询某仓库某分支对应的提交
     *
     * 根据仓库组名、仓库名和分支获取提交列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCommitsByBranchRequest 请求对象
     * @return ShowCommitsByBranchResponse
     */
    public ShowCommitsByBranchResponse showCommitsByBranch(ShowCommitsByBranchRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showCommitsByBranch);
    }

    /**
     * 根据组名和仓库名查询某仓库某分支对应的提交
     *
     * 根据仓库组名、仓库名和分支获取提交列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCommitsByBranchRequest 请求对象
     * @return SyncInvoker<ShowCommitsByBranchRequest, ShowCommitsByBranchResponse>
     */
    public SyncInvoker<ShowCommitsByBranchRequest, ShowCommitsByBranchResponse> showCommitsByBranchInvoker(
        ShowCommitsByBranchRequest request) {
        return new SyncInvoker<ShowCommitsByBranchRequest, ShowCommitsByBranchResponse>(request,
            CodeHubMeta.showCommitsByBranch, hcClient);
    }

    /**
     * 根据仓库id查询仓库某分支对应的提交，提供更多可选参数
     *
     * 根据仓库id查询仓库某分支对应的提交.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCommitsByRepoIdRequest 请求对象
     * @return ShowCommitsByRepoIdResponse
     */
    public ShowCommitsByRepoIdResponse showCommitsByRepoId(ShowCommitsByRepoIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showCommitsByRepoId);
    }

    /**
     * 根据仓库id查询仓库某分支对应的提交，提供更多可选参数
     *
     * 根据仓库id查询仓库某分支对应的提交.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCommitsByRepoIdRequest 请求对象
     * @return SyncInvoker<ShowCommitsByRepoIdRequest, ShowCommitsByRepoIdResponse>
     */
    public SyncInvoker<ShowCommitsByRepoIdRequest, ShowCommitsByRepoIdResponse> showCommitsByRepoIdInvoker(
        ShowCommitsByRepoIdRequest request) {
        return new SyncInvoker<ShowCommitsByRepoIdRequest, ShowCommitsByRepoIdResponse>(request,
            CodeHubMeta.showCommitsByRepoId, hcClient);
    }

    /**
     * 修改被流水线引用的仓库状态
     *
     * 修改被流水线引用的仓库状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHasPipelineRequest 请求对象
     * @return ShowHasPipelineResponse
     */
    public ShowHasPipelineResponse showHasPipeline(ShowHasPipelineRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showHasPipeline);
    }

    /**
     * 修改被流水线引用的仓库状态
     *
     * 修改被流水线引用的仓库状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHasPipelineRequest 请求对象
     * @return SyncInvoker<ShowHasPipelineRequest, ShowHasPipelineResponse>
     */
    public SyncInvoker<ShowHasPipelineRequest, ShowHasPipelineResponse> showHasPipelineInvoker(
        ShowHasPipelineRequest request) {
        return new SyncInvoker<ShowHasPipelineRequest, ShowHasPipelineResponse>(request, CodeHubMeta.showHasPipeline,
            hcClient);
    }

    /**
     * 获取一个仓库下特定分支的图片文件
     *
     * 获取一个仓库下特定分支的图片文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageBlobRequest 请求对象
     * @return ShowImageBlobResponse
     */
    public ShowImageBlobResponse showImageBlob(ShowImageBlobRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showImageBlob);
    }

    /**
     * 获取一个仓库下特定分支的图片文件
     *
     * 获取一个仓库下特定分支的图片文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowImageBlobRequest 请求对象
     * @return SyncInvoker<ShowImageBlobRequest, ShowImageBlobResponse>
     */
    public SyncInvoker<ShowImageBlobRequest, ShowImageBlobResponse> showImageBlobInvoker(ShowImageBlobRequest request) {
        return new SyncInvoker<ShowImageBlobRequest, ShowImageBlobResponse>(request, CodeHubMeta.showImageBlob,
            hcClient);
    }

    /**
     * 判断用户是否有仓库的管理员权限
     *
     * 判断用户是否有仓库的管理员权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMasterRequest 请求对象
     * @return ShowMasterResponse
     */
    public ShowMasterResponse showMaster(ShowMasterRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showMaster);
    }

    /**
     * 判断用户是否有仓库的管理员权限
     *
     * 判断用户是否有仓库的管理员权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMasterRequest 请求对象
     * @return SyncInvoker<ShowMasterRequest, ShowMasterResponse>
     */
    public SyncInvoker<ShowMasterRequest, ShowMasterResponse> showMasterInvoker(ShowMasterRequest request) {
        return new SyncInvoker<ShowMasterRequest, ShowMasterResponse>(request, CodeHubMeta.showMaster, hcClient);
    }

    /**
     * 获取仓库合并请求详情
     *
     * 获取仓库合并请求详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMergeRequestRequest 请求对象
     * @return ShowMergeRequestResponse
     */
    public ShowMergeRequestResponse showMergeRequest(ShowMergeRequestRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showMergeRequest);
    }

    /**
     * 获取仓库合并请求详情
     *
     * 获取仓库合并请求详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowMergeRequestRequest 请求对象
     * @return SyncInvoker<ShowMergeRequestRequest, ShowMergeRequestResponse>
     */
    public SyncInvoker<ShowMergeRequestRequest, ShowMergeRequestResponse> showMergeRequestInvoker(
        ShowMergeRequestRequest request) {
        return new SyncInvoker<ShowMergeRequestRequest, ShowMergeRequestResponse>(request, CodeHubMeta.showMergeRequest,
            hcClient);
    }

    /**
     * 根据仓库名组名获取仓库短id，用以拼接与commitid对应提交详情页面url
     *
     * 获取仓库短id,用于获取仓库详情页面url
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRepoIdRequest 请求对象
     * @return ShowRepoIdResponse
     */
    public ShowRepoIdResponse showRepoId(ShowRepoIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showRepoId);
    }

    /**
     * 根据仓库名组名获取仓库短id，用以拼接与commitid对应提交详情页面url
     *
     * 获取仓库短id,用于获取仓库详情页面url
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRepoIdRequest 请求对象
     * @return SyncInvoker<ShowRepoIdRequest, ShowRepoIdResponse>
     */
    public SyncInvoker<ShowRepoIdRequest, ShowRepoIdResponse> showRepoIdInvoker(ShowRepoIdRequest request) {
        return new SyncInvoker<ShowRepoIdRequest, ShowRepoIdResponse>(request, CodeHubMeta.showRepoId, hcClient);
    }

    /**
     * 下载仓库
     *
     * 按照指定格式下载仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRepositoryArchiveRequest 请求对象
     * @return ShowRepositoryArchiveResponse
     */
    public ShowRepositoryArchiveResponse showRepositoryArchive(ShowRepositoryArchiveRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showRepositoryArchive);
    }

    /**
     * 下载仓库
     *
     * 按照指定格式下载仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRepositoryArchiveRequest 请求对象
     * @return SyncInvoker<ShowRepositoryArchiveRequest, ShowRepositoryArchiveResponse>
     */
    public SyncInvoker<ShowRepositoryArchiveRequest, ShowRepositoryArchiveResponse> showRepositoryArchiveInvoker(
        ShowRepositoryArchiveRequest request) {
        return new SyncInvoker<ShowRepositoryArchiveRequest, ShowRepositoryArchiveResponse>(request,
            CodeHubMeta.showRepositoryArchive, hcClient);
    }

    /**
     * 查询某个仓库的详细信息
     *
     * 根据仓库UUID(由CreateRepository接口返回)获取仓库信息仓库信息。返回 包含id，name，组名，仓库访问URL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRepositoryByUuidRequest 请求对象
     * @return ShowRepositoryByUuidResponse
     */
    public ShowRepositoryByUuidResponse showRepositoryByUuid(ShowRepositoryByUuidRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showRepositoryByUuid);
    }

    /**
     * 查询某个仓库的详细信息
     *
     * 根据仓库UUID(由CreateRepository接口返回)获取仓库信息仓库信息。返回 包含id，name，组名，仓库访问URL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRepositoryByUuidRequest 请求对象
     * @return SyncInvoker<ShowRepositoryByUuidRequest, ShowRepositoryByUuidResponse>
     */
    public SyncInvoker<ShowRepositoryByUuidRequest, ShowRepositoryByUuidResponse> showRepositoryByUuidInvoker(
        ShowRepositoryByUuidRequest request) {
        return new SyncInvoker<ShowRepositoryByUuidRequest, ShowRepositoryByUuidResponse>(request,
            CodeHubMeta.showRepositoryByUuid, hcClient);
    }

    /**
     * 仓库统计
     *
     * 根据仓库短id，查询仓库的代码提交记录统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRepositoryStatisticsRequest 请求对象
     * @return ShowRepositoryStatisticsResponse
     */
    public ShowRepositoryStatisticsResponse showRepositoryStatistics(ShowRepositoryStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showRepositoryStatistics);
    }

    /**
     * 仓库统计
     *
     * 根据仓库短id，查询仓库的代码提交记录统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRepositoryStatisticsRequest 请求对象
     * @return SyncInvoker<ShowRepositoryStatisticsRequest, ShowRepositoryStatisticsResponse>
     */
    public SyncInvoker<ShowRepositoryStatisticsRequest, ShowRepositoryStatisticsResponse> showRepositoryStatisticsInvoker(
        ShowRepositoryStatisticsRequest request) {
        return new SyncInvoker<ShowRepositoryStatisticsRequest, ShowRepositoryStatisticsResponse>(request,
            CodeHubMeta.showRepositoryStatistics, hcClient);
    }

    /**
     * 获取代码提交行数
     *
     * 获取指定日期内代码仓指定分支的代码提交行数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStatisticCommitRequest 请求对象
     * @return ShowStatisticCommitResponse
     */
    public ShowStatisticCommitResponse showStatisticCommit(ShowStatisticCommitRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showStatisticCommit);
    }

    /**
     * 获取代码提交行数
     *
     * 获取指定日期内代码仓指定分支的代码提交行数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStatisticCommitRequest 请求对象
     * @return SyncInvoker<ShowStatisticCommitRequest, ShowStatisticCommitResponse>
     */
    public SyncInvoker<ShowStatisticCommitRequest, ShowStatisticCommitResponse> showStatisticCommitInvoker(
        ShowStatisticCommitRequest request) {
        return new SyncInvoker<ShowStatisticCommitRequest, ShowStatisticCommitResponse>(request,
            CodeHubMeta.showStatisticCommit, hcClient);
    }

    /**
     * 获取代码提交行数
     *
     * 获取指定日期内代码仓指定分支的代码提交行数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStatisticCommitV3Request 请求对象
     * @return ShowStatisticCommitV3Response
     */
    public ShowStatisticCommitV3Response showStatisticCommitV3(ShowStatisticCommitV3Request request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showStatisticCommitV3);
    }

    /**
     * 获取代码提交行数
     *
     * 获取指定日期内代码仓指定分支的代码提交行数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStatisticCommitV3Request 请求对象
     * @return SyncInvoker<ShowStatisticCommitV3Request, ShowStatisticCommitV3Response>
     */
    public SyncInvoker<ShowStatisticCommitV3Request, ShowStatisticCommitV3Response> showStatisticCommitV3Invoker(
        ShowStatisticCommitV3Request request) {
        return new SyncInvoker<ShowStatisticCommitV3Request, ShowStatisticCommitV3Response>(request,
            CodeHubMeta.showStatisticCommitV3, hcClient);
    }

    /**
     * 获取仓库统计数据
     *
     * 获取仓库统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStatisticalDataRequest 请求对象
     * @return ShowStatisticalDataResponse
     */
    public ShowStatisticalDataResponse showStatisticalData(ShowStatisticalDataRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showStatisticalData);
    }

    /**
     * 获取仓库统计数据
     *
     * 获取仓库统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStatisticalDataRequest 请求对象
     * @return SyncInvoker<ShowStatisticalDataRequest, ShowStatisticalDataResponse>
     */
    public SyncInvoker<ShowStatisticalDataRequest, ShowStatisticalDataResponse> showStatisticalDataInvoker(
        ShowStatisticalDataRequest request) {
        return new SyncInvoker<ShowStatisticalDataRequest, ShowStatisticalDataResponse>(request,
            CodeHubMeta.showStatisticalData, hcClient);
    }

    /**
     * 添加ssh key
     *
     * 添加ssh key
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddSshKeyRequest 请求对象
     * @return AddSshKeyResponse
     */
    public AddSshKeyResponse addSshKey(AddSshKeyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.addSshKey);
    }

    /**
     * 添加ssh key
     *
     * 添加ssh key
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddSshKeyRequest 请求对象
     * @return SyncInvoker<AddSshKeyRequest, AddSshKeyResponse>
     */
    public SyncInvoker<AddSshKeyRequest, AddSshKeyResponse> addSshKeyInvoker(AddSshKeyRequest request) {
        return new SyncInvoker<AddSshKeyRequest, AddSshKeyResponse>(request, CodeHubMeta.addSshKey, hcClient);
    }

    /**
     * 删除用户公钥
     *
     * 删除用户公钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSShkeyRequest 请求对象
     * @return DeleteSShkeyResponse
     */
    public DeleteSShkeyResponse deleteSShkey(DeleteSShkeyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.deleteSShkey);
    }

    /**
     * 删除用户公钥
     *
     * 删除用户公钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSShkeyRequest 请求对象
     * @return SyncInvoker<DeleteSShkeyRequest, DeleteSShkeyResponse>
     */
    public SyncInvoker<DeleteSShkeyRequest, DeleteSShkeyResponse> deleteSShkeyInvoker(DeleteSShkeyRequest request) {
        return new SyncInvoker<DeleteSShkeyRequest, DeleteSShkeyResponse>(request, CodeHubMeta.deleteSShkey, hcClient);
    }

    /**
     * 获取ssh key列表
     *
     * 获取ssh key列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSshKeysRequest 请求对象
     * @return ListSshKeysResponse
     */
    public ListSshKeysResponse listSshKeys(ListSshKeysRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listSshKeys);
    }

    /**
     * 获取ssh key列表
     *
     * 获取ssh key列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSshKeysRequest 请求对象
     * @return SyncInvoker<ListSshKeysRequest, ListSshKeysResponse>
     */
    public SyncInvoker<ListSshKeysRequest, ListSshKeysResponse> listSshKeysInvoker(ListSshKeysRequest request) {
        return new SyncInvoker<ListSshKeysRequest, ListSshKeysResponse>(request, CodeHubMeta.listSshKeys, hcClient);
    }

    /**
     * 检验私钥是否有拉取代码的权限
     *
     * 检验私钥是否有拉取代码的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivateKeyVerifyRequest 请求对象
     * @return ShowPrivateKeyVerifyResponse
     */
    public ShowPrivateKeyVerifyResponse showPrivateKeyVerify(ShowPrivateKeyVerifyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showPrivateKeyVerify);
    }

    /**
     * 检验私钥是否有拉取代码的权限
     *
     * 检验私钥是否有拉取代码的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivateKeyVerifyRequest 请求对象
     * @return SyncInvoker<ShowPrivateKeyVerifyRequest, ShowPrivateKeyVerifyResponse>
     */
    public SyncInvoker<ShowPrivateKeyVerifyRequest, ShowPrivateKeyVerifyResponse> showPrivateKeyVerifyInvoker(
        ShowPrivateKeyVerifyRequest request) {
        return new SyncInvoker<ShowPrivateKeyVerifyRequest, ShowPrivateKeyVerifyResponse>(request,
            CodeHubMeta.showPrivateKeyVerify, hcClient);
    }

    /**
     *  https账号密码校验
     *
     * 判断用户使用 https 上传/下载代码时输入的用户名和密码是否合法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ValidateHttpsInfoRequest 请求对象
     * @return ValidateHttpsInfoResponse
     */
    public ValidateHttpsInfoResponse validateHttpsInfo(ValidateHttpsInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.validateHttpsInfo);
    }

    /**
     *  https账号密码校验
     *
     * 判断用户使用 https 上传/下载代码时输入的用户名和密码是否合法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ValidateHttpsInfoRequest 请求对象
     * @return SyncInvoker<ValidateHttpsInfoRequest, ValidateHttpsInfoResponse>
     */
    public SyncInvoker<ValidateHttpsInfoRequest, ValidateHttpsInfoResponse> validateHttpsInfoInvoker(
        ValidateHttpsInfoRequest request) {
        return new SyncInvoker<ValidateHttpsInfoRequest, ValidateHttpsInfoResponse>(request,
            CodeHubMeta.validateHttpsInfo, hcClient);
    }

    /**
     * https账号密码校验
     *
     * 判断用户使用 https 上传/下载代码时输入的用户名和密码是否合法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ValidateHttpsInfoV2Request 请求对象
     * @return ValidateHttpsInfoV2Response
     */
    public ValidateHttpsInfoV2Response validateHttpsInfoV2(ValidateHttpsInfoV2Request request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.validateHttpsInfoV2);
    }

    /**
     * https账号密码校验
     *
     * 判断用户使用 https 上传/下载代码时输入的用户名和密码是否合法。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ValidateHttpsInfoV2Request 请求对象
     * @return SyncInvoker<ValidateHttpsInfoV2Request, ValidateHttpsInfoV2Response>
     */
    public SyncInvoker<ValidateHttpsInfoV2Request, ValidateHttpsInfoV2Response> validateHttpsInfoV2Invoker(
        ValidateHttpsInfoV2Request request) {
        return new SyncInvoker<ValidateHttpsInfoV2Request, ValidateHttpsInfoV2Response>(request,
            CodeHubMeta.validateHttpsInfoV2, hcClient);
    }

    /**
     * 创建分支
     *
     * 根据仓库id在指定仓库中创建分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNewBranchRequest 请求对象
     * @return CreateNewBranchResponse
     */
    public CreateNewBranchResponse createNewBranch(CreateNewBranchRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createNewBranch);
    }

    /**
     * 创建分支
     *
     * 根据仓库id在指定仓库中创建分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateNewBranchRequest 请求对象
     * @return SyncInvoker<CreateNewBranchRequest, CreateNewBranchResponse>
     */
    public SyncInvoker<CreateNewBranchRequest, CreateNewBranchResponse> createNewBranchInvoker(
        CreateNewBranchRequest request) {
        return new SyncInvoker<CreateNewBranchRequest, CreateNewBranchResponse>(request, CodeHubMeta.createNewBranch,
            hcClient);
    }

    /**
     * 分支关联工作项
     *
     * 分支关联工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateIssuesRequest 请求对象
     * @return AssociateIssuesResponse
     */
    public AssociateIssuesResponse associateIssues(AssociateIssuesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.associateIssues);
    }

    /**
     * 分支关联工作项
     *
     * 分支关联工作项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateIssuesRequest 请求对象
     * @return SyncInvoker<AssociateIssuesRequest, AssociateIssuesResponse>
     */
    public SyncInvoker<AssociateIssuesRequest, AssociateIssuesResponse> associateIssuesInvoker(
        AssociateIssuesRequest request) {
        return new SyncInvoker<AssociateIssuesRequest, AssociateIssuesResponse>(request, CodeHubMeta.associateIssues,
            hcClient);
    }

    /**
     * 创建项目、仓库
     *
     * 创建项目后，创建仓库组由后台生成方式 传入参数：仓库名、模板id、是否导入项目成员、归属项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProjectAndRepositoriesRequest 请求对象
     * @return CreateProjectAndRepositoriesResponse
     */
    public CreateProjectAndRepositoriesResponse createProjectAndRepositories(
        CreateProjectAndRepositoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createProjectAndRepositories);
    }

    /**
     * 创建项目、仓库
     *
     * 创建项目后，创建仓库组由后台生成方式 传入参数：仓库名、模板id、是否导入项目成员、归属项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProjectAndRepositoriesRequest 请求对象
     * @return SyncInvoker<CreateProjectAndRepositoriesRequest, CreateProjectAndRepositoriesResponse>
     */
    public SyncInvoker<CreateProjectAndRepositoriesRequest, CreateProjectAndRepositoriesResponse> createProjectAndRepositoriesInvoker(
        CreateProjectAndRepositoriesRequest request) {
        return new SyncInvoker<CreateProjectAndRepositoriesRequest, CreateProjectAndRepositoriesResponse>(request,
            CodeHubMeta.createProjectAndRepositories, hcClient);
    }

    /**
     * 创建项目并fork仓库
     *
     * 创建仓库后fork仓库 传入参数：仓库名、是否导入项目成员、归属项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProjectAndforkRepositoriesRequest 请求对象
     * @return CreateProjectAndforkRepositoriesResponse
     */
    public CreateProjectAndforkRepositoriesResponse createProjectAndforkRepositories(
        CreateProjectAndforkRepositoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createProjectAndforkRepositories);
    }

    /**
     * 创建项目并fork仓库
     *
     * 创建仓库后fork仓库 传入参数：仓库名、是否导入项目成员、归属项目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateProjectAndforkRepositoriesRequest 请求对象
     * @return SyncInvoker<CreateProjectAndforkRepositoriesRequest, CreateProjectAndforkRepositoriesResponse>
     */
    public SyncInvoker<CreateProjectAndforkRepositoriesRequest, CreateProjectAndforkRepositoriesResponse> createProjectAndforkRepositoriesInvoker(
        CreateProjectAndforkRepositoriesRequest request) {
        return new SyncInvoker<CreateProjectAndforkRepositoriesRequest, CreateProjectAndforkRepositoriesResponse>(
            request, CodeHubMeta.createProjectAndforkRepositories, hcClient);
    }

    /**
     * 查询用户的所有仓库
     *
     * 获取用户的所有仓库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUserAllRepositoriesRequest 请求对象
     * @return ListUserAllRepositoriesResponse
     */
    public ListUserAllRepositoriesResponse listUserAllRepositories(ListUserAllRepositoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listUserAllRepositories);
    }

    /**
     * 查询用户的所有仓库
     *
     * 获取用户的所有仓库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUserAllRepositoriesRequest 请求对象
     * @return SyncInvoker<ListUserAllRepositoriesRequest, ListUserAllRepositoriesResponse>
     */
    public SyncInvoker<ListUserAllRepositoriesRequest, ListUserAllRepositoriesResponse> listUserAllRepositoriesInvoker(
        ListUserAllRepositoriesRequest request) {
        return new SyncInvoker<ListUserAllRepositoriesRequest, ListUserAllRepositoriesResponse>(request,
            CodeHubMeta.listUserAllRepositories, hcClient);
    }

    /**
     * 查询项目下的所有仓库
     *
     * 获取仓库列表,模糊查询支持范围,如果未传入project uuid，则支持按仓库名或项目名模糊查询，否则，只按仓库名模糊匹配
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAllRepositoryByTwoProjectIdRequest 请求对象
     * @return ShowAllRepositoryByTwoProjectIdResponse
     */
    public ShowAllRepositoryByTwoProjectIdResponse showAllRepositoryByTwoProjectId(
        ShowAllRepositoryByTwoProjectIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showAllRepositoryByTwoProjectId);
    }

    /**
     * 查询项目下的所有仓库
     *
     * 获取仓库列表,模糊查询支持范围,如果未传入project uuid，则支持按仓库名或项目名模糊查询，否则，只按仓库名模糊匹配
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAllRepositoryByTwoProjectIdRequest 请求对象
     * @return SyncInvoker<ShowAllRepositoryByTwoProjectIdRequest, ShowAllRepositoryByTwoProjectIdResponse>
     */
    public SyncInvoker<ShowAllRepositoryByTwoProjectIdRequest, ShowAllRepositoryByTwoProjectIdResponse> showAllRepositoryByTwoProjectIdInvoker(
        ShowAllRepositoryByTwoProjectIdRequest request) {
        return new SyncInvoker<ShowAllRepositoryByTwoProjectIdRequest, ShowAllRepositoryByTwoProjectIdResponse>(request,
            CodeHubMeta.showAllRepositoryByTwoProjectId, hcClient);
    }

    /**
     * 为指定仓库添加hook
     *
     * 提交代码自动触发编译构建，添加仓库钩子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddHooksRequest 请求对象
     * @return AddHooksResponse
     */
    public AddHooksResponse addHooks(AddHooksRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.addHooks);
    }

    /**
     * 为指定仓库添加hook
     *
     * 提交代码自动触发编译构建，添加仓库钩子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddHooksRequest 请求对象
     * @return SyncInvoker<AddHooksRequest, AddHooksResponse>
     */
    public SyncInvoker<AddHooksRequest, AddHooksResponse> addHooksInvoker(AddHooksRequest request) {
        return new SyncInvoker<AddHooksRequest, AddHooksResponse>(request, CodeHubMeta.addHooks, hcClient);
    }

    /**
     * 删除指定仓库的 hook
     *
     * 提交代码自动触发编译构建，删除仓库钩子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteHooksRequest 请求对象
     * @return DeleteHooksResponse
     */
    public DeleteHooksResponse deleteHooks(DeleteHooksRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.deleteHooks);
    }

    /**
     * 删除指定仓库的 hook
     *
     * 提交代码自动触发编译构建，删除仓库钩子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteHooksRequest 请求对象
     * @return SyncInvoker<DeleteHooksRequest, DeleteHooksResponse>
     */
    public SyncInvoker<DeleteHooksRequest, DeleteHooksResponse> deleteHooksInvoker(DeleteHooksRequest request) {
        return new SyncInvoker<DeleteHooksRequest, DeleteHooksResponse>(request, CodeHubMeta.deleteHooks, hcClient);
    }

    /**
     * 查询指定仓库的webhook
     *
     * 获取仓库webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHooksRequest 请求对象
     * @return ListHooksResponse
     */
    public ListHooksResponse listHooks(ListHooksRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listHooks);
    }

    /**
     * 查询指定仓库的webhook
     *
     * 获取仓库webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHooksRequest 请求对象
     * @return SyncInvoker<ListHooksRequest, ListHooksResponse>
     */
    public SyncInvoker<ListHooksRequest, ListHooksResponse> listHooksInvoker(ListHooksRequest request) {
        return new SyncInvoker<ListHooksRequest, ListHooksResponse>(request, CodeHubMeta.listHooks, hcClient);
    }

}
