package com.huaweicloud.sdk.expert.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.expert.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class ExpertAsyncClient {

    protected HcClient hcClient;

    public ExpertAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ExpertAsyncClient> newBuilder() {
        return new ClientBuilder<>(ExpertAsyncClient::new);
    }

    /** 获取问卷答题统计数 获取问卷答题统计数
     *
     * @param ListRecordsCountRequest 请求对象
     * @return CompletableFuture<ListRecordsCountResponse> */
    public CompletableFuture<ListRecordsCountResponse> listRecordsCountAsync(ListRecordsCountRequest request) {
        return hcClient.asyncInvokeHttp(request, ExpertMeta.listRecordsCount);
    }

    /** 获取问卷答题统计数 获取问卷答题统计数
     *
     * @param ListRecordsCountRequest 请求对象
     * @return AsyncInvoker<ListRecordsCountRequest, ListRecordsCountResponse> */
    public AsyncInvoker<ListRecordsCountRequest, ListRecordsCountResponse> listRecordsCountAsyncInvoker(
        ListRecordsCountRequest request) {
        return new AsyncInvoker<ListRecordsCountRequest, ListRecordsCountResponse>(request, ExpertMeta.listRecordsCount,
            hcClient);
    }

    /** 获取对应用户标识 根据问卷ID小程序标识获取对应用户标识
     *
     * @param ListUsersKeyRequest 请求对象
     * @return CompletableFuture<ListUsersKeyResponse> */
    public CompletableFuture<ListUsersKeyResponse> listUsersKeyAsync(ListUsersKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, ExpertMeta.listUsersKey);
    }

    /** 获取对应用户标识 根据问卷ID小程序标识获取对应用户标识
     *
     * @param ListUsersKeyRequest 请求对象
     * @return AsyncInvoker<ListUsersKeyRequest, ListUsersKeyResponse> */
    public AsyncInvoker<ListUsersKeyRequest, ListUsersKeyResponse> listUsersKeyAsyncInvoker(
        ListUsersKeyRequest request) {
        return new AsyncInvoker<ListUsersKeyRequest, ListUsersKeyResponse>(request, ExpertMeta.listUsersKey, hcClient);
    }

}
