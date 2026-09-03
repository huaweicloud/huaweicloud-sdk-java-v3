package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 引擎风险描述
 */
public class EngineRiskDesc {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_name")

    private String engineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggest")

    private String suggest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "influence")

    private String influence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guidance")

    private String guidance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_impact_duration")

    private String serviceImpactDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_duration")

    private String upgradeDuration;

    public EngineRiskDesc withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**：  代理节点ID。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public EngineRiskDesc withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * **参数解释**：  引擎名称。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return engineName
     */
    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public EngineRiskDesc withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * **参数解释**：  引擎版本。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public EngineRiskDesc withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * **参数解释**：  风险等级（该字段当前无效，默认为1）。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public EngineRiskDesc withSuggest(String suggest) {
        this.suggest = suggest;
        return this;
    }

    /**
     * **参数解释**：  建议。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return suggest
     */
    public String getSuggest() {
        return suggest;
    }

    public void setSuggest(String suggest) {
        this.suggest = suggest;
    }

    public EngineRiskDesc withInfluence(String influence) {
        this.influence = influence;
        return this;
    }

    /**
     * **参数解释**：  影响。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return influence
     */
    public String getInfluence() {
        return influence;
    }

    public void setInfluence(String influence) {
        this.influence = influence;
    }

    public EngineRiskDesc withGuidance(String guidance) {
        this.guidance = guidance;
        return this;
    }

    /**
     * **参数解释**：  指导。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return guidance
     */
    public String getGuidance() {
        return guidance;
    }

    public void setGuidance(String guidance) {
        this.guidance = guidance;
    }

    public EngineRiskDesc withServiceImpactDuration(String serviceImpactDuration) {
        this.serviceImpactDuration = serviceImpactDuration;
        return this;
    }

    /**
     * **参数解释**：  服务影响时长说明。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return serviceImpactDuration
     */
    public String getServiceImpactDuration() {
        return serviceImpactDuration;
    }

    public void setServiceImpactDuration(String serviceImpactDuration) {
        this.serviceImpactDuration = serviceImpactDuration;
    }

    public EngineRiskDesc withUpgradeDuration(String upgradeDuration) {
        this.upgradeDuration = upgradeDuration;
        return this;
    }

    /**
     * **参数解释**：  升级时长说明。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return upgradeDuration
     */
    public String getUpgradeDuration() {
        return upgradeDuration;
    }

    public void setUpgradeDuration(String upgradeDuration) {
        this.upgradeDuration = upgradeDuration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EngineRiskDesc that = (EngineRiskDesc) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.engineName, that.engineName)
            && Objects.equals(this.engineVersion, that.engineVersion) && Objects.equals(this.level, that.level)
            && Objects.equals(this.suggest, that.suggest) && Objects.equals(this.influence, that.influence)
            && Objects.equals(this.guidance, that.guidance)
            && Objects.equals(this.serviceImpactDuration, that.serviceImpactDuration)
            && Objects.equals(this.upgradeDuration, that.upgradeDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            engineName,
            engineVersion,
            level,
            suggest,
            influence,
            guidance,
            serviceImpactDuration,
            upgradeDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EngineRiskDesc {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    suggest: ").append(toIndentedString(suggest)).append("\n");
        sb.append("    influence: ").append(toIndentedString(influence)).append("\n");
        sb.append("    guidance: ").append(toIndentedString(guidance)).append("\n");
        sb.append("    serviceImpactDuration: ").append(toIndentedString(serviceImpactDuration)).append("\n");
        sb.append("    upgradeDuration: ").append(toIndentedString(upgradeDuration)).append("\n");
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
