package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 子任务信息
 */
public class SubJobInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private Integer jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_status")

    private Integer jobStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entities")

    private List<JobResourceInfo> entities = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private OffsetDateTime beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private OffsetDateTime endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expected_end_time")

    private OffsetDateTime expectedEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_code")

    private String executeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_message")

    private String executeMessage;

    public SubJobInfo withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 子job标识
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public SubJobInfo withJobType(Integer jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 任务类型，固定值2：子Job
     * @return jobType
     */
    public Integer getJobType() {
        return jobType;
    }

    public void setJobType(Integer jobType) {
        this.jobType = jobType;
    }

    public SubJobInfo withJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * job状态 - 0：失败。 - 1：成功。 - 2：处理中。 - 3：正在初始化。
     * @return jobStatus
     */
    public Integer getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
    }

    public SubJobInfo withEntities(List<JobResourceInfo> entities) {
        this.entities = entities;
        return this;
    }

    public SubJobInfo addEntitiesItem(JobResourceInfo entitiesItem) {
        if (this.entities == null) {
            this.entities = new ArrayList<>();
        }
        this.entities.add(entitiesItem);
        return this;
    }

    public SubJobInfo withEntities(Consumer<List<JobResourceInfo>> entitiesSetter) {
        if (this.entities == null) {
            this.entities = new ArrayList<>();
        }
        entitiesSetter.accept(this.entities);
        return this;
    }

    /**
     * SubJob中处理的云服务/云资源对象。 创建、规格变更等场景是必填；冻结、解冻、删除等场景可空。
     * @return entities
     */
    public List<JobResourceInfo> getEntities() {
        return entities;
    }

    public void setEntities(List<JobResourceInfo> entities) {
        this.entities = entities;
    }

    public SubJobInfo withBeginTime(OffsetDateTime beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 任务开始时间
     * @return beginTime
     */
    public OffsetDateTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(OffsetDateTime beginTime) {
        this.beginTime = beginTime;
    }

    public SubJobInfo withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 任务结束时间
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public SubJobInfo withExpectedEndTime(OffsetDateTime expectedEndTime) {
        this.expectedEndTime = expectedEndTime;
        return this;
    }

    /**
     * 云服务预估的Job处理结束时间，只针对job有效，针对子job无效。
     * @return expectedEndTime
     */
    public OffsetDateTime getExpectedEndTime() {
        return expectedEndTime;
    }

    public void setExpectedEndTime(OffsetDateTime expectedEndTime) {
        this.expectedEndTime = expectedEndTime;
    }

    public SubJobInfo withExecuteCode(String executeCode) {
        this.executeCode = executeCode;
        return this;
    }

    /**
     * Job执行结果码
     * @return executeCode
     */
    public String getExecuteCode() {
        return executeCode;
    }

    public void setExecuteCode(String executeCode) {
        this.executeCode = executeCode;
    }

    public SubJobInfo withExecuteMessage(String executeMessage) {
        this.executeMessage = executeMessage;
        return this;
    }

    /**
     * Job执行结果描述，以及每个SubJob的执行结果描述
     * @return executeMessage
     */
    public String getExecuteMessage() {
        return executeMessage;
    }

    public void setExecuteMessage(String executeMessage) {
        this.executeMessage = executeMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubJobInfo that = (SubJobInfo) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.jobType, that.jobType)
            && Objects.equals(this.jobStatus, that.jobStatus) && Objects.equals(this.entities, that.entities)
            && Objects.equals(this.beginTime, that.beginTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.expectedEndTime, that.expectedEndTime)
            && Objects.equals(this.executeCode, that.executeCode)
            && Objects.equals(this.executeMessage, that.executeMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            jobType,
            jobStatus,
            entities,
            beginTime,
            endTime,
            expectedEndTime,
            executeCode,
            executeMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubJobInfo {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
        sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    expectedEndTime: ").append(toIndentedString(expectedEndTime)).append("\n");
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
