package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * study作业最值信息
 */
public class ExtremumDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Double value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "row_number")

    private Long rowNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "row_name")

    private String rowName;

    public ExtremumDto withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * 最值
     * @return value
     */
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public ExtremumDto withRowNumber(Long rowNumber) {
        this.rowNumber = rowNumber;
        return this;
    }

    /**
     * 最值所在的行数
     * @return rowNumber
     */
    public Long getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(Long rowNumber) {
        this.rowNumber = rowNumber;
    }

    public ExtremumDto withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * 最值所在的列名
     * @return columnName
     */
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public ExtremumDto withRowName(String rowName) {
        this.rowName = rowName;
        return this;
    }

    /**
     * 最值所在的行名
     * @return rowName
     */
    public String getRowName() {
        return rowName;
    }

    public void setRowName(String rowName) {
        this.rowName = rowName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtremumDto extremumDto = (ExtremumDto) o;
        return Objects.equals(this.value, extremumDto.value) && Objects.equals(this.rowNumber, extremumDto.rowNumber)
            && Objects.equals(this.columnName, extremumDto.columnName)
            && Objects.equals(this.rowName, extremumDto.rowName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, rowNumber, columnName, rowName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtremumDto {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    rowNumber: ").append(toIndentedString(rowNumber)).append("\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    rowName: ").append(toIndentedString(rowName)).append("\n");
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
