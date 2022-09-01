package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AudioModerationResultResultDetails
 */
public class AudioModerationResultResultDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    @JacksonXmlProperty(localName = "start_time")

    private Integer startTime;

    /**
     * 音频片段审核处理建议： block：包含敏感信息，不通过 review：需要人工复检
     */
    public static final class SuggestionEnum {

        /**
         * Enum BLOCK for value: "block"
         */
        public static final SuggestionEnum BLOCK = new SuggestionEnum("block");

        /**
         * Enum REVIEW for value: "review"
         */
        public static final SuggestionEnum REVIEW = new SuggestionEnum("review");

        private static final Map<String, SuggestionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SuggestionEnum> createStaticFields() {
            Map<String, SuggestionEnum> map = new HashMap<>();
            map.put("block", BLOCK);
            map.put("review", REVIEW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SuggestionEnum(String value) {
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
        public static SuggestionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SuggestionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SuggestionEnum(value);
            }
            return result;
        }

        public static SuggestionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SuggestionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SuggestionEnum) {
                return this.value.equals(((SuggestionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    @JacksonXmlProperty(localName = "suggestion")

    private SuggestionEnum suggestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    @JacksonXmlProperty(localName = "end_time")

    private Integer endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    @JacksonXmlProperty(localName = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_text")

    @JacksonXmlProperty(localName = "audio_text")

    private String audioText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segments")

    @JacksonXmlProperty(localName = "segments")

    private List<AudioModerationResultResultSegments> segments = null;

    public AudioModerationResultResultDetails withStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 音频片段开始时间
     * @return startTime
     */
    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public AudioModerationResultResultDetails withSuggestion(SuggestionEnum suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * 音频片段审核处理建议： block：包含敏感信息，不通过 review：需要人工复检
     * @return suggestion
     */
    public SuggestionEnum getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(SuggestionEnum suggestion) {
        this.suggestion = suggestion;
    }

    public AudioModerationResultResultDetails withEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 音频片段结束时间
     * @return endTime
     */
    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public AudioModerationResultResultDetails withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 音频片段标签
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public AudioModerationResultResultDetails withAudioText(String audioText) {
        this.audioText = audioText;
        return this;
    }

    /**
     * 音频片段文本内容
     * @return audioText
     */
    public String getAudioText() {
        return audioText;
    }

    public void setAudioText(String audioText) {
        this.audioText = audioText;
    }

    public AudioModerationResultResultDetails withSegments(List<AudioModerationResultResultSegments> segments) {
        this.segments = segments;
        return this;
    }

    public AudioModerationResultResultDetails addSegmentsItem(AudioModerationResultResultSegments segmentsItem) {
        if (this.segments == null) {
            this.segments = new ArrayList<>();
        }
        this.segments.add(segmentsItem);
        return this;
    }

    public AudioModerationResultResultDetails withSegments(
        Consumer<List<AudioModerationResultResultSegments>> segmentsSetter) {
        if (this.segments == null) {
            this.segments = new ArrayList<>();
        }
        segmentsSetter.accept(this.segments);
        return this;
    }

    /**
     * 命中的风险片段信息列表，如果命中语义算法模型，则该字段不会存在
     * @return segments
     */
    public List<AudioModerationResultResultSegments> getSegments() {
        return segments;
    }

    public void setSegments(List<AudioModerationResultResultSegments> segments) {
        this.segments = segments;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AudioModerationResultResultDetails audioModerationResultResultDetails = (AudioModerationResultResultDetails) o;
        return Objects.equals(this.startTime, audioModerationResultResultDetails.startTime)
            && Objects.equals(this.suggestion, audioModerationResultResultDetails.suggestion)
            && Objects.equals(this.endTime, audioModerationResultResultDetails.endTime)
            && Objects.equals(this.label, audioModerationResultResultDetails.label)
            && Objects.equals(this.audioText, audioModerationResultResultDetails.audioText)
            && Objects.equals(this.segments, audioModerationResultResultDetails.segments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, suggestion, endTime, label, audioText, segments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudioModerationResultResultDetails {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    audioText: ").append(toIndentedString(audioText)).append("\n");
        sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
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
