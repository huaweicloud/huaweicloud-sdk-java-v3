package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 指标查询结果内容
 */
public class ShowMetricResultResponseBodyResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datarows")

    private List<List<Object>> datarows = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_column")

    private String effectiveColumn;

    public ShowMetricResultResponseBodyResult withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public ShowMetricResultResponseBodyResult addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public ShowMetricResultResponseBodyResult withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 指标查询结果表格标题
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public ShowMetricResultResponseBodyResult withDatarows(List<List<Object>> datarows) {
        this.datarows = datarows;
        return this;
    }

    public ShowMetricResultResponseBodyResult addDatarowsItem(List<Object> datarowsItem) {
        if (this.datarows == null) {
            this.datarows = new ArrayList<>();
        }
        this.datarows.add(datarowsItem);
        return this;
    }

    public ShowMetricResultResponseBodyResult withDatarows(Consumer<List<List<Object>>> datarowsSetter) {
        if (this.datarows == null) {
            this.datarows = new ArrayList<>();
        }
        datarowsSetter.accept(this.datarows);
        return this;
    }

    /**
     * 指标查询结果内容表格
     * @return datarows
     */
    public List<List<Object>> getDatarows() {
        return datarows;
    }

    public void setDatarows(List<List<Object>> datarows) {
        this.datarows = datarows;
    }

    public ShowMetricResultResponseBodyResult withEffectiveColumn(String effectiveColumn) {
        this.effectiveColumn = effectiveColumn;
        return this;
    }

    /**
     * 生效的列，当有该参数时，使用指定列作为指标数据结果
     * @return effectiveColumn
     */
    public String getEffectiveColumn() {
        return effectiveColumn;
    }

    public void setEffectiveColumn(String effectiveColumn) {
        this.effectiveColumn = effectiveColumn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMetricResultResponseBodyResult that = (ShowMetricResultResponseBodyResult) obj;
        return Objects.equals(this.labels, that.labels) && Objects.equals(this.datarows, that.datarows)
            && Objects.equals(this.effectiveColumn, that.effectiveColumn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labels, datarows, effectiveColumn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMetricResultResponseBodyResult {\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    datarows: ").append(toIndentedString(datarows)).append("\n");
        sb.append("    effectiveColumn: ").append(toIndentedString(effectiveColumn)).append("\n");
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
