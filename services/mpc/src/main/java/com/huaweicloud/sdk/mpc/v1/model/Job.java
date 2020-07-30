package com.huaweicloud.sdk.mpc.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.Entity;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Job
 */
public class Job  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jobId")
    
    private String jobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jobType")
    
    private Integer jobType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jobStatus")
    
    private Integer jobStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="entities")
    
    private List<Entity> entities = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subJobs")
    
    private List<Job> subJobs = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="beginTime")
    
    private String beginTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="endTime")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="executeCode")
    
    private String executeCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="executeMessage")
    
    private String executeMessage;

    public Job withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 任务Id
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Job withJobType(Integer jobType) {
        this.jobType = jobType;
        return this;
    }

    


    /**
     * 任务类型
     * minimum: 0
     * maximum: 2147483647
     * @return jobType
     */
    public Integer getJobType() {
        return jobType;
    }

    public void setJobType(Integer jobType) {
        this.jobType = jobType;
    }

    public Job withJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    


    /**
     * 任务状态
     * minimum: 0
     * maximum: 2147483647
     * @return jobStatus
     */
    public Integer getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
    }

    public Job withEntities(List<Entity> entities) {
        this.entities = entities;
        return this;
    }

    
    public Job addEntitiesItem(Entity entitiesItem) {
        if (this.entities == null) {
            this.entities = new ArrayList<>();
        }
        this.entities.add(entitiesItem);
        return this;
    }

    public Job withEntities(Consumer<List<Entity>> entitiesSetter) {
        if(this.entities == null ){
            this.entities = new ArrayList<>();
        }
        entitiesSetter.accept(this.entities);
        return this;
    }

    /**
     * 实体列表
     * @return entities
     */
    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

    public Job withSubJobs(List<Job> subJobs) {
        this.subJobs = subJobs;
        return this;
    }

    
    public Job addSubJobsItem(Job subJobsItem) {
        if (this.subJobs == null) {
            this.subJobs = new ArrayList<>();
        }
        this.subJobs.add(subJobsItem);
        return this;
    }

    public Job withSubJobs(Consumer<List<Job>> subJobsSetter) {
        if(this.subJobs == null ){
            this.subJobs = new ArrayList<>();
        }
        subJobsSetter.accept(this.subJobs);
        return this;
    }

    /**
     * 子任务列表
     * @return subJobs
     */
    public List<Job> getSubJobs() {
        return subJobs;
    }

    public void setSubJobs(List<Job> subJobs) {
        this.subJobs = subJobs;
    }

    public Job withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    


    /**
     * 任务开始时间
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public Job withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 任务结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Job withExecuteCode(String executeCode) {
        this.executeCode = executeCode;
        return this;
    }

    


    /**
     * 任务运行代码
     * @return executeCode
     */
    public String getExecuteCode() {
        return executeCode;
    }

    public void setExecuteCode(String executeCode) {
        this.executeCode = executeCode;
    }

    public Job withExecuteMessage(String executeMessage) {
        this.executeMessage = executeMessage;
        return this;
    }

    


    /**
     * 任务运行信息
     * @return executeMessage
     */
    public String getExecuteMessage() {
        return executeMessage;
    }

    public void setExecuteMessage(String executeMessage) {
        this.executeMessage = executeMessage;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Job job = (Job) o;
        return Objects.equals(this.jobId, job.jobId) &&
            Objects.equals(this.jobType, job.jobType) &&
            Objects.equals(this.jobStatus, job.jobStatus) &&
            Objects.equals(this.entities, job.entities) &&
            Objects.equals(this.subJobs, job.subJobs) &&
            Objects.equals(this.beginTime, job.beginTime) &&
            Objects.equals(this.endTime, job.endTime) &&
            Objects.equals(this.executeCode, job.executeCode) &&
            Objects.equals(this.executeMessage, job.executeMessage);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobId, jobType, jobStatus, entities, subJobs, beginTime, endTime, executeCode, executeMessage);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Job {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
        sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
        sb.append("    subJobs: ").append(toIndentedString(subJobs)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    executeCode: ").append(toIndentedString(executeCode)).append("\n");
        sb.append("    executeMessage: ").append(toIndentedString(executeMessage)).append("\n");
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

