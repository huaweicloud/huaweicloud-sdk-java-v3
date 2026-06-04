package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 分区规范字段，用于定义如何从源字段生成分区字段。
 */
public class IcebergPartitionField {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private Integer sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_id")

    private Integer fieldId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transform")

    private String transform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public IcebergPartitionField withSourceId(Integer sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 源字段的id。
     * minimum: 0
     * maximum: 2147483647
     * @return sourceId
     */
    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public IcebergPartitionField withFieldId(Integer fieldId) {
        this.fieldId = fieldId;
        return this;
    }

    /**
     * 分区字段的id。
     * minimum: 0
     * maximum: 2147483647
     * @return fieldId
     */
    public Integer getFieldId() {
        return fieldId;
    }

    public void setFieldId(Integer fieldId) {
        this.fieldId = fieldId;
    }

    public IcebergPartitionField withTransform(String transform) {
        this.transform = transform;
        return this;
    }

    /**
     * 转换函数。
     * @return transform
     */
    public String getTransform() {
        return transform;
    }

    public void setTransform(String transform) {
        this.transform = transform;
    }

    public IcebergPartitionField withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 分区字段名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IcebergPartitionField that = (IcebergPartitionField) obj;
        return Objects.equals(this.sourceId, that.sourceId) && Objects.equals(this.fieldId, that.fieldId)
            && Objects.equals(this.transform, that.transform) && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceId, fieldId, transform, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IcebergPartitionField {\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
        sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
