package com.huaweicloud.sdk.esw.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Job
 */
public class Job {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process")

    private String process;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public Job withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * - 参数解释：任务的唯一标识。 - 约束限制：带“-”的UUID格式。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Job withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * - 参数解释：当前任务的名称。 - 约束限制：不涉及。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Job withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * - 参数解释：任务状态。 - 约束限制：不涉及。 - 取值范围：   - RUNNING：运行中   - FAILED：失败   - COMPLETED：已完成 - 默认取值：不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Job withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * - 参数解释：任务开始时间。 - 约束限制：UTC时间，格式为yyyy-MM-ddTHH:mm:ss。 - 取值范围：不涉及。 - 默认取值：不涉及。
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
     * - 参数解释：任务结束时间。 - 约束限制：   - UTC时间，格式为yyyy-MM-ddTHH:mm:ss。   - 仅在任务状态为FAILED或者COMPLETED时可见 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Job withProcess(String process) {
        this.process = process;
        return this;
    }

    /**
     * - 参数解释：任务当前进度，以百分比展示。 - 约束限制：仅在任务状态为RUNNING时可见。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return process
     */
    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public Job withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * - 参数解释：任务的失败原因。 - 约束限制：仅在任务状态为FAILED时显示。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public Job withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * - 参数解释：任务当前关联的资源ID。 - 约束限制：不涉及。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public Job withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * - 参数解释：任务当前关联的资源名称。 - 约束限制：不涉及。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public Job withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * - 参数解释：任务当前关联的资源类型。 - 约束限制：不涉及。 - 取值范围：   - instance：ESW实例 - 默认取值：不涉及。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public Job withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * - 参数解释：ESW实例所属项目ID。 - 约束限制：不涉及。 - 取值范围：不涉及。 - 默认取值：不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Job that = (Job) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.process, that.process)
            && Objects.equals(this.failReason, that.failReason) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            status,
            beginTime,
            endTime,
            process,
            failReason,
            resourceId,
            resourceName,
            resourceType,
            projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Job {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    process: ").append(toIndentedString(process)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
