package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowFlowGraphResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "err_code")

    private String errCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private FlowGraph2Result result;

    public ShowFlowGraphResponse withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * 状态
     * @return success
     */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public ShowFlowGraphResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 消息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowFlowGraphResponse withErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }

    /**
     * 错误码
     * @return errCode
     */
    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public ShowFlowGraphResponse withResult(FlowGraph2Result result) {
        this.result = result;
        return this;
    }

    public ShowFlowGraphResponse withResult(Consumer<FlowGraph2Result> resultSetter) {
        if (this.result == null) {
            this.result = new FlowGraph2Result();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public FlowGraph2Result getResult() {
        return result;
    }

    public void setResult(FlowGraph2Result result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFlowGraphResponse that = (ShowFlowGraphResponse) obj;
        return Objects.equals(this.success, that.success) && Objects.equals(this.message, that.message)
            && Objects.equals(this.errCode, that.errCode) && Objects.equals(this.result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, message, errCode, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFlowGraphResponse {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    errCode: ").append(toIndentedString(errCode)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
