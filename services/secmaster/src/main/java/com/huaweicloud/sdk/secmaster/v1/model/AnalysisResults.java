package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分析结果
 */
public class AnalysisResults {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datarows")

    private List<List<Object>> datarows = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private List<AnalysisField> schema = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public AnalysisResults withDatarows(List<List<Object>> datarows) {
        this.datarows = datarows;
        return this;
    }

    public AnalysisResults addDatarowsItem(List<Object> datarowsItem) {
        if (this.datarows == null) {
            this.datarows = new ArrayList<>();
        }
        this.datarows.add(datarowsItem);
        return this;
    }

    public AnalysisResults withDatarows(Consumer<List<List<Object>>> datarowsSetter) {
        if (this.datarows == null) {
            this.datarows = new ArrayList<>();
        }
        datarowsSetter.accept(this.datarows);
        return this;
    }

    /**
     * 统计分析结果数据
     * @return datarows
     */
    public List<List<Object>> getDatarows() {
        return datarows;
    }

    public void setDatarows(List<List<Object>> datarows) {
        this.datarows = datarows;
    }

    public AnalysisResults withSchema(List<AnalysisField> schema) {
        this.schema = schema;
        return this;
    }

    public AnalysisResults addSchemaItem(AnalysisField schemaItem) {
        if (this.schema == null) {
            this.schema = new ArrayList<>();
        }
        this.schema.add(schemaItem);
        return this;
    }

    public AnalysisResults withSchema(Consumer<List<AnalysisField>> schemaSetter) {
        if (this.schema == null) {
            this.schema = new ArrayList<>();
        }
        schemaSetter.accept(this.schema);
        return this;
    }

    /**
     * 统计分析结果字段类型
     * @return schema
     */
    public List<AnalysisField> getSchema() {
        return schema;
    }

    public void setSchema(List<AnalysisField> schema) {
        this.schema = schema;
    }

    public AnalysisResults withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 返回的统计分析结果条数
     * minimum: 0
     * maximum: 500
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public AnalysisResults withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 统计分析结果总数
     * minimum: 0
     * maximum: 10000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnalysisResults that = (AnalysisResults) obj;
        return Objects.equals(this.datarows, that.datarows) && Objects.equals(this.schema, that.schema)
            && Objects.equals(this.size, that.size) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datarows, schema, size, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnalysisResults {\n");
        sb.append("    datarows: ").append(toIndentedString(datarows)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
