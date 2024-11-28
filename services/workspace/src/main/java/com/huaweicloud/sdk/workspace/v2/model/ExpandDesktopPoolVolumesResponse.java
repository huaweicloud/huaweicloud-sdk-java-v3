package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ExpandDesktopPoolVolumesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

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
    @JsonProperty(value = "job_id")

    private String jobId;

    public ExpandDesktopPoolVolumesResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码，失败时返回。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ExpandDesktopPoolVolumesResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误描述。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ExpandDesktopPoolVolumesResponse withCbcJobId(String cbcJobId) {
        this.cbcJobId = cbcJobId;
        return this;
    }

    /**
     * 创建云桌面总任务ID，CBC根据此ID定期查询任务是否成功
     * @return cbcJobId
     */
    public String getCbcJobId() {
        return cbcJobId;
    }

    public void setCbcJobId(String cbcJobId) {
        this.cbcJobId = cbcJobId;
    }

    public ExpandDesktopPoolVolumesResponse withGetJobEndpoint(String getJobEndpoint) {
        this.getJobEndpoint = getJobEndpoint;
        return this;
    }

    /**
     * 云运营平台CBC获取到JobId后，会使用getJobEndpoint当做URL，调用云服务，查询获取Job结果
     * @return getJobEndpoint
     */
    public String getGetJobEndpoint() {
        return getJobEndpoint;
    }

    public void setGetJobEndpoint(String getJobEndpoint) {
        this.getJobEndpoint = getJobEndpoint;
    }

    public ExpandDesktopPoolVolumesResponse withMaxProvisionTime(Integer maxProvisionTime) {
        this.maxProvisionTime = maxProvisionTime;
        return this;
    }

    /**
     * 在线开通最大时间 在maxProvisionTime时间范围内，CBC会周期性的查询云服务开通结果；超过maxProvisionTime还没有开通成功，CBC会发失败工单，人工去分析处理。 单位：分钟。 如果为空，CBC默认为6小时。 取值范围（0,43200]，即30天。
     * minimum: 0
     * maximum: 43200
     * @return maxProvisionTime
     */
    public Integer getMaxProvisionTime() {
        return maxProvisionTime;
    }

    public void setMaxProvisionTime(Integer maxProvisionTime) {
        this.maxProvisionTime = maxProvisionTime;
    }

    public ExpandDesktopPoolVolumesResponse withMinProvisionTime(Integer minProvisionTime) {
        this.minProvisionTime = minProvisionTime;
        return this;
    }

    /**
     * 开通最小时间（云服务最快开通时长，或一般开通时长） 获取到JobId后，经过minProvisionTime时间后，才来查询获取云服务开通结果。如果为空，云运营平台获取到JobId后，就去查询云服务开通结果。 单位：分钟。 取值范围：(0, 43200)
     * minimum: 0
     * maximum: 43200
     * @return minProvisionTime
     */
    public Integer getMinProvisionTime() {
        return minProvisionTime;
    }

    public void setMinProvisionTime(Integer minProvisionTime) {
        this.minProvisionTime = minProvisionTime;
    }

    public ExpandDesktopPoolVolumesResponse withPeriodicQueryTime(Integer periodicQueryTime) {
        this.periodicQueryTime = periodicQueryTime;
        return this;
    }

    /**
     * Job周期性查询时间，默认2分钟查询一次 云运营平台会使用getJobEndpoint(Job查询接口)、每隔periodicQueryTime时间去查询云服务开通结果。 单位：分钟。 如果为空，则使用CBC默认的间隔时间（1分钟，2分钟，4分钟……15分钟）来查询云服务开通结果。 取值范围：(0, 43200)
     * minimum: 0
     * maximum: 43200
     * @return periodicQueryTime
     */
    public Integer getPeriodicQueryTime() {
        return periodicQueryTime;
    }

    public void setPeriodicQueryTime(Integer periodicQueryTime) {
        this.periodicQueryTime = periodicQueryTime;
    }

    public ExpandDesktopPoolVolumesResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExpandDesktopPoolVolumesResponse that = (ExpandDesktopPoolVolumesResponse) obj;
        return Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.errorMsg, that.errorMsg)
            && Objects.equals(this.cbcJobId, that.cbcJobId) && Objects.equals(this.getJobEndpoint, that.getJobEndpoint)
            && Objects.equals(this.maxProvisionTime, that.maxProvisionTime)
            && Objects.equals(this.minProvisionTime, that.minProvisionTime)
            && Objects.equals(this.periodicQueryTime, that.periodicQueryTime) && Objects.equals(this.jobId, that.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode,
            errorMsg,
            cbcJobId,
            getJobEndpoint,
            maxProvisionTime,
            minProvisionTime,
            periodicQueryTime,
            jobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpandDesktopPoolVolumesResponse {\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    cbcJobId: ").append(toIndentedString(cbcJobId)).append("\n");
        sb.append("    getJobEndpoint: ").append(toIndentedString(getJobEndpoint)).append("\n");
        sb.append("    maxProvisionTime: ").append(toIndentedString(maxProvisionTime)).append("\n");
        sb.append("    minProvisionTime: ").append(toIndentedString(minProvisionTime)).append("\n");
        sb.append("    periodicQueryTime: ").append(toIndentedString(periodicQueryTime)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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
