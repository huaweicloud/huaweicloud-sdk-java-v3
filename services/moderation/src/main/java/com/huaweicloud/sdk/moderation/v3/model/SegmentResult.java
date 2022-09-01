package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * SegmentResult
 */
public class SegmentResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segment")

    @JacksonXmlProperty(localName = "segment")

    private String segment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "glossary_name")

    @JacksonXmlProperty(localName = "glossary_name")

    private String glossaryName;

    public SegmentResult withSegment(String segment) {
        this.segment = segment;
        return this;
    }

    /**
     * 命中的风险片段。
     * @return segment
     */
    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public SegmentResult withGlossaryName(String glossaryName) {
        this.glossaryName = glossaryName;
        return this;
    }

    /**
     * 命中的自定义词库名称。  命中自定义词库时，才会返回当前字段。
     * @return glossaryName
     */
    public String getGlossaryName() {
        return glossaryName;
    }

    public void setGlossaryName(String glossaryName) {
        this.glossaryName = glossaryName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SegmentResult segmentResult = (SegmentResult) o;
        return Objects.equals(this.segment, segmentResult.segment)
            && Objects.equals(this.glossaryName, segmentResult.glossaryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(segment, glossaryName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SegmentResult {\n");
        sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
        sb.append("    glossaryName: ").append(toIndentedString(glossaryName)).append("\n");
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
