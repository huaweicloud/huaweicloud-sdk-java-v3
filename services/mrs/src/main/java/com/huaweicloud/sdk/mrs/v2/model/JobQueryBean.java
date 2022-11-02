package com.huaweicloud.sdk.mrs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * JobQueryBean
 */
public class JobQueryBean  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    
    private String jobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user")
    
    
    private String user;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_name")
    
    
    private String jobName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_result")
    
    
    private String jobResult;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_state")
    
    
    private String jobState;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_progress")
    
    
    private Float jobProgress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_type")
    
    
    private String jobType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="started_time")
    
    
    private Long startedTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="submitted_time")
    
    
    private Long submittedTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="finished_time")
    
    
    private Long finishedTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="elapsed_time")
    
    
    private Long elapsedTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="arguments")
    
    
    private String arguments;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="launcher_id")
    
    
    private String launcherId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="properties")
    
    
    private String properties;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tracking_url")
    
    
    private String trackingUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="queue")
    
    
    private String queue;

    public JobQueryBean withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 作业ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    

    public JobQueryBean withUser(String user) {
        this.user = user;
        return this;
    }

    


    /**
     * 提交作业的用户名称。
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    

    public JobQueryBean withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    


    /**
     * 作业名称。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    

    public JobQueryBean withJobResult(String jobResult) {
        this.jobResult = jobResult;
        return this;
    }

    


    /**
     * 作业最终结果。 - FAILED：执行失败的作业 - KILLED：执行中被手动终止的作业。 - UNDEFINED：正在执行的作业。 - SUCCEEDED：执行成功的作业。
     * @return jobResult
     */
    public String getJobResult() {
        return jobResult;
    }

    public void setJobResult(String jobResult) {
        this.jobResult = jobResult;
    }

    

    public JobQueryBean withJobState(String jobState) {
        this.jobState = jobState;
        return this;
    }

    


    /**
     * 作业执行状态。  - FAILED：失败 - KILLED：已终止 - NEW：已创建 - NEW_SAVING：已创建保存中 - SUBMITTED：已提交 - ACCEPTED：已接受 - RUNNING：运行中 - FINISHED：已完成
     * @return jobState
     */
    public String getJobState() {
        return jobState;
    }

    public void setJobState(String jobState) {
        this.jobState = jobState;
    }

    

    public JobQueryBean withJobProgress(Float jobProgress) {
        this.jobProgress = jobProgress;
        return this;
    }

    


    /**
     * 作业执行进度。
     * @return jobProgress
     */
    public Float getJobProgress() {
        return jobProgress;
    }

    public void setJobProgress(Float jobProgress) {
        this.jobProgress = jobProgress;
    }

    

    public JobQueryBean withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    


    /**
     * 作业类型。 - MapReduce - SparkSubmit：SparkPython类型的作业在查询时作业类型请选择SparkSubmit。 - HiveScript - HiveSql - DistCp，导入、导出数据。 - SparkScript - SparkSql - Flink
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    

    public JobQueryBean withStartedTime(Long startedTime) {
        this.startedTime = startedTime;
        return this;
    }

    


    /**
     * 作业开始执行时间。单位：毫秒。
     * @return startedTime
     */
    public Long getStartedTime() {
        return startedTime;
    }

    public void setStartedTime(Long startedTime) {
        this.startedTime = startedTime;
    }

    

    public JobQueryBean withSubmittedTime(Long submittedTime) {
        this.submittedTime = submittedTime;
        return this;
    }

    


    /**
     * 作业提交时间。单位：毫秒。
     * @return submittedTime
     */
    public Long getSubmittedTime() {
        return submittedTime;
    }

    public void setSubmittedTime(Long submittedTime) {
        this.submittedTime = submittedTime;
    }

    

    public JobQueryBean withFinishedTime(Long finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }

    


    /**
     * 作业完成时间。单位：毫秒。
     * @return finishedTime
     */
    public Long getFinishedTime() {
        return finishedTime;
    }

    public void setFinishedTime(Long finishedTime) {
        this.finishedTime = finishedTime;
    }

    

    public JobQueryBean withElapsedTime(Long elapsedTime) {
        this.elapsedTime = elapsedTime;
        return this;
    }

    


    /**
     * 作业执行时长。单位：毫秒。
     * @return elapsedTime
     */
    public Long getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(Long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    

    public JobQueryBean withArguments(String arguments) {
        this.arguments = arguments;
        return this;
    }

    


    /**
     * 运行参数。
     * @return arguments
     */
    public String getArguments() {
        return arguments;
    }

    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    

    public JobQueryBean withLauncherId(String launcherId) {
        this.launcherId = launcherId;
        return this;
    }

    


    /**
     * 实际作业编号。
     * @return launcherId
     */
    public String getLauncherId() {
        return launcherId;
    }

    public void setLauncherId(String launcherId) {
        this.launcherId = launcherId;
    }

    

    public JobQueryBean withProperties(String properties) {
        this.properties = properties;
        return this;
    }

    


    /**
     * 配置参数，用于传-d参数。最多为2048字符，不能包含><|'`&!\\特殊字符，可为空。
     * @return properties
     */
    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    

    public JobQueryBean withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * 实际作业编号。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    

    public JobQueryBean withTrackingUrl(String trackingUrl) {
        this.trackingUrl = trackingUrl;
        return this;
    }

    


    /**
     *  日志链接地址。当前仅SparkSubmit作业支持该参数。 该参数基于集群的EIP访问集群中的YARN WebUI页面，用户如果在VPC界面解绑EIP，MRS服务侧数据会因为未更新导致该参数引用旧EIP导致访问失败，可通过对集群重新进行EIP的绑定来修复该问题。
     * @return trackingUrl
     */
    public String getTrackingUrl() {
        return trackingUrl;
    }

    public void setTrackingUrl(String trackingUrl) {
        this.trackingUrl = trackingUrl;
    }

    

    public JobQueryBean withQueue(String queue) {
        this.queue = queue;
        return this;
    }

    


    /**
     * 作业的资源对列类型。
     * @return queue
     */
    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobQueryBean jobQueryBean = (JobQueryBean) o;
        return Objects.equals(this.jobId, jobQueryBean.jobId) &&
            Objects.equals(this.user, jobQueryBean.user) &&
            Objects.equals(this.jobName, jobQueryBean.jobName) &&
            Objects.equals(this.jobResult, jobQueryBean.jobResult) &&
            Objects.equals(this.jobState, jobQueryBean.jobState) &&
            Objects.equals(this.jobProgress, jobQueryBean.jobProgress) &&
            Objects.equals(this.jobType, jobQueryBean.jobType) &&
            Objects.equals(this.startedTime, jobQueryBean.startedTime) &&
            Objects.equals(this.submittedTime, jobQueryBean.submittedTime) &&
            Objects.equals(this.finishedTime, jobQueryBean.finishedTime) &&
            Objects.equals(this.elapsedTime, jobQueryBean.elapsedTime) &&
            Objects.equals(this.arguments, jobQueryBean.arguments) &&
            Objects.equals(this.launcherId, jobQueryBean.launcherId) &&
            Objects.equals(this.properties, jobQueryBean.properties) &&
            Objects.equals(this.appId, jobQueryBean.appId) &&
            Objects.equals(this.trackingUrl, jobQueryBean.trackingUrl) &&
            Objects.equals(this.queue, jobQueryBean.queue);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobId, user, jobName, jobResult, jobState, jobProgress, jobType, startedTime, submittedTime, finishedTime, elapsedTime, arguments, launcherId, properties, appId, trackingUrl, queue);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobQueryBean {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    jobResult: ").append(toIndentedString(jobResult)).append("\n");
        sb.append("    jobState: ").append(toIndentedString(jobState)).append("\n");
        sb.append("    jobProgress: ").append(toIndentedString(jobProgress)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    startedTime: ").append(toIndentedString(startedTime)).append("\n");
        sb.append("    submittedTime: ").append(toIndentedString(submittedTime)).append("\n");
        sb.append("    finishedTime: ").append(toIndentedString(finishedTime)).append("\n");
        sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
        sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
        sb.append("    launcherId: ").append(toIndentedString(launcherId)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
        sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
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

