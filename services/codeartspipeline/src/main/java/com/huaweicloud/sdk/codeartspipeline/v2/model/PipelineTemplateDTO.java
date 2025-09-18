package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
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

    private List<CustomVariable> variables = null;

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
     * **参数解释**： 模板名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
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
     * **参数解释**： 模板描述。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
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
     * **参数解释**： 模板语言。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public PipelineTemplateDTO withVariables(List<CustomVariable> variables) {
        this.variables = variables;
        return this;
    }

    public PipelineTemplateDTO addVariablesItem(CustomVariable variablesItem) {
        if (this.variables == null) {
            this.variables = new ArrayList<>();
        }
        this.variables.add(variablesItem);
        return this;
    }

    public PipelineTemplateDTO withVariables(Consumer<List<CustomVariable>> variablesSetter) {
        if (this.variables == null) {
            this.variables = new ArrayList<>();
        }
        variablesSetter.accept(this.variables);
        return this;
    }

    /**
     * **参数解释**： 自定义参数。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return variables
     */
    public List<CustomVariable> getVariables() {
        return variables;
    }

    public void setVariables(List<CustomVariable> variables) {
        this.variables = variables;
    }

    public PipelineTemplateDTO withDefinition(String definition) {
        this.definition = definition;
        return this;
    }

    /**
     * **参数解释**： 模板编排json，包含stages。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
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
     * **参数解释**： 是否系统模板。 **约束限制**： 不涉及。 **取值范围**： - true：是系统模板。 - false：不是系统模板。 **默认取值**： 不涉及。 
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
     * **参数解释**： 租户id。 **约束限制**： 不涉及。 **取值范围**： 32位字符，由数字和字母组成。 **默认取值**： 不涉及。 
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
     * **参数解释**： 是否显示流水线源。 **约束限制**： 不涉及。 **取值范围**： - true：显示流水线源。 - false：不显示流水线源。 **默认取值**： 不涉及。 
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
