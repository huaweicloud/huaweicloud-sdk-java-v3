package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpgradePgMajorVersion
 */
public class UpgradePgMajorVersion {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_version")

    private String targetVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_change_private_ip")

    private Boolean isChangePrivateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics_collection_mode")

    private String statisticsCollectionMode;

    public UpgradePgMajorVersion withTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }

    /**
     * 目标版本。 高于实例当前的大版本，如当前为12，目标版本需要是13或14。
     * @return targetVersion
     */
    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    public UpgradePgMajorVersion withIsChangePrivateIp(Boolean isChangePrivateIp) {
        this.isChangePrivateIp = isChangePrivateIp;
        return this;
    }

    /**
     * 是否将实例内网IP切换到大版本实例  true：升级后切换当前实例的内网IP到大版本实例 false：升级后当前实例的内网IP不变，大版本实例使用新的内网IP
     * @return isChangePrivateIp
     */
    public Boolean getIsChangePrivateIp() {
        return isChangePrivateIp;
    }

    public void setIsChangePrivateIp(Boolean isChangePrivateIp) {
        this.isChangePrivateIp = isChangePrivateIp;
    }

    public UpgradePgMajorVersion withStatisticsCollectionMode(String statisticsCollectionMode) {
        this.statisticsCollectionMode = statisticsCollectionMode;
        return this;
    }

    /**
     * 统计信息收集方式。is_change_private_ip为true时必选  before_change_private_ip：将实例内网IP切换到大版本实例前收集  after_change_private_ip：将实例内网IP切换到大版本实例后收集
     * @return statisticsCollectionMode
     */
    public String getStatisticsCollectionMode() {
        return statisticsCollectionMode;
    }

    public void setStatisticsCollectionMode(String statisticsCollectionMode) {
        this.statisticsCollectionMode = statisticsCollectionMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradePgMajorVersion that = (UpgradePgMajorVersion) obj;
        return Objects.equals(this.targetVersion, that.targetVersion)
            && Objects.equals(this.isChangePrivateIp, that.isChangePrivateIp)
            && Objects.equals(this.statisticsCollectionMode, that.statisticsCollectionMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetVersion, isChangePrivateIp, statisticsCollectionMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradePgMajorVersion {\n");
        sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
        sb.append("    isChangePrivateIp: ").append(toIndentedString(isChangePrivateIp)).append("\n");
        sb.append("    statisticsCollectionMode: ").append(toIndentedString(statisticsCollectionMode)).append("\n");
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
