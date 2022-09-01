package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class StartWorkflowExecutionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_id")

    @JacksonXmlProperty(localName = "execution_id")

    private String executionId;

    public StartWorkflowExecutionResponse withExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * 错误码
     * @return executionId
     */
    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StartWorkflowExecutionResponse startWorkflowExecutionResponse = (StartWorkflowExecutionResponse) o;
        return Objects.equals(this.executionId, startWorkflowExecutionResponse.executionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartWorkflowExecutionResponse {\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
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
