package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AudioModerationResultDetail
 */
public class AudioModerationResultDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Float startTime;

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

    private SuggestionEnum suggestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Float endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_text")

    private String audioText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segments")

    private List<VideoModerationDetailSegment> segments = null;

    public AudioModerationResultDetail withStartTime(Float startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 音频片段开始时间
     * @return startTime
     */
    public Float getStartTime() {
        return startTime;
    }

    public void setStartTime(Float startTime) {
        this.startTime = startTime;
    }

    public AudioModerationResultDetail withSuggestion(SuggestionEnum suggestion) {
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

    public AudioModerationResultDetail withEndTime(Float endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 音频片段结束时间
     * @return endTime
     */
    public Float getEndTime() {
        return endTime;
    }

    public void setEndTime(Float endTime) {
        this.endTime = endTime;
    }

    public AudioModerationResultDetail withLabel(String label) {
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

    public AudioModerationResultDetail withAudioText(String audioText) {
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

    public AudioModerationResultDetail withSegments(List<VideoModerationDetailSegment> segments) {
        this.segments = segments;
        return this;
    }

    public AudioModerationResultDetail addSegmentsItem(VideoModerationDetailSegment segmentsItem) {
        if (this.segments == null) {
            this.segments = new ArrayList<>();
        }
        this.segments.add(segmentsItem);
        return this;
    }

    public AudioModerationResultDetail withSegments(Consumer<List<VideoModerationDetailSegment>> segmentsSetter) {
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
    public List<VideoModerationDetailSegment> getSegments() {
        return segments;
    }

    public void setSegments(List<VideoModerationDetailSegment> segments) {
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
        AudioModerationResultDetail audioModerationResultDetail = (AudioModerationResultDetail) o;
        return Objects.equals(this.startTime, audioModerationResultDetail.startTime)
            && Objects.equals(this.suggestion, audioModerationResultDetail.suggestion)
            && Objects.equals(this.endTime, audioModerationResultDetail.endTime)
            && Objects.equals(this.label, audioModerationResultDetail.label)
            && Objects.equals(this.audioText, audioModerationResultDetail.audioText)
            && Objects.equals(this.segments, audioModerationResultDetail.segments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, suggestion, endTime, label, audioText, segments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudioModerationResultDetail {\n");
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
