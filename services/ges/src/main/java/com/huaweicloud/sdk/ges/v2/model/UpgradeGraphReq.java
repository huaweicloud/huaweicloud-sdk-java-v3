package com.huaweicloud.sdk.ges.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 升级图请求体
 */
public class UpgradeGraphReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_version")

    private String upgradeVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_upgrade")

    private Boolean forceUpgrade;

    public UpgradeGraphReq withUpgradeVersion(String upgradeVersion) {
        this.upgradeVersion = upgradeVersion;
        return this;
    }

    /**
     * 升级到的版本，必须大于当前图版本。
     * @return upgradeVersion
     */
    public String getUpgradeVersion() {
        return upgradeVersion;
    }

    public void setUpgradeVersion(String upgradeVersion) {
        this.upgradeVersion = upgradeVersion;
    }

    public UpgradeGraphReq withForceUpgrade(Boolean forceUpgrade) {
        this.forceUpgrade = forceUpgrade;
        return this;
    }

    /**
     * 是否强制升级。取值为true或false，默认为false。  - true：强制升级，会中断升级时已经在处理的任务，比如运行算法长任务，可能会造成少量请求失败。 - false：非强制升级，会等待已经运行的业务，升级过程可能较慢。
     * @return forceUpgrade
     */
    public Boolean getForceUpgrade() {
        return forceUpgrade;
    }

    public void setForceUpgrade(Boolean forceUpgrade) {
        this.forceUpgrade = forceUpgrade;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeGraphReq that = (UpgradeGraphReq) obj;
        return Objects.equals(this.upgradeVersion, that.upgradeVersion)
            && Objects.equals(this.forceUpgrade, that.forceUpgrade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(upgradeVersion, forceUpgrade);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeGraphReq {\n");
        sb.append("    upgradeVersion: ").append(toIndentedString(upgradeVersion)).append("\n");
        sb.append("    forceUpgrade: ").append(toIndentedString(forceUpgrade)).append("\n");
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
