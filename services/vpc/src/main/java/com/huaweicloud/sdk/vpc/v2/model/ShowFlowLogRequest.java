package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowFlowLogRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flowlog_id")

    private String flowlogId;

    public ShowFlowLogRequest withFlowlogId(String flowlogId) {
        this.flowlogId = flowlogId;
        return this;
    }

    /**
     * 流日志资源唯一标识
     * @return flowlogId
     */
    public String getFlowlogId() {
        return flowlogId;
    }

    public void setFlowlogId(String flowlogId) {
        this.flowlogId = flowlogId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowFlowLogRequest showFlowLogRequest = (ShowFlowLogRequest) o;
        return Objects.equals(this.flowlogId, showFlowLogRequest.flowlogId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowlogId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFlowLogRequest {\n");
        sb.append("    flowlogId: ").append(toIndentedString(flowlogId)).append("\n");
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
