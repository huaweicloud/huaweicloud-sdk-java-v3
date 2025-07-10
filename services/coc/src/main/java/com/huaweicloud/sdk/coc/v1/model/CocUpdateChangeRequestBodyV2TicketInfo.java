package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 主单字段
 */
public class CocUpdateChangeRequestBodyV2TicketInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_flow_status")

    private String workFlowStatus;

    public CocUpdateChangeRequestBodyV2TicketInfo withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * 阶段
     * @return phase
     */
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public CocUpdateChangeRequestBodyV2TicketInfo withWorkFlowStatus(String workFlowStatus) {
        this.workFlowStatus = workFlowStatus;
        return this;
    }

    /**
     * 状态
     * @return workFlowStatus
     */
    public String getWorkFlowStatus() {
        return workFlowStatus;
    }

    public void setWorkFlowStatus(String workFlowStatus) {
        this.workFlowStatus = workFlowStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CocUpdateChangeRequestBodyV2TicketInfo that = (CocUpdateChangeRequestBodyV2TicketInfo) obj;
        return Objects.equals(this.phase, that.phase) && Objects.equals(this.workFlowStatus, that.workFlowStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phase, workFlowStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CocUpdateChangeRequestBodyV2TicketInfo {\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    workFlowStatus: ").append(toIndentedString(workFlowStatus)).append("\n");
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
