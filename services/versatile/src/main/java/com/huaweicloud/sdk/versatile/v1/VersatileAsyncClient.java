package com.huaweicloud.sdk.versatile.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.versatile.v1.model.RunAgentRequest;
import com.huaweicloud.sdk.versatile.v1.model.RunAgentResponse;
import com.huaweicloud.sdk.versatile.v1.model.RunWorkflowRequest;
import com.huaweicloud.sdk.versatile.v1.model.RunWorkflowResponse;
import com.huaweicloud.sdk.versatile.v1.model.SearchKnowledgeBaseRequest;
import com.huaweicloud.sdk.versatile.v1.model.SearchKnowledgeBaseResponse;
import com.huaweicloud.sdk.versatile.v1.model.UploadAgentFileRequest;
import com.huaweicloud.sdk.versatile.v1.model.UploadAgentFileResponse;

import java.util.concurrent.CompletableFuture;

public class VersatileAsyncClient {

    protected HcClient hcClient;

    public VersatileAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VersatileAsyncClient> newBuilder() {
        ClientBuilder<VersatileAsyncClient> clientBuilder = new ClientBuilder<>(VersatileAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 知识库检索
     *
     * 提供多知识库并行检索能力，支持语义、关键词、混合及FAQ四种检索模式，并允许自定义相似度阈值与返回结果数量，实现精准高效的信息匹配。
     * 
     * **适用场景**：
     * - 同时从多个知识库或文档集合中搜索相关内容。
     * - 在预设的问答列表中快速定位最相关的答案（FAQ检索）。
     * - 通过混合模式或调整阈值，兼顾搜索结果的准确性和全面性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchKnowledgeBaseRequest 请求对象
     * @return CompletableFuture<SearchKnowledgeBaseResponse>
     */
    public CompletableFuture<SearchKnowledgeBaseResponse> searchKnowledgeBaseAsync(SearchKnowledgeBaseRequest request) {
        return hcClient.asyncInvokeHttp(request, VersatileMeta.searchKnowledgeBase);
    }

    /**
     * 知识库检索
     *
     * 提供多知识库并行检索能力，支持语义、关键词、混合及FAQ四种检索模式，并允许自定义相似度阈值与返回结果数量，实现精准高效的信息匹配。
     * 
     * **适用场景**：
     * - 同时从多个知识库或文档集合中搜索相关内容。
     * - 在预设的问答列表中快速定位最相关的答案（FAQ检索）。
     * - 通过混合模式或调整阈值，兼顾搜索结果的准确性和全面性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchKnowledgeBaseRequest 请求对象
     * @return AsyncInvoker<SearchKnowledgeBaseRequest, SearchKnowledgeBaseResponse>
     */
    public AsyncInvoker<SearchKnowledgeBaseRequest, SearchKnowledgeBaseResponse> searchKnowledgeBaseAsyncInvoker(
        SearchKnowledgeBaseRequest request) {
        return new AsyncInvoker<>(request, VersatileMeta.searchKnowledgeBase, hcClient);
    }

    /**
     * 运行一个智能体
     *
     * 运行一个智能体，支持流式和非流式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunAgentRequest 请求对象
     * @return CompletableFuture<RunAgentResponse>
     */
    public CompletableFuture<RunAgentResponse> runAgentAsync(RunAgentRequest request) {
        return hcClient.asyncInvokeHttp(request, VersatileMeta.runAgent);
    }

    /**
     * 运行一个智能体
     *
     * 运行一个智能体，支持流式和非流式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunAgentRequest 请求对象
     * @return AsyncInvoker<RunAgentRequest, RunAgentResponse>
     */
    public AsyncInvoker<RunAgentRequest, RunAgentResponse> runAgentAsyncInvoker(RunAgentRequest request) {
        return new AsyncInvoker<>(request, VersatileMeta.runAgent, hcClient);
    }

    /**
     * 运行一个工作流
     *
     * 运行一个工作流，支持流式和非流式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunWorkflowRequest 请求对象
     * @return CompletableFuture<RunWorkflowResponse>
     */
    public CompletableFuture<RunWorkflowResponse> runWorkflowAsync(RunWorkflowRequest request) {
        return hcClient.asyncInvokeHttp(request, VersatileMeta.runWorkflow);
    }

    /**
     * 运行一个工作流
     *
     * 运行一个工作流，支持流式和非流式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunWorkflowRequest 请求对象
     * @return AsyncInvoker<RunWorkflowRequest, RunWorkflowResponse>
     */
    public AsyncInvoker<RunWorkflowRequest, RunWorkflowResponse> runWorkflowAsyncInvoker(RunWorkflowRequest request) {
        return new AsyncInvoker<>(request, VersatileMeta.runWorkflow, hcClient);
    }

    /**
     * 上传文件
     *
     * 上传文件，以供agent或者工作流使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAgentFileRequest 请求对象
     * @return CompletableFuture<UploadAgentFileResponse>
     */
    public CompletableFuture<UploadAgentFileResponse> uploadAgentFileAsync(UploadAgentFileRequest request) {
        return hcClient.asyncInvokeHttp(request, VersatileMeta.uploadAgentFile);
    }

    /**
     * 上传文件
     *
     * 上传文件，以供agent或者工作流使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAgentFileRequest 请求对象
     * @return AsyncInvoker<UploadAgentFileRequest, UploadAgentFileResponse>
     */
    public AsyncInvoker<UploadAgentFileRequest, UploadAgentFileResponse> uploadAgentFileAsyncInvoker(
        UploadAgentFileRequest request) {
        return new AsyncInvoker<>(request, VersatileMeta.uploadAgentFile, hcClient);
    }

}
