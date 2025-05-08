package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 文本转语音任务请求。
 */
public class CreateAsyncTtsJobRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text")

    private String text;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tts_text")

    private String ttsText;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback_config")

    private TtsCallBackConfig callbackConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gen_srt")

    private Boolean genSrt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "srt_len")

    private Long srtLen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "srt_line_limit")

    private Integer srtLineLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slice_segments")

    private Boolean sliceSegments;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channels")

    private Integer channels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_external_url")

    private String outputExternalUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "srt_output_external_url")

    private String srtOutputExternalUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_output_external_url")

    private String actionOutputExternalUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_vocabulary_config_enable")

    private Boolean isVocabularyConfigEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_concurrent_resource")

    private Boolean isConcurrentResource;

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

    public CreateAsyncTtsJobRequestBody withTtsText(String ttsText) {
        this.ttsText = ttsText;
        return this;
    }

    /**
     * 发送给tts的待合成文本
     * @return ttsText
     */
    public String getTtsText() {
        return ttsText;
    }

    public void setTtsText(String ttsText) {
        this.ttsText = ttsText;
    }

    public CreateAsyncTtsJobRequestBody withVoiceAssetId(String voiceAssetId) {
        this.voiceAssetId = voiceAssetId;
        return this;
    }

    /**
     * 音色ID，获取方式详见[获取音色ID](metastudio_02_0054.xml)。
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
     * 语速。 * 当取值为“100”时，表示一个成年人正常的语速，约为250字/分钟。 * 50表示0.5倍语速，100表示正常语速，200表示2倍语速。
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
     * 音高。
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
     * 音量。
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
     * 是否需要时间戳。false为不需要，true为需要返回时间戳信息。默认值为false。
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
     * 异常时返回的静默音频流时长，单位毫秒。
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

    public CreateAsyncTtsJobRequestBody withCallbackConfig(TtsCallBackConfig callbackConfig) {
        this.callbackConfig = callbackConfig;
        return this;
    }

    public CreateAsyncTtsJobRequestBody withCallbackConfig(Consumer<TtsCallBackConfig> callbackConfigSetter) {
        if (this.callbackConfig == null) {
            this.callbackConfig = new TtsCallBackConfig();
            callbackConfigSetter.accept(this.callbackConfig);
        }

        return this;
    }

    /**
     * Get callbackConfig
     * @return callbackConfig
     */
    public TtsCallBackConfig getCallbackConfig() {
        return callbackConfig;
    }

    public void setCallbackConfig(TtsCallBackConfig callbackConfig) {
        this.callbackConfig = callbackConfig;
    }

    public CreateAsyncTtsJobRequestBody withGenSrt(Boolean genSrt) {
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

    public CreateAsyncTtsJobRequestBody withSrtLen(Long srtLen) {
        this.srtLen = srtLen;
        return this;
    }

    /**
     * 字幕最大长度限制
     * minimum: 0
     * maximum: 10000
     * @return srtLen
     */
    public Long getSrtLen() {
        return srtLen;
    }

    public void setSrtLen(Long srtLen) {
        this.srtLen = srtLen;
    }

    public CreateAsyncTtsJobRequestBody withSrtLineLimit(Integer srtLineLimit) {
        this.srtLineLimit = srtLineLimit;
        return this;
    }

    /**
     * 字幕行数限制，默认为1
     * minimum: 0
     * maximum: 5000
     * @return srtLineLimit
     */
    public Integer getSrtLineLimit() {
        return srtLineLimit;
    }

    public void setSrtLineLimit(Integer srtLineLimit) {
        this.srtLineLimit = srtLineLimit;
    }

    public CreateAsyncTtsJobRequestBody withSliceSegments(Boolean sliceSegments) {
        this.sliceSegments = sliceSegments;
        return this;
    }

    /**
     * 是否对文本进行分段
     * @return sliceSegments
     */
    public Boolean getSliceSegments() {
        return sliceSegments;
    }

    public void setSliceSegments(Boolean sliceSegments) {
        this.sliceSegments = sliceSegments;
    }

    public CreateAsyncTtsJobRequestBody withChannels(Integer channels) {
        this.channels = channels;
        return this;
    }

    /**
     * 声道。（单声道|双声道） 默认值1，最小值1，最大值2。
     * minimum: 1
     * maximum: 2
     * @return channels
     */
    public Integer getChannels() {
        return channels;
    }

    public void setChannels(Integer channels) {
        this.channels = channels;
    }

    public CreateAsyncTtsJobRequestBody withOutputExternalUrl(String outputExternalUrl) {
        this.outputExternalUrl = outputExternalUrl;
        return this;
    }

    /**
     * 音频文件上传的外部URL > * 需要先申请开通白名单， 才允许将音频等文件上传到外部URL。
     * @return outputExternalUrl
     */
    public String getOutputExternalUrl() {
        return outputExternalUrl;
    }

    public void setOutputExternalUrl(String outputExternalUrl) {
        this.outputExternalUrl = outputExternalUrl;
    }

    public CreateAsyncTtsJobRequestBody withSrtOutputExternalUrl(String srtOutputExternalUrl) {
        this.srtOutputExternalUrl = srtOutputExternalUrl;
        return this;
    }

    /**
     * 字幕文件上传的外部URL > * 需要先申请开通白名单， 才允许将字幕等文件上传到外部URL。
     * @return srtOutputExternalUrl
     */
    public String getSrtOutputExternalUrl() {
        return srtOutputExternalUrl;
    }

    public void setSrtOutputExternalUrl(String srtOutputExternalUrl) {
        this.srtOutputExternalUrl = srtOutputExternalUrl;
    }

    public CreateAsyncTtsJobRequestBody withActionOutputExternalUrl(String actionOutputExternalUrl) {
        this.actionOutputExternalUrl = actionOutputExternalUrl;
        return this;
    }

    /**
     * 动作信息文件上传的外部URL > * 需要先申请开通白名单， 才允许将时间戳等文件上传到外部URL。
     * @return actionOutputExternalUrl
     */
    public String getActionOutputExternalUrl() {
        return actionOutputExternalUrl;
    }

    public void setActionOutputExternalUrl(String actionOutputExternalUrl) {
        this.actionOutputExternalUrl = actionOutputExternalUrl;
    }

    public CreateAsyncTtsJobRequestBody withIsVocabularyConfigEnable(Boolean isVocabularyConfigEnable) {
        this.isVocabularyConfigEnable = isVocabularyConfigEnable;
        return this;
    }

    /**
     * 是否应用当前租户的读法配置
     * @return isVocabularyConfigEnable
     */
    public Boolean getIsVocabularyConfigEnable() {
        return isVocabularyConfigEnable;
    }

    public void setIsVocabularyConfigEnable(Boolean isVocabularyConfigEnable) {
        this.isVocabularyConfigEnable = isVocabularyConfigEnable;
    }

    public CreateAsyncTtsJobRequestBody withIsConcurrentResource(Boolean isConcurrentResource) {
        this.isConcurrentResource = isConcurrentResource;
        return this;
    }

    /**
     * 是否使用包周期路数资源进行计费
     * @return isConcurrentResource
     */
    public Boolean getIsConcurrentResource() {
        return isConcurrentResource;
    }

    public void setIsConcurrentResource(Boolean isConcurrentResource) {
        this.isConcurrentResource = isConcurrentResource;
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
        return Objects.equals(this.text, that.text) && Objects.equals(this.ttsText, that.ttsText)
            && Objects.equals(this.voiceAssetId, that.voiceAssetId) && Objects.equals(this.speed, that.speed)
            && Objects.equals(this.pitch, that.pitch) && Objects.equals(this.volume, that.volume)
            && Objects.equals(this.audioFormat, that.audioFormat)
            && Objects.equals(this.needTimestamp, that.needTimestamp)
            && Objects.equals(this.silenceFlag, that.silenceFlag)
            && Objects.equals(this.silenceTimeMs, that.silenceTimeMs)
            && Objects.equals(this.callbackConfig, that.callbackConfig) && Objects.equals(this.genSrt, that.genSrt)
            && Objects.equals(this.srtLen, that.srtLen) && Objects.equals(this.srtLineLimit, that.srtLineLimit)
            && Objects.equals(this.sliceSegments, that.sliceSegments) && Objects.equals(this.channels, that.channels)
            && Objects.equals(this.outputExternalUrl, that.outputExternalUrl)
            && Objects.equals(this.srtOutputExternalUrl, that.srtOutputExternalUrl)
            && Objects.equals(this.actionOutputExternalUrl, that.actionOutputExternalUrl)
            && Objects.equals(this.isVocabularyConfigEnable, that.isVocabularyConfigEnable)
            && Objects.equals(this.isConcurrentResource, that.isConcurrentResource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text,
            ttsText,
            voiceAssetId,
            speed,
            pitch,
            volume,
            audioFormat,
            needTimestamp,
            silenceFlag,
            silenceTimeMs,
            callbackConfig,
            genSrt,
            srtLen,
            srtLineLimit,
            sliceSegments,
            channels,
            outputExternalUrl,
            srtOutputExternalUrl,
            actionOutputExternalUrl,
            isVocabularyConfigEnable,
            isConcurrentResource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAsyncTtsJobRequestBody {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    ttsText: ").append(toIndentedString(ttsText)).append("\n");
        sb.append("    voiceAssetId: ").append(toIndentedString(voiceAssetId)).append("\n");
        sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
        sb.append("    pitch: ").append(toIndentedString(pitch)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    audioFormat: ").append(toIndentedString(audioFormat)).append("\n");
        sb.append("    needTimestamp: ").append(toIndentedString(needTimestamp)).append("\n");
        sb.append("    silenceFlag: ").append(toIndentedString(silenceFlag)).append("\n");
        sb.append("    silenceTimeMs: ").append(toIndentedString(silenceTimeMs)).append("\n");
        sb.append("    callbackConfig: ").append(toIndentedString(callbackConfig)).append("\n");
        sb.append("    genSrt: ").append(toIndentedString(genSrt)).append("\n");
        sb.append("    srtLen: ").append(toIndentedString(srtLen)).append("\n");
        sb.append("    srtLineLimit: ").append(toIndentedString(srtLineLimit)).append("\n");
        sb.append("    sliceSegments: ").append(toIndentedString(sliceSegments)).append("\n");
        sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
        sb.append("    outputExternalUrl: ").append(toIndentedString(outputExternalUrl)).append("\n");
        sb.append("    srtOutputExternalUrl: ").append(toIndentedString(srtOutputExternalUrl)).append("\n");
        sb.append("    actionOutputExternalUrl: ").append(toIndentedString(actionOutputExternalUrl)).append("\n");
        sb.append("    isVocabularyConfigEnable: ").append(toIndentedString(isVocabularyConfigEnable)).append("\n");
        sb.append("    isConcurrentResource: ").append(toIndentedString(isConcurrentResource)).append("\n");
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
