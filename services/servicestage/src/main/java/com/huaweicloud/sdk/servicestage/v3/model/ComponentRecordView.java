package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ComponentRecordView
 */
public class ComponentRecordView {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private Object description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_used")

    private Boolean currentUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_type")

    private String deployType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<RecordJob> jobs = null;

    public ComponentRecordView withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * Get beginTime
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ComponentRecordView withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get endTime
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ComponentRecordView withDescription(Object description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public ComponentRecordView withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * Get instanceId
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ComponentRecordView withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get version
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ComponentRecordView withCurrentUsed(Boolean currentUsed) {
        this.currentUsed = currentUsed;
        return this;
    }

    /**
     * Get currentUsed
     * @return currentUsed
     */
    public Boolean getCurrentUsed() {
        return currentUsed;
    }

    public void setCurrentUsed(Boolean currentUsed) {
        this.currentUsed = currentUsed;
    }

    public ComponentRecordView withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ComponentRecordView withDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }

    /**
     * Get deployType
     * @return deployType
     */
    public String getDeployType() {
        return deployType;
    }

    public void setDeployType(String deployType) {
        this.deployType = deployType;
    }

    public ComponentRecordView withJobs(List<RecordJob> jobs) {
        this.jobs = jobs;
        return this;
    }

    public ComponentRecordView addJobsItem(RecordJob jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public ComponentRecordView withJobs(Consumer<List<RecordJob>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * Get jobs
     * @return jobs
     */
    public List<RecordJob> getJobs() {
        return jobs;
    }

    public void setJobs(List<RecordJob> jobs) {
        this.jobs = jobs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentRecordView componentRecordView = (ComponentRecordView) o;
        return Objects.equals(this.beginTime, componentRecordView.beginTime)
            && Objects.equals(this.endTime, componentRecordView.endTime)
            && Objects.equals(this.description, componentRecordView.description)
            && Objects.equals(this.instanceId, componentRecordView.instanceId)
            && Objects.equals(this.version, componentRecordView.version)
            && Objects.equals(this.currentUsed, componentRecordView.currentUsed)
            && Objects.equals(this.status, componentRecordView.status)
            && Objects.equals(this.deployType, componentRecordView.deployType)
            && Objects.equals(this.jobs, componentRecordView.jobs);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(beginTime, endTime, description, instanceId, version, currentUsed, status, deployType, jobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentRecordView {\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    currentUsed: ").append(toIndentedString(currentUsed)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
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
