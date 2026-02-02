package com.huaweicloud.sdk.sis.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 语音合成配置信息。
 */
public class GenerateSpeechRequestBodyConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_format")

    private String audioFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample_rate")

    private String sampleRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_name")

    private String voiceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed")

    private Integer speed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pitch")

    private Integer pitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private Integer volume;

    public GenerateSpeechRequestBodyConfig withAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }

    /**
     * 语音格式头：wav、mp3、pcm。 默认：wav
     * @return audioFormat
     */
    public String getAudioFormat() {
        return audioFormat;
    }

    public void setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
    }

    public GenerateSpeechRequestBodyConfig withSampleRate(String sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }

    /**
     * 采样率：8kHz、16kHz、24kHz。 默认：24kHz
     * @return sampleRate
     */
    public String getSampleRate() {
        return sampleRate;
    }

    public void setSampleRate(String sampleRate) {
        this.sampleRate = sampleRate;
    }

    public GenerateSpeechRequestBodyConfig withVoiceName(String voiceName) {
        this.voiceName = voiceName;
        return this;
    }

    /**
     * 音色名称。
     * @return voiceName
     */
    public String getVoiceName() {
        return voiceName;
    }

    public void setVoiceName(String voiceName) {
        this.voiceName = voiceName;
    }

    public GenerateSpeechRequestBodyConfig withSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }

    /**
     * 语速：-500~500。 默认：0
     * @return speed
     */
    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public GenerateSpeechRequestBodyConfig withPitch(Integer pitch) {
        this.pitch = pitch;
        return this;
    }

    /**
     * 音高：-500~500。 默认：0
     * @return pitch
     */
    public Integer getPitch() {
        return pitch;
    }

    public void setPitch(Integer pitch) {
        this.pitch = pitch;
    }

    public GenerateSpeechRequestBodyConfig withVolume(Integer volume) {
        this.volume = volume;
        return this;
    }

    /**
     * 音量：0~100。 默认：50
     * @return volume
     */
    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GenerateSpeechRequestBodyConfig that = (GenerateSpeechRequestBodyConfig) obj;
        return Objects.equals(this.audioFormat, that.audioFormat) && Objects.equals(this.sampleRate, that.sampleRate)
            && Objects.equals(this.voiceName, that.voiceName) && Objects.equals(this.speed, that.speed)
            && Objects.equals(this.pitch, that.pitch) && Objects.equals(this.volume, that.volume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audioFormat, sampleRate, voiceName, speed, pitch, volume);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateSpeechRequestBodyConfig {\n");
        sb.append("    audioFormat: ").append(toIndentedString(audioFormat)).append("\n");
        sb.append("    sampleRate: ").append(toIndentedString(sampleRate)).append("\n");
        sb.append("    voiceName: ").append(toIndentedString(voiceName)).append("\n");
        sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
        sb.append("    pitch: ").append(toIndentedString(pitch)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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
