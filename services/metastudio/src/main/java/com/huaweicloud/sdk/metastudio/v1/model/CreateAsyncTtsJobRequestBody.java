package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 文本转语音任务请求。
 */
public class CreateAsyncTtsJobRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text")

    private String text;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_asset_id")

    private String voiceAssetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed")

    private Integer speed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pitch")

    private Integer pitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private Integer volume;

    /**
     * 输出音频文件格式。默认WAV。 * WAV：wav格式。 * MP3：mp3格式。
     */
    public static final class AudioFormatEnum {

        /**
         * Enum WAV for value: "WAV"
         */
        public static final AudioFormatEnum WAV = new AudioFormatEnum("WAV");

        /**
         * Enum MP3 for value: "MP3"
         */
        public static final AudioFormatEnum MP3 = new AudioFormatEnum("MP3");

        private static final Map<String, AudioFormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AudioFormatEnum> createStaticFields() {
            Map<String, AudioFormatEnum> map = new HashMap<>();
            map.put("WAV", WAV);
            map.put("MP3", MP3);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AudioFormatEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AudioFormatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AudioFormatEnum(value));
        }

        public static AudioFormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AudioFormatEnum) {
                return this.value.equals(((AudioFormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_format")

    private AudioFormatEnum audioFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_timestamp")

    private Boolean needTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "silence_flag")

    private Boolean silenceFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "silence_time_ms")

    private Integer silenceTimeMs;

    public CreateAsyncTtsJobRequestBody withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * 待合成文本
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public CreateAsyncTtsJobRequestBody withVoiceAssetId(String voiceAssetId) {
        this.voiceAssetId = voiceAssetId;
        return this;
    }

    /**
     * 音色ID
     * @return voiceAssetId
     */
    public String getVoiceAssetId() {
        return voiceAssetId;
    }

    public void setVoiceAssetId(String voiceAssetId) {
        this.voiceAssetId = voiceAssetId;
    }

    public CreateAsyncTtsJobRequestBody withSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }

    /**
     * 语速。 默认值100，最小值50，最大值200。 > * 当取值为“100”时，表示一个成年人正常的语速，约为250字/分钟。 > * 50表示0.5倍语速，100表示正常语速，200表示2倍语速。
     * minimum: 50
     * maximum: 200
     * @return speed
     */
    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public CreateAsyncTtsJobRequestBody withPitch(Integer pitch) {
        this.pitch = pitch;
        return this;
    }

    /**
     * 音高。 默认值100，最小值50，最大值200。
     * minimum: 50
     * maximum: 200
     * @return pitch
     */
    public Integer getPitch() {
        return pitch;
    }

    public void setPitch(Integer pitch) {
        this.pitch = pitch;
    }

    public CreateAsyncTtsJobRequestBody withVolume(Integer volume) {
        this.volume = volume;
        return this;
    }

    /**
     * 音量。 默认值140，最小值90，最大值240。
     * minimum: 90
     * maximum: 240
     * @return volume
     */
    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public CreateAsyncTtsJobRequestBody withAudioFormat(AudioFormatEnum audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }

    /**
     * 输出音频文件格式。默认WAV。 * WAV：wav格式。 * MP3：mp3格式。
     * @return audioFormat
     */
    public AudioFormatEnum getAudioFormat() {
        return audioFormat;
    }

    public void setAudioFormat(AudioFormatEnum audioFormat) {
        this.audioFormat = audioFormat;
    }

    public CreateAsyncTtsJobRequestBody withNeedTimestamp(Boolean needTimestamp) {
        this.needTimestamp = needTimestamp;
        return this;
    }

    /**
     * 是否需要时间戳 false不需要；true：需要返回时间戳信息；默认false
     * @return needTimestamp
     */
    public Boolean getNeedTimestamp() {
        return needTimestamp;
    }

    public void setNeedTimestamp(Boolean needTimestamp) {
        this.needTimestamp = needTimestamp;
    }

    public CreateAsyncTtsJobRequestBody withSilenceFlag(Boolean silenceFlag) {
        this.silenceFlag = silenceFlag;
        return this;
    }

    /**
     * 异常时是否返回静默音频流
     * @return silenceFlag
     */
    public Boolean getSilenceFlag() {
        return silenceFlag;
    }

    public void setSilenceFlag(Boolean silenceFlag) {
        this.silenceFlag = silenceFlag;
    }

    public CreateAsyncTtsJobRequestBody withSilenceTimeMs(Integer silenceTimeMs) {
        this.silenceTimeMs = silenceTimeMs;
        return this;
    }

    /**
     * 异常时返回的静默音频流时长,单位毫秒
     * minimum: 0
     * maximum: 5000
     * @return silenceTimeMs
     */
    public Integer getSilenceTimeMs() {
        return silenceTimeMs;
    }

    public void setSilenceTimeMs(Integer silenceTimeMs) {
        this.silenceTimeMs = silenceTimeMs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAsyncTtsJobRequestBody that = (CreateAsyncTtsJobRequestBody) obj;
        return Objects.equals(this.text, that.text) && Objects.equals(this.voiceAssetId, that.voiceAssetId)
            && Objects.equals(this.speed, that.speed) && Objects.equals(this.pitch, that.pitch)
            && Objects.equals(this.volume, that.volume) && Objects.equals(this.audioFormat, that.audioFormat)
            && Objects.equals(this.needTimestamp, that.needTimestamp)
            && Objects.equals(this.silenceFlag, that.silenceFlag)
            && Objects.equals(this.silenceTimeMs, that.silenceTimeMs);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(text, voiceAssetId, speed, pitch, volume, audioFormat, needTimestamp, silenceFlag, silenceTimeMs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAsyncTtsJobRequestBody {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    voiceAssetId: ").append(toIndentedString(voiceAssetId)).append("\n");
        sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
        sb.append("    pitch: ").append(toIndentedString(pitch)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    audioFormat: ").append(toIndentedString(audioFormat)).append("\n");
        sb.append("    needTimestamp: ").append(toIndentedString(needTimestamp)).append("\n");
        sb.append("    silenceFlag: ").append(toIndentedString(silenceFlag)).append("\n");
        sb.append("    silenceTimeMs: ").append(toIndentedString(silenceTimeMs)).append("\n");
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
