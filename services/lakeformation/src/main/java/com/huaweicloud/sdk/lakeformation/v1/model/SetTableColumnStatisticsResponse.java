package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class SetTableColumnStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_statistics_desc")

    private TableColumnStatisticsDescription columnStatisticsDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_statistics_objects")

    private List<ColumnStatisticsObj> columnStatisticsObjects = null;

    public SetTableColumnStatisticsResponse withColumnStatisticsDesc(
        TableColumnStatisticsDescription columnStatisticsDesc) {
        this.columnStatisticsDesc = columnStatisticsDesc;
        return this;
    }

    public SetTableColumnStatisticsResponse withColumnStatisticsDesc(
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

    public SetTableColumnStatisticsResponse withColumnStatisticsObjects(
        List<ColumnStatisticsObj> columnStatisticsObjects) {
        this.columnStatisticsObjects = columnStatisticsObjects;
        return this;
    }

    public SetTableColumnStatisticsResponse addColumnStatisticsObjectsItem(
        ColumnStatisticsObj columnStatisticsObjectsItem) {
        if (this.columnStatisticsObjects == null) {
            this.columnStatisticsObjects = new ArrayList<>();
        }
        this.columnStatisticsObjects.add(columnStatisticsObjectsItem);
        return this;
    }

    public SetTableColumnStatisticsResponse withColumnStatisticsObjects(
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetTableColumnStatisticsResponse that = (SetTableColumnStatisticsResponse) obj;
        return Objects.equals(this.columnStatisticsDesc, that.columnStatisticsDesc)
            && Objects.equals(this.columnStatisticsObjects, that.columnStatisticsObjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnStatisticsDesc, columnStatisticsObjects);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetTableColumnStatisticsResponse {\n");
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
