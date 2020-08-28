package com.huaweicloud.sdk.codehub.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.codehub.v3.model.*;

public class CodehubClient {
    protected HcClient hcClient;

    public CodehubClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodehubClient> newBuilder() {
        return new ClientBuilder<>(CodehubClient::new);
    }


    /**
     * 获取项目下所有仓库信息
     * 获取仓库列表 模糊查询支持范围,如果未传入project_id，则支持按仓库名或项目名模糊查询，否则，只按仓库名模糊匹配。
     *
     * @param GetAllRepositoryByProjectIdRequest 请求对象
     * @return GetAllRepositoryByProjectIdResponse
    */
    public GetAllRepositoryByProjectIdResponse getAllRepositoryByProjectId(GetAllRepositoryByProjectIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.getAllRepositoryByProjectId);
    }

    /**
     * 获取一个项目下可以设置为公开状态的仓库列表
     * 获取一个项目下可以设置为公开状态的仓库列表
     *
     * @param GetProductTemplatesRequest 请求对象
     * @return GetProductTemplatesResponse
    */
    public GetProductTemplatesResponse getProductTemplates(GetProductTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.getProductTemplates);
    }

    /**
     * 获取一个项目下可以设置为公开状态的仓库列表
     * 获取一个项目下可以设置为公开状态的仓库列表
     *
     * @param ListProductTwoTemplatesRequest 请求对象
     * @return ListProductTwoTemplatesResponse
    */
    public ListProductTwoTemplatesResponse listProductTwoTemplates(ListProductTwoTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.listProductTwoTemplates);
    }

    /**
     * 校验指定项目下的仓库名
     * 一般创建仓库时调用。通过传入项目uuid,仓库名，调用CoudeHubAdapter接口，查询数据库来判断仓库是否重名。
     *
     * @param ShowRepositoryNameExistRequest 请求对象
     * @return ShowRepositoryNameExistResponse
    */
    public ShowRepositoryNameExistResponse showRepositoryNameExist(ShowRepositoryNameExistRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.showRepositoryNameExist);
    }

    /**
     * 添加仓库成员
     * 调用方codehubportal,添加仓库成员。
     *
     * @param AddRepoMembersRequest 请求对象
     * @return AddRepoMembersResponse
    */
    public AddRepoMembersResponse addRepoMembers(AddRepoMembersRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.addRepoMembers);
    }

    /**
     * 删除仓库成员
     * 删除仓库成员
     *
     * @param DeleteRepoMemberRequest 请求对象
     * @return DeleteRepoMemberResponse
    */
    public DeleteRepoMemberResponse deleteRepoMember(DeleteRepoMemberRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.deleteRepoMember);
    }

    /**
     * 获取仓库所有成员记录
     * 获取仓库成员列表,可通过关键字搜索某成员。
     *
     * @param ListRepoMembersRequest 请求对象
     * @return ListRepoMembersResponse
    */
    public ListRepoMembersResponse listRepoMembers(ListRepoMembersRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.listRepoMembers);
    }

    /**
     * 设置成员在仓库中的角色
     * 给仓库中成员设置仓库的操作权限，
     *
     * @param SetRepoRoleRequest 请求对象
     * @return SetRepoRoleResponse
    */
    public SetRepoRoleResponse setRepoRole(SetRepoRoleRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.setRepoRole);
    }

    /**
     * 添加部署密钥
     * 添加部署密钥
     *
     * @param AddDeployKeyRequest 请求对象
     * @return AddDeployKeyResponse
    */
    public AddDeployKeyResponse addDeployKey(AddDeployKeyRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.addDeployKey);
    }

    /**
     * 添加部署密钥
     * 添加部署密钥
     *
     * @param AddDeployKeyV2Request 请求对象
     * @return AddDeployKeyV2Response
    */
    public AddDeployKeyV2Response addDeployKeyV2(AddDeployKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.addDeployKeyV2);
    }

    /**
     * 创建仓库
     * 用指定的名称在指定项目上创建仓库。传入参数：仓库名、模板id、是否导入项目成员、归属项目
     *
     * @param CreateRepositoryRequest 请求对象
     * @return CreateRepositoryResponse
    */
    public CreateRepositoryResponse createRepository(CreateRepositoryRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.createRepository);
    }

    /**
     * 删除仓库部署密钥
     * 删除仓库部署密钥
     *
     * @param DeleteDeployKeyRequest 请求对象
     * @return DeleteDeployKeyResponse
    */
    public DeleteDeployKeyResponse deleteDeployKey(DeleteDeployKeyRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.deleteDeployKey);
    }

    /**
     * 删除仓库部署密钥
     * 删除仓库部署密钥
     *
     * @param DeleteDeployKeyV2Request 请求对象
     * @return DeleteDeployKeyV2Response
    */
    public DeleteDeployKeyV2Response deleteDeployKeyV2(DeleteDeployKeyV2Request request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.deleteDeployKeyV2);
    }

    /**
     * 删除仓库
     * 根据仓库32位uuid删除指定的仓库
     *
     * @param DeleteRepositoryRequest 请求对象
     * @return DeleteRepositoryResponse
    */
    public DeleteRepositoryResponse deleteRepository(DeleteRepositoryRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.deleteRepository);
    }

    /**
     * 查询项目下的某个仓库
     * 不建议再使用,建议使用/{repository_uuid}/status
     *
     * @param GetRepositoryByProjectIdRequest 请求对象
     * @return GetRepositoryByProjectIdResponse
    */
    public GetRepositoryByProjectIdResponse getRepositoryByProjectId(GetRepositoryByProjectIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.getRepositoryByProjectId);
    }

    /**
     * 获取公开示例模板列表
     * 获取公开示例模板列表
     *
     * @param GetTemplatesRequest 请求对象
     * @return GetTemplatesResponse
    */
    public GetTemplatesResponse getTemplates(GetTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.getTemplates);
    }

    /**
     * 仓库统计
     * 根据仓库短id，查询仓库的代码提交记录统计
     *
     * @param LaunchStatisticsRequest 请求对象
     * @return LaunchStatisticsResponse
    */
    public LaunchStatisticsResponse launchStatistics(LaunchStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.launchStatistics);
    }

    /**
     * 获取仓库上一次的提交统计信息
     * 获取仓库上一次的提交统计信息
     *
     * @param ListCommitStatisticsRequest 请求对象
     * @return ListCommitStatisticsResponse
    */
    public ListCommitStatisticsResponse listCommitStatistics(ListCommitStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.listCommitStatistics);
    }

    /**
     * 获取一个仓库下特定分支指定文件内容
     * 获取一个仓库下特定分支指定文件内容
     *
     * @param ListFilesRequest 请求对象
     * @return ListFilesResponse
    */
    public ListFilesResponse listFiles(ListFilesRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.listFiles);
    }

    /**
     * 查看仓库的创建状态
     * 获取仓库状态。
     *
     * @param ListRepositoryStatusRequest 请求对象
     * @return ListRepositoryStatusResponse
    */
    public ListRepositoryStatusResponse listRepositoryStatus(ListRepositoryStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.listRepositoryStatus);
    }

    /**
     * 获取分支目录下的文件
     * 获取分支目录下的文件
     *
     * @param ListSubfilesRequest 请求对象
     * @return ListSubfilesResponse
    */
    public ListSubfilesResponse listSubfiles(ListSubfilesRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.listSubfiles);
    }

    /**
     * 设置仓库是公开状态还是私有状态
     * 设置仓库是公开状态还是私有状态
     *
     * @param ListTemplatesTwoRequest 请求对象
     * @return ListTemplatesTwoResponse
    */
    public ListTemplatesTwoResponse listTemplatesTwo(ListTemplatesTwoRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.listTemplatesTwo);
    }

    /**
     * 获取公开示例模板列表
     * 获取公开示例模板列表
     *
     * @param ListTwoTemplatesRequest 请求对象
     * @return ListTwoTemplatesResponse
    */
    public ListTwoTemplatesResponse listTwoTemplates(ListTwoTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.listTwoTemplates);
    }

    /**
     * 设置仓库是公开状态还是私有状态
     * 设置仓库是公开状态还是私有状态
     *
     * @param ShareTemplatesRequest 请求对象
     * @return ShareTemplatesResponse
    */
    public ShareTemplatesResponse shareTemplates(ShareTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.shareTemplates);
    }

    /**
     * 查询某仓库对应的分支
     * 根据仓库id获取指定仓库的分支列表.
     *
     * @param ShowBranchesByRepositoryIdRequest 请求对象
     * @return ShowBranchesByRepositoryIdResponse
    */
    public ShowBranchesByRepositoryIdResponse showBranchesByRepositoryId(ShowBranchesByRepositoryIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.showBranchesByRepositoryId);
    }

    /**
     * 查询某仓库的标签列表
     * 查询指定仓库对应的分支。
     *
     * @param ShowBranchesByTwoRepositoryIdRequest 请求对象
     * @return ShowBranchesByTwoRepositoryIdResponse
    */
    public ShowBranchesByTwoRepositoryIdResponse showBranchesByTwoRepositoryId(ShowBranchesByTwoRepositoryIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.showBranchesByTwoRepositoryId);
    }

    /**
     * 根据组名和仓库名查询某仓库某分支对应的提交
     * 根据仓库组名、仓库名和分支获取提交列表。
     *
     * @param ShowCommitsByBranchRequest 请求对象
     * @return ShowCommitsByBranchResponse
    */
    public ShowCommitsByBranchResponse showCommitsByBranch(ShowCommitsByBranchRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.showCommitsByBranch);
    }

    /**
     * 根据仓库id查询仓库某分支对应的提交，提供更多可选参数
     * 根据仓库id查询仓库某分支对应的提交.
     *
     * @param ShowCommitsByRepoIdRequest 请求对象
     * @return ShowCommitsByRepoIdResponse
    */
    public ShowCommitsByRepoIdResponse showCommitsByRepoId(ShowCommitsByRepoIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.showCommitsByRepoId);
    }

    /**
     * 修改被流水线引用的仓库状态
     * 修改被流水线引用的仓库状态
     *
     * @param ShowHasPipelineRequest 请求对象
     * @return ShowHasPipelineResponse
    */
    public ShowHasPipelineResponse showHasPipeline(ShowHasPipelineRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.showHasPipeline);
    }

    /**
     * 获取一个仓库下特定分支的图片文件
     * 获取一个仓库下特定分支的图片文件
     *
     * @param ShowImageBlobRequest 请求对象
     * @return ShowImageBlobResponse
    */
    public ShowImageBlobResponse showImageBlob(ShowImageBlobRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.showImageBlob);
    }

    /**
     * 判断用户是否有仓库的管理员权限
     * 判断用户是否有仓库的管理员权限
     *
     * @param ShowMasterRequest 请求对象
     * @return ShowMasterResponse
    */
    public ShowMasterResponse showMaster(ShowMasterRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.showMaster);
    }

    /**
     * 根据仓库名组名获取仓库短id，用以拼接与commitid对应提交详情页面url
     * 获取仓库短id,用于获取仓库详情页面url
     *
     * @param ShowRepoIdRequest 请求对象
     * @return ShowRepoIdResponse
    */
    public ShowRepoIdResponse showRepoId(ShowRepoIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.showRepoId);
    }

    /**
     * 查询某个仓库的详细信息
     * 根据仓库UUID获取仓库信息仓库信息。返回 包含id，name，组名，仓库访问URL。
     *
     * @param ShowRepositoryByUUIdRequest 请求对象
     * @return ShowRepositoryByUUIdResponse
    */
    public ShowRepositoryByUUIdResponse showRepositoryByUUId(ShowRepositoryByUUIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.showRepositoryByUUId);
    }

    /**
     * 获取仓库统计数据
     * 获取仓库统计数据
     *
     * @param ShowStatisticalDataRequest 请求对象
     * @return ShowStatisticalDataResponse
    */
    public ShowStatisticalDataResponse showStatisticalData(ShowStatisticalDataRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.showStatisticalData);
    }

    /**
     * 上传公钥
     * 调用原生接口添加用户key
     *
     * @param AddSshKeyRequest 请求对象
     * @return AddSshKeyResponse
    */
    public AddSshKeyResponse addSshKey(AddSshKeyRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.addSshKey);
    }

    /**
     * 删除用户公钥
     * 调用gitlab原生接口删除用户公钥。
     *
     * @param DeleteSShkeyRequest 请求对象
     * @return DeleteSShkeyResponse
    */
    public DeleteSShkeyResponse deleteSShkey(DeleteSShkeyRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.deleteSShkey);
    }

    /**
     * 获取公钥列表
     * 调用gitlab原生接口获取用户的ssh列表。
     *
     * @param ListSSHKeysRequest 请求对象
     * @return ListSSHKeysResponse
    */
    public ListSSHKeysResponse listSSHKeys(ListSSHKeysRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.listSSHKeys);
    }

    /**
     * 检验私钥是否有拉取代码的权限
     * 检验私钥是否有拉取代码的权限
     *
     * @param ShowPrivateKeyVerifyRequest 请求对象
     * @return ShowPrivateKeyVerifyResponse
    */
    public ShowPrivateKeyVerifyResponse showPrivateKeyVerify(ShowPrivateKeyVerifyRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.showPrivateKeyVerify);
    }

    /**
     *  https账号密码校验
     * 调用 gitlab 接口判断用户使用 https 上传/下载代码时输入的用户名和密码是否合法。
     *
     * @param ValidateHttpsInfoRequest 请求对象
     * @return ValidateHttpsInfoResponse
    */
    public ValidateHttpsInfoResponse validateHttpsInfo(ValidateHttpsInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.validateHttpsInfo);
    }

    /**
     *  https账号密码校验
     * 调用 gitlab 接口判断用户使用 https 上传/下载代码时输入的用户名和密码是否合法。
     *
     * @param ValidateHttpsInfoV2Request 请求对象
     * @return ValidateHttpsInfoV2Response
    */
    public ValidateHttpsInfoV2Response validateHttpsInfoV2(ValidateHttpsInfoV2Request request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.validateHttpsInfoV2);
    }

    /**
     * 创建项目、仓库
     * 创建项目后，创建仓库组由后台生成方式 传入参数：仓库名、模板id、是否导入项目成员、归属项目
     *
     * @param CreateProjectAndRepositoriesRequest 请求对象
     * @return CreateProjectAndRepositoriesResponse
    */
    public CreateProjectAndRepositoriesResponse createProjectAndRepositories(CreateProjectAndRepositoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.createProjectAndRepositories);
    }

    /**
     * 创建项目并fork仓库
     * 创建仓库后fork仓库 传入参数：仓库名、是否导入项目成员、归属项目
     *
     * @param CreateProjectAndforkRepositoriesRequest 请求对象
     * @return CreateProjectAndforkRepositoriesResponse
    */
    public CreateProjectAndforkRepositoriesResponse createProjectAndforkRepositories(CreateProjectAndforkRepositoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.createProjectAndforkRepositories);
    }

    /**
     * 查询用户的所有仓库
     * 获取用户的所有仓库信息
     *
     * @param ListUserAllRepositoriesRequest 请求对象
     * @return ListUserAllRepositoriesResponse
    */
    public ListUserAllRepositoriesResponse listUserAllRepositories(ListUserAllRepositoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.listUserAllRepositories);
    }

    /**
     * 查询项目下的所有仓库
     * 获取仓库列表,模糊查询支持范围,如果未传入project uuid，则支持按仓库名或项目名模糊查询，否则，只按仓库名模糊匹配
     *
     * @param ShowAllRepositoryByTwoProjectIdRequest 请求对象
     * @return ShowAllRepositoryByTwoProjectIdResponse
    */
    public ShowAllRepositoryByTwoProjectIdResponse showAllRepositoryByTwoProjectId(ShowAllRepositoryByTwoProjectIdRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.showAllRepositoryByTwoProjectId);
    }

    /**
     * 为指定仓库添加hook
     * 提交代码自动触发编译构建，添加仓库钩子
     *
     * @param AddHooksRequest 请求对象
     * @return AddHooksResponse
    */
    public AddHooksResponse addHooks(AddHooksRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.addHooks);
    }

    /**
     * 删除指定仓库的 hook
     * 提交代码自动触发编译构建，删除仓库钩子
     *
     * @param DeleteHooksRequest 请求对象
     * @return DeleteHooksResponse
    */
    public DeleteHooksResponse deleteHooks(DeleteHooksRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.deleteHooks);
    }

    /**
     * 查询指定仓库的webhook
     * 获取仓库webhook
     *
     * @param ListHooksRequest 请求对象
     * @return ListHooksResponse
    */
    public ListHooksResponse listHooks(ListHooksRequest request) {
        return hcClient.syncInvokeHttp(request, CodehubMeta.listHooks);
    }

}