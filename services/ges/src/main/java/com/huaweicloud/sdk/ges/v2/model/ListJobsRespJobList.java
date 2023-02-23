package com.huaweicloud.sdk.ges.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v2.model.ShowJobRespJobDetail;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ListJobsRespJobList
 */
public class ListJobsRespJobList  {


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
    @JsonProperty(value="job_name")
    

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="related_graph")
    

    private String relatedGraph;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="begin_time")
    

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_detail")
    

    private ShowJobRespJobDetail jobDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fail_reason")
    

    private String failReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_progress")
    

    private Double jobProgress;

    public ListJobsRespJobList withJobId(String jobId) {
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

    

    public ListJobsRespJobList withStatus(String status) {
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

    

    public ListJobsRespJobList withJobType(String jobType) {
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

    

    public ListJobsRespJobList withJobName(String jobName) {
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

    

    public ListJobsRespJobList withRelatedGraph(String relatedGraph) {
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

    

    public ListJobsRespJobList withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    


    /**
     * 任务开始时间，格式为UTC,\"yyyy-MM-dd'T'HH:mm:ss\"。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    

    public ListJobsRespJobList withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 任务结束时间，格式为UTC,\"yyyy-MM-dd'T'HH:mm:ss\"。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    

    public ListJobsRespJobList withJobDetail(ShowJobRespJobDetail jobDetail) {
        this.jobDetail = jobDetail;
        return this;
    }

    public ListJobsRespJobList withJobDetail(Consumer<ShowJobRespJobDetail> jobDetailSetter) {
        if(this.jobDetail == null ){
            this.jobDetail = new ShowJobRespJobDetail();
            jobDetailSetter.accept(this.jobDetail);
        }
        
        return this;
    }


    /**
     * Get jobDetail
     * @return jobDetail
     */
    public ShowJobRespJobDetail getJobDetail() {
        return jobDetail;
    }

    public void setJobDetail(ShowJobRespJobDetail jobDetail) {
        this.jobDetail = jobDetail;
    }

    

    public ListJobsRespJobList withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    


    /**
     * 任务失败原因。
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    

    public ListJobsRespJobList withJobProgress(Double jobProgress) {
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
        ListJobsRespJobList listJobsRespJobList = (ListJobsRespJobList) o;
        return Objects.equals(this.jobId, listJobsRespJobList.jobId) &&
            Objects.equals(this.status, listJobsRespJobList.status) &&
            Objects.equals(this.jobType, listJobsRespJobList.jobType) &&
            Objects.equals(this.jobName, listJobsRespJobList.jobName) &&
            Objects.equals(this.relatedGraph, listJobsRespJobList.relatedGraph) &&
            Objects.equals(this.beginTime, listJobsRespJobList.beginTime) &&
            Objects.equals(this.endTime, listJobsRespJobList.endTime) &&
            Objects.equals(this.jobDetail, listJobsRespJobList.jobDetail) &&
            Objects.equals(this.failReason, listJobsRespJobList.failReason) &&
            Objects.equals(this.jobProgress, listJobsRespJobList.jobProgress);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobId, status, jobType, jobName, relatedGraph, beginTime, endTime, jobDetail, failReason, jobProgress);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJobsRespJobList {\n");
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

