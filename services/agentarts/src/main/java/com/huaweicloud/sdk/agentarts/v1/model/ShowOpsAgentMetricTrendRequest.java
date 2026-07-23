package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowOpsAgentMetricTrendRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ShowOpsAgentMetricTrendRequestBody body;

    public ShowOpsAgentMetricTrendRequest withBody(ShowOpsAgentMetricTrendRequestBody body) {
        this.body = body;
        return this;
    }

    public ShowOpsAgentMetricTrendRequest withBody(Consumer<ShowOpsAgentMetricTrendRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ShowOpsAgentMetricTrendRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ShowOpsAgentMetricTrendRequestBody getBody() {
        return body;
    }

    public void setBody(ShowOpsAgentMetricTrendRequestBody body) {
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
        ShowOpsAgentMetricTrendRequest that = (ShowOpsAgentMetricTrendRequest) obj;
        return Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsAgentMetricTrendRequest {\n");
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
