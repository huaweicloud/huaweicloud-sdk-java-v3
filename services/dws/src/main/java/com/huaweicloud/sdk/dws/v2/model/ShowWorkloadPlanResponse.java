package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowWorkloadPlanResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_res_code")

    private Integer workloadResCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_res_str")

    private String workloadResStr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_plan")

    private WorkloadPlanInfo workloadPlan;

    public ShowWorkloadPlanResponse withWorkloadResCode(Integer workloadResCode) {
        this.workloadResCode = workloadResCode;
        return this;
    }

    /**
     * **参数解释**： 结果状态码。 **取值范围**： 不涉及。
     * @return workloadResCode
     */
    public Integer getWorkloadResCode() {
        return workloadResCode;
    }

    public void setWorkloadResCode(Integer workloadResCode) {
        this.workloadResCode = workloadResCode;
    }

    public ShowWorkloadPlanResponse withWorkloadResStr(String workloadResStr) {
        this.workloadResStr = workloadResStr;
        return this;
    }

    /**
     * **参数解释**： 结果描述。 **取值范围**： 不涉及。
     * @return workloadResStr
     */
    public String getWorkloadResStr() {
        return workloadResStr;
    }

    public void setWorkloadResStr(String workloadResStr) {
        this.workloadResStr = workloadResStr;
    }

    public ShowWorkloadPlanResponse withWorkloadPlan(WorkloadPlanInfo workloadPlan) {
        this.workloadPlan = workloadPlan;
        return this;
    }

    public ShowWorkloadPlanResponse withWorkloadPlan(Consumer<WorkloadPlanInfo> workloadPlanSetter) {
        if (this.workloadPlan == null) {
            this.workloadPlan = new WorkloadPlanInfo();
            workloadPlanSetter.accept(this.workloadPlan);
        }

        return this;
    }

    /**
     * Get workloadPlan
     * @return workloadPlan
     */
    public WorkloadPlanInfo getWorkloadPlan() {
        return workloadPlan;
    }

    public void setWorkloadPlan(WorkloadPlanInfo workloadPlan) {
        this.workloadPlan = workloadPlan;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowWorkloadPlanResponse that = (ShowWorkloadPlanResponse) obj;
        return Objects.equals(this.workloadResCode, that.workloadResCode)
            && Objects.equals(this.workloadResStr, that.workloadResStr)
            && Objects.equals(this.workloadPlan, that.workloadPlan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workloadResCode, workloadResStr, workloadPlan);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWorkloadPlanResponse {\n");
        sb.append("    workloadResCode: ").append(toIndentedString(workloadResCode)).append("\n");
        sb.append("    workloadResStr: ").append(toIndentedString(workloadResStr)).append("\n");
        sb.append("    workloadPlan: ").append(toIndentedString(workloadPlan)).append("\n");
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
