package com.huaweicloud.sdk.sis.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * AnalysisInfo
 */
public class AnalysisInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diarization")

    @JacksonXmlProperty(localName = "diarization")

    private Boolean diarization;

    /**
     * 语音文件声道信息，可以为MONO（缺省), LEFT_AGENT, RIGHT_AGENT。  如果channel 为MONO，那么原始文件需要为单声道文件。  如果为双声道文件，系统会将其转换成单声道文件，可能会影响识别效果。  如果 channel 为 LEFT_AGENT或RIGHT_AGENT, 则原始文件需要为双声道文件，如果为单声道文件，系统会将其转换成双声道文件，可能会影响识别效果。  当channel 为 LEFT_AGENT或RIGHT_AGENT，且diarization为true时，系统会按照配置给出对应角色。其中：  LEFT_AGENT 指定左声道语音为agent（坐席）,  RIGHT_AGENT 指定右声道为agent（坐席）。
     */
    public static final class ChannelEnum {

        /**
         * Enum MONO for value: "MONO"
         */
        public static final ChannelEnum MONO = new ChannelEnum("MONO");

        /**
         * Enum LEFT_AGENT for value: "LEFT_AGENT"
         */
        public static final ChannelEnum LEFT_AGENT = new ChannelEnum("LEFT_AGENT");

        /**
         * Enum RIGHT_AGENT for value: "RIGHT_AGENT"
         */
        public static final ChannelEnum RIGHT_AGENT = new ChannelEnum("RIGHT_AGENT");

        private static final Map<String, ChannelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChannelEnum> createStaticFields() {
            Map<String, ChannelEnum> map = new HashMap<>();
            map.put("MONO", MONO);
            map.put("LEFT_AGENT", LEFT_AGENT);
            map.put("RIGHT_AGENT", RIGHT_AGENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChannelEnum(String value) {
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
        public static ChannelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ChannelEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ChannelEnum(value);
            }
            return result;
        }

        public static ChannelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ChannelEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChannelEnum) {
                return this.value.equals(((ChannelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel")

    @JacksonXmlProperty(localName = "channel")

    private ChannelEnum channel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "emotion")

    @JacksonXmlProperty(localName = "emotion")

    private Boolean emotion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed")

    @JacksonXmlProperty(localName = "speed")

    private Boolean speed;

    public AnalysisInfo withDiarization(Boolean diarization) {
        this.diarization = diarization;
        return this;
    }

    /**
     * 是否需要做话者分离。缺省为true，表示会进行话者分离，识别结果中会包含role项（角色）。如果diarization为false, 那么结果中不会出现role项。
     * @return diarization
     */
    public Boolean getDiarization() {
        return diarization;
    }

    public void setDiarization(Boolean diarization) {
        this.diarization = diarization;
    }

    public AnalysisInfo withChannel(ChannelEnum channel) {
        this.channel = channel;
        return this;
    }

    /**
     * 语音文件声道信息，可以为MONO（缺省), LEFT_AGENT, RIGHT_AGENT。  如果channel 为MONO，那么原始文件需要为单声道文件。  如果为双声道文件，系统会将其转换成单声道文件，可能会影响识别效果。  如果 channel 为 LEFT_AGENT或RIGHT_AGENT, 则原始文件需要为双声道文件，如果为单声道文件，系统会将其转换成双声道文件，可能会影响识别效果。  当channel 为 LEFT_AGENT或RIGHT_AGENT，且diarization为true时，系统会按照配置给出对应角色。其中：  LEFT_AGENT 指定左声道语音为agent（坐席）,  RIGHT_AGENT 指定右声道为agent（坐席）。
     * @return channel
     */
    public ChannelEnum getChannel() {
        return channel;
    }

    public void setChannel(ChannelEnum channel) {
        this.channel = channel;
    }

    public AnalysisInfo withEmotion(Boolean emotion) {
        this.emotion = emotion;
        return this;
    }

    /**
     * 是否需要做情绪检测, 缺省为true。
     * @return emotion
     */
    public Boolean getEmotion() {
        return emotion;
    }

    public void setEmotion(Boolean emotion) {
        this.emotion = emotion;
    }

    public AnalysisInfo withSpeed(Boolean speed) {
        this.speed = speed;
        return this;
    }

    /**
     * 是否需要输出语速信息, 缺省为true。
     * @return speed
     */
    public Boolean getSpeed() {
        return speed;
    }

    public void setSpeed(Boolean speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnalysisInfo analysisInfo = (AnalysisInfo) o;
        return Objects.equals(this.diarization, analysisInfo.diarization)
            && Objects.equals(this.channel, analysisInfo.channel) && Objects.equals(this.emotion, analysisInfo.emotion)
            && Objects.equals(this.speed, analysisInfo.speed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diarization, channel, emotion, speed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnalysisInfo {\n");
        sb.append("    diarization: ").append(toIndentedString(diarization)).append("\n");
        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
        sb.append("    emotion: ").append(toIndentedString(emotion)).append("\n");
        sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
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
