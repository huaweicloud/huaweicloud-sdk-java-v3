package com.huaweicloud.sdk.workspaceapp.v1.model;

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
            && Objects.equals(this.playRedirectionEnable, that.playRedirectionEnable)
            && Objects.equals(this.playClassification, that.playClassification)
            && Objects.equals(this.recordRedirectionEnable, that.recordRedirectionEnable)
            && Objects.equals(this.recordClassification, that.recordClassification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audioRedirectionEnable,
            playRedirectionEnable,
            playClassification,
            recordRedirectionEnable,
            recordClassification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesAudio {\n");
        sb.append("    audioRedirectionEnable: ").append(toIndentedString(audioRedirectionEnable)).append("\n");
        sb.append("    playRedirectionEnable: ").append(toIndentedString(playRedirectionEnable)).append("\n");
        sb.append("    playClassification: ").append(toIndentedString(playClassification)).append("\n");
        sb.append("    recordRedirectionEnable: ").append(toIndentedString(recordRedirectionEnable)).append("\n");
        sb.append("    recordClassification: ").append(toIndentedString(recordClassification)).append("\n");
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
