package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateFlowsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow")

    private FlowDetailRespBody flow;

    public CreateFlowsResponse withFlow(FlowDetailRespBody flow) {
        this.flow = flow;
        return this;
    }

    public CreateFlowsResponse withFlow(Consumer<FlowDetailRespBody> flowSetter) {
        if (this.flow == null) {
            this.flow = new FlowDetailRespBody();
            flowSetter.accept(this.flow);
        }

        return this;
    }

    /**
     * Get flow
     * @return flow
     */
    public FlowDetailRespBody getFlow() {
        return flow;
    }

    public void setFlow(FlowDetailRespBody flow) {
        this.flow = flow;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateFlowsResponse that = (CreateFlowsResponse) obj;
        return Objects.equals(this.flow, that.flow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFlowsResponse {\n");
        sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
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
