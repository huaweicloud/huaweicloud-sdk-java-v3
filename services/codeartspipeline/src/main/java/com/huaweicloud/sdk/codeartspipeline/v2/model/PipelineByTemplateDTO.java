package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PipelineByTemplateDTO
 */
public class PipelineByTemplateDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_publish")

    private Boolean isPublish;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sources")

    private List<CodeSource> sources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variables")

    private List<PipelineByTemplateDTOVariables> variables = null;

    public PipelineByTemplateDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 流水线名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PipelineByTemplateDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 流水线描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PipelineByTemplateDTO withIsPublish(Boolean isPublish) {
        this.isPublish = isPublish;
        return this;
    }

    /**
     * 是否为变更流水线
     * @return isPublish
     */
    public Boolean getIsPublish() {
        return isPublish;
    }

    public void setIsPublish(Boolean isPublish) {
        this.isPublish = isPublish;
    }

    public PipelineByTemplateDTO withSources(List<CodeSource> sources) {
        this.sources = sources;
        return this;
    }

    public PipelineByTemplateDTO addSourcesItem(CodeSource sourcesItem) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    public PipelineByTemplateDTO withSources(Consumer<List<CodeSource>> sourcesSetter) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        sourcesSetter.accept(this.sources);
        return this;
    }

    /**
     * 流水线源
     * @return sources
     */
    public List<CodeSource> getSources() {
        return sources;
    }

    public void setSources(List<CodeSource> sources) {
        this.sources = sources;
    }

    public PipelineByTemplateDTO withVariables(List<PipelineByTemplateDTOVariables> variables) {
        this.variables = variables;
        return this;
    }

    public PipelineByTemplateDTO addVariablesItem(PipelineByTemplateDTOVariables variablesItem) {
        if (this.variables == null) {
            this.variables = new ArrayList<>();
        }
        this.variables.add(variablesItem);
        return this;
    }

    public PipelineByTemplateDTO withVariables(Consumer<List<PipelineByTemplateDTOVariables>> variablesSetter) {
        if (this.variables == null) {
            this.variables = new ArrayList<>();
        }
        variablesSetter.accept(this.variables);
        return this;
    }

    /**
     * 流水线参数
     * @return variables
     */
    public List<PipelineByTemplateDTOVariables> getVariables() {
        return variables;
    }

    public void setVariables(List<PipelineByTemplateDTOVariables> variables) {
        this.variables = variables;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PipelineByTemplateDTO that = (PipelineByTemplateDTO) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.isPublish, that.isPublish) && Objects.equals(this.sources, that.sources)
            && Objects.equals(this.variables, that.variables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, isPublish, sources, variables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineByTemplateDTO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isPublish: ").append(toIndentedString(isPublish)).append("\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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
