package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ThrottleBindingBatchFailure
 */
public class ThrottleBindingBatchFailure {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_id")

    private String bindId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_id")

    private String apiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_name")

    private String apiName;

    public ThrottleBindingBatchFailure withBindId(String bindId) {
        this.bindId = bindId;
        return this;
    }

    /**
     * 解除绑定失败的API和流控策略绑定关系ID
     * @return bindId
     */
    public String getBindId() {
        return bindId;
    }

    public void setBindId(String bindId) {
        this.bindId = bindId;
    }

    public ThrottleBindingBatchFailure withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 解除绑定失败的错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ThrottleBindingBatchFailure withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 解除绑定失败的错误信息
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ThrottleBindingBatchFailure withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * 解除绑定失败的API的ID
     * @return apiId
     */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public ThrottleBindingBatchFailure withApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }

    /**
     * 解除绑定失败的API的名称
     * @return apiName
     */
    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ThrottleBindingBatchFailure throttleBindingBatchFailure = (ThrottleBindingBatchFailure) o;
        return Objects.equals(this.bindId, throttleBindingBatchFailure.bindId)
            && Objects.equals(this.errorCode, throttleBindingBatchFailure.errorCode)
            && Objects.equals(this.errorMsg, throttleBindingBatchFailure.errorMsg)
            && Objects.equals(this.apiId, throttleBindingBatchFailure.apiId)
            && Objects.equals(this.apiName, throttleBindingBatchFailure.apiName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bindId, errorCode, errorMsg, apiId, apiName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThrottleBindingBatchFailure {\n");
        sb.append("    bindId: ").append(toIndentedString(bindId)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
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
