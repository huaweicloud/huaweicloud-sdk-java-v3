package com.huaweicloud.sdk.pangulargemodels.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.pangulargemodels.v2.model.ExecuteChatCompletionRequest;
import com.huaweicloud.sdk.pangulargemodels.v2.model.ExecuteChatCompletionResponse;
import com.huaweicloud.sdk.pangulargemodels.v2.model.ExecuteTextCompletionRequest;
import com.huaweicloud.sdk.pangulargemodels.v2.model.ExecuteTextCompletionResponse;

import java.util.concurrent.CompletableFuture;

public class PanguLargeModelsAsyncClient {

    protected HcClient hcClient;

    public PanguLargeModelsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<PanguLargeModelsAsyncClient> newBuilder() {
        ClientBuilder<PanguLargeModelsAsyncClient> clientBuilder =
            new ClientBuilder<>(PanguLargeModelsAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 对话问答
     *
     * 基于对话问答功能，用户可以与模型进行自然而流畅的对话和交流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteChatCompletionRequest 请求对象
     * @return CompletableFuture<ExecuteChatCompletionResponse>
     */
    public CompletableFuture<ExecuteChatCompletionResponse> executeChatCompletionAsync(
        ExecuteChatCompletionRequest request) {
        return hcClient.asyncInvokeHttp(request, PanguLargeModelsMeta.executeChatCompletion);
    }

    /**
     * 对话问答
     *
     * 基于对话问答功能，用户可以与模型进行自然而流畅的对话和交流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteChatCompletionRequest 请求对象
     * @return AsyncInvoker<ExecuteChatCompletionRequest, ExecuteChatCompletionResponse>
     */
    public AsyncInvoker<ExecuteChatCompletionRequest, ExecuteChatCompletionResponse> executeChatCompletionAsyncInvoker(
        ExecuteChatCompletionRequest request) {
        return new AsyncInvoker<>(request, PanguLargeModelsMeta.executeChatCompletion, hcClient);
    }

    /**
     * 通用文本
     *
     * 给定一个提示和一些参数，模型会根据这些信息生成一个或多个预测的补全，还可以返回每个位置上不同词语的概率。它可以用来做文本生成、自动写作、代码补全等任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteTextCompletionRequest 请求对象
     * @return CompletableFuture<ExecuteTextCompletionResponse>
     */
    public CompletableFuture<ExecuteTextCompletionResponse> executeTextCompletionAsync(
        ExecuteTextCompletionRequest request) {
        return hcClient.asyncInvokeHttp(request, PanguLargeModelsMeta.executeTextCompletion);
    }

    /**
     * 通用文本
     *
     * 给定一个提示和一些参数，模型会根据这些信息生成一个或多个预测的补全，还可以返回每个位置上不同词语的概率。它可以用来做文本生成、自动写作、代码补全等任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteTextCompletionRequest 请求对象
     * @return AsyncInvoker<ExecuteTextCompletionRequest, ExecuteTextCompletionResponse>
     */
    public AsyncInvoker<ExecuteTextCompletionRequest, ExecuteTextCompletionResponse> executeTextCompletionAsyncInvoker(
        ExecuteTextCompletionRequest request) {
        return new AsyncInvoker<>(request, PanguLargeModelsMeta.executeTextCompletion, hcClient);
    }

}
