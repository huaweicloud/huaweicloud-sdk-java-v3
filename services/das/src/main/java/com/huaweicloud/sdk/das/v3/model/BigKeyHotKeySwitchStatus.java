package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BigKeyHotKeySwitchStatus
 */
public class BigKeyHotKeySwitchStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_status")

    private Integer openStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_hours")

    private Long retentionHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_open")

    private Boolean canOpen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cant_open_msg")

    private String cantOpenMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_open_time")

    private Long lastOpenTime;

    public BigKeyHotKeySwitchStatus withOpenStatus(Integer openStatus) {
        this.openStatus = openStatus;
        return this;
    }

    /**
     * 开关状态。0-关闭，1-开启
     * minimum: 0
     * maximum: 1
     * @return openStatus
     */
    public Integer getOpenStatus() {
        return openStatus;
    }

    public void setOpenStatus(Integer openStatus) {
        this.openStatus = openStatus;
    }

    public BigKeyHotKeySwitchStatus withRetentionHours(Long retentionHours) {
        this.retentionHours = retentionHours;
        return this;
    }

    /**
     * 数据保留小时数
     * minimum: 1
     * maximum: 168
     * @return retentionHours
     */
    public Long getRetentionHours() {
        return retentionHours;
    }

    public void setRetentionHours(Long retentionHours) {
        this.retentionHours = retentionHours;
    }

    public BigKeyHotKeySwitchStatus withCanOpen(Boolean canOpen) {
        this.canOpen = canOpen;
        return this;
    }

    /**
     * 是否可以开启
     * @return canOpen
     */
    public Boolean getCanOpen() {
        return canOpen;
    }

    public void setCanOpen(Boolean canOpen) {
        this.canOpen = canOpen;
    }

    public BigKeyHotKeySwitchStatus withCantOpenMsg(String cantOpenMsg) {
        this.cantOpenMsg = cantOpenMsg;
        return this;
    }

    /**
     * 无法开启的原因（如内核版本不满足等）
     * @return cantOpenMsg
     */
    public String getCantOpenMsg() {
        return cantOpenMsg;
    }

    public void setCantOpenMsg(String cantOpenMsg) {
        this.cantOpenMsg = cantOpenMsg;
    }

    public BigKeyHotKeySwitchStatus withLastOpenTime(Long lastOpenTime) {
        this.lastOpenTime = lastOpenTime;
        return this;
    }

    /**
     * 最后开启时间（毫秒时间戳）
     * minimum: 0
     * maximum: 9999999999999
     * @return lastOpenTime
     */
    public Long getLastOpenTime() {
        return lastOpenTime;
    }

    public void setLastOpenTime(Long lastOpenTime) {
        this.lastOpenTime = lastOpenTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BigKeyHotKeySwitchStatus that = (BigKeyHotKeySwitchStatus) obj;
        return Objects.equals(this.openStatus, that.openStatus)
            && Objects.equals(this.retentionHours, that.retentionHours) && Objects.equals(this.canOpen, that.canOpen)
            && Objects.equals(this.cantOpenMsg, that.cantOpenMsg)
            && Objects.equals(this.lastOpenTime, that.lastOpenTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(openStatus, retentionHours, canOpen, cantOpenMsg, lastOpenTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BigKeyHotKeySwitchStatus {\n");
        sb.append("    openStatus: ").append(toIndentedString(openStatus)).append("\n");
        sb.append("    retentionHours: ").append(toIndentedString(retentionHours)).append("\n");
        sb.append("    canOpen: ").append(toIndentedString(canOpen)).append("\n");
        sb.append("    cantOpenMsg: ").append(toIndentedString(cantOpenMsg)).append("\n");
        sb.append("    lastOpenTime: ").append(toIndentedString(lastOpenTime)).append("\n");
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
