package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ModifyFlowOutputRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_id")

    private String flowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_name")

    private String outputName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateFlowOutputRequestBody body;

    public ModifyFlowOutputRequest withFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }

    /**
     * 流id
     * @return flowId
     */
    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public ModifyFlowOutputRequest withOutputName(String outputName) {
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

    public ModifyFlowOutputRequest withBody(UpdateFlowOutputRequestBody body) {
        this.body = body;
        return this;
    }

    public ModifyFlowOutputRequest withBody(Consumer<UpdateFlowOutputRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateFlowOutputRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateFlowOutputRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateFlowOutputRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyFlowOutputRequest that = (ModifyFlowOutputRequest) obj;
        return Objects.equals(this.flowId, that.flowId) && Objects.equals(this.outputName, that.outputName)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowId, outputName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyFlowOutputRequest {\n");
        sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
        sb.append("    outputName: ").append(toIndentedString(outputName)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
