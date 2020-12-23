package com.huaweicloud.sdk.rds.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rds.v3.model.GetTaskDetailListRspInstance;
import com.huaweicloud.sdk.rds.v3.model.GetTaskDetailListRspJobs;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListJobInfoDetailResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jobs")
    
    private GetTaskDetailListRspJobs jobs = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_detail")
    
    private String taskDetail;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance")
    
    private GetTaskDetailListRspInstance instance = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="entities")
    
    private Object entities = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fail_reason")
    
    private String failReason;

    public ListJobInfoDetailResponse withJobs(GetTaskDetailListRspJobs jobs) {
        this.jobs = jobs;
        return this;
    }

    public ListJobInfoDetailResponse withJobs(Consumer<GetTaskDetailListRspJobs> jobsSetter) {
        if(this.jobs == null ){
            this.jobs = new GetTaskDetailListRspJobs();
            jobsSetter.accept(this.jobs);
        }
        
        return this;
    }


    /**
     * Get jobs
     * @return jobs
     */
    public GetTaskDetailListRspJobs getJobs() {
        return jobs;
    }

    public void setJobs(GetTaskDetailListRspJobs jobs) {
        this.jobs = jobs;
    }

    public ListJobInfoDetailResponse withTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail;
        return this;
    }

    


    /**
     * 任务执行的具体的参数信息，为空则不返回该字段。
     * @return taskDetail
     */
    public String getTaskDetail() {
        return taskDetail;
    }

    public void setTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail;
    }

    public ListJobInfoDetailResponse withInstance(GetTaskDetailListRspInstance instance) {
        this.instance = instance;
        return this;
    }

    public ListJobInfoDetailResponse withInstance(Consumer<GetTaskDetailListRspInstance> instanceSetter) {
        if(this.instance == null ){
            this.instance = new GetTaskDetailListRspInstance();
            instanceSetter.accept(this.instance);
        }
        
        return this;
    }


    /**
     * Get instance
     * @return instance
     */
    public GetTaskDetailListRspInstance getInstance() {
        return instance;
    }

    public void setInstance(GetTaskDetailListRspInstance instance) {
        this.instance = instance;
    }

    public ListJobInfoDetailResponse withEntities(Object entities) {
        this.entities = entities;
        return this;
    }

    


    /**
     * 根据不同的任务，显示不同的内容。
     * @return entities
     */
    public Object getEntities() {
        return entities;
    }

    public void setEntities(Object entities) {
        this.entities = entities;
    }

    public ListJobInfoDetailResponse withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    


    /**
     * 任务执行失败时的错误信息。
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListJobInfoDetailResponse listJobInfoDetailResponse = (ListJobInfoDetailResponse) o;
        return Objects.equals(this.jobs, listJobInfoDetailResponse.jobs) &&
            Objects.equals(this.taskDetail, listJobInfoDetailResponse.taskDetail) &&
            Objects.equals(this.instance, listJobInfoDetailResponse.instance) &&
            Objects.equals(this.entities, listJobInfoDetailResponse.entities) &&
            Objects.equals(this.failReason, listJobInfoDetailResponse.failReason);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobs, taskDetail, instance, entities, failReason);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJobInfoDetailResponse {\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
        sb.append("    taskDetail: ").append(toIndentedString(taskDetail)).append("\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
        sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
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

