package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAuditTopicReportSchedulerConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduler")

    private SchedulerConfigBase scheduler;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_effective")

    private Boolean smnEffective;

    public ShowAuditTopicReportSchedulerConfigResponse withScheduler(SchedulerConfigBase scheduler) {
        this.scheduler = scheduler;
        return this;
    }

    public ShowAuditTopicReportSchedulerConfigResponse withScheduler(Consumer<SchedulerConfigBase> schedulerSetter) {
        if (this.scheduler == null) {
            this.scheduler = new SchedulerConfigBase();
            schedulerSetter.accept(this.scheduler);
        }

        return this;
    }

    /**
     * Get scheduler
     * @return scheduler
     */
    public SchedulerConfigBase getScheduler() {
        return scheduler;
    }

    public void setScheduler(SchedulerConfigBase scheduler) {
        this.scheduler = scheduler;
    }

    public ShowAuditTopicReportSchedulerConfigResponse withSmnEffective(Boolean smnEffective) {
        this.smnEffective = smnEffective;
        return this;
    }

    /**
     * 是否支持订阅  - true: 支持  - false: 不支持\"
     * @return smnEffective
     */
    public Boolean getSmnEffective() {
        return smnEffective;
    }

    public void setSmnEffective(Boolean smnEffective) {
        this.smnEffective = smnEffective;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAuditTopicReportSchedulerConfigResponse that = (ShowAuditTopicReportSchedulerConfigResponse) obj;
        return Objects.equals(this.scheduler, that.scheduler) && Objects.equals(this.smnEffective, that.smnEffective);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduler, smnEffective);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAuditTopicReportSchedulerConfigResponse {\n");
        sb.append("    scheduler: ").append(toIndentedString(scheduler)).append("\n");
        sb.append("    smnEffective: ").append(toIndentedString(smnEffective)).append("\n");
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
