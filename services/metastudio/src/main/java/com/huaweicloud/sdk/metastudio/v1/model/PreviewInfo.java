package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PreviewInfo
 */
public class PreviewInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_sha256")

    private String textSha256;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_file_download_url")

    private String audioFileDownloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_file_download_url")

    private String actionFileDownloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_duration")

    private Float audioDuration;

    public PreviewInfo withTextSha256(String textSha256) {
        this.textSha256 = textSha256;
        return this;
    }

    /**
     * 文本内容hash值
     * @return textSha256
     */
    public String getTextSha256() {
        return textSha256;
    }

    public void setTextSha256(String textSha256) {
        this.textSha256 = textSha256;
    }

    public PreviewInfo withAudioFileDownloadUrl(String audioFileDownloadUrl) {
        this.audioFileDownloadUrl = audioFileDownloadUrl;
        return this;
    }

    /**
     * 文本对应音频文件下载链接
     * @return audioFileDownloadUrl
     */
    public String getAudioFileDownloadUrl() {
        return audioFileDownloadUrl;
    }

    public void setAudioFileDownloadUrl(String audioFileDownloadUrl) {
        this.audioFileDownloadUrl = audioFileDownloadUrl;
    }

    public PreviewInfo withActionFileDownloadUrl(String actionFileDownloadUrl) {
        this.actionFileDownloadUrl = actionFileDownloadUrl;
        return this;
    }

    /**
     * 动作编排列表文件下载链接
     * @return actionFileDownloadUrl
     */
    public String getActionFileDownloadUrl() {
        return actionFileDownloadUrl;
    }

    public void setActionFileDownloadUrl(String actionFileDownloadUrl) {
        this.actionFileDownloadUrl = actionFileDownloadUrl;
    }

    public PreviewInfo withAudioDuration(Float audioDuration) {
        this.audioDuration = audioDuration;
        return this;
    }

    /**
     * 音频时长，单位秒。
     * minimum: 0
     * maximum: 3.6E+4
     * @return audioDuration
     */
    public Float getAudioDuration() {
        return audioDuration;
    }

    public void setAudioDuration(Float audioDuration) {
        this.audioDuration = audioDuration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreviewInfo that = (PreviewInfo) obj;
        return Objects.equals(this.textSha256, that.textSha256)
            && Objects.equals(this.audioFileDownloadUrl, that.audioFileDownloadUrl)
            && Objects.equals(this.actionFileDownloadUrl, that.actionFileDownloadUrl)
            && Objects.equals(this.audioDuration, that.audioDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(textSha256, audioFileDownloadUrl, actionFileDownloadUrl, audioDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreviewInfo {\n");
        sb.append("    textSha256: ").append(toIndentedString(textSha256)).append("\n");
        sb.append("    audioFileDownloadUrl: ").append(toIndentedString(audioFileDownloadUrl)).append("\n");
        sb.append("    actionFileDownloadUrl: ").append(toIndentedString(actionFileDownloadUrl)).append("\n");
        sb.append("    audioDuration: ").append(toIndentedString(audioDuration)).append("\n");
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
