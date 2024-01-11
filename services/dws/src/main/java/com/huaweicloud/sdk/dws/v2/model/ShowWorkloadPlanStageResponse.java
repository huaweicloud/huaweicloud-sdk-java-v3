package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowWorkloadPlanStageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_res_code")

    private Integer workloadResCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_res_str")

    private String workloadResStr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_plan_stage")

    private PlanStage workloadPlanStage;

    public ShowWorkloadPlanStageResponse withWorkloadResCode(Integer workloadResCode) {
        this.workloadResCode = workloadResCode;
        return this;
    }

    /**
     * 结果状态码。
     * @return workloadResCode
     */
    public Integer getWorkloadResCode() {
        return workloadResCode;
    }

    public void setWorkloadResCode(Integer workloadResCode) {
        this.workloadResCode = workloadResCode;
    }

    public ShowWorkloadPlanStageResponse withWorkloadResStr(String workloadResStr) {
        this.workloadResStr = workloadResStr;
        return this;
    }

    /**
     * 结果描述。
     * @return workloadResStr
     */
    public String getWorkloadResStr() {
        return workloadResStr;
    }

    public void setWorkloadResStr(String workloadResStr) {
        this.workloadResStr = workloadResStr;
    }

    public ShowWorkloadPlanStageResponse withWorkloadPlanStage(PlanStage workloadPlanStage) {
        this.workloadPlanStage = workloadPlanStage;
        return this;
    }

    public ShowWorkloadPlanStageResponse withWorkloadPlanStage(Consumer<PlanStage> workloadPlanStageSetter) {
        if (this.workloadPlanStage == null) {
            this.workloadPlanStage = new PlanStage();
            workloadPlanStageSetter.accept(this.workloadPlanStage);
        }

        return this;
    }

    /**
     * Get workloadPlanStage
     * @return workloadPlanStage
     */
    public PlanStage getWorkloadPlanStage() {
        return workloadPlanStage;
    }

    public void setWorkloadPlanStage(PlanStage workloadPlanStage) {
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
        ShowWorkloadPlanStageResponse that = (ShowWorkloadPlanStageResponse) obj;
        return Objects.equals(this.workloadResCode, that.workloadResCode)
            && Objects.equals(this.workloadResStr, that.workloadResStr)
            && Objects.equals(this.workloadPlanStage, that.workloadPlanStage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workloadResCode, workloadResStr, workloadPlanStage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWorkloadPlanStageResponse {\n");
        sb.append("    workloadResCode: ").append(toIndentedString(workloadResCode)).append("\n");
        sb.append("    workloadResStr: ").append(toIndentedString(workloadResStr)).append("\n");
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
