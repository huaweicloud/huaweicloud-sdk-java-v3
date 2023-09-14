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
public class ListPipelinesResponse extends SdkResponse {

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
    @JsonProperty(value = "pipelines")

    private List<ListPipelinesPagePipelines> pipelines = null;

    public ListPipelinesResponse withOffset(Integer offset) {
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

    public ListPipelinesResponse withLimit(Integer limit) {
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

    public ListPipelinesResponse withTotal(Integer total) {
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

    public ListPipelinesResponse withPipelines(List<ListPipelinesPagePipelines> pipelines) {
        this.pipelines = pipelines;
        return this;
    }

    public ListPipelinesResponse addPipelinesItem(ListPipelinesPagePipelines pipelinesItem) {
        if (this.pipelines == null) {
            this.pipelines = new ArrayList<>();
        }
        this.pipelines.add(pipelinesItem);
        return this;
    }

    public ListPipelinesResponse withPipelines(Consumer<List<ListPipelinesPagePipelines>> pipelinesSetter) {
        if (this.pipelines == null) {
            this.pipelines = new ArrayList<>();
        }
        pipelinesSetter.accept(this.pipelines);
        return this;
    }

    /**
     * 流水线
     * @return pipelines
     */
    public List<ListPipelinesPagePipelines> getPipelines() {
        return pipelines;
    }

    public void setPipelines(List<ListPipelinesPagePipelines> pipelines) {
        this.pipelines = pipelines;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPipelinesResponse that = (ListPipelinesResponse) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.total, that.total) && Objects.equals(this.pipelines, that.pipelines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, total, pipelines);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPipelinesResponse {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    pipelines: ").append(toIndentedString(pipelines)).append("\n");
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
