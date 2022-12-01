package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListEventSpecsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_name")

    private String specName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private String sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    public ListEventSpecsRequest withSpecName(String specName) {
        this.specName = specName;
        return this;
    }

    /**
     * 事件配置名称
     * @return specName
     */
    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public ListEventSpecsRequest withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 事件类别
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ListEventSpecsRequest withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 事件级别
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public ListEventSpecsRequest withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 事件源类别
     * @return sourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public ListEventSpecsRequest withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 事件标签
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEventSpecsRequest listEventSpecsRequest = (ListEventSpecsRequest) o;
        return Objects.equals(this.specName, listEventSpecsRequest.specName)
            && Objects.equals(this.category, listEventSpecsRequest.category)
            && Objects.equals(this.severity, listEventSpecsRequest.severity)
            && Objects.equals(this.sourceType, listEventSpecsRequest.sourceType)
            && Objects.equals(this.tag, listEventSpecsRequest.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specName, category, severity, sourceType, tag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEventSpecsRequest {\n");
        sb.append("    specName: ").append(toIndentedString(specName)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
