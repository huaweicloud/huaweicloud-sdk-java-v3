package com.huaweicloud.sdk.mas.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.mas.v1.model.ShowNameSpaceListRequest;
import com.huaweicloud.sdk.mas.v1.model.ShowNameSpaceListResponse;

import java.util.concurrent.CompletableFuture;

public class MasAsyncClient {

    protected HcClient hcClient;

    public MasAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MasAsyncClient> newBuilder() {
        ClientBuilder<MasAsyncClient> clientBuilder = new ClientBuilder<>(MasAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 查询命名空间列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNameSpaceListRequest 请求对象
     * @return CompletableFuture<ShowNameSpaceListResponse>
     */
    public CompletableFuture<ShowNameSpaceListResponse> showNameSpaceListAsync(ShowNameSpaceListRequest request) {
        return hcClient.asyncInvokeHttp(request, MasMeta.showNameSpaceList);
    }

    /**
     * 查询命名空间列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNameSpaceListRequest 请求对象
     * @return AsyncInvoker<ShowNameSpaceListRequest, ShowNameSpaceListResponse>
     */
    public AsyncInvoker<ShowNameSpaceListRequest, ShowNameSpaceListResponse> showNameSpaceListAsyncInvoker(
        ShowNameSpaceListRequest request) {
        return new AsyncInvoker<>(request, MasMeta.showNameSpaceList, hcClient);
    }

}
