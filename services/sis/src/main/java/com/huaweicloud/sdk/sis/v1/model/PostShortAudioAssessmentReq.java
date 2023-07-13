package com.huaweicloud.sdk.sis.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class PostShortAudioAssessmentReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private AudioConfig config;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_data")

    private String audioData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref_text")

    private String refText;

    public PostShortAudioAssessmentReq withConfig(AudioConfig config) {
        this.config = config;
        return this;
    }

    public PostShortAudioAssessmentReq withConfig(Consumer<AudioConfig> configSetter) {
        if (this.config == null) {
            this.config = new AudioConfig();
            configSetter.accept(this.config);
        }

        return this;
    }

    /**
     * Get config
     * @return config
     */
    public AudioConfig getConfig() {
        return config;
    }

    public void setConfig(AudioConfig config) {
        this.config = config;
    }

    public PostShortAudioAssessmentReq withAudioData(String audioData) {
        this.audioData = audioData;
        return this;
    }

    /**
     * 语音数据，Base64编码，要求Base64编码后大小不超过1M。  注意评测接口使用次数定义为：每8秒的音频作为一次，不足8秒按一次计算。例如传入4秒或8秒的音频，都算作使用一次，传入9秒的音频则视为调用2次。
     * @return audioData
     */
    public String getAudioData() {
        return audioData;
    }

    public void setAudioData(String audioData) {
        this.audioData = audioData;
    }

    public PostShortAudioAssessmentReq withRefText(String refText) {
        this.refText = refText;
        return this;
    }

    /**
     * 评测文本
     * @return refText
     */
    public String getRefText() {
        return refText;
    }

    public void setRefText(String refText) {
        this.refText = refText;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PostShortAudioAssessmentReq that = (PostShortAudioAssessmentReq) obj;
        return Objects.equals(this.config, that.config) && Objects.equals(this.audioData, that.audioData)
            && Objects.equals(this.refText, that.refText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(config, audioData, refText);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostShortAudioAssessmentReq {\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    audioData: ").append(toIndentedString(audioData)).append("\n");
        sb.append("    refText: ").append(toIndentedString(refText)).append("\n");
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
