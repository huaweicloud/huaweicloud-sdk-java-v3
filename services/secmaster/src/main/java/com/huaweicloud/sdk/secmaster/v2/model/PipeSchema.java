package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 管道模式
 */
public class PipeSchema {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "columns")

    private List<TableColumnForIsapPipe> columns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "watermark_column")

    private String watermarkColumn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "watermark_interval")

    private Float watermarkInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_filter")

    private String timeFilter;

    public PipeSchema withColumns(List<TableColumnForIsapPipe> columns) {
        this.columns = columns;
        return this;
    }

    public PipeSchema addColumnsItem(TableColumnForIsapPipe columnsItem) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        this.columns.add(columnsItem);
        return this;
    }

    public PipeSchema withColumns(Consumer<List<TableColumnForIsapPipe>> columnsSetter) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        columnsSetter.accept(this.columns);
        return this;
    }

    /**
     * 管道列
     * @return columns
     */
    public List<TableColumnForIsapPipe> getColumns() {
        return columns;
    }

    public void setColumns(List<TableColumnForIsapPipe> columns) {
        this.columns = columns;
    }

    public PipeSchema withWatermarkColumn(String watermarkColumn) {
        this.watermarkColumn = watermarkColumn;
        return this;
    }

    /**
     * 管道水线列
     * @return watermarkColumn
     */
    public String getWatermarkColumn() {
        return watermarkColumn;
    }

    public void setWatermarkColumn(String watermarkColumn) {
        this.watermarkColumn = watermarkColumn;
    }

    public PipeSchema withWatermarkInterval(Float watermarkInterval) {
        this.watermarkInterval = watermarkInterval;
        return this;
    }

    /**
     * 管道水线间隔时长
     * minimum: 0
     * maximum: 6E+1
     * @return watermarkInterval
     */
    public Float getWatermarkInterval() {
        return watermarkInterval;
    }

    public void setWatermarkInterval(Float watermarkInterval) {
        this.watermarkInterval = watermarkInterval;
    }

    public PipeSchema withTimeFilter(String timeFilter) {
        this.timeFilter = timeFilter;
        return this;
    }

    /**
     * 管道过滤列
     * @return timeFilter
     */
    public String getTimeFilter() {
        return timeFilter;
    }

    public void setTimeFilter(String timeFilter) {
        this.timeFilter = timeFilter;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PipeSchema that = (PipeSchema) obj;
        return Objects.equals(this.columns, that.columns) && Objects.equals(this.watermarkColumn, that.watermarkColumn)
            && Objects.equals(this.watermarkInterval, that.watermarkInterval)
            && Objects.equals(this.timeFilter, that.timeFilter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columns, watermarkColumn, watermarkInterval, timeFilter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipeSchema {\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    watermarkColumn: ").append(toIndentedString(watermarkColumn)).append("\n");
        sb.append("    watermarkInterval: ").append(toIndentedString(watermarkInterval)).append("\n");
        sb.append("    timeFilter: ").append(toIndentedString(timeFilter)).append("\n");
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
