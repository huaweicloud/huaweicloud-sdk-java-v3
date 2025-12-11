package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ProxyEngineRisk
 */
public class ProxyEngineRisk {

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

    public ProxyEngineRisk withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * **参数解释**：  风险级别。  **取值范围**： 1：一级风险。
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public ProxyEngineRisk withSuggest(String suggest) {
        this.suggest = suggest;
        return this;
    }

    /**
     * **参数解释**：  建议升级原因。  **取值范围**：  不涉及。
     * @return suggest
     */
    public String getSuggest() {
        return suggest;
    }

    public void setSuggest(String suggest) {
        this.suggest = suggest;
    }

    public ProxyEngineRisk withInfluence(String influence) {
        this.influence = influence;
        return this;
    }

    /**
     * **参数解释**：  升级影响。  **取值范围**：  不涉及。
     * @return influence
     */
    public String getInfluence() {
        return influence;
    }

    public void setInfluence(String influence) {
        this.influence = influence;
    }

    public ProxyEngineRisk withGuidance(String guidance) {
        this.guidance = guidance;
        return this;
    }

    /**
     * **参数解释**：  升级指导。  **取值范围**：  不涉及。
     * @return guidance
     */
    public String getGuidance() {
        return guidance;
    }

    public void setGuidance(String guidance) {
        this.guidance = guidance;
    }

    public ProxyEngineRisk withServiceImpactDuration(String serviceImpactDuration) {
        this.serviceImpactDuration = serviceImpactDuration;
        return this;
    }

    /**
     * **参数解释**：  预估业务影响时长。  **取值范围**：  不涉及。
     * @return serviceImpactDuration
     */
    public String getServiceImpactDuration() {
        return serviceImpactDuration;
    }

    public void setServiceImpactDuration(String serviceImpactDuration) {
        this.serviceImpactDuration = serviceImpactDuration;
    }

    public ProxyEngineRisk withUpgradeDuration(String upgradeDuration) {
        this.upgradeDuration = upgradeDuration;
        return this;
    }

    /**
     * **参数解释**：  预估升级时长。  **取值范围**：  不涉及。
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
        ProxyEngineRisk that = (ProxyEngineRisk) obj;
        return Objects.equals(this.level, that.level) && Objects.equals(this.suggest, that.suggest)
            && Objects.equals(this.influence, that.influence) && Objects.equals(this.guidance, that.guidance)
            && Objects.equals(this.serviceImpactDuration, that.serviceImpactDuration)
            && Objects.equals(this.upgradeDuration, that.upgradeDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(level, suggest, influence, guidance, serviceImpactDuration, upgradeDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProxyEngineRisk {\n");
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
