package com.huaweicloud.sdk.dbss.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * JobBean
 */
public class JobBean  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    
    private String jobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_type")
    
    
    private String jobType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server_id")
    
    
    private String serverId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server_name")
    
    
    private String serverName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="begin_time")
    
    
    private Long beginTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    
    private Long endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charge_mode")
    
    
    private String chargeMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fail_reason")
    
    
    private String failReason;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ha_id")
    
    
    private String haId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ha_name")
    
    
    private String haName;

    public JobBean withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 任务ID,异步查询标识
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    

    public JobBean withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public JobBean withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    


    /**
     * 类型
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    

    public JobBean withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    


    /**
     * 虚拟机ID
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    

    public JobBean withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    


    /**
     * 虚拟机名称
     * @return serverName
     */
    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    

    public JobBean withBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    


    /**
     * 开始时间
     * @return beginTime
     */
    public Long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    

    public JobBean withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    

    public JobBean withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    


    /**
     * 计费模式
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    

    public JobBean withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * 错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    

    public JobBean withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    


    /**
     * 失败原因
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    

    public JobBean withHaId(String haId) {
        this.haId = haId;
        return this;
    }

    


    /**
     * 双机实例HA共用的id
     * @return haId
     */
    public String getHaId() {
        return haId;
    }

    public void setHaId(String haId) {
        this.haId = haId;
    }

    

    public JobBean withHaName(String haName) {
        this.haName = haName;
        return this;
    }

    


    /**
     * HA别名
     * @return haName
     */
    public String getHaName() {
        return haName;
    }

    public void setHaName(String haName) {
        this.haName = haName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobBean jobBean = (JobBean) o;
        return Objects.equals(this.jobId, jobBean.jobId) &&
            Objects.equals(this.status, jobBean.status) &&
            Objects.equals(this.jobType, jobBean.jobType) &&
            Objects.equals(this.serverId, jobBean.serverId) &&
            Objects.equals(this.serverName, jobBean.serverName) &&
            Objects.equals(this.beginTime, jobBean.beginTime) &&
            Objects.equals(this.endTime, jobBean.endTime) &&
            Objects.equals(this.chargeMode, jobBean.chargeMode) &&
            Objects.equals(this.errorCode, jobBean.errorCode) &&
            Objects.equals(this.failReason, jobBean.failReason) &&
            Objects.equals(this.haId, jobBean.haId) &&
            Objects.equals(this.haName, jobBean.haName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobId, status, jobType, serverId, serverName, beginTime, endTime, chargeMode, errorCode, failReason, haId, haName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobBean {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
        sb.append("    haId: ").append(toIndentedString(haId)).append("\n");
        sb.append("    haName: ").append(toIndentedString(haName)).append("\n");
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

