package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 节点安装或升级记录
 */
public class UpgradeHistory {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_version")

    private String fromVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_version")

    private String toVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_time")

    private Integer upgradeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dur_time")

    private Integer durTime;

    public UpgradeHistory withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 节点升级或安装历史版本id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UpgradeHistory withFromVersion(String fromVersion) {
        this.fromVersion = fromVersion;
        return this;
    }

    /**
     * 节点升级前节点上edgecore版本号，形式如2.1.0，其中每一位都是整数
     * @return fromVersion
     */
    public String getFromVersion() {
        return fromVersion;
    }

    public void setFromVersion(String fromVersion) {
        this.fromVersion = fromVersion;
    }

    public UpgradeHistory withToVersion(String toVersion) {
        this.toVersion = toVersion;
        return this;
    }

    /**
     * 节点升级或安装后节点行edgecore版本号，形式如2.1.0，其中每一位都是整数
     * @return toVersion
     */
    public String getToVersion() {
        return toVersion;
    }

    public void setToVersion(String toVersion) {
        this.toVersion = toVersion;
    }

    public UpgradeHistory withUpgradeTime(Integer upgradeTime) {
        this.upgradeTime = upgradeTime;
        return this;
    }

    /**
     * 节点升级或安装的十位时间戳
     * @return upgradeTime
     */
    public Integer getUpgradeTime() {
        return upgradeTime;
    }

    public void setUpgradeTime(Integer upgradeTime) {
        this.upgradeTime = upgradeTime;
    }

    public UpgradeHistory withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 节点升级或安装状态，包含 - install_success：边缘节点安装成功 - upgrade_success：边缘节点升级成功 - install_failed：边缘节点安装失败 - upgrade_failed：边缘节点升级失败 - upgrade_failed_rollback_success：边缘节点升级失败回滚成功 - upgrade_failed_rollback_failed：边缘节点升级失败回滚失败
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public UpgradeHistory withDurTime(Integer durTime) {
        this.durTime = durTime;
        return this;
    }

    /**
     * 节点升级所消耗的时间
     * @return durTime
     */
    public Integer getDurTime() {
        return durTime;
    }

    public void setDurTime(Integer durTime) {
        this.durTime = durTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeHistory that = (UpgradeHistory) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.fromVersion, that.fromVersion)
            && Objects.equals(this.toVersion, that.toVersion) && Objects.equals(this.upgradeTime, that.upgradeTime)
            && Objects.equals(this.result, that.result) && Objects.equals(this.durTime, that.durTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fromVersion, toVersion, upgradeTime, result, durTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeHistory {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    fromVersion: ").append(toIndentedString(fromVersion)).append("\n");
        sb.append("    toVersion: ").append(toIndentedString(toVersion)).append("\n");
        sb.append("    upgradeTime: ").append(toIndentedString(upgradeTime)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    durTime: ").append(toIndentedString(durTime)).append("\n");
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
