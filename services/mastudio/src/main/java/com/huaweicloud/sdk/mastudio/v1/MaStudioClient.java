package com.huaweicloud.sdk.mastudio.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.mastudio.v1.model.ExecuteChatCompletionRequest;
import com.huaweicloud.sdk.mastudio.v1.model.ExecuteChatCompletionResponse;
import com.huaweicloud.sdk.mastudio.v1.model.ExecuteTextCompletionRequest;
import com.huaweicloud.sdk.mastudio.v1.model.ExecuteTextCompletionResponse;

public class MaStudioClient {

    protected HcClient hcClient;

    public MaStudioClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MaStudioClient> newBuilder() {
        ClientBuilder<MaStudioClient> clientBuilder = new ClientBuilder<>(MaStudioClient::new);
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
     * @return ExecuteChatCompletionResponse
     */
    public ExecuteChatCompletionResponse executeChatCompletion(ExecuteChatCompletionRequest request) {
        return hcClient.syncInvokeHttp(request, MaStudioMeta.executeChatCompletion);
    }

    /**
     * 对话问答
     *
     * 基于对话问答功能，用户可以与模型进行自然而流畅的对话和交流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteChatCompletionRequest 请求对象
     * @return SyncInvoker<ExecuteChatCompletionRequest, ExecuteChatCompletionResponse>
     */
    public SyncInvoker<ExecuteChatCompletionRequest, ExecuteChatCompletionResponse> executeChatCompletionInvoker(
        ExecuteChatCompletionRequest request) {
        return new SyncInvoker<>(request, MaStudioMeta.executeChatCompletion, hcClient);
    }

    /**
     * 通用文本
     *
     * 给定一个提示和一些参数，模型会根据这些信息生成一个或多个预测的补全，还可以返回每个位置上不同词语的概率。它可以用来做文本生成、自动写作、代码补全等任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteTextCompletionRequest 请求对象
     * @return ExecuteTextCompletionResponse
     */
    public ExecuteTextCompletionResponse executeTextCompletion(ExecuteTextCompletionRequest request) {
        return hcClient.syncInvokeHttp(request, MaStudioMeta.executeTextCompletion);
    }

    /**
     * 通用文本
     *
     * 给定一个提示和一些参数，模型会根据这些信息生成一个或多个预测的补全，还可以返回每个位置上不同词语的概率。它可以用来做文本生成、自动写作、代码补全等任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteTextCompletionRequest 请求对象
     * @return SyncInvoker<ExecuteTextCompletionRequest, ExecuteTextCompletionResponse>
     */
    public SyncInvoker<ExecuteTextCompletionRequest, ExecuteTextCompletionResponse> executeTextCompletionInvoker(
        ExecuteTextCompletionRequest request) {
        return new SyncInvoker<>(request, MaStudioMeta.executeTextCompletion, hcClient);
    }

}
