package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 可以升级的热补丁信息。
 */
public class HotfixUpgradeInfos {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common_patch")

    private String commonPatch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_sensitive")

    private Boolean backupSensitive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "descripition")

    private String descripition;

    public HotfixUpgradeInfos withVersion(String version) {
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

    public HotfixUpgradeInfos withCommonPatch(String commonPatch) {
        this.commonPatch = commonPatch;
        return this;
    }

    /**
     * 通用/非通用补丁信息。 枚举值：   \"common\": 通用补丁。   \"certain\": 定制补丁。
     * @return commonPatch
     */
    public String getCommonPatch() {
        return commonPatch;
    }

    public void setCommonPatch(String commonPatch) {
        this.commonPatch = commonPatch;
    }

    public HotfixUpgradeInfos withBackupSensitive(Boolean backupSensitive) {
        this.backupSensitive = backupSensitive;
        return this;
    }

    /**
     * 是否和备份相关。
     * @return backupSensitive
     */
    public Boolean getBackupSensitive() {
        return backupSensitive;
    }

    public void setBackupSensitive(Boolean backupSensitive) {
        this.backupSensitive = backupSensitive;
    }

    public HotfixUpgradeInfos withDescripition(String descripition) {
        this.descripition = descripition;
        return this;
    }

    /**
     * 补丁的描述信息。
     * @return descripition
     */
    public String getDescripition() {
        return descripition;
    }

    public void setDescripition(String descripition) {
        this.descripition = descripition;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HotfixUpgradeInfos that = (HotfixUpgradeInfos) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.commonPatch, that.commonPatch)
            && Objects.equals(this.backupSensitive, that.backupSensitive)
            && Objects.equals(this.descripition, that.descripition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, commonPatch, backupSensitive, descripition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HotfixUpgradeInfos {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    commonPatch: ").append(toIndentedString(commonPatch)).append("\n");
        sb.append("    backupSensitive: ").append(toIndentedString(backupSensitive)).append("\n");
        sb.append("    descripition: ").append(toIndentedString(descripition)).append("\n");
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
