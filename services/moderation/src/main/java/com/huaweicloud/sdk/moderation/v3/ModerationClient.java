package com.huaweicloud.sdk.moderation.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.moderation.v3.model.CheckImageModerationRequest;
import com.huaweicloud.sdk.moderation.v3.model.CheckImageModerationResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunCloseAudioStreamModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunCloseAudioStreamModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunCloseVideoStreamModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunCloseVideoStreamModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateAudioModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateAudioModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateAudioStreamModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateAudioStreamModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateDocumentModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateDocumentModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateVideoModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateVideoModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateVideoStreamModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunCreateVideoStreamModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunQueryAudioModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunQueryAudioModerationJobResponse;
import com.huaweicloud.sdk.moderation.v3.model.RunQueryDocumentModerationJobRequest;
import com.huaweicloud.sdk.moderation.v3.model.RunQueryDocumentModerationJobResponse;
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
     * 图像内容审核
     *
     * 分析并识别用户上传的图像内容是否有敏感内容（如涉及暴恐元素、涉黄内容等），并将识别结果返回给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckImageModerationRequest 请求对象
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
     * @param CheckImageModerationRequest 请求对象
     * @return SyncInvoker<CheckImageModerationRequest, CheckImageModerationResponse>
     */
    public SyncInvoker<CheckImageModerationRequest, CheckImageModerationResponse> checkImageModerationInvoker(
        CheckImageModerationRequest request) {
        return new SyncInvoker<CheckImageModerationRequest, CheckImageModerationResponse>(request,
            ModerationMeta.checkImageModeration, hcClient);
    }

    /**
     * 关闭音频流内容审核作业
     *
     * 关闭音频流内容审核作业
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunCloseAudioStreamModerationJobRequest 请求对象
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
     * @param RunCloseAudioStreamModerationJobRequest 请求对象
     * @return SyncInvoker<RunCloseAudioStreamModerationJobRequest, RunCloseAudioStreamModerationJobResponse>
     */
    public SyncInvoker<RunCloseAudioStreamModerationJobRequest, RunCloseAudioStreamModerationJobResponse> runCloseAudioStreamModerationJobInvoker(
        RunCloseAudioStreamModerationJobRequest request) {
        return new SyncInvoker<RunCloseAudioStreamModerationJobRequest, RunCloseAudioStreamModerationJobResponse>(
            request, ModerationMeta.runCloseAudioStreamModerationJob, hcClient);
    }

    /**
     * 关闭视频流内容审核作业
     *
     * 关闭视频流审核接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunCloseVideoStreamModerationJobRequest 请求对象
     * @return RunCloseVideoStreamModerationJobResponse
     */
    public RunCloseVideoStreamModerationJobResponse runCloseVideoStreamModerationJob(
        RunCloseVideoStreamModerationJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModerationMeta.runCloseVideoStreamModerationJob);
    }

    /**
     * 关闭视频流内容审核作业
     *
     * 关闭视频流审核接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunCloseVideoStreamModerationJobRequest 请求对象
     * @return SyncInvoker<RunCloseVideoStreamModerationJobRequest, RunCloseVideoStreamModerationJobResponse>
     */
    public SyncInvoker<RunCloseVideoStreamModerationJobRequest, RunCloseVideoStreamModerationJobResponse> runCloseVideoStreamModerationJobInvoker(
        RunCloseVideoStreamModerationJobRequest request) {
        return new SyncInvoker<RunCloseVideoStreamModerationJobRequest, RunCloseVideoStreamModerationJobResponse>(
            request, ModerationMeta.runCloseVideoStreamModerationJob, hcClient);
    }

    /**
     * 创建音频内容审核作业
     *
     * 分析并识别用户上传的音频内容是否有敏感内容（如色情、政治等），并将识别结果返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunCreateAudioModerationJobRequest 请求对象
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
     * @param RunCreateAudioModerationJobRequest 请求对象
     * @return SyncInvoker<RunCreateAudioModerationJobRequest, RunCreateAudioModerationJobResponse>
     */
    public SyncInvoker<RunCreateAudioModerationJobRequest, RunCreateAudioModerationJobResponse> runCreateAudioModerationJobInvoker(
        RunCreateAudioModerationJobRequest request) {
        return new SyncInvoker<RunCreateAudioModerationJobRequest, RunCreateAudioModerationJobResponse>(request,
            ModerationMeta.runCreateAudioModerationJob, hcClient);
    }

    /**
     * 创建音频流内容审核作业
     *
     * 创建音频流内容审核作业，创建成功会将作业ID返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunCreateAudioStreamModerationJobRequest 请求对象
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
     * @param RunCreateAudioStreamModerationJobRequest 请求对象
     * @return SyncInvoker<RunCreateAudioStreamModerationJobRequest, RunCreateAudioStreamModerationJobResponse>
     */
    public SyncInvoker<RunCreateAudioStreamModerationJobRequest, RunCreateAudioStreamModerationJobResponse> runCreateAudioStreamModerationJobInvoker(
        RunCreateAudioStreamModerationJobRequest request) {
        return new SyncInvoker<RunCreateAudioStreamModerationJobRequest, RunCreateAudioStreamModerationJobResponse>(
            request, ModerationMeta.runCreateAudioStreamModerationJob, hcClient);
    }

    /**
     * 创建文档内容审核作业
     *
     * 创建文档内容审核作业，创建成功会将作业ID返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunCreateDocumentModerationJobRequest 请求对象
     * @return RunCreateDocumentModerationJobResponse
     */
    public RunCreateDocumentModerationJobResponse runCreateDocumentModerationJob(
        RunCreateDocumentModerationJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModerationMeta.runCreateDocumentModerationJob);
    }

    /**
     * 创建文档内容审核作业
     *
     * 创建文档内容审核作业，创建成功会将作业ID返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunCreateDocumentModerationJobRequest 请求对象
     * @return SyncInvoker<RunCreateDocumentModerationJobRequest, RunCreateDocumentModerationJobResponse>
     */
    public SyncInvoker<RunCreateDocumentModerationJobRequest, RunCreateDocumentModerationJobResponse> runCreateDocumentModerationJobInvoker(
        RunCreateDocumentModerationJobRequest request) {
        return new SyncInvoker<RunCreateDocumentModerationJobRequest, RunCreateDocumentModerationJobResponse>(request,
            ModerationMeta.runCreateDocumentModerationJob, hcClient);
    }

    /**
     * 创建视频内容审核作业
     *
     * 创建视频内容审核作业，创建成功会将作业ID返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunCreateVideoModerationJobRequest 请求对象
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
     * @param RunCreateVideoModerationJobRequest 请求对象
     * @return SyncInvoker<RunCreateVideoModerationJobRequest, RunCreateVideoModerationJobResponse>
     */
    public SyncInvoker<RunCreateVideoModerationJobRequest, RunCreateVideoModerationJobResponse> runCreateVideoModerationJobInvoker(
        RunCreateVideoModerationJobRequest request) {
        return new SyncInvoker<RunCreateVideoModerationJobRequest, RunCreateVideoModerationJobResponse>(request,
            ModerationMeta.runCreateVideoModerationJob, hcClient);
    }

    /**
     * 创建视频流内容审核作业
     *
     * 创建视频流内容审核作业，创建成功会将作业ID返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunCreateVideoStreamModerationJobRequest 请求对象
     * @return RunCreateVideoStreamModerationJobResponse
     */
    public RunCreateVideoStreamModerationJobResponse runCreateVideoStreamModerationJob(
        RunCreateVideoStreamModerationJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModerationMeta.runCreateVideoStreamModerationJob);
    }

    /**
     * 创建视频流内容审核作业
     *
     * 创建视频流内容审核作业，创建成功会将作业ID返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunCreateVideoStreamModerationJobRequest 请求对象
     * @return SyncInvoker<RunCreateVideoStreamModerationJobRequest, RunCreateVideoStreamModerationJobResponse>
     */
    public SyncInvoker<RunCreateVideoStreamModerationJobRequest, RunCreateVideoStreamModerationJobResponse> runCreateVideoStreamModerationJobInvoker(
        RunCreateVideoStreamModerationJobRequest request) {
        return new SyncInvoker<RunCreateVideoStreamModerationJobRequest, RunCreateVideoStreamModerationJobResponse>(
            request, ModerationMeta.runCreateVideoStreamModerationJob, hcClient);
    }

    /**
     * 查询音频内容审核作业
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunQueryAudioModerationJobRequest 请求对象
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
     * @param RunQueryAudioModerationJobRequest 请求对象
     * @return SyncInvoker<RunQueryAudioModerationJobRequest, RunQueryAudioModerationJobResponse>
     */
    public SyncInvoker<RunQueryAudioModerationJobRequest, RunQueryAudioModerationJobResponse> runQueryAudioModerationJobInvoker(
        RunQueryAudioModerationJobRequest request) {
        return new SyncInvoker<RunQueryAudioModerationJobRequest, RunQueryAudioModerationJobResponse>(request,
            ModerationMeta.runQueryAudioModerationJob, hcClient);
    }

    /**
     * 查询文档审核作业结果
     *
     * 查询文档审核结果接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunQueryDocumentModerationJobRequest 请求对象
     * @return RunQueryDocumentModerationJobResponse
     */
    public RunQueryDocumentModerationJobResponse runQueryDocumentModerationJob(
        RunQueryDocumentModerationJobRequest request) {
        return hcClient.syncInvokeHttp(request, ModerationMeta.runQueryDocumentModerationJob);
    }

    /**
     * 查询文档审核作业结果
     *
     * 查询文档审核结果接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunQueryDocumentModerationJobRequest 请求对象
     * @return SyncInvoker<RunQueryDocumentModerationJobRequest, RunQueryDocumentModerationJobResponse>
     */
    public SyncInvoker<RunQueryDocumentModerationJobRequest, RunQueryDocumentModerationJobResponse> runQueryDocumentModerationJobInvoker(
        RunQueryDocumentModerationJobRequest request) {
        return new SyncInvoker<RunQueryDocumentModerationJobRequest, RunQueryDocumentModerationJobResponse>(request,
            ModerationMeta.runQueryDocumentModerationJob, hcClient);
    }

    /**
     * 查询视频内容审核作业
     *
     * 查询视频审核作业处理状态与结果，并将识别结果返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunQueryVideoModerationJobRequest 请求对象
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
     * @param RunQueryVideoModerationJobRequest 请求对象
     * @return SyncInvoker<RunQueryVideoModerationJobRequest, RunQueryVideoModerationJobResponse>
     */
    public SyncInvoker<RunQueryVideoModerationJobRequest, RunQueryVideoModerationJobResponse> runQueryVideoModerationJobInvoker(
        RunQueryVideoModerationJobRequest request) {
        return new SyncInvoker<RunQueryVideoModerationJobRequest, RunQueryVideoModerationJobResponse>(request,
            ModerationMeta.runQueryVideoModerationJob, hcClient);
    }

    /**
     * 文本内容审核
     *
     * 分析并识别用户上传的文本内容是否有敏感内容（如色情、政治等），并将识别结果返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
     * 分析并识别用户上传的文本内容是否有敏感内容（如色情、政治等），并将识别结果返回给用户
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
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
