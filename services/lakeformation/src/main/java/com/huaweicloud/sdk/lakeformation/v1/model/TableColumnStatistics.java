package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 表中列的统计
 */
public class TableColumnStatistics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_statistics_desc")

    private TableColumnStatisticsDescription columnStatisticsDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_statistics_objects")

    private List<ColumnStatisticsObj> columnStatisticsObjects = null;

    public TableColumnStatistics withColumnStatisticsDesc(TableColumnStatisticsDescription columnStatisticsDesc) {
        this.columnStatisticsDesc = columnStatisticsDesc;
        return this;
    }

    public TableColumnStatistics withColumnStatisticsDesc(
        Consumer<TableColumnStatisticsDescription> columnStatisticsDescSetter) {
        if (this.columnStatisticsDesc == null) {
            this.columnStatisticsDesc = new TableColumnStatisticsDescription();
            columnStatisticsDescSetter.accept(this.columnStatisticsDesc);
        }

        return this;
    }

    /**
     * Get columnStatisticsDesc
     * @return columnStatisticsDesc
     */
    public TableColumnStatisticsDescription getColumnStatisticsDesc() {
        return columnStatisticsDesc;
    }

    public void setColumnStatisticsDesc(TableColumnStatisticsDescription columnStatisticsDesc) {
        this.columnStatisticsDesc = columnStatisticsDesc;
    }

    public TableColumnStatistics withColumnStatisticsObjects(List<ColumnStatisticsObj> columnStatisticsObjects) {
        this.columnStatisticsObjects = columnStatisticsObjects;
        return this;
    }

    public TableColumnStatistics addColumnStatisticsObjectsItem(ColumnStatisticsObj columnStatisticsObjectsItem) {
        if (this.columnStatisticsObjects == null) {
            this.columnStatisticsObjects = new ArrayList<>();
        }
        this.columnStatisticsObjects.add(columnStatisticsObjectsItem);
        return this;
    }

    public TableColumnStatistics withColumnStatisticsObjects(
        Consumer<List<ColumnStatisticsObj>> columnStatisticsObjectsSetter) {
        if (this.columnStatisticsObjects == null) {
            this.columnStatisticsObjects = new ArrayList<>();
        }
        columnStatisticsObjectsSetter.accept(this.columnStatisticsObjects);
        return this;
    }

    /**
     * 列统计信息
     * @return columnStatisticsObjects
     */
    public List<ColumnStatisticsObj> getColumnStatisticsObjects() {
        return columnStatisticsObjects;
    }

    public void setColumnStatisticsObjects(List<ColumnStatisticsObj> columnStatisticsObjects) {
        this.columnStatisticsObjects = columnStatisticsObjects;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TableColumnStatistics tableColumnStatistics = (TableColumnStatistics) o;
        return Objects.equals(this.columnStatisticsDesc, tableColumnStatistics.columnStatisticsDesc)
            && Objects.equals(this.columnStatisticsObjects, tableColumnStatistics.columnStatisticsObjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnStatisticsDesc, columnStatisticsObjects);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableColumnStatistics {\n");
        sb.append("    columnStatisticsDesc: ").append(toIndentedString(columnStatisticsDesc)).append("\n");
        sb.append("    columnStatisticsObjects: ").append(toIndentedString(columnStatisticsObjects)).append("\n");
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
