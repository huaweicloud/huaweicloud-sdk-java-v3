package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 离线任务的配置信息对象。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class OpsOfflineConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluator_config")

    private List<OpsEvaluatorConfigInfo> evaluatorConfig = null;

    public OpsOfflineConfig withEvaluatorConfig(List<OpsEvaluatorConfigInfo> evaluatorConfig) {
        this.evaluatorConfig = evaluatorConfig;
        return this;
    }

    public OpsOfflineConfig addEvaluatorConfigItem(OpsEvaluatorConfigInfo evaluatorConfigItem) {
        if (this.evaluatorConfig == null) {
            this.evaluatorConfig = new ArrayList<>();
        }
        this.evaluatorConfig.add(evaluatorConfigItem);
        return this;
    }

    public OpsOfflineConfig withEvaluatorConfig(Consumer<List<OpsEvaluatorConfigInfo>> evaluatorConfigSetter) {
        if (this.evaluatorConfig == null) {
            this.evaluatorConfig = new ArrayList<>();
        }
        evaluatorConfigSetter.accept(this.evaluatorConfig);
        return this;
    }

    /**
     * **参数解释：** 评估器的配置。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return evaluatorConfig
     */
    public List<OpsEvaluatorConfigInfo> getEvaluatorConfig() {
        return evaluatorConfig;
    }

    public void setEvaluatorConfig(List<OpsEvaluatorConfigInfo> evaluatorConfig) {
        this.evaluatorConfig = evaluatorConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsOfflineConfig that = (OpsOfflineConfig) obj;
        return Objects.equals(this.evaluatorConfig, that.evaluatorConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluatorConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsOfflineConfig {\n");
        sb.append("    evaluatorConfig: ").append(toIndentedString(evaluatorConfig)).append("\n");
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
