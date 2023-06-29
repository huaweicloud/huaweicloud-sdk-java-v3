package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 作业审计日志信息。
 */
public class ShowJobMonitorInfoRespPayload {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<ShowJobMonitorInfoRespPayloadJobs> jobs = null;

    public ShowJobMonitorInfoRespPayload withJobs(List<ShowJobMonitorInfoRespPayloadJobs> jobs) {
        this.jobs = jobs;
        return this;
    }

    public ShowJobMonitorInfoRespPayload addJobsItem(ShowJobMonitorInfoRespPayloadJobs jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public ShowJobMonitorInfoRespPayload withJobs(Consumer<List<ShowJobMonitorInfoRespPayloadJobs>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 所有作业监控信息。
     * @return jobs
     */
    public List<ShowJobMonitorInfoRespPayloadJobs> getJobs() {
        return jobs;
    }

    public void setJobs(List<ShowJobMonitorInfoRespPayloadJobs> jobs) {
        this.jobs = jobs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobMonitorInfoRespPayload that = (ShowJobMonitorInfoRespPayload) obj;
        return Objects.equals(this.jobs, that.jobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobMonitorInfoRespPayload {\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
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
