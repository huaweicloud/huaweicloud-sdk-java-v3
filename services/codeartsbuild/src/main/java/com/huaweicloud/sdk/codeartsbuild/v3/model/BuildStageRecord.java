package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 构建步骤
 */
public class BuildStageRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_code")

    private Integer statusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_status")

    private String logStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_time")

    private String scheduleTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queued_time")

    private String queuedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_time")

    private String finishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_duration")

    private Integer buildDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pending_duration")

    private Integer pendingDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_record_id")

    private String buildRecordId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_id")

    private String executionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_stage_name")

    private String executionStageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private Integer nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private Integer sequence;

    public BuildStageRecord withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 步骤编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BuildStageRecord withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 步骤状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BuildStageRecord withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * 状态码
     * @return statusCode
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public BuildStageRecord withLogStatus(String logStatus) {
        this.logStatus = logStatus;
        return this;
    }

    /**
     * 日志状态
     * @return logStatus
     */
    public String getLogStatus() {
        return logStatus;
    }

    public void setLogStatus(String logStatus) {
        this.logStatus = logStatus;
    }

    public BuildStageRecord withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public BuildStageRecord withScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }

    /**
     * 构建下发时间
     * @return scheduleTime
     */
    public String getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    public BuildStageRecord withQueuedTime(String queuedTime) {
        this.queuedTime = queuedTime;
        return this;
    }

    /**
     * 构建排队耗时
     * @return queuedTime
     */
    public String getQueuedTime() {
        return queuedTime;
    }

    public void setQueuedTime(String queuedTime) {
        this.queuedTime = queuedTime;
    }

    public BuildStageRecord withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public BuildStageRecord withFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * 结束时间
     * @return finishTime
     */
    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public BuildStageRecord withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 构建时长
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public BuildStageRecord withBuildDuration(Integer buildDuration) {
        this.buildDuration = buildDuration;
        return this;
    }

    /**
     * 子任务构建耗时
     * @return buildDuration
     */
    public Integer getBuildDuration() {
        return buildDuration;
    }

    public void setBuildDuration(Integer buildDuration) {
        this.buildDuration = buildDuration;
    }

    public BuildStageRecord withPendingDuration(Integer pendingDuration) {
        this.pendingDuration = pendingDuration;
        return this;
    }

    /**
     * 等待时间
     * @return pendingDuration
     */
    public Integer getPendingDuration() {
        return pendingDuration;
    }

    public void setPendingDuration(Integer pendingDuration) {
        this.pendingDuration = pendingDuration;
    }

    public BuildStageRecord withBuildRecordId(String buildRecordId) {
        this.buildRecordId = buildRecordId;
        return this;
    }

    /**
     * 构建记录ID
     * @return buildRecordId
     */
    public String getBuildRecordId() {
        return buildRecordId;
    }

    public void setBuildRecordId(String buildRecordId) {
        this.buildRecordId = buildRecordId;
    }

    public BuildStageRecord withExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * 八爪鱼任务ID
     * @return executionId
     */
    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public BuildStageRecord withExecutionStageName(String executionStageName) {
        this.executionStageName = executionStageName;
        return this;
    }

    /**
     * 步骤名称
     * @return executionStageName
     */
    public String getExecutionStageName() {
        return executionStageName;
    }

    public void setExecutionStageName(String executionStageName) {
        this.executionStageName = executionStageName;
    }

    public BuildStageRecord withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 步骤名称
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public BuildStageRecord withNodeId(Integer nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID
     * @return nodeId
     */
    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    public BuildStageRecord withSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

    /**
     * 序号
     * @return sequence
     */
    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BuildStageRecord that = (BuildStageRecord) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.statusCode, that.statusCode) && Objects.equals(this.logStatus, that.logStatus)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.scheduleTime, that.scheduleTime)
            && Objects.equals(this.queuedTime, that.queuedTime) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.finishTime, that.finishTime) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.buildDuration, that.buildDuration)
            && Objects.equals(this.pendingDuration, that.pendingDuration)
            && Objects.equals(this.buildRecordId, that.buildRecordId)
            && Objects.equals(this.executionId, that.executionId)
            && Objects.equals(this.executionStageName, that.executionStageName)
            && Objects.equals(this.displayName, that.displayName) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.sequence, that.sequence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            status,
            statusCode,
            logStatus,
            createTime,
            scheduleTime,
            queuedTime,
            startTime,
            finishTime,
            duration,
            buildDuration,
            pendingDuration,
            buildRecordId,
            executionId,
            executionStageName,
            displayName,
            nodeId,
            sequence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BuildStageRecord {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    logStatus: ").append(toIndentedString(logStatus)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    scheduleTime: ").append(toIndentedString(scheduleTime)).append("\n");
        sb.append("    queuedTime: ").append(toIndentedString(queuedTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    buildDuration: ").append(toIndentedString(buildDuration)).append("\n");
        sb.append("    pendingDuration: ").append(toIndentedString(pendingDuration)).append("\n");
        sb.append("    buildRecordId: ").append(toIndentedString(buildRecordId)).append("\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    executionStageName: ").append(toIndentedString(executionStageName)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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
