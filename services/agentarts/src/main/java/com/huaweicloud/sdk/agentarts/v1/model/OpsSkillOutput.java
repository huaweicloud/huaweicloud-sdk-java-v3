package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OpsSkillOutput
 */
public class OpsSkillOutput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "explanation")

    private String explanation;

    public OpsSkillOutput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 技能的名称。  **约束限制：** 不涉及。  **取值范围：** 长度在1-256个字符。  **默认取值：** 无。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OpsSkillOutput withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 技能的描述内容。  **约束限制：** 不涉及。  **取值范围：** 长度在1-1024个字符。  **默认取值：** 无。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OpsSkillOutput withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * **参数解释：** 技能的SKILL.md文件内容。  **约束限制：** 不涉及。  **取值范围：** 长度在1-10000个字符。  **默认取值：** 无。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public OpsSkillOutput withExplanation(String explanation) {
        this.explanation = explanation;
        return this;
    }

    /**
     * **参数解释：** 优化的原因。  **取值范围：** 长度在0-4096个字符。
     * @return explanation
     */
    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsSkillOutput that = (OpsSkillOutput) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.content, that.content) && Objects.equals(this.explanation, that.explanation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, content, explanation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsSkillOutput {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
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
