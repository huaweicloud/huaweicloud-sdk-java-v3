package com.huaweicloud.sdk.css.v1.model;

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
    @JsonProperty(value = "pipelines")

    private List<Pipelines> pipelines = null;

    public ListPipelinesResponse withPipelines(List<Pipelines> pipelines) {
        this.pipelines = pipelines;
        return this;
    }

    public ListPipelinesResponse addPipelinesItem(Pipelines pipelinesItem) {
        if (this.pipelines == null) {
            this.pipelines = new ArrayList<>();
        }
        this.pipelines.add(pipelinesItem);
        return this;
    }

    public ListPipelinesResponse withPipelines(Consumer<List<Pipelines>> pipelinesSetter) {
        if (this.pipelines == null) {
            this.pipelines = new ArrayList<>();
        }
        pipelinesSetter.accept(this.pipelines);
        return this;
    }

    /**
     * pipeline列表。
     * @return pipelines
     */
    public List<Pipelines> getPipelines() {
        return pipelines;
    }

    public void setPipelines(List<Pipelines> pipelines) {
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
        return Objects.equals(this.pipelines, that.pipelines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pipelines);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPipelinesResponse {\n");
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
