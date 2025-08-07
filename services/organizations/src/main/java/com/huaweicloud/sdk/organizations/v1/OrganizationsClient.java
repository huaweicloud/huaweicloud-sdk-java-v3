package com.huaweicloud.sdk.organizations.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.organizations.v1.model.AcceptHandshakeRequest;
import com.huaweicloud.sdk.organizations.v1.model.AcceptHandshakeResponse;
import com.huaweicloud.sdk.organizations.v1.model.AttachPolicyRequest;
import com.huaweicloud.sdk.organizations.v1.model.AttachPolicyResponse;
import com.huaweicloud.sdk.organizations.v1.model.CancelHandshakeRequest;
import com.huaweicloud.sdk.organizations.v1.model.CancelHandshakeResponse;
import com.huaweicloud.sdk.organizations.v1.model.CloseAccountRequest;
import com.huaweicloud.sdk.organizations.v1.model.CloseAccountResponse;
import com.huaweicloud.sdk.organizations.v1.model.CreateAccountRequest;
import com.huaweicloud.sdk.organizations.v1.model.CreateAccountResponse;
import com.huaweicloud.sdk.organizations.v1.model.CreateOrganizationRequest;
import com.huaweicloud.sdk.organizations.v1.model.CreateOrganizationResponse;
import com.huaweicloud.sdk.organizations.v1.model.CreateOrganizationalUnitRequest;
import com.huaweicloud.sdk.organizations.v1.model.CreateOrganizationalUnitResponse;
import com.huaweicloud.sdk.organizations.v1.model.CreatePolicyRequest;
import com.huaweicloud.sdk.organizations.v1.model.CreatePolicyResponse;
import com.huaweicloud.sdk.organizations.v1.model.CreateResourceAccountRequest;
import com.huaweicloud.sdk.organizations.v1.model.CreateResourceAccountResponse;
import com.huaweicloud.sdk.organizations.v1.model.CreateTagResourceRequest;
import com.huaweicloud.sdk.organizations.v1.model.CreateTagResourceResponse;
import com.huaweicloud.sdk.organizations.v1.model.DeclineHandshakeRequest;
import com.huaweicloud.sdk.organizations.v1.model.DeclineHandshakeResponse;
import com.huaweicloud.sdk.organizations.v1.model.DeleteOrganizationRequest;
import com.huaweicloud.sdk.organizations.v1.model.DeleteOrganizationResponse;
import com.huaweicloud.sdk.organizations.v1.model.DeleteOrganizationalUnitRequest;
import com.huaweicloud.sdk.organizations.v1.model.DeleteOrganizationalUnitResponse;
import com.huaweicloud.sdk.organizations.v1.model.DeletePolicyRequest;
import com.huaweicloud.sdk.organizations.v1.model.DeletePolicyResponse;
import com.huaweicloud.sdk.organizations.v1.model.DeleteTagResourceRequest;
import com.huaweicloud.sdk.organizations.v1.model.DeleteTagResourceResponse;
import com.huaweicloud.sdk.organizations.v1.model.DeregisterDelegatedAdministratorRequest;
import com.huaweicloud.sdk.organizations.v1.model.DeregisterDelegatedAdministratorResponse;
import com.huaweicloud.sdk.organizations.v1.model.DetachPolicyRequest;
import com.huaweicloud.sdk.organizations.v1.model.DetachPolicyResponse;
import com.huaweicloud.sdk.organizations.v1.model.DisablePolicyTypeRequest;
import com.huaweicloud.sdk.organizations.v1.model.DisablePolicyTypeResponse;
import com.huaweicloud.sdk.organizations.v1.model.DisableTrustedServiceRequest;
import com.huaweicloud.sdk.organizations.v1.model.DisableTrustedServiceResponse;
import com.huaweicloud.sdk.organizations.v1.model.EnablePolicyTypeRequest;
import com.huaweicloud.sdk.organizations.v1.model.EnablePolicyTypeResponse;
import com.huaweicloud.sdk.organizations.v1.model.EnableTrustedServiceRequest;
import com.huaweicloud.sdk.organizations.v1.model.EnableTrustedServiceResponse;
import com.huaweicloud.sdk.organizations.v1.model.InviteAccountRequest;
import com.huaweicloud.sdk.organizations.v1.model.InviteAccountResponse;
import com.huaweicloud.sdk.organizations.v1.model.LeaveOrganizationRequest;
import com.huaweicloud.sdk.organizations.v1.model.LeaveOrganizationResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListAccountsRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListAccountsResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListCloseAccountStatusesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListCloseAccountStatusesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListCreateAccountStatusesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListCreateAccountStatusesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListDelegatedAdministratorsRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListDelegatedAdministratorsResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListDelegatedServicesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListDelegatedServicesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListEntitiesForPolicyRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListEntitiesForPolicyResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListEntitiesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListEntitiesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListHandshakesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListHandshakesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListOrganizationalUnitsRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListOrganizationalUnitsResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListPoliciesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListPoliciesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListQuotasRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListQuotasResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListReceivedHandshakesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListReceivedHandshakesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListResourceInstancesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListResourceInstancesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListResourceTagsRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListResourceTagsResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListRootsRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListRootsResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListServicesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListServicesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListTagPolicyServicesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListTagPolicyServicesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListTagResourcesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListTagResourcesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListTagsForResourceRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListTagsForResourceResponse;
import com.huaweicloud.sdk.organizations.v1.model.ListTrustedServicesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ListTrustedServicesResponse;
import com.huaweicloud.sdk.organizations.v1.model.MoveAccountRequest;
import com.huaweicloud.sdk.organizations.v1.model.MoveAccountResponse;
import com.huaweicloud.sdk.organizations.v1.model.RegisterDelegatedAdministratorRequest;
import com.huaweicloud.sdk.organizations.v1.model.RegisterDelegatedAdministratorResponse;
import com.huaweicloud.sdk.organizations.v1.model.RemoveAccountRequest;
import com.huaweicloud.sdk.organizations.v1.model.RemoveAccountResponse;
import com.huaweicloud.sdk.organizations.v1.model.ShowAccountRequest;
import com.huaweicloud.sdk.organizations.v1.model.ShowAccountResponse;
import com.huaweicloud.sdk.organizations.v1.model.ShowCreateAccountStatusRequest;
import com.huaweicloud.sdk.organizations.v1.model.ShowCreateAccountStatusResponse;
import com.huaweicloud.sdk.organizations.v1.model.ShowEffectivePoliciesRequest;
import com.huaweicloud.sdk.organizations.v1.model.ShowEffectivePoliciesResponse;
import com.huaweicloud.sdk.organizations.v1.model.ShowHandshakeRequest;
import com.huaweicloud.sdk.organizations.v1.model.ShowHandshakeResponse;
import com.huaweicloud.sdk.organizations.v1.model.ShowOrganizationRequest;
import com.huaweicloud.sdk.organizations.v1.model.ShowOrganizationResponse;
import com.huaweicloud.sdk.organizations.v1.model.ShowOrganizationalUnitRequest;
import com.huaweicloud.sdk.organizations.v1.model.ShowOrganizationalUnitResponse;
import com.huaweicloud.sdk.organizations.v1.model.ShowPolicyRequest;
import com.huaweicloud.sdk.organizations.v1.model.ShowPolicyResponse;
import com.huaweicloud.sdk.organizations.v1.model.ShowResourceInstancesCountRequest;
import com.huaweicloud.sdk.organizations.v1.model.ShowResourceInstancesCountResponse;
import com.huaweicloud.sdk.organizations.v1.model.TagResourceRequest;
import com.huaweicloud.sdk.organizations.v1.model.TagResourceResponse;
import com.huaweicloud.sdk.organizations.v1.model.UntagResourceRequest;
import com.huaweicloud.sdk.organizations.v1.model.UntagResourceResponse;
import com.huaweicloud.sdk.organizations.v1.model.UpdateAccountRequest;
import com.huaweicloud.sdk.organizations.v1.model.UpdateAccountResponse;
import com.huaweicloud.sdk.organizations.v1.model.UpdateOrganizationalUnitRequest;
import com.huaweicloud.sdk.organizations.v1.model.UpdateOrganizationalUnitResponse;
import com.huaweicloud.sdk.organizations.v1.model.UpdatePolicyRequest;
import com.huaweicloud.sdk.organizations.v1.model.UpdatePolicyResponse;

