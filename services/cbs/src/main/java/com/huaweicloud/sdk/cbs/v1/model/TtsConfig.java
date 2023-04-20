package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 语音合成配置 - 目前可用tts资源尚未确定，校验待定，测试可以先不测后端接口校验
 */
public class TtsConfig  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="property")
    

    private String property;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="speed")
    

    private Integer speed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume")
    

    private Integer volume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="delay")
    

    private Float delay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pitch")
    

    private String pitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="audio_format")
    

    private String audioFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sample_rate")
    

    private String sampleRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tts_source")
    

    private Integer ttsSource;

    public TtsConfig withProperty(String property) {
        this.property = property;
        return this;
    }

    


    /**
     * 用于设置音色
     * @return property
     */
    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    

    public TtsConfig withSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }

    


    /**
     * 用户设置音速
     * @return speed
     */
    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    

    public TtsConfig withVolume(Integer volume) {
        this.volume = volume;
        return this;
    }

    


    /**
     * 用于设置音量
     * @return volume
     */
    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    

    public TtsConfig withDelay(Float delay) {
        this.delay = delay;
        return this;
    }

    


    /**
     * 段首停顿时间。 范围：0~60； 单位：秒 默认：0
     * @return delay
     */
    public Float getDelay() {
        return delay;
    }

    public void setDelay(Float delay) {
        this.delay = delay;
    }

    

    public TtsConfig withPitch(String pitch) {
        this.pitch = pitch;
        return this;
    }

    


    /**
     * 音高。 取值范围： -500~500 默认值：0
     * @return pitch
     */
    public String getPitch() {
        return pitch;
    }

    public void setPitch(String pitch) {
        this.pitch = pitch;
    }

    

    public TtsConfig withAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }

    


    /**
     * 语音格式头：wav、mp3、pcm 默认：wav
     * @return audioFormat
     */
    public String getAudioFormat() {
        return audioFormat;
    }

    public void setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
    }

    

    public TtsConfig withSampleRate(String sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }

    


    /**
     * 采样率：16000、8000 默认：8000
     * @return sampleRate
     */
    public String getSampleRate() {
        return sampleRate;
    }

    public void setSampleRate(String sampleRate) {
        this.sampleRate = sampleRate;
    }

    

    public TtsConfig withTtsSource(Integer ttsSource) {
        this.ttsSource = ttsSource;
        return this;
    }

    


    /**
     * tts来源： 0：huawei 1：ali 2：用户克隆声音 默认：0
     * @return ttsSource
     */
    public Integer getTtsSource() {
        return ttsSource;
    }

    public void setTtsSource(Integer ttsSource) {
        this.ttsSource = ttsSource;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TtsConfig ttsConfig = (TtsConfig) o;
        return Objects.equals(this.property, ttsConfig.property) &&
            Objects.equals(this.speed, ttsConfig.speed) &&
            Objects.equals(this.volume, ttsConfig.volume) &&
            Objects.equals(this.delay, ttsConfig.delay) &&
            Objects.equals(this.pitch, ttsConfig.pitch) &&
            Objects.equals(this.audioFormat, ttsConfig.audioFormat) &&
            Objects.equals(this.sampleRate, ttsConfig.sampleRate) &&
            Objects.equals(this.ttsSource, ttsConfig.ttsSource);
    }
    @Override
    public int hashCode() {
        return Objects.hash(property, speed, volume, delay, pitch, audioFormat, sampleRate, ttsSource);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TtsConfig {\n");
        sb.append("    property: ").append(toIndentedString(property)).append("\n");
        sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
        sb.append("    pitch: ").append(toIndentedString(pitch)).append("\n");
        sb.append("    audioFormat: ").append(toIndentedString(audioFormat)).append("\n");
        sb.append("    sampleRate: ").append(toIndentedString(sampleRate)).append("\n");
        sb.append("    ttsSource: ").append(toIndentedString(ttsSource)).append("\n");
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

