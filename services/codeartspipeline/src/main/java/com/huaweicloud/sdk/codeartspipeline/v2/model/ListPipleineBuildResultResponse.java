package com.huaweicloud.sdk.codeartspipeline.v2.model;

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
public class ListPipleineBuildResultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_results")

    private List<PipelineBuildResult> buildResults = null;

    public ListPipleineBuildResultResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量,表示从此偏移量开始查询,offset大于等于0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListPipleineBuildResultResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每次查询的条目数量
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListPipleineBuildResultResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总条目数量
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListPipleineBuildResultResponse withBuildResults(List<PipelineBuildResult> buildResults) {
        this.buildResults = buildResults;
        return this;
    }

    public ListPipleineBuildResultResponse addBuildResultsItem(PipelineBuildResult buildResultsItem) {
        if (this.buildResults == null) {
            this.buildResults = new ArrayList<>();
        }
        this.buildResults.add(buildResultsItem);
        return this;
    }

    public ListPipleineBuildResultResponse withBuildResults(Consumer<List<PipelineBuildResult>> buildResultsSetter) {
        if (this.buildResults == null) {
            this.buildResults = new ArrayList<>();
        }
        buildResultsSetter.accept(this.buildResults);
        return this;
    }

    /**
     * 执行状况数据列表
     * @return buildResults
     */
    public List<PipelineBuildResult> getBuildResults() {
        return buildResults;
    }

    public void setBuildResults(List<PipelineBuildResult> buildResults) {
        this.buildResults = buildResults;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPipleineBuildResultResponse that = (ListPipleineBuildResultResponse) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.total, that.total) && Objects.equals(this.buildResults, that.buildResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, total, buildResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPipleineBuildResultResponse {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    buildResults: ").append(toIndentedString(buildResults)).append("\n");
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
