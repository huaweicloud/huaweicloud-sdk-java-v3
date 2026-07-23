package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 评估器详细配置信息对象。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class OpsEvaluatorConfigInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_id")

    private String evaluatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_version")

    private String evaluatorVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_name")

    private String evaluatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_variable_mapping")

    private Map<String, OpsEvaluatorVariableMapping> evaluatorVariableMapping = null;

    public OpsEvaluatorConfigInfo withEvaluatorId(String evaluatorId) {
        this.evaluatorId = evaluatorId;
        return this;
    }

    /**
     * **参数解释：** 评估器的唯一标识符。 **约束限制：** 1到36字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return evaluatorId
     */
    public String getEvaluatorId() {
        return evaluatorId;
    }

    public void setEvaluatorId(String evaluatorId) {
        this.evaluatorId = evaluatorId;
    }

    public OpsEvaluatorConfigInfo withEvaluatorVersion(String evaluatorVersion) {
        this.evaluatorVersion = evaluatorVersion;
        return this;
    }

    /**
     * **参数解释：** 评估器的版本号。 **约束限制：** 1到36字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return evaluatorVersion
     */
    public String getEvaluatorVersion() {
        return evaluatorVersion;
    }

    public void setEvaluatorVersion(String evaluatorVersion) {
        this.evaluatorVersion = evaluatorVersion;
    }

    public OpsEvaluatorConfigInfo withEvaluatorName(String evaluatorName) {
        this.evaluatorName = evaluatorName;
        return this;
    }

    /**
     * **参数解释：** 评估器的显示名称。 **约束限制：** 1到100字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return evaluatorName
     */
    public String getEvaluatorName() {
        return evaluatorName;
    }

    public void setEvaluatorName(String evaluatorName) {
        this.evaluatorName = evaluatorName;
    }

    public OpsEvaluatorConfigInfo withEvaluatorVariableMapping(
        Map<String, OpsEvaluatorVariableMapping> evaluatorVariableMapping) {
        this.evaluatorVariableMapping = evaluatorVariableMapping;
        return this;
    }

    public OpsEvaluatorConfigInfo putEvaluatorVariableMappingItem(String key,
        OpsEvaluatorVariableMapping evaluatorVariableMappingItem) {
        if (this.evaluatorVariableMapping == null) {
            this.evaluatorVariableMapping = new HashMap<>();
        }
        this.evaluatorVariableMapping.put(key, evaluatorVariableMappingItem);
        return this;
    }

    public OpsEvaluatorConfigInfo withEvaluatorVariableMapping(
        Consumer<Map<String, OpsEvaluatorVariableMapping>> evaluatorVariableMappingSetter) {
        if (this.evaluatorVariableMapping == null) {
            this.evaluatorVariableMapping = new HashMap<>();
        }
        evaluatorVariableMappingSetter.accept(this.evaluatorVariableMapping);
        return this;
    }

    /**
     * **参数解释：** 变量映射字典配置。 **约束限制：** 符合 Map 结构的 JSON。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return evaluatorVariableMapping
     */
    public Map<String, OpsEvaluatorVariableMapping> getEvaluatorVariableMapping() {
        return evaluatorVariableMapping;
    }

    public void setEvaluatorVariableMapping(Map<String, OpsEvaluatorVariableMapping> evaluatorVariableMapping) {
        this.evaluatorVariableMapping = evaluatorVariableMapping;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsEvaluatorConfigInfo that = (OpsEvaluatorConfigInfo) obj;
        return Objects.equals(this.evaluatorId, that.evaluatorId)
            && Objects.equals(this.evaluatorVersion, that.evaluatorVersion)
            && Objects.equals(this.evaluatorName, that.evaluatorName)
            && Objects.equals(this.evaluatorVariableMapping, that.evaluatorVariableMapping);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluatorId, evaluatorVersion, evaluatorName, evaluatorVariableMapping);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsEvaluatorConfigInfo {\n");
        sb.append("    evaluatorId: ").append(toIndentedString(evaluatorId)).append("\n");
        sb.append("    evaluatorVersion: ").append(toIndentedString(evaluatorVersion)).append("\n");
        sb.append("    evaluatorName: ").append(toIndentedString(evaluatorName)).append("\n");
        sb.append("    evaluatorVariableMapping: ").append(toIndentedString(evaluatorVariableMapping)).append("\n");
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
