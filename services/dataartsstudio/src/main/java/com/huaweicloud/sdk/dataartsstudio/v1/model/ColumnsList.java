package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * schema信息
 */
public class ColumnsList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_type")

    private String columnType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seq_number")

    private Integer seqNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary")

    private Boolean primary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_col")

    private Boolean partitionCol;

    public ColumnsList withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * 字段注解
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ColumnsList withColumnName(String columnName) {
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

    public ColumnsList withColumnType(String columnType) {
        this.columnType = columnType;
        return this;
    }

    /**
     * 字段类型
     * @return columnType
     */
    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public ColumnsList withSeqNumber(Integer seqNumber) {
        this.seqNumber = seqNumber;
        return this;
    }

    /**
     * 字段的顺序
     * minimum: 0
     * maximum: 100
     * @return seqNumber
     */
    public Integer getSeqNumber() {
        return seqNumber;
    }

    public void setSeqNumber(Integer seqNumber) {
        this.seqNumber = seqNumber;
    }

    public ColumnsList withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * 字段是否为主键
     * @return primary
     */
    public Boolean getPrimary() {
        return primary;
    }

    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    public ColumnsList withPartitionCol(Boolean partitionCol) {
        this.partitionCol = partitionCol;
        return this;
    }

    /**
     * 是否对字段进行分割
     * @return partitionCol
     */
    public Boolean getPartitionCol() {
        return partitionCol;
    }

    public void setPartitionCol(Boolean partitionCol) {
        this.partitionCol = partitionCol;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ColumnsList columnsList = (ColumnsList) o;
        return Objects.equals(this.comment, columnsList.comment)
            && Objects.equals(this.columnName, columnsList.columnName)
            && Objects.equals(this.columnType, columnsList.columnType)
            && Objects.equals(this.seqNumber, columnsList.seqNumber)
            && Objects.equals(this.primary, columnsList.primary)
            && Objects.equals(this.partitionCol, columnsList.partitionCol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comment, columnName, columnType, seqNumber, primary, partitionCol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ColumnsList {\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
        sb.append("    seqNumber: ").append(toIndentedString(seqNumber)).append("\n");
        sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
        sb.append("    partitionCol: ").append(toIndentedString(partitionCol)).append("\n");
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
