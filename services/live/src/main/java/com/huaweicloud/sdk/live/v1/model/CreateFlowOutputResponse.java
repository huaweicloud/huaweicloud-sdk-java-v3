package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateFlowOutputResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_id")

    private String flowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outputs")

    private List<FlowsOutput> outputs = null;

    public CreateFlowOutputResponse withFlowId(String flowId) {
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

    public CreateFlowOutputResponse withOutputs(List<FlowsOutput> outputs) {
        this.outputs = outputs;
        return this;
    }

    public CreateFlowOutputResponse addOutputsItem(FlowsOutput outputsItem) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        this.outputs.add(outputsItem);
        return this;
    }

    public CreateFlowOutputResponse withOutputs(Consumer<List<FlowsOutput>> outputsSetter) {
        if (this.outputs == null) {
            this.outputs = new ArrayList<>();
        }
        outputsSetter.accept(this.outputs);
        return this;
    }

    /**
     * 所有输出信息
     * @return outputs
     */
    public List<FlowsOutput> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<FlowsOutput> outputs) {
        this.outputs = outputs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateFlowOutputResponse that = (CreateFlowOutputResponse) obj;
        return Objects.equals(this.flowId, that.flowId) && Objects.equals(this.outputs, that.outputs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowId, outputs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFlowOutputResponse {\n");
        sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
        sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
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
