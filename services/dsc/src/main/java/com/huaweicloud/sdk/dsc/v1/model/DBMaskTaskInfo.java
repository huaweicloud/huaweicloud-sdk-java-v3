package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DBMaskTaskInfo
 */
public class DBMaskTaskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_type")

    private String dbType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_line")

    private Integer executeLine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Integer progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_status")

    private String runStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_template_id")

    private String taskTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public DBMaskTaskInfo withDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }

    /**
     * DB类型
     * @return dbType
     */
    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public DBMaskTaskInfo withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 任务结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public DBMaskTaskInfo withExecuteLine(Integer executeLine) {
        this.executeLine = executeLine;
        return this;
    }

    /**
     * 执行行数
     * @return executeLine
     */
    public Integer getExecuteLine() {
        return executeLine;
    }

    public void setExecuteLine(Integer executeLine) {
        this.executeLine = executeLine;
    }

    public DBMaskTaskInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 任务ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DBMaskTaskInfo withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 执行进度
     * @return progress
     */
    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public DBMaskTaskInfo withRunStatus(String runStatus) {
        this.runStatus = runStatus;
        return this;
    }

    /**
     * 任务运行状态
     * @return runStatus
     */
    public String getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(String runStatus) {
        this.runStatus = runStatus;
    }

    public DBMaskTaskInfo withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 任务开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public DBMaskTaskInfo withTaskTemplateId(String taskTemplateId) {
        this.taskTemplateId = taskTemplateId;
        return this;
    }

    /**
     * 任务模板ID
     * @return taskTemplateId
     */
    public String getTaskTemplateId() {
        return taskTemplateId;
    }

    public void setTaskTemplateId(String taskTemplateId) {
        this.taskTemplateId = taskTemplateId;
    }

    public DBMaskTaskInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 任务类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DBMaskTaskInfo that = (DBMaskTaskInfo) obj;
        return Objects.equals(this.dbType, that.dbType) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.executeLine, that.executeLine) && Objects.equals(this.id, that.id)
            && Objects.equals(this.progress, that.progress) && Objects.equals(this.runStatus, that.runStatus)
            && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.taskTemplateId, that.taskTemplateId) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbType, endTime, executeLine, id, progress, runStatus, startTime, taskTemplateId, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DBMaskTaskInfo {\n");
        sb.append("    dbType: ").append(toIndentedString(dbType)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    executeLine: ").append(toIndentedString(executeLine)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    runStatus: ").append(toIndentedString(runStatus)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    taskTemplateId: ").append(toIndentedString(taskTemplateId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
