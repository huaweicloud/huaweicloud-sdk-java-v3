package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 脚本任务信息。
 */
public class ScriptTaskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_scripts")

    private List<ScriptTaskInfoTaskScripts> taskScripts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_ids")

    private List<String> resourceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gray_resource_ids")

    private List<String> grayResourceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_num")

    private Integer successNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_num")

    private Integer failedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skip_num")

    private Integer skipNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private OffsetDateTime startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private OffsetDateTime endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ScriptTaskInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 脚本任务ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ScriptTaskInfo withTaskScripts(List<ScriptTaskInfoTaskScripts> taskScripts) {
        this.taskScripts = taskScripts;
        return this;
    }

    public ScriptTaskInfo addTaskScriptsItem(ScriptTaskInfoTaskScripts taskScriptsItem) {
        if (this.taskScripts == null) {
            this.taskScripts = new ArrayList<>();
        }
        this.taskScripts.add(taskScriptsItem);
        return this;
    }

    public ScriptTaskInfo withTaskScripts(Consumer<List<ScriptTaskInfoTaskScripts>> taskScriptsSetter) {
        if (this.taskScripts == null) {
            this.taskScripts = new ArrayList<>();
        }
        taskScriptsSetter.accept(this.taskScripts);
        return this;
    }

    /**
     * 脚本列表。
     * @return taskScripts
     */
    public List<ScriptTaskInfoTaskScripts> getTaskScripts() {
        return taskScripts;
    }

    public void setTaskScripts(List<ScriptTaskInfoTaskScripts> taskScripts) {
        this.taskScripts = taskScripts;
    }

    public ScriptTaskInfo withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型，如DESKTOP。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ScriptTaskInfo withResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    public ScriptTaskInfo addResourceIdsItem(String resourceIdsItem) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceIdsItem);
        return this;
    }

    public ScriptTaskInfo withResourceIds(Consumer<List<String>> resourceIdsSetter) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        resourceIdsSetter.accept(this.resourceIds);
        return this;
    }

    /**
     * 执行脚本的资源ID列表。
     * @return resourceIds
     */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public ScriptTaskInfo withGrayResourceIds(List<String> grayResourceIds) {
        this.grayResourceIds = grayResourceIds;
        return this;
    }

    public ScriptTaskInfo addGrayResourceIdsItem(String grayResourceIdsItem) {
        if (this.grayResourceIds == null) {
            this.grayResourceIds = new ArrayList<>();
        }
        this.grayResourceIds.add(grayResourceIdsItem);
        return this;
    }

    public ScriptTaskInfo withGrayResourceIds(Consumer<List<String>> grayResourceIdsSetter) {
        if (this.grayResourceIds == null) {
            this.grayResourceIds = new ArrayList<>();
        }
        grayResourceIdsSetter.accept(this.grayResourceIds);
        return this;
    }

    /**
     * 灰度批次执行资源ID列表。
     * @return grayResourceIds
     */
    public List<String> getGrayResourceIds() {
        return grayResourceIds;
    }

    public void setGrayResourceIds(List<String> grayResourceIds) {
        this.grayResourceIds = grayResourceIds;
    }

    public ScriptTaskInfo withSuccessNum(Integer successNum) {
        this.successNum = successNum;
        return this;
    }

    /**
     * task中成功的执行记录数量。
     * @return successNum
     */
    public Integer getSuccessNum() {
        return successNum;
    }

    public void setSuccessNum(Integer successNum) {
        this.successNum = successNum;
    }

    public ScriptTaskInfo withFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
        return this;
    }

    /**
     * task中失败的执行记录数量。
     * @return failedNum
     */
    public Integer getFailedNum() {
        return failedNum;
    }

    public void setFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
    }

    public ScriptTaskInfo withSkipNum(Integer skipNum) {
        this.skipNum = skipNum;
        return this;
    }

    /**
     * task中跳过的执行记录数量。
     * @return skipNum
     */
    public Integer getSkipNum() {
        return skipNum;
    }

    public void setSkipNum(Integer skipNum) {
        this.skipNum = skipNum;
    }

    public ScriptTaskInfo withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 脚本执行开始时间。
     * @return startTime
     */
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public ScriptTaskInfo withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 脚本执行结束时间。
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public ScriptTaskInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务结果。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScriptTaskInfo that = (ScriptTaskInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.taskScripts, that.taskScripts)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceIds, that.resourceIds)
            && Objects.equals(this.grayResourceIds, that.grayResourceIds)
            && Objects.equals(this.successNum, that.successNum) && Objects.equals(this.failedNum, that.failedNum)
            && Objects.equals(this.skipNum, that.skipNum) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            taskScripts,
            resourceType,
            resourceIds,
            grayResourceIds,
            successNum,
            failedNum,
            skipNum,
            startTime,
            endTime,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScriptTaskInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    taskScripts: ").append(toIndentedString(taskScripts)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
        sb.append("    grayResourceIds: ").append(toIndentedString(grayResourceIds)).append("\n");
        sb.append("    successNum: ").append(toIndentedString(successNum)).append("\n");
        sb.append("    failedNum: ").append(toIndentedString(failedNum)).append("\n");
        sb.append("    skipNum: ").append(toIndentedString(skipNum)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
