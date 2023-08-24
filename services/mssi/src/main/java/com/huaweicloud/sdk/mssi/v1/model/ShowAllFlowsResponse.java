package com.huaweicloud.sdk.mssi.v1.model;

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
public class ShowAllFlowsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private String count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_metas")

    private List<FlowMeta> flowMetas = null;

    public ShowAllFlowsResponse withCount(String count) {
        this.count = count;
        return this;
    }

    /**
     * 流的数量
     * @return count
     */
    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public ShowAllFlowsResponse withFlowMetas(List<FlowMeta> flowMetas) {
        this.flowMetas = flowMetas;
        return this;
    }

    public ShowAllFlowsResponse addFlowMetasItem(FlowMeta flowMetasItem) {
        if (this.flowMetas == null) {
            this.flowMetas = new ArrayList<>();
        }
        this.flowMetas.add(flowMetasItem);
        return this;
    }

    public ShowAllFlowsResponse withFlowMetas(Consumer<List<FlowMeta>> flowMetasSetter) {
        if (this.flowMetas == null) {
            this.flowMetas = new ArrayList<>();
        }
        flowMetasSetter.accept(this.flowMetas);
        return this;
    }

    /**
     * 流列表
     * @return flowMetas
     */
    public List<FlowMeta> getFlowMetas() {
        return flowMetas;
    }

    public void setFlowMetas(List<FlowMeta> flowMetas) {
        this.flowMetas = flowMetas;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAllFlowsResponse that = (ShowAllFlowsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.flowMetas, that.flowMetas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, flowMetas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAllFlowsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    flowMetas: ").append(toIndentedString(flowMetas)).append("\n");
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
