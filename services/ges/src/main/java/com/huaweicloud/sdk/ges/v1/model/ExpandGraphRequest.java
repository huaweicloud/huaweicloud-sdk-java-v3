package com.huaweicloud.sdk.ges.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ExpandGraphRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "graph_id")

    private String graphId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ExpandGraphReq body;

    public ExpandGraphRequest withGraphId(String graphId) {
        this.graphId = graphId;
        return this;
    }

    /**
     * 图ID。
     * @return graphId
     */
    public String getGraphId() {
        return graphId;
    }

    public void setGraphId(String graphId) {
        this.graphId = graphId;
    }

    public ExpandGraphRequest withBody(ExpandGraphReq body) {
        this.body = body;
        return this;
    }

    public ExpandGraphRequest withBody(Consumer<ExpandGraphReq> bodySetter) {
        if (this.body == null) {
            this.body = new ExpandGraphReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ExpandGraphReq getBody() {
        return body;
    }

    public void setBody(ExpandGraphReq body) {
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
        ExpandGraphRequest that = (ExpandGraphRequest) obj;
        return Objects.equals(this.graphId, that.graphId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(graphId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpandGraphRequest {\n");
        sb.append("    graphId: ").append(toIndentedString(graphId)).append("\n");
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
