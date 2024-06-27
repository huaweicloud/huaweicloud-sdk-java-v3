package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 热补丁信息。
 */
public class HotfixVersionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_finished_time")

    private String upgradeFinishedTime;

    public HotfixVersionInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 热补丁版本。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public HotfixVersionInfo withUpgradeFinishedTime(String upgradeFinishedTime) {
        this.upgradeFinishedTime = upgradeFinishedTime;
        return this;
    }

    /**
     * 热补丁升级完成时间列表。  热补丁升级完成时间，格式为“yyyy-mm-dd hh:mm:ss timezone”。  其中timezone是指时区。
     * @return upgradeFinishedTime
     */
    public String getUpgradeFinishedTime() {
        return upgradeFinishedTime;
    }

    public void setUpgradeFinishedTime(String upgradeFinishedTime) {
        this.upgradeFinishedTime = upgradeFinishedTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HotfixVersionInfo that = (HotfixVersionInfo) obj;
        return Objects.equals(this.version, that.version)
            && Objects.equals(this.upgradeFinishedTime, that.upgradeFinishedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, upgradeFinishedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HotfixVersionInfo {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    upgradeFinishedTime: ").append(toIndentedString(upgradeFinishedTime)).append("\n");
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
