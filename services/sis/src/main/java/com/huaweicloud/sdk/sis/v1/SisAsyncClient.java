package com.huaweicloud.sdk.sis.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.sis.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class SisAsyncClient {

    protected HcClient hcClient;

    public SisAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SisAsyncClient> newBuilder() {
        return new ClientBuilder<>(SisAsyncClient::new);
    }

    /**
     * 获取录音文件识别结果
     *
     * 该接口用于获取录音文件识别结果及识别状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CollectTranscriberJobRequest 请求对象
     * @return CompletableFuture<CollectTranscriberJobResponse>
     */
    public CompletableFuture<CollectTranscriberJobResponse> collectTranscriberJobAsync(
        CollectTranscriberJobRequest request) {
        return hcClient.asyncInvokeHttp(request, SisMeta.collectTranscriberJob);
    }

    /**
     * 获取录音文件识别结果
     *
     * 该接口用于获取录音文件识别结果及识别状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CollectTranscriberJobRequest 请求对象
     * @return AsyncInvoker<CollectTranscriberJobRequest, CollectTranscriberJobResponse>
     */
    public AsyncInvoker<CollectTranscriberJobRequest, CollectTranscriberJobResponse> collectTranscriberJobAsyncInvoker(
        CollectTranscriberJobRequest request) {
        return new AsyncInvoker<CollectTranscriberJobRequest, CollectTranscriberJobResponse>(request,
            SisMeta.collectTranscriberJob, hcClient);
    }

    /**
     * 创建热词表
     *
     * 新建一个热词表，创建成功返回id。每个用户限制创建10个热词表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateVocabularyRequest 请求对象
     * @return CompletableFuture<CreateVocabularyResponse>
     */
    public CompletableFuture<CreateVocabularyResponse> createVocabularyAsync(CreateVocabularyRequest request) {
        return hcClient.asyncInvokeHttp(request, SisMeta.createVocabulary);
    }

    /**
     * 创建热词表
     *
     * 新建一个热词表，创建成功返回id。每个用户限制创建10个热词表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateVocabularyRequest 请求对象
     * @return AsyncInvoker<CreateVocabularyRequest, CreateVocabularyResponse>
     */
    public AsyncInvoker<CreateVocabularyRequest, CreateVocabularyResponse> createVocabularyAsyncInvoker(
        CreateVocabularyRequest request) {
        return new AsyncInvoker<CreateVocabularyRequest, CreateVocabularyResponse>(request, SisMeta.createVocabulary,
            hcClient);
    }

    /**
     * 删除热词表
     *
     * 通过热词表id删除热词表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteVocabularyRequest 请求对象
     * @return CompletableFuture<DeleteVocabularyResponse>
     */
    public CompletableFuture<DeleteVocabularyResponse> deleteVocabularyAsync(DeleteVocabularyRequest request) {
        return hcClient.asyncInvokeHttp(request, SisMeta.deleteVocabulary);
    }

    /**
     * 删除热词表
     *
     * 通过热词表id删除热词表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteVocabularyRequest 请求对象
     * @return AsyncInvoker<DeleteVocabularyRequest, DeleteVocabularyResponse>
     */
    public AsyncInvoker<DeleteVocabularyRequest, DeleteVocabularyResponse> deleteVocabularyAsyncInvoker(
        DeleteVocabularyRequest request) {
        return new AsyncInvoker<DeleteVocabularyRequest, DeleteVocabularyResponse>(request, SisMeta.deleteVocabulary,
            hcClient);
    }

    /**
     * 提交录音文件识别任务
     *
     * **录音文件识别**
     * 录音文件识别接口，用于识别长录音文件，录音文件放在华为云OBS（对象存储服务）上。
     * 
     * 由于录音文件识别通常会需要较长的时间，因此识别是异步的，也即接口分为创建识别任务和查询任务状态两个接口。创建识别任务接口创建任务完成后返回，然后用户通过调用查询任务状态接口来获得转写状态和结果。
     * 
     * **功能介绍**
     * 该接口用于提交录音文件识别任务，其中录音文件保存在用户的OBS桶中。用户开通录音识别服务时，需授权录音文件引擎读取用户OBS桶权限。
     * 
     * 接口约束
     * 录音时长不超过5小时，文件大小不超过300M，识别结果保存72小时（从识别完成的时间算起）。72小时后如果再访问，将会返回 \&quot;task id is not found\&quot;错误。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param PushTranscriberJobsRequest 请求对象
     * @return CompletableFuture<PushTranscriberJobsResponse>
     */
    public CompletableFuture<PushTranscriberJobsResponse> pushTranscriberJobsAsync(PushTranscriberJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, SisMeta.pushTranscriberJobs);
    }

    /**
     * 提交录音文件识别任务
     *
     * **录音文件识别**
     * 录音文件识别接口，用于识别长录音文件，录音文件放在华为云OBS（对象存储服务）上。
     * 
     * 由于录音文件识别通常会需要较长的时间，因此识别是异步的，也即接口分为创建识别任务和查询任务状态两个接口。创建识别任务接口创建任务完成后返回，然后用户通过调用查询任务状态接口来获得转写状态和结果。
     * 
     * **功能介绍**
     * 该接口用于提交录音文件识别任务，其中录音文件保存在用户的OBS桶中。用户开通录音识别服务时，需授权录音文件引擎读取用户OBS桶权限。
     * 
     * 接口约束
     * 录音时长不超过5小时，文件大小不超过300M，识别结果保存72小时（从识别完成的时间算起）。72小时后如果再访问，将会返回 \&quot;task id is not found\&quot;错误。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param PushTranscriberJobsRequest 请求对象
     * @return AsyncInvoker<PushTranscriberJobsRequest, PushTranscriberJobsResponse>
     */
    public AsyncInvoker<PushTranscriberJobsRequest, PushTranscriberJobsResponse> pushTranscriberJobsAsyncInvoker(
        PushTranscriberJobsRequest request) {
        return new AsyncInvoker<PushTranscriberJobsRequest, PushTranscriberJobsResponse>(request,
            SisMeta.pushTranscriberJobs, hcClient);
    }

    /**
     * 录音文件识别极速版
     *
     * 极速版ASR(Restful API 接口, 适用于音频(文件大小&lt;&#x3D;100M,语音时长&lt;&#x3D;30分钟)文件的同步识别。
     * 此接口以POST方式一次性上传整个音频或从华为OBS中下载音频， 识别结果将在请求响应中即刻返回，用于语音文件极速转写，质检分析的离线场景。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeFlashAsrRequest 请求对象
     * @return CompletableFuture<RecognizeFlashAsrResponse>
     */
    public CompletableFuture<RecognizeFlashAsrResponse> recognizeFlashAsrAsync(RecognizeFlashAsrRequest request) {
        return hcClient.asyncInvokeHttp(request, SisMeta.recognizeFlashAsr);
    }

    /**
     * 录音文件识别极速版
     *
     * 极速版ASR(Restful API 接口, 适用于音频(文件大小&lt;&#x3D;100M,语音时长&lt;&#x3D;30分钟)文件的同步识别。
     * 此接口以POST方式一次性上传整个音频或从华为OBS中下载音频， 识别结果将在请求响应中即刻返回，用于语音文件极速转写，质检分析的离线场景。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeFlashAsrRequest 请求对象
     * @return AsyncInvoker<RecognizeFlashAsrRequest, RecognizeFlashAsrResponse>
     */
    public AsyncInvoker<RecognizeFlashAsrRequest, RecognizeFlashAsrResponse> recognizeFlashAsrAsyncInvoker(
        RecognizeFlashAsrRequest request) {
        return new AsyncInvoker<RecognizeFlashAsrRequest, RecognizeFlashAsrResponse>(request, SisMeta.recognizeFlashAsr,
            hcClient);
    }

    /**
     * 一句话识别
     *
     * 一句话识别接口，用于短语音的同步识别。一次性上传整个音频，响应中即返回识别结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeShortAudioRequest 请求对象
     * @return CompletableFuture<RecognizeShortAudioResponse>
     */
    public CompletableFuture<RecognizeShortAudioResponse> recognizeShortAudioAsync(RecognizeShortAudioRequest request) {
        return hcClient.asyncInvokeHttp(request, SisMeta.recognizeShortAudio);
    }

    /**
     * 一句话识别
     *
     * 一句话识别接口，用于短语音的同步识别。一次性上传整个音频，响应中即返回识别结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeShortAudioRequest 请求对象
     * @return AsyncInvoker<RecognizeShortAudioRequest, RecognizeShortAudioResponse>
     */
    public AsyncInvoker<RecognizeShortAudioRequest, RecognizeShortAudioResponse> recognizeShortAudioAsyncInvoker(
        RecognizeShortAudioRequest request) {
        return new AsyncInvoker<RecognizeShortAudioRequest, RecognizeShortAudioResponse>(request,
            SisMeta.recognizeShortAudio, hcClient);
    }

    /**
     * 语音评测
     *
     * 口语评测接口，基于一小段朗读语音和预期文本，评价朗读者发音质量。当前仅支持华北-北京四。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunAudioAssessmentRequest 请求对象
     * @return CompletableFuture<RunAudioAssessmentResponse>
     */
    public CompletableFuture<RunAudioAssessmentResponse> runAudioAssessmentAsync(RunAudioAssessmentRequest request) {
        return hcClient.asyncInvokeHttp(request, SisMeta.runAudioAssessment);
    }

    /**
     * 语音评测
     *
     * 口语评测接口，基于一小段朗读语音和预期文本，评价朗读者发音质量。当前仅支持华北-北京四。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunAudioAssessmentRequest 请求对象
     * @return AsyncInvoker<RunAudioAssessmentRequest, RunAudioAssessmentResponse>
     */
    public AsyncInvoker<RunAudioAssessmentRequest, RunAudioAssessmentResponse> runAudioAssessmentAsyncInvoker(
        RunAudioAssessmentRequest request) {
        return new AsyncInvoker<RunAudioAssessmentRequest, RunAudioAssessmentResponse>(request,
            SisMeta.runAudioAssessment, hcClient);
    }

    /**
     * 多模态评测
     *
     * 多模态评测接口，根据朗读视频数据、视频对应的音频数据和试题文本，综合给出朗读者口语的评测分数。当前仅支持华北-北京四。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunMultiModalAssessmentRequest 请求对象
     * @return CompletableFuture<RunMultiModalAssessmentResponse>
     */
    public CompletableFuture<RunMultiModalAssessmentResponse> runMultiModalAssessmentAsync(
        RunMultiModalAssessmentRequest request) {
        return hcClient.asyncInvokeHttp(request, SisMeta.runMultiModalAssessment);
    }

    /**
     * 多模态评测
     *
     * 多模态评测接口，根据朗读视频数据、视频对应的音频数据和试题文本，综合给出朗读者口语的评测分数。当前仅支持华北-北京四。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunMultiModalAssessmentRequest 请求对象
     * @return AsyncInvoker<RunMultiModalAssessmentRequest, RunMultiModalAssessmentResponse>
     */
    public AsyncInvoker<RunMultiModalAssessmentRequest, RunMultiModalAssessmentResponse> runMultiModalAssessmentAsyncInvoker(
        RunMultiModalAssessmentRequest request) {
        return new AsyncInvoker<RunMultiModalAssessmentRequest, RunMultiModalAssessmentResponse>(request,
            SisMeta.runMultiModalAssessment, hcClient);
    }

    /**
     * 语音合成
     *
     * 语音合成，是一种将文本转换成逼真语音的服务。用户通过实时访问和调用API获取语音合成结果，将用户输入的文字合成为音频。通过音色选择、自定义音量、语速，为企业和个人提供个性化的发音服务
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunTtsRequest 请求对象
     * @return CompletableFuture<RunTtsResponse>
     */
    public CompletableFuture<RunTtsResponse> runTtsAsync(RunTtsRequest request) {
        return hcClient.asyncInvokeHttp(request, SisMeta.runTts);
    }

    /**
     * 语音合成
     *
     * 语音合成，是一种将文本转换成逼真语音的服务。用户通过实时访问和调用API获取语音合成结果，将用户输入的文字合成为音频。通过音色选择、自定义音量、语速，为企业和个人提供个性化的发音服务
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RunTtsRequest 请求对象
     * @return AsyncInvoker<RunTtsRequest, RunTtsResponse>
     */
    public AsyncInvoker<RunTtsRequest, RunTtsResponse> runTtsAsyncInvoker(RunTtsRequest request) {
        return new AsyncInvoker<RunTtsRequest, RunTtsResponse>(request, SisMeta.runTts, hcClient);
    }

    /**
     * 查询热词表列表
     *
     * 查询用户所有热词表列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowVocabulariesRequest 请求对象
     * @return CompletableFuture<ShowVocabulariesResponse>
     */
    public CompletableFuture<ShowVocabulariesResponse> showVocabulariesAsync(ShowVocabulariesRequest request) {
        return hcClient.asyncInvokeHttp(request, SisMeta.showVocabularies);
    }

    /**
     * 查询热词表列表
     *
     * 查询用户所有热词表列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowVocabulariesRequest 请求对象
     * @return AsyncInvoker<ShowVocabulariesRequest, ShowVocabulariesResponse>
     */
    public AsyncInvoker<ShowVocabulariesRequest, ShowVocabulariesResponse> showVocabulariesAsyncInvoker(
        ShowVocabulariesRequest request) {
        return new AsyncInvoker<ShowVocabulariesRequest, ShowVocabulariesResponse>(request, SisMeta.showVocabularies,
            hcClient);
    }

    /**
     * 查询热词表信息
     *
     * 通过热词表id查询热词表的信息和内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowVocabularyRequest 请求对象
     * @return CompletableFuture<ShowVocabularyResponse>
     */
    public CompletableFuture<ShowVocabularyResponse> showVocabularyAsync(ShowVocabularyRequest request) {
        return hcClient.asyncInvokeHttp(request, SisMeta.showVocabulary);
    }

    /**
     * 查询热词表信息
     *
     * 通过热词表id查询热词表的信息和内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowVocabularyRequest 请求对象
     * @return AsyncInvoker<ShowVocabularyRequest, ShowVocabularyResponse>
     */
    public AsyncInvoker<ShowVocabularyRequest, ShowVocabularyResponse> showVocabularyAsyncInvoker(
        ShowVocabularyRequest request) {
        return new AsyncInvoker<ShowVocabularyRequest, ShowVocabularyResponse>(request, SisMeta.showVocabulary,
            hcClient);
    }

    /**
     * 更新热词表
     *
     * 更新一个热词表，更新成功返回id。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateVocabularyRequest 请求对象
     * @return CompletableFuture<UpdateVocabularyResponse>
     */
    public CompletableFuture<UpdateVocabularyResponse> updateVocabularyAsync(UpdateVocabularyRequest request) {
        return hcClient.asyncInvokeHttp(request, SisMeta.updateVocabulary);
    }

    /**
     * 更新热词表
     *
     * 更新一个热词表，更新成功返回id。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateVocabularyRequest 请求对象
     * @return AsyncInvoker<UpdateVocabularyRequest, UpdateVocabularyResponse>
     */
    public AsyncInvoker<UpdateVocabularyRequest, UpdateVocabularyResponse> updateVocabularyAsyncInvoker(
        UpdateVocabularyRequest request) {
        return new AsyncInvoker<UpdateVocabularyRequest, UpdateVocabularyResponse>(request, SisMeta.updateVocabulary,
            hcClient);
    }

}
