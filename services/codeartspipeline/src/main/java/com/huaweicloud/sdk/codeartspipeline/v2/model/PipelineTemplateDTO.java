package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * PipelineTemplateDTO
 */
public class PipelineTemplateDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variables")

    private CustomVariable variables;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "definition")

    private String definition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_system")

    private Boolean isSystem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_show_source")

    private Boolean isShowSource;

    public PipelineTemplateDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模板名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PipelineTemplateDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 模板描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PipelineTemplateDTO withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 模板语言
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public PipelineTemplateDTO withVariables(CustomVariable variables) {
        this.variables = variables;
        return this;
    }

    public PipelineTemplateDTO withVariables(Consumer<CustomVariable> variablesSetter) {
        if (this.variables == null) {
            this.variables = new CustomVariable();
            variablesSetter.accept(this.variables);
        }

        return this;
    }

    /**
     * Get variables
     * @return variables
     */
    public CustomVariable getVariables() {
        return variables;
    }

    public void setVariables(CustomVariable variables) {
        this.variables = variables;
    }

    public PipelineTemplateDTO withDefinition(String definition) {
        this.definition = definition;
        return this;
    }

    /**
     * 模板编排json，包含stages
     * @return definition
     */
    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public PipelineTemplateDTO withIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
        return this;
    }

    /**
     * 是否系统模板
     * @return isSystem
     */
    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public PipelineTemplateDTO withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 所属租户ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public PipelineTemplateDTO withIsShowSource(Boolean isShowSource) {
        this.isShowSource = isShowSource;
        return this;
    }

    /**
     * 是否显示流水线源
     * @return isShowSource
     */
    public Boolean getIsShowSource() {
        return isShowSource;
    }

    public void setIsShowSource(Boolean isShowSource) {
        this.isShowSource = isShowSource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PipelineTemplateDTO that = (PipelineTemplateDTO) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.language, that.language) && Objects.equals(this.variables, that.variables)
            && Objects.equals(this.definition, that.definition) && Objects.equals(this.isSystem, that.isSystem)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.isShowSource, that.isShowSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, language, variables, definition, isSystem, domainId, isShowSource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineTemplateDTO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
        sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
        sb.append("    isSystem: ").append(toIndentedString(isSystem)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    isShowSource: ").append(toIndentedString(isShowSource)).append("\n");
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
