package com.huaweicloud.sdk.moderation.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.moderation.v1.model.*;

public class ModerationAsyncClient {
    protected HcClient hcClient;

    public ModerationAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ModerationAsyncClient> newBuilder() {
        return new ClientBuilder<>(ModerationAsyncClient::new);
    }


    /**
     * 图像内容检测（异步批量）- 处理结果查询
     * 分析并识别用户上传的图像内容是否有敏感内容（如涉及政治人物、暴恐元素、涉黄内容等），并将识别结果返回给用户。 &gt; 说明： 任务最长保留时间为30分钟，过期后会被清理掉。建议在任务提交后，每30s进行一次周期查询。 
     *
     * @param RunCheckResultRequest 请求对象
     * @return CompletableFuture<RunCheckResultResponse>
     */
    public CompletableFuture<RunCheckResultResponse> runCheckResultAsync(RunCheckResultRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.runCheckResult);
    }

    /**
     * 图像内容检测（批量）- 任务列表查询
     * 查询批量图像内容检测任务列表，可通过指定任务状态查询来对任务列表进行过滤。
     *
     * @param RunCheckTaskJobsRequest 请求对象
     * @return CompletableFuture<RunCheckTaskJobsResponse>
     */
    public CompletableFuture<RunCheckTaskJobsResponse> runCheckTaskJobsAsync(RunCheckTaskJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.runCheckTaskJobs);
    }

    /**
     * 图像内容检测（批量）
     * 分析并识别用户上传的图像内容是否有敏感内容（如涉及政治人物、暴恐元素、涉黄内容等），并将识别结果返回给用户。
     *
     * @param RunImageBatchModerationRequest 请求对象
     * @return CompletableFuture<RunImageBatchModerationResponse>
     */
    public CompletableFuture<RunImageBatchModerationResponse> runImageBatchModerationAsync(RunImageBatchModerationRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.runImageBatchModeration);
    }

    /**
     * 图像内容检测
     * 分析并识别用户上传的图像内容是否有敏感内容（如涉及政治人物、暴恐元素、涉黄内容等），并将识别结果返回给用户。
     *
     * @param RunImageModerationRequest 请求对象
     * @return CompletableFuture<RunImageModerationResponse>
     */
    public CompletableFuture<RunImageModerationResponse> runImageModerationAsync(RunImageModerationRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.runImageModeration);
    }

    /**
     * 图像内容检测（批量）- 任务提交
     * 提交批量图像内容检测任务，返回任务标识，任务标识可用于查询任务结果。此接口为异步接口，相对于批量接口，支持更大图片列表批次。
     *
     * @param RunTaskSumbitRequest 请求对象
     * @return CompletableFuture<RunTaskSumbitResponse>
     */
    public CompletableFuture<RunTaskSumbitResponse> runTaskSumbitAsync(RunTaskSumbitRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.runTaskSumbit);
    }

    /**
     * 文本内容检测
     * 分析并识别用户上传的文本内容是否有敏感内容（如色情、政治等），并将识别结果返回给用户。
     *
     * @param RunTextModerationRequest 请求对象
     * @return CompletableFuture<RunTextModerationResponse>
     */
    public CompletableFuture<RunTextModerationResponse> runTextModerationAsync(RunTextModerationRequest request) {
        return hcClient.asyncInvokeHttp(request, ModerationMeta.runTextModeration);
    }

}