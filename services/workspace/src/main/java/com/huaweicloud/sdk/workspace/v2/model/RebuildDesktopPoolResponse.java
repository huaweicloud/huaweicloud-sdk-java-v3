package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class RebuildDesktopPoolResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "get_job_endpoint")

    private String getJobEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_provision_time")

    private Integer maxProvisionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_provision_time")

    private Integer minProvisionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "periodic_query_time")

    private Integer periodicQueryTime;

    public RebuildDesktopPoolResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 重建系统盘总任务id。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public RebuildDesktopPoolResponse withGetJobEndpoint(String getJobEndpoint) {
        this.getJobEndpoint = getJobEndpoint;
        return this;
    }

    /**
     * 云运营平台CBC获取到JobId后，会使用getJobEndpoint当做URL，调用云服务，查询获取Job结果。
     * @return getJobEndpoint
     */
    public String getGetJobEndpoint() {
        return getJobEndpoint;
    }

    public void setGetJobEndpoint(String getJobEndpoint) {
        this.getJobEndpoint = getJobEndpoint;
    }

    public RebuildDesktopPoolResponse withMaxProvisionTime(Integer maxProvisionTime) {
        this.maxProvisionTime = maxProvisionTime;
        return this;
    }

    /**
     * 在线开通最大时间。
     * @return maxProvisionTime
     */
    public Integer getMaxProvisionTime() {
        return maxProvisionTime;
    }

    public void setMaxProvisionTime(Integer maxProvisionTime) {
        this.maxProvisionTime = maxProvisionTime;
    }

    public RebuildDesktopPoolResponse withMinProvisionTime(Integer minProvisionTime) {
        this.minProvisionTime = minProvisionTime;
        return this;
    }

    /**
     * 开通最小时间（云服务最快开通时长，或一般开通时长）。
     * @return minProvisionTime
     */
    public Integer getMinProvisionTime() {
        return minProvisionTime;
    }

    public void setMinProvisionTime(Integer minProvisionTime) {
        this.minProvisionTime = minProvisionTime;
    }

    public RebuildDesktopPoolResponse withPeriodicQueryTime(Integer periodicQueryTime) {
        this.periodicQueryTime = periodicQueryTime;
        return this;
    }

    /**
     * Job周期性查询时间。
     * @return periodicQueryTime
     */
    public Integer getPeriodicQueryTime() {
        return periodicQueryTime;
    }

    public void setPeriodicQueryTime(Integer periodicQueryTime) {
        this.periodicQueryTime = periodicQueryTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RebuildDesktopPoolResponse that = (RebuildDesktopPoolResponse) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.getJobEndpoint, that.getJobEndpoint)
            && Objects.equals(this.maxProvisionTime, that.maxProvisionTime)
            && Objects.equals(this.minProvisionTime, that.minProvisionTime)
            && Objects.equals(this.periodicQueryTime, that.periodicQueryTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, getJobEndpoint, maxProvisionTime, minProvisionTime, periodicQueryTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RebuildDesktopPoolResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    getJobEndpoint: ").append(toIndentedString(getJobEndpoint)).append("\n");
        sb.append("    maxProvisionTime: ").append(toIndentedString(maxProvisionTime)).append("\n");
        sb.append("    minProvisionTime: ").append(toIndentedString(minProvisionTime)).append("\n");
        sb.append("    periodicQueryTime: ").append(toIndentedString(periodicQueryTime)).append("\n");
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
