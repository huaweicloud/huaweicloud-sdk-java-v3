package com.huaweicloud.sdk.codeartsinspector.v2;

import com.huaweicloud.sdk.codeartsinspector.v2.model.CreatePurchaseOrderRequest;
import com.huaweicloud.sdk.codeartsinspector.v2.model.CreatePurchaseOrderResponse;
import com.huaweicloud.sdk.codeartsinspector.v2.model.UpdatePurchaseOrderRequest;
import com.huaweicloud.sdk.codeartsinspector.v2.model.UpdatePurchaseOrderResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CodeArtsInspectorAsyncClient {

    protected HcClient hcClient;

    public CodeArtsInspectorAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeArtsInspectorAsyncClient> newBuilder() {
        ClientBuilder<CodeArtsInspectorAsyncClient> clientBuilder =
            new ClientBuilder<>(CodeArtsInspectorAsyncClient::new);
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
     * @return CompletableFuture<CreatePurchaseOrderResponse>
     */
    public CompletableFuture<CreatePurchaseOrderResponse> createPurchaseOrderAsync(CreatePurchaseOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsInspectorMeta.createPurchaseOrder);
    }

    /**
     * 订购下单接口
     *
     * 订购下单接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePurchaseOrderRequest 请求对象
     * @return AsyncInvoker<CreatePurchaseOrderRequest, CreatePurchaseOrderResponse>
     */
    public AsyncInvoker<CreatePurchaseOrderRequest, CreatePurchaseOrderResponse> createPurchaseOrderAsyncInvoker(
        CreatePurchaseOrderRequest request) {
        return new AsyncInvoker<>(request, CodeArtsInspectorMeta.createPurchaseOrder, hcClient);
    }

    /**
     * 变更下单接口
     *
     * 变更下单接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePurchaseOrderRequest 请求对象
     * @return CompletableFuture<UpdatePurchaseOrderResponse>
     */
    public CompletableFuture<UpdatePurchaseOrderResponse> updatePurchaseOrderAsync(UpdatePurchaseOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsInspectorMeta.updatePurchaseOrder);
    }

    /**
     * 变更下单接口
     *
     * 变更下单接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePurchaseOrderRequest 请求对象
     * @return AsyncInvoker<UpdatePurchaseOrderRequest, UpdatePurchaseOrderResponse>
     */
    public AsyncInvoker<UpdatePurchaseOrderRequest, UpdatePurchaseOrderResponse> updatePurchaseOrderAsyncInvoker(
        UpdatePurchaseOrderRequest request) {
        return new AsyncInvoker<>(request, CodeArtsInspectorMeta.updatePurchaseOrder, hcClient);
    }

}
