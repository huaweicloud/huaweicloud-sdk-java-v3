package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListOpsAgentSpanMetricRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "span_name")

    private String spanName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "span_time")

    private String spanTime;

    public ListOpsAgentSpanMetricRequest withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * agentId
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public ListOpsAgentSpanMetricRequest withSpanName(String spanName) {
        this.spanName = spanName;
        return this;
    }

    /**
     * spanName
     * @return spanName
     */
    public String getSpanName() {
        return spanName;
    }

    public void setSpanName(String spanName) {
        this.spanName = spanName;
    }

    public ListOpsAgentSpanMetricRequest withSpanTime(String spanTime) {
        this.spanTime = spanTime;
        return this;
    }

    /**
     * Get spanTime
     * @return spanTime
     */
    public String getSpanTime() {
        return spanTime;
    }

    public void setSpanTime(String spanTime) {
        this.spanTime = spanTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsAgentSpanMetricRequest that = (ListOpsAgentSpanMetricRequest) obj;
        return Objects.equals(this.agentId, that.agentId) && Objects.equals(this.spanName, that.spanName)
            && Objects.equals(this.spanTime, that.spanTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId, spanName, spanTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsAgentSpanMetricRequest {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    spanName: ").append(toIndentedString(spanName)).append("\n");
        sb.append("    spanTime: ").append(toIndentedString(spanTime)).append("\n");
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
