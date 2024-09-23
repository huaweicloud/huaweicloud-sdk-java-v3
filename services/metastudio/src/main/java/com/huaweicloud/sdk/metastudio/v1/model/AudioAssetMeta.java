package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 音频元数据，自动提取获得。
 */
public class AudioAssetMeta {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_codec")

    private String audioCodec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_bit_rate")

    private Integer audioBitRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_channels")

    private Integer audioChannels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample")

    private Integer sample;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_info")

    private ErrorResponse errorInfo;

    public AudioAssetMeta withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * **参数解释**： 时长,单位秒。 **约束限制**： 用户无需填写，系统自行提取。 **默认取值**： 不涉及
     * minimum: 0
     * maximum: 86400
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public AudioAssetMeta withAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
        return this;
    }

    /**
     * **参数解释**： 音频编码格式。 **约束限制**： 用户无需填写，系统自行提取。 **取值范围**： 字符长度0-32位。 **默认取值**： 不涉及
     * @return audioCodec
     */
    public String getAudioCodec() {
        return audioCodec;
    }

    public void setAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
    }

    public AudioAssetMeta withAudioBitRate(Integer audioBitRate) {
        this.audioBitRate = audioBitRate;
        return this;
    }

    /**
     * **参数解释**： 音频平均码率,单位kbps。 **约束限制**： 用户无需填写，系统自行提取。 **默认取值**： 不涉及
     * minimum: 0
     * maximum: 16384
     * @return audioBitRate
     */
    public Integer getAudioBitRate() {
        return audioBitRate;
    }

    public void setAudioBitRate(Integer audioBitRate) {
        this.audioBitRate = audioBitRate;
    }

    public AudioAssetMeta withAudioChannels(Integer audioChannels) {
        this.audioChannels = audioChannels;
        return this;
    }

    /**
     * **参数解释**： 音频声道数。 **约束限制**： 用户无需填写，系统自行提取。 **默认取值**： 不涉及
     * minimum: 0
     * maximum: 100
     * @return audioChannels
     */
    public Integer getAudioChannels() {
        return audioChannels;
    }

    public void setAudioChannels(Integer audioChannels) {
        this.audioChannels = audioChannels;
    }

    public AudioAssetMeta withSample(Integer sample) {
        this.sample = sample;
        return this;
    }

    /**
     * **参数解释**： 采样率,HZ。 **约束限制**： 用户无需填写，系统自行提取。 **默认取值**： 不涉及
     * minimum: 0
     * maximum: 100000
     * @return sample
     */
    public Integer getSample() {
        return sample;
    }

    public void setSample(Integer sample) {
        this.sample = sample;
    }

    public AudioAssetMeta withErrorInfo(ErrorResponse errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }

    public AudioAssetMeta withErrorInfo(Consumer<ErrorResponse> errorInfoSetter) {
        if (this.errorInfo == null) {
            this.errorInfo = new ErrorResponse();
            errorInfoSetter.accept(this.errorInfo);
        }

        return this;
    }

    /**
     * Get errorInfo
     * @return errorInfo
     */
    public ErrorResponse getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ErrorResponse errorInfo) {
        this.errorInfo = errorInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AudioAssetMeta that = (AudioAssetMeta) obj;
        return Objects.equals(this.duration, that.duration) && Objects.equals(this.audioCodec, that.audioCodec)
            && Objects.equals(this.audioBitRate, that.audioBitRate)
            && Objects.equals(this.audioChannels, that.audioChannels) && Objects.equals(this.sample, that.sample)
            && Objects.equals(this.errorInfo, that.errorInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration, audioCodec, audioBitRate, audioChannels, sample, errorInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudioAssetMeta {\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    audioCodec: ").append(toIndentedString(audioCodec)).append("\n");
        sb.append("    audioBitRate: ").append(toIndentedString(audioBitRate)).append("\n");
        sb.append("    audioChannels: ").append(toIndentedString(audioChannels)).append("\n");
        sb.append("    sample: ").append(toIndentedString(sample)).append("\n");
        sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
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
