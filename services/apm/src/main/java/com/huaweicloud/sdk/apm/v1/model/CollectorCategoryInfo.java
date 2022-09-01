package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 采集器类别信息
 */
public class CollectorCategoryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_id")

    @JacksonXmlProperty(localName = "category_id")

    private Integer categoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_name")

    @JacksonXmlProperty(localName = "category_name")

    private String categoryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    @JacksonXmlProperty(localName = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    @JacksonXmlProperty(localName = "sequence")

    private Integer sequence;

    public CollectorCategoryInfo withCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * 采集器类别id
     * @return categoryId
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public CollectorCategoryInfo withCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    /**
     * 采集器类别名称
     * @return categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public CollectorCategoryInfo withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 采集器类别展示名称
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CollectorCategoryInfo withSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

    /**
     * 序列号
     * @return sequence
     */
    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CollectorCategoryInfo collectorCategoryInfo = (CollectorCategoryInfo) o;
        return Objects.equals(this.categoryId, collectorCategoryInfo.categoryId)
            && Objects.equals(this.categoryName, collectorCategoryInfo.categoryName)
            && Objects.equals(this.displayName, collectorCategoryInfo.displayName)
            && Objects.equals(this.sequence, collectorCategoryInfo.sequence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, categoryName, displayName, sequence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollectorCategoryInfo {\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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
