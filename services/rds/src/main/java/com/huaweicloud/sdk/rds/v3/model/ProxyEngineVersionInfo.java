package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据库代理节点引擎版本信息
 */
public class ProxyEngineVersionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_engine_version")

    private String currentEngineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_engine_version")

    private String targetEngineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_flag")

    private Boolean upgradeFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_id")

    private String proxyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risks")

    private List<EngineRiskDesc> risks = null;

    public ProxyEngineVersionInfo withCurrentEngineVersion(String currentEngineVersion) {
        this.currentEngineVersion = currentEngineVersion;
        return this;
    }

    /**
     * **参数解释**：  当前引擎版本。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return currentEngineVersion
     */
    public String getCurrentEngineVersion() {
        return currentEngineVersion;
    }

    public void setCurrentEngineVersion(String currentEngineVersion) {
        this.currentEngineVersion = currentEngineVersion;
    }

    public ProxyEngineVersionInfo withTargetEngineVersion(String targetEngineVersion) {
        this.targetEngineVersion = targetEngineVersion;
        return this;
    }

    /**
     * **参数解释**：  目标引擎版本。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return targetEngineVersion
     */
    public String getTargetEngineVersion() {
        return targetEngineVersion;
    }

    public void setTargetEngineVersion(String targetEngineVersion) {
        this.targetEngineVersion = targetEngineVersion;
    }

    public ProxyEngineVersionInfo withUpgradeFlag(Boolean upgradeFlag) {
        this.upgradeFlag = upgradeFlag;
        return this;
    }

    /**
     * **参数解释**：  是否可升级标志。true表示可以升级，false表示不可升级。  **约束限制**：  不涉及。  **取值范围**：  - true - false  **默认取值**：  不涉及。
     * @return upgradeFlag
     */
    public Boolean getUpgradeFlag() {
        return upgradeFlag;
    }

    public void setUpgradeFlag(Boolean upgradeFlag) {
        this.upgradeFlag = upgradeFlag;
    }

    public ProxyEngineVersionInfo withProxyId(String proxyId) {
        this.proxyId = proxyId;
        return this;
    }

    /**
     * **参数解释**：  代理节点ID。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return proxyId
     */
    public String getProxyId() {
        return proxyId;
    }

    public void setProxyId(String proxyId) {
        this.proxyId = proxyId;
    }

    public ProxyEngineVersionInfo withRisks(List<EngineRiskDesc> risks) {
        this.risks = risks;
        return this;
    }

    public ProxyEngineVersionInfo addRisksItem(EngineRiskDesc risksItem) {
        if (this.risks == null) {
            this.risks = new ArrayList<>();
        }
        this.risks.add(risksItem);
        return this;
    }

    public ProxyEngineVersionInfo withRisks(Consumer<List<EngineRiskDesc>> risksSetter) {
        if (this.risks == null) {
            this.risks = new ArrayList<>();
        }
        risksSetter.accept(this.risks);
        return this;
    }

    /**
     * **参数解释**：  升级风险列表。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return risks
     */
    public List<EngineRiskDesc> getRisks() {
        return risks;
    }

    public void setRisks(List<EngineRiskDesc> risks) {
        this.risks = risks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProxyEngineVersionInfo that = (ProxyEngineVersionInfo) obj;
        return Objects.equals(this.currentEngineVersion, that.currentEngineVersion)
            && Objects.equals(this.targetEngineVersion, that.targetEngineVersion)
            && Objects.equals(this.upgradeFlag, that.upgradeFlag) && Objects.equals(this.proxyId, that.proxyId)
            && Objects.equals(this.risks, that.risks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentEngineVersion, targetEngineVersion, upgradeFlag, proxyId, risks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProxyEngineVersionInfo {\n");
        sb.append("    currentEngineVersion: ").append(toIndentedString(currentEngineVersion)).append("\n");
        sb.append("    targetEngineVersion: ").append(toIndentedString(targetEngineVersion)).append("\n");
        sb.append("    upgradeFlag: ").append(toIndentedString(upgradeFlag)).append("\n");
        sb.append("    proxyId: ").append(toIndentedString(proxyId)).append("\n");
        sb.append("    risks: ").append(toIndentedString(risks)).append("\n");
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
