package com.huaweicloud.sdk.identitycenterportalapi.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.identitycenterportalapi.v1.model.GetAgencyCredentialsRequest;
import com.huaweicloud.sdk.identitycenterportalapi.v1.model.GetAgencyCredentialsResponse;
import com.huaweicloud.sdk.identitycenterportalapi.v1.model.ListAccountAgenciesRequest;
import com.huaweicloud.sdk.identitycenterportalapi.v1.model.ListAccountAgenciesResponse;
import com.huaweicloud.sdk.identitycenterportalapi.v1.model.ListAccountsRequest;
import com.huaweicloud.sdk.identitycenterportalapi.v1.model.ListAccountsResponse;
import com.huaweicloud.sdk.identitycenterportalapi.v1.model.LogoutRequest;
import com.huaweicloud.sdk.identitycenterportalapi.v1.model.LogoutResponse;

public class IdentityCenterPortalAPIClient {

    protected HcClient hcClient;

    public IdentityCenterPortalAPIClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IdentityCenterPortalAPIClient> newBuilder() {
        ClientBuilder<IdentityCenterPortalAPIClient> clientBuilder =
            new ClientBuilder<>(IdentityCenterPortalAPIClient::new, "IdentityCenterPortalAPICredentials");
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
     * @return ListAccountsResponse
     */
    public ListAccountsResponse listAccounts(ListAccountsRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterPortalAPIMeta.listAccounts);
    }

    /**
     * 列出账号
     *
     * 列出分配给用户的所有账号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountsRequest 请求对象
     * @return SyncInvoker<ListAccountsRequest, ListAccountsResponse>
     */
    public SyncInvoker<ListAccountsRequest, ListAccountsResponse> listAccountsInvoker(ListAccountsRequest request) {
        return new SyncInvoker<>(request, IdentityCenterPortalAPIMeta.listAccounts, hcClient);
    }

    /**
     * 列出账号委托
     *
     * 列出账号分配给用户的所有委托或信任委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountAgenciesRequest 请求对象
     * @return ListAccountAgenciesResponse
     */
    public ListAccountAgenciesResponse listAccountAgencies(ListAccountAgenciesRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterPortalAPIMeta.listAccountAgencies);
    }

    /**
     * 列出账号委托
     *
     * 列出账号分配给用户的所有委托或信任委托
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccountAgenciesRequest 请求对象
     * @return SyncInvoker<ListAccountAgenciesRequest, ListAccountAgenciesResponse>
     */
    public SyncInvoker<ListAccountAgenciesRequest, ListAccountAgenciesResponse> listAccountAgenciesInvoker(
        ListAccountAgenciesRequest request) {
        return new SyncInvoker<>(request, IdentityCenterPortalAPIMeta.listAccountAgencies, hcClient);
    }

    /**
     * 获取委托凭证
     *
     * 获取分配给用户的指定委托或信任委托的STS短期凭证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetAgencyCredentialsRequest 请求对象
     * @return GetAgencyCredentialsResponse
     */
    public GetAgencyCredentialsResponse getAgencyCredentials(GetAgencyCredentialsRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterPortalAPIMeta.getAgencyCredentials);
    }

    /**
     * 获取委托凭证
     *
     * 获取分配给用户的指定委托或信任委托的STS短期凭证
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetAgencyCredentialsRequest 请求对象
     * @return SyncInvoker<GetAgencyCredentialsRequest, GetAgencyCredentialsResponse>
     */
    public SyncInvoker<GetAgencyCredentialsRequest, GetAgencyCredentialsResponse> getAgencyCredentialsInvoker(
        GetAgencyCredentialsRequest request) {
        return new SyncInvoker<>(request, IdentityCenterPortalAPIMeta.getAgencyCredentials, hcClient);
    }

    /**
     * 登出用户
     *
     * 向IAM身份中心服务发送API调用，使相应的服务端IAM身份中心登录会话失效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LogoutRequest 请求对象
     * @return LogoutResponse
     */
    public LogoutResponse logout(LogoutRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterPortalAPIMeta.logout);
    }

    /**
     * 登出用户
     *
     * 向IAM身份中心服务发送API调用，使相应的服务端IAM身份中心登录会话失效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LogoutRequest 请求对象
     * @return SyncInvoker<LogoutRequest, LogoutResponse>
     */
    public SyncInvoker<LogoutRequest, LogoutResponse> logoutInvoker(LogoutRequest request) {
        return new SyncInvoker<>(request, IdentityCenterPortalAPIMeta.logout, hcClient);
    }

}
