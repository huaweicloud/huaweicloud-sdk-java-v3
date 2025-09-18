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
     * **参数解释**： 起始偏移。 **取值范围**： 不涉及。 
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
     * **参数解释**： 查询大小。 **取值范围**： 不涉及。 
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
     * **参数解释**： 执行记录总数。 **取值范围**： 不涉及。 
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
     * **参数解释**： 流水线运行信息列表。 **取值范围**： 不涉及。 
     * @return pipelineRuns
     */
    public List<ListPipelineRunsPagePipelineRuns> getPipelineRuns() {
        return pipelineRuns;
    }

    public void setPipelineRuns(List<ListPipelineRunsPagePipelineRuns> pipelineRuns) {
        this.pipelineRuns = pipelineRuns;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPipelineRunsResponse that = (ListPipelineRunsResponse) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.total, that.total) && Objects.equals(this.pipelineRuns, that.pipelineRuns);
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
