package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * AudioInfo
 */
public class AudioInfo {

    /**
     * 音频采样率(有效值范围)<br/> AUDIO_SAMPLE_AUTO (default), AUDIO_SAMPLE_22050：22050Hz<br/> AUDIO_SAMPLE_32000：32000Hz<br/> AUDIO_SAMPLE_44100：44100Hz<br/> AUDIO_SAMPLE_48000：48000Hz<br/> AUDIO_SAMPLE_96000：96000Hz<br/> 
     */
    public static final class SampleRateEnum {

        /**
         * Enum AUDIO_SAMPLE_AUTO for value: "AUDIO_SAMPLE_AUTO"
         */
        public static final SampleRateEnum AUDIO_SAMPLE_AUTO = new SampleRateEnum("AUDIO_SAMPLE_AUTO");

        /**
         * Enum AUDIO_SAMPLE_22050 for value: "AUDIO_SAMPLE_22050"
         */
        public static final SampleRateEnum AUDIO_SAMPLE_22050 = new SampleRateEnum("AUDIO_SAMPLE_22050");

        /**
         * Enum AUDIO_SAMPLE_32000 for value: "AUDIO_SAMPLE_32000"
         */
        public static final SampleRateEnum AUDIO_SAMPLE_32000 = new SampleRateEnum("AUDIO_SAMPLE_32000");

        /**
         * Enum AUDIO_SAMPLE_44100 for value: "AUDIO_SAMPLE_44100"
         */
        public static final SampleRateEnum AUDIO_SAMPLE_44100 = new SampleRateEnum("AUDIO_SAMPLE_44100");

        /**
         * Enum AUDIO_SAMPLE_48000 for value: "AUDIO_SAMPLE_48000"
         */
        public static final SampleRateEnum AUDIO_SAMPLE_48000 = new SampleRateEnum("AUDIO_SAMPLE_48000");

        /**
         * Enum AUDIO_SAMPLE_96000 for value: "AUDIO_SAMPLE_96000"
         */
        public static final SampleRateEnum AUDIO_SAMPLE_96000 = new SampleRateEnum("AUDIO_SAMPLE_96000");

        private static final Map<String, SampleRateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SampleRateEnum> createStaticFields() {
            Map<String, SampleRateEnum> map = new HashMap<>();
            map.put("AUDIO_SAMPLE_AUTO", AUDIO_SAMPLE_AUTO);
            map.put("AUDIO_SAMPLE_22050", AUDIO_SAMPLE_22050);
            map.put("AUDIO_SAMPLE_32000", AUDIO_SAMPLE_32000);
            map.put("AUDIO_SAMPLE_44100", AUDIO_SAMPLE_44100);
            map.put("AUDIO_SAMPLE_48000", AUDIO_SAMPLE_48000);
            map.put("AUDIO_SAMPLE_96000", AUDIO_SAMPLE_96000);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SampleRateEnum(String value) {
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
        public static SampleRateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SampleRateEnum(value));
        }

        public static SampleRateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SampleRateEnum) {
                return this.value.equals(((SampleRateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample_rate")

    private SampleRateEnum sampleRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bitrate")

    private Integer bitrate;

    /**
     * 声道数(有效值范围)<br/> AUDIO_CHANNELS_1:单声道<br/> AUDIO_CHANNELS_2：双声道<br/> AUDIO_CHANNELS_5_1：5.1声道<br/> 
     */
    public static final class ChannelsEnum {

        /**
         * Enum AUDIO_CHANNELS_1 for value: "AUDIO_CHANNELS_1"
         */
        public static final ChannelsEnum AUDIO_CHANNELS_1 = new ChannelsEnum("AUDIO_CHANNELS_1");

        /**
         * Enum AUDIO_CHANNELS_2 for value: "AUDIO_CHANNELS_2"
         */
        public static final ChannelsEnum AUDIO_CHANNELS_2 = new ChannelsEnum("AUDIO_CHANNELS_2");

        /**
         * Enum AUDIO_CHANNELS_5_1 for value: "AUDIO_CHANNELS_5_1"
         */
        public static final ChannelsEnum AUDIO_CHANNELS_5_1 = new ChannelsEnum("AUDIO_CHANNELS_5_1");

        private static final Map<String, ChannelsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChannelsEnum> createStaticFields() {
            Map<String, ChannelsEnum> map = new HashMap<>();
            map.put("AUDIO_CHANNELS_1", AUDIO_CHANNELS_1);
            map.put("AUDIO_CHANNELS_2", AUDIO_CHANNELS_2);
            map.put("AUDIO_CHANNELS_5_1", AUDIO_CHANNELS_5_1);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChannelsEnum(String value) {
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
        public static ChannelsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChannelsEnum(value));
        }

        public static ChannelsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChannelsEnum) {
                return this.value.equals(((ChannelsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channels")

    private ChannelsEnum channels;

    public AudioInfo withSampleRate(SampleRateEnum sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }

    /**
     * 音频采样率(有效值范围)<br/> AUDIO_SAMPLE_AUTO (default), AUDIO_SAMPLE_22050：22050Hz<br/> AUDIO_SAMPLE_32000：32000Hz<br/> AUDIO_SAMPLE_44100：44100Hz<br/> AUDIO_SAMPLE_48000：48000Hz<br/> AUDIO_SAMPLE_96000：96000Hz<br/> 
     * @return sampleRate
     */
    public SampleRateEnum getSampleRate() {
        return sampleRate;
    }

    public void setSampleRate(SampleRateEnum sampleRate) {
        this.sampleRate = sampleRate;
    }

    public AudioInfo withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * 音频码率（单位：Kbps）<br/> 
     * @return bitrate
     */
    public Integer getBitrate() {
        return bitrate;
    }

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    public AudioInfo withChannels(ChannelsEnum channels) {
        this.channels = channels;
        return this;
    }

    /**
     * 声道数(有效值范围)<br/> AUDIO_CHANNELS_1:单声道<br/> AUDIO_CHANNELS_2：双声道<br/> AUDIO_CHANNELS_5_1：5.1声道<br/> 
     * @return channels
     */
    public ChannelsEnum getChannels() {
        return channels;
    }

    public void setChannels(ChannelsEnum channels) {
        this.channels = channels;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AudioInfo that = (AudioInfo) obj;
        return Objects.equals(this.sampleRate, that.sampleRate) && Objects.equals(this.bitrate, that.bitrate)
            && Objects.equals(this.channels, that.channels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sampleRate, bitrate, channels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudioInfo {\n");
        sb.append("    sampleRate: ").append(toIndentedString(sampleRate)).append("\n");
        sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
        sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
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
