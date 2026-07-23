package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 创建评估器的请求体。 **约束限制：** 必填字段包括 evaluator_type, current_version, name, description。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class CreateOpsEvaluatorRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_type")

    private Integer evaluatorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "turn_type")

    private String turnType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_version")

    private EvaluationOpsCurrentVersion currentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public CreateOpsEvaluatorRequestBody withEvaluatorType(Integer evaluatorType) {
        this.evaluatorType = evaluatorType;
        return this;
    }

    /**
     * **参数解释：** 评估器的核心执行模式。 **约束限制：** 整型数值，取值范围为int32。 **取值范围：** - 1: 模型评估器（模型评估器，基于大语言模型进行智能评判） - 2: 代码评估器（代码评估器，基于预设脚本逻辑进行规则判定） - 3: 自适应评估器 **默认取值：** 不涉及。 
     * minimum: 0
     * maximum: 2147483647
     * @return evaluatorType
     */
    public Integer getEvaluatorType() {
        return evaluatorType;
    }

    public void setEvaluatorType(Integer evaluatorType) {
        this.evaluatorType = evaluatorType;
    }

    public CreateOpsEvaluatorRequestBody withTurnType(String turnType) {
        this.turnType = turnType;
        return this;
    }

    /**
     * **参数解释：** 评估器的轮次类型。 **约束限制：** 长度为0到100个字符。 **取值范围：** - single: 单轮评估器 - multi: 多轮评估器 **默认取值：** 不涉及。 
     * @return turnType
     */
    public String getTurnType() {
        return turnType;
    }

    public void setTurnType(String turnType) {
        this.turnType = turnType;
    }

    public CreateOpsEvaluatorRequestBody withCurrentVersion(EvaluationOpsCurrentVersion currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    public CreateOpsEvaluatorRequestBody withCurrentVersion(
        Consumer<EvaluationOpsCurrentVersion> currentVersionSetter) {
        if (this.currentVersion == null) {
            this.currentVersion = new EvaluationOpsCurrentVersion();
            currentVersionSetter.accept(this.currentVersion);
        }

        return this;
    }

    /**
     * Get currentVersion
     * @return currentVersion
     */
    public EvaluationOpsCurrentVersion getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(EvaluationOpsCurrentVersion currentVersion) {
        this.currentVersion = currentVersion;
    }

    public CreateOpsEvaluatorRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 评估器的业务名称。 **约束限制：** 长度为1到10000个字符。 **取值范围：** 中英文、数字、下划线（_）、中划线（-）组成的字符串。 **默认取值：** 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateOpsEvaluatorRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 对该评估器的功能逻辑和判定准则的详细文字补充。 **约束限制：** 长度为0到10000个字符。 **取值范围：** 任意字符串。 **默认取值：** 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateOpsEvaluatorRequestBody that = (CreateOpsEvaluatorRequestBody) obj;
        return Objects.equals(this.evaluatorType, that.evaluatorType) && Objects.equals(this.turnType, that.turnType)
            && Objects.equals(this.currentVersion, that.currentVersion) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluatorType, turnType, currentVersion, name, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOpsEvaluatorRequestBody {\n");
        sb.append("    evaluatorType: ").append(toIndentedString(evaluatorType)).append("\n");
        sb.append("    turnType: ").append(toIndentedString(turnType)).append("\n");
        sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
