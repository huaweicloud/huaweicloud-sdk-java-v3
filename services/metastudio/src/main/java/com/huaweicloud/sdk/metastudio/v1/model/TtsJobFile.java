package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TtsJobFile
 */
public class TtsJobFile {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_file_url")

    private String audioFileUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_info_file_url")

    private String audioInfoFileUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_srt_file_url")

    private String audioSrtFileUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_action_file_url")

    private String audioActionFileUrl;

    public TtsJobFile withAudioFileUrl(String audioFileUrl) {
        this.audioFileUrl = audioFileUrl;
        return this;
    }

    /**
     * 音频文件下载链接，有效期为1个小时。
     * @return audioFileUrl
     */
    public String getAudioFileUrl() {
        return audioFileUrl;
    }

    public void setAudioFileUrl(String audioFileUrl) {
        this.audioFileUrl = audioFileUrl;
    }

    public TtsJobFile withAudioInfoFileUrl(String audioInfoFileUrl) {
        this.audioInfoFileUrl = audioInfoFileUrl;
        return this;
    }

    /**
     * 时间戳文件下载链接，有效期为1个小时。
     * @return audioInfoFileUrl
     */
    public String getAudioInfoFileUrl() {
        return audioInfoFileUrl;
    }

    public void setAudioInfoFileUrl(String audioInfoFileUrl) {
        this.audioInfoFileUrl = audioInfoFileUrl;
    }

    public TtsJobFile withAudioSrtFileUrl(String audioSrtFileUrl) {
        this.audioSrtFileUrl = audioSrtFileUrl;
        return this;
    }

    /**
     * 字幕文件下载链接，有效期为1个小时。
     * @return audioSrtFileUrl
     */
    public String getAudioSrtFileUrl() {
        return audioSrtFileUrl;
    }

    public void setAudioSrtFileUrl(String audioSrtFileUrl) {
        this.audioSrtFileUrl = audioSrtFileUrl;
    }

    public TtsJobFile withAudioActionFileUrl(String audioActionFileUrl) {
        this.audioActionFileUrl = audioActionFileUrl;
        return this;
    }

    /**
     * 动作分析文件下载链接，有效期为1个小时。
     * @return audioActionFileUrl
     */
    public String getAudioActionFileUrl() {
        return audioActionFileUrl;
    }

    public void setAudioActionFileUrl(String audioActionFileUrl) {
        this.audioActionFileUrl = audioActionFileUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TtsJobFile that = (TtsJobFile) obj;
        return Objects.equals(this.audioFileUrl, that.audioFileUrl)
            && Objects.equals(this.audioInfoFileUrl, that.audioInfoFileUrl)
            && Objects.equals(this.audioSrtFileUrl, that.audioSrtFileUrl)
            && Objects.equals(this.audioActionFileUrl, that.audioActionFileUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audioFileUrl, audioInfoFileUrl, audioSrtFileUrl, audioActionFileUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TtsJobFile {\n");
        sb.append("    audioFileUrl: ").append(toIndentedString(audioFileUrl)).append("\n");
        sb.append("    audioInfoFileUrl: ").append(toIndentedString(audioInfoFileUrl)).append("\n");
        sb.append("    audioSrtFileUrl: ").append(toIndentedString(audioSrtFileUrl)).append("\n");
        sb.append("    audioActionFileUrl: ").append(toIndentedString(audioActionFileUrl)).append("\n");
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
