package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateDesktopResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cbcJobId")

    private String cbcJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "getJobEndpoint")

    private String getJobEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxProvisionTime")

    private Integer maxProvisionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minProvisionTime")

    private Integer minProvisionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "periodicQueryTime")

    private Integer periodicQueryTime;

    public CreateDesktopResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 创建云桌面总任务id
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public CreateDesktopResponse withCbcJobId(String cbcJobId) {
        this.cbcJobId = cbcJobId;
        return this;
    }

    /**
     * 【CBC回调】包周期创建桌面的任务ID
     * @return cbcJobId
     */
    public String getCbcJobId() {
        return cbcJobId;
    }

    public void setCbcJobId(String cbcJobId) {
        this.cbcJobId = cbcJobId;
    }

    public CreateDesktopResponse withGetJobEndpoint(String getJobEndpoint) {
        this.getJobEndpoint = getJobEndpoint;
        return this;
    }

    /**
     * 【CBC回调】云运营平台CBC获取到JobId后，会使用getJobEndpoint当做URL，调用云服务，查询获取Job结果。
     * @return getJobEndpoint
     */
    public String getGetJobEndpoint() {
        return getJobEndpoint;
    }

    public void setGetJobEndpoint(String getJobEndpoint) {
        this.getJobEndpoint = getJobEndpoint;
    }

    public CreateDesktopResponse withMaxProvisionTime(Integer maxProvisionTime) {
        this.maxProvisionTime = maxProvisionTime;
        return this;
    }

    /**
     * 【CBC回调】在线开通最大时间，在maxProvisionTime时间范围内，CBC会周期性的查询云服务开通结果；超过maxProvisionTime还没有开通成功，CBC会发失败工单，人工去分析处理。
     * minimum: 0
     * maximum: 2147483647
     * @return maxProvisionTime
     */
    public Integer getMaxProvisionTime() {
        return maxProvisionTime;
    }

    public void setMaxProvisionTime(Integer maxProvisionTime) {
        this.maxProvisionTime = maxProvisionTime;
    }

    public CreateDesktopResponse withMinProvisionTime(Integer minProvisionTime) {
        this.minProvisionTime = minProvisionTime;
        return this;
    }

    /**
     * 【CBC回调】开通最小时间（云服务最快开通时长，或一般开通时长）。获取到JobId后，经过minProvisionTime时间后，才来查询获取云服务开通结果。如果为空，云运营平台获取到JobId后，就去查询云服务开通结果。
     * minimum: 0
     * maximum: 2147483647
     * @return minProvisionTime
     */
    public Integer getMinProvisionTime() {
        return minProvisionTime;
    }

    public void setMinProvisionTime(Integer minProvisionTime) {
        this.minProvisionTime = minProvisionTime;
    }

    public CreateDesktopResponse withPeriodicQueryTime(Integer periodicQueryTime) {
        this.periodicQueryTime = periodicQueryTime;
        return this;
    }

    /**
     * 【CBC回调】云运营平台会使用getJobEndpoint(Job查询接口)、每隔periodicQueryTime时间去查询云服务开通结果。
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
        CreateDesktopResponse that = (CreateDesktopResponse) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.cbcJobId, that.cbcJobId)
            && Objects.equals(this.getJobEndpoint, that.getJobEndpoint)
            && Objects.equals(this.maxProvisionTime, that.maxProvisionTime)
            && Objects.equals(this.minProvisionTime, that.minProvisionTime)
            && Objects.equals(this.periodicQueryTime, that.periodicQueryTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, cbcJobId, getJobEndpoint, maxProvisionTime, minProvisionTime, periodicQueryTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDesktopResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    cbcJobId: ").append(toIndentedString(cbcJobId)).append("\n");
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
