package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 集群升级流程的执行状态 **约束限制：** 当前仅支持Cancel **取值范围：** - Cancel：表示取消升级  **默认取值：** 不涉及
 */
public class UpgradeWorkFlowUpdateRequestBodyStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private WorkFlowPhase phase;

    public UpgradeWorkFlowUpdateRequestBodyStatus withPhase(WorkFlowPhase phase) {
        this.phase = phase;
        return this;
    }

    /**
     * Get phase
     * @return phase
     */
    public WorkFlowPhase getPhase() {
        return phase;
    }

    public void setPhase(WorkFlowPhase phase) {
        this.phase = phase;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeWorkFlowUpdateRequestBodyStatus that = (UpgradeWorkFlowUpdateRequestBodyStatus) obj;
        return Objects.equals(this.phase, that.phase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phase);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeWorkFlowUpdateRequestBodyStatus {\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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
