package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class SwitchPlanStageRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_id")

    private String planId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private WorkloadPlanStageIdReq body;

    public SwitchPlanStageRequest withClusterId(String clusterId) {
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

    public SwitchPlanStageRequest withPlanId(String planId) {
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

    public SwitchPlanStageRequest withBody(WorkloadPlanStageIdReq body) {
        this.body = body;
        return this;
    }

    public SwitchPlanStageRequest withBody(Consumer<WorkloadPlanStageIdReq> bodySetter) {
        if (this.body == null) {
            this.body = new WorkloadPlanStageIdReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public WorkloadPlanStageIdReq getBody() {
        return body;
    }

    public void setBody(WorkloadPlanStageIdReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchPlanStageRequest that = (SwitchPlanStageRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.planId, that.planId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, planId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchPlanStageRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
