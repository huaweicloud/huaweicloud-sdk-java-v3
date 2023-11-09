package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SegmentResult
 */
public class SegmentResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segment")

    private String segment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "glossary_name")

    private String glossaryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position")

    private List<Integer> position = null;

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

    public SegmentResult withPosition(List<Integer> position) {
        this.position = position;
        return this;
    }

    public SegmentResult addPositionItem(Integer positionItem) {
        if (this.position == null) {
            this.position = new ArrayList<>();
        }
        this.position.add(positionItem);
        return this;
    }

    public SegmentResult withPosition(Consumer<List<Integer>> positionSetter) {
        if (this.position == null) {
            this.position = new ArrayList<>();
        }
        positionSetter.accept(this.position);
        return this;
    }

    /**
     * 命中的风险片段在文本中的位置，起始位置从0开始
     * @return position
     */
    public List<Integer> getPosition() {
        return position;
    }

    public void setPosition(List<Integer> position) {
        this.position = position;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SegmentResult that = (SegmentResult) obj;
        return Objects.equals(this.segment, that.segment) && Objects.equals(this.glossaryName, that.glossaryName)
            && Objects.equals(this.position, that.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(segment, glossaryName, position);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SegmentResult {\n");
        sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
        sb.append("    glossaryName: ").append(toIndentedString(glossaryName)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
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
