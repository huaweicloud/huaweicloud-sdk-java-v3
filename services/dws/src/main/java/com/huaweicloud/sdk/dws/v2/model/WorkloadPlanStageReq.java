package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 资源管理计划阶段请求。 **取值范围**： 不涉及。
 */
public class WorkloadPlanStageReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_plan_stage")

    private WorkloadPlanStageReqWorkloadPlanStage workloadPlanStage;

    public WorkloadPlanStageReq withWorkloadPlanStage(WorkloadPlanStageReqWorkloadPlanStage workloadPlanStage) {
        this.workloadPlanStage = workloadPlanStage;
        return this;
    }

    public WorkloadPlanStageReq withWorkloadPlanStage(
        Consumer<WorkloadPlanStageReqWorkloadPlanStage> workloadPlanStageSetter) {
        if (this.workloadPlanStage == null) {
            this.workloadPlanStage = new WorkloadPlanStageReqWorkloadPlanStage();
            workloadPlanStageSetter.accept(this.workloadPlanStage);
        }

        return this;
    }

    /**
     * Get workloadPlanStage
     * @return workloadPlanStage
     */
    public WorkloadPlanStageReqWorkloadPlanStage getWorkloadPlanStage() {
        return workloadPlanStage;
    }

    public void setWorkloadPlanStage(WorkloadPlanStageReqWorkloadPlanStage workloadPlanStage) {
        this.workloadPlanStage = workloadPlanStage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkloadPlanStageReq that = (WorkloadPlanStageReq) obj;
        return Objects.equals(this.workloadPlanStage, that.workloadPlanStage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workloadPlanStage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkloadPlanStageReq {\n");
        sb.append("    workloadPlanStage: ").append(toIndentedString(workloadPlanStage)).append("\n");
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
