package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateFlowOutputRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_id")

    private String flowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private List<AddFlowOutputsRequest> body = null;

    public CreateFlowOutputRequest withFlowId(String flowId) {
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

    public CreateFlowOutputRequest withBody(List<AddFlowOutputsRequest> body) {
        this.body = body;
        return this;
    }

    public CreateFlowOutputRequest addBodyItem(AddFlowOutputsRequest bodyItem) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    public CreateFlowOutputRequest withBody(Consumer<List<AddFlowOutputsRequest>> bodySetter) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * Get body
     * @return body
     */
    public List<AddFlowOutputsRequest> getBody() {
        return body;
    }

    public void setBody(List<AddFlowOutputsRequest> body) {
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
        CreateFlowOutputRequest that = (CreateFlowOutputRequest) obj;
        return Objects.equals(this.flowId, that.flowId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFlowOutputRequest {\n");
        sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
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
