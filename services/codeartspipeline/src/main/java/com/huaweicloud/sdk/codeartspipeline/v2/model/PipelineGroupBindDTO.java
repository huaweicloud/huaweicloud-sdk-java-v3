package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PipelineGroupBindDTO
 */
public class PipelineGroupBindDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipelines")

    private List<PipelineGroupBindDTOPipelines> pipelines = null;

    public PipelineGroupBindDTO withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 分组ID
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public PipelineGroupBindDTO withPipelines(List<PipelineGroupBindDTOPipelines> pipelines) {
        this.pipelines = pipelines;
        return this;
    }

    public PipelineGroupBindDTO addPipelinesItem(PipelineGroupBindDTOPipelines pipelinesItem) {
        if (this.pipelines == null) {
            this.pipelines = new ArrayList<>();
        }
        this.pipelines.add(pipelinesItem);
        return this;
    }

    public PipelineGroupBindDTO withPipelines(Consumer<List<PipelineGroupBindDTOPipelines>> pipelinesSetter) {
        if (this.pipelines == null) {
            this.pipelines = new ArrayList<>();
        }
        pipelinesSetter.accept(this.pipelines);
        return this;
    }

    /**
     * 流水线集合
     * @return pipelines
     */
    public List<PipelineGroupBindDTOPipelines> getPipelines() {
        return pipelines;
    }

    public void setPipelines(List<PipelineGroupBindDTOPipelines> pipelines) {
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
        PipelineGroupBindDTO that = (PipelineGroupBindDTO) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.pipelines, that.pipelines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, pipelines);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineGroupBindDTO {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
