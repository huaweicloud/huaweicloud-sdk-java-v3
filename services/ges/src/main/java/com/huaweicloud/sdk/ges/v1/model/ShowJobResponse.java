package com.huaweicloud.sdk.ges.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v1.model.JobDetail;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowJobResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="errorMessage")
    
    @JacksonXmlProperty(localName = "errorMessage")
    
    private String errorMessage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="errorCode")
    
    @JacksonXmlProperty(localName = "errorCode")
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jobId")
    
    @JacksonXmlProperty(localName = "jobId")
    
    private String jobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    @JacksonXmlProperty(localName = "status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jobType")
    
    @JacksonXmlProperty(localName = "jobType")
    
    private String jobType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jobName")
    
    @JacksonXmlProperty(localName = "jobName")
    
    private String jobName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="relatedGraph")
    
    @JacksonXmlProperty(localName = "relatedGraph")
    
    private String relatedGraph;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="beginTime")
    
    @JacksonXmlProperty(localName = "beginTime")
    
    private String beginTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="endTime")
    
    @JacksonXmlProperty(localName = "endTime")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jobDetail")
    
    @JacksonXmlProperty(localName = "jobDetail")
    
    private JobDetail jobDetail;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="failReason")
    
    @JacksonXmlProperty(localName = "failReason")
    
    private String failReason;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jobProgress")
    
    @JacksonXmlProperty(localName = "jobProgress")
    
    private Double jobProgress;

    public ShowJobResponse withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    


    /**
     * 系统提示信息，执行成功时，字段可能为空。执行失败时，用于显示错误信息。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    

    public ShowJobResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * 系统提示信息，执行成功时，字段可能为空。执行失败时，用于显示错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    

    public ShowJobResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    

    public ShowJobResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 任务状态。  - pending:等待中 - running:运行中 - success:成功 - failed:失败
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public ShowJobResponse withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    


    /**
     * 任务类型。
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    

    public ShowJobResponse withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    


    /**
     * 任务名称。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    

    public ShowJobResponse withRelatedGraph(String relatedGraph) {
        this.relatedGraph = relatedGraph;
        return this;
    }

    


    /**
     * 关联图名称。
     * @return relatedGraph
     */
    public String getRelatedGraph() {
        return relatedGraph;
    }

    public void setRelatedGraph(String relatedGraph) {
        this.relatedGraph = relatedGraph;
    }

    

    public ShowJobResponse withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    


    /**
     * 任务开始时间，格式为UTC,\"yyyy-MM-dd'T'HH:mm:ss\"
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    

    public ShowJobResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 任务结束时间，格式为UTC,\"yyyy-MM-dd'T'HH:mm:ss\"
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    

    public ShowJobResponse withJobDetail(JobDetail jobDetail) {
        this.jobDetail = jobDetail;
        return this;
    }

    public ShowJobResponse withJobDetail(Consumer<JobDetail> jobDetailSetter) {
        if(this.jobDetail == null ){
            this.jobDetail = new JobDetail();
            jobDetailSetter.accept(this.jobDetail);
        }
        
        return this;
    }


    /**
     * Get jobDetail
     * @return jobDetail
     */
    public JobDetail getJobDetail() {
        return jobDetail;
    }

    public void setJobDetail(JobDetail jobDetail) {
        this.jobDetail = jobDetail;
    }

    

    public ShowJobResponse withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    


    /**
     * 任务失败原因
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    

    public ShowJobResponse withJobProgress(Double jobProgress) {
        this.jobProgress = jobProgress;
        return this;
    }

    


    /**
     * 任务执行进度，预留字段，暂未使用。
     * @return jobProgress
     */
    public Double getJobProgress() {
        return jobProgress;
    }

    public void setJobProgress(Double jobProgress) {
        this.jobProgress = jobProgress;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowJobResponse showJobResponse = (ShowJobResponse) o;
        return Objects.equals(this.errorMessage, showJobResponse.errorMessage) &&
            Objects.equals(this.errorCode, showJobResponse.errorCode) &&
            Objects.equals(this.jobId, showJobResponse.jobId) &&
            Objects.equals(this.status, showJobResponse.status) &&
            Objects.equals(this.jobType, showJobResponse.jobType) &&
            Objects.equals(this.jobName, showJobResponse.jobName) &&
            Objects.equals(this.relatedGraph, showJobResponse.relatedGraph) &&
            Objects.equals(this.beginTime, showJobResponse.beginTime) &&
            Objects.equals(this.endTime, showJobResponse.endTime) &&
            Objects.equals(this.jobDetail, showJobResponse.jobDetail) &&
            Objects.equals(this.failReason, showJobResponse.failReason) &&
            Objects.equals(this.jobProgress, showJobResponse.jobProgress);
    }
    @Override
    public int hashCode() {
        return Objects.hash(errorMessage, errorCode, jobId, status, jobType, jobName, relatedGraph, beginTime, endTime, jobDetail, failReason, jobProgress);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobResponse {\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    relatedGraph: ").append(toIndentedString(relatedGraph)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    jobDetail: ").append(toIndentedString(jobDetail)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
        sb.append("    jobProgress: ").append(toIndentedString(jobProgress)).append("\n");
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

