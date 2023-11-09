package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DocumentVideoImageDetail
 */
public class DocumentVideoImageDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Float time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    private String suggestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ocr_text")

    private String ocrText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segments")

    private List<DocumentVideoImageDetailSegments> segments = null;

    public DocumentVideoImageDetail withTime(Float time) {
        this.time = time;
        return this;
    }

    /**
     * 截帧在视频文件中的时间，单位为秒
     * @return time
     */
    public Float getTime() {
        return time;
    }

    public void setTime(Float time) {
        this.time = time;
    }

    public DocumentVideoImageDetail withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * 截帧审核结果是否通过。 block：包含敏感信息，不通过 review：需要人工复检
     * @return suggestion
     */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public DocumentVideoImageDetail withOcrText(String ocrText) {
        this.ocrText = ocrText;
        return this;
    }

    /**
     * 截帧检测出的文本
     * @return ocrText
     */
    public String getOcrText() {
        return ocrText;
    }

    public void setOcrText(String ocrText) {
        this.ocrText = ocrText;
    }

    public DocumentVideoImageDetail withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 识别的详细标签
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public DocumentVideoImageDetail withSegments(List<DocumentVideoImageDetailSegments> segments) {
        this.segments = segments;
        return this;
    }

    public DocumentVideoImageDetail addSegmentsItem(DocumentVideoImageDetailSegments segmentsItem) {
        if (this.segments == null) {
            this.segments = new ArrayList<>();
        }
        this.segments.add(segmentsItem);
        return this;
    }

    public DocumentVideoImageDetail withSegments(Consumer<List<DocumentVideoImageDetailSegments>> segmentsSetter) {
        if (this.segments == null) {
            this.segments = new ArrayList<>();
        }
        segmentsSetter.accept(this.segments);
        return this;
    }

    /**
     * 命中的文本风险片段列表
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
        DocumentVideoImageDetail that = (DocumentVideoImageDetail) obj;
        return Objects.equals(this.time, that.time) && Objects.equals(this.suggestion, that.suggestion)
            && Objects.equals(this.ocrText, that.ocrText) && Objects.equals(this.label, that.label)
            && Objects.equals(this.segments, that.segments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, suggestion, ocrText, label, segments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DocumentVideoImageDetail {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
        sb.append("    ocrText: ").append(toIndentedString(ocrText)).append("\n");
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
