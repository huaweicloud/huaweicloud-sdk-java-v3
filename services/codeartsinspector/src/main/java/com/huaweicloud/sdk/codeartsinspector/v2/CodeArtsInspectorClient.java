package com.huaweicloud.sdk.codeartsinspector.v2;

import com.huaweicloud.sdk.codeartsinspector.v2.model.CreatePurchaseOrderRequest;
import com.huaweicloud.sdk.codeartsinspector.v2.model.CreatePurchaseOrderResponse;
import com.huaweicloud.sdk.codeartsinspector.v2.model.UpdatePurchaseOrderRequest;
import com.huaweicloud.sdk.codeartsinspector.v2.model.UpdatePurchaseOrderResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CodeArtsInspectorClient {

    protected HcClient hcClient;

    public CodeArtsInspectorClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeArtsInspectorClient> newBuilder() {
        ClientBuilder<CodeArtsInspectorClient> clientBuilder = new ClientBuilder<>(CodeArtsInspectorClient::new);
        return clientBuilder;
    }

    /**
     * 订购下单接口
     *
     * 订购下单接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePurchaseOrderRequest 请求对象
     * @return CreatePurchaseOrderResponse
     */
    public CreatePurchaseOrderResponse createPurchaseOrder(CreatePurchaseOrderRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsInspectorMeta.createPurchaseOrder);
    }

    /**
     * 订购下单接口
     *
     * 订购下单接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePurchaseOrderRequest 请求对象
     * @return SyncInvoker<CreatePurchaseOrderRequest, CreatePurchaseOrderResponse>
     */
    public SyncInvoker<CreatePurchaseOrderRequest, CreatePurchaseOrderResponse> createPurchaseOrderInvoker(
        CreatePurchaseOrderRequest request) {
        return new SyncInvoker<>(request, CodeArtsInspectorMeta.createPurchaseOrder, hcClient);
    }

    /**
     * 变更下单接口
     *
     * 变更下单接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePurchaseOrderRequest 请求对象
     * @return UpdatePurchaseOrderResponse
     */
    public UpdatePurchaseOrderResponse updatePurchaseOrder(UpdatePurchaseOrderRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsInspectorMeta.updatePurchaseOrder);
    }

    /**
     * 变更下单接口
     *
     * 变更下单接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePurchaseOrderRequest 请求对象
     * @return SyncInvoker<UpdatePurchaseOrderRequest, UpdatePurchaseOrderResponse>
     */
    public SyncInvoker<UpdatePurchaseOrderRequest, UpdatePurchaseOrderResponse> updatePurchaseOrderInvoker(
        UpdatePurchaseOrderRequest request) {
        return new SyncInvoker<>(request, CodeArtsInspectorMeta.updatePurchaseOrder, hcClient);
    }

}
