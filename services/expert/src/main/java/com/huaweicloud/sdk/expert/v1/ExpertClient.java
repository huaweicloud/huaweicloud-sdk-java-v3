package com.huaweicloud.sdk.expert.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.expert.v1.model.ListRecordsCountRequest;
import com.huaweicloud.sdk.expert.v1.model.ListRecordsCountResponse;
import com.huaweicloud.sdk.expert.v1.model.ListUsersKeyRequest;
import com.huaweicloud.sdk.expert.v1.model.ListUsersKeyResponse;

public class ExpertClient {

    protected HcClient hcClient;

    public ExpertClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ExpertClient> newBuilder() {
        ClientBuilder<ExpertClient> clientBuilder = new ClientBuilder<>(ExpertClient::new);
        return clientBuilder;
    }

    /**
     * 获取问卷答题统计数
     *
     * 获取问卷答题统计数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecordsCountRequest 请求对象
     * @return ListRecordsCountResponse
     */
    public ListRecordsCountResponse listRecordsCount(ListRecordsCountRequest request) {
        return hcClient.syncInvokeHttp(request, ExpertMeta.listRecordsCount);
    }

    /**
     * 获取问卷答题统计数
     *
     * 获取问卷答题统计数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecordsCountRequest 请求对象
     * @return SyncInvoker<ListRecordsCountRequest, ListRecordsCountResponse>
     */
    public SyncInvoker<ListRecordsCountRequest, ListRecordsCountResponse> listRecordsCountInvoker(
        ListRecordsCountRequest request) {
        return new SyncInvoker<ListRecordsCountRequest, ListRecordsCountResponse>(request, ExpertMeta.listRecordsCount,
            hcClient);
    }

    /**
     * 获取对应用户标识
     *
     * 根据问卷ID小程序标识获取对应用户标识
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsersKeyRequest 请求对象
     * @return ListUsersKeyResponse
     */
    public ListUsersKeyResponse listUsersKey(ListUsersKeyRequest request) {
        return hcClient.syncInvokeHttp(request, ExpertMeta.listUsersKey);
    }

    /**
     * 获取对应用户标识
     *
     * 根据问卷ID小程序标识获取对应用户标识
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListUsersKeyRequest 请求对象
     * @return SyncInvoker<ListUsersKeyRequest, ListUsersKeyResponse>
     */
    public SyncInvoker<ListUsersKeyRequest, ListUsersKeyResponse> listUsersKeyInvoker(ListUsersKeyRequest request) {
        return new SyncInvoker<ListUsersKeyRequest, ListUsersKeyResponse>(request, ExpertMeta.listUsersKey, hcClient);
    }

}
