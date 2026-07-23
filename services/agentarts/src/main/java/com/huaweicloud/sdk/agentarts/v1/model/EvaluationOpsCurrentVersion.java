package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 评估器当前生效版本的详细配置结构体。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class EvaluationOpsCurrentVersion {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_content")

    private Object evaluatorContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public EvaluationOpsCurrentVersion withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 当前版本的详细描述信息。 **约束限制：** 长度为0到10000个字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EvaluationOpsCurrentVersion withEvaluatorContent(Object evaluatorContent) {
        this.evaluatorContent = evaluatorContent;
        return this;
    }

    /**
     * **参数解释：** 评估器的核心配置JSON内容，包含评估逻辑、评分规则等配置项。 **约束限制：** 符合评估器配置JSON结构定义。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return evaluatorContent
     */
    public Object getEvaluatorContent() {
        return evaluatorContent;
    }

    public void setEvaluatorContent(Object evaluatorContent) {
        this.evaluatorContent = evaluatorContent;
    }

    public EvaluationOpsCurrentVersion withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释：** 评估器的版本标识符。 **约束限制：** 0到10000字符。 **取值范围：** 符合语义化版本格式的字符串，如\"v1.0.0\"。 **默认取值：** 不涉及。 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EvaluationOpsCurrentVersion that = (EvaluationOpsCurrentVersion) obj;
        return Objects.equals(this.description, that.description)
            && Objects.equals(this.evaluatorContent, that.evaluatorContent)
            && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, evaluatorContent, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluationOpsCurrentVersion {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    evaluatorContent: ").append(toIndentedString(evaluatorContent)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
