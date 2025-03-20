package com.huaweicloud.sdk.moderation.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class ModerationClient {

    protected HcClient hcClient;

    public ModerationClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ModerationClient> newBuilder() {
        ClientBuilder<ModerationClient> clientBuilder = new ClientBuilder<>(ModerationClient::new);
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
     * @return BatchCheckImageSyncResponse
     */
    public BatchCheckImageSyncResponse batchCheckImageSync(BatchCheckImageSyncRequest request) {
        return hcClient.syncInvokeHttp(request, ModerationMeta.batchCheckImageSync);
    }

    /**
     * 图像审核批量同步接口
     *
     * 图像审核批量同步接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckImageSyncRequest 请求对象
     * @return SyncInvoker<BatchCheckImageSyncRequest, BatchCheckImageSyncResponse>
     */
    public SyncInvoker<BatchCheckImageSyncRequest, BatchCheckImageSyncResponse> batchCheckImageSyncInvoker(
        BatchCheckImageSyncRequest request) {
        return new SyncInvoker<>(request, ModerationMeta.batchCheckImageSync, hcClient);
    }

    /**
     * 图像内容审核
     *
     * 分析并识别用户上传的图像内容是否有敏感内容（如涉及暴恐元素、涉黄内容等），并将识别结果返回给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckImageModerationRequest 请求对象
     * @return CheckImageModerationResponse
     */
    public CheckImageModerationResponse checkImageModeration(CheckImageModerationRequest request) {
        return hcClient.syncInvokeHttp(request, ModerationMeta.checkImageModeration);
    }

    /**
     * 图像内容审核
     *
     * 分析并识别用户上传的图像内容是否有敏感内容（如涉及暴恐元素、涉黄内容等），并将识别结果返回给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckImageModerationRequest 请求对象
     * @return SyncInvoker<CheckImageModerationRequest, CheckImageModerationResponse>
     */
    public SyncInvoker<CheckImageModerationRequest, CheckImageModerationResponse> checkImageModerationInvoker(
        CheckImageModerationRequest request) {
        return new SyncInvoker<>(request, ModerationMeta.checkImageModeration, hcClient);
    }

    /**
     * 关闭音频流内容审核作业
     *
     * 关闭音频流内容审核作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunCloseAudioStreamModerationJobRequest 请求对象
     * @return RunCloseAudioStreamModerationJobResponse
     */
    public RunCloseAudioStreamModerationJobResponse runCloseAudioStreamModerationJob(
        RunCloseAudioStreamModerationJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModerationMeta.runCloseAudioStreamModerationJob);
    }

    /**
     * 关闭音频流内容审核作业
     *
     * 关闭音频流内容审核作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunCloseAudioStreamModerationJobRequest 请求对象
     * @return SyncInvoker<RunCloseAudioStreamModerationJobRequest, RunCloseAudioStreamModerationJobResponse>
     */
    public SyncInvoker<RunCloseAudioStreamModerationJobRequest, RunCloseAudioStreamModerationJobResponse> runCloseAudioStreamModerationJobInvoker(
        RunCloseAudioStreamModerationJobRequest request) {
        return new SyncInvoker<>(request, ModerationMeta.runCloseAudioStreamModerationJob, hcClient);
    }

    /**
     * 创建音频内容审核作业
     *
     * 分析并识别用户上传的音频内容是否有敏感内容（如色情、政治等），并将识别结果返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunCreateAudioModerationJobRequest 请求对象
     * @return RunCreateAudioModerationJobResponse
     */
    public RunCreateAudioModerationJobResponse runCreateAudioModerationJob(RunCreateAudioModerationJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModerationMeta.runCreateAudioModerationJob);
    }

    /**
     * 创建音频内容审核作业
     *
     * 分析并识别用户上传的音频内容是否有敏感内容（如色情、政治等），并将识别结果返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunCreateAudioModerationJobRequest 请求对象
     * @return SyncInvoker<RunCreateAudioModerationJobRequest, RunCreateAudioModerationJobResponse>
     */
    public SyncInvoker<RunCreateAudioModerationJobRequest, RunCreateAudioModerationJobResponse> runCreateAudioModerationJobInvoker(
        RunCreateAudioModerationJobRequest request) {
        return new SyncInvoker<>(request, ModerationMeta.runCreateAudioModerationJob, hcClient);
    }

    /**
     * 创建音频流内容审核作业
     *
     * 创建音频流内容审核作业，创建成功会将作业ID返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunCreateAudioStreamModerationJobRequest 请求对象
     * @return RunCreateAudioStreamModerationJobResponse
     */
    public RunCreateAudioStreamModerationJobResponse runCreateAudioStreamModerationJob(
        RunCreateAudioStreamModerationJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModerationMeta.runCreateAudioStreamModerationJob);
    }

    /**
     * 创建音频流内容审核作业
     *
     * 创建音频流内容审核作业，创建成功会将作业ID返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunCreateAudioStreamModerationJobRequest 请求对象
     * @return SyncInvoker<RunCreateAudioStreamModerationJobRequest, RunCreateAudioStreamModerationJobResponse>
     */
    public SyncInvoker<RunCreateAudioStreamModerationJobRequest, RunCreateAudioStreamModerationJobResponse> runCreateAudioStreamModerationJobInvoker(
        RunCreateAudioStreamModerationJobRequest request) {
        return new SyncInvoker<>(request, ModerationMeta.runCreateAudioStreamModerationJob, hcClient);
    }

    /**
     * 创建视频内容审核作业
     *
     * 创建视频内容审核作业，创建成功会将作业ID返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunCreateVideoModerationJobRequest 请求对象
     * @return RunCreateVideoModerationJobResponse
     */
    public RunCreateVideoModerationJobResponse runCreateVideoModerationJob(RunCreateVideoModerationJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModerationMeta.runCreateVideoModerationJob);
    }

    /**
     * 创建视频内容审核作业
     *
     * 创建视频内容审核作业，创建成功会将作业ID返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunCreateVideoModerationJobRequest 请求对象
     * @return SyncInvoker<RunCreateVideoModerationJobRequest, RunCreateVideoModerationJobResponse>
     */
    public SyncInvoker<RunCreateVideoModerationJobRequest, RunCreateVideoModerationJobResponse> runCreateVideoModerationJobInvoker(
        RunCreateVideoModerationJobRequest request) {
        return new SyncInvoker<>(request, ModerationMeta.runCreateVideoModerationJob, hcClient);
    }

    /**
     * 查询音频内容审核作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunQueryAudioModerationJobRequest 请求对象
     * @return RunQueryAudioModerationJobResponse
     */
    public RunQueryAudioModerationJobResponse runQueryAudioModerationJob(RunQueryAudioModerationJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModerationMeta.runQueryAudioModerationJob);
    }

    /**
     * 查询音频内容审核作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunQueryAudioModerationJobRequest 请求对象
     * @return SyncInvoker<RunQueryAudioModerationJobRequest, RunQueryAudioModerationJobResponse>
     */
    public SyncInvoker<RunQueryAudioModerationJobRequest, RunQueryAudioModerationJobResponse> runQueryAudioModerationJobInvoker(
        RunQueryAudioModerationJobRequest request) {
        return new SyncInvoker<>(request, ModerationMeta.runQueryAudioModerationJob, hcClient);
    }

    /**
     * 查询视频内容审核作业
     *
     * 查询视频审核作业处理状态与结果，并将识别结果返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunQueryVideoModerationJobRequest 请求对象
     * @return RunQueryVideoModerationJobResponse
     */
    public RunQueryVideoModerationJobResponse runQueryVideoModerationJob(RunQueryVideoModerationJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModerationMeta.runQueryVideoModerationJob);
    }

    /**
     * 查询视频内容审核作业
     *
     * 查询视频审核作业处理状态与结果，并将识别结果返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunQueryVideoModerationJobRequest 请求对象
     * @return SyncInvoker<RunQueryVideoModerationJobRequest, RunQueryVideoModerationJobResponse>
     */
    public SyncInvoker<RunQueryVideoModerationJobRequest, RunQueryVideoModerationJobResponse> runQueryVideoModerationJobInvoker(
        RunQueryVideoModerationJobRequest request) {
        return new SyncInvoker<>(request, ModerationMeta.runQueryVideoModerationJob, hcClient);
    }

    /**
     * 文本内容审核
     *
     * 分析并识别用户上传的文本内容是否有敏感内容（如色情、政治等），并将识别结果返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunTextModerationRequest 请求对象
     * @return RunTextModerationResponse
     */
    public RunTextModerationResponse runTextModeration(RunTextModerationRequest request) {
        return hcClient.syncInvokeHttp(request, ModerationMeta.runTextModeration);
    }

    /**
     * 文本内容审核
     *
     * 分析并识别用户上传的文本内容是否有敏感内容（如色情、政治等），并将识别结果返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunTextModerationRequest 请求对象
     * @return SyncInvoker<RunTextModerationRequest, RunTextModerationResponse>
     */
    public SyncInvoker<RunTextModerationRequest, RunTextModerationResponse> runTextModerationInvoker(
        RunTextModerationRequest request) {
        return new SyncInvoker<>(request, ModerationMeta.runTextModeration, hcClient);
    }

}
