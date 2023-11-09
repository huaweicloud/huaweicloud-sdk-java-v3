package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DocumentAudioDetail
 */
public class DocumentAudioDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Float startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Float endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    private String suggestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_text")

    private String audioText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segments")

    private List<DocumentVideoImageDetailSegments> segments = null;

    public DocumentAudioDetail withStartTime(Float startTime) {
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

    public DocumentAudioDetail withEndTime(Float endTime) {
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

    public DocumentAudioDetail withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * 音频片段审核处理建议： block：包含敏感信息，不通过 review：需要人工复检
     * @return suggestion
     */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public DocumentAudioDetail withAudioText(String audioText) {
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

    public DocumentAudioDetail withLabel(String label) {
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

    public DocumentAudioDetail withSegments(List<DocumentVideoImageDetailSegments> segments) {
        this.segments = segments;
        return this;
    }

    public DocumentAudioDetail addSegmentsItem(DocumentVideoImageDetailSegments segmentsItem) {
        if (this.segments == null) {
            this.segments = new ArrayList<>();
        }
        this.segments.add(segmentsItem);
        return this;
    }

    public DocumentAudioDetail withSegments(Consumer<List<DocumentVideoImageDetailSegments>> segmentsSetter) {
        if (this.segments == null) {
            this.segments = new ArrayList<>();
        }
        segmentsSetter.accept(this.segments);
        return this;
    }

    /**
     * 命中的风险片段信息列表
     * @return segments
     */
    public List<DocumentVideoImageDetailSegments> getSegments() {
        return segments;
    }

    public void setSegments(List<DocumentVideoImageDetailSegments> segments) {
        this.segments = segments;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DocumentAudioDetail that = (DocumentAudioDetail) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.suggestion, that.suggestion) && Objects.equals(this.audioText, that.audioText)
            && Objects.equals(this.label, that.label) && Objects.equals(this.segments, that.segments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, suggestion, audioText, label, segments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DocumentAudioDetail {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
        sb.append("    audioText: ").append(toIndentedString(audioText)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
