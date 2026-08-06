package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowLongHistoryTransactionSwitchNewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_on")

    private Boolean switchOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold")

    private Long threshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_open")

    private Boolean canOpen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cant_open_msg")

    private String cantOpenMsg;

    public ShowLongHistoryTransactionSwitchNewResponse withSwitchOn(Boolean switchOn) {
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

    public ShowLongHistoryTransactionSwitchNewResponse withThreshold(Long threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * 长事务阈值
     * @return threshold
     */
    public Long getThreshold() {
        return threshold;
    }

    public void setThreshold(Long threshold) {
        this.threshold = threshold;
    }

    public ShowLongHistoryTransactionSwitchNewResponse withCanOpen(Boolean canOpen) {
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

    public ShowLongHistoryTransactionSwitchNewResponse withCantOpenMsg(String cantOpenMsg) {
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
        ShowLongHistoryTransactionSwitchNewResponse that = (ShowLongHistoryTransactionSwitchNewResponse) obj;
        return Objects.equals(this.switchOn, that.switchOn) && Objects.equals(this.threshold, that.threshold)
            && Objects.equals(this.canOpen, that.canOpen) && Objects.equals(this.cantOpenMsg, that.cantOpenMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(switchOn, threshold, canOpen, cantOpenMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLongHistoryTransactionSwitchNewResponse {\n");
        sb.append("    switchOn: ").append(toIndentedString(switchOn)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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
