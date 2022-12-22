package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源管理计划
 */
public class WorkloadPlanReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_name")

    private String planName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_cluster_name")

    private String logicalClusterName;

    public WorkloadPlanReq withPlanName(String planName) {
        this.planName = planName;
        return this;
    }

    /**
     * 计划名称
     * @return planName
     */
    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public WorkloadPlanReq withLogicalClusterName(String logicalClusterName) {
        this.logicalClusterName = logicalClusterName;
        return this;
    }

    /**
     * 逻辑集群名称
     * @return logicalClusterName
     */
    public String getLogicalClusterName() {
        return logicalClusterName;
    }

    public void setLogicalClusterName(String logicalClusterName) {
        this.logicalClusterName = logicalClusterName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkloadPlanReq workloadPlanReq = (WorkloadPlanReq) o;
        return Objects.equals(this.planName, workloadPlanReq.planName)
            && Objects.equals(this.logicalClusterName, workloadPlanReq.logicalClusterName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planName, logicalClusterName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkloadPlanReq {\n");
        sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
        sb.append("    logicalClusterName: ").append(toIndentedString(logicalClusterName)).append("\n");
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
