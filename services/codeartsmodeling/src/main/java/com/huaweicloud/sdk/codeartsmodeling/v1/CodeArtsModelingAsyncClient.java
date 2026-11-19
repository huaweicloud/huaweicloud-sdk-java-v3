package com.huaweicloud.sdk.codeartsmodeling.v1;

import com.huaweicloud.sdk.codeartsmodeling.v1.model.ConvertPlantUml2DiagramRequest;
import com.huaweicloud.sdk.codeartsmodeling.v1.model.ConvertPlantUml2DiagramResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CodeArtsModelingAsyncClient {

    protected HcClient hcClient;

    public CodeArtsModelingAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeArtsModelingAsyncClient> newBuilder() {
        ClientBuilder<CodeArtsModelingAsyncClient> clientBuilder =
            new ClientBuilder<>(CodeArtsModelingAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 将plantuml代码转换成CM模型图
     *
     * 将plantuml代码转换成CM模型图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConvertPlantUml2DiagramRequest 请求对象
     * @return CompletableFuture<ConvertPlantUml2DiagramResponse>
     */
    public CompletableFuture<ConvertPlantUml2DiagramResponse> convertPlantUml2DiagramAsync(
        ConvertPlantUml2DiagramRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsModelingMeta.convertPlantUml2Diagram);
    }

    /**
     * 将plantuml代码转换成CM模型图
     *
     * 将plantuml代码转换成CM模型图
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConvertPlantUml2DiagramRequest 请求对象
     * @return AsyncInvoker<ConvertPlantUml2DiagramRequest, ConvertPlantUml2DiagramResponse>
     */
    public AsyncInvoker<ConvertPlantUml2DiagramRequest, ConvertPlantUml2DiagramResponse> convertPlantUml2DiagramAsyncInvoker(
        ConvertPlantUml2DiagramRequest request) {
        return new AsyncInvoker<>(request, CodeArtsModelingMeta.convertPlantUml2Diagram, hcClient);
    }

}
