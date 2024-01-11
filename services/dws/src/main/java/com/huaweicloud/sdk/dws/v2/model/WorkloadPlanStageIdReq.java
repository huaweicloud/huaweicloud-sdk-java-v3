package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源管理计划阶段ID
 */
public class WorkloadPlanStageIdReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage_id")

    private String stageId;

    public WorkloadPlanStageIdReq withStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }

    /**
     * 计划阶段ID
     * @return stageId
     */
    public String getStageId() {
        return stageId;
    }

    public void setStageId(String stageId) {
        this.stageId = stageId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkloadPlanStageIdReq that = (WorkloadPlanStageIdReq) obj;
        return Objects.equals(this.stageId, that.stageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stageId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkloadPlanStageIdReq {\n");
        sb.append("    stageId: ").append(toIndentedString(stageId)).append("\n");
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
