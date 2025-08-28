package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 文本转语音任务合成记录。
 */
public class TtsJobDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "websocket_job_id")

    private String websocketJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tts_service_enum")

    private String ttsServiceEnum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_length")

    private Integer textLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_format")

    private String audioFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_timestamp")

    private Boolean needTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gen_srt")

    private Boolean genSrt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_state")

    private String jobState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_msg")

    private String failMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files")

    private List<TtsJobFile> files = null;

    public TtsJobDetail withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public TtsJobDetail withWebsocketJobId(String websocketJobId) {
        this.websocketJobId = websocketJobId;
        return this;
    }

    /**
     * websocket任务ID。
     * @return websocketJobId
     */
    public String getWebsocketJobId() {
        return websocketJobId;
    }

    public void setWebsocketJobId(String websocketJobId) {
        this.websocketJobId = websocketJobId;
    }

    public TtsJobDetail withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 音色ID
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public TtsJobDetail withTtsServiceEnum(String ttsServiceEnum) {
        this.ttsServiceEnum = ttsServiceEnum;
        return this;
    }

    /**
     * 声音版本
     * @return ttsServiceEnum
     */
    public String getTtsServiceEnum() {
        return ttsServiceEnum;
    }

    public void setTtsServiceEnum(String ttsServiceEnum) {
        this.ttsServiceEnum = ttsServiceEnum;
    }

    public TtsJobDetail withTextLength(Integer textLength) {
        this.textLength = textLength;
        return this;
    }

    /**
     * 文本长度
     * minimum: 1
     * maximum: 10000
     * @return textLength
     */
    public Integer getTextLength() {
        return textLength;
    }

    public void setTextLength(Integer textLength) {
        this.textLength = textLength;
    }

    public TtsJobDetail withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 任务创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public TtsJobDetail withAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }

    /**
     * 输出音频文件格式。默认WAV。 * WAV：wav格式。 * MP3：mp3格式。 * PCM：pcm格式。
     * @return audioFormat
     */
    public String getAudioFormat() {
        return audioFormat;
    }

    public void setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
    }

    public TtsJobDetail withNeedTimestamp(Boolean needTimestamp) {
        this.needTimestamp = needTimestamp;
        return this;
    }

    /**
     * 是否需要时间戳。false为不需要，true为需要返回时间戳信息。默认值为false。
     * @return needTimestamp
     */
    public Boolean getNeedTimestamp() {
        return needTimestamp;
    }

    public void setNeedTimestamp(Boolean needTimestamp) {
        this.needTimestamp = needTimestamp;
    }

    public TtsJobDetail withGenSrt(Boolean genSrt) {
        this.genSrt = genSrt;
        return this;
    }

    /**
     * 是否开启字幕
     * @return genSrt
     */
    public Boolean getGenSrt() {
        return genSrt;
    }

    public void setGenSrt(Boolean genSrt) {
        this.genSrt = genSrt;
    }

    public TtsJobDetail withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 任务类型。 * PRELOAD：预加载任务 * WEBSOCKET：websocket接口任务 * ASYNC_JOB：异步任务 * AUDITION：试听任务
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public TtsJobDetail withJobState(String jobState) {
        this.jobState = jobState;
        return this;
    }

    /**
     * 任务状态。 * WAITING：等待中 * PROCESSING：合成中 * FAILED：合成失败 * SUCCEED：合成成功
     * @return jobState
     */
    public String getJobState() {
        return jobState;
    }

    public void setJobState(String jobState) {
        this.jobState = jobState;
    }

    public TtsJobDetail withFailMsg(String failMsg) {
        this.failMsg = failMsg;
        return this;
    }

    /**
     * 任务合成错误信息
     * @return failMsg
     */
    public String getFailMsg() {
        return failMsg;
    }

    public void setFailMsg(String failMsg) {
        this.failMsg = failMsg;
    }

    public TtsJobDetail withFiles(List<TtsJobFile> files) {
        this.files = files;
        return this;
    }

    public TtsJobDetail addFilesItem(TtsJobFile filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    public TtsJobDetail withFiles(Consumer<List<TtsJobFile>> filesSetter) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        filesSetter.accept(this.files);
        return this;
    }

    /**
     * 任务合成文件列表。
     * @return files
     */
    public List<TtsJobFile> getFiles() {
        return files;
    }

    public void setFiles(List<TtsJobFile> files) {
        this.files = files;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TtsJobDetail that = (TtsJobDetail) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.websocketJobId, that.websocketJobId)
            && Objects.equals(this.assetId, that.assetId) && Objects.equals(this.ttsServiceEnum, that.ttsServiceEnum)
            && Objects.equals(this.textLength, that.textLength) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.audioFormat, that.audioFormat)
            && Objects.equals(this.needTimestamp, that.needTimestamp) && Objects.equals(this.genSrt, that.genSrt)
            && Objects.equals(this.jobType, that.jobType) && Objects.equals(this.jobState, that.jobState)
            && Objects.equals(this.failMsg, that.failMsg) && Objects.equals(this.files, that.files);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            websocketJobId,
            assetId,
            ttsServiceEnum,
            textLength,
            createTime,
            audioFormat,
            needTimestamp,
            genSrt,
            jobType,
            jobState,
            failMsg,
            files);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TtsJobDetail {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    websocketJobId: ").append(toIndentedString(websocketJobId)).append("\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    ttsServiceEnum: ").append(toIndentedString(ttsServiceEnum)).append("\n");
        sb.append("    textLength: ").append(toIndentedString(textLength)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    audioFormat: ").append(toIndentedString(audioFormat)).append("\n");
        sb.append("    needTimestamp: ").append(toIndentedString(needTimestamp)).append("\n");
        sb.append("    genSrt: ").append(toIndentedString(genSrt)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    jobState: ").append(toIndentedString(jobState)).append("\n");
        sb.append("    failMsg: ").append(toIndentedString(failMsg)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
