package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Response Object
 */
public class SwitchFullsqlSwitchResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_status")

    private Integer openStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_days")

    private Integer retentionDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_open")

    private Boolean canOpen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cant_open_msg")

    private String cantOpenMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_open_time")

    private BigDecimal lastOpenTime;

    public SwitchFullsqlSwitchResponse withOpenStatus(Integer openStatus) {
        this.openStatus = openStatus;
        return this;
    }

    /**
     * 开关状态
     * @return openStatus
     */
    public Integer getOpenStatus() {
        return openStatus;
    }

    public void setOpenStatus(Integer openStatus) {
        this.openStatus = openStatus;
    }

    public SwitchFullsqlSwitchResponse withRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    /**
     * 保留天数
     * @return retentionDays
     */
    public Integer getRetentionDays() {
        return retentionDays;
    }

    public void setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
    }

    public SwitchFullsqlSwitchResponse withCanOpen(Boolean canOpen) {
        this.canOpen = canOpen;
        return this;
    }

    /**
     * 是否能开启
     * @return canOpen
     */
    public Boolean getCanOpen() {
        return canOpen;
    }

    public void setCanOpen(Boolean canOpen) {
        this.canOpen = canOpen;
    }

    public SwitchFullsqlSwitchResponse withCantOpenMsg(String cantOpenMsg) {
        this.cantOpenMsg = cantOpenMsg;
        return this;
    }

    /**
     * 不能开启的原因
     * @return cantOpenMsg
     */
    public String getCantOpenMsg() {
        return cantOpenMsg;
    }

    public void setCantOpenMsg(String cantOpenMsg) {
        this.cantOpenMsg = cantOpenMsg;
    }

    public SwitchFullsqlSwitchResponse withLastOpenTime(BigDecimal lastOpenTime) {
        this.lastOpenTime = lastOpenTime;
        return this;
    }

    /**
     * 上次开启时间
     * @return lastOpenTime
     */
    public BigDecimal getLastOpenTime() {
        return lastOpenTime;
    }

    public void setLastOpenTime(BigDecimal lastOpenTime) {
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
        SwitchFullsqlSwitchResponse that = (SwitchFullsqlSwitchResponse) obj;
        return Objects.equals(this.openStatus, that.openStatus)
            && Objects.equals(this.retentionDays, that.retentionDays) && Objects.equals(this.canOpen, that.canOpen)
            && Objects.equals(this.cantOpenMsg, that.cantOpenMsg)
            && Objects.equals(this.lastOpenTime, that.lastOpenTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(openStatus, retentionDays, canOpen, cantOpenMsg, lastOpenTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchFullsqlSwitchResponse {\n");
        sb.append("    openStatus: ").append(toIndentedString(openStatus)).append("\n");
        sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
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
