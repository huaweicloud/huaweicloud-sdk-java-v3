package com.huaweicloud.sdk.mas.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.mas.v1.model.*;

public class MasClient {

    protected HcClient hcClient;

    public MasClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MasClient> newBuilder() {
        return new ClientBuilder<>(MasClient::new);
    }

    /**
     * 查询命名空间列表
     *
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowNameSpaceListRequest 请求对象
     * @return ShowNameSpaceListResponse
     */
    public ShowNameSpaceListResponse showNameSpaceList(ShowNameSpaceListRequest request) {
        return hcClient.syncInvokeHttp(request, MasMeta.showNameSpaceList);
    }

    /**
     * 查询命名空间列表
     *
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowNameSpaceListRequest 请求对象
     * @return SyncInvoker<ShowNameSpaceListRequest, ShowNameSpaceListResponse>
     */
    public SyncInvoker<ShowNameSpaceListRequest, ShowNameSpaceListResponse> showNameSpaceListInvoker(
        ShowNameSpaceListRequest request) {
        return new SyncInvoker<ShowNameSpaceListRequest, ShowNameSpaceListResponse>(request, MasMeta.showNameSpaceList,
            hcClient);
    }

}