public class OrganizationsClient {

    protected HcClient hcClient;

    public OrganizationsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<OrganizationsClient> newBuilder() {
        ClientBuilder<OrganizationsClient> clientBuilder =
            new ClientBuilder<>(OrganizationsClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 关闭账号
     *
     * 关闭账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CloseAccountRequest 请求对象
     * @return CloseAccountResponse
     */
    public CloseAccountResponse closeAccount(CloseAccountRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.closeAccount);
    }

    /**
     * 关闭账号
     *
     * 关闭账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CloseAccountRequest 请求对象
     * @return SyncInvoker<CloseAccountRequest, CloseAccountResponse>
     */
    public SyncInvoker<CloseAccountRequest, CloseAccountResponse> closeAccountInvoker(CloseAccountRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.closeAccount, hcClient);
    }

    /**
     * 创建账号
     *
     * 创建一个账号，生成的账号将自动成为调用此接口的账号所属组织的成员。此操作只能由组织的管理账号调用。组织云服务将在新账号中创建所需的服务关联委托和账号访问委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccountRequest 请求对象
     * @return CreateAccountResponse
     */
    public CreateAccountResponse createAccount(CreateAccountRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.createAccount);
    }

    /**
     * 创建账号
     *
     * 创建一个账号，生成的账号将自动成为调用此接口的账号所属组织的成员。此操作只能由组织的管理账号调用。组织云服务将在新账号中创建所需的服务关联委托和账号访问委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccountRequest 请求对象
     * @return SyncInvoker<CreateAccountRequest, CreateAccountResponse>
     */
    public SyncInvoker<CreateAccountRequest, CreateAccountResponse> createAccountInvoker(CreateAccountRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.createAccount, hcClient);
    }

    /**
     * 创建帐号
     *
     * 创建一个帐号，不携带手机号邮箱联系方式，生成的帐号将自动成为调用此接口的帐号所属组织的成员。此操作只能由组织的管理帐号调用。组织云服务将在新帐号中创建所需的服务关联委托和帐号访问委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceAccountRequest 请求对象
     * @return CreateResourceAccountResponse
     */
    public CreateResourceAccountResponse createResourceAccount(CreateResourceAccountRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.createResourceAccount);
    }

    /**
     * 创建帐号
     *
     * 创建一个帐号，不携带手机号邮箱联系方式，生成的帐号将自动成为调用此接口的帐号所属组织的成员。此操作只能由组织的管理帐号调用。组织云服务将在新帐号中创建所需的服务关联委托和帐号访问委托。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceAccountRequest 请求对象
     * @return SyncInvoker<CreateResourceAccountRequest, CreateResourceAccountResponse>
     */
    public SyncInvoker<CreateResourceAccountRequest, CreateResourceAccountResponse> createResourceAccountInvoker(
        CreateResourceAccountRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.createResourceAccount, hcClient);
    }

    /**
     * 邀请账号加入组织
     *
     * 向另一个账号发送邀请，受邀账号将以成员账号加入您的组织。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InviteAccountRequest 请求对象
     * @return InviteAccountResponse
     */
    public InviteAccountResponse inviteAccount(InviteAccountRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.inviteAccount);
    }

    /**
     * 邀请账号加入组织
     *
     * 向另一个账号发送邀请，受邀账号将以成员账号加入您的组织。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InviteAccountRequest 请求对象
     * @return SyncInvoker<InviteAccountRequest, InviteAccountResponse>
     */
    public SyncInvoker<InviteAccountRequest, InviteAccountResponse> inviteAccountInvoker(InviteAccountRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.inviteAccount, hcClient);
    }

    /**
     * 列出组织中的账号
     *
     * 列出组织中的账号。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。如果指定父级组织单元，则将获得作为父级直系子级的所有账号的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountsRequest 请求对象
     * @return ListAccountsResponse
     */
    public ListAccountsResponse listAccounts(ListAccountsRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.listAccounts);
    }

    /**
     * 列出组织中的账号
     *
     * 列出组织中的账号。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。如果指定父级组织单元，则将获得作为父级直系子级的所有账号的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountsRequest 请求对象
     * @return SyncInvoker<ListAccountsRequest, ListAccountsResponse>
     */
    public SyncInvoker<ListAccountsRequest, ListAccountsResponse> listAccountsInvoker(ListAccountsRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.listAccounts, hcClient);
    }

    /**
     * 列出关闭账号的状态
     *
     * 列出组织中指定状态的账号关闭请求。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloseAccountStatusesRequest 请求对象
     * @return ListCloseAccountStatusesResponse
     */
    public ListCloseAccountStatusesResponse listCloseAccountStatuses(ListCloseAccountStatusesRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.listCloseAccountStatuses);
    }

    /**
     * 列出关闭账号的状态
     *
     * 列出组织中指定状态的账号关闭请求。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloseAccountStatusesRequest 请求对象
     * @return SyncInvoker<ListCloseAccountStatusesRequest, ListCloseAccountStatusesResponse>
     */
    public SyncInvoker<ListCloseAccountStatusesRequest, ListCloseAccountStatusesResponse> listCloseAccountStatusesInvoker(
        ListCloseAccountStatusesRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.listCloseAccountStatuses, hcClient);
    }

    /**
     * 列出创建账号的状态
     *
     * 列出组织中指定状态的账号创建请求。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCreateAccountStatusesRequest 请求对象
     * @return ListCreateAccountStatusesResponse
     */
    public ListCreateAccountStatusesResponse listCreateAccountStatuses(ListCreateAccountStatusesRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.listCreateAccountStatuses);
    }

    /**
     * 列出创建账号的状态
     *
     * 列出组织中指定状态的账号创建请求。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCreateAccountStatusesRequest 请求对象
     * @return SyncInvoker<ListCreateAccountStatusesRequest, ListCreateAccountStatusesResponse>
     */
    public SyncInvoker<ListCreateAccountStatusesRequest, ListCreateAccountStatusesResponse> listCreateAccountStatusesInvoker(
        ListCreateAccountStatusesRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.listCreateAccountStatuses, hcClient);
    }

    /**
     * 移动账号
     *
     * 将账号从其当前源位置（根或组织单元）移动到指定的目标位置（根或组织单元）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MoveAccountRequest 请求对象
     * @return MoveAccountResponse
     */
    public MoveAccountResponse moveAccount(MoveAccountRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.moveAccount);
    }

    /**
     * 移动账号
     *
     * 将账号从其当前源位置（根或组织单元）移动到指定的目标位置（根或组织单元）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MoveAccountRequest 请求对象
     * @return SyncInvoker<MoveAccountRequest, MoveAccountResponse>
     */
    public SyncInvoker<MoveAccountRequest, MoveAccountResponse> moveAccountInvoker(MoveAccountRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.moveAccount, hcClient);
    }

    /**
     * 移除指定的账号
     *
     * 从组织中移除指定的账号。移除的账号将成为一个独立账号，该账号不是任何组织的成员。此操作只能由组织的管理账号调用。只有当账号配置了作为独立账号运行所需的信息时，您才能从组织中移除账号。注意，要移除的账号不能是组织启用的任何服务的委托管理员账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveAccountRequest 请求对象
     * @return RemoveAccountResponse
     */
    public RemoveAccountResponse removeAccount(RemoveAccountRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.removeAccount);
    }

    /**
     * 移除指定的账号
     *
     * 从组织中移除指定的账号。移除的账号将成为一个独立账号，该账号不是任何组织的成员。此操作只能由组织的管理账号调用。只有当账号配置了作为独立账号运行所需的信息时，您才能从组织中移除账号。注意，要移除的账号不能是组织启用的任何服务的委托管理员账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveAccountRequest 请求对象
     * @return SyncInvoker<RemoveAccountRequest, RemoveAccountResponse>
     */
    public SyncInvoker<RemoveAccountRequest, RemoveAccountResponse> removeAccountInvoker(RemoveAccountRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.removeAccount, hcClient);
    }

    /**
     * 查询账号信息
     *
     * 查询有关指定账号的信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccountRequest 请求对象
     * @return ShowAccountResponse
     */
    public ShowAccountResponse showAccount(ShowAccountRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.showAccount);
    }

    /**
     * 查询账号信息
     *
     * 查询有关指定账号的信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccountRequest 请求对象
     * @return SyncInvoker<ShowAccountRequest, ShowAccountResponse>
     */
    public SyncInvoker<ShowAccountRequest, ShowAccountResponse> showAccountInvoker(ShowAccountRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.showAccount, hcClient);
    }

    /**
     * 查询有关创建账号状态的信息
     *
     * 检索创建账号的异步请求的当前状态。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCreateAccountStatusRequest 请求对象
     * @return ShowCreateAccountStatusResponse
     */
    public ShowCreateAccountStatusResponse showCreateAccountStatus(ShowCreateAccountStatusRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.showCreateAccountStatus);
    }

    /**
     * 查询有关创建账号状态的信息
     *
     * 检索创建账号的异步请求的当前状态。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCreateAccountStatusRequest 请求对象
     * @return SyncInvoker<ShowCreateAccountStatusRequest, ShowCreateAccountStatusResponse>
     */
    public SyncInvoker<ShowCreateAccountStatusRequest, ShowCreateAccountStatusResponse> showCreateAccountStatusInvoker(
        ShowCreateAccountStatusRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.showCreateAccountStatus, hcClient);
    }

    /**
     * 更新账号信息
     *
     * 更新指定的账号信息。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccountRequest 请求对象
     * @return UpdateAccountResponse
     */
    public UpdateAccountResponse updateAccount(UpdateAccountRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.updateAccount);
    }

    /**
     * 更新账号信息
     *
     * 更新指定的账号信息。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAccountRequest 请求对象
     * @return SyncInvoker<UpdateAccountRequest, UpdateAccountResponse>
     */
    public SyncInvoker<UpdateAccountRequest, UpdateAccountResponse> updateAccountInvoker(UpdateAccountRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.updateAccount, hcClient);
    }

    /**
     * 注销服务的委托管理员
     *
     * 删除指定成员账号作为指定服务的委托管理员。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeregisterDelegatedAdministratorRequest 请求对象
     * @return DeregisterDelegatedAdministratorResponse
     */
    public DeregisterDelegatedAdministratorResponse deregisterDelegatedAdministrator(
        DeregisterDelegatedAdministratorRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.deregisterDelegatedAdministrator);
    }

    /**
     * 注销服务的委托管理员
     *
     * 删除指定成员账号作为指定服务的委托管理员。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeregisterDelegatedAdministratorRequest 请求对象
     * @return SyncInvoker<DeregisterDelegatedAdministratorRequest, DeregisterDelegatedAdministratorResponse>
     */
    public SyncInvoker<DeregisterDelegatedAdministratorRequest, DeregisterDelegatedAdministratorResponse> deregisterDelegatedAdministratorInvoker(
        DeregisterDelegatedAdministratorRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.deregisterDelegatedAdministrator, hcClient);
    }

    /**
     * 列出此组织中指定为委托管理员的账号
     *
     * 列出在此组织中指定为委派管理员的账号。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDelegatedAdministratorsRequest 请求对象
     * @return ListDelegatedAdministratorsResponse
     */
    public ListDelegatedAdministratorsResponse listDelegatedAdministrators(ListDelegatedAdministratorsRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.listDelegatedAdministrators);
    }

    /**
     * 列出此组织中指定为委托管理员的账号
     *
     * 列出在此组织中指定为委派管理员的账号。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDelegatedAdministratorsRequest 请求对象
     * @return SyncInvoker<ListDelegatedAdministratorsRequest, ListDelegatedAdministratorsResponse>
     */
    public SyncInvoker<ListDelegatedAdministratorsRequest, ListDelegatedAdministratorsResponse> listDelegatedAdministratorsInvoker(
        ListDelegatedAdministratorsRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.listDelegatedAdministrators, hcClient);
    }

    /**
     * 列出指定账号是其委托管理员的服务
     *
     * 列出指定账号是其委托管理员的服务。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDelegatedServicesRequest 请求对象
     * @return ListDelegatedServicesResponse
     */
    public ListDelegatedServicesResponse listDelegatedServices(ListDelegatedServicesRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.listDelegatedServices);
    }

    /**
     * 列出指定账号是其委托管理员的服务
     *
     * 列出指定账号是其委托管理员的服务。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDelegatedServicesRequest 请求对象
     * @return SyncInvoker<ListDelegatedServicesRequest, ListDelegatedServicesResponse>
     */
    public SyncInvoker<ListDelegatedServicesRequest, ListDelegatedServicesResponse> listDelegatedServicesInvoker(
        ListDelegatedServicesRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.listDelegatedServices, hcClient);
    }

    /**
     * 注册作为服务委托管理员
     *
     * 指定成员账号能够管理指定服务的组织功能。此接口授予委托管理员对组织服务数据的只读访问权限。委托管理员账号中的IAM用户仍需要IAM权限才能访问和管理服务。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterDelegatedAdministratorRequest 请求对象
     * @return RegisterDelegatedAdministratorResponse
     */
    public RegisterDelegatedAdministratorResponse registerDelegatedAdministrator(
        RegisterDelegatedAdministratorRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.registerDelegatedAdministrator);
    }

    /**
     * 注册作为服务委托管理员
     *
     * 指定成员账号能够管理指定服务的组织功能。此接口授予委托管理员对组织服务数据的只读访问权限。委托管理员账号中的IAM用户仍需要IAM权限才能访问和管理服务。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterDelegatedAdministratorRequest 请求对象
     * @return SyncInvoker<RegisterDelegatedAdministratorRequest, RegisterDelegatedAdministratorResponse>
     */
    public SyncInvoker<RegisterDelegatedAdministratorRequest, RegisterDelegatedAdministratorResponse> registerDelegatedAdministratorInvoker(
        RegisterDelegatedAdministratorRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.registerDelegatedAdministrator, hcClient);
    }

    /**
     * 接受邀请
     *
     * 向邀请的发起方发送应答，接受加入组织邀请。在您接受邀请后，此邀请信息将继续保留并出现在相关API的返回结果中，保留期限为30天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AcceptHandshakeRequest 请求对象
     * @return AcceptHandshakeResponse
     */
    public AcceptHandshakeResponse acceptHandshake(AcceptHandshakeRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.acceptHandshake);
    }

    /**
     * 接受邀请
     *
     * 向邀请的发起方发送应答，接受加入组织邀请。在您接受邀请后，此邀请信息将继续保留并出现在相关API的返回结果中，保留期限为30天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AcceptHandshakeRequest 请求对象
     * @return SyncInvoker<AcceptHandshakeRequest, AcceptHandshakeResponse>
     */
    public SyncInvoker<AcceptHandshakeRequest, AcceptHandshakeResponse> acceptHandshakeInvoker(
        AcceptHandshakeRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.acceptHandshake, hcClient);
    }

    /**
     * 取消邀请
     *
     * 取消邀请，此时邀请状态将设置为已取消。此接口只能由发起邀请的账号调用。取消邀请后，此邀请信息将继续保留并出现在相关API的返回结果中，保留期限为30天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelHandshakeRequest 请求对象
     * @return CancelHandshakeResponse
     */
    public CancelHandshakeResponse cancelHandshake(CancelHandshakeRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.cancelHandshake);
    }

    /**
     * 取消邀请
     *
     * 取消邀请，此时邀请状态将设置为已取消。此接口只能由发起邀请的账号调用。取消邀请后，此邀请信息将继续保留并出现在相关API的返回结果中，保留期限为30天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelHandshakeRequest 请求对象
     * @return SyncInvoker<CancelHandshakeRequest, CancelHandshakeResponse>
     */
    public SyncInvoker<CancelHandshakeRequest, CancelHandshakeResponse> cancelHandshakeInvoker(
        CancelHandshakeRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.cancelHandshake, hcClient);
    }

    /**
     * 拒绝邀请
     *
     * 拒绝邀请请求。受邀账号拒绝邀请，此时当前邀请状态将设置为拒绝，邀请停止。此接口只能由受邀账号调用。邀请发起者无法再次激活被拒绝的邀请，但可以重新发送新的邀请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeclineHandshakeRequest 请求对象
     * @return DeclineHandshakeResponse
     */
    public DeclineHandshakeResponse declineHandshake(DeclineHandshakeRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.declineHandshake);
    }

    /**
     * 拒绝邀请
     *
     * 拒绝邀请请求。受邀账号拒绝邀请，此时当前邀请状态将设置为拒绝，邀请停止。此接口只能由受邀账号调用。邀请发起者无法再次激活被拒绝的邀请，但可以重新发送新的邀请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeclineHandshakeRequest 请求对象
     * @return SyncInvoker<DeclineHandshakeRequest, DeclineHandshakeResponse>
     */
    public SyncInvoker<DeclineHandshakeRequest, DeclineHandshakeResponse> declineHandshakeInvoker(
        DeclineHandshakeRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.declineHandshake, hcClient);
    }

    /**
     * 列出发送的邀请
     *
     * 列出所属组织发送的邀请。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHandshakesRequest 请求对象
     * @return ListHandshakesResponse
     */
    public ListHandshakesResponse listHandshakes(ListHandshakesRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.listHandshakes);
    }

    /**
     * 列出发送的邀请
     *
     * 列出所属组织发送的邀请。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHandshakesRequest 请求对象
     * @return SyncInvoker<ListHandshakesRequest, ListHandshakesResponse>
     */
    public SyncInvoker<ListHandshakesRequest, ListHandshakesResponse> listHandshakesInvoker(
        ListHandshakesRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.listHandshakes, hcClient);
    }

    /**
     * 列出收到的邀请
     *
     * 列出账号收到的所有邀请。此操作可以由任何账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReceivedHandshakesRequest 请求对象
     * @return ListReceivedHandshakesResponse
     */
    public ListReceivedHandshakesResponse listReceivedHandshakes(ListReceivedHandshakesRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.listReceivedHandshakes);
    }

    /**
     * 列出收到的邀请
     *
     * 列出账号收到的所有邀请。此操作可以由任何账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReceivedHandshakesRequest 请求对象
     * @return SyncInvoker<ListReceivedHandshakesRequest, ListReceivedHandshakesResponse>
     */
    public SyncInvoker<ListReceivedHandshakesRequest, ListReceivedHandshakesResponse> listReceivedHandshakesInvoker(
        ListReceivedHandshakesRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.listReceivedHandshakes, hcClient);
    }

    /**
     * 查询邀请相关信息
     *
     * 查询组织中已有账号邀请的相关信息。此接口可以由组织中的任何账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHandshakeRequest 请求对象
     * @return ShowHandshakeResponse
     */
    public ShowHandshakeResponse showHandshake(ShowHandshakeRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.showHandshake);
    }

    /**
     * 查询邀请相关信息
     *
     * 查询组织中已有账号邀请的相关信息。此接口可以由组织中的任何账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHandshakeRequest 请求对象
     * @return SyncInvoker<ShowHandshakeRequest, ShowHandshakeResponse>
     */
    public SyncInvoker<ShowHandshakeRequest, ShowHandshakeResponse> showHandshakeInvoker(ShowHandshakeRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.showHandshake, hcClient);
    }

    /**
     * 列出组织中的根、组织单元和账号
     *
     * 列出组织中包含的所有根、组织单元和账号。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。您可以通过指定父ID和子ID参数来过滤实体。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEntitiesRequest 请求对象
     * @return ListEntitiesResponse
     */
    public ListEntitiesResponse listEntities(ListEntitiesRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.listEntities);
    }

    /**
     * 列出组织中的根、组织单元和账号
     *
     * 列出组织中包含的所有根、组织单元和账号。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。您可以通过指定父ID和子ID参数来过滤实体。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEntitiesRequest 请求对象
     * @return SyncInvoker<ListEntitiesRequest, ListEntitiesResponse>
     */
    public SyncInvoker<ListEntitiesRequest, ListEntitiesResponse> listEntitiesInvoker(ListEntitiesRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.listEntities, hcClient);
    }

    /**
     * 列出租户的组织配额
     *
     * 列出租户的组织配额。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasRequest 请求对象
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotas(ListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.listQuotas);
    }

    /**
     * 列出租户的组织配额
     *
     * 列出租户的组织配额。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasRequest 请求对象
     * @return SyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public SyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasInvoker(ListQuotasRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.listQuotas, hcClient);
    }

    /**
     * 列出所有可以与组织服务集成的云服务
     *
     * 列出所有可以与组织服务集成的云服务。集成后云服务将成为组织的可信服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServicesRequest 请求对象
     * @return ListServicesResponse
     */
    public ListServicesResponse listServices(ListServicesRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.listServices);
    }

    /**
     * 列出所有可以与组织服务集成的云服务
     *
     * 列出所有可以与组织服务集成的云服务。集成后云服务将成为组织的可信服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServicesRequest 请求对象
     * @return SyncInvoker<ListServicesRequest, ListServicesResponse>
     */
    public SyncInvoker<ListServicesRequest, ListServicesResponse> listServicesInvoker(ListServicesRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.listServices, hcClient);
    }

    /**
     * 列出被添加到标签策略强制执行的资源类型
     *
     * 列出被添加到标签策略强制执行的资源类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagPolicyServicesRequest 请求对象
     * @return ListTagPolicyServicesResponse
     */
    public ListTagPolicyServicesResponse listTagPolicyServices(ListTagPolicyServicesRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.listTagPolicyServices);
    }

    /**
     * 列出被添加到标签策略强制执行的资源类型
     *
     * 列出被添加到标签策略强制执行的资源类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagPolicyServicesRequest 请求对象
     * @return SyncInvoker<ListTagPolicyServicesRequest, ListTagPolicyServicesResponse>
     */
    public SyncInvoker<ListTagPolicyServicesRequest, ListTagPolicyServicesResponse> listTagPolicyServicesInvoker(
        ListTagPolicyServicesRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.listTagPolicyServices, hcClient);
    }

    /**
     * 查询有效的策略
     *
     * 查询指定策略类型和账号的有效策略信息。当前此接口不支持查询服务控制策略（service_control_policy）。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEffectivePoliciesRequest 请求对象
     * @return ShowEffectivePoliciesResponse
     */
    public ShowEffectivePoliciesResponse showEffectivePolicies(ShowEffectivePoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.showEffectivePolicies);
    }

    /**
     * 查询有效的策略
     *
     * 查询指定策略类型和账号的有效策略信息。当前此接口不支持查询服务控制策略（service_control_policy）。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEffectivePoliciesRequest 请求对象
     * @return SyncInvoker<ShowEffectivePoliciesRequest, ShowEffectivePoliciesResponse>
     */
    public SyncInvoker<ShowEffectivePoliciesRequest, ShowEffectivePoliciesResponse> showEffectivePoliciesInvoker(
        ShowEffectivePoliciesRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.showEffectivePolicies, hcClient);
    }

    /**
     * 创建组织
     *
     * 创建组织。调用此接口的账号将自动成为新组织的管理账号，调用此接口的账号凭证必须是新组织管理账号的账号凭证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrganizationRequest 请求对象
     * @return CreateOrganizationResponse
     */
    public CreateOrganizationResponse createOrganization(CreateOrganizationRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.createOrganization);
    }

    /**
     * 创建组织
     *
     * 创建组织。调用此接口的账号将自动成为新组织的管理账号，调用此接口的账号凭证必须是新组织管理账号的账号凭证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrganizationRequest 请求对象
     * @return SyncInvoker<CreateOrganizationRequest, CreateOrganizationResponse>
     */
    public SyncInvoker<CreateOrganizationRequest, CreateOrganizationResponse> createOrganizationInvoker(
        CreateOrganizationRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.createOrganization, hcClient);
    }

    /**
     * 删除组织
     *
     * 删除组织。您必须使用管理账号才能删除组织，并且先移除组织中的所有账号、组织单元和策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOrganizationRequest 请求对象
     * @return DeleteOrganizationResponse
     */
    public DeleteOrganizationResponse deleteOrganization(DeleteOrganizationRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.deleteOrganization);
    }

    /**
     * 删除组织
     *
     * 删除组织。您必须使用管理账号才能删除组织，并且先移除组织中的所有账号、组织单元和策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOrganizationRequest 请求对象
     * @return SyncInvoker<DeleteOrganizationRequest, DeleteOrganizationResponse>
     */
    public SyncInvoker<DeleteOrganizationRequest, DeleteOrganizationResponse> deleteOrganizationInvoker(
        DeleteOrganizationRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.deleteOrganization, hcClient);
    }

    /**
     * 离开当前组织
     *
     * 此操作只能由组织的成员账号调用。只有当组织账号配置了作为独立账号运行所需的信息时，您才能作为成员账号离开组织。要离开的账号不能是组织启用的任何服务的委托管理员账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LeaveOrganizationRequest 请求对象
     * @return LeaveOrganizationResponse
     */
    public LeaveOrganizationResponse leaveOrganization(LeaveOrganizationRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.leaveOrganization);
    }

    /**
     * 离开当前组织
     *
     * 此操作只能由组织的成员账号调用。只有当组织账号配置了作为独立账号运行所需的信息时，您才能作为成员账号离开组织。要离开的账号不能是组织启用的任何服务的委托管理员账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LeaveOrganizationRequest 请求对象
     * @return SyncInvoker<LeaveOrganizationRequest, LeaveOrganizationResponse>
     */
    public SyncInvoker<LeaveOrganizationRequest, LeaveOrganizationResponse> leaveOrganizationInvoker(
        LeaveOrganizationRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.leaveOrganization, hcClient);
    }

    /**
     * 列出组织的根
     *
     * 列出当前组织的根。此接口只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRootsRequest 请求对象
     * @return ListRootsResponse
     */
    public ListRootsResponse listRoots(ListRootsRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.listRoots);
    }

    /**
     * 列出组织的根
     *
     * 列出当前组织的根。此接口只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRootsRequest 请求对象
     * @return SyncInvoker<ListRootsRequest, ListRootsResponse>
     */
    public SyncInvoker<ListRootsRequest, ListRootsResponse> listRootsInvoker(ListRootsRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.listRoots, hcClient);
    }

    /**
     * 查询所属组织信息
     *
     * 查询账号所属组织的信息。此操作可以由组织中的任何账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrganizationRequest 请求对象
     * @return ShowOrganizationResponse
     */
    public ShowOrganizationResponse showOrganization(ShowOrganizationRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.showOrganization);
    }

    /**
     * 查询所属组织信息
     *
     * 查询账号所属组织的信息。此操作可以由组织中的任何账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrganizationRequest 请求对象
     * @return SyncInvoker<ShowOrganizationRequest, ShowOrganizationResponse>
     */
    public SyncInvoker<ShowOrganizationRequest, ShowOrganizationResponse> showOrganizationInvoker(
        ShowOrganizationRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.showOrganization, hcClient);
    }

    /**
     * 创建组织单元
     *
     * 在根或父组织单元中创建组织单元。组织单元是账号的容器，使您能够对账号进行分组管理，并根据业务要求应用策略。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrganizationalUnitRequest 请求对象
     * @return CreateOrganizationalUnitResponse
     */
    public CreateOrganizationalUnitResponse createOrganizationalUnit(CreateOrganizationalUnitRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.createOrganizationalUnit);
    }

    /**
     * 创建组织单元
     *
     * 在根或父组织单元中创建组织单元。组织单元是账号的容器，使您能够对账号进行分组管理，并根据业务要求应用策略。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOrganizationalUnitRequest 请求对象
     * @return SyncInvoker<CreateOrganizationalUnitRequest, CreateOrganizationalUnitResponse>
     */
    public SyncInvoker<CreateOrganizationalUnitRequest, CreateOrganizationalUnitResponse> createOrganizationalUnitInvoker(
        CreateOrganizationalUnitRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.createOrganizationalUnit, hcClient);
    }

    /**
     * 删除组织单元
     *
     * 从根或其他组织单元中删除组织单元。前提是您必须先移除该组织单元中的所有成员账号或将成员账号移动至其他组织单元，必须删除该组织单元中的所有子组织单元。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOrganizationalUnitRequest 请求对象
     * @return DeleteOrganizationalUnitResponse
     */
    public DeleteOrganizationalUnitResponse deleteOrganizationalUnit(DeleteOrganizationalUnitRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.deleteOrganizationalUnit);
    }

    /**
     * 删除组织单元
     *
     * 从根或其他组织单元中删除组织单元。前提是您必须先移除该组织单元中的所有成员账号或将成员账号移动至其他组织单元，必须删除该组织单元中的所有子组织单元。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOrganizationalUnitRequest 请求对象
     * @return SyncInvoker<DeleteOrganizationalUnitRequest, DeleteOrganizationalUnitResponse>
     */
    public SyncInvoker<DeleteOrganizationalUnitRequest, DeleteOrganizationalUnitResponse> deleteOrganizationalUnitInvoker(
        DeleteOrganizationalUnitRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.deleteOrganizationalUnit, hcClient);
    }

    /**
     * 列出组织单元
     *
     * 列出组织中的所有组织单元。如果指定父级组织单元，则将获得父级直系子级的组织单元列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationalUnitsRequest 请求对象
     * @return ListOrganizationalUnitsResponse
     */
    public ListOrganizationalUnitsResponse listOrganizationalUnits(ListOrganizationalUnitsRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.listOrganizationalUnits);
    }

    /**
     * 列出组织单元
     *
     * 列出组织中的所有组织单元。如果指定父级组织单元，则将获得父级直系子级的组织单元列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrganizationalUnitsRequest 请求对象
     * @return SyncInvoker<ListOrganizationalUnitsRequest, ListOrganizationalUnitsResponse>
     */
    public SyncInvoker<ListOrganizationalUnitsRequest, ListOrganizationalUnitsResponse> listOrganizationalUnitsInvoker(
        ListOrganizationalUnitsRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.listOrganizationalUnits, hcClient);
    }

    /**
     * 查询有关组织单元的信息
     *
     * 查询有关组织单元的信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrganizationalUnitRequest 请求对象
     * @return ShowOrganizationalUnitResponse
     */
    public ShowOrganizationalUnitResponse showOrganizationalUnit(ShowOrganizationalUnitRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.showOrganizationalUnit);
    }

    /**
     * 查询有关组织单元的信息
     *
     * 查询有关组织单元的信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrganizationalUnitRequest 请求对象
     * @return SyncInvoker<ShowOrganizationalUnitRequest, ShowOrganizationalUnitResponse>
     */
    public SyncInvoker<ShowOrganizationalUnitRequest, ShowOrganizationalUnitResponse> showOrganizationalUnitInvoker(
        ShowOrganizationalUnitRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.showOrganizationalUnit, hcClient);
    }

    /**
     * 更改组织单元名称
     *
     * 重命名指定的组织单元。重命名后组织单元ID不变，下属子组织单元和下属账号不变，组织单元绑定的策略不变。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOrganizationalUnitRequest 请求对象
     * @return UpdateOrganizationalUnitResponse
     */
    public UpdateOrganizationalUnitResponse updateOrganizationalUnit(UpdateOrganizationalUnitRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.updateOrganizationalUnit);
    }

    /**
     * 更改组织单元名称
     *
     * 重命名指定的组织单元。重命名后组织单元ID不变，下属子组织单元和下属账号不变，组织单元绑定的策略不变。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOrganizationalUnitRequest 请求对象
     * @return SyncInvoker<UpdateOrganizationalUnitRequest, UpdateOrganizationalUnitResponse>
     */
    public SyncInvoker<UpdateOrganizationalUnitRequest, UpdateOrganizationalUnitResponse> updateOrganizationalUnitInvoker(
        UpdateOrganizationalUnitRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.updateOrganizationalUnit, hcClient);
    }

    /**
     * 将策略跟实体绑定
     *
     * 绑定策略到根、组织单元或个人账号。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachPolicyRequest 请求对象
     * @return AttachPolicyResponse
     */
    public AttachPolicyResponse attachPolicy(AttachPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.attachPolicy);
    }

    /**
     * 将策略跟实体绑定
     *
     * 绑定策略到根、组织单元或个人账号。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachPolicyRequest 请求对象
     * @return SyncInvoker<AttachPolicyRequest, AttachPolicyResponse>
     */
    public SyncInvoker<AttachPolicyRequest, AttachPolicyResponse> attachPolicyInvoker(AttachPolicyRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.attachPolicy, hcClient);
    }

    /**
     * 创建策略
     *
     * 创建指定类型的策略。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyRequest 请求对象
     * @return CreatePolicyResponse
     */
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.createPolicy);
    }

    /**
     * 创建策略
     *
     * 创建指定类型的策略。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyRequest 请求对象
     * @return SyncInvoker<CreatePolicyRequest, CreatePolicyResponse>
     */
    public SyncInvoker<CreatePolicyRequest, CreatePolicyResponse> createPolicyInvoker(CreatePolicyRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.createPolicy, hcClient);
    }

    /**
     * 删除策略
     *
     * 从组织中删除指定的策略。在执行此操作之前，必须首先将策略跟所有组织单元、根和账号解绑。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyRequest 请求对象
     * @return DeletePolicyResponse
     */
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.deletePolicy);
    }

    /**
     * 删除策略
     *
     * 从组织中删除指定的策略。在执行此操作之前，必须首先将策略跟所有组织单元、根和账号解绑。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyRequest 请求对象
     * @return SyncInvoker<DeletePolicyRequest, DeletePolicyResponse>
     */
    public SyncInvoker<DeletePolicyRequest, DeletePolicyResponse> deletePolicyInvoker(DeletePolicyRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.deletePolicy, hcClient);
    }

    /**
     * 将策略跟实体解绑
     *
     * 从根、组织单元或账号解绑策略。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachPolicyRequest 请求对象
     * @return DetachPolicyResponse
     */
    public DetachPolicyResponse detachPolicy(DetachPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.detachPolicy);
    }

    /**
     * 将策略跟实体解绑
     *
     * 从根、组织单元或账号解绑策略。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachPolicyRequest 请求对象
     * @return SyncInvoker<DetachPolicyRequest, DetachPolicyResponse>
     */
    public SyncInvoker<DetachPolicyRequest, DetachPolicyResponse> detachPolicyInvoker(DetachPolicyRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.detachPolicy, hcClient);
    }

    /**
     * 禁用根中的策略类型
     *
     * 禁用根中的策略类型。只有在根中启用了特定类型的策略，才能将该类型的策略绑定到根中的实体。执行此操作后，您不能再将指定类型的策略绑定到该根或该根中的任何组织单元或账号。这是在后台执行的异步请求。您可以使用ListRoots查看指定根的策略类型的状态。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisablePolicyTypeRequest 请求对象
     * @return DisablePolicyTypeResponse
     */
    public DisablePolicyTypeResponse disablePolicyType(DisablePolicyTypeRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.disablePolicyType);
    }

    /**
     * 禁用根中的策略类型
     *
     * 禁用根中的策略类型。只有在根中启用了特定类型的策略，才能将该类型的策略绑定到根中的实体。执行此操作后，您不能再将指定类型的策略绑定到该根或该根中的任何组织单元或账号。这是在后台执行的异步请求。您可以使用ListRoots查看指定根的策略类型的状态。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisablePolicyTypeRequest 请求对象
     * @return SyncInvoker<DisablePolicyTypeRequest, DisablePolicyTypeResponse>
     */
    public SyncInvoker<DisablePolicyTypeRequest, DisablePolicyTypeResponse> disablePolicyTypeInvoker(
        DisablePolicyTypeRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.disablePolicyType, hcClient);
    }

    /**
     * 在根中启用策略类型
     *
     * 在根中启用策略类型。在根中启用策略类型后，您可以将该类型的策略绑定到根、或该根中的任何组织单元和账号。这是在后台执行的异步请求。您可以使用ListRoots查看指定根的策略类型的状态。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnablePolicyTypeRequest 请求对象
     * @return EnablePolicyTypeResponse
     */
    public EnablePolicyTypeResponse enablePolicyType(EnablePolicyTypeRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.enablePolicyType);
    }

    /**
     * 在根中启用策略类型
     *
     * 在根中启用策略类型。在根中启用策略类型后，您可以将该类型的策略绑定到根、或该根中的任何组织单元和账号。这是在后台执行的异步请求。您可以使用ListRoots查看指定根的策略类型的状态。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnablePolicyTypeRequest 请求对象
     * @return SyncInvoker<EnablePolicyTypeRequest, EnablePolicyTypeResponse>
     */
    public SyncInvoker<EnablePolicyTypeRequest, EnablePolicyTypeResponse> enablePolicyTypeInvoker(
        EnablePolicyTypeRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.enablePolicyType, hcClient);
    }

    /**
     * 列出跟指定策略绑定的所有实体
     *
     * 列出跟指定策略绑定的所有根、组织单元和账号。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEntitiesForPolicyRequest 请求对象
     * @return ListEntitiesForPolicyResponse
     */
    public ListEntitiesForPolicyResponse listEntitiesForPolicy(ListEntitiesForPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.listEntitiesForPolicy);
    }

    /**
     * 列出跟指定策略绑定的所有实体
     *
     * 列出跟指定策略绑定的所有根、组织单元和账号。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEntitiesForPolicyRequest 请求对象
     * @return SyncInvoker<ListEntitiesForPolicyRequest, ListEntitiesForPolicyResponse>
     */
    public SyncInvoker<ListEntitiesForPolicyRequest, ListEntitiesForPolicyResponse> listEntitiesForPolicyInvoker(
        ListEntitiesForPolicyRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.listEntitiesForPolicy, hcClient);
    }

    /**
     * 列出策略
     *
     * 列出组织中的所有策略。如果指定了资源ID，例如组织单元ID或账号ID，则将获得该资源已绑定的策略列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoliciesRequest 请求对象
     * @return ListPoliciesResponse
     */
    public ListPoliciesResponse listPolicies(ListPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.listPolicies);
    }

    /**
     * 列出策略
     *
     * 列出组织中的所有策略。如果指定了资源ID，例如组织单元ID或账号ID，则将获得该资源已绑定的策略列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoliciesRequest 请求对象
     * @return SyncInvoker<ListPoliciesRequest, ListPoliciesResponse>
     */
    public SyncInvoker<ListPoliciesRequest, ListPoliciesResponse> listPoliciesInvoker(ListPoliciesRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.listPolicies, hcClient);
    }

    /**
     * 查询策略相关信息
     *
     * 检索策略的相关信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyRequest 请求对象
     * @return ShowPolicyResponse
     */
    public ShowPolicyResponse showPolicy(ShowPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.showPolicy);
    }

    /**
     * 查询策略相关信息
     *
     * 检索策略的相关信息。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPolicyRequest 请求对象
     * @return SyncInvoker<ShowPolicyRequest, ShowPolicyResponse>
     */
    public SyncInvoker<ShowPolicyRequest, ShowPolicyResponse> showPolicyInvoker(ShowPolicyRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.showPolicy, hcClient);
    }

    /**
     * 更新策略
     *
     * 更新策略，可以更新策略的名称、描述或内容。如果不提供任何参数，则策略将保持不变。您不能更改策略的类型。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyRequest 请求对象
     * @return UpdatePolicyResponse
     */
    public UpdatePolicyResponse updatePolicy(UpdatePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.updatePolicy);
    }

    /**
     * 更新策略
     *
     * 更新策略，可以更新策略的名称、描述或内容。如果不提供任何参数，则策略将保持不变。您不能更改策略的类型。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyRequest 请求对象
     * @return SyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse>
     */
    public SyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicyInvoker(UpdatePolicyRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.updatePolicy, hcClient);
    }

    /**
     * 为指定资源类型添加标签
     *
     * 向指定的资源类型添加一个或多个标签。目前，您可以将标签附加到组织中的账号、组织单元、根和策略。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagResourceRequest 请求对象
     * @return CreateTagResourceResponse
     */
    public CreateTagResourceResponse createTagResource(CreateTagResourceRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.createTagResource);
    }

    /**
     * 为指定资源类型添加标签
     *
     * 向指定的资源类型添加一个或多个标签。目前，您可以将标签附加到组织中的账号、组织单元、根和策略。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagResourceRequest 请求对象
     * @return SyncInvoker<CreateTagResourceRequest, CreateTagResourceResponse>
     */
    public SyncInvoker<CreateTagResourceRequest, CreateTagResourceResponse> createTagResourceInvoker(
        CreateTagResourceRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.createTagResource, hcClient);
    }

    /**
     * 从指定资源类型中删除指定主键标签
     *
     * 从指定资源类型中删除具有指定主键的任何标签。您可以将标签绑定到组织中的账号、组织单元、根和策略。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagResourceRequest 请求对象
     * @return DeleteTagResourceResponse
     */
    public DeleteTagResourceResponse deleteTagResource(DeleteTagResourceRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.deleteTagResource);
    }

    /**
     * 从指定资源类型中删除指定主键标签
     *
     * 从指定资源类型中删除具有指定主键的任何标签。您可以将标签绑定到组织中的账号、组织单元、根和策略。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagResourceRequest 请求对象
     * @return SyncInvoker<DeleteTagResourceRequest, DeleteTagResourceResponse>
     */
    public SyncInvoker<DeleteTagResourceRequest, DeleteTagResourceResponse> deleteTagResourceInvoker(
        DeleteTagResourceRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.deleteTagResource, hcClient);
    }

    /**
     * 根据资源类型及标签信息查询实例列表
     *
     * 根据资源类型及标签信息查询实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstancesRequest 请求对象
     * @return ListResourceInstancesResponse
     */
    public ListResourceInstancesResponse listResourceInstances(ListResourceInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.listResourceInstances);
    }

    /**
     * 根据资源类型及标签信息查询实例列表
     *
     * 根据资源类型及标签信息查询实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceInstancesRequest 请求对象
     * @return SyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse>
     */
    public SyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstancesInvoker(
        ListResourceInstancesRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.listResourceInstances, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceTagsRequest 请求对象
     * @return ListResourceTagsResponse
     */
    public ListResourceTagsResponse listResourceTags(ListResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.listResourceTags);
    }

    /**
     * 查询资源标签
     *
     * 查询资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceTagsRequest 请求对象
     * @return SyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse>
     */
    public SyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse> listResourceTagsInvoker(
        ListResourceTagsRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.listResourceTags, hcClient);
    }

    /**
     * 列出绑定到指定资源类型的标签
     *
     * 列出绑定到指定资源类型的标签。您可以将标签附加到组织中的账号、组织单元、根和策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagResourcesRequest 请求对象
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.listTagResources);
    }

    /**
     * 列出绑定到指定资源类型的标签
     *
     * 列出绑定到指定资源类型的标签。您可以将标签附加到组织中的账号、组织单元、根和策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagResourcesRequest 请求对象
     * @return SyncInvoker<ListTagResourcesRequest, ListTagResourcesResponse>
     */
    public SyncInvoker<ListTagResourcesRequest, ListTagResourcesResponse> listTagResourcesInvoker(
        ListTagResourcesRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.listTagResources, hcClient);
    }

    /**
     * 列出绑定到指定资源的标签
     *
     * 列出绑定到指定资源的标签。您可以将标签附加到组织中的账号、组织单元、根和策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsForResourceRequest 请求对象
     * @return ListTagsForResourceResponse
     */
    public ListTagsForResourceResponse listTagsForResource(ListTagsForResourceRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.listTagsForResource);
    }

    /**
     * 列出绑定到指定资源的标签
     *
     * 列出绑定到指定资源的标签。您可以将标签附加到组织中的账号、组织单元、根和策略。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsForResourceRequest 请求对象
     * @return SyncInvoker<ListTagsForResourceRequest, ListTagsForResourceResponse>
     */
    public SyncInvoker<ListTagsForResourceRequest, ListTagsForResourceResponse> listTagsForResourceInvoker(
        ListTagsForResourceRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.listTagsForResource, hcClient);
    }

    /**
     * 根据资源类型及标签信息查询实例数量
     *
     * 根据资源类型及标签信息查询实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceInstancesCountRequest 请求对象
     * @return ShowResourceInstancesCountResponse
     */
    public ShowResourceInstancesCountResponse showResourceInstancesCount(ShowResourceInstancesCountRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.showResourceInstancesCount);
    }

    /**
     * 根据资源类型及标签信息查询实例数量
     *
     * 根据资源类型及标签信息查询实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceInstancesCountRequest 请求对象
     * @return SyncInvoker<ShowResourceInstancesCountRequest, ShowResourceInstancesCountResponse>
     */
    public SyncInvoker<ShowResourceInstancesCountRequest, ShowResourceInstancesCountResponse> showResourceInstancesCountInvoker(
        ShowResourceInstancesCountRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.showResourceInstancesCount, hcClient);
    }

    /**
     * 为指定资源添加标签
     *
     * 向指定的资源添加一个或多个标签。目前，您可以将标签附加到组织中的账号、组织单元、根和策略。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagResourceRequest 请求对象
     * @return TagResourceResponse
     */
    public TagResourceResponse tagResource(TagResourceRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.tagResource);
    }

    /**
     * 为指定资源添加标签
     *
     * 向指定的资源添加一个或多个标签。目前，您可以将标签附加到组织中的账号、组织单元、根和策略。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagResourceRequest 请求对象
     * @return SyncInvoker<TagResourceRequest, TagResourceResponse>
     */
    public SyncInvoker<TagResourceRequest, TagResourceResponse> tagResourceInvoker(TagResourceRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.tagResource, hcClient);
    }

    /**
     * 从指定资源中删除指定主键标签
     *
     * 从指定资源中删除具有指定主键的任何标签。您可以将标签绑定到组织中的账号、组织单元、根和策略。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UntagResourceRequest 请求对象
     * @return UntagResourceResponse
     */
    public UntagResourceResponse untagResource(UntagResourceRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.untagResource);
    }

    /**
     * 从指定资源中删除指定主键标签
     *
     * 从指定资源中删除具有指定主键的任何标签。您可以将标签绑定到组织中的账号、组织单元、根和策略。此操作只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UntagResourceRequest 请求对象
     * @return SyncInvoker<UntagResourceRequest, UntagResourceResponse>
     */
    public SyncInvoker<UntagResourceRequest, UntagResourceResponse> untagResourceInvoker(UntagResourceRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.untagResource, hcClient);
    }

    /**
     * 禁用受信任服务
     *
     * 禁用服务（由service_principal指定的服务）与组织的集成。禁用可信服务后，指定服务将不可以在组织中的新账号中创建服务关联委托。这意味着该服务无法代表您对组织中的任何新账号执行操作。在服务完成从组织中的清理之前，服务仍可以在旧账号中执行操作。此接口只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableTrustedServiceRequest 请求对象
     * @return DisableTrustedServiceResponse
     */
    public DisableTrustedServiceResponse disableTrustedService(DisableTrustedServiceRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.disableTrustedService);
    }

    /**
     * 禁用受信任服务
     *
     * 禁用服务（由service_principal指定的服务）与组织的集成。禁用可信服务后，指定服务将不可以在组织中的新账号中创建服务关联委托。这意味着该服务无法代表您对组织中的任何新账号执行操作。在服务完成从组织中的清理之前，服务仍可以在旧账号中执行操作。此接口只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableTrustedServiceRequest 请求对象
     * @return SyncInvoker<DisableTrustedServiceRequest, DisableTrustedServiceResponse>
     */
    public SyncInvoker<DisableTrustedServiceRequest, DisableTrustedServiceResponse> disableTrustedServiceInvoker(
        DisableTrustedServiceRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.disableTrustedService, hcClient);
    }

    /**
     * 启用可信服务
     *
     * 启用服务（由service_principal指定的服务）与组织的集成。启用可信服务后，允许指定的可信服务对组织中的所有账号创建服务关联委托。这允许可信服务代表您在组织及其账号中执行操作。此接口只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableTrustedServiceRequest 请求对象
     * @return EnableTrustedServiceResponse
     */
    public EnableTrustedServiceResponse enableTrustedService(EnableTrustedServiceRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.enableTrustedService);
    }

    /**
     * 启用可信服务
     *
     * 启用服务（由service_principal指定的服务）与组织的集成。启用可信服务后，允许指定的可信服务对组织中的所有账号创建服务关联委托。这允许可信服务代表您在组织及其账号中执行操作。此接口只能由组织的管理账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableTrustedServiceRequest 请求对象
     * @return SyncInvoker<EnableTrustedServiceRequest, EnableTrustedServiceResponse>
     */
    public SyncInvoker<EnableTrustedServiceRequest, EnableTrustedServiceResponse> enableTrustedServiceInvoker(
        EnableTrustedServiceRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.enableTrustedService, hcClient);
    }

    /**
     * 列出组织的可信服务列表
     *
     * 返回启用与组织集成的可信服务列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrustedServicesRequest 请求对象
     * @return ListTrustedServicesResponse
     */
    public ListTrustedServicesResponse listTrustedServices(ListTrustedServicesRequest request) {
        return hcClient.syncInvokeHttp(request, OrganizationsMeta.listTrustedServices);
    }

    /**
     * 列出组织的可信服务列表
     *
     * 返回启用与组织集成的可信服务列表。此操作只能由组织的管理账号或作为服务委托管理员的成员账号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrustedServicesRequest 请求对象
     * @return SyncInvoker<ListTrustedServicesRequest, ListTrustedServicesResponse>
     */
    public SyncInvoker<ListTrustedServicesRequest, ListTrustedServicesResponse> listTrustedServicesInvoker(
        ListTrustedServicesRequest request) {
        return new SyncInvoker<>(request, OrganizationsMeta.listTrustedServices, hcClient);
    }

}
