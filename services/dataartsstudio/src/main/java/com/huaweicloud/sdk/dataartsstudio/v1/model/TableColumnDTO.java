package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 字段信息
 */
public class TableColumnDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_partition_column")

    private Boolean isPartitionColumn;

    public TableColumnDTO withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * 字段名称
     * @return columnName
     */
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public TableColumnDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 字段描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TableColumnDTO withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 字段类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TableColumnDTO withIsPartitionColumn(Boolean isPartitionColumn) {
        this.isPartitionColumn = isPartitionColumn;
        return this;
    }

    /**
     * 是否是分区字段
     * @return isPartitionColumn
     */
    public Boolean getIsPartitionColumn() {
        return isPartitionColumn;
    }

    public void setIsPartitionColumn(Boolean isPartitionColumn) {
        this.isPartitionColumn = isPartitionColumn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TableColumnDTO that = (TableColumnDTO) obj;
        return Objects.equals(this.columnName, that.columnName) && Objects.equals(this.description, that.description)
            && Objects.equals(this.type, that.type) && Objects.equals(this.isPartitionColumn, that.isPartitionColumn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnName, description, type, isPartitionColumn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableColumnDTO {\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    isPartitionColumn: ").append(toIndentedString(isPartitionColumn)).append("\n");
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
