package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 所有作业监控信息。
 */
public class ShowJobMonitorInfoRespPayloadJobs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    @JacksonXmlProperty(localName = "job_id")

    private Long jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    @JacksonXmlProperty(localName = "metrics")

    private ShowJobMonitorInfoRespPayloadJobsMetrics metrics;

    public ShowJobMonitorInfoRespPayloadJobs withJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 作业ID。
     * @return jobId
     */
    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public ShowJobMonitorInfoRespPayloadJobs withMetrics(ShowJobMonitorInfoRespPayloadJobsMetrics metrics) {
        this.metrics = metrics;
        return this;
    }

    public ShowJobMonitorInfoRespPayloadJobs withMetrics(
        Consumer<ShowJobMonitorInfoRespPayloadJobsMetrics> metricsSetter) {
        if (this.metrics == null) {
            this.metrics = new ShowJobMonitorInfoRespPayloadJobsMetrics();
            metricsSetter.accept(this.metrics);
        }

        return this;
    }

    /**
     * Get metrics
     * @return metrics
     */
    public ShowJobMonitorInfoRespPayloadJobsMetrics getMetrics() {
        return metrics;
    }

    public void setMetrics(ShowJobMonitorInfoRespPayloadJobsMetrics metrics) {
        this.metrics = metrics;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowJobMonitorInfoRespPayloadJobs showJobMonitorInfoRespPayloadJobs = (ShowJobMonitorInfoRespPayloadJobs) o;
        return Objects.equals(this.jobId, showJobMonitorInfoRespPayloadJobs.jobId)
            && Objects.equals(this.metrics, showJobMonitorInfoRespPayloadJobs.metrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, metrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobMonitorInfoRespPayloadJobs {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
