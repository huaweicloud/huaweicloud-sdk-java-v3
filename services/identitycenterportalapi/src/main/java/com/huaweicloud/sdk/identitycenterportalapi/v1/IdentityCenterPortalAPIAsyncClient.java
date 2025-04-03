package com.huaweicloud.sdk.identitycenterportalapi.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.identitycenterportalapi.v1.model.GetAgencyCredentialsRequest;
import com.huaweicloud.sdk.identitycenterportalapi.v1.model.GetAgencyCredentialsResponse;
import com.huaweicloud.sdk.identitycenterportalapi.v1.model.ListAccountAgenciesRequest;
import com.huaweicloud.sdk.identitycenterportalapi.v1.model.ListAccountAgenciesResponse;
import com.huaweicloud.sdk.identitycenterportalapi.v1.model.ListAccountsRequest;
import com.huaweicloud.sdk.identitycenterportalapi.v1.model.ListAccountsResponse;
import com.huaweicloud.sdk.identitycenterportalapi.v1.model.LogoutRequest;
import com.huaweicloud.sdk.identitycenterportalapi.v1.model.LogoutResponse;

import java.util.concurrent.CompletableFuture;

public class IdentityCenterPortalAPIAsyncClient {

    protected HcClient hcClient;

    public IdentityCenterPortalAPIAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IdentityCenterPortalAPIAsyncClient> newBuilder() {
        ClientBuilder<IdentityCenterPortalAPIAsyncClient> clientBuilder =
            new ClientBuilder<>(IdentityCenterPortalAPIAsyncClient::new, "IdentityCenterPortalAPICredentials");
        return clientBuilder;
    }

    /**
     * 列出账号
     *
     * 列出分配给用户的所有账号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountsRequest 请求对象
     * @return CompletableFuture<ListAccountsResponse>
     */
    public CompletableFuture<ListAccountsResponse> listAccountsAsync(ListAccountsRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterPortalAPIMeta.listAccounts);
    }

    /**
     * 列出账号
     *
     * 列出分配给用户的所有账号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountsRequest 请求对象
     * @return AsyncInvoker<ListAccountsRequest, ListAccountsResponse>
     */
    public AsyncInvoker<ListAccountsRequest, ListAccountsResponse> listAccountsAsyncInvoker(
        ListAccountsRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterPortalAPIMeta.listAccounts, hcClient);
    }

    /**
     * 列出账号委托
     *
     * 列出账号分配给用户的所有委托或信任委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountAgenciesRequest 请求对象
     * @return CompletableFuture<ListAccountAgenciesResponse>
     */
    public CompletableFuture<ListAccountAgenciesResponse> listAccountAgenciesAsync(ListAccountAgenciesRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterPortalAPIMeta.listAccountAgencies);
    }

    /**
     * 列出账号委托
     *
     * 列出账号分配给用户的所有委托或信任委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountAgenciesRequest 请求对象
     * @return AsyncInvoker<ListAccountAgenciesRequest, ListAccountAgenciesResponse>
     */
    public AsyncInvoker<ListAccountAgenciesRequest, ListAccountAgenciesResponse> listAccountAgenciesAsyncInvoker(
        ListAccountAgenciesRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterPortalAPIMeta.listAccountAgencies, hcClient);
    }

    /**
     * 获取委托凭证
     *
     * 获取分配给用户的指定委托或信任委托的STS短期凭证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetAgencyCredentialsRequest 请求对象
     * @return CompletableFuture<GetAgencyCredentialsResponse>
     */
    public CompletableFuture<GetAgencyCredentialsResponse> getAgencyCredentialsAsync(
        GetAgencyCredentialsRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterPortalAPIMeta.getAgencyCredentials);
    }

    /**
     * 获取委托凭证
     *
     * 获取分配给用户的指定委托或信任委托的STS短期凭证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetAgencyCredentialsRequest 请求对象
     * @return AsyncInvoker<GetAgencyCredentialsRequest, GetAgencyCredentialsResponse>
     */
    public AsyncInvoker<GetAgencyCredentialsRequest, GetAgencyCredentialsResponse> getAgencyCredentialsAsyncInvoker(
        GetAgencyCredentialsRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterPortalAPIMeta.getAgencyCredentials, hcClient);
    }

    /**
     * 登出用户
     *
     * 向IAM身份中心服务发送API调用，使相应的服务端IAM身份中心登录会话失效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LogoutRequest 请求对象
     * @return CompletableFuture<LogoutResponse>
     */
    public CompletableFuture<LogoutResponse> logoutAsync(LogoutRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterPortalAPIMeta.logout);
    }

    /**
     * 登出用户
     *
     * 向IAM身份中心服务发送API调用，使相应的服务端IAM身份中心登录会话失效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LogoutRequest 请求对象
     * @return AsyncInvoker<LogoutRequest, LogoutResponse>
     */
    public AsyncInvoker<LogoutRequest, LogoutResponse> logoutAsyncInvoker(LogoutRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterPortalAPIMeta.logout, hcClient);
    }

}
