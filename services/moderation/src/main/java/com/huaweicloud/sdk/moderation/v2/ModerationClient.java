package com.huaweicloud.sdk.moderation.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.moderation.v2.model.*;

public class ModerationClient {

    protected HcClient hcClient;

    public ModerationClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ModerationClient> newBuilder() {
        return new ClientBuilder<>(ModerationClient::new);
    }

    /**
     * 处理结果查询
     *
     * 分析并识别用户上传的图像内容是否有敏感内容（如涉及政治人物、暴恐元素、涉黄内容等），并将识别结果返回给用户。
     * &gt; 任务最长保留时间为30分钟，过期后会被清理掉。建议在任务提交后，每30s进行一次周期查询。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunCheckResultRequest 请求对象
     * @return RunCheckResultResponse
     */
    public RunCheckResultResponse runCheckResult(RunCheckResultRequest request) {
        return hcClient.syncInvokeHttp(request, ModerationMeta.runCheckResult);
    }

    /**
     * 处理结果查询
     *
     * 分析并识别用户上传的图像内容是否有敏感内容（如涉及政治人物、暴恐元素、涉黄内容等），并将识别结果返回给用户。
     * &gt; 任务最长保留时间为30分钟，过期后会被清理掉。建议在任务提交后，每30s进行一次周期查询。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunCheckResultRequest 请求对象
     * @return SyncInvoker<RunCheckResultRequest, RunCheckResultResponse>
     */
    public SyncInvoker<RunCheckResultRequest, RunCheckResultResponse> runCheckResultInvoker(
        RunCheckResultRequest request) {
        return new SyncInvoker<RunCheckResultRequest, RunCheckResultResponse>(request, ModerationMeta.runCheckResult,
            hcClient);
    }

    /**
     * 任务列表查询
     *
     * 查询批量图像内容审核任务列表，可通过指定任务状态查询来对任务列表进行过滤。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunCheckTaskJobsRequest 请求对象
     * @return RunCheckTaskJobsResponse
     */
    public RunCheckTaskJobsResponse runCheckTaskJobs(RunCheckTaskJobsRequest request) {
        return hcClient.syncInvokeHttp(request, ModerationMeta.runCheckTaskJobs);
    }

    /**
     * 任务列表查询
     *
     * 查询批量图像内容审核任务列表，可通过指定任务状态查询来对任务列表进行过滤。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunCheckTaskJobsRequest 请求对象
     * @return SyncInvoker<RunCheckTaskJobsRequest, RunCheckTaskJobsResponse>
     */
    public SyncInvoker<RunCheckTaskJobsRequest, RunCheckTaskJobsResponse> runCheckTaskJobsInvoker(
        RunCheckTaskJobsRequest request) {
        return new SyncInvoker<RunCheckTaskJobsRequest, RunCheckTaskJobsResponse>(request,
            ModerationMeta.runCheckTaskJobs, hcClient);
    }

    /**
     * 图像内容审核（批量）
     *
     * 分析并识别用户上传的图像内容是否有敏感内容（如涉及政治人物、暴恐元素、涉黄内容等），并将识别结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunImageBatchModerationRequest 请求对象
     * @return RunImageBatchModerationResponse
     */
    public RunImageBatchModerationResponse runImageBatchModeration(RunImageBatchModerationRequest request) {
        return hcClient.syncInvokeHttp(request, ModerationMeta.runImageBatchModeration);
    }

    /**
     * 图像内容审核（批量）
     *
     * 分析并识别用户上传的图像内容是否有敏感内容（如涉及政治人物、暴恐元素、涉黄内容等），并将识别结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunImageBatchModerationRequest 请求对象
     * @return SyncInvoker<RunImageBatchModerationRequest, RunImageBatchModerationResponse>
     */
    public SyncInvoker<RunImageBatchModerationRequest, RunImageBatchModerationResponse> runImageBatchModerationInvoker(
        RunImageBatchModerationRequest request) {
        return new SyncInvoker<RunImageBatchModerationRequest, RunImageBatchModerationResponse>(request,
            ModerationMeta.runImageBatchModeration, hcClient);
    }

