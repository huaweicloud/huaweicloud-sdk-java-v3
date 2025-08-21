package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class DeleteFlowOutputResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_id")

    private String flowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_name")

    private String outputName;

    public DeleteFlowOutputResponse withFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }

    /**
     * 流ID
     * @return flowId
     */
    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public DeleteFlowOutputResponse withOutputName(String outputName) {
        this.outputName = outputName;
        return this;
    }

    /**
     * 输出名称
     * @return outputName
     */
    public String getOutputName() {
        return outputName;
    }

    public void setOutputName(String outputName) {
        this.outputName = outputName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteFlowOutputResponse that = (DeleteFlowOutputResponse) obj;
        return Objects.equals(this.flowId, that.flowId) && Objects.equals(this.outputName, that.outputName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowId, outputName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteFlowOutputResponse {\n");
        sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
        sb.append("    outputName: ").append(toIndentedString(outputName)).append("\n");
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
