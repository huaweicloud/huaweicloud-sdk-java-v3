package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Response Object
 */
public class ChangePaymentModeNewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_set_free_time")

    private BigDecimal canSetFreeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public ChangePaymentModeNewResponse withSuccess(Boolean success) {
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

    public ChangePaymentModeNewResponse withCanSetFreeTime(BigDecimal canSetFreeTime) {
        this.canSetFreeTime = canSetFreeTime;
        return this;
    }

    /**
     * 可恢复为免费实例的时间
     * @return canSetFreeTime
     */
    public BigDecimal getCanSetFreeTime() {
        return canSetFreeTime;
    }

    public void setCanSetFreeTime(BigDecimal canSetFreeTime) {
        this.canSetFreeTime = canSetFreeTime;
    }

    public ChangePaymentModeNewResponse withErrorMsg(String errorMsg) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangePaymentModeNewResponse that = (ChangePaymentModeNewResponse) obj;
        return Objects.equals(this.success, that.success) && Objects.equals(this.canSetFreeTime, that.canSetFreeTime)
            && Objects.equals(this.errorMsg, that.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, canSetFreeTime, errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangePaymentModeNewResponse {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    canSetFreeTime: ").append(toIndentedString(canSetFreeTime)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
