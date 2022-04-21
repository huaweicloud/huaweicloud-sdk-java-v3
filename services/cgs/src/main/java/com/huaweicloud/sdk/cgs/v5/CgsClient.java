package com.huaweicloud.sdk.cgs.v5;

import com.huaweicloud.sdk.cgs.v5.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CgsClient {

    protected HcClient hcClient;

    public CgsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CgsClient> newBuilder() {
        return new ClientBuilder<>(CgsClient::new);
    }

    /**
     * 查询容器节点列表
     *
     * 查询容器节点列表（仅新版本容器安全支持，即将上线，敬请期待！）
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListContainerNodesRequest 请求对象
     * @return ListContainerNodesResponse
     */
    public ListContainerNodesResponse listContainerNodes(ListContainerNodesRequest request) {
        return hcClient.syncInvokeHttp(request, CgsMeta.listContainerNodes);
    }

    /**
     * 查询容器节点列表
     *
     * 查询容器节点列表（仅新版本容器安全支持，即将上线，敬请期待！）
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListContainerNodesRequest 请求对象
     * @return SyncInvoker<ListContainerNodesRequest, ListContainerNodesResponse>
     */
    public SyncInvoker<ListContainerNodesRequest, ListContainerNodesResponse> listContainerNodesInvoker(
        ListContainerNodesRequest request) {
        return new SyncInvoker<ListContainerNodesRequest, ListContainerNodesResponse>(request,
            CgsMeta.listContainerNodes, hcClient);
    }

}
