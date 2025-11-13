package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改订阅详情。
 */
public class ModifySubscriptionsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_ids")

    private List<String> subscriptionIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_schedule")

    private OperateUsedJobSchedule jobSchedule;

    public ModifySubscriptionsRequestBody withSubscriptionIds(List<String> subscriptionIds) {
        this.subscriptionIds = subscriptionIds;
        return this;
    }

    public ModifySubscriptionsRequestBody addSubscriptionIdsItem(String subscriptionIdsItem) {
        if (this.subscriptionIds == null) {
            this.subscriptionIds = new ArrayList<>();
        }
        this.subscriptionIds.add(subscriptionIdsItem);
        return this;
    }

    public ModifySubscriptionsRequestBody withSubscriptionIds(Consumer<List<String>> subscriptionIdsSetter) {
        if (this.subscriptionIds == null) {
            this.subscriptionIds = new ArrayList<>();
        }
        subscriptionIdsSetter.accept(this.subscriptionIds);
        return this;
    }

    /**
     * 修改的订阅id列表。每次修改的订阅必须属于同一实例。
     * @return subscriptionIds
     */
    public List<String> getSubscriptionIds() {
        return subscriptionIds;
    }

    public void setSubscriptionIds(List<String> subscriptionIds) {
        this.subscriptionIds = subscriptionIds;
    }

    public ModifySubscriptionsRequestBody withJobSchedule(OperateUsedJobSchedule jobSchedule) {
        this.jobSchedule = jobSchedule;
        return this;
    }

    public ModifySubscriptionsRequestBody withJobSchedule(Consumer<OperateUsedJobSchedule> jobScheduleSetter) {
        if (this.jobSchedule == null) {
            this.jobSchedule = new OperateUsedJobSchedule();
            jobScheduleSetter.accept(this.jobSchedule);
        }

        return this;
    }

    /**
     * Get jobSchedule
     * @return jobSchedule
     */
    public OperateUsedJobSchedule getJobSchedule() {
        return jobSchedule;
    }

    public void setJobSchedule(OperateUsedJobSchedule jobSchedule) {
        this.jobSchedule = jobSchedule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifySubscriptionsRequestBody that = (ModifySubscriptionsRequestBody) obj;
        return Objects.equals(this.subscriptionIds, that.subscriptionIds)
            && Objects.equals(this.jobSchedule, that.jobSchedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptionIds, jobSchedule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifySubscriptionsRequestBody {\n");
        sb.append("    subscriptionIds: ").append(toIndentedString(subscriptionIds)).append("\n");
        sb.append("    jobSchedule: ").append(toIndentedString(jobSchedule)).append("\n");
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
