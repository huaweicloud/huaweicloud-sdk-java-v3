package com.huaweicloud.sdk.mas.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.mas.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class MasAsyncClient {

    protected HcClient hcClient;

    public MasAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MasAsyncClient> newBuilder() {
        return new ClientBuilder<>(MasAsyncClient::new);
    }

    /**
     * 查询命名空间列表
     *
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowNameSpaceListRequest 请求对象
     * @return CompletableFuture<ShowNameSpaceListResponse>
     */
    public CompletableFuture<ShowNameSpaceListResponse> showNameSpaceListAsync(ShowNameSpaceListRequest request) {
        return hcClient.asyncInvokeHttp(request, MasMeta.showNameSpaceList);
    }

    /**
     * 查询命名空间列表
     *
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowNameSpaceListRequest 请求对象
     * @return AsyncInvoker<ShowNameSpaceListRequest, ShowNameSpaceListResponse>
     */
    public AsyncInvoker<ShowNameSpaceListRequest, ShowNameSpaceListResponse> showNameSpaceListAsyncInvoker(
        ShowNameSpaceListRequest request) {
        return new AsyncInvoker<ShowNameSpaceListRequest, ShowNameSpaceListResponse>(request, MasMeta.showNameSpaceList,
            hcClient);
    }

}
