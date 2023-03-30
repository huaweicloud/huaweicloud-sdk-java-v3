package com.huaweicloud.sdk.organizations.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.organizations.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class OrganizationsAsyncClient {

    protected HcClient hcClient;

    public OrganizationsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<OrganizationsAsyncClient> newBuilder() {
        return new ClientBuilder<>(OrganizationsAsyncClient::new, "GlobalCredentials");
    }

    /**
     * 邀请帐号加入组织
     *
     * 向另一个帐号发送邀请，受邀帐号将以成员帐号加入您的组织。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param InviteAccountRequest 请求对象
     * @return CompletableFuture<InviteAccountResponse>
     */
    public CompletableFuture<InviteAccountResponse> inviteAccountAsync(InviteAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.inviteAccount);
    }

    /**
     * 邀请帐号加入组织
     *
     * 向另一个帐号发送邀请，受邀帐号将以成员帐号加入您的组织。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param InviteAccountRequest 请求对象
     * @return AsyncInvoker<InviteAccountRequest, InviteAccountResponse>
     */
    public AsyncInvoker<InviteAccountRequest, InviteAccountResponse> inviteAccountAsyncInvoker(
        InviteAccountRequest request) {
        return new AsyncInvoker<InviteAccountRequest, InviteAccountResponse>(request, OrganizationsMeta.inviteAccount,
            hcClient);
    }

    /**
     * 列出组织中的帐号
     *
     * 列出组织中的帐号。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。如果指定父级组织单元，则将获得作为父级直系子级的所有帐号的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccountsRequest 请求对象
     * @return CompletableFuture<ListAccountsResponse>
     */
    public CompletableFuture<ListAccountsResponse> listAccountsAsync(ListAccountsRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.listAccounts);
    }

    /**
     * 列出组织中的帐号
     *
     * 列出组织中的帐号。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。如果指定父级组织单元，则将获得作为父级直系子级的所有帐号的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAccountsRequest 请求对象
     * @return AsyncInvoker<ListAccountsRequest, ListAccountsResponse>
     */
    public AsyncInvoker<ListAccountsRequest, ListAccountsResponse> listAccountsAsyncInvoker(
        ListAccountsRequest request) {
        return new AsyncInvoker<ListAccountsRequest, ListAccountsResponse>(request, OrganizationsMeta.listAccounts,
            hcClient);
    }

    /**
     * 列出创建帐号的状态
     *
     * 列出组织中指定状态的帐号创建请求。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCreateAccountStatusesRequest 请求对象
     * @return CompletableFuture<ListCreateAccountStatusesResponse>
     */
    public CompletableFuture<ListCreateAccountStatusesResponse> listCreateAccountStatusesAsync(
        ListCreateAccountStatusesRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.listCreateAccountStatuses);
    }

    /**
     * 列出创建帐号的状态
     *
     * 列出组织中指定状态的帐号创建请求。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCreateAccountStatusesRequest 请求对象
     * @return AsyncInvoker<ListCreateAccountStatusesRequest, ListCreateAccountStatusesResponse>
     */
    public AsyncInvoker<ListCreateAccountStatusesRequest, ListCreateAccountStatusesResponse> listCreateAccountStatusesAsyncInvoker(
        ListCreateAccountStatusesRequest request) {
        return new AsyncInvoker<ListCreateAccountStatusesRequest, ListCreateAccountStatusesResponse>(request,
            OrganizationsMeta.listCreateAccountStatuses, hcClient);
    }

    /**
     * 移动帐号
     *
     * 将帐号从其当前源位置（根或组织单元）移动到指定的目标位置（根或组织单元）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MoveAccountRequest 请求对象
     * @return CompletableFuture<MoveAccountResponse>
     */
    public CompletableFuture<MoveAccountResponse> moveAccountAsync(MoveAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.moveAccount);
    }

    /**
     * 移动帐号
     *
     * 将帐号从其当前源位置（根或组织单元）移动到指定的目标位置（根或组织单元）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param MoveAccountRequest 请求对象
     * @return AsyncInvoker<MoveAccountRequest, MoveAccountResponse>
     */
    public AsyncInvoker<MoveAccountRequest, MoveAccountResponse> moveAccountAsyncInvoker(MoveAccountRequest request) {
        return new AsyncInvoker<MoveAccountRequest, MoveAccountResponse>(request, OrganizationsMeta.moveAccount,
            hcClient);
    }

    /**
     * 移除指定的帐号
     *
     * 从组织中移除指定的帐号。移除的帐号将成为一个独立帐号，该帐号不是任何组织的成员。此操作只能由组织的管理帐号调用。只有当帐号配置了作为独立帐号运行所需的信息时，您才能从组织中移除帐号。注意，要移除的帐号不能是组织启用的任何服务的委托管理员帐号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RemoveAccountRequest 请求对象
     * @return CompletableFuture<RemoveAccountResponse>
     */
    public CompletableFuture<RemoveAccountResponse> removeAccountAsync(RemoveAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.removeAccount);
    }

    /**
     * 移除指定的帐号
     *
     * 从组织中移除指定的帐号。移除的帐号将成为一个独立帐号，该帐号不是任何组织的成员。此操作只能由组织的管理帐号调用。只有当帐号配置了作为独立帐号运行所需的信息时，您才能从组织中移除帐号。注意，要移除的帐号不能是组织启用的任何服务的委托管理员帐号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RemoveAccountRequest 请求对象
     * @return AsyncInvoker<RemoveAccountRequest, RemoveAccountResponse>
     */
    public AsyncInvoker<RemoveAccountRequest, RemoveAccountResponse> removeAccountAsyncInvoker(
        RemoveAccountRequest request) {
        return new AsyncInvoker<RemoveAccountRequest, RemoveAccountResponse>(request, OrganizationsMeta.removeAccount,
            hcClient);
    }

    /**
     * 查询帐号信息
     *
     * 查询有关指定帐号的信息。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAccountRequest 请求对象
     * @return CompletableFuture<ShowAccountResponse>
     */
    public CompletableFuture<ShowAccountResponse> showAccountAsync(ShowAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.showAccount);
    }

    /**
     * 查询帐号信息
     *
     * 查询有关指定帐号的信息。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAccountRequest 请求对象
     * @return AsyncInvoker<ShowAccountRequest, ShowAccountResponse>
     */
    public AsyncInvoker<ShowAccountRequest, ShowAccountResponse> showAccountAsyncInvoker(ShowAccountRequest request) {
        return new AsyncInvoker<ShowAccountRequest, ShowAccountResponse>(request, OrganizationsMeta.showAccount,
            hcClient);
    }

    /**
     * 查询有关创建帐号状态的信息
     *
     * 检索创建帐号的异步请求的当前状态。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCreateAccountStatusRequest 请求对象
     * @return CompletableFuture<ShowCreateAccountStatusResponse>
     */
    public CompletableFuture<ShowCreateAccountStatusResponse> showCreateAccountStatusAsync(
        ShowCreateAccountStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.showCreateAccountStatus);
    }

    /**
     * 查询有关创建帐号状态的信息
     *
     * 检索创建帐号的异步请求的当前状态。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCreateAccountStatusRequest 请求对象
     * @return AsyncInvoker<ShowCreateAccountStatusRequest, ShowCreateAccountStatusResponse>
     */
    public AsyncInvoker<ShowCreateAccountStatusRequest, ShowCreateAccountStatusResponse> showCreateAccountStatusAsyncInvoker(
        ShowCreateAccountStatusRequest request) {
        return new AsyncInvoker<ShowCreateAccountStatusRequest, ShowCreateAccountStatusResponse>(request,
            OrganizationsMeta.showCreateAccountStatus, hcClient);
    }

    /**
     * 注销服务的委托管理员
     *
     * 删除指定成员帐号作为指定服务的委托管理员。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeregisterDelegatedAdministratorRequest 请求对象
     * @return CompletableFuture<DeregisterDelegatedAdministratorResponse>
     */
    public CompletableFuture<DeregisterDelegatedAdministratorResponse> deregisterDelegatedAdministratorAsync(
        DeregisterDelegatedAdministratorRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.deregisterDelegatedAdministrator);
    }

    /**
     * 注销服务的委托管理员
     *
     * 删除指定成员帐号作为指定服务的委托管理员。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeregisterDelegatedAdministratorRequest 请求对象
     * @return AsyncInvoker<DeregisterDelegatedAdministratorRequest, DeregisterDelegatedAdministratorResponse>
     */
    public AsyncInvoker<DeregisterDelegatedAdministratorRequest, DeregisterDelegatedAdministratorResponse> deregisterDelegatedAdministratorAsyncInvoker(
        DeregisterDelegatedAdministratorRequest request) {
        return new AsyncInvoker<DeregisterDelegatedAdministratorRequest, DeregisterDelegatedAdministratorResponse>(
            request, OrganizationsMeta.deregisterDelegatedAdministrator, hcClient);
    }

    /**
     * 列出此组织中指定为委托管理员的帐号
     *
     * 列出在此组织中指定为委派管理员的帐号。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDelegatedAdministratorsRequest 请求对象
     * @return CompletableFuture<ListDelegatedAdministratorsResponse>
     */
    public CompletableFuture<ListDelegatedAdministratorsResponse> listDelegatedAdministratorsAsync(
        ListDelegatedAdministratorsRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.listDelegatedAdministrators);
    }

    /**
     * 列出此组织中指定为委托管理员的帐号
     *
     * 列出在此组织中指定为委派管理员的帐号。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDelegatedAdministratorsRequest 请求对象
     * @return AsyncInvoker<ListDelegatedAdministratorsRequest, ListDelegatedAdministratorsResponse>
     */
    public AsyncInvoker<ListDelegatedAdministratorsRequest, ListDelegatedAdministratorsResponse> listDelegatedAdministratorsAsyncInvoker(
        ListDelegatedAdministratorsRequest request) {
        return new AsyncInvoker<ListDelegatedAdministratorsRequest, ListDelegatedAdministratorsResponse>(request,
            OrganizationsMeta.listDelegatedAdministrators, hcClient);
    }

    /**
     * 列出指定帐号是其委托管理员的服务
     *
     * 列出指定帐号是其委托管理员的服务。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDelegatedServicesRequest 请求对象
     * @return CompletableFuture<ListDelegatedServicesResponse>
     */
    public CompletableFuture<ListDelegatedServicesResponse> listDelegatedServicesAsync(
        ListDelegatedServicesRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.listDelegatedServices);
    }

    /**
     * 列出指定帐号是其委托管理员的服务
     *
     * 列出指定帐号是其委托管理员的服务。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDelegatedServicesRequest 请求对象
     * @return AsyncInvoker<ListDelegatedServicesRequest, ListDelegatedServicesResponse>
     */
    public AsyncInvoker<ListDelegatedServicesRequest, ListDelegatedServicesResponse> listDelegatedServicesAsyncInvoker(
        ListDelegatedServicesRequest request) {
        return new AsyncInvoker<ListDelegatedServicesRequest, ListDelegatedServicesResponse>(request,
            OrganizationsMeta.listDelegatedServices, hcClient);
    }

    /**
     * 注册作为服务委托管理员
     *
     * 指定成员帐号能够管理指定服务的组织功能。此接口授予委托管理员对组织服务数据的只读访问权限。委托管理员帐号中的IAM用户仍需要IAM权限才能访问和管理服务。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterDelegatedAdministratorRequest 请求对象
     * @return CompletableFuture<RegisterDelegatedAdministratorResponse>
     */
    public CompletableFuture<RegisterDelegatedAdministratorResponse> registerDelegatedAdministratorAsync(
        RegisterDelegatedAdministratorRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.registerDelegatedAdministrator);
    }

    /**
     * 注册作为服务委托管理员
     *
     * 指定成员帐号能够管理指定服务的组织功能。此接口授予委托管理员对组织服务数据的只读访问权限。委托管理员帐号中的IAM用户仍需要IAM权限才能访问和管理服务。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterDelegatedAdministratorRequest 请求对象
     * @return AsyncInvoker<RegisterDelegatedAdministratorRequest, RegisterDelegatedAdministratorResponse>
     */
    public AsyncInvoker<RegisterDelegatedAdministratorRequest, RegisterDelegatedAdministratorResponse> registerDelegatedAdministratorAsyncInvoker(
        RegisterDelegatedAdministratorRequest request) {
        return new AsyncInvoker<RegisterDelegatedAdministratorRequest, RegisterDelegatedAdministratorResponse>(request,
            OrganizationsMeta.registerDelegatedAdministrator, hcClient);
    }

    /**
     * 接受邀请
     *
     * 向邀请的发起方发送应答，接受加入组织邀请。在您接受邀请后，此邀请信息将继续保留并出现在相关API的返回结果中，保留期限为30天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AcceptHandshakeRequest 请求对象
     * @return CompletableFuture<AcceptHandshakeResponse>
     */
    public CompletableFuture<AcceptHandshakeResponse> acceptHandshakeAsync(AcceptHandshakeRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.acceptHandshake);
    }

    /**
     * 接受邀请
     *
     * 向邀请的发起方发送应答，接受加入组织邀请。在您接受邀请后，此邀请信息将继续保留并出现在相关API的返回结果中，保留期限为30天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AcceptHandshakeRequest 请求对象
     * @return AsyncInvoker<AcceptHandshakeRequest, AcceptHandshakeResponse>
     */
    public AsyncInvoker<AcceptHandshakeRequest, AcceptHandshakeResponse> acceptHandshakeAsyncInvoker(
        AcceptHandshakeRequest request) {
        return new AsyncInvoker<AcceptHandshakeRequest, AcceptHandshakeResponse>(request,
            OrganizationsMeta.acceptHandshake, hcClient);
    }

    /**
     * 取消邀请
     *
     * 取消邀请，此时邀请状态将设置为已取消。此接口只能由发起邀请的帐号调用。取消邀请后，此邀请信息将继续保留并出现在相关API的返回结果中，保留期限为30天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelHandshakeRequest 请求对象
     * @return CompletableFuture<CancelHandshakeResponse>
     */
    public CompletableFuture<CancelHandshakeResponse> cancelHandshakeAsync(CancelHandshakeRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.cancelHandshake);
    }

    /**
     * 取消邀请
     *
     * 取消邀请，此时邀请状态将设置为已取消。此接口只能由发起邀请的帐号调用。取消邀请后，此邀请信息将继续保留并出现在相关API的返回结果中，保留期限为30天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelHandshakeRequest 请求对象
     * @return AsyncInvoker<CancelHandshakeRequest, CancelHandshakeResponse>
     */
    public AsyncInvoker<CancelHandshakeRequest, CancelHandshakeResponse> cancelHandshakeAsyncInvoker(
        CancelHandshakeRequest request) {
        return new AsyncInvoker<CancelHandshakeRequest, CancelHandshakeResponse>(request,
            OrganizationsMeta.cancelHandshake, hcClient);
    }

    /**
     * 拒绝邀请
     *
     * 拒绝邀请请求。受邀帐号拒绝邀请，此时当前邀请状态将设置为拒绝，邀请停止。此接口只能由受邀帐号调用。邀请发起者无法再次激活被拒绝的邀请，但可以重新发送新的邀请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeclineHandshakeRequest 请求对象
     * @return CompletableFuture<DeclineHandshakeResponse>
     */
    public CompletableFuture<DeclineHandshakeResponse> declineHandshakeAsync(DeclineHandshakeRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.declineHandshake);
    }

    /**
     * 拒绝邀请
     *
     * 拒绝邀请请求。受邀帐号拒绝邀请，此时当前邀请状态将设置为拒绝，邀请停止。此接口只能由受邀帐号调用。邀请发起者无法再次激活被拒绝的邀请，但可以重新发送新的邀请。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeclineHandshakeRequest 请求对象
     * @return AsyncInvoker<DeclineHandshakeRequest, DeclineHandshakeResponse>
     */
    public AsyncInvoker<DeclineHandshakeRequest, DeclineHandshakeResponse> declineHandshakeAsyncInvoker(
        DeclineHandshakeRequest request) {
        return new AsyncInvoker<DeclineHandshakeRequest, DeclineHandshakeResponse>(request,
            OrganizationsMeta.declineHandshake, hcClient);
    }

    /**
     * 列出发送的邀请
     *
     * 列出所属组织发送的邀请。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHandshakesRequest 请求对象
     * @return CompletableFuture<ListHandshakesResponse>
     */
    public CompletableFuture<ListHandshakesResponse> listHandshakesAsync(ListHandshakesRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.listHandshakes);
    }

    /**
     * 列出发送的邀请
     *
     * 列出所属组织发送的邀请。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHandshakesRequest 请求对象
     * @return AsyncInvoker<ListHandshakesRequest, ListHandshakesResponse>
     */
    public AsyncInvoker<ListHandshakesRequest, ListHandshakesResponse> listHandshakesAsyncInvoker(
        ListHandshakesRequest request) {
        return new AsyncInvoker<ListHandshakesRequest, ListHandshakesResponse>(request,
            OrganizationsMeta.listHandshakes, hcClient);
    }

    /**
     * 列出收到的邀请
     *
     * 列出帐号收到的所有邀请。此操作可以由任何帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListReceivedHandshakesRequest 请求对象
     * @return CompletableFuture<ListReceivedHandshakesResponse>
     */
    public CompletableFuture<ListReceivedHandshakesResponse> listReceivedHandshakesAsync(
        ListReceivedHandshakesRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.listReceivedHandshakes);
    }

    /**
     * 列出收到的邀请
     *
     * 列出帐号收到的所有邀请。此操作可以由任何帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListReceivedHandshakesRequest 请求对象
     * @return AsyncInvoker<ListReceivedHandshakesRequest, ListReceivedHandshakesResponse>
     */
    public AsyncInvoker<ListReceivedHandshakesRequest, ListReceivedHandshakesResponse> listReceivedHandshakesAsyncInvoker(
        ListReceivedHandshakesRequest request) {
        return new AsyncInvoker<ListReceivedHandshakesRequest, ListReceivedHandshakesResponse>(request,
            OrganizationsMeta.listReceivedHandshakes, hcClient);
    }

    /**
     * 查询邀请相关信息
     *
     * 查询组织中已有帐号邀请的相关信息。此接口可以由组织中的任何帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHandshakeRequest 请求对象
     * @return CompletableFuture<ShowHandshakeResponse>
     */
    public CompletableFuture<ShowHandshakeResponse> showHandshakeAsync(ShowHandshakeRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.showHandshake);
    }

    /**
     * 查询邀请相关信息
     *
     * 查询组织中已有帐号邀请的相关信息。此接口可以由组织中的任何帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHandshakeRequest 请求对象
     * @return AsyncInvoker<ShowHandshakeRequest, ShowHandshakeResponse>
     */
    public AsyncInvoker<ShowHandshakeRequest, ShowHandshakeResponse> showHandshakeAsyncInvoker(
        ShowHandshakeRequest request) {
        return new AsyncInvoker<ShowHandshakeRequest, ShowHandshakeResponse>(request, OrganizationsMeta.showHandshake,
            hcClient);
    }

    /**
     * 列出组织中的根、组织单元和帐号
     *
     * 列出组织中包含的所有根、组织单元和帐号。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。您可以通过指定父ID和子ID参数来过滤实体。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEntitiesRequest 请求对象
     * @return CompletableFuture<ListEntitiesResponse>
     */
    public CompletableFuture<ListEntitiesResponse> listEntitiesAsync(ListEntitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.listEntities);
    }

    /**
     * 列出组织中的根、组织单元和帐号
     *
     * 列出组织中包含的所有根、组织单元和帐号。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。您可以通过指定父ID和子ID参数来过滤实体。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEntitiesRequest 请求对象
     * @return AsyncInvoker<ListEntitiesRequest, ListEntitiesResponse>
     */
    public AsyncInvoker<ListEntitiesRequest, ListEntitiesResponse> listEntitiesAsyncInvoker(
        ListEntitiesRequest request) {
        return new AsyncInvoker<ListEntitiesRequest, ListEntitiesResponse>(request, OrganizationsMeta.listEntities,
            hcClient);
    }

    /**
     * 列出所有可以与组织服务集成的云服务
     *
     * 列出所有可以与组织服务集成的云服务。集成后云服务将成为组织的可信服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServicesRequest 请求对象
     * @return CompletableFuture<ListServicesResponse>
     */
    public CompletableFuture<ListServicesResponse> listServicesAsync(ListServicesRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.listServices);
    }

    /**
     * 列出所有可以与组织服务集成的云服务
     *
     * 列出所有可以与组织服务集成的云服务。集成后云服务将成为组织的可信服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServicesRequest 请求对象
     * @return AsyncInvoker<ListServicesRequest, ListServicesResponse>
     */
    public AsyncInvoker<ListServicesRequest, ListServicesResponse> listServicesAsyncInvoker(
        ListServicesRequest request) {
        return new AsyncInvoker<ListServicesRequest, ListServicesResponse>(request, OrganizationsMeta.listServices,
            hcClient);
    }

    /**
     * 列出被添加到标签策略强制执行的资源类型
     *
     * List all services and resource type that could integrate with tag policy.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagPolicyServicesRequest 请求对象
     * @return CompletableFuture<ListTagPolicyServicesResponse>
     */
    public CompletableFuture<ListTagPolicyServicesResponse> listTagPolicyServicesAsync(
        ListTagPolicyServicesRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.listTagPolicyServices);
    }

    /**
     * 列出被添加到标签策略强制执行的资源类型
     *
     * List all services and resource type that could integrate with tag policy.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagPolicyServicesRequest 请求对象
     * @return AsyncInvoker<ListTagPolicyServicesRequest, ListTagPolicyServicesResponse>
     */
    public AsyncInvoker<ListTagPolicyServicesRequest, ListTagPolicyServicesResponse> listTagPolicyServicesAsyncInvoker(
        ListTagPolicyServicesRequest request) {
        return new AsyncInvoker<ListTagPolicyServicesRequest, ListTagPolicyServicesResponse>(request,
            OrganizationsMeta.listTagPolicyServices, hcClient);
    }

    /**
     * 查询有效的策略
     *
     * 查询指定策略类型和帐户的有效策略信息。当前此接口不支持查询服务控制策略（service_control_policy）。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEffectivePoliciesRequest 请求对象
     * @return CompletableFuture<ShowEffectivePoliciesResponse>
     */
    public CompletableFuture<ShowEffectivePoliciesResponse> showEffectivePoliciesAsync(
        ShowEffectivePoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.showEffectivePolicies);
    }

    /**
     * 查询有效的策略
     *
     * 查询指定策略类型和帐户的有效策略信息。当前此接口不支持查询服务控制策略（service_control_policy）。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEffectivePoliciesRequest 请求对象
     * @return AsyncInvoker<ShowEffectivePoliciesRequest, ShowEffectivePoliciesResponse>
     */
    public AsyncInvoker<ShowEffectivePoliciesRequest, ShowEffectivePoliciesResponse> showEffectivePoliciesAsyncInvoker(
        ShowEffectivePoliciesRequest request) {
        return new AsyncInvoker<ShowEffectivePoliciesRequest, ShowEffectivePoliciesResponse>(request,
            OrganizationsMeta.showEffectivePolicies, hcClient);
    }

    /**
     * 创建组织
     *
     * 创建组织。调用此接口的帐号将自动成为新组织的管理帐号，调用此接口的帐号凭证必须是新组织管理帐号的帐号凭证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateOrganizationRequest 请求对象
     * @return CompletableFuture<CreateOrganizationResponse>
     */
    public CompletableFuture<CreateOrganizationResponse> createOrganizationAsync(CreateOrganizationRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.createOrganization);
    }

    /**
     * 创建组织
     *
     * 创建组织。调用此接口的帐号将自动成为新组织的管理帐号，调用此接口的帐号凭证必须是新组织管理帐号的帐号凭证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateOrganizationRequest 请求对象
     * @return AsyncInvoker<CreateOrganizationRequest, CreateOrganizationResponse>
     */
    public AsyncInvoker<CreateOrganizationRequest, CreateOrganizationResponse> createOrganizationAsyncInvoker(
        CreateOrganizationRequest request) {
        return new AsyncInvoker<CreateOrganizationRequest, CreateOrganizationResponse>(request,
            OrganizationsMeta.createOrganization, hcClient);
    }

    /**
     * 删除组织
     *
     * 删除组织。您必须使用管理帐号才能删除组织，并且先移除组织中的所有帐号、组织单元和策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteOrganizationRequest 请求对象
     * @return CompletableFuture<DeleteOrganizationResponse>
     */
    public CompletableFuture<DeleteOrganizationResponse> deleteOrganizationAsync(DeleteOrganizationRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.deleteOrganization);
    }

    /**
     * 删除组织
     *
     * 删除组织。您必须使用管理帐号才能删除组织，并且先移除组织中的所有帐号、组织单元和策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteOrganizationRequest 请求对象
     * @return AsyncInvoker<DeleteOrganizationRequest, DeleteOrganizationResponse>
     */
    public AsyncInvoker<DeleteOrganizationRequest, DeleteOrganizationResponse> deleteOrganizationAsyncInvoker(
        DeleteOrganizationRequest request) {
        return new AsyncInvoker<DeleteOrganizationRequest, DeleteOrganizationResponse>(request,
            OrganizationsMeta.deleteOrganization, hcClient);
    }

    /**
     * 离开当前组织
     *
     * 此操作只能由组织的成员帐号调用。只有当组织帐号配置了作为独立帐号运行所需的信息时，您才能作为成员账户离开组织。要离开的帐号不能是组织启用的任何服务的委托管理员帐号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param LeaveOrganizationRequest 请求对象
     * @return CompletableFuture<LeaveOrganizationResponse>
     */
    public CompletableFuture<LeaveOrganizationResponse> leaveOrganizationAsync(LeaveOrganizationRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.leaveOrganization);
    }

    /**
     * 离开当前组织
     *
     * 此操作只能由组织的成员帐号调用。只有当组织帐号配置了作为独立帐号运行所需的信息时，您才能作为成员账户离开组织。要离开的帐号不能是组织启用的任何服务的委托管理员帐号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param LeaveOrganizationRequest 请求对象
     * @return AsyncInvoker<LeaveOrganizationRequest, LeaveOrganizationResponse>
     */
    public AsyncInvoker<LeaveOrganizationRequest, LeaveOrganizationResponse> leaveOrganizationAsyncInvoker(
        LeaveOrganizationRequest request) {
        return new AsyncInvoker<LeaveOrganizationRequest, LeaveOrganizationResponse>(request,
            OrganizationsMeta.leaveOrganization, hcClient);
    }

    /**
     * 列出组织的根
     *
     * 列出当前组织的根。此接口只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRootsRequest 请求对象
     * @return CompletableFuture<ListRootsResponse>
     */
    public CompletableFuture<ListRootsResponse> listRootsAsync(ListRootsRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.listRoots);
    }

    /**
     * 列出组织的根
     *
     * 列出当前组织的根。此接口只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRootsRequest 请求对象
     * @return AsyncInvoker<ListRootsRequest, ListRootsResponse>
     */
    public AsyncInvoker<ListRootsRequest, ListRootsResponse> listRootsAsyncInvoker(ListRootsRequest request) {
        return new AsyncInvoker<ListRootsRequest, ListRootsResponse>(request, OrganizationsMeta.listRoots, hcClient);
    }

    /**
     * 查询所属组织信息
     *
     * 查询帐号所属组织的信息。此操作可以由组织中的任何帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOrganizationRequest 请求对象
     * @return CompletableFuture<ShowOrganizationResponse>
     */
    public CompletableFuture<ShowOrganizationResponse> showOrganizationAsync(ShowOrganizationRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.showOrganization);
    }

    /**
     * 查询所属组织信息
     *
     * 查询帐号所属组织的信息。此操作可以由组织中的任何帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOrganizationRequest 请求对象
     * @return AsyncInvoker<ShowOrganizationRequest, ShowOrganizationResponse>
     */
    public AsyncInvoker<ShowOrganizationRequest, ShowOrganizationResponse> showOrganizationAsyncInvoker(
        ShowOrganizationRequest request) {
        return new AsyncInvoker<ShowOrganizationRequest, ShowOrganizationResponse>(request,
            OrganizationsMeta.showOrganization, hcClient);
    }

    /**
     * 创建组织单元
     *
     * 在根或父组织单元中创建组织单元。组织单元是帐号的容器，使您能够对帐号进行分组管理，并根据业务要求应用策略。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateOrganizationalUnitRequest 请求对象
     * @return CompletableFuture<CreateOrganizationalUnitResponse>
     */
    public CompletableFuture<CreateOrganizationalUnitResponse> createOrganizationalUnitAsync(
        CreateOrganizationalUnitRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.createOrganizationalUnit);
    }

    /**
     * 创建组织单元
     *
     * 在根或父组织单元中创建组织单元。组织单元是帐号的容器，使您能够对帐号进行分组管理，并根据业务要求应用策略。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateOrganizationalUnitRequest 请求对象
     * @return AsyncInvoker<CreateOrganizationalUnitRequest, CreateOrganizationalUnitResponse>
     */
    public AsyncInvoker<CreateOrganizationalUnitRequest, CreateOrganizationalUnitResponse> createOrganizationalUnitAsyncInvoker(
        CreateOrganizationalUnitRequest request) {
        return new AsyncInvoker<CreateOrganizationalUnitRequest, CreateOrganizationalUnitResponse>(request,
            OrganizationsMeta.createOrganizationalUnit, hcClient);
    }

    /**
     * 删除组织单元
     *
     * 从根或其他组织单元中删除组织单元。前提是您必须先移除该组织单元中的所有成员帐号或将成员帐号移动至其他组织单元，必须删除该组织单元中的所有子组织单元。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteOrganizationalUnitRequest 请求对象
     * @return CompletableFuture<DeleteOrganizationalUnitResponse>
     */
    public CompletableFuture<DeleteOrganizationalUnitResponse> deleteOrganizationalUnitAsync(
        DeleteOrganizationalUnitRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.deleteOrganizationalUnit);
    }

    /**
     * 删除组织单元
     *
     * 从根或其他组织单元中删除组织单元。前提是您必须先移除该组织单元中的所有成员帐号或将成员帐号移动至其他组织单元，必须删除该组织单元中的所有子组织单元。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteOrganizationalUnitRequest 请求对象
     * @return AsyncInvoker<DeleteOrganizationalUnitRequest, DeleteOrganizationalUnitResponse>
     */
    public AsyncInvoker<DeleteOrganizationalUnitRequest, DeleteOrganizationalUnitResponse> deleteOrganizationalUnitAsyncInvoker(
        DeleteOrganizationalUnitRequest request) {
        return new AsyncInvoker<DeleteOrganizationalUnitRequest, DeleteOrganizationalUnitResponse>(request,
            OrganizationsMeta.deleteOrganizationalUnit, hcClient);
    }

    /**
     * 列出组织单元
     *
     * 列出组织中的所有组织单元。如果指定父级组织单元，则将获得父级直系子级的组织单元列表。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOrganizationalUnitsRequest 请求对象
     * @return CompletableFuture<ListOrganizationalUnitsResponse>
     */
    public CompletableFuture<ListOrganizationalUnitsResponse> listOrganizationalUnitsAsync(
        ListOrganizationalUnitsRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.listOrganizationalUnits);
    }

    /**
     * 列出组织单元
     *
     * 列出组织中的所有组织单元。如果指定父级组织单元，则将获得父级直系子级的组织单元列表。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOrganizationalUnitsRequest 请求对象
     * @return AsyncInvoker<ListOrganizationalUnitsRequest, ListOrganizationalUnitsResponse>
     */
    public AsyncInvoker<ListOrganizationalUnitsRequest, ListOrganizationalUnitsResponse> listOrganizationalUnitsAsyncInvoker(
        ListOrganizationalUnitsRequest request) {
        return new AsyncInvoker<ListOrganizationalUnitsRequest, ListOrganizationalUnitsResponse>(request,
            OrganizationsMeta.listOrganizationalUnits, hcClient);
    }

    /**
     * 查询有关组织单元的信息
     *
     * 查询有关组织单元的信息。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOrganizationalUnitRequest 请求对象
     * @return CompletableFuture<ShowOrganizationalUnitResponse>
     */
    public CompletableFuture<ShowOrganizationalUnitResponse> showOrganizationalUnitAsync(
        ShowOrganizationalUnitRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.showOrganizationalUnit);
    }

    /**
     * 查询有关组织单元的信息
     *
     * 查询有关组织单元的信息。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOrganizationalUnitRequest 请求对象
     * @return AsyncInvoker<ShowOrganizationalUnitRequest, ShowOrganizationalUnitResponse>
     */
    public AsyncInvoker<ShowOrganizationalUnitRequest, ShowOrganizationalUnitResponse> showOrganizationalUnitAsyncInvoker(
        ShowOrganizationalUnitRequest request) {
        return new AsyncInvoker<ShowOrganizationalUnitRequest, ShowOrganizationalUnitResponse>(request,
            OrganizationsMeta.showOrganizationalUnit, hcClient);
    }

    /**
     * 更改组织单元名称
     *
     * 重命名指定的组织单元。重命名后组织单元ID不变，下属子组织单元和下属帐号不变，组织单元绑定的策略不变。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateOrganizationalUnitRequest 请求对象
     * @return CompletableFuture<UpdateOrganizationalUnitResponse>
     */
    public CompletableFuture<UpdateOrganizationalUnitResponse> updateOrganizationalUnitAsync(
        UpdateOrganizationalUnitRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.updateOrganizationalUnit);
    }

    /**
     * 更改组织单元名称
     *
     * 重命名指定的组织单元。重命名后组织单元ID不变，下属子组织单元和下属帐号不变，组织单元绑定的策略不变。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateOrganizationalUnitRequest 请求对象
     * @return AsyncInvoker<UpdateOrganizationalUnitRequest, UpdateOrganizationalUnitResponse>
     */
    public AsyncInvoker<UpdateOrganizationalUnitRequest, UpdateOrganizationalUnitResponse> updateOrganizationalUnitAsyncInvoker(
        UpdateOrganizationalUnitRequest request) {
        return new AsyncInvoker<UpdateOrganizationalUnitRequest, UpdateOrganizationalUnitResponse>(request,
            OrganizationsMeta.updateOrganizationalUnit, hcClient);
    }

    /**
     * 将策略跟实体绑定
     *
     * 绑定策略到根、组织单元或个人账户。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AttachPolicyRequest 请求对象
     * @return CompletableFuture<AttachPolicyResponse>
     */
    public CompletableFuture<AttachPolicyResponse> attachPolicyAsync(AttachPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.attachPolicy);
    }

    /**
     * 将策略跟实体绑定
     *
     * 绑定策略到根、组织单元或个人账户。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AttachPolicyRequest 请求对象
     * @return AsyncInvoker<AttachPolicyRequest, AttachPolicyResponse>
     */
    public AsyncInvoker<AttachPolicyRequest, AttachPolicyResponse> attachPolicyAsyncInvoker(
        AttachPolicyRequest request) {
        return new AsyncInvoker<AttachPolicyRequest, AttachPolicyResponse>(request, OrganizationsMeta.attachPolicy,
            hcClient);
    }

    /**
     * 创建策略
     *
     * 创建指定类型的策略。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePolicyRequest 请求对象
     * @return CompletableFuture<CreatePolicyResponse>
     */
    public CompletableFuture<CreatePolicyResponse> createPolicyAsync(CreatePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.createPolicy);
    }

    /**
     * 创建策略
     *
     * 创建指定类型的策略。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePolicyRequest 请求对象
     * @return AsyncInvoker<CreatePolicyRequest, CreatePolicyResponse>
     */
    public AsyncInvoker<CreatePolicyRequest, CreatePolicyResponse> createPolicyAsyncInvoker(
        CreatePolicyRequest request) {
        return new AsyncInvoker<CreatePolicyRequest, CreatePolicyResponse>(request, OrganizationsMeta.createPolicy,
            hcClient);
    }

    /**
     * 删除策略
     *
     * 从组织中删除指定的策略。在执行此操作之前，必须首先将策略跟所有组织单元、根和帐号解绑。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePolicyRequest 请求对象
     * @return CompletableFuture<DeletePolicyResponse>
     */
    public CompletableFuture<DeletePolicyResponse> deletePolicyAsync(DeletePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.deletePolicy);
    }

    /**
     * 删除策略
     *
     * 从组织中删除指定的策略。在执行此操作之前，必须首先将策略跟所有组织单元、根和帐号解绑。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePolicyRequest 请求对象
     * @return AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse>
     */
    public AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse> deletePolicyAsyncInvoker(
        DeletePolicyRequest request) {
        return new AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse>(request, OrganizationsMeta.deletePolicy,
            hcClient);
    }

    /**
     * 将策略跟实体解绑
     *
     * 从根、组织单元或帐号解绑策略。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetachPolicyRequest 请求对象
     * @return CompletableFuture<DetachPolicyResponse>
     */
    public CompletableFuture<DetachPolicyResponse> detachPolicyAsync(DetachPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.detachPolicy);
    }

    /**
     * 将策略跟实体解绑
     *
     * 从根、组织单元或帐号解绑策略。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetachPolicyRequest 请求对象
     * @return AsyncInvoker<DetachPolicyRequest, DetachPolicyResponse>
     */
    public AsyncInvoker<DetachPolicyRequest, DetachPolicyResponse> detachPolicyAsyncInvoker(
        DetachPolicyRequest request) {
        return new AsyncInvoker<DetachPolicyRequest, DetachPolicyResponse>(request, OrganizationsMeta.detachPolicy,
            hcClient);
    }

    /**
     * 禁用根中的策略类型
     *
     * 禁用根中的策略类型。只有在根中启用了特定类型的策略，才能将该类型的策略绑定到根中的实体。执行此操作后，您不能再将指定类型的策略绑定到该根或该根中的任何组织单元或帐号。这是在后台执行的异步请求。您可以使用ListRoots查看指定根的策略类型的状态。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisablePolicyTypeRequest 请求对象
     * @return CompletableFuture<DisablePolicyTypeResponse>
     */
    public CompletableFuture<DisablePolicyTypeResponse> disablePolicyTypeAsync(DisablePolicyTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.disablePolicyType);
    }

    /**
     * 禁用根中的策略类型
     *
     * 禁用根中的策略类型。只有在根中启用了特定类型的策略，才能将该类型的策略绑定到根中的实体。执行此操作后，您不能再将指定类型的策略绑定到该根或该根中的任何组织单元或帐号。这是在后台执行的异步请求。您可以使用ListRoots查看指定根的策略类型的状态。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisablePolicyTypeRequest 请求对象
     * @return AsyncInvoker<DisablePolicyTypeRequest, DisablePolicyTypeResponse>
     */
    public AsyncInvoker<DisablePolicyTypeRequest, DisablePolicyTypeResponse> disablePolicyTypeAsyncInvoker(
        DisablePolicyTypeRequest request) {
        return new AsyncInvoker<DisablePolicyTypeRequest, DisablePolicyTypeResponse>(request,
            OrganizationsMeta.disablePolicyType, hcClient);
    }

    /**
     * 在根中启用策略类型
     *
     * 在根中启用策略类型。在根中启用策略类型后，您可以将该类型的策略绑定到根、或该根中的任何组织单元和帐号。这是在后台执行的异步请求。您可以使用ListRoots查看指定根的策略类型的状态。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnablePolicyTypeRequest 请求对象
     * @return CompletableFuture<EnablePolicyTypeResponse>
     */
    public CompletableFuture<EnablePolicyTypeResponse> enablePolicyTypeAsync(EnablePolicyTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.enablePolicyType);
    }

    /**
     * 在根中启用策略类型
     *
     * 在根中启用策略类型。在根中启用策略类型后，您可以将该类型的策略绑定到根、或该根中的任何组织单元和帐号。这是在后台执行的异步请求。您可以使用ListRoots查看指定根的策略类型的状态。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnablePolicyTypeRequest 请求对象
     * @return AsyncInvoker<EnablePolicyTypeRequest, EnablePolicyTypeResponse>
     */
    public AsyncInvoker<EnablePolicyTypeRequest, EnablePolicyTypeResponse> enablePolicyTypeAsyncInvoker(
        EnablePolicyTypeRequest request) {
        return new AsyncInvoker<EnablePolicyTypeRequest, EnablePolicyTypeResponse>(request,
            OrganizationsMeta.enablePolicyType, hcClient);
    }

    /**
     * 列出跟指定策略绑定的所有实体
     *
     * 列出跟指定策略绑定的所有根、组织单元和帐号。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEntitiesForPolicyRequest 请求对象
     * @return CompletableFuture<ListEntitiesForPolicyResponse>
     */
    public CompletableFuture<ListEntitiesForPolicyResponse> listEntitiesForPolicyAsync(
        ListEntitiesForPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.listEntitiesForPolicy);
    }

    /**
     * 列出跟指定策略绑定的所有实体
     *
     * 列出跟指定策略绑定的所有根、组织单元和帐号。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEntitiesForPolicyRequest 请求对象
     * @return AsyncInvoker<ListEntitiesForPolicyRequest, ListEntitiesForPolicyResponse>
     */
    public AsyncInvoker<ListEntitiesForPolicyRequest, ListEntitiesForPolicyResponse> listEntitiesForPolicyAsyncInvoker(
        ListEntitiesForPolicyRequest request) {
        return new AsyncInvoker<ListEntitiesForPolicyRequest, ListEntitiesForPolicyResponse>(request,
            OrganizationsMeta.listEntitiesForPolicy, hcClient);
    }

    /**
     * 列出策略
     *
     * 列出组织中的所有策略。如果指定了资源ID，例如组织单元ID或帐号ID，则将获得该资源已绑定的策略列表。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPoliciesRequest 请求对象
     * @return CompletableFuture<ListPoliciesResponse>
     */
    public CompletableFuture<ListPoliciesResponse> listPoliciesAsync(ListPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.listPolicies);
    }

    /**
     * 列出策略
     *
     * 列出组织中的所有策略。如果指定了资源ID，例如组织单元ID或帐号ID，则将获得该资源已绑定的策略列表。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPoliciesRequest 请求对象
     * @return AsyncInvoker<ListPoliciesRequest, ListPoliciesResponse>
     */
    public AsyncInvoker<ListPoliciesRequest, ListPoliciesResponse> listPoliciesAsyncInvoker(
        ListPoliciesRequest request) {
        return new AsyncInvoker<ListPoliciesRequest, ListPoliciesResponse>(request, OrganizationsMeta.listPolicies,
            hcClient);
    }

    /**
     * 查询策略相关信息
     *
     * 检索策略的相关信息。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPolicyRequest 请求对象
     * @return CompletableFuture<ShowPolicyResponse>
     */
    public CompletableFuture<ShowPolicyResponse> showPolicyAsync(ShowPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.showPolicy);
    }

    /**
     * 查询策略相关信息
     *
     * 检索策略的相关信息。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPolicyRequest 请求对象
     * @return AsyncInvoker<ShowPolicyRequest, ShowPolicyResponse>
     */
    public AsyncInvoker<ShowPolicyRequest, ShowPolicyResponse> showPolicyAsyncInvoker(ShowPolicyRequest request) {
        return new AsyncInvoker<ShowPolicyRequest, ShowPolicyResponse>(request, OrganizationsMeta.showPolicy, hcClient);
    }

    /**
     * 更新策略
     *
     * 更新策略，可以更新策略的名称、描述或内容。如果不提供任何参数，则策略将保持不变。您不能更改策略的类型。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePolicyRequest 请求对象
     * @return CompletableFuture<UpdatePolicyResponse>
     */
    public CompletableFuture<UpdatePolicyResponse> updatePolicyAsync(UpdatePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.updatePolicy);
    }

    /**
     * 更新策略
     *
     * 更新策略，可以更新策略的名称、描述或内容。如果不提供任何参数，则策略将保持不变。您不能更改策略的类型。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePolicyRequest 请求对象
     * @return AsyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse>
     */
    public AsyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicyAsyncInvoker(
        UpdatePolicyRequest request) {
        return new AsyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse>(request, OrganizationsMeta.updatePolicy,
            hcClient);
    }

    /**
     * 为指定资源添加标签
     *
     * 向指定的资源添加一个或多个标签。目前，您可以将标签附加到组织中的帐号、组织单元、根和策略。此操作只能由组织的管理帐号调用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTagResourceRequest 请求对象
     * @return CompletableFuture<CreateTagResourceResponse>
     */
    public CompletableFuture<CreateTagResourceResponse> createTagResourceAsync(CreateTagResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.createTagResource);
    }

    /**
     * 为指定资源添加标签
     *
     * 向指定的资源添加一个或多个标签。目前，您可以将标签附加到组织中的帐号、组织单元、根和策略。此操作只能由组织的管理帐号调用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTagResourceRequest 请求对象
     * @return AsyncInvoker<CreateTagResourceRequest, CreateTagResourceResponse>
     */
    public AsyncInvoker<CreateTagResourceRequest, CreateTagResourceResponse> createTagResourceAsyncInvoker(
        CreateTagResourceRequest request) {
        return new AsyncInvoker<CreateTagResourceRequest, CreateTagResourceResponse>(request,
            OrganizationsMeta.createTagResource, hcClient);
    }

    /**
     * 从指定资源中删除指定主键标签
     *
     * 从指定资源中删除具有指定主键的任何标签。您可以将标签绑定到组织中的帐号、组织单元、根和策略。此操作只能由组织的管理帐号调用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTagResourceRequest 请求对象
     * @return CompletableFuture<DeleteTagResourceResponse>
     */
    public CompletableFuture<DeleteTagResourceResponse> deleteTagResourceAsync(DeleteTagResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.deleteTagResource);
    }

    /**
     * 从指定资源中删除指定主键标签
     *
     * 从指定资源中删除具有指定主键的任何标签。您可以将标签绑定到组织中的帐号、组织单元、根和策略。此操作只能由组织的管理帐号调用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTagResourceRequest 请求对象
     * @return AsyncInvoker<DeleteTagResourceRequest, DeleteTagResourceResponse>
     */
    public AsyncInvoker<DeleteTagResourceRequest, DeleteTagResourceResponse> deleteTagResourceAsyncInvoker(
        DeleteTagResourceRequest request) {
        return new AsyncInvoker<DeleteTagResourceRequest, DeleteTagResourceResponse>(request,
            OrganizationsMeta.deleteTagResource, hcClient);
    }

    /**
     * 根据资源类型及标签信息查询实例列表
     *
     * 根据资源类型及标签信息查询实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceInstancesRequest 请求对象
     * @return CompletableFuture<ListResourceInstancesResponse>
     */
    public CompletableFuture<ListResourceInstancesResponse> listResourceInstancesAsync(
        ListResourceInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.listResourceInstances);
    }

    /**
     * 根据资源类型及标签信息查询实例列表
     *
     * 根据资源类型及标签信息查询实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceInstancesRequest 请求对象
     * @return AsyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse>
     */
    public AsyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstancesAsyncInvoker(
        ListResourceInstancesRequest request) {
        return new AsyncInvoker<ListResourceInstancesRequest, ListResourceInstancesResponse>(request,
            OrganizationsMeta.listResourceInstances, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceTagsRequest 请求对象
     * @return CompletableFuture<ListResourceTagsResponse>
     */
    public CompletableFuture<ListResourceTagsResponse> listResourceTagsAsync(ListResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.listResourceTags);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResourceTagsRequest 请求对象
     * @return AsyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse>
     */
    public AsyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse> listResourceTagsAsyncInvoker(
        ListResourceTagsRequest request) {
        return new AsyncInvoker<ListResourceTagsRequest, ListResourceTagsResponse>(request,
            OrganizationsMeta.listResourceTags, hcClient);
    }

    /**
     * 列出绑定到指定资源的标签
     *
     * 列出绑定到指定资源的标签。您可以将标签附加到组织中的帐号、组织单元、根和策略。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagResourcesRequest 请求对象
     * @return CompletableFuture<ListTagResourcesResponse>
     */
    public CompletableFuture<ListTagResourcesResponse> listTagResourcesAsync(ListTagResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.listTagResources);
    }

    /**
     * 列出绑定到指定资源的标签
     *
     * 列出绑定到指定资源的标签。您可以将标签附加到组织中的帐号、组织单元、根和策略。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagResourcesRequest 请求对象
     * @return AsyncInvoker<ListTagResourcesRequest, ListTagResourcesResponse>
     */
    public AsyncInvoker<ListTagResourcesRequest, ListTagResourcesResponse> listTagResourcesAsyncInvoker(
        ListTagResourcesRequest request) {
        return new AsyncInvoker<ListTagResourcesRequest, ListTagResourcesResponse>(request,
            OrganizationsMeta.listTagResources, hcClient);
    }

    /**
     * 列出绑定到指定资源的标签
     *
     * 列出绑定到指定资源的标签。您可以将标签附加到组织中的帐号、组织单元、根和策略。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsForResourceRequest 请求对象
     * @return CompletableFuture<ListTagsForResourceResponse>
     */
    public CompletableFuture<ListTagsForResourceResponse> listTagsForResourceAsync(ListTagsForResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.listTagsForResource);
    }

    /**
     * 列出绑定到指定资源的标签
     *
     * 列出绑定到指定资源的标签。您可以将标签附加到组织中的帐号、组织单元、根和策略。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsForResourceRequest 请求对象
     * @return AsyncInvoker<ListTagsForResourceRequest, ListTagsForResourceResponse>
     */
    public AsyncInvoker<ListTagsForResourceRequest, ListTagsForResourceResponse> listTagsForResourceAsyncInvoker(
        ListTagsForResourceRequest request) {
        return new AsyncInvoker<ListTagsForResourceRequest, ListTagsForResourceResponse>(request,
            OrganizationsMeta.listTagsForResource, hcClient);
    }

    /**
     * 根据资源类型及标签信息查询实例数量
     *
     * 根据资源类型及标签信息查询实例数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceInstancesCountRequest 请求对象
     * @return CompletableFuture<ShowResourceInstancesCountResponse>
     */
    public CompletableFuture<ShowResourceInstancesCountResponse> showResourceInstancesCountAsync(
        ShowResourceInstancesCountRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.showResourceInstancesCount);
    }

    /**
     * 根据资源类型及标签信息查询实例数量
     *
     * 根据资源类型及标签信息查询实例数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceInstancesCountRequest 请求对象
     * @return AsyncInvoker<ShowResourceInstancesCountRequest, ShowResourceInstancesCountResponse>
     */
    public AsyncInvoker<ShowResourceInstancesCountRequest, ShowResourceInstancesCountResponse> showResourceInstancesCountAsyncInvoker(
        ShowResourceInstancesCountRequest request) {
        return new AsyncInvoker<ShowResourceInstancesCountRequest, ShowResourceInstancesCountResponse>(request,
            OrganizationsMeta.showResourceInstancesCount, hcClient);
    }

    /**
     * 为指定资源添加标签
     *
     * 向指定的资源添加一个或多个标签。目前，您可以将标签附加到组织中的帐号、组织单元、根和策略。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param TagResourceRequest 请求对象
     * @return CompletableFuture<TagResourceResponse>
     */
    public CompletableFuture<TagResourceResponse> tagResourceAsync(TagResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.tagResource);
    }

    /**
     * 为指定资源添加标签
     *
     * 向指定的资源添加一个或多个标签。目前，您可以将标签附加到组织中的帐号、组织单元、根和策略。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param TagResourceRequest 请求对象
     * @return AsyncInvoker<TagResourceRequest, TagResourceResponse>
     */
    public AsyncInvoker<TagResourceRequest, TagResourceResponse> tagResourceAsyncInvoker(TagResourceRequest request) {
        return new AsyncInvoker<TagResourceRequest, TagResourceResponse>(request, OrganizationsMeta.tagResource,
            hcClient);
    }

    /**
     * 从指定资源中删除指定主键标签
     *
     * 从指定资源中删除具有指定主键的任何标签。您可以将标签绑定到组织中的帐号、组织单元、根和策略。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UntagResourceRequest 请求对象
     * @return CompletableFuture<UntagResourceResponse>
     */
    public CompletableFuture<UntagResourceResponse> untagResourceAsync(UntagResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.untagResource);
    }

    /**
     * 从指定资源中删除指定主键标签
     *
     * 从指定资源中删除具有指定主键的任何标签。您可以将标签绑定到组织中的帐号、组织单元、根和策略。此操作只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UntagResourceRequest 请求对象
     * @return AsyncInvoker<UntagResourceRequest, UntagResourceResponse>
     */
    public AsyncInvoker<UntagResourceRequest, UntagResourceResponse> untagResourceAsyncInvoker(
        UntagResourceRequest request) {
        return new AsyncInvoker<UntagResourceRequest, UntagResourceResponse>(request, OrganizationsMeta.untagResource,
            hcClient);
    }

    /**
     * 禁用受信任服务
     *
     * 禁用服务（由service_principal指定的服务）与组织的集成。禁用可信服务后，指定服务将不可以在组织中的新帐号中创建服务关联委托。这意味着该服务无法代表您对组织中的任何新帐号执行操作。在服务完成从组织中的清理之前，服务仍可以在旧帐号中执行操作。此接口只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisableTrustedServiceRequest 请求对象
     * @return CompletableFuture<DisableTrustedServiceResponse>
     */
    public CompletableFuture<DisableTrustedServiceResponse> disableTrustedServiceAsync(
        DisableTrustedServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.disableTrustedService);
    }

    /**
     * 禁用受信任服务
     *
     * 禁用服务（由service_principal指定的服务）与组织的集成。禁用可信服务后，指定服务将不可以在组织中的新帐号中创建服务关联委托。这意味着该服务无法代表您对组织中的任何新帐号执行操作。在服务完成从组织中的清理之前，服务仍可以在旧帐号中执行操作。此接口只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisableTrustedServiceRequest 请求对象
     * @return AsyncInvoker<DisableTrustedServiceRequest, DisableTrustedServiceResponse>
     */
    public AsyncInvoker<DisableTrustedServiceRequest, DisableTrustedServiceResponse> disableTrustedServiceAsyncInvoker(
        DisableTrustedServiceRequest request) {
        return new AsyncInvoker<DisableTrustedServiceRequest, DisableTrustedServiceResponse>(request,
            OrganizationsMeta.disableTrustedService, hcClient);
    }

    /**
     * 启用可信服务
     *
     * 启用服务（由service_principal指定的服务）与组织的集成。启用可信服务后，允许指定的可信服务对组织中的所有帐号创建服务关联委托。这允许可信服务代表您在组织及其帐号中执行操作。此接口只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableTrustedServiceRequest 请求对象
     * @return CompletableFuture<EnableTrustedServiceResponse>
     */
    public CompletableFuture<EnableTrustedServiceResponse> enableTrustedServiceAsync(
        EnableTrustedServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.enableTrustedService);
    }

    /**
     * 启用可信服务
     *
     * 启用服务（由service_principal指定的服务）与组织的集成。启用可信服务后，允许指定的可信服务对组织中的所有帐号创建服务关联委托。这允许可信服务代表您在组织及其帐号中执行操作。此接口只能由组织的管理帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableTrustedServiceRequest 请求对象
     * @return AsyncInvoker<EnableTrustedServiceRequest, EnableTrustedServiceResponse>
     */
    public AsyncInvoker<EnableTrustedServiceRequest, EnableTrustedServiceResponse> enableTrustedServiceAsyncInvoker(
        EnableTrustedServiceRequest request) {
        return new AsyncInvoker<EnableTrustedServiceRequest, EnableTrustedServiceResponse>(request,
            OrganizationsMeta.enableTrustedService, hcClient);
    }

    /**
     * 列出组织的可信服务列表
     *
     * 返回启用与组织集成的可信服务列表。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTrustedServicesRequest 请求对象
     * @return CompletableFuture<ListTrustedServicesResponse>
     */
    public CompletableFuture<ListTrustedServicesResponse> listTrustedServicesAsync(ListTrustedServicesRequest request) {
        return hcClient.asyncInvokeHttp(request, OrganizationsMeta.listTrustedServices);
    }

    /**
     * 列出组织的可信服务列表
     *
     * 返回启用与组织集成的可信服务列表。此操作只能由组织的管理帐号或作为服务委托管理员的成员帐号调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTrustedServicesRequest 请求对象
     * @return AsyncInvoker<ListTrustedServicesRequest, ListTrustedServicesResponse>
     */
    public AsyncInvoker<ListTrustedServicesRequest, ListTrustedServicesResponse> listTrustedServicesAsyncInvoker(
        ListTrustedServicesRequest request) {
        return new AsyncInvoker<ListTrustedServicesRequest, ListTrustedServicesResponse>(request,
            OrganizationsMeta.listTrustedServices, hcClient);
    }

}
