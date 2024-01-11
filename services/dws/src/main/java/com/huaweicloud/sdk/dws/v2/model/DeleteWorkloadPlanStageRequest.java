package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteWorkloadPlanStageRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_id")

    private String planId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage_id")

    private String stageId;

    public DeleteWorkloadPlanStageRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public DeleteWorkloadPlanStageRequest withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * 计划ID
     * @return planId
     */
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public DeleteWorkloadPlanStageRequest withStageId(String stageId) {
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
        DeleteWorkloadPlanStageRequest that = (DeleteWorkloadPlanStageRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.planId, that.planId)
            && Objects.equals(this.stageId, that.stageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, planId, stageId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteWorkloadPlanStageRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
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
