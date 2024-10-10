package com.huaweicloud.sdk.aad.v2.model;

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
public class ListDDoSFlowResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_bps")

    private List<FlowBps> flowBps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_pps")

    private List<FlowPps> flowPps = null;

    public ListDDoSFlowResponse withFlowBps(List<FlowBps> flowBps) {
        this.flowBps = flowBps;
        return this;
    }

    public ListDDoSFlowResponse addFlowBpsItem(FlowBps flowBpsItem) {
        if (this.flowBps == null) {
            this.flowBps = new ArrayList<>();
        }
        this.flowBps.add(flowBpsItem);
        return this;
    }

    public ListDDoSFlowResponse withFlowBps(Consumer<List<FlowBps>> flowBpsSetter) {
        if (this.flowBps == null) {
            this.flowBps = new ArrayList<>();
        }
        flowBpsSetter.accept(this.flowBps);
        return this;
    }

    /**
     * 当请求type=bps时必返回
     * @return flowBps
     */
    public List<FlowBps> getFlowBps() {
        return flowBps;
    }

    public void setFlowBps(List<FlowBps> flowBps) {
        this.flowBps = flowBps;
    }

    public ListDDoSFlowResponse withFlowPps(List<FlowPps> flowPps) {
        this.flowPps = flowPps;
        return this;
    }

    public ListDDoSFlowResponse addFlowPpsItem(FlowPps flowPpsItem) {
        if (this.flowPps == null) {
            this.flowPps = new ArrayList<>();
        }
        this.flowPps.add(flowPpsItem);
        return this;
    }

    public ListDDoSFlowResponse withFlowPps(Consumer<List<FlowPps>> flowPpsSetter) {
        if (this.flowPps == null) {
            this.flowPps = new ArrayList<>();
        }
        flowPpsSetter.accept(this.flowPps);
        return this;
    }

    /**
     * 当请求type=pps时必返回
     * @return flowPps
     */
    public List<FlowPps> getFlowPps() {
        return flowPps;
    }

    public void setFlowPps(List<FlowPps> flowPps) {
        this.flowPps = flowPps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDDoSFlowResponse that = (ListDDoSFlowResponse) obj;
        return Objects.equals(this.flowBps, that.flowBps) && Objects.equals(this.flowPps, that.flowPps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowBps, flowPps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDDoSFlowResponse {\n");
        sb.append("    flowBps: ").append(toIndentedString(flowBps)).append("\n");
        sb.append("    flowPps: ").append(toIndentedString(flowPps)).append("\n");
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
