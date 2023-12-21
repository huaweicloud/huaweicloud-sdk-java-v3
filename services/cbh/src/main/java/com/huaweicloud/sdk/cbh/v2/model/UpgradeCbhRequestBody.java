package com.huaweicloud.sdk.cbh.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云堡垒机实例请求对象。
 */
public class UpgradeCbhRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_time")

    private Long upgradeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cancel")

    private Boolean cancel;

    public UpgradeCbhRequestBody withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 实例id
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public UpgradeCbhRequestBody withUpgradeTime(Long upgradeTime) {
        this.upgradeTime = upgradeTime;
        return this;
    }

    /**
     * 定时升级的时间，需要比当前时间大24小时
     * minimum: 0
     * maximum: 99999999999999
     * @return upgradeTime
     */
    public Long getUpgradeTime() {
        return upgradeTime;
    }

    public void setUpgradeTime(Long upgradeTime) {
        this.upgradeTime = upgradeTime;
    }

    public UpgradeCbhRequestBody withCancel(Boolean cancel) {
        this.cancel = cancel;
        return this;
    }

    /**
     * 是否取消升级定时任务，已开始任务不可取消。 - true：取消 - false：无影响
     * @return cancel
     */
    public Boolean getCancel() {
        return cancel;
    }

    public void setCancel(Boolean cancel) {
        this.cancel = cancel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeCbhRequestBody that = (UpgradeCbhRequestBody) obj;
        return Objects.equals(this.serverId, that.serverId) && Objects.equals(this.upgradeTime, that.upgradeTime)
            && Objects.equals(this.cancel, that.cancel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId, upgradeTime, cancel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeCbhRequestBody {\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    upgradeTime: ").append(toIndentedString(upgradeTime)).append("\n");
        sb.append("    cancel: ").append(toIndentedString(cancel)).append("\n");
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
