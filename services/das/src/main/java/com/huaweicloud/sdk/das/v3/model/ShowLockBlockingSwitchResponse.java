package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowLockBlockingSwitchResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_on")

    private Boolean switchOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_hours")

    private Long retentionHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry")

    private Boolean retry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_open")

    private Boolean canOpen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cant_open_msg")

    private String cantOpenMsg;

    public ShowLockBlockingSwitchResponse withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * 是否成功
     * @return success
     */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public ShowLockBlockingSwitchResponse withSwitchOn(Boolean switchOn) {
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

    public ShowLockBlockingSwitchResponse withRetentionHours(Long retentionHours) {
        this.retentionHours = retentionHours;
        return this;
    }

    /**
     * 保存时长
     * minimum: 24
     * maximum: 168
     * @return retentionHours
     */
    public Long getRetentionHours() {
        return retentionHours;
    }

    public void setRetentionHours(Long retentionHours) {
        this.retentionHours = retentionHours;
    }

    public ShowLockBlockingSwitchResponse withRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }

    /**
     * 是否需要重试
     * @return retry
     */
    public Boolean getRetry() {
        return retry;
    }

    public void setRetry(Boolean retry) {
        this.retry = retry;
    }

    public ShowLockBlockingSwitchResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误信息
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ShowLockBlockingSwitchResponse withCanOpen(Boolean canOpen) {
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

    public ShowLockBlockingSwitchResponse withCantOpenMsg(String cantOpenMsg) {
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
        ShowLockBlockingSwitchResponse that = (ShowLockBlockingSwitchResponse) obj;
        return Objects.equals(this.success, that.success) && Objects.equals(this.switchOn, that.switchOn)
            && Objects.equals(this.retentionHours, that.retentionHours) && Objects.equals(this.retry, that.retry)
            && Objects.equals(this.errorMsg, that.errorMsg) && Objects.equals(this.canOpen, that.canOpen)
            && Objects.equals(this.cantOpenMsg, that.cantOpenMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, switchOn, retentionHours, retry, errorMsg, canOpen, cantOpenMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLockBlockingSwitchResponse {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    switchOn: ").append(toIndentedString(switchOn)).append("\n");
        sb.append("    retentionHours: ").append(toIndentedString(retentionHours)).append("\n");
        sb.append("    retry: ").append(toIndentedString(retry)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
