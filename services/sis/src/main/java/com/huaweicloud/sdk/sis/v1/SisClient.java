package com.huaweicloud.sdk.sis.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.sis.v1.model.*;

public class SisClient {

    protected HcClient hcClient;

    public SisClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SisClient> newBuilder() {
        return new ClientBuilder<>(SisClient::new);
    }

    /**
     * 获取录音文件识别结果
     *
     * 该接口用于获取录音文件识别结果及识别状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CollectTranscriberJobRequest 请求对象
     * @return CollectTranscriberJobResponse
     */
    public CollectTranscriberJobResponse collectTranscriberJob(CollectTranscriberJobRequest request) {
        return hcClient.syncInvokeHttp(request, SisMeta.collectTranscriberJob);
    }

    /**
     * 获取录音文件识别结果
     *
     * 该接口用于获取录音文件识别结果及识别状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CollectTranscriberJobRequest 请求对象
     * @return SyncInvoker<CollectTranscriberJobRequest, CollectTranscriberJobResponse>
     */
    public SyncInvoker<CollectTranscriberJobRequest, CollectTranscriberJobResponse> collectTranscriberJobInvoker(
        CollectTranscriberJobRequest request) {
        return new SyncInvoker<CollectTranscriberJobRequest, CollectTranscriberJobResponse>(request,
            SisMeta.collectTranscriberJob, hcClient);
    }

    /**
     * 创建热词表
     *
     * 新建一个热词表，创建成功返回id。每个用户限制创建10个热词表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVocabularyRequest 请求对象
     * @return CreateVocabularyResponse
     */
    public CreateVocabularyResponse createVocabulary(CreateVocabularyRequest request) {
        return hcClient.syncInvokeHttp(request, SisMeta.createVocabulary);
    }

    /**
     * 创建热词表
     *
     * 新建一个热词表，创建成功返回id。每个用户限制创建10个热词表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVocabularyRequest 请求对象
     * @return SyncInvoker<CreateVocabularyRequest, CreateVocabularyResponse>
     */
    public SyncInvoker<CreateVocabularyRequest, CreateVocabularyResponse> createVocabularyInvoker(
        CreateVocabularyRequest request) {
        return new SyncInvoker<CreateVocabularyRequest, CreateVocabularyResponse>(request, SisMeta.createVocabulary,
            hcClient);
    }

    /**
     * 删除热词表
     *
     * 通过热词表id删除热词表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVocabularyRequest 请求对象
     * @return DeleteVocabularyResponse
     */
    public DeleteVocabularyResponse deleteVocabulary(DeleteVocabularyRequest request) {
        return hcClient.syncInvokeHttp(request, SisMeta.deleteVocabulary);
    }

