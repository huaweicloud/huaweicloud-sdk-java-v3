package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowRiskInfoEngineRiskDesc
 */
public class ShowRiskInfoEngineRiskDesc {

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

    private Long level;

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

    public ShowRiskInfoEngineRiskDesc withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowRiskInfoEngineRiskDesc withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * 当前引擎
     * @return engineName
     */
    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public ShowRiskInfoEngineRiskDesc withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * 当前引擎小版本
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public ShowRiskInfoEngineRiskDesc withLevel(Long level) {
        this.level = level;
        return this;
    }

    /**
     * 风险等级，默认1
     * minimum: 1
     * maximum: 100
     * @return level
     */
    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public ShowRiskInfoEngineRiskDesc withSuggest(String suggest) {
        this.suggest = suggest;
        return this;
    }

    /**
     * 建议升级原因,无风险为空
     * @return suggest
     */
    public String getSuggest() {
        return suggest;
    }

    public void setSuggest(String suggest) {
        this.suggest = suggest;
    }

    public ShowRiskInfoEngineRiskDesc withInfluence(String influence) {
        this.influence = influence;
        return this;
    }

    /**
     * 升级影响，无风险为空
     * @return influence
     */
    public String getInfluence() {
        return influence;
    }

    public void setInfluence(String influence) {
        this.influence = influence;
    }

    public ShowRiskInfoEngineRiskDesc withGuidance(String guidance) {
        this.guidance = guidance;
        return this;
    }

    /**
     * 指导链接，无风险为空
     * @return guidance
     */
    public String getGuidance() {
        return guidance;
    }

    public void setGuidance(String guidance) {
        this.guidance = guidance;
    }

    public ShowRiskInfoEngineRiskDesc withServiceImpactDuration(String serviceImpactDuration) {
        this.serviceImpactDuration = serviceImpactDuration;
        return this;
    }

    /**
     * 业务影响时长，无风险为空
     * @return serviceImpactDuration
     */
    public String getServiceImpactDuration() {
        return serviceImpactDuration;
    }

    public void setServiceImpactDuration(String serviceImpactDuration) {
        this.serviceImpactDuration = serviceImpactDuration;
    }

    public ShowRiskInfoEngineRiskDesc withUpgradeDuration(String upgradeDuration) {
        this.upgradeDuration = upgradeDuration;
        return this;
    }

    /**
     * 升级时长，无风险为空
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
        ShowRiskInfoEngineRiskDesc that = (ShowRiskInfoEngineRiskDesc) obj;
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
        sb.append("class ShowRiskInfoEngineRiskDesc {\n");
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
