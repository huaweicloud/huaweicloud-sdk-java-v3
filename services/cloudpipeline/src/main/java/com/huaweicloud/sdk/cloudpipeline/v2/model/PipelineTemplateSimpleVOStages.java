package com.huaweicloud.sdk.cloudpipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PipelineTemplateSimpleVOStages
 */
public class PipelineTemplateSimpleVOStages {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private Integer sequence;

    public PipelineTemplateSimpleVOStages withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 阶段名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PipelineTemplateSimpleVOStages withSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

    /**
     * 序列号
     * @return sequence
     */
    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PipelineTemplateSimpleVOStages pipelineTemplateSimpleVOStages = (PipelineTemplateSimpleVOStages) o;
        return Objects.equals(this.name, pipelineTemplateSimpleVOStages.name)
            && Objects.equals(this.sequence, pipelineTemplateSimpleVOStages.sequence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sequence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineTemplateSimpleVOStages {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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