    /**
     * 删除热词表
     *
     * 通过热词表id删除热词表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVocabularyRequest 请求对象
     * @return SyncInvoker<DeleteVocabularyRequest, DeleteVocabularyResponse>
     */
    public SyncInvoker<DeleteVocabularyRequest, DeleteVocabularyResponse> deleteVocabularyInvoker(
        DeleteVocabularyRequest request) {
        return new SyncInvoker<DeleteVocabularyRequest, DeleteVocabularyResponse>(request, SisMeta.deleteVocabulary,
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PushTranscriberJobsRequest 请求对象
     * @return PushTranscriberJobsResponse
     */
    public PushTranscriberJobsResponse pushTranscriberJobs(PushTranscriberJobsRequest request) {
        return hcClient.syncInvokeHttp(request, SisMeta.pushTranscriberJobs);
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PushTranscriberJobsRequest 请求对象
     * @return SyncInvoker<PushTranscriberJobsRequest, PushTranscriberJobsResponse>
     */
    public SyncInvoker<PushTranscriberJobsRequest, PushTranscriberJobsResponse> pushTranscriberJobsInvoker(
        PushTranscriberJobsRequest request) {
        return new SyncInvoker<PushTranscriberJobsRequest, PushTranscriberJobsResponse>(request,
            SisMeta.pushTranscriberJobs, hcClient);
    }

    /**
     * 录音文件识别极速版
     *
     * 极速版ASR(Restful API 接口, 适用于音频(文件大小&lt;&#x3D;100M,语音时长&lt;&#x3D;30分钟)文件的同步识别。
     * 此接口以POST方式一次性上传整个音频或从华为OBS中下载音频， 识别结果将在请求响应中即刻返回，用于语音文件极速转写，质检分析的离线场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeFlashAsrRequest 请求对象
     * @return RecognizeFlashAsrResponse
     */
    public RecognizeFlashAsrResponse recognizeFlashAsr(RecognizeFlashAsrRequest request) {
        return hcClient.syncInvokeHttp(request, SisMeta.recognizeFlashAsr);
    }

    /**
     * 录音文件识别极速版
     *
     * 极速版ASR(Restful API 接口, 适用于音频(文件大小&lt;&#x3D;100M,语音时长&lt;&#x3D;30分钟)文件的同步识别。
     * 此接口以POST方式一次性上传整个音频或从华为OBS中下载音频， 识别结果将在请求响应中即刻返回，用于语音文件极速转写，质检分析的离线场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeFlashAsrRequest 请求对象
     * @return SyncInvoker<RecognizeFlashAsrRequest, RecognizeFlashAsrResponse>
     */
    public SyncInvoker<RecognizeFlashAsrRequest, RecognizeFlashAsrResponse> recognizeFlashAsrInvoker(
        RecognizeFlashAsrRequest request) {
        return new SyncInvoker<RecognizeFlashAsrRequest, RecognizeFlashAsrResponse>(request, SisMeta.recognizeFlashAsr,
            hcClient);
    }

    /**
     * 一句话识别
     *
     * 一句话识别接口，用于短语音的同步识别。一次性上传整个音频，响应中即返回识别结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeShortAudioRequest 请求对象
     * @return RecognizeShortAudioResponse
     */
    public RecognizeShortAudioResponse recognizeShortAudio(RecognizeShortAudioRequest request) {
        return hcClient.syncInvokeHttp(request, SisMeta.recognizeShortAudio);
    }

    /**
     * 一句话识别
     *
     * 一句话识别接口，用于短语音的同步识别。一次性上传整个音频，响应中即返回识别结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeShortAudioRequest 请求对象
     * @return SyncInvoker<RecognizeShortAudioRequest, RecognizeShortAudioResponse>
     */
    public SyncInvoker<RecognizeShortAudioRequest, RecognizeShortAudioResponse> recognizeShortAudioInvoker(
        RecognizeShortAudioRequest request) {
        return new SyncInvoker<RecognizeShortAudioRequest, RecognizeShortAudioResponse>(request,
            SisMeta.recognizeShortAudio, hcClient);
    }

    /**
     * 语音评测
     *
     * 口语评测接口，基于一小段朗读语音和预期文本，评价朗读者发音质量。当前仅支持华北-北京四。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunAudioAssessmentRequest 请求对象
     * @return RunAudioAssessmentResponse
     */
    public RunAudioAssessmentResponse runAudioAssessment(RunAudioAssessmentRequest request) {
        return hcClient.syncInvokeHttp(request, SisMeta.runAudioAssessment);
    }

    /**
     * 语音评测
     *
     * 口语评测接口，基于一小段朗读语音和预期文本，评价朗读者发音质量。当前仅支持华北-北京四。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunAudioAssessmentRequest 请求对象
     * @return SyncInvoker<RunAudioAssessmentRequest, RunAudioAssessmentResponse>
     */
    public SyncInvoker<RunAudioAssessmentRequest, RunAudioAssessmentResponse> runAudioAssessmentInvoker(
        RunAudioAssessmentRequest request) {
        return new SyncInvoker<RunAudioAssessmentRequest, RunAudioAssessmentResponse>(request,
            SisMeta.runAudioAssessment, hcClient);
    }

    /**
     * 多模态评测
     *
     * 多模态评测接口，根据朗读视频数据、视频对应的音频数据和试题文本，综合给出朗读者口语的评测分数。当前仅支持华北-北京四。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunMultiModalAssessmentRequest 请求对象
     * @return RunMultiModalAssessmentResponse
     */
    public RunMultiModalAssessmentResponse runMultiModalAssessment(RunMultiModalAssessmentRequest request) {
        return hcClient.syncInvokeHttp(request, SisMeta.runMultiModalAssessment);
    }

    /**
     * 多模态评测
     *
     * 多模态评测接口，根据朗读视频数据、视频对应的音频数据和试题文本，综合给出朗读者口语的评测分数。当前仅支持华北-北京四。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunMultiModalAssessmentRequest 请求对象
     * @return SyncInvoker<RunMultiModalAssessmentRequest, RunMultiModalAssessmentResponse>
     */
    public SyncInvoker<RunMultiModalAssessmentRequest, RunMultiModalAssessmentResponse> runMultiModalAssessmentInvoker(
        RunMultiModalAssessmentRequest request) {
        return new SyncInvoker<RunMultiModalAssessmentRequest, RunMultiModalAssessmentResponse>(request,
            SisMeta.runMultiModalAssessment, hcClient);
    }

    /**
     * 语音合成
     *
     * 语音合成，是一种将文本转换成逼真语音的服务。用户通过实时访问和调用API获取语音合成结果，将用户输入的文字合成为音频。通过音色选择、自定义音量、语速，为企业和个人提供个性化的发音服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunTtsRequest 请求对象
     * @return RunTtsResponse
     */
    public RunTtsResponse runTts(RunTtsRequest request) {
        return hcClient.syncInvokeHttp(request, SisMeta.runTts);
    }

    /**
     * 语音合成
     *
     * 语音合成，是一种将文本转换成逼真语音的服务。用户通过实时访问和调用API获取语音合成结果，将用户输入的文字合成为音频。通过音色选择、自定义音量、语速，为企业和个人提供个性化的发音服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunTtsRequest 请求对象
     * @return SyncInvoker<RunTtsRequest, RunTtsResponse>
     */
    public SyncInvoker<RunTtsRequest, RunTtsResponse> runTtsInvoker(RunTtsRequest request) {
        return new SyncInvoker<RunTtsRequest, RunTtsResponse>(request, SisMeta.runTts, hcClient);
    }

    /**
     * 查询热词表列表
     *
     * 查询用户所有热词表列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVocabulariesRequest 请求对象
     * @return ShowVocabulariesResponse
     */
    public ShowVocabulariesResponse showVocabularies(ShowVocabulariesRequest request) {
        return hcClient.syncInvokeHttp(request, SisMeta.showVocabularies);
    }

    /**
     * 查询热词表列表
     *
     * 查询用户所有热词表列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVocabulariesRequest 请求对象
     * @return SyncInvoker<ShowVocabulariesRequest, ShowVocabulariesResponse>
     */
    public SyncInvoker<ShowVocabulariesRequest, ShowVocabulariesResponse> showVocabulariesInvoker(
        ShowVocabulariesRequest request) {
        return new SyncInvoker<ShowVocabulariesRequest, ShowVocabulariesResponse>(request, SisMeta.showVocabularies,
            hcClient);
    }

    /**
     * 查询热词表信息
     *
     * 通过热词表id查询热词表的信息和内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVocabularyRequest 请求对象
     * @return ShowVocabularyResponse
     */
    public ShowVocabularyResponse showVocabulary(ShowVocabularyRequest request) {
        return hcClient.syncInvokeHttp(request, SisMeta.showVocabulary);
    }

    /**
     * 查询热词表信息
     *
     * 通过热词表id查询热词表的信息和内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVocabularyRequest 请求对象
     * @return SyncInvoker<ShowVocabularyRequest, ShowVocabularyResponse>
     */
    public SyncInvoker<ShowVocabularyRequest, ShowVocabularyResponse> showVocabularyInvoker(
        ShowVocabularyRequest request) {
        return new SyncInvoker<ShowVocabularyRequest, ShowVocabularyResponse>(request, SisMeta.showVocabulary,
            hcClient);
    }

    /**
     * 更新热词表
     *
     * 更新一个热词表，更新成功返回id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVocabularyRequest 请求对象
     * @return UpdateVocabularyResponse
     */
    public UpdateVocabularyResponse updateVocabulary(UpdateVocabularyRequest request) {
        return hcClient.syncInvokeHttp(request, SisMeta.updateVocabulary);
    }

    /**
     * 更新热词表
     *
     * 更新一个热词表，更新成功返回id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVocabularyRequest 请求对象
     * @return SyncInvoker<UpdateVocabularyRequest, UpdateVocabularyResponse>
     */
    public SyncInvoker<UpdateVocabularyRequest, UpdateVocabularyResponse> updateVocabularyInvoker(
        UpdateVocabularyRequest request) {
        return new SyncInvoker<UpdateVocabularyRequest, UpdateVocabularyResponse>(request, SisMeta.updateVocabulary,
            hcClient);
    }

}
