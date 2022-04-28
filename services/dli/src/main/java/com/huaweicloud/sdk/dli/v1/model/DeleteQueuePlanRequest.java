package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteQueuePlanRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_id")

    private Long planId;

    public DeleteQueuePlanRequest withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 待删除定时扩缩计划的队列名称
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public DeleteQueuePlanRequest withPlanId(Long planId) {
        this.planId = planId;
        return this;
    }

    /**
     * 待删除的队列扩缩容计划的ID
     * @return planId
     */
    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteQueuePlanRequest deleteQueuePlanRequest = (DeleteQueuePlanRequest) o;
        return Objects.equals(this.queueName, deleteQueuePlanRequest.queueName)
            && Objects.equals(this.planId, deleteQueuePlanRequest.planId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queueName, planId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteQueuePlanRequest {\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
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
