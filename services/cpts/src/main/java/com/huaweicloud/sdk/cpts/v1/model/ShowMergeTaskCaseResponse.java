package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowMergeTaskCaseResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend")

    private Object extend;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private CaseReportSummary result;

    public ShowMergeTaskCaseResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 响应码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ShowMergeTaskCaseResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 响应消息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowMergeTaskCaseResponse withExtend(Object extend) {
        this.extend = extend;
        return this;
    }

    /**
     * 扩展信息
     * @return extend
     */
    public Object getExtend() {
        return extend;
    }

    public void setExtend(Object extend) {
        this.extend = extend;
    }

    public ShowMergeTaskCaseResponse withResult(CaseReportSummary result) {
        this.result = result;
        return this;
    }

    public ShowMergeTaskCaseResponse withResult(Consumer<CaseReportSummary> resultSetter) {
        if (this.result == null) {
            this.result = new CaseReportSummary();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public CaseReportSummary getResult() {
        return result;
    }

    public void setResult(CaseReportSummary result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMergeTaskCaseResponse showMergeTaskCaseResponse = (ShowMergeTaskCaseResponse) o;
        return Objects.equals(this.code, showMergeTaskCaseResponse.code)
            && Objects.equals(this.message, showMergeTaskCaseResponse.message)
            && Objects.equals(this.extend, showMergeTaskCaseResponse.extend)
            && Objects.equals(this.result, showMergeTaskCaseResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, extend, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMergeTaskCaseResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    extend: ").append(toIndentedString(extend)).append("\n");
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
