package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateFASReq
 */
public class CreateFASReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_file_download_url")

    private String audioFileDownloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frame_rate")

    private Integer frameRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "emotion")

    private Integer emotion;

    public CreateFASReq withAudioFileDownloadUrl(String audioFileDownloadUrl) {
        this.audioFileDownloadUrl = audioFileDownloadUrl;
        return this;
    }

    /**
     * 语音驱动音频文件下载URL，格式为AAC或者MP3
     * @return audioFileDownloadUrl
     */
    public String getAudioFileDownloadUrl() {
        return audioFileDownloadUrl;
    }

    public void setAudioFileDownloadUrl(String audioFileDownloadUrl) {
        this.audioFileDownloadUrl = audioFileDownloadUrl;
    }

    public CreateFASReq withFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
        return this;
    }

    /**
     * 期望的输出帧率
     * minimum: 15
     * maximum: 120
     * @return frameRate
     */
    public Integer getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
    }

    public CreateFASReq withEmotion(Integer emotion) {
        this.emotion = emotion;
        return this;
    }

    /**
     * 情绪： 0：平静（默认） 1：开心 2：哀伤 3：愤怒
     * minimum: 0
     * maximum: 3
     * @return emotion
     */
    public Integer getEmotion() {
        return emotion;
    }

    public void setEmotion(Integer emotion) {
        this.emotion = emotion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateFASReq that = (CreateFASReq) obj;
        return Objects.equals(this.audioFileDownloadUrl, that.audioFileDownloadUrl)
            && Objects.equals(this.frameRate, that.frameRate) && Objects.equals(this.emotion, that.emotion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audioFileDownloadUrl, frameRate, emotion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFASReq {\n");
        sb.append("    audioFileDownloadUrl: ").append(toIndentedString(audioFileDownloadUrl)).append("\n");
        sb.append("    frameRate: ").append(toIndentedString(frameRate)).append("\n");
        sb.append("    emotion: ").append(toIndentedString(emotion)).append("\n");
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
