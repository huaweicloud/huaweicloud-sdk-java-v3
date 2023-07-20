package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowFlowLogRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er_id")

    private String erId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_log_id")

    private String flowLogId;

    public ShowFlowLogRequest withErId(String erId) {
        this.erId = erId;
        return this;
    }

    /**
     * 企业路由器实例ID
     * @return erId
     */
    public String getErId() {
        return erId;
    }

    public void setErId(String erId) {
        this.erId = erId;
    }

    public ShowFlowLogRequest withFlowLogId(String flowLogId) {
        this.flowLogId = flowLogId;
        return this;
    }

    /**
     * 流日志ID
     * @return flowLogId
     */
    public String getFlowLogId() {
        return flowLogId;
    }

    public void setFlowLogId(String flowLogId) {
        this.flowLogId = flowLogId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFlowLogRequest that = (ShowFlowLogRequest) obj;
        return Objects.equals(this.erId, that.erId) && Objects.equals(this.flowLogId, that.flowLogId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(erId, flowLogId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFlowLogRequest {\n");
        sb.append("    erId: ").append(toIndentedString(erId)).append("\n");
        sb.append("    flowLogId: ").append(toIndentedString(flowLogId)).append("\n");
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
