package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：训练作业规格参数。 **约束限制**：不涉及。
 */
public class JobUpdateRequestBodySpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification")

    private Notification notification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_policy")

    private JobUpdateRequestBodySpecSchedulePolicy schedulePolicy;

    public JobUpdateRequestBodySpec withNotification(Notification notification) {
        this.notification = notification;
        return this;
    }

    public JobUpdateRequestBodySpec withNotification(Consumer<Notification> notificationSetter) {
        if (this.notification == null) {
            this.notification = new Notification();
            notificationSetter.accept(this.notification);
        }

        return this;
    }

    /**
     * Get notification
     * @return notification
     */
    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public JobUpdateRequestBodySpec withSchedulePolicy(JobUpdateRequestBodySpecSchedulePolicy schedulePolicy) {
        this.schedulePolicy = schedulePolicy;
        return this;
    }

    public JobUpdateRequestBodySpec withSchedulePolicy(
        Consumer<JobUpdateRequestBodySpecSchedulePolicy> schedulePolicySetter) {
        if (this.schedulePolicy == null) {
            this.schedulePolicy = new JobUpdateRequestBodySpecSchedulePolicy();
            schedulePolicySetter.accept(this.schedulePolicy);
        }

        return this;
    }

    /**
     * Get schedulePolicy
     * @return schedulePolicy
     */
    public JobUpdateRequestBodySpecSchedulePolicy getSchedulePolicy() {
        return schedulePolicy;
    }

    public void setSchedulePolicy(JobUpdateRequestBodySpecSchedulePolicy schedulePolicy) {
        this.schedulePolicy = schedulePolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobUpdateRequestBodySpec that = (JobUpdateRequestBodySpec) obj;
        return Objects.equals(this.notification, that.notification)
            && Objects.equals(this.schedulePolicy, that.schedulePolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notification, schedulePolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobUpdateRequestBodySpec {\n");
        sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
        sb.append("    schedulePolicy: ").append(toIndentedString(schedulePolicy)).append("\n");
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
