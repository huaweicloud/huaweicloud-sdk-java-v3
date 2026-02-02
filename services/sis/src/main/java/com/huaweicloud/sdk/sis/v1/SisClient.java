package com.huaweicloud.sdk.sis.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.sis.v1.model.CollectTranscriberJobRequest;
import com.huaweicloud.sdk.sis.v1.model.CollectTranscriberJobResponse;
import com.huaweicloud.sdk.sis.v1.model.CreateVocabularyRequest;
import com.huaweicloud.sdk.sis.v1.model.CreateVocabularyResponse;
import com.huaweicloud.sdk.sis.v1.model.CreateVoiceRequest;
import com.huaweicloud.sdk.sis.v1.model.CreateVoiceResponse;
import com.huaweicloud.sdk.sis.v1.model.DeleteVocabularyRequest;
import com.huaweicloud.sdk.sis.v1.model.DeleteVocabularyResponse;
import com.huaweicloud.sdk.sis.v1.model.GenerateSpeechRequest;
import com.huaweicloud.sdk.sis.v1.model.GenerateSpeechResponse;
import com.huaweicloud.sdk.sis.v1.model.ListVoicesRequest;
import com.huaweicloud.sdk.sis.v1.model.ListVoicesResponse;
import com.huaweicloud.sdk.sis.v1.model.PushTranscriberJobsRequest;
import com.huaweicloud.sdk.sis.v1.model.PushTranscriberJobsResponse;
import com.huaweicloud.sdk.sis.v1.model.RecognizeFlashAsrRequest;
import com.huaweicloud.sdk.sis.v1.model.RecognizeFlashAsrResponse;
import com.huaweicloud.sdk.sis.v1.model.RecognizeShortAudioRequest;
import com.huaweicloud.sdk.sis.v1.model.RecognizeShortAudioResponse;
import com.huaweicloud.sdk.sis.v1.model.RunTtsRequest;
import com.huaweicloud.sdk.sis.v1.model.RunTtsResponse;
import com.huaweicloud.sdk.sis.v1.model.ShowVocabulariesRequest;
import com.huaweicloud.sdk.sis.v1.model.ShowVocabulariesResponse;
import com.huaweicloud.sdk.sis.v1.model.ShowVocabularyRequest;
import com.huaweicloud.sdk.sis.v1.model.ShowVocabularyResponse;
import com.huaweicloud.sdk.sis.v1.model.UpdateVocabularyRequest;
import com.huaweicloud.sdk.sis.v1.model.UpdateVocabularyResponse;

public class SisClient {

    protected HcClient hcClient;

    public SisClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SisClient> newBuilder() {
        ClientBuilder<SisClient> clientBuilder = new ClientBuilder<>(SisClient::new);
        return clientBuilder;
    }

    /**
     * 获取录音文件识别结果
     *
     * 该接口用于获取录音文件识别结果及识别状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectTranscriberJobRequest 请求对象
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
     * @param request CollectTranscriberJobRequest 请求对象
     * @return SyncInvoker<CollectTranscriberJobRequest, CollectTranscriberJobResponse>
     */
    public SyncInvoker<CollectTranscriberJobRequest, CollectTranscriberJobResponse> collectTranscriberJobInvoker(
        CollectTranscriberJobRequest request) {
        return new SyncInvoker<>(request, SisMeta.collectTranscriberJob, hcClient);
    }

    /**
     * 创建热词表
     *
     * 新建一个热词表，创建成功返回id。每个用户限制创建10个热词表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVocabularyRequest 请求对象
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
     * @param request CreateVocabularyRequest 请求对象
     * @return SyncInvoker<CreateVocabularyRequest, CreateVocabularyResponse>
     */
    public SyncInvoker<CreateVocabularyRequest, CreateVocabularyResponse> createVocabularyInvoker(
        CreateVocabularyRequest request) {
        return new SyncInvoker<>(request, SisMeta.createVocabulary, hcClient);
    }

    /**
     * 注册接口
     *
     * 客户上传一段录音，并指定voice_name，在系统中注册声音。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVoiceRequest 请求对象
     * @return CreateVoiceResponse
     */
    public CreateVoiceResponse createVoice(CreateVoiceRequest request) {
        return hcClient.syncInvokeHttp(request, SisMeta.createVoice);
    }

    /**
     * 注册接口
     *
     * 客户上传一段录音，并指定voice_name，在系统中注册声音。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVoiceRequest 请求对象
     * @return SyncInvoker<CreateVoiceRequest, CreateVoiceResponse>
     */
    public SyncInvoker<CreateVoiceRequest, CreateVoiceResponse> createVoiceInvoker(CreateVoiceRequest request) {
        return new SyncInvoker<>(request, SisMeta.createVoice, hcClient);
    }

    /**
     * 删除热词表
     *
     * 通过热词表id删除热词表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVocabularyRequest 请求对象
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
     * @param request DeleteVocabularyRequest 请求对象
     * @return SyncInvoker<DeleteVocabularyRequest, DeleteVocabularyResponse>
     */
    public SyncInvoker<DeleteVocabularyRequest, DeleteVocabularyResponse> deleteVocabularyInvoker(
        DeleteVocabularyRequest request) {
        return new SyncInvoker<>(request, SisMeta.deleteVocabulary, hcClient);
    }

    /**
     * 合成接口
     *
     * 用户指定一个声色名称，并指定对应的文本，合成对应的复刻的声音
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GenerateSpeechRequest 请求对象
     * @return GenerateSpeechResponse
     */
    public GenerateSpeechResponse generateSpeech(GenerateSpeechRequest request) {
        return hcClient.syncInvokeHttp(request, SisMeta.generateSpeech);
    }

