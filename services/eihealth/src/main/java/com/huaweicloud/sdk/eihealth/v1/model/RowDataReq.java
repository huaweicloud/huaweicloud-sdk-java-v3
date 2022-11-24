package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RowDataReq
 */
public class RowDataReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_values")

    private List<ColumnValueDto> columnValues = null;

    public RowDataReq withColumnValues(List<ColumnValueDto> columnValues) {
        this.columnValues = columnValues;
        return this;
    }

    public RowDataReq addColumnValuesItem(ColumnValueDto columnValuesItem) {
        if (this.columnValues == null) {
            this.columnValues = new ArrayList<>();
        }
        this.columnValues.add(columnValuesItem);
        return this;
    }

    public RowDataReq withColumnValues(Consumer<List<ColumnValueDto>> columnValuesSetter) {
        if (this.columnValues == null) {
            this.columnValues = new ArrayList<>();
        }
        columnValuesSetter.accept(this.columnValues);
        return this;
    }

    /**
     * 列及对应值列表
     * @return columnValues
     */
    public List<ColumnValueDto> getColumnValues() {
        return columnValues;
    }

    public void setColumnValues(List<ColumnValueDto> columnValues) {
        this.columnValues = columnValues;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RowDataReq rowDataReq = (RowDataReq) o;
        return Objects.equals(this.columnValues, rowDataReq.columnValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnValues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RowDataReq {\n");
        sb.append("    columnValues: ").append(toIndentedString(columnValues)).append("\n");
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
