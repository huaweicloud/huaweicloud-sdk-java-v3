package com.huaweicloud.sdk.moderation.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.moderation.v3.model.BatchCheckImageSyncRequest;
import com.huaweicloud.sdk.moderation.v3.model.BatchCheckImageSyncResponse;
import com.huaweicloud.sdk.moderation.v3.model.CheckImageModerationRequest;
import com.huaweicloud.sdk.moderation.v3.model.CheckImageModerationResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunCloseAudioStreamModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunCloseAudioStreamModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateAudioModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateAudioModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateAudioStreamModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateAudioStreamModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateVideoModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateVideoModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunQueryAudioModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunQueryAudioModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunQueryVideoModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunQueryVideoModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunTextModerationRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunTextModerationResponse;

import java.util.concurrent.CompletableFuture;

public class ModerationAsyncClient {

    protected HcClient hcClient;

    public ModerationAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ModerationAsyncClient> newBuilder() {
        ClientBuilder<ModerationAsyncClient> clientBuilder = new ClientBuilder<>(ModerationAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 图像审核批量同步接口
     *
     * 图像审核批量同步接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckImageSyncRequest 请求对象
     * @return CompletableFuture<BatchCheckImageSyncResponse>
     */
    public CompletableFuture<BatchCheckImageSyncResponse> batchCheckImageSyncAsync(BatchCheckImageSyncRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.batchCheckImageSync);
    }

    /**
     * 图像审核批量同步接口
     *
     * 图像审核批量同步接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckImageSyncRequest 请求对象
     * @return AsyncInvoker<BatchCheckImageSyncRequest, BatchCheckImageSyncResponse>
     */
    public AsyncInvoker<BatchCheckImageSyncRequest, BatchCheckImageSyncResponse> batchCheckImageSyncAsyncInvoker(
        BatchCheckImageSyncRequest request) {
        return new AsyncInvoker<>(request, ModerationMeta.batchCheckImageSync, hcClient);
    }

    /**
     * 图像内容审核
     *
     * 分析并识别用户上传的图像内容是否有敏感内容（如涉及暴恐元素、涉黄内容等），并将识别结果返回给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckImageModerationRequest 请求对象
     * @return CompletableFuture<CheckImageModerationResponse>
     */
    public CompletableFuture<CheckImageModerationResponse> checkImageModerationAsync(
        CheckImageModerationRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.checkImageModeration);
    }

    /**
     * 图像内容审核
     *
     * 分析并识别用户上传的图像内容是否有敏感内容（如涉及暴恐元素、涉黄内容等），并将识别结果返回给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckImageModerationRequest 请求对象
     * @return AsyncInvoker<CheckImageModerationRequest, CheckImageModerationResponse>
     */
    public AsyncInvoker<CheckImageModerationRequest, CheckImageModerationResponse> checkImageModerationAsyncInvoker(
        CheckImageModerationRequest request) {
        return new AsyncInvoker<>(request, ModerationMeta.checkImageModeration, hcClient);
    }

