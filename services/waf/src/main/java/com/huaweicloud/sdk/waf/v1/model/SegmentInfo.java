package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 命中片段
 */
public class SegmentInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segment")

    private String segment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position")

    private List<Integer> position = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lexicon_id")

    private String lexiconId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lexicon_type")

    private Integer lexiconType;

    public SegmentInfo withSegment(String segment) {
        this.segment = segment;
        return this;
    }

    /**
     * 命中规则的具体片段
     * @return segment
     */
    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public SegmentInfo withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 命中的规则类别
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public SegmentInfo withPosition(List<Integer> position) {
        this.position = position;
        return this;
    }

    public SegmentInfo addPositionItem(Integer positionItem) {
        if (this.position == null) {
            this.position = new ArrayList<>();
        }
        this.position.add(positionItem);
        return this;
    }

    public SegmentInfo withPosition(Consumer<List<Integer>> positionSetter) {
        if (this.position == null) {
            this.position = new ArrayList<>();
        }
        positionSetter.accept(this.position);
        return this;
    }

    /**
     * 敏感词所在位置
     * @return position
     */
    public List<Integer> getPosition() {
        return position;
    }

    public void setPosition(List<Integer> position) {
        this.position = position;
    }

    public SegmentInfo withLexiconId(String lexiconId) {
        this.lexiconId = lexiconId;
        return this;
    }

    /**
     * 命中自定义词库的ID
     * @return lexiconId
     */
    public String getLexiconId() {
        return lexiconId;
    }

    public void setLexiconId(String lexiconId) {
        this.lexiconId = lexiconId;
    }

    public SegmentInfo withLexiconType(Integer lexiconType) {
        this.lexiconType = lexiconType;
        return this;
    }

    /**
     * 自定义词库是豁免还是违规
     * @return lexiconType
     */
    public Integer getLexiconType() {
        return lexiconType;
    }

    public void setLexiconType(Integer lexiconType) {
        this.lexiconType = lexiconType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SegmentInfo that = (SegmentInfo) obj;
        return Objects.equals(this.segment, that.segment) && Objects.equals(this.category, that.category)
            && Objects.equals(this.position, that.position) && Objects.equals(this.lexiconId, that.lexiconId)
            && Objects.equals(this.lexiconType, that.lexiconType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(segment, category, position, lexiconId, lexiconType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SegmentInfo {\n");
        sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    lexiconId: ").append(toIndentedString(lexiconId)).append("\n");
        sb.append("    lexiconType: ").append(toIndentedString(lexiconType)).append("\n");
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
