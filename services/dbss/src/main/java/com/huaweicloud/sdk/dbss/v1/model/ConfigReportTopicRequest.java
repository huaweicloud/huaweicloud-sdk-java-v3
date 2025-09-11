package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConfigReportTopicRequest
 */
public class ConfigReportTopicRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduler")

    private SchedulerBean scheduler;

    public ConfigReportTopicRequest withScheduler(SchedulerBean scheduler) {
        this.scheduler = scheduler;
        return this;
    }

    public ConfigReportTopicRequest withScheduler(Consumer<SchedulerBean> schedulerSetter) {
        if (this.scheduler == null) {
            this.scheduler = new SchedulerBean();
            schedulerSetter.accept(this.scheduler);
        }

        return this;
    }

    /**
     * Get scheduler
     * @return scheduler
     */
    public SchedulerBean getScheduler() {
        return scheduler;
    }

    public void setScheduler(SchedulerBean scheduler) {
        this.scheduler = scheduler;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigReportTopicRequest that = (ConfigReportTopicRequest) obj;
        return Objects.equals(this.scheduler, that.scheduler);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduler);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigReportTopicRequest {\n");
        sb.append("    scheduler: ").append(toIndentedString(scheduler)).append("\n");
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