    /**
     * 关闭音频流内容审核作业
     *
     * 关闭音频流内容审核作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunCloseAudioStreamModerationJobRequest 请求对象
     * @return CompletableFuture<RunCloseAudioStreamModerationJobResponse>
     */
    public CompletableFuture<RunCloseAudioStreamModerationJobResponse> runCloseAudioStreamModerationJobAsync(
        RunCloseAudioStreamModerationJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.runCloseAudioStreamModerationJob);
    }

    /**
     * 关闭音频流内容审核作业
     *
     * 关闭音频流内容审核作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunCloseAudioStreamModerationJobRequest 请求对象
     * @return AsyncInvoker<RunCloseAudioStreamModerationJobRequest, RunCloseAudioStreamModerationJobResponse>
     */
    public AsyncInvoker<RunCloseAudioStreamModerationJobRequest, RunCloseAudioStreamModerationJobResponse> runCloseAudioStreamModerationJobAsyncInvoker(
        RunCloseAudioStreamModerationJobRequest request) {
        return new AsyncInvoker<>(request, ModerationMeta.runCloseAudioStreamModerationJob, hcClient);
    }

    /**
     * 创建音频内容审核作业
     *
     * 分析并识别用户上传的音频内容是否有敏感内容（如色情、政治等），并将识别结果返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunCreateAudioModerationJobRequest 请求对象
     * @return CompletableFuture<RunCreateAudioModerationJobResponse>
     */
    public CompletableFuture<RunCreateAudioModerationJobResponse> runCreateAudioModerationJobAsync(
        RunCreateAudioModerationJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.runCreateAudioModerationJob);
    }

    /**
     * 创建音频内容审核作业
     *
     * 分析并识别用户上传的音频内容是否有敏感内容（如色情、政治等），并将识别结果返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunCreateAudioModerationJobRequest 请求对象
     * @return AsyncInvoker<RunCreateAudioModerationJobRequest, RunCreateAudioModerationJobResponse>
     */
    public AsyncInvoker<RunCreateAudioModerationJobRequest, RunCreateAudioModerationJobResponse> runCreateAudioModerationJobAsyncInvoker(
        RunCreateAudioModerationJobRequest request) {
        return new AsyncInvoker<>(request, ModerationMeta.runCreateAudioModerationJob, hcClient);
    }

    /**
     * 创建音频流内容审核作业
     *
     * 创建音频流内容审核作业，创建成功会将作业ID返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunCreateAudioStreamModerationJobRequest 请求对象
     * @return CompletableFuture<RunCreateAudioStreamModerationJobResponse>
     */
    public CompletableFuture<RunCreateAudioStreamModerationJobResponse> runCreateAudioStreamModerationJobAsync(
        RunCreateAudioStreamModerationJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.runCreateAudioStreamModerationJob);
    }

    /**
     * 创建音频流内容审核作业
     *
     * 创建音频流内容审核作业，创建成功会将作业ID返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunCreateAudioStreamModerationJobRequest 请求对象
     * @return AsyncInvoker<RunCreateAudioStreamModerationJobRequest, RunCreateAudioStreamModerationJobResponse>
     */
    public AsyncInvoker<RunCreateAudioStreamModerationJobRequest, RunCreateAudioStreamModerationJobResponse> runCreateAudioStreamModerationJobAsyncInvoker(
        RunCreateAudioStreamModerationJobRequest request) {
        return new AsyncInvoker<>(request, ModerationMeta.runCreateAudioStreamModerationJob, hcClient);
    }

    /**
     * 创建视频内容审核作业
     *
     * 创建视频内容审核作业，创建成功会将作业ID返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunCreateVideoModerationJobRequest 请求对象
     * @return CompletableFuture<RunCreateVideoModerationJobResponse>
     */
    public CompletableFuture<RunCreateVideoModerationJobResponse> runCreateVideoModerationJobAsync(
        RunCreateVideoModerationJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.runCreateVideoModerationJob);
    }

    /**
     * 创建视频内容审核作业
     *
     * 创建视频内容审核作业，创建成功会将作业ID返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunCreateVideoModerationJobRequest 请求对象
     * @return AsyncInvoker<RunCreateVideoModerationJobRequest, RunCreateVideoModerationJobResponse>
     */
    public AsyncInvoker<RunCreateVideoModerationJobRequest, RunCreateVideoModerationJobResponse> runCreateVideoModerationJobAsyncInvoker(
        RunCreateVideoModerationJobRequest request) {
        return new AsyncInvoker<>(request, ModerationMeta.runCreateVideoModerationJob, hcClient);
    }

    /**
     * 查询音频内容审核作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunQueryAudioModerationJobRequest 请求对象
     * @return CompletableFuture<RunQueryAudioModerationJobResponse>
     */
    public CompletableFuture<RunQueryAudioModerationJobResponse> runQueryAudioModerationJobAsync(
        RunQueryAudioModerationJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.runQueryAudioModerationJob);
    }

    /**
     * 查询音频内容审核作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunQueryAudioModerationJobRequest 请求对象
     * @return AsyncInvoker<RunQueryAudioModerationJobRequest, RunQueryAudioModerationJobResponse>
     */
    public AsyncInvoker<RunQueryAudioModerationJobRequest, RunQueryAudioModerationJobResponse> runQueryAudioModerationJobAsyncInvoker(
        RunQueryAudioModerationJobRequest request) {
        return new AsyncInvoker<>(request, ModerationMeta.runQueryAudioModerationJob, hcClient);
    }

    /**
     * 查询视频内容审核作业
     *
     * 查询视频审核作业处理状态与结果，并将识别结果返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunQueryVideoModerationJobRequest 请求对象
     * @return CompletableFuture<RunQueryVideoModerationJobResponse>
     */
    public CompletableFuture<RunQueryVideoModerationJobResponse> runQueryVideoModerationJobAsync(
        RunQueryVideoModerationJobRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.runQueryVideoModerationJob);
    }

    /**
     * 查询视频内容审核作业
     *
     * 查询视频审核作业处理状态与结果，并将识别结果返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunQueryVideoModerationJobRequest 请求对象
     * @return AsyncInvoker<RunQueryVideoModerationJobRequest, RunQueryVideoModerationJobResponse>
     */
    public AsyncInvoker<RunQueryVideoModerationJobRequest, RunQueryVideoModerationJobResponse> runQueryVideoModerationJobAsyncInvoker(
        RunQueryVideoModerationJobRequest request) {
        return new AsyncInvoker<>(request, ModerationMeta.runQueryVideoModerationJob, hcClient);
    }

    /**
     * 文本内容审核
     *
     * 分析并识别用户上传的文本内容是否有敏感内容（如色情、政治等），并将识别结果返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunTextModerationRequest 请求对象
     * @return CompletableFuture<RunTextModerationResponse>
     */
    public CompletableFuture<RunTextModerationResponse> runTextModerationAsync(RunTextModerationRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.runTextModeration);
    }

    /**
     * 文本内容审核
     *
     * 分析并识别用户上传的文本内容是否有敏感内容（如色情、政治等），并将识别结果返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunTextModerationRequest 请求对象
     * @return AsyncInvoker<RunTextModerationRequest, RunTextModerationResponse>
     */
    public AsyncInvoker<RunTextModerationRequest, RunTextModerationResponse> runTextModerationAsyncInvoker(
        RunTextModerationRequest request) {
        return new AsyncInvoker<>(request, ModerationMeta.runTextModeration, hcClient);
    }

}
