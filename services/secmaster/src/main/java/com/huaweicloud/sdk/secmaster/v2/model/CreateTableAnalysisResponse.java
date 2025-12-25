package com.huaweicloud.sdk.secmaster.v2.model;

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
public class CreateTableAnalysisResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private List<SearchQueryField> schema = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datarows")

    private List<List<Object>> datarows = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "results")

    private List<SearchQueryResult> results = null;

    public CreateTableAnalysisResponse withSchema(List<SearchQueryField> schema) {
        this.schema = schema;
        return this;
    }

    public CreateTableAnalysisResponse addSchemaItem(SearchQueryField schemaItem) {
        if (this.schema == null) {
            this.schema = new ArrayList<>();
        }
        this.schema.add(schemaItem);
        return this;
    }

    public CreateTableAnalysisResponse withSchema(Consumer<List<SearchQueryField>> schemaSetter) {
        if (this.schema == null) {
            this.schema = new ArrayList<>();
        }
        schemaSetter.accept(this.schema);
        return this;
    }

    /**
     * 查询结果
     * @return schema
     */
    public List<SearchQueryField> getSchema() {
        return schema;
    }

    public void setSchema(List<SearchQueryField> schema) {
        this.schema = schema;
    }

    public CreateTableAnalysisResponse withDatarows(List<List<Object>> datarows) {
        this.datarows = datarows;
        return this;
    }

    public CreateTableAnalysisResponse addDatarowsItem(List<Object> datarowsItem) {
        if (this.datarows == null) {
            this.datarows = new ArrayList<>();
        }
        this.datarows.add(datarowsItem);
        return this;
    }

    public CreateTableAnalysisResponse withDatarows(Consumer<List<List<Object>>> datarowsSetter) {
        if (this.datarows == null) {
            this.datarows = new ArrayList<>();
        }
        datarowsSetter.accept(this.datarows);
        return this;
    }

    /**
     * 查询结果行
     * @return datarows
     */
    public List<List<Object>> getDatarows() {
        return datarows;
    }

    public void setDatarows(List<List<Object>> datarows) {
        this.datarows = datarows;
    }

    public CreateTableAnalysisResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
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

    public CreateTableAnalysisResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 总数
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

    public CreateTableAnalysisResponse withResults(List<SearchQueryResult> results) {
        this.results = results;
        return this;
    }

    public CreateTableAnalysisResponse addResultsItem(SearchQueryResult resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    public CreateTableAnalysisResponse withResults(Consumer<List<SearchQueryResult>> resultsSetter) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * 结果列表
     * @return results
     */
    public List<SearchQueryResult> getResults() {
        return results;
    }

    public void setResults(List<SearchQueryResult> results) {
        this.results = results;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTableAnalysisResponse that = (CreateTableAnalysisResponse) obj;
        return Objects.equals(this.schema, that.schema) && Objects.equals(this.datarows, that.datarows)
            && Objects.equals(this.total, that.total) && Objects.equals(this.size, that.size)
            && Objects.equals(this.results, that.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schema, datarows, total, size, results);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTableAnalysisResponse {\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    datarows: ").append(toIndentedString(datarows)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
