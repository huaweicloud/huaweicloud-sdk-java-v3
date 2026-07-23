package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EvaluationOpsSynthesisSchema
 */
public class EvaluationOpsSynthesisSchema {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "synthesis_requirement")

    private String synthesisRequirement;

    public EvaluationOpsSynthesisSchema withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：**   合成字段的id。 **取值范围：**   由字母、数字、下划线组成。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EvaluationOpsSynthesisSchema withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：**   合成字段的名称。 **取值范围：**   长度1-100字符，由字母、数字、下划线组成。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EvaluationOpsSynthesisSchema withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：**   合成字段的业务含义描述。 **取值范围：**   任意字符串。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EvaluationOpsSynthesisSchema withSynthesisRequirement(String synthesisRequirement) {
        this.synthesisRequirement = synthesisRequirement;
        return this;
    }

    /**
     * **参数解释：**   合成要求，用于指导LLM生成该字段的思考路径。 **取值范围：**   0-4000字符，详细的指令说明。
     * @return synthesisRequirement
     */
    public String getSynthesisRequirement() {
        return synthesisRequirement;
    }

    public void setSynthesisRequirement(String synthesisRequirement) {
        this.synthesisRequirement = synthesisRequirement;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EvaluationOpsSynthesisSchema that = (EvaluationOpsSynthesisSchema) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.synthesisRequirement, that.synthesisRequirement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, synthesisRequirement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluationOpsSynthesisSchema {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    synthesisRequirement: ").append(toIndentedString(synthesisRequirement)).append("\n");
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