    /**
     * 图像内容审核
     *
     * 分析并识别用户上传的图像内容是否有敏感内容（如涉及政治人物、暴恐元素、涉黄内容等），并将识别结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunImageModerationRequest 请求对象
     * @return RunImageModerationResponse
     */
    public RunImageModerationResponse runImageModeration(RunImageModerationRequest request) {
        return hcClient.syncInvokeHttp(request, ModerationMeta.runImageModeration);
    }

    /**
     * 图像内容审核
     *
     * 分析并识别用户上传的图像内容是否有敏感内容（如涉及政治人物、暴恐元素、涉黄内容等），并将识别结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunImageModerationRequest 请求对象
     * @return SyncInvoker<RunImageModerationRequest, RunImageModerationResponse>
     */
    public SyncInvoker<RunImageModerationRequest, RunImageModerationResponse> runImageModerationInvoker(
        RunImageModerationRequest request) {
        return new SyncInvoker<RunImageModerationRequest, RunImageModerationResponse>(request,
            ModerationMeta.runImageModeration, hcClient);
    }

    /**
     * 语音内容审核
     *
     * 分析并识别用户上传的语音内容是否有敏感内容（如色情、政治等），并将识别结果 返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunModerationAudioRequest 请求对象
     * @return RunModerationAudioResponse
     */
    public RunModerationAudioResponse runModerationAudio(RunModerationAudioRequest request) {
        return hcClient.syncInvokeHttp(request, ModerationMeta.runModerationAudio);
    }

    /**
     * 语音内容审核
     *
     * 分析并识别用户上传的语音内容是否有敏感内容（如色情、政治等），并将识别结果 返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunModerationAudioRequest 请求对象
     * @return SyncInvoker<RunModerationAudioRequest, RunModerationAudioResponse>
     */
    public SyncInvoker<RunModerationAudioRequest, RunModerationAudioResponse> runModerationAudioInvoker(
        RunModerationAudioRequest request) {
        return new SyncInvoker<RunModerationAudioRequest, RunModerationAudioResponse>(request,
            ModerationMeta.runModerationAudio, hcClient);
    }

    /**
     * 任务提交
     *
     * 提交批量图像内容审核任务，返回任务标识，任务标识可用于查询任务结果。此接口为异步接口，相对于批量接口，支持更大图片列表批次。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunTaskSumbitRequest 请求对象
     * @return RunTaskSumbitResponse
     */
    public RunTaskSumbitResponse runTaskSumbit(RunTaskSumbitRequest request) {
        return hcClient.syncInvokeHttp(request, ModerationMeta.runTaskSumbit);
    }

    /**
     * 任务提交
     *
     * 提交批量图像内容审核任务，返回任务标识，任务标识可用于查询任务结果。此接口为异步接口，相对于批量接口，支持更大图片列表批次。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunTaskSumbitRequest 请求对象
     * @return SyncInvoker<RunTaskSumbitRequest, RunTaskSumbitResponse>
     */
    public SyncInvoker<RunTaskSumbitRequest, RunTaskSumbitResponse> runTaskSumbitInvoker(RunTaskSumbitRequest request) {
        return new SyncInvoker<RunTaskSumbitRequest, RunTaskSumbitResponse>(request, ModerationMeta.runTaskSumbit,
            hcClient);
    }

    /**
     * 文本内容审核
     *
     * 分析并识别用户上传的文本内容是否有敏感内容（如色情、政治等），并将识别结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunTextModerationRequest 请求对象
     * @return RunTextModerationResponse
     */
    public RunTextModerationResponse runTextModeration(RunTextModerationRequest request) {
        return hcClient.syncInvokeHttp(request, ModerationMeta.runTextModeration);
    }

    /**
     * 文本内容审核
     *
     * 分析并识别用户上传的文本内容是否有敏感内容（如色情、政治等），并将识别结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunTextModerationRequest 请求对象
     * @return SyncInvoker<RunTextModerationRequest, RunTextModerationResponse>
     */
    public SyncInvoker<RunTextModerationRequest, RunTextModerationResponse> runTextModerationInvoker(
        RunTextModerationRequest request) {
        return new SyncInvoker<RunTextModerationRequest, RunTextModerationResponse>(request,
            ModerationMeta.runTextModeration, hcClient);
    }

}
