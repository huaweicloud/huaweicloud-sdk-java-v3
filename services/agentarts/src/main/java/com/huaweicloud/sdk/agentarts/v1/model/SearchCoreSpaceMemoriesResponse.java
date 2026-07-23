package com.huaweicloud.sdk.agentarts.v1.model;

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
public class SearchCoreSpaceMemoriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "results")

    private List<MemorySearchRespResults> results = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public SearchCoreSpaceMemoriesResponse withResults(List<MemorySearchRespResults> results) {
        this.results = results;
        return this;
    }

    public SearchCoreSpaceMemoriesResponse addResultsItem(MemorySearchRespResults resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    public SearchCoreSpaceMemoriesResponse withResults(Consumer<List<MemorySearchRespResults>> resultsSetter) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * **参数解释：** 检索结果（按 Rerank 分数降序）。 **约束限制：** 不涉及。 **取值范围：** 0-100个。 **默认取值：** 不涉及。 
     * @return results
     */
    public List<MemorySearchRespResults> getResults() {
        return results;
    }

    public void setResults(List<MemorySearchRespResults> results) {
        this.results = results;
    }

    public SearchCoreSpaceMemoriesResponse withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * **参数解释：**  原始查询文本，与请求中的 query 参数一致。 **约束限制：**  不涉及。 **取值范围：** 长度0-2000字符。 **默认取值：** 0-2000 字符。 
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public SearchCoreSpaceMemoriesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：**  符合条件的搜索结果总数，用于计算总页数。 **约束限制：**  不涉及。 **取值范围：**  0-2147483647 **默认取值：**  0-2147483647 
     * minimum: 0
     * maximum: 2147483647
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
        SearchCoreSpaceMemoriesResponse that = (SearchCoreSpaceMemoriesResponse) obj;
        return Objects.equals(this.results, that.results) && Objects.equals(this.query, that.query)
            && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results, query, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchCoreSpaceMemoriesResponse {\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
