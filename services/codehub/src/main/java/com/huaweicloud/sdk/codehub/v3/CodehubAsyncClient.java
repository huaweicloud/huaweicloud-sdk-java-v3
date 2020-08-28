package com.huaweicloud.sdk.codehub.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.codehub.v3.model.*;

public class CodehubAsyncClient {
    protected HcClient hcClient;

    public CodehubAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodehubAsyncClient> newBuilder() {
        return new ClientBuilder<>(CodehubAsyncClient::new);
    }


    public CompletableFuture<GetAllRepositoryByProjectIdResponse> getAllRepositoryByProjectIdAsync(GetAllRepositoryByProjectIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.getAllRepositoryByProjectId);
    }

    public CompletableFuture<GetProductTemplatesResponse> getProductTemplatesAsync(GetProductTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.getProductTemplates);
    }

    public CompletableFuture<ListProductTwoTemplatesResponse> listProductTwoTemplatesAsync(ListProductTwoTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.listProductTwoTemplates);
    }

    public CompletableFuture<ShowRepositoryNameExistResponse> showRepositoryNameExistAsync(ShowRepositoryNameExistRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.showRepositoryNameExist);
    }

    public CompletableFuture<AddRepoMembersResponse> addRepoMembersAsync(AddRepoMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.addRepoMembers);
    }

    public CompletableFuture<DeleteRepoMemberResponse> deleteRepoMemberAsync(DeleteRepoMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.deleteRepoMember);
    }

    public CompletableFuture<ListRepoMembersResponse> listRepoMembersAsync(ListRepoMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.listRepoMembers);
    }

    public CompletableFuture<SetRepoRoleResponse> setRepoRoleAsync(SetRepoRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.setRepoRole);
    }

    public CompletableFuture<AddDeployKeyResponse> addDeployKeyAsync(AddDeployKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.addDeployKey);
    }

    public CompletableFuture<AddDeployKeyV2Response> addDeployKeyV2Async(AddDeployKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.addDeployKeyV2);
    }

    public CompletableFuture<CreateRepositoryResponse> createRepositoryAsync(CreateRepositoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.createRepository);
    }

    public CompletableFuture<DeleteDeployKeyResponse> deleteDeployKeyAsync(DeleteDeployKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.deleteDeployKey);
    }

    public CompletableFuture<DeleteDeployKeyV2Response> deleteDeployKeyV2Async(DeleteDeployKeyV2Request request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.deleteDeployKeyV2);
    }

    public CompletableFuture<DeleteRepositoryResponse> deleteRepositoryAsync(DeleteRepositoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.deleteRepository);
    }

    public CompletableFuture<GetRepositoryByProjectIdResponse> getRepositoryByProjectIdAsync(GetRepositoryByProjectIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.getRepositoryByProjectId);
    }

    public CompletableFuture<GetTemplatesResponse> getTemplatesAsync(GetTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.getTemplates);
    }

    public CompletableFuture<LaunchStatisticsResponse> launchStatisticsAsync(LaunchStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.launchStatistics);
    }

    public CompletableFuture<ListCommitStatisticsResponse> listCommitStatisticsAsync(ListCommitStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.listCommitStatistics);
    }

    public CompletableFuture<ListFilesResponse> listFilesAsync(ListFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.listFiles);
    }

    public CompletableFuture<ListRepositoryStatusResponse> listRepositoryStatusAsync(ListRepositoryStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.listRepositoryStatus);
    }

    public CompletableFuture<ListSubfilesResponse> listSubfilesAsync(ListSubfilesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.listSubfiles);
    }

    public CompletableFuture<ListTemplatesTwoResponse> listTemplatesTwoAsync(ListTemplatesTwoRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.listTemplatesTwo);
    }

    public CompletableFuture<ListTwoTemplatesResponse> listTwoTemplatesAsync(ListTwoTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.listTwoTemplates);
    }

    public CompletableFuture<ShareTemplatesResponse> shareTemplatesAsync(ShareTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.shareTemplates);
    }

    public CompletableFuture<ShowBranchesByRepositoryIdResponse> showBranchesByRepositoryIdAsync(ShowBranchesByRepositoryIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.showBranchesByRepositoryId);
    }

    public CompletableFuture<ShowBranchesByTwoRepositoryIdResponse> showBranchesByTwoRepositoryIdAsync(ShowBranchesByTwoRepositoryIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.showBranchesByTwoRepositoryId);
    }

    public CompletableFuture<ShowCommitsByBranchResponse> showCommitsByBranchAsync(ShowCommitsByBranchRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.showCommitsByBranch);
    }

    public CompletableFuture<ShowCommitsByRepoIdResponse> showCommitsByRepoIdAsync(ShowCommitsByRepoIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.showCommitsByRepoId);
    }

    public CompletableFuture<ShowHasPipelineResponse> showHasPipelineAsync(ShowHasPipelineRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.showHasPipeline);
    }

    public CompletableFuture<ShowImageBlobResponse> showImageBlobAsync(ShowImageBlobRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.showImageBlob);
    }

    public CompletableFuture<ShowMasterResponse> showMasterAsync(ShowMasterRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.showMaster);
    }

    public CompletableFuture<ShowRepoIdResponse> showRepoIdAsync(ShowRepoIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.showRepoId);
    }

    public CompletableFuture<ShowRepositoryByUUIdResponse> showRepositoryByUUIdAsync(ShowRepositoryByUUIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.showRepositoryByUUId);
    }

    public CompletableFuture<ShowStatisticalDataResponse> showStatisticalDataAsync(ShowStatisticalDataRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.showStatisticalData);
    }

    public CompletableFuture<AddSshKeyResponse> addSshKeyAsync(AddSshKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.addSshKey);
    }

    public CompletableFuture<DeleteSShkeyResponse> deleteSShkeyAsync(DeleteSShkeyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.deleteSShkey);
    }

    public CompletableFuture<ListSSHKeysResponse> listSSHKeysAsync(ListSSHKeysRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.listSSHKeys);
    }

    public CompletableFuture<ShowPrivateKeyVerifyResponse> showPrivateKeyVerifyAsync(ShowPrivateKeyVerifyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.showPrivateKeyVerify);
    }

    public CompletableFuture<ValidateHttpsInfoResponse> validateHttpsInfoAsync(ValidateHttpsInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.validateHttpsInfo);
    }

    public CompletableFuture<ValidateHttpsInfoV2Response> validateHttpsInfoV2Async(ValidateHttpsInfoV2Request request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.validateHttpsInfoV2);
    }

    public CompletableFuture<CreateProjectAndRepositoriesResponse> createProjectAndRepositoriesAsync(CreateProjectAndRepositoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.createProjectAndRepositories);
    }

    public CompletableFuture<CreateProjectAndforkRepositoriesResponse> createProjectAndforkRepositoriesAsync(CreateProjectAndforkRepositoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.createProjectAndforkRepositories);
    }

    public CompletableFuture<ListUserAllRepositoriesResponse> listUserAllRepositoriesAsync(ListUserAllRepositoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.listUserAllRepositories);
    }

    public CompletableFuture<ShowAllRepositoryByTwoProjectIdResponse> showAllRepositoryByTwoProjectIdAsync(ShowAllRepositoryByTwoProjectIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.showAllRepositoryByTwoProjectId);
    }

    public CompletableFuture<AddHooksResponse> addHooksAsync(AddHooksRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.addHooks);
    }

    public CompletableFuture<DeleteHooksResponse> deleteHooksAsync(DeleteHooksRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.deleteHooks);
    }

    public CompletableFuture<ListHooksResponse> listHooksAsync(ListHooksRequest request) {
        return hcClient.asyncInvokeHttp(request, CodehubMeta.listHooks);
    }

}