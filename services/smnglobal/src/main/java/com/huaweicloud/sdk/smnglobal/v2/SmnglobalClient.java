package com.huaweicloud.sdk.smnglobal.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.smnglobal.v2.model.CreateSubscriptionUserRequest;
import com.huaweicloud.sdk.smnglobal.v2.model.CreateSubscriptionUserResponse;
import com.huaweicloud.sdk.smnglobal.v2.model.DeleteSubscriptionUserRequest;
import com.huaweicloud.sdk.smnglobal.v2.model.DeleteSubscriptionUserResponse;
import com.huaweicloud.sdk.smnglobal.v2.model.ListSubscriptionUserRequest;
import com.huaweicloud.sdk.smnglobal.v2.model.ListSubscriptionUserResponse;
import com.huaweicloud.sdk.smnglobal.v2.model.UpdateSubscriptionUserRequest;
import com.huaweicloud.sdk.smnglobal.v2.model.UpdateSubscriptionUserResponse;

public class SmnglobalClient {

    protected HcClient hcClient;

    public SmnglobalClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SmnglobalClient> newBuilder() {
        ClientBuilder<SmnglobalClient> clientBuilder = new ClientBuilder<>(SmnglobalClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 添加订阅用户
     *
     * 添加订阅用户。如果订阅用户的状态为未确认，则会向订阅用户发送一条确认订阅消息。订阅用户点击订阅链接确认订阅后，则订阅用户的状态变更为已确认，同时会向订阅用户发送一条取消订阅消息，便于订阅用户随时可以取消订阅。订阅用户点击取消订阅链接后，则订阅用户的状态变更为已取消，同时会向订阅用户发送一条重新订阅消息，便于订阅用户可以重新订阅。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubscriptionUserRequest 请求对象
     * @return CreateSubscriptionUserResponse
     */
    public CreateSubscriptionUserResponse createSubscriptionUser(CreateSubscriptionUserRequest request) {
        return hcClient.syncInvokeHttp(request, SmnglobalMeta.createSubscriptionUser);
    }

    /**
     * 添加订阅用户
     *
     * 添加订阅用户。如果订阅用户的状态为未确认，则会向订阅用户发送一条确认订阅消息。订阅用户点击订阅链接确认订阅后，则订阅用户的状态变更为已确认，同时会向订阅用户发送一条取消订阅消息，便于订阅用户随时可以取消订阅。订阅用户点击取消订阅链接后，则订阅用户的状态变更为已取消，同时会向订阅用户发送一条重新订阅消息，便于订阅用户可以重新订阅。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubscriptionUserRequest 请求对象
     * @return SyncInvoker<CreateSubscriptionUserRequest, CreateSubscriptionUserResponse>
     */
    public SyncInvoker<CreateSubscriptionUserRequest, CreateSubscriptionUserResponse> createSubscriptionUserInvoker(
        CreateSubscriptionUserRequest request) {
        return new SyncInvoker<>(request, SmnglobalMeta.createSubscriptionUser, hcClient);
    }

    /**
     * 删除订阅用户
     *
     * 删除订阅用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubscriptionUserRequest 请求对象
     * @return DeleteSubscriptionUserResponse
     */
    public DeleteSubscriptionUserResponse deleteSubscriptionUser(DeleteSubscriptionUserRequest request) {
        return hcClient.syncInvokeHttp(request, SmnglobalMeta.deleteSubscriptionUser);
    }

    /**
     * 删除订阅用户
     *
     * 删除订阅用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubscriptionUserRequest 请求对象
     * @return SyncInvoker<DeleteSubscriptionUserRequest, DeleteSubscriptionUserResponse>
     */
    public SyncInvoker<DeleteSubscriptionUserRequest, DeleteSubscriptionUserResponse> deleteSubscriptionUserInvoker(
        DeleteSubscriptionUserRequest request) {
        return new SyncInvoker<>(request, SmnglobalMeta.deleteSubscriptionUser, hcClient);
    }

    /**
     * 查询订阅用户列表
     *
     * 查询订阅用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionUserRequest 请求对象
     * @return ListSubscriptionUserResponse
     */
    public ListSubscriptionUserResponse listSubscriptionUser(ListSubscriptionUserRequest request) {
        return hcClient.syncInvokeHttp(request, SmnglobalMeta.listSubscriptionUser);
    }

    /**
     * 查询订阅用户列表
     *
     * 查询订阅用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionUserRequest 请求对象
     * @return SyncInvoker<ListSubscriptionUserRequest, ListSubscriptionUserResponse>
     */
    public SyncInvoker<ListSubscriptionUserRequest, ListSubscriptionUserResponse> listSubscriptionUserInvoker(
        ListSubscriptionUserRequest request) {
        return new SyncInvoker<>(request, SmnglobalMeta.listSubscriptionUser, hcClient);
    }

    /**
     * 更新订阅用户
     *
     * 更新订阅用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubscriptionUserRequest 请求对象
     * @return UpdateSubscriptionUserResponse
     */
    public UpdateSubscriptionUserResponse updateSubscriptionUser(UpdateSubscriptionUserRequest request) {
        return hcClient.syncInvokeHttp(request, SmnglobalMeta.updateSubscriptionUser);
    }

    /**
     * 更新订阅用户
     *
     * 更新订阅用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubscriptionUserRequest 请求对象
     * @return SyncInvoker<UpdateSubscriptionUserRequest, UpdateSubscriptionUserResponse>
     */
    public SyncInvoker<UpdateSubscriptionUserRequest, UpdateSubscriptionUserResponse> updateSubscriptionUserInvoker(
        UpdateSubscriptionUserRequest request) {
        return new SyncInvoker<>(request, SmnglobalMeta.updateSubscriptionUser, hcClient);
    }

}
