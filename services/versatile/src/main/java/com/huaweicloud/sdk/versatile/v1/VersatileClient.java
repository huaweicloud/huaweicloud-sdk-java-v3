package com.huaweicloud.sdk.versatile.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.versatile.v1.model.RunAgentRequest;
import com.huaweicloud.sdk.versatile.v1.model.RunAgentResponse;
import com.huaweicloud.sdk.versatile.v1.model.RunWorkflowRequest;
import com.huaweicloud.sdk.versatile.v1.model.RunWorkflowResponse;
import com.huaweicloud.sdk.versatile.v1.model.SearchKnowledgeBaseRequest;
import com.huaweicloud.sdk.versatile.v1.model.SearchKnowledgeBaseResponse;
import com.huaweicloud.sdk.versatile.v1.model.UploadAgentFileRequest;
import com.huaweicloud.sdk.versatile.v1.model.UploadAgentFileResponse;

public class VersatileClient {

    protected HcClient hcClient;

    public VersatileClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VersatileClient> newBuilder() {
        ClientBuilder<VersatileClient> clientBuilder = new ClientBuilder<>(VersatileClient::new);
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
     * @return SearchKnowledgeBaseResponse
     */
    public SearchKnowledgeBaseResponse searchKnowledgeBase(SearchKnowledgeBaseRequest request) {
        return hcClient.syncInvokeHttp(request, VersatileMeta.searchKnowledgeBase);
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
     * @return SyncInvoker<SearchKnowledgeBaseRequest, SearchKnowledgeBaseResponse>
     */
    public SyncInvoker<SearchKnowledgeBaseRequest, SearchKnowledgeBaseResponse> searchKnowledgeBaseInvoker(
        SearchKnowledgeBaseRequest request) {
        return new SyncInvoker<>(request, VersatileMeta.searchKnowledgeBase, hcClient);
    }

    /**
     * 运行一个智能体
     *
     * 运行一个智能体，支持流式和非流式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunAgentRequest 请求对象
     * @return RunAgentResponse
     */
    public RunAgentResponse runAgent(RunAgentRequest request) {
        return hcClient.syncInvokeHttp(request, VersatileMeta.runAgent);
    }

    /**
     * 运行一个智能体
     *
     * 运行一个智能体，支持流式和非流式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunAgentRequest 请求对象
     * @return SyncInvoker<RunAgentRequest, RunAgentResponse>
     */
    public SyncInvoker<RunAgentRequest, RunAgentResponse> runAgentInvoker(RunAgentRequest request) {
        return new SyncInvoker<>(request, VersatileMeta.runAgent, hcClient);
    }

    /**
     * 运行一个工作流
     *
     * 运行一个工作流，支持流式和非流式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunWorkflowRequest 请求对象
     * @return RunWorkflowResponse
     */
    public RunWorkflowResponse runWorkflow(RunWorkflowRequest request) {
        return hcClient.syncInvokeHttp(request, VersatileMeta.runWorkflow);
    }

    /**
     * 运行一个工作流
     *
     * 运行一个工作流，支持流式和非流式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunWorkflowRequest 请求对象
     * @return SyncInvoker<RunWorkflowRequest, RunWorkflowResponse>
     */
    public SyncInvoker<RunWorkflowRequest, RunWorkflowResponse> runWorkflowInvoker(RunWorkflowRequest request) {
        return new SyncInvoker<>(request, VersatileMeta.runWorkflow, hcClient);
    }

    /**
     * 上传文件
     *
     * 上传文件，以供agent或者工作流使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAgentFileRequest 请求对象
     * @return UploadAgentFileResponse
     */
    public UploadAgentFileResponse uploadAgentFile(UploadAgentFileRequest request) {
        return hcClient.syncInvokeHttp(request, VersatileMeta.uploadAgentFile);
    }

    /**
     * 上传文件
     *
     * 上传文件，以供agent或者工作流使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadAgentFileRequest 请求对象
     * @return SyncInvoker<UploadAgentFileRequest, UploadAgentFileResponse>
     */
    public SyncInvoker<UploadAgentFileRequest, UploadAgentFileResponse> uploadAgentFileInvoker(
        UploadAgentFileRequest request) {
        return new SyncInvoker<>(request, VersatileMeta.uploadAgentFile, hcClient);
    }

}
