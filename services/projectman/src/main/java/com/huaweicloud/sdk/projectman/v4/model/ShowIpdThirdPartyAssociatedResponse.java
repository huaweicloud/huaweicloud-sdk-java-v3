package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowIpdThirdPartyAssociatedResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private ThirdPartyAssociatedResult result;

    public ShowIpdThirdPartyAssociatedResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 响应状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowIpdThirdPartyAssociatedResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 查询失败的原因。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowIpdThirdPartyAssociatedResponse withResult(ThirdPartyAssociatedResult result) {
        this.result = result;
        return this;
    }

    public ShowIpdThirdPartyAssociatedResponse withResult(Consumer<ThirdPartyAssociatedResult> resultSetter) {
        if (this.result == null) {
            this.result = new ThirdPartyAssociatedResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public ThirdPartyAssociatedResult getResult() {
        return result;
    }

    public void setResult(ThirdPartyAssociatedResult result) {
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
        ShowIpdThirdPartyAssociatedResponse that = (ShowIpdThirdPartyAssociatedResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.message, that.message)
            && Objects.equals(this.result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, message, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIpdThirdPartyAssociatedResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
