package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MappingInfo
 */
public class MappingInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_column")

    private String sourceColumn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_column_type")

    private String sourceColumnType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_column_length")

    private String sourceColumnLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_column")

    private String targetColumn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_column_type")

    private String targetColumnType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_column_length")

    private String targetColumnLength;

    public MappingInfo withSourceColumn(String sourceColumn) {
        this.sourceColumn = sourceColumn;
        return this;
    }

    /**
     * 源端字段
     * @return sourceColumn
     */
    public String getSourceColumn() {
        return sourceColumn;
    }

    public void setSourceColumn(String sourceColumn) {
        this.sourceColumn = sourceColumn;
    }

    public MappingInfo withSourceColumnType(String sourceColumnType) {
        this.sourceColumnType = sourceColumnType;
        return this;
    }

    /**
     * 源端字段类型
     * @return sourceColumnType
     */
    public String getSourceColumnType() {
        return sourceColumnType;
    }

    public void setSourceColumnType(String sourceColumnType) {
        this.sourceColumnType = sourceColumnType;
    }

    public MappingInfo withSourceColumnLength(String sourceColumnLength) {
        this.sourceColumnLength = sourceColumnLength;
        return this;
    }

    /**
     * 源端字段长度
     * @return sourceColumnLength
     */
    public String getSourceColumnLength() {
        return sourceColumnLength;
    }

    public void setSourceColumnLength(String sourceColumnLength) {
        this.sourceColumnLength = sourceColumnLength;
    }

    public MappingInfo withTargetColumn(String targetColumn) {
        this.targetColumn = targetColumn;
        return this;
    }

    /**
     * 目标端字段
     * @return targetColumn
     */
    public String getTargetColumn() {
        return targetColumn;
    }

    public void setTargetColumn(String targetColumn) {
        this.targetColumn = targetColumn;
    }

    public MappingInfo withTargetColumnType(String targetColumnType) {
        this.targetColumnType = targetColumnType;
        return this;
    }

    /**
     * 目标端字段类型
     * @return targetColumnType
     */
    public String getTargetColumnType() {
        return targetColumnType;
    }

    public void setTargetColumnType(String targetColumnType) {
        this.targetColumnType = targetColumnType;
    }

    public MappingInfo withTargetColumnLength(String targetColumnLength) {
        this.targetColumnLength = targetColumnLength;
        return this;
    }

    /**
     * 目标端字段长度
     * @return targetColumnLength
     */
    public String getTargetColumnLength() {
        return targetColumnLength;
    }

    public void setTargetColumnLength(String targetColumnLength) {
        this.targetColumnLength = targetColumnLength;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MappingInfo mappingInfo = (MappingInfo) o;
        return Objects.equals(this.sourceColumn, mappingInfo.sourceColumn)
            && Objects.equals(this.sourceColumnType, mappingInfo.sourceColumnType)
            && Objects.equals(this.sourceColumnLength, mappingInfo.sourceColumnLength)
            && Objects.equals(this.targetColumn, mappingInfo.targetColumn)
            && Objects.equals(this.targetColumnType, mappingInfo.targetColumnType)
            && Objects.equals(this.targetColumnLength, mappingInfo.targetColumnLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceColumn,
            sourceColumnType,
            sourceColumnLength,
            targetColumn,
            targetColumnType,
            targetColumnLength);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MappingInfo {\n");
        sb.append("    sourceColumn: ").append(toIndentedString(sourceColumn)).append("\n");
        sb.append("    sourceColumnType: ").append(toIndentedString(sourceColumnType)).append("\n");
        sb.append("    sourceColumnLength: ").append(toIndentedString(sourceColumnLength)).append("\n");
        sb.append("    targetColumn: ").append(toIndentedString(targetColumn)).append("\n");
        sb.append("    targetColumnType: ").append(toIndentedString(targetColumnType)).append("\n");
        sb.append("    targetColumnLength: ").append(toIndentedString(targetColumnLength)).append("\n");
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
