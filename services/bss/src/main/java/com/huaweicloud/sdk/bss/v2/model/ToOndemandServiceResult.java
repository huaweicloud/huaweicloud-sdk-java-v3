package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ToOndemandServiceResult
 */
public class ToOndemandServiceResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    public ToOndemandServiceResult withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * |参数名称：转按需的服务实例id/根资源id| |参数约束以及描述：转按需的服务实例id/根资源id。对应请求体中的资源id。|
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ToOndemandServiceResult withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * |参数名称：转按需结果| |参数约束以及描述：转按需结果。SUCCESS：成功；AUDIT：审核中；FAIL：转按需失败。|
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public ToOndemandServiceResult withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * |参数名称：状态码| |参数约束以及描述：状态码，result=FAIL时，必填|
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ToOndemandServiceResult withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * |参数名称：错误描述信息| |参数约束以及描述：错误描述信息，result=FAIL时，必填|
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ToOndemandServiceResult withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * |参数名称：订单Id| |参数约束以及描述：订单Id。result= SUCCESS、 AUDIT时，必填；其他为空。|
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ToOndemandServiceResult that = (ToOndemandServiceResult) obj;
        return Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.result, that.result)
            && Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.errorMsg, that.errorMsg)
            && Objects.equals(this.orderId, that.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, result, errorCode, errorMsg, orderId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ToOndemandServiceResult {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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
