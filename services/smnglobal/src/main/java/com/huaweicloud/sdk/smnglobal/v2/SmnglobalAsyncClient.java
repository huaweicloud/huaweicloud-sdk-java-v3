package com.huaweicloud.sdk.smnglobal.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.smnglobal.v2.model.CreateSubscriptionUserRequest;
import com.huaweicloud.sdk.smnglobal.v2.model.CreateSubscriptionUserResponse;
import com.huaweicloud.sdk.smnglobal.v2.model.DeleteSubscriptionUserRequest;
import com.huaweicloud.sdk.smnglobal.v2.model.DeleteSubscriptionUserResponse;
import com.huaweicloud.sdk.smnglobal.v2.model.ListSubscriptionUserRequest;
import com.huaweicloud.sdk.smnglobal.v2.model.ListSubscriptionUserResponse;
import com.huaweicloud.sdk.smnglobal.v2.model.UpdateSubscriptionUserRequest;
import com.huaweicloud.sdk.smnglobal.v2.model.UpdateSubscriptionUserResponse;

import java.util.concurrent.CompletableFuture;

public class SmnglobalAsyncClient {

    protected HcClient hcClient;

    public SmnglobalAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SmnglobalAsyncClient> newBuilder() {
        ClientBuilder<SmnglobalAsyncClient> clientBuilder =
            new ClientBuilder<>(SmnglobalAsyncClient::new, "GlobalCredentials");
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
     * @return CompletableFuture<CreateSubscriptionUserResponse>
     */
    public CompletableFuture<CreateSubscriptionUserResponse> createSubscriptionUserAsync(
        CreateSubscriptionUserRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnglobalMeta.createSubscriptionUser);
    }

    /**
     * 添加订阅用户
     *
     * 添加订阅用户。如果订阅用户的状态为未确认，则会向订阅用户发送一条确认订阅消息。订阅用户点击订阅链接确认订阅后，则订阅用户的状态变更为已确认，同时会向订阅用户发送一条取消订阅消息，便于订阅用户随时可以取消订阅。订阅用户点击取消订阅链接后，则订阅用户的状态变更为已取消，同时会向订阅用户发送一条重新订阅消息，便于订阅用户可以重新订阅。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubscriptionUserRequest 请求对象
     * @return AsyncInvoker<CreateSubscriptionUserRequest, CreateSubscriptionUserResponse>
     */
    public AsyncInvoker<CreateSubscriptionUserRequest, CreateSubscriptionUserResponse> createSubscriptionUserAsyncInvoker(
        CreateSubscriptionUserRequest request) {
        return new AsyncInvoker<>(request, SmnglobalMeta.createSubscriptionUser, hcClient);
    }

    /**
     * 删除订阅用户
     *
     * 删除订阅用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubscriptionUserRequest 请求对象
     * @return CompletableFuture<DeleteSubscriptionUserResponse>
     */
    public CompletableFuture<DeleteSubscriptionUserResponse> deleteSubscriptionUserAsync(
        DeleteSubscriptionUserRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnglobalMeta.deleteSubscriptionUser);
    }

    /**
     * 删除订阅用户
     *
     * 删除订阅用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubscriptionUserRequest 请求对象
     * @return AsyncInvoker<DeleteSubscriptionUserRequest, DeleteSubscriptionUserResponse>
     */
    public AsyncInvoker<DeleteSubscriptionUserRequest, DeleteSubscriptionUserResponse> deleteSubscriptionUserAsyncInvoker(
        DeleteSubscriptionUserRequest request) {
        return new AsyncInvoker<>(request, SmnglobalMeta.deleteSubscriptionUser, hcClient);
    }

    /**
     * 查询订阅用户列表
     *
     * 查询订阅用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionUserRequest 请求对象
     * @return CompletableFuture<ListSubscriptionUserResponse>
     */
    public CompletableFuture<ListSubscriptionUserResponse> listSubscriptionUserAsync(
        ListSubscriptionUserRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnglobalMeta.listSubscriptionUser);
    }

    /**
     * 查询订阅用户列表
     *
     * 查询订阅用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionUserRequest 请求对象
     * @return AsyncInvoker<ListSubscriptionUserRequest, ListSubscriptionUserResponse>
     */
    public AsyncInvoker<ListSubscriptionUserRequest, ListSubscriptionUserResponse> listSubscriptionUserAsyncInvoker(
        ListSubscriptionUserRequest request) {
        return new AsyncInvoker<>(request, SmnglobalMeta.listSubscriptionUser, hcClient);
    }

    /**
     * 更新订阅用户
     *
     * 更新订阅用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubscriptionUserRequest 请求对象
     * @return CompletableFuture<UpdateSubscriptionUserResponse>
     */
    public CompletableFuture<UpdateSubscriptionUserResponse> updateSubscriptionUserAsync(
        UpdateSubscriptionUserRequest request) {
        return hcClient.asyncInvokeHttp(request, SmnglobalMeta.updateSubscriptionUser);
    }

    /**
     * 更新订阅用户
     *
     * 更新订阅用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubscriptionUserRequest 请求对象
     * @return AsyncInvoker<UpdateSubscriptionUserRequest, UpdateSubscriptionUserResponse>
     */
    public AsyncInvoker<UpdateSubscriptionUserRequest, UpdateSubscriptionUserResponse> updateSubscriptionUserAsyncInvoker(
        UpdateSubscriptionUserRequest request) {
        return new AsyncInvoker<>(request, SmnglobalMeta.updateSubscriptionUser, hcClient);
    }

}
