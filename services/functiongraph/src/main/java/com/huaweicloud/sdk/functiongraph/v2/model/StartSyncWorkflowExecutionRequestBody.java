package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 函数流执行请求body体
 */
public class StartSyncWorkflowExecutionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "headers")

    private Object headers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private Object input;

    public StartSyncWorkflowExecutionRequestBody withHeaders(Object headers) {
        this.headers = headers;
        return this;
    }

    /**
     * 函数执行时需要的Header
     * @return headers
     */
    public Object getHeaders() {
        return headers;
    }

    public void setHeaders(Object headers) {
        this.headers = headers;
    }

    public StartSyncWorkflowExecutionRequestBody withInput(Object input) {
        this.input = input;
        return this;
    }

    /**
     * 定义函数执行时的入参，支持使用JSONPATH进行映射，以及指定默认值
     * @return input
     */
    public Object getInput() {
        return input;
    }

    public void setInput(Object input) {
        this.input = input;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StartSyncWorkflowExecutionRequestBody startSyncWorkflowExecutionRequestBody =
            (StartSyncWorkflowExecutionRequestBody) o;
        return Objects.equals(this.headers, startSyncWorkflowExecutionRequestBody.headers)
            && Objects.equals(this.input, startSyncWorkflowExecutionRequestBody.input);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headers, input);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartSyncWorkflowExecutionRequestBody {\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
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