    /**
     * 合成接口
     *
     * 用户指定一个声色名称，并指定对应的文本，合成对应的复刻的声音
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GenerateSpeechRequest 请求对象
     * @return SyncInvoker<GenerateSpeechRequest, GenerateSpeechResponse>
     */
    public SyncInvoker<GenerateSpeechRequest, GenerateSpeechResponse> generateSpeechInvoker(
        GenerateSpeechRequest request) {
        return new SyncInvoker<>(request, SisMeta.generateSpeech, hcClient);
    }

    /**
     * 查询接口
     *
     * 查询已注册的声音列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVoicesRequest 请求对象
     * @return ListVoicesResponse
     */
    public ListVoicesResponse listVoices(ListVoicesRequest request) {
        return hcClient.syncInvokeHttp(request, SisMeta.listVoices);
    }

    /**
     * 查询接口
     *
     * 查询已注册的声音列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVoicesRequest 请求对象
     * @return SyncInvoker<ListVoicesRequest, ListVoicesResponse>
     */
    public SyncInvoker<ListVoicesRequest, ListVoicesResponse> listVoicesInvoker(ListVoicesRequest request) {
        return new SyncInvoker<>(request, SisMeta.listVoices, hcClient);
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
     * @param request PushTranscriberJobsRequest 请求对象
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
     * @param request PushTranscriberJobsRequest 请求对象
     * @return SyncInvoker<PushTranscriberJobsRequest, PushTranscriberJobsResponse>
     */
    public SyncInvoker<PushTranscriberJobsRequest, PushTranscriberJobsResponse> pushTranscriberJobsInvoker(
        PushTranscriberJobsRequest request) {
        return new SyncInvoker<>(request, SisMeta.pushTranscriberJobs, hcClient);
    }

    /**
     * 录音文件识别极速版
     *
     * 极速版ASR(Restful API 接口, 适用于音频(文件大小&lt;&#x3D;100M,语音时长&lt;&#x3D;30分钟)文件的同步识别。
     * 此接口以POST方式一次性上传整个音频或从华为OBS中下载音频， 识别结果将在请求响应中即刻返回，用于语音文件极速转写，质检分析的离线场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RecognizeFlashAsrRequest 请求对象
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
     * @param request RecognizeFlashAsrRequest 请求对象
     * @return SyncInvoker<RecognizeFlashAsrRequest, RecognizeFlashAsrResponse>
     */
    public SyncInvoker<RecognizeFlashAsrRequest, RecognizeFlashAsrResponse> recognizeFlashAsrInvoker(
        RecognizeFlashAsrRequest request) {
        return new SyncInvoker<>(request, SisMeta.recognizeFlashAsr, hcClient);
    }

    /**
     * 一句话识别
     *
     * 一句话识别接口，用于短语音的同步识别。一次性上传整个音频，响应中即返回识别结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RecognizeShortAudioRequest 请求对象
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
     * @param request RecognizeShortAudioRequest 请求对象
     * @return SyncInvoker<RecognizeShortAudioRequest, RecognizeShortAudioResponse>
     */
    public SyncInvoker<RecognizeShortAudioRequest, RecognizeShortAudioResponse> recognizeShortAudioInvoker(
        RecognizeShortAudioRequest request) {
        return new SyncInvoker<>(request, SisMeta.recognizeShortAudio, hcClient);
    }

    /**
     * 语音合成
     *
     * 语音合成，是一种将文本转换成逼真语音的服务。用户通过实时访问和调用API获取语音合成结果，将用户输入的文字合成为音频。通过音色选择、自定义音量、语速，为企业和个人提供个性化的发音服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunTtsRequest 请求对象
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
     * @param request RunTtsRequest 请求对象
     * @return SyncInvoker<RunTtsRequest, RunTtsResponse>
     */
    public SyncInvoker<RunTtsRequest, RunTtsResponse> runTtsInvoker(RunTtsRequest request) {
        return new SyncInvoker<>(request, SisMeta.runTts, hcClient);
    }

    /**
     * 查询热词表列表
     *
     * 查询用户所有热词表列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVocabulariesRequest 请求对象
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
     * @param request ShowVocabulariesRequest 请求对象
     * @return SyncInvoker<ShowVocabulariesRequest, ShowVocabulariesResponse>
     */
    public SyncInvoker<ShowVocabulariesRequest, ShowVocabulariesResponse> showVocabulariesInvoker(
        ShowVocabulariesRequest request) {
        return new SyncInvoker<>(request, SisMeta.showVocabularies, hcClient);
    }

    /**
     * 查询热词表信息
     *
     * 通过热词表id查询热词表的信息和内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVocabularyRequest 请求对象
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
     * @param request ShowVocabularyRequest 请求对象
     * @return SyncInvoker<ShowVocabularyRequest, ShowVocabularyResponse>
     */
    public SyncInvoker<ShowVocabularyRequest, ShowVocabularyResponse> showVocabularyInvoker(
        ShowVocabularyRequest request) {
        return new SyncInvoker<>(request, SisMeta.showVocabulary, hcClient);
    }

    /**
     * 更新热词表
     *
     * 更新一个热词表，更新成功返回id。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVocabularyRequest 请求对象
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
     * @param request UpdateVocabularyRequest 请求对象
     * @return SyncInvoker<UpdateVocabularyRequest, UpdateVocabularyResponse>
     */
    public SyncInvoker<UpdateVocabularyRequest, UpdateVocabularyResponse> updateVocabularyInvoker(
        UpdateVocabularyRequest request) {
        return new SyncInvoker<>(request, SisMeta.updateVocabulary, hcClient);
    }

}
