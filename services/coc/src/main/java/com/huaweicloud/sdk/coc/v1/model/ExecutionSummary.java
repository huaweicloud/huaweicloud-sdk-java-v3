package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 执行相关信息
 */
public class ExecutionSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_time")

    private Long reportTime;

    public ExecutionSummary withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 工单Id
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ExecutionSummary withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 脚本执行Id
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ExecutionSummary withReportTime(Long reportTime) {
        this.reportTime = reportTime;
        return this;
    }

    /**
     * 报告时间
     * @return reportTime
     */
    public Long getReportTime() {
        return reportTime;
    }

    public void setReportTime(Long reportTime) {
        this.reportTime = reportTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecutionSummary that = (ExecutionSummary) obj;
        return Objects.equals(this.orderId, that.orderId) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.reportTime, that.reportTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, jobId, reportTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecutionSummary {\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    reportTime: ").append(toIndentedString(reportTime)).append("\n");
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
