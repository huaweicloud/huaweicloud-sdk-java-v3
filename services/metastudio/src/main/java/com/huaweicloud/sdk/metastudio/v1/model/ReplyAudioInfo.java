package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 回复音频信息
 */
public class ReplyAudioInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_url")

    private String audioUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_name")

    private String audioName;

    public ReplyAudioInfo withAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
        return this;
    }

    /**
     * 音频URL
     * @return audioUrl
     */
    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public ReplyAudioInfo withAudioName(String audioName) {
        this.audioName = audioName;
        return this;
    }

    /**
     * 音频名
     * @return audioName
     */
    public String getAudioName() {
        return audioName;
    }

    public void setAudioName(String audioName) {
        this.audioName = audioName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReplyAudioInfo that = (ReplyAudioInfo) obj;
        return Objects.equals(this.audioUrl, that.audioUrl) && Objects.equals(this.audioName, that.audioName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audioUrl, audioName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplyAudioInfo {\n");
        sb.append("    audioUrl: ").append(toIndentedString(audioUrl)).append("\n");
        sb.append("    audioName: ").append(toIndentedString(audioName)).append("\n");
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
