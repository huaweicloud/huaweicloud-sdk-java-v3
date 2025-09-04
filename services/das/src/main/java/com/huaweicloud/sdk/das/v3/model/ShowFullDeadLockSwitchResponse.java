package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowFullDeadLockSwitchResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_on")

    private Boolean switchOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_hours")

    private Long retentionHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_open")

    private Boolean canOpen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cant_open_msg")

    private String cantOpenMsg;

    public ShowFullDeadLockSwitchResponse withSwitchOn(Boolean switchOn) {
        this.switchOn = switchOn;
        return this;
    }

    /**
     * 开关状态
     * @return switchOn
     */
    public Boolean getSwitchOn() {
        return switchOn;
    }

    public void setSwitchOn(Boolean switchOn) {
        this.switchOn = switchOn;
    }

    public ShowFullDeadLockSwitchResponse withRetentionHours(Long retentionHours) {
        this.retentionHours = retentionHours;
        return this;
    }

    /**
     * 保存时长
     * @return retentionHours
     */
    public Long getRetentionHours() {
        return retentionHours;
    }

    public void setRetentionHours(Long retentionHours) {
        this.retentionHours = retentionHours;
    }

    public ShowFullDeadLockSwitchResponse withCanOpen(Boolean canOpen) {
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

    public ShowFullDeadLockSwitchResponse withCantOpenMsg(String cantOpenMsg) {
        this.cantOpenMsg = cantOpenMsg;
        return this;
    }

    /**
     * 无法开启原因
     * @return cantOpenMsg
     */
    public String getCantOpenMsg() {
        return cantOpenMsg;
    }

    public void setCantOpenMsg(String cantOpenMsg) {
        this.cantOpenMsg = cantOpenMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFullDeadLockSwitchResponse that = (ShowFullDeadLockSwitchResponse) obj;
        return Objects.equals(this.switchOn, that.switchOn) && Objects.equals(this.retentionHours, that.retentionHours)
            && Objects.equals(this.canOpen, that.canOpen) && Objects.equals(this.cantOpenMsg, that.cantOpenMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(switchOn, retentionHours, canOpen, cantOpenMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFullDeadLockSwitchResponse {\n");
        sb.append("    switchOn: ").append(toIndentedString(switchOn)).append("\n");
        sb.append("    retentionHours: ").append(toIndentedString(retentionHours)).append("\n");
        sb.append("    canOpen: ").append(toIndentedString(canOpen)).append("\n");
        sb.append("    cantOpenMsg: ").append(toIndentedString(cantOpenMsg)).append("\n");
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
