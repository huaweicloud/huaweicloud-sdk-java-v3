package com.huaweicloud.sdk.moderation.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.moderation.v2.model.*;

import java.util.concurrent.CompletableFuture;

public class ModerationAsyncClient {

    protected HcClient hcClient;

    public ModerationAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ModerationAsyncClient> newBuilder() {
        return new ClientBuilder<>(ModerationAsyncClient::new);
    }

    /** 处理结果查询 分析并识别用户上传的图像内容是否有敏感内容（如涉及政治人物、暴恐元素、涉黄内容等），并将识别结果返回给用户。 &gt; 任务最长保留时间为30分钟，过期后会被清理掉。建议在任务提交后，每30s进行一次周期查询。
     *
     * @param RunCheckResultRequest 请求对象
     * @return CompletableFuture<RunCheckResultResponse> */
    public CompletableFuture<RunCheckResultResponse> runCheckResultAsync(RunCheckResultRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.runCheckResult);
    }

    /** 处理结果查询 分析并识别用户上传的图像内容是否有敏感内容（如涉及政治人物、暴恐元素、涉黄内容等），并将识别结果返回给用户。 &gt; 任务最长保留时间为30分钟，过期后会被清理掉。建议在任务提交后，每30s进行一次周期查询。
     *
     * @param RunCheckResultRequest 请求对象
     * @return AsyncInvoker<RunCheckResultRequest, RunCheckResultResponse> */
    public AsyncInvoker<RunCheckResultRequest, RunCheckResultResponse> runCheckResultAsyncInvoker(
        RunCheckResultRequest request) {
        return new AsyncInvoker<RunCheckResultRequest, RunCheckResultResponse>(request, ModerationMeta.runCheckResult,
            hcClient);
    }

    /** 任务列表查询 查询批量图像内容审核任务列表，可通过指定任务状态查询来对任务列表进行过滤。
     *
     * @param RunCheckTaskJobsRequest 请求对象
     * @return CompletableFuture<RunCheckTaskJobsResponse> */
    public CompletableFuture<RunCheckTaskJobsResponse> runCheckTaskJobsAsync(RunCheckTaskJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.runCheckTaskJobs);
    }

    /** 任务列表查询 查询批量图像内容审核任务列表，可通过指定任务状态查询来对任务列表进行过滤。
     *
     * @param RunCheckTaskJobsRequest 请求对象
     * @return AsyncInvoker<RunCheckTaskJobsRequest, RunCheckTaskJobsResponse> */
    public AsyncInvoker<RunCheckTaskJobsRequest, RunCheckTaskJobsResponse> runCheckTaskJobsAsyncInvoker(
        RunCheckTaskJobsRequest request) {
        return new AsyncInvoker<RunCheckTaskJobsRequest, RunCheckTaskJobsResponse>(request,
            ModerationMeta.runCheckTaskJobs, hcClient);
    }

    /** 图像内容审核（批量） 分析并识别用户上传的图像内容是否有敏感内容（如涉及政治人物、暴恐元素、涉黄内容等），并将识别结果返回给用户。
     *
     * @param RunImageBatchModerationRequest 请求对象
     * @return CompletableFuture<RunImageBatchModerationResponse> */
    public CompletableFuture<RunImageBatchModerationResponse> runImageBatchModerationAsync(
        RunImageBatchModerationRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.runImageBatchModeration);
    }

    /** 图像内容审核（批量） 分析并识别用户上传的图像内容是否有敏感内容（如涉及政治人物、暴恐元素、涉黄内容等），并将识别结果返回给用户。
     *
     * @param RunImageBatchModerationRequest 请求对象
     * @return AsyncInvoker<RunImageBatchModerationRequest, RunImageBatchModerationResponse> */
    public AsyncInvoker<RunImageBatchModerationRequest, RunImageBatchModerationResponse> runImageBatchModerationAsyncInvoker(
        RunImageBatchModerationRequest request) {
        return new AsyncInvoker<RunImageBatchModerationRequest, RunImageBatchModerationResponse>(request,
            ModerationMeta.runImageBatchModeration, hcClient);
    }

    /** 图像内容审核 分析并识别用户上传的图像内容是否有敏感内容（如涉及政治人物、暴恐元素、涉黄内容等），并将识别结果返回给用户。
     *
     * @param RunImageModerationRequest 请求对象
     * @return CompletableFuture<RunImageModerationResponse> */
    public CompletableFuture<RunImageModerationResponse> runImageModerationAsync(RunImageModerationRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.runImageModeration);
    }

    /** 图像内容审核 分析并识别用户上传的图像内容是否有敏感内容（如涉及政治人物、暴恐元素、涉黄内容等），并将识别结果返回给用户。
     *
     * @param RunImageModerationRequest 请求对象
     * @return AsyncInvoker<RunImageModerationRequest, RunImageModerationResponse> */
    public AsyncInvoker<RunImageModerationRequest, RunImageModerationResponse> runImageModerationAsyncInvoker(
        RunImageModerationRequest request) {
        return new AsyncInvoker<RunImageModerationRequest, RunImageModerationResponse>(request,
            ModerationMeta.runImageModeration, hcClient);
    }

    /** 语音内容审核 分析并识别用户上传的语音内容是否有敏感内容（如色情、政治等），并将识别结果 返回给用户。
     *
     * @param RunModerationAudioRequest 请求对象
     * @return CompletableFuture<RunModerationAudioResponse> */
    public CompletableFuture<RunModerationAudioResponse> runModerationAudioAsync(RunModerationAudioRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.runModerationAudio);
    }

    /** 语音内容审核 分析并识别用户上传的语音内容是否有敏感内容（如色情、政治等），并将识别结果 返回给用户。
     *
     * @param RunModerationAudioRequest 请求对象
     * @return AsyncInvoker<RunModerationAudioRequest, RunModerationAudioResponse> */
    public AsyncInvoker<RunModerationAudioRequest, RunModerationAudioResponse> runModerationAudioAsyncInvoker(
        RunModerationAudioRequest request) {
        return new AsyncInvoker<RunModerationAudioRequest, RunModerationAudioResponse>(request,
            ModerationMeta.runModerationAudio, hcClient);
    }

    /** 任务提交 提交批量图像内容审核任务，返回任务标识，任务标识可用于查询任务结果。此接口为异步接口，相对于批量接口，支持更大图片列表批次。
     *
     * @param RunTaskSumbitRequest 请求对象
     * @return CompletableFuture<RunTaskSumbitResponse> */
    public CompletableFuture<RunTaskSumbitResponse> runTaskSumbitAsync(RunTaskSumbitRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.runTaskSumbit);
    }

    /** 任务提交 提交批量图像内容审核任务，返回任务标识，任务标识可用于查询任务结果。此接口为异步接口，相对于批量接口，支持更大图片列表批次。
     *
     * @param RunTaskSumbitRequest 请求对象
     * @return AsyncInvoker<RunTaskSumbitRequest, RunTaskSumbitResponse> */
    public AsyncInvoker<RunTaskSumbitRequest, RunTaskSumbitResponse> runTaskSumbitAsyncInvoker(
        RunTaskSumbitRequest request) {
        return new AsyncInvoker<RunTaskSumbitRequest, RunTaskSumbitResponse>(request, ModerationMeta.runTaskSumbit,
            hcClient);
    }

    /** 文本内容审核 分析并识别用户上传的文本内容是否有敏感内容（如色情、政治等），并将识别结果返回给用户。
     *
     * @param RunTextModerationRequest 请求对象
     * @return CompletableFuture<RunTextModerationResponse> */
    public CompletableFuture<RunTextModerationResponse> runTextModerationAsync(RunTextModerationRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.runTextModeration);
    }

    /** 文本内容审核 分析并识别用户上传的文本内容是否有敏感内容（如色情、政治等），并将识别结果返回给用户。
     *
     * @param RunTextModerationRequest 请求对象
     * @return AsyncInvoker<RunTextModerationRequest, RunTextModerationResponse> */
    public AsyncInvoker<RunTextModerationRequest, RunTextModerationResponse> runTextModerationAsyncInvoker(
        RunTextModerationRequest request) {
        return new AsyncInvoker<RunTextModerationRequest, RunTextModerationResponse>(request,
            ModerationMeta.runTextModeration, hcClient);
    }

}
