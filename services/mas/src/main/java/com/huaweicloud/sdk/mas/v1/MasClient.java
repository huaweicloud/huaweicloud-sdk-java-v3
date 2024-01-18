package com.huaweicloud.sdk.mas.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.mas.v1.model.ShowNameSpaceListRequest;
import com.huaweicloud.sdk.mas.v1.model.ShowNameSpaceListResponse;

public class MasClient {

    protected HcClient hcClient;

    public MasClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MasClient> newBuilder() {
        ClientBuilder<MasClient> clientBuilder = new ClientBuilder<>(MasClient::new);
        return clientBuilder;
    }

    /**
     * 查询命名空间列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNameSpaceListRequest 请求对象
     * @return ShowNameSpaceListResponse
     */
    public ShowNameSpaceListResponse showNameSpaceList(ShowNameSpaceListRequest request) {
        return hcClient.syncInvokeHttp(request, MasMeta.showNameSpaceList);
    }

    /**
     * 查询命名空间列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNameSpaceListRequest 请求对象
     * @return SyncInvoker<ShowNameSpaceListRequest, ShowNameSpaceListResponse>
     */
    public SyncInvoker<ShowNameSpaceListRequest, ShowNameSpaceListResponse> showNameSpaceListInvoker(
        ShowNameSpaceListRequest request) {
        return new SyncInvoker<>(request, MasMeta.showNameSpaceList, hcClient);
    }

}
