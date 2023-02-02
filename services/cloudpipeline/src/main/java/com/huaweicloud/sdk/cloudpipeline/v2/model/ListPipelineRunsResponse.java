package com.huaweicloud.sdk.cloudpipeline.v2.model;

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
public class ListPipelineRunsResponse extends SdkResponse {

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
    @JsonProperty(value = "pipeline_runs")

    private List<ListPipelineRunsPagePipelineRuns> pipelineRuns = null;

    public ListPipelineRunsResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 起始偏移
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListPipelineRunsResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询大小
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListPipelineRunsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListPipelineRunsResponse withPipelineRuns(List<ListPipelineRunsPagePipelineRuns> pipelineRuns) {
        this.pipelineRuns = pipelineRuns;
        return this;
    }

    public ListPipelineRunsResponse addPipelineRunsItem(ListPipelineRunsPagePipelineRuns pipelineRunsItem) {
        if (this.pipelineRuns == null) {
            this.pipelineRuns = new ArrayList<>();
        }
        this.pipelineRuns.add(pipelineRunsItem);
        return this;
    }

    public ListPipelineRunsResponse withPipelineRuns(
        Consumer<List<ListPipelineRunsPagePipelineRuns>> pipelineRunsSetter) {
        if (this.pipelineRuns == null) {
            this.pipelineRuns = new ArrayList<>();
        }
        pipelineRunsSetter.accept(this.pipelineRuns);
        return this;
    }

    /**
     * 流水线运行信息
     * @return pipelineRuns
     */
    public List<ListPipelineRunsPagePipelineRuns> getPipelineRuns() {
        return pipelineRuns;
    }

    public void setPipelineRuns(List<ListPipelineRunsPagePipelineRuns> pipelineRuns) {
        this.pipelineRuns = pipelineRuns;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPipelineRunsResponse listPipelineRunsResponse = (ListPipelineRunsResponse) o;
        return Objects.equals(this.offset, listPipelineRunsResponse.offset)
            && Objects.equals(this.limit, listPipelineRunsResponse.limit)
            && Objects.equals(this.total, listPipelineRunsResponse.total)
            && Objects.equals(this.pipelineRuns, listPipelineRunsResponse.pipelineRuns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, total, pipelineRuns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPipelineRunsResponse {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    pipelineRuns: ").append(toIndentedString(pipelineRuns)).append("\n");
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
