package com.huaweicloud.sdk.identitycenterstore.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListUsersRequest;
import com.huaweicloud.sdk.identitycenterstore.v1.model.ListUsersResponse;

public class IdentityCenterStoreClient {

    protected HcClient hcClient;

    public IdentityCenterStoreClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IdentityCenterStoreClient> newBuilder() {
        ClientBuilder<IdentityCenterStoreClient> clientBuilder =
            new ClientBuilder<>(IdentityCenterStoreClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 列出用户
     *
     * 查询指定IdentityStore下的IdentityCenter用户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsersRequest 请求对象
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterStoreMeta.listUsers);
    }

    /**
     * 列出用户
     *
     * 查询指定IdentityStore下的IdentityCenter用户列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsersRequest 请求对象
     * @return SyncInvoker<ListUsersRequest, ListUsersResponse>
     */
    public SyncInvoker<ListUsersRequest, ListUsersResponse> listUsersInvoker(ListUsersRequest request) {
        return new SyncInvoker<ListUsersRequest, ListUsersResponse>(request, IdentityCenterStoreMeta.listUsers,
            hcClient);
    }

}
