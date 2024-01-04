package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 升级配置相关信息
 */
public class UpgradeInfoSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastUpgradeInfo")

    private UpgradeInfoStatus lastUpgradeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versionInfo")

    private UpgradeVersionInfo versionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgradeFeatureGates")

    private UpgradeFeatureGates upgradeFeatureGates;

    public UpgradeInfoSpec withLastUpgradeInfo(UpgradeInfoStatus lastUpgradeInfo) {
        this.lastUpgradeInfo = lastUpgradeInfo;
        return this;
    }

    public UpgradeInfoSpec withLastUpgradeInfo(Consumer<UpgradeInfoStatus> lastUpgradeInfoSetter) {
        if (this.lastUpgradeInfo == null) {
            this.lastUpgradeInfo = new UpgradeInfoStatus();
            lastUpgradeInfoSetter.accept(this.lastUpgradeInfo);
        }

        return this;
    }

    /**
     * Get lastUpgradeInfo
     * @return lastUpgradeInfo
     */
    public UpgradeInfoStatus getLastUpgradeInfo() {
        return lastUpgradeInfo;
    }

    public void setLastUpgradeInfo(UpgradeInfoStatus lastUpgradeInfo) {
        this.lastUpgradeInfo = lastUpgradeInfo;
    }

    public UpgradeInfoSpec withVersionInfo(UpgradeVersionInfo versionInfo) {
        this.versionInfo = versionInfo;
        return this;
    }

    public UpgradeInfoSpec withVersionInfo(Consumer<UpgradeVersionInfo> versionInfoSetter) {
        if (this.versionInfo == null) {
            this.versionInfo = new UpgradeVersionInfo();
            versionInfoSetter.accept(this.versionInfo);
        }

        return this;
    }

    /**
     * Get versionInfo
     * @return versionInfo
     */
    public UpgradeVersionInfo getVersionInfo() {
        return versionInfo;
    }

    public void setVersionInfo(UpgradeVersionInfo versionInfo) {
        this.versionInfo = versionInfo;
    }

    public UpgradeInfoSpec withUpgradeFeatureGates(UpgradeFeatureGates upgradeFeatureGates) {
        this.upgradeFeatureGates = upgradeFeatureGates;
        return this;
    }

    public UpgradeInfoSpec withUpgradeFeatureGates(Consumer<UpgradeFeatureGates> upgradeFeatureGatesSetter) {
        if (this.upgradeFeatureGates == null) {
            this.upgradeFeatureGates = new UpgradeFeatureGates();
            upgradeFeatureGatesSetter.accept(this.upgradeFeatureGates);
        }

        return this;
    }

    /**
     * Get upgradeFeatureGates
     * @return upgradeFeatureGates
     */
    public UpgradeFeatureGates getUpgradeFeatureGates() {
        return upgradeFeatureGates;
    }

    public void setUpgradeFeatureGates(UpgradeFeatureGates upgradeFeatureGates) {
        this.upgradeFeatureGates = upgradeFeatureGates;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeInfoSpec that = (UpgradeInfoSpec) obj;
        return Objects.equals(this.lastUpgradeInfo, that.lastUpgradeInfo)
            && Objects.equals(this.versionInfo, that.versionInfo)
            && Objects.equals(this.upgradeFeatureGates, that.upgradeFeatureGates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastUpgradeInfo, versionInfo, upgradeFeatureGates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeInfoSpec {\n");
        sb.append("    lastUpgradeInfo: ").append(toIndentedString(lastUpgradeInfo)).append("\n");
        sb.append("    versionInfo: ").append(toIndentedString(versionInfo)).append("\n");
        sb.append("    upgradeFeatureGates: ").append(toIndentedString(upgradeFeatureGates)).append("\n");
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
