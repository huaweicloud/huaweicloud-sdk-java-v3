package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ResizeDesktopPoolResponse extends SdkResponse {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_policy")

    private String errorPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<ResizeDesktopPoolJobResponse> jobs = null;

    public ResizeDesktopPoolResponse withJobId(String jobId) {
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

    public ResizeDesktopPoolResponse withCbcJobId(String cbcJobId) {
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

    public ResizeDesktopPoolResponse withGetJobEndpoint(String getJobEndpoint) {
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

    public ResizeDesktopPoolResponse withMaxProvisionTime(Integer maxProvisionTime) {
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

    public ResizeDesktopPoolResponse withMinProvisionTime(Integer minProvisionTime) {
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

    public ResizeDesktopPoolResponse withPeriodicQueryTime(Integer periodicQueryTime) {
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

    public ResizeDesktopPoolResponse withErrorPolicy(String errorPolicy) {
        this.errorPolicy = errorPolicy;
        return this;
    }

    /**
     * 变更订单错误处理策略。cbc调用返回值。设置为 NO_WORKORDER。云运营平台会认为无法开通成功，退费给客户后，不会再发运维工单给云服务，而由云服务自己去闭环处理对应问题。
     * @return errorPolicy
     */
    public String getErrorPolicy() {
        return errorPolicy;
    }

    public void setErrorPolicy(String errorPolicy) {
        this.errorPolicy = errorPolicy;
    }

    public ResizeDesktopPoolResponse withJobs(List<ResizeDesktopPoolJobResponse> jobs) {
        this.jobs = jobs;
        return this;
    }

    public ResizeDesktopPoolResponse addJobsItem(ResizeDesktopPoolJobResponse jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public ResizeDesktopPoolResponse withJobs(Consumer<List<ResizeDesktopPoolJobResponse>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 按需桌面变更规格返回的任务信息。
     * @return jobs
     */
    public List<ResizeDesktopPoolJobResponse> getJobs() {
        return jobs;
    }

    public void setJobs(List<ResizeDesktopPoolJobResponse> jobs) {
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
        ResizeDesktopPoolResponse that = (ResizeDesktopPoolResponse) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.cbcJobId, that.cbcJobId)
            && Objects.equals(this.getJobEndpoint, that.getJobEndpoint)
            && Objects.equals(this.maxProvisionTime, that.maxProvisionTime)
            && Objects.equals(this.minProvisionTime, that.minProvisionTime)
            && Objects.equals(this.periodicQueryTime, that.periodicQueryTime)
            && Objects.equals(this.errorPolicy, that.errorPolicy) && Objects.equals(this.jobs, that.jobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            cbcJobId,
            getJobEndpoint,
            maxProvisionTime,
            minProvisionTime,
            periodicQueryTime,
            errorPolicy,
            jobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeDesktopPoolResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    cbcJobId: ").append(toIndentedString(cbcJobId)).append("\n");
        sb.append("    getJobEndpoint: ").append(toIndentedString(getJobEndpoint)).append("\n");
        sb.append("    maxProvisionTime: ").append(toIndentedString(maxProvisionTime)).append("\n");
        sb.append("    minProvisionTime: ").append(toIndentedString(minProvisionTime)).append("\n");
        sb.append("    periodicQueryTime: ").append(toIndentedString(periodicQueryTime)).append("\n");
        sb.append("    errorPolicy: ").append(toIndentedString(errorPolicy)).append("\n");
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
