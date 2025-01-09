package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 音频。
 */
public class PoliciesAudio {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_redirection_enable")

    private Boolean audioRedirectionEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_volume")

    private String playVolume;

    /**
     * 播音设置音量线性系数。取值为： 不设置：Do Not Set Volume Ratio。 低：Low。 中：Middle。 高：High。
     */
    public static final class PlayVolumeRatioEnum {

        /**
         * Enum DO_NOT_SET_VOLUME_RATIO for value: "Do Not Set Volume Ratio"
         */
        public static final PlayVolumeRatioEnum DO_NOT_SET_VOLUME_RATIO =
            new PlayVolumeRatioEnum("Do Not Set Volume Ratio");

        /**
         * Enum LOW for value: "Low"
         */
        public static final PlayVolumeRatioEnum LOW = new PlayVolumeRatioEnum("Low");

        /**
         * Enum MIDDLE for value: "Middle"
         */
        public static final PlayVolumeRatioEnum MIDDLE = new PlayVolumeRatioEnum("Middle");

        /**
         * Enum HIGH for value: "High"
         */
        public static final PlayVolumeRatioEnum HIGH = new PlayVolumeRatioEnum("High");

        private static final Map<String, PlayVolumeRatioEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PlayVolumeRatioEnum> createStaticFields() {
            Map<String, PlayVolumeRatioEnum> map = new HashMap<>();
            map.put("Do Not Set Volume Ratio", DO_NOT_SET_VOLUME_RATIO);
            map.put("Low", LOW);
            map.put("Middle", MIDDLE);
            map.put("High", HIGH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PlayVolumeRatioEnum(String value) {
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
        public static PlayVolumeRatioEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PlayVolumeRatioEnum(value));
        }

        public static PlayVolumeRatioEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PlayVolumeRatioEnum) {
                return this.value.equals(((PlayVolumeRatioEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_volume_ratio")

    private PlayVolumeRatioEnum playVolumeRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_volume")

    private String recordVolume;

    /**
     * 录音设置音量线性系数。取值为： 不设置：Do Not Set Volume Ratio。 低：Low。 中：Middle。 高：High。
     */
    public static final class RecordVolumeRatioEnum {

        /**
         * Enum DO_NOT_SET_VOLUME_RATIO for value: "Do Not Set Volume Ratio"
         */
        public static final RecordVolumeRatioEnum DO_NOT_SET_VOLUME_RATIO =
            new RecordVolumeRatioEnum("Do Not Set Volume Ratio");

        /**
         * Enum LOW for value: "Low"
         */
        public static final RecordVolumeRatioEnum LOW = new RecordVolumeRatioEnum("Low");

        /**
         * Enum MIDDLE for value: "Middle"
         */
        public static final RecordVolumeRatioEnum MIDDLE = new RecordVolumeRatioEnum("Middle");

        /**
         * Enum HIGH for value: "High"
         */
        public static final RecordVolumeRatioEnum HIGH = new RecordVolumeRatioEnum("High");

        private static final Map<String, RecordVolumeRatioEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RecordVolumeRatioEnum> createStaticFields() {
            Map<String, RecordVolumeRatioEnum> map = new HashMap<>();
            map.put("Do Not Set Volume Ratio", DO_NOT_SET_VOLUME_RATIO);
            map.put("Low", LOW);
            map.put("Middle", MIDDLE);
            map.put("High", HIGH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RecordVolumeRatioEnum(String value) {
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
        public static RecordVolumeRatioEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RecordVolumeRatioEnum(value));
        }

        public static RecordVolumeRatioEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RecordVolumeRatioEnum) {
                return this.value.equals(((RecordVolumeRatioEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_volume_ratio")

    private RecordVolumeRatioEnum recordVolumeRatio;

    /**
     * 音频传输方式。取值为： 可靠传输：Reliable Transmission。 实时传输：Real Time Transmission。
     */
    public static final class AudioTransmissionModeEnum {

        /**
         * Enum REAL_TIME_TRANSMISSION for value: "Real Time Transmission"
         */
        public static final AudioTransmissionModeEnum REAL_TIME_TRANSMISSION =
            new AudioTransmissionModeEnum("Real Time Transmission");

        /**
         * Enum RELIABLE_TRANSMISSION for value: "Reliable Transmission"
         */
        public static final AudioTransmissionModeEnum RELIABLE_TRANSMISSION =
            new AudioTransmissionModeEnum("Reliable Transmission");

        private static final Map<String, AudioTransmissionModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AudioTransmissionModeEnum> createStaticFields() {
            Map<String, AudioTransmissionModeEnum> map = new HashMap<>();
            map.put("Real Time Transmission", REAL_TIME_TRANSMISSION);
            map.put("Reliable Transmission", RELIABLE_TRANSMISSION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AudioTransmissionModeEnum(String value) {
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
        public static AudioTransmissionModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AudioTransmissionModeEnum(value));
        }

        public static AudioTransmissionModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AudioTransmissionModeEnum) {
                return this.value.equals(((AudioTransmissionModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_transmission_mode")

    private AudioTransmissionModeEnum audioTransmissionMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_redirection_enable")

    private Boolean playRedirectionEnable;

    /**
     * 播音场景。取值为： 无损播音：LossLess。 语音通话：Speech Call。 音乐播音：Music Play。 自动识别：Automatic Identification。
     */
    public static final class PlayClassificationEnum {

        /**
         * Enum LOSSLESS for value: "LossLess"
         */
        public static final PlayClassificationEnum LOSSLESS = new PlayClassificationEnum("LossLess");

        /**
         * Enum SPEECH_CALL for value: "Speech Call"
         */
        public static final PlayClassificationEnum SPEECH_CALL = new PlayClassificationEnum("Speech Call");

        /**
         * Enum MUSIC_PLAY for value: "Music Play"
         */
        public static final PlayClassificationEnum MUSIC_PLAY = new PlayClassificationEnum("Music Play");

        /**
         * Enum AUTOMATIC_IDENTIFICATION for value: "Automatic Identification"
         */
        public static final PlayClassificationEnum AUTOMATIC_IDENTIFICATION =
            new PlayClassificationEnum("Automatic Identification");

        private static final Map<String, PlayClassificationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PlayClassificationEnum> createStaticFields() {
            Map<String, PlayClassificationEnum> map = new HashMap<>();
            map.put("LossLess", LOSSLESS);
            map.put("Speech Call", SPEECH_CALL);
            map.put("Music Play", MUSIC_PLAY);
            map.put("Automatic Identification", AUTOMATIC_IDENTIFICATION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PlayClassificationEnum(String value) {
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
        public static PlayClassificationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PlayClassificationEnum(value));
        }

        public static PlayClassificationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PlayClassificationEnum) {
                return this.value.equals(((PlayClassificationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_classification")

    private PlayClassificationEnum playClassification;

    /**
     * 播音质量。取值为： 低：Low。 中：Middle。 高：High
     */
    public static final class PlayQualityEnum {

        /**
         * Enum LOW for value: "Low"
         */
        public static final PlayQualityEnum LOW = new PlayQualityEnum("Low");

        /**
         * Enum MIDDLE for value: "Middle"
         */
        public static final PlayQualityEnum MIDDLE = new PlayQualityEnum("Middle");

        /**
         * Enum HIGH for value: "High"
         */
        public static final PlayQualityEnum HIGH = new PlayQualityEnum("High");

        private static final Map<String, PlayQualityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PlayQualityEnum> createStaticFields() {
            Map<String, PlayQualityEnum> map = new HashMap<>();
            map.put("Low", LOW);
            map.put("Middle", MIDDLE);
            map.put("High", HIGH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PlayQualityEnum(String value) {
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
        public static PlayQualityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PlayQualityEnum(value));
        }

        public static PlayQualityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PlayQualityEnum) {
                return this.value.equals(((PlayQualityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_quality")

    private PlayQualityEnum playQuality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_denoising")

    private String playDenoising;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_agc")

    private String playAgc;

    /**
     * 播音设置冗余。取值为： 不开启冗余：Disable CRC。 开启冗余：Enable CRC。
     */
    public static final class PlayCrcEnum {

        /**
         * Enum DISABLE_CRC for value: "Disable CRC"
         */
        public static final PlayCrcEnum DISABLE_CRC = new PlayCrcEnum("Disable CRC");

        /**
         * Enum ENABLE_CRC for value: "Enable CRC"
         */
        public static final PlayCrcEnum ENABLE_CRC = new PlayCrcEnum("Enable CRC");

        private static final Map<String, PlayCrcEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PlayCrcEnum> createStaticFields() {
            Map<String, PlayCrcEnum> map = new HashMap<>();
            map.put("Disable CRC", DISABLE_CRC);
            map.put("Enable CRC", ENABLE_CRC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PlayCrcEnum(String value) {
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
        public static PlayCrcEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PlayCrcEnum(value));
        }

        public static PlayCrcEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PlayCrcEnum) {
                return this.value.equals(((PlayCrcEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_crc")

    private PlayCrcEnum playCrc;

    /**
     * 播音设置模式。取值为： 播音设备共享模式：Play Device In Shared Mode。 播音设备独占模式：Play Device In Exclusive Mode。
     */
    public static final class PlayDeviceModeEnum {

        /**
         * Enum PLAY_DEVICE_IN_SHARED_MODE for value: "Play Device In Shared Mode"
         */
        public static final PlayDeviceModeEnum PLAY_DEVICE_IN_SHARED_MODE =
            new PlayDeviceModeEnum("Play Device In Shared Mode");

        /**
         * Enum PLAY_DEVICE_IN_EXCLUSIVE_MODE for value: "Play Device In Exclusive Mode"
         */
        public static final PlayDeviceModeEnum PLAY_DEVICE_IN_EXCLUSIVE_MODE =
            new PlayDeviceModeEnum("Play Device In Exclusive Mode");

        private static final Map<String, PlayDeviceModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PlayDeviceModeEnum> createStaticFields() {
            Map<String, PlayDeviceModeEnum> map = new HashMap<>();
            map.put("Play Device In Shared Mode", PLAY_DEVICE_IN_SHARED_MODE);
            map.put("Play Device In Exclusive Mode", PLAY_DEVICE_IN_EXCLUSIVE_MODE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PlayDeviceModeEnum(String value) {
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
        public static PlayDeviceModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PlayDeviceModeEnum(value));
        }

        public static PlayDeviceModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PlayDeviceModeEnum) {
                return this.value.equals(((PlayDeviceModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_device_mode")

    private PlayDeviceModeEnum playDeviceMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_delay_threshold")

    private String playDelayThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_amplitude_threshold")

    private String playAmplitudeThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_prefill_data")

    private String playPrefillData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_redirection_enable")

    private Boolean recordRedirectionEnable;

    /**
     * 录音场景。取值为： 无损录音：LossLess。 语音通话：Speech Call。 音乐录音：Music Record。 自动识别：Automatic Identification。
     */
    public static final class RecordClassificationEnum {

        /**
         * Enum LOSSLESS for value: "LossLess"
         */
        public static final RecordClassificationEnum LOSSLESS = new RecordClassificationEnum("LossLess");

        /**
         * Enum SPEECH_CALL for value: "Speech Call"
         */
        public static final RecordClassificationEnum SPEECH_CALL = new RecordClassificationEnum("Speech Call");

        /**
         * Enum MUSIC_RECORD for value: "Music Record"
         */
        public static final RecordClassificationEnum MUSIC_RECORD = new RecordClassificationEnum("Music Record");

        /**
         * Enum AUTOMATIC_IDENTIFICATION for value: "Automatic Identification"
         */
        public static final RecordClassificationEnum AUTOMATIC_IDENTIFICATION =
            new RecordClassificationEnum("Automatic Identification");

        private static final Map<String, RecordClassificationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RecordClassificationEnum> createStaticFields() {
            Map<String, RecordClassificationEnum> map = new HashMap<>();
            map.put("LossLess", LOSSLESS);
            map.put("Speech Call", SPEECH_CALL);
            map.put("Music Record", MUSIC_RECORD);
            map.put("Automatic Identification", AUTOMATIC_IDENTIFICATION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RecordClassificationEnum(String value) {
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
        public static RecordClassificationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RecordClassificationEnum(value));
        }

        public static RecordClassificationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RecordClassificationEnum) {
                return this.value.equals(((RecordClassificationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_classification")

    private RecordClassificationEnum recordClassification;

    /**
     * 录音质量。取值为： 低：Low。 中：Middle。 高：High。
     */
    public static final class RecordQualityEnum {

        /**
         * Enum LOW for value: "Low"
         */
        public static final RecordQualityEnum LOW = new RecordQualityEnum("Low");

        /**
         * Enum MIDDLE for value: "Middle"
         */
        public static final RecordQualityEnum MIDDLE = new RecordQualityEnum("Middle");

        /**
         * Enum HIGH for value: "High"
         */
        public static final RecordQualityEnum HIGH = new RecordQualityEnum("High");

        private static final Map<String, RecordQualityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RecordQualityEnum> createStaticFields() {
            Map<String, RecordQualityEnum> map = new HashMap<>();
            map.put("Low", LOW);
            map.put("Middle", MIDDLE);
            map.put("High", HIGH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RecordQualityEnum(String value) {
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
        public static RecordQualityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RecordQualityEnum(value));
        }

        public static RecordQualityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RecordQualityEnum) {
                return this.value.equals(((RecordQualityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_quality")

    private RecordQualityEnum recordQuality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_denoising")

    private String recordDenoising;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_agc")

    private String recordAgc;

    /**
     * 录音设置冗余。取值为： 不开启冗余：Disable CRC。 开启冗余：Enable CRC。
     */
    public static final class RecordCrcEnum {

        /**
         * Enum DISABLE_CRC for value: "Disable CRC"
         */
        public static final RecordCrcEnum DISABLE_CRC = new RecordCrcEnum("Disable CRC");

        /**
         * Enum ENABLE_CRC for value: "Enable CRC"
         */
        public static final RecordCrcEnum ENABLE_CRC = new RecordCrcEnum("Enable CRC");

        private static final Map<String, RecordCrcEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RecordCrcEnum> createStaticFields() {
            Map<String, RecordCrcEnum> map = new HashMap<>();
            map.put("Disable CRC", DISABLE_CRC);
            map.put("Enable CRC", ENABLE_CRC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RecordCrcEnum(String value) {
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
        public static RecordCrcEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RecordCrcEnum(value));
        }

        public static RecordCrcEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RecordCrcEnum) {
                return this.value.equals(((RecordCrcEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_crc")

    private RecordCrcEnum recordCrc;

    /**
     * 录音设置模式。取值为： 播音设备共享模式：Record Device In Shared Mode。 播音设备独占模式：Record Device In Exclusive Mode。
     */
    public static final class RecordDeviceModeEnum {

        /**
         * Enum RECORD_DEVICE_IN_SHARED_MODE for value: "Record Device In Shared Mode"
         */
        public static final RecordDeviceModeEnum RECORD_DEVICE_IN_SHARED_MODE =
            new RecordDeviceModeEnum("Record Device In Shared Mode");

        /**
         * Enum RECORD_DEVICE_IN_EXCLUSIVE_MODE for value: "Record Device In Exclusive Mode"
         */
        public static final RecordDeviceModeEnum RECORD_DEVICE_IN_EXCLUSIVE_MODE =
            new RecordDeviceModeEnum("Record Device In Exclusive Mode");

        private static final Map<String, RecordDeviceModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RecordDeviceModeEnum> createStaticFields() {
            Map<String, RecordDeviceModeEnum> map = new HashMap<>();
            map.put("Record Device In Shared Mode", RECORD_DEVICE_IN_SHARED_MODE);
            map.put("Record Device In Exclusive Mode", RECORD_DEVICE_IN_EXCLUSIVE_MODE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RecordDeviceModeEnum(String value) {
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
        public static RecordDeviceModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RecordDeviceModeEnum(value));
        }

        public static RecordDeviceModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RecordDeviceModeEnum) {
                return this.value.equals(((RecordDeviceModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_device_mode")

    private RecordDeviceModeEnum recordDeviceMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_delay_threshold")

    private String recordDelayThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_amplitude_threshold")

    private String recordAmplitudeThreshold;

    public PoliciesAudio withAudioRedirectionEnable(Boolean audioRedirectionEnable) {
        this.audioRedirectionEnable = audioRedirectionEnable;
        return this;
    }

    /**
     * 是否开启音频重定向。取值为： false：表示关闭。 true：表示开启。
     * @return audioRedirectionEnable
     */
    public Boolean getAudioRedirectionEnable() {
        return audioRedirectionEnable;
    }

    public void setAudioRedirectionEnable(Boolean audioRedirectionEnable) {
        this.audioRedirectionEnable = audioRedirectionEnable;
    }

    public PoliciesAudio withPlayVolume(String playVolume) {
        this.playVolume = playVolume;
        return this;
    }

    /**
     * 播音设置音量。 不设置音量取值为：Do Not Set Volume。 音量设置，最小值为10，最大值为100，中间取值，间隔为5的递增序列。如：10、15、20、25等。
     * @return playVolume
     */
    public String getPlayVolume() {
        return playVolume;
    }

    public void setPlayVolume(String playVolume) {
        this.playVolume = playVolume;
    }

    public PoliciesAudio withPlayVolumeRatio(PlayVolumeRatioEnum playVolumeRatio) {
        this.playVolumeRatio = playVolumeRatio;
        return this;
    }

    /**
     * 播音设置音量线性系数。取值为： 不设置：Do Not Set Volume Ratio。 低：Low。 中：Middle。 高：High。
     * @return playVolumeRatio
     */
    public PlayVolumeRatioEnum getPlayVolumeRatio() {
        return playVolumeRatio;
    }

    public void setPlayVolumeRatio(PlayVolumeRatioEnum playVolumeRatio) {
        this.playVolumeRatio = playVolumeRatio;
    }

    public PoliciesAudio withRecordVolume(String recordVolume) {
        this.recordVolume = recordVolume;
        return this;
    }

    /**
     * 录音设置音量。 不设置取值为：Do Not Set Volume。 音量设置，最小值为10，最大值为100，中间取值，间隔为5的递增序列。如：10、15、20、25等。
     * @return recordVolume
     */
    public String getRecordVolume() {
        return recordVolume;
    }

    public void setRecordVolume(String recordVolume) {
        this.recordVolume = recordVolume;
    }

    public PoliciesAudio withRecordVolumeRatio(RecordVolumeRatioEnum recordVolumeRatio) {
        this.recordVolumeRatio = recordVolumeRatio;
        return this;
    }

    /**
     * 录音设置音量线性系数。取值为： 不设置：Do Not Set Volume Ratio。 低：Low。 中：Middle。 高：High。
     * @return recordVolumeRatio
     */
    public RecordVolumeRatioEnum getRecordVolumeRatio() {
        return recordVolumeRatio;
    }

    public void setRecordVolumeRatio(RecordVolumeRatioEnum recordVolumeRatio) {
        this.recordVolumeRatio = recordVolumeRatio;
    }

    public PoliciesAudio withAudioTransmissionMode(AudioTransmissionModeEnum audioTransmissionMode) {
        this.audioTransmissionMode = audioTransmissionMode;
        return this;
    }

    /**
     * 音频传输方式。取值为： 可靠传输：Reliable Transmission。 实时传输：Real Time Transmission。
     * @return audioTransmissionMode
     */
    public AudioTransmissionModeEnum getAudioTransmissionMode() {
        return audioTransmissionMode;
    }

    public void setAudioTransmissionMode(AudioTransmissionModeEnum audioTransmissionMode) {
        this.audioTransmissionMode = audioTransmissionMode;
    }

    public PoliciesAudio withPlayRedirectionEnable(Boolean playRedirectionEnable) {
        this.playRedirectionEnable = playRedirectionEnable;
        return this;
    }

    /**
     * 是否开启播音重定向。取值为： false：表示关闭。 true：表示开启。
     * @return playRedirectionEnable
     */
    public Boolean getPlayRedirectionEnable() {
        return playRedirectionEnable;
    }

    public void setPlayRedirectionEnable(Boolean playRedirectionEnable) {
        this.playRedirectionEnable = playRedirectionEnable;
    }

    public PoliciesAudio withPlayClassification(PlayClassificationEnum playClassification) {
        this.playClassification = playClassification;
        return this;
    }

    /**
     * 播音场景。取值为： 无损播音：LossLess。 语音通话：Speech Call。 音乐播音：Music Play。 自动识别：Automatic Identification。
     * @return playClassification
     */
    public PlayClassificationEnum getPlayClassification() {
        return playClassification;
    }

    public void setPlayClassification(PlayClassificationEnum playClassification) {
        this.playClassification = playClassification;
    }

    public PoliciesAudio withPlayQuality(PlayQualityEnum playQuality) {
        this.playQuality = playQuality;
        return this;
    }

    /**
     * 播音质量。取值为： 低：Low。 中：Middle。 高：High
     * @return playQuality
     */
    public PlayQualityEnum getPlayQuality() {
        return playQuality;
    }

    public void setPlayQuality(PlayQualityEnum playQuality) {
        this.playQuality = playQuality;
    }

    public PoliciesAudio withPlayDenoising(String playDenoising) {
        this.playDenoising = playDenoising;
        return this;
    }

    /**
     * 播音降噪。取值为： 不开启降噪：Disable Denoising。 开启降噪，最小值为-100，最大值为-5，中间取值，间隔为5的递增序列。如：-100、-95、-90、-85等。
     * @return playDenoising
     */
    public String getPlayDenoising() {
        return playDenoising;
    }

    public void setPlayDenoising(String playDenoising) {
        this.playDenoising = playDenoising;
    }

    public PoliciesAudio withPlayAgc(String playAgc) {
        this.playAgc = playAgc;
        return this;
    }

    /**
     * 播音增益。取值为：不开启增益：Disable AGC。开启增益，最小值为4000，最大值为32000，中间取值，从10000开始间隔为1000的递增序列。如：4000、6000、8000、10000、11000、12000、13000等。
     * @return playAgc
     */
    public String getPlayAgc() {
        return playAgc;
    }

    public void setPlayAgc(String playAgc) {
        this.playAgc = playAgc;
    }

    public PoliciesAudio withPlayCrc(PlayCrcEnum playCrc) {
        this.playCrc = playCrc;
        return this;
    }

    /**
     * 播音设置冗余。取值为： 不开启冗余：Disable CRC。 开启冗余：Enable CRC。
     * @return playCrc
     */
    public PlayCrcEnum getPlayCrc() {
        return playCrc;
    }

    public void setPlayCrc(PlayCrcEnum playCrc) {
        this.playCrc = playCrc;
    }

    public PoliciesAudio withPlayDeviceMode(PlayDeviceModeEnum playDeviceMode) {
        this.playDeviceMode = playDeviceMode;
        return this;
    }

    /**
     * 播音设置模式。取值为： 播音设备共享模式：Play Device In Shared Mode。 播音设备独占模式：Play Device In Exclusive Mode。
     * @return playDeviceMode
     */
    public PlayDeviceModeEnum getPlayDeviceMode() {
        return playDeviceMode;
    }

    public void setPlayDeviceMode(PlayDeviceModeEnum playDeviceMode) {
        this.playDeviceMode = playDeviceMode;
    }

    public PoliciesAudio withPlayDelayThreshold(String playDelayThreshold) {
        this.playDelayThreshold = playDelayThreshold;
        return this;
    }

    /**
     * 播音控制时延阈值。取值为：最小值为160，最大值为2500。中间取值，400以下为40的递增序列，1000以下为50的递增序列。从高到低为：2500、2000、1800、1500、1200、1000、950、900、850等。
     * @return playDelayThreshold
     */
    public String getPlayDelayThreshold() {
        return playDelayThreshold;
    }

    public void setPlayDelayThreshold(String playDelayThreshold) {
        this.playDelayThreshold = playDelayThreshold;
    }

    public PoliciesAudio withPlayAmplitudeThreshold(String playAmplitudeThreshold) {
        this.playAmplitudeThreshold = playAmplitudeThreshold;
        return this;
    }

    /**
     * 播音检测振幅阈值。取值为：2048、4096、5120、6144、7168、8192。
     * @return playAmplitudeThreshold
     */
    public String getPlayAmplitudeThreshold() {
        return playAmplitudeThreshold;
    }

    public void setPlayAmplitudeThreshold(String playAmplitudeThreshold) {
        this.playAmplitudeThreshold = playAmplitudeThreshold;
    }

    public PoliciesAudio withPlayPrefillData(String playPrefillData) {
        this.playPrefillData = playPrefillData;
        return this;
    }

    /**
     * 播音音乐预充数据。取值为：不预充：Do Not Prefill Data。预充取值：最小值为50，最大值为2000，250以前为50的递增序列，500以前为100的递增序列。从高到低取值如：2000、1500、1000、500、400、300、250。
     * @return playPrefillData
     */
    public String getPlayPrefillData() {
        return playPrefillData;
    }

    public void setPlayPrefillData(String playPrefillData) {
        this.playPrefillData = playPrefillData;
    }

    public PoliciesAudio withRecordRedirectionEnable(Boolean recordRedirectionEnable) {
        this.recordRedirectionEnable = recordRedirectionEnable;
        return this;
    }

    /**
     * 是否开启录音重定向。取值为： false：表示关闭。 true：表示开启。
     * @return recordRedirectionEnable
     */
    public Boolean getRecordRedirectionEnable() {
        return recordRedirectionEnable;
    }

    public void setRecordRedirectionEnable(Boolean recordRedirectionEnable) {
        this.recordRedirectionEnable = recordRedirectionEnable;
    }

    public PoliciesAudio withRecordClassification(RecordClassificationEnum recordClassification) {
        this.recordClassification = recordClassification;
        return this;
    }

    /**
     * 录音场景。取值为： 无损录音：LossLess。 语音通话：Speech Call。 音乐录音：Music Record。 自动识别：Automatic Identification。
     * @return recordClassification
     */
    public RecordClassificationEnum getRecordClassification() {
        return recordClassification;
    }

    public void setRecordClassification(RecordClassificationEnum recordClassification) {
        this.recordClassification = recordClassification;
    }

    public PoliciesAudio withRecordQuality(RecordQualityEnum recordQuality) {
        this.recordQuality = recordQuality;
        return this;
    }

    /**
     * 录音质量。取值为： 低：Low。 中：Middle。 高：High。
     * @return recordQuality
     */
    public RecordQualityEnum getRecordQuality() {
        return recordQuality;
    }

    public void setRecordQuality(RecordQualityEnum recordQuality) {
        this.recordQuality = recordQuality;
    }

    public PoliciesAudio withRecordDenoising(String recordDenoising) {
        this.recordDenoising = recordDenoising;
        return this;
    }

    /**
     * 录音降噪。取值为： 不开启降噪：Disable Denoising。 开启降噪，最小值为-100，最大值为-5，中间取值，间隔为5的递增序列。如：-100、-95、-90、-85等。
     * @return recordDenoising
     */
    public String getRecordDenoising() {
        return recordDenoising;
    }

    public void setRecordDenoising(String recordDenoising) {
        this.recordDenoising = recordDenoising;
    }

    public PoliciesAudio withRecordAgc(String recordAgc) {
        this.recordAgc = recordAgc;
        return this;
    }

    /**
     * 录音增益。取值为：不开启增益：Disable AGC。开启增益，最小值为4000，最大值为32000，中间取值，从10000开始间隔为1000的递增序列。如：4000、6000、8000、10000、11000、12000、13000等。
     * @return recordAgc
     */
    public String getRecordAgc() {
        return recordAgc;
    }

    public void setRecordAgc(String recordAgc) {
        this.recordAgc = recordAgc;
    }

    public PoliciesAudio withRecordCrc(RecordCrcEnum recordCrc) {
        this.recordCrc = recordCrc;
        return this;
    }

    /**
     * 录音设置冗余。取值为： 不开启冗余：Disable CRC。 开启冗余：Enable CRC。
     * @return recordCrc
     */
    public RecordCrcEnum getRecordCrc() {
        return recordCrc;
    }

    public void setRecordCrc(RecordCrcEnum recordCrc) {
        this.recordCrc = recordCrc;
    }

    public PoliciesAudio withRecordDeviceMode(RecordDeviceModeEnum recordDeviceMode) {
        this.recordDeviceMode = recordDeviceMode;
        return this;
    }

    /**
     * 录音设置模式。取值为： 播音设备共享模式：Record Device In Shared Mode。 播音设备独占模式：Record Device In Exclusive Mode。
     * @return recordDeviceMode
     */
    public RecordDeviceModeEnum getRecordDeviceMode() {
        return recordDeviceMode;
    }

    public void setRecordDeviceMode(RecordDeviceModeEnum recordDeviceMode) {
        this.recordDeviceMode = recordDeviceMode;
    }

    public PoliciesAudio withRecordDelayThreshold(String recordDelayThreshold) {
        this.recordDelayThreshold = recordDelayThreshold;
        return this;
    }

    /**
     * 录音控制时延阈值。取值为：最小值为160，最大值为2500。中间取值，400以下为40的递增序列，1000以下为50的递增序列。从高到低为：2500、2000、1800、1500、1200、1000、950、900、850等。
     * @return recordDelayThreshold
     */
    public String getRecordDelayThreshold() {
        return recordDelayThreshold;
    }

    public void setRecordDelayThreshold(String recordDelayThreshold) {
        this.recordDelayThreshold = recordDelayThreshold;
    }

    public PoliciesAudio withRecordAmplitudeThreshold(String recordAmplitudeThreshold) {
        this.recordAmplitudeThreshold = recordAmplitudeThreshold;
        return this;
    }

    /**
     * 录音检测振幅阈值。取值为：2048、4096、5120、6144、7168、8192。
     * @return recordAmplitudeThreshold
     */
    public String getRecordAmplitudeThreshold() {
        return recordAmplitudeThreshold;
    }

    public void setRecordAmplitudeThreshold(String recordAmplitudeThreshold) {
        this.recordAmplitudeThreshold = recordAmplitudeThreshold;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesAudio that = (PoliciesAudio) obj;
        return Objects.equals(this.audioRedirectionEnable, that.audioRedirectionEnable)
            && Objects.equals(this.playVolume, that.playVolume)
            && Objects.equals(this.playVolumeRatio, that.playVolumeRatio)
            && Objects.equals(this.recordVolume, that.recordVolume)
            && Objects.equals(this.recordVolumeRatio, that.recordVolumeRatio)
            && Objects.equals(this.audioTransmissionMode, that.audioTransmissionMode)
            && Objects.equals(this.playRedirectionEnable, that.playRedirectionEnable)
            && Objects.equals(this.playClassification, that.playClassification)
            && Objects.equals(this.playQuality, that.playQuality)
            && Objects.equals(this.playDenoising, that.playDenoising) && Objects.equals(this.playAgc, that.playAgc)
            && Objects.equals(this.playCrc, that.playCrc) && Objects.equals(this.playDeviceMode, that.playDeviceMode)
            && Objects.equals(this.playDelayThreshold, that.playDelayThreshold)
            && Objects.equals(this.playAmplitudeThreshold, that.playAmplitudeThreshold)
            && Objects.equals(this.playPrefillData, that.playPrefillData)
            && Objects.equals(this.recordRedirectionEnable, that.recordRedirectionEnable)
            && Objects.equals(this.recordClassification, that.recordClassification)
            && Objects.equals(this.recordQuality, that.recordQuality)
            && Objects.equals(this.recordDenoising, that.recordDenoising)
            && Objects.equals(this.recordAgc, that.recordAgc) && Objects.equals(this.recordCrc, that.recordCrc)
            && Objects.equals(this.recordDeviceMode, that.recordDeviceMode)
            && Objects.equals(this.recordDelayThreshold, that.recordDelayThreshold)
            && Objects.equals(this.recordAmplitudeThreshold, that.recordAmplitudeThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audioRedirectionEnable,
            playVolume,
            playVolumeRatio,
            recordVolume,
            recordVolumeRatio,
            audioTransmissionMode,
            playRedirectionEnable,
            playClassification,
            playQuality,
            playDenoising,
            playAgc,
            playCrc,
            playDeviceMode,
            playDelayThreshold,
            playAmplitudeThreshold,
            playPrefillData,
            recordRedirectionEnable,
            recordClassification,
            recordQuality,
            recordDenoising,
            recordAgc,
            recordCrc,
            recordDeviceMode,
            recordDelayThreshold,
            recordAmplitudeThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesAudio {\n");
        sb.append("    audioRedirectionEnable: ").append(toIndentedString(audioRedirectionEnable)).append("\n");
        sb.append("    playVolume: ").append(toIndentedString(playVolume)).append("\n");
        sb.append("    playVolumeRatio: ").append(toIndentedString(playVolumeRatio)).append("\n");
        sb.append("    recordVolume: ").append(toIndentedString(recordVolume)).append("\n");
        sb.append("    recordVolumeRatio: ").append(toIndentedString(recordVolumeRatio)).append("\n");
        sb.append("    audioTransmissionMode: ").append(toIndentedString(audioTransmissionMode)).append("\n");
        sb.append("    playRedirectionEnable: ").append(toIndentedString(playRedirectionEnable)).append("\n");
        sb.append("    playClassification: ").append(toIndentedString(playClassification)).append("\n");
        sb.append("    playQuality: ").append(toIndentedString(playQuality)).append("\n");
        sb.append("    playDenoising: ").append(toIndentedString(playDenoising)).append("\n");
        sb.append("    playAgc: ").append(toIndentedString(playAgc)).append("\n");
        sb.append("    playCrc: ").append(toIndentedString(playCrc)).append("\n");
        sb.append("    playDeviceMode: ").append(toIndentedString(playDeviceMode)).append("\n");
        sb.append("    playDelayThreshold: ").append(toIndentedString(playDelayThreshold)).append("\n");
        sb.append("    playAmplitudeThreshold: ").append(toIndentedString(playAmplitudeThreshold)).append("\n");
        sb.append("    playPrefillData: ").append(toIndentedString(playPrefillData)).append("\n");
        sb.append("    recordRedirectionEnable: ").append(toIndentedString(recordRedirectionEnable)).append("\n");
        sb.append("    recordClassification: ").append(toIndentedString(recordClassification)).append("\n");
        sb.append("    recordQuality: ").append(toIndentedString(recordQuality)).append("\n");
        sb.append("    recordDenoising: ").append(toIndentedString(recordDenoising)).append("\n");
        sb.append("    recordAgc: ").append(toIndentedString(recordAgc)).append("\n");
        sb.append("    recordCrc: ").append(toIndentedString(recordCrc)).append("\n");
        sb.append("    recordDeviceMode: ").append(toIndentedString(recordDeviceMode)).append("\n");
        sb.append("    recordDelayThreshold: ").append(toIndentedString(recordDelayThreshold)).append("\n");
        sb.append("    recordAmplitudeThreshold: ").append(toIndentedString(recordAmplitudeThreshold)).append("\n");
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
