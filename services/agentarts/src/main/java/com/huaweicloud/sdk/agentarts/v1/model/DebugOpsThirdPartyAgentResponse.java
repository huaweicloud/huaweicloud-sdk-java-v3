package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class DebugOpsThirdPartyAgentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_code")

    private Integer statusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_time")

    private Integer responseTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private String output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "raw_response")

    private String rawResponse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    public DebugOpsThirdPartyAgentResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * **参数解释：** HTTP响应状态码。 **取值范围：** 不涉及。
     * @return statusCode
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public DebugOpsThirdPartyAgentResponse withResponseTime(Integer responseTime) {
        this.responseTime = responseTime;
        return this;
    }

    /**
     * **参数解释：** 响应时间，单位毫秒。 **取值范围：** 不涉及。
     * @return responseTime
     */
    public Integer getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(Integer responseTime) {
        this.responseTime = responseTime;
    }

    public DebugOpsThirdPartyAgentResponse withOutput(String output) {
        this.output = output;
        return this;
    }

    /**
     * **参数解释：** 提取后的Agent输出内容。 **取值范围：** 不涉及。
     * @return output
     */
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public DebugOpsThirdPartyAgentResponse withRawResponse(String rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * **参数解释：** 原始响应内容。 **取值范围：** 不涉及。
     * @return rawResponse
     */
    public String getRawResponse() {
        return rawResponse;
    }

    public void setRawResponse(String rawResponse) {
        this.rawResponse = rawResponse;
    }

    public DebugOpsThirdPartyAgentResponse withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * **参数解释：** 错误信息，调用失败时返回。 **取值范围：** 不涉及。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DebugOpsThirdPartyAgentResponse that = (DebugOpsThirdPartyAgentResponse) obj;
        return Objects.equals(this.statusCode, that.statusCode) && Objects.equals(this.responseTime, that.responseTime)
            && Objects.equals(this.output, that.output) && Objects.equals(this.rawResponse, that.rawResponse)
            && Objects.equals(this.errorMessage, that.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusCode, responseTime, output, rawResponse, errorMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DebugOpsThirdPartyAgentResponse {\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    rawResponse: ").append(toIndentedString(rawResponse)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
