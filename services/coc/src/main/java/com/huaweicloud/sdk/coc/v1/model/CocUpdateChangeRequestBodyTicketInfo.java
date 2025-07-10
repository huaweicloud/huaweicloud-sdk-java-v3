package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 变更主单信息。
 */
public class CocUpdateChangeRequestBodyTicketInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_flow_status")

    private String workFlowStatus;

    public CocUpdateChangeRequestBodyTicketInfo withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * -| 工单操作的类型，枚举值。 · phase_change_end：完成 · phase_change_cancel：撤销 · phase_change_draft：草稿 · phase_change_implemente：变更实施和验证 · phase_change_apply：申请人确认 · phase_change_approve：审批中 · phase_change_close：关闭
     * @return phase
     */
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public CocUpdateChangeRequestBodyTicketInfo withWorkFlowStatus(String workFlowStatus) {
        this.workFlowStatus = workFlowStatus;
        return this;
    }

    /**
     * 工单状态。
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
        CocUpdateChangeRequestBodyTicketInfo that = (CocUpdateChangeRequestBodyTicketInfo) obj;
        return Objects.equals(this.phase, that.phase) && Objects.equals(this.workFlowStatus, that.workFlowStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phase, workFlowStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CocUpdateChangeRequestBodyTicketInfo {\n");
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
