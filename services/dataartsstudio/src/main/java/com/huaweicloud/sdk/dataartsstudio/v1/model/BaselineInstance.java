package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BaselineInstance
 */
public class BaselineInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline")

    private Object baseline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_id")

    private String baselineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_name")

    private String baselineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_version")

    private Integer baselineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dag")

    private String dag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "buffer")

    private Long buffer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estimate_complete_time")

    private Long estimateCompleteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expect_time")

    private Long expectTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_status")

    private String finishStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_time")

    private Long executeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_instances")

    private Object taskInstances;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_id")

    private String ownerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_name")

    private String ownerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_alarm_time")

    private Long firstAlarmTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_alarm_time")

    private Long lastAlarmTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sla_time")

    private Long slaTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_time")

    private Long processTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recover_time")

    private Long recoverTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignore_time")

    private Long ignoreTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_buffer")

    private Long processBuffer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_day")

    private Integer createDay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private String instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_user_id")

    private String processUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_user_name")

    private String processUserName;

    public BaselineInstance withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 基线实例ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BaselineInstance withBaseline(Object baseline) {
        this.baseline = baseline;
        return this;
    }

    /**
     * 基线明细。
     * @return baseline
     */
    public Object getBaseline() {
        return baseline;
    }

    public void setBaseline(Object baseline) {
        this.baseline = baseline;
    }

    public BaselineInstance withBaselineId(String baselineId) {
        this.baselineId = baselineId;
        return this;
    }

    /**
     * 基线ID。
     * @return baselineId
     */
    public String getBaselineId() {
        return baselineId;
    }

    public void setBaselineId(String baselineId) {
        this.baselineId = baselineId;
    }

    public BaselineInstance withBaselineName(String baselineName) {
        this.baselineName = baselineName;
        return this;
    }

    /**
     * 基线任务名称。
     * @return baselineName
     */
    public String getBaselineName() {
        return baselineName;
    }

    public void setBaselineName(String baselineName) {
        this.baselineName = baselineName;
    }

    public BaselineInstance withBaselineVersion(Integer baselineVersion) {
        this.baselineVersion = baselineVersion;
        return this;
    }

    /**
     * 版本号。
     * @return baselineVersion
     */
    public Integer getBaselineVersion() {
        return baselineVersion;
    }

    public void setBaselineVersion(Integer baselineVersion) {
        this.baselineVersion = baselineVersion;
    }

    public BaselineInstance withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 优先级。
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public BaselineInstance withDag(String dag) {
        this.dag = dag;
        return this;
    }

    /**
     * 基线任务实例作业依赖图（包含JOB_ID+JOB名称+版本号+是否为关键路径节点）。
     * @return dag
     */
    public String getDag() {
        return dag;
    }

    public void setDag(String dag) {
        this.dag = dag;
    }

    public BaselineInstance withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 基线实例状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BaselineInstance withBuffer(Long buffer) {
        this.buffer = buffer;
        return this;
    }

    /**
     * 基线实例余量，单位为s。
     * @return buffer
     */
    public Long getBuffer() {
        return buffer;
    }

    public void setBuffer(Long buffer) {
        this.buffer = buffer;
    }

    public BaselineInstance withEstimateCompleteTime(Long estimateCompleteTime) {
        this.estimateCompleteTime = estimateCompleteTime;
        return this;
    }

    /**
     * 预计完成时间戳，单位毫秒。
     * @return estimateCompleteTime
     */
    public Long getEstimateCompleteTime() {
        return estimateCompleteTime;
    }

    public void setEstimateCompleteTime(Long estimateCompleteTime) {
        this.estimateCompleteTime = estimateCompleteTime;
    }

    public BaselineInstance withExpectTime(Long expectTime) {
        this.expectTime = expectTime;
        return this;
    }

    /**
     * 实例预警时间戳，单位毫秒。
     * @return expectTime
     */
    public Long getExpectTime() {
        return expectTime;
    }

    public void setExpectTime(Long expectTime) {
        this.expectTime = expectTime;
    }

    public BaselineInstance withFinishStatus(String finishStatus) {
        this.finishStatus = finishStatus;
        return this;
    }

    /**
     * 基线实例是否完成。
     * @return finishStatus
     */
    public String getFinishStatus() {
        return finishStatus;
    }

    public void setFinishStatus(String finishStatus) {
        this.finishStatus = finishStatus;
    }

    public BaselineInstance withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 基线实例开始时间戳，单位毫秒。
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public BaselineInstance withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 基线实例结束时间戳，单位毫秒，finish_status（基线实例完成状态）为FINISH（已完成）时，返回基线实例的完成时间戳。
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public BaselineInstance withExecuteTime(Long executeTime) {
        this.executeTime = executeTime;
        return this;
    }

    /**
     * 运行时间戳，单位毫秒。
     * @return executeTime
     */
    public Long getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(Long executeTime) {
        this.executeTime = executeTime;
    }

    public BaselineInstance withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误编码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public BaselineInstance withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 错误信息。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public BaselineInstance withTaskInstances(Object taskInstances) {
        this.taskInstances = taskInstances;
        return this;
    }

    /**
     * 任务实例信息。
     * @return taskInstances
     */
    public Object getTaskInstances() {
        return taskInstances;
    }

    public void setTaskInstances(Object taskInstances) {
        this.taskInstances = taskInstances;
    }

    public BaselineInstance withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * 责任人用户ID。
     * @return ownerId
     */
    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public BaselineInstance withOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    /**
     * 责任人用户名称。
     * @return ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public BaselineInstance withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 责任人租户ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public BaselineInstance withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 责任人租户名称。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public BaselineInstance withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public BaselineInstance withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * DataArts Studio实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public BaselineInstance withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public BaselineInstance withFirstAlarmTime(Long firstAlarmTime) {
        this.firstAlarmTime = firstAlarmTime;
        return this;
    }

    /**
     * 首次告警时间戳，单位毫秒。
     * @return firstAlarmTime
     */
    public Long getFirstAlarmTime() {
        return firstAlarmTime;
    }

    public void setFirstAlarmTime(Long firstAlarmTime) {
        this.firstAlarmTime = firstAlarmTime;
    }

    public BaselineInstance withLastAlarmTime(Long lastAlarmTime) {
        this.lastAlarmTime = lastAlarmTime;
        return this;
    }

    /**
     * 最后告警时间戳，单位毫秒。
     * @return lastAlarmTime
     */
    public Long getLastAlarmTime() {
        return lastAlarmTime;
    }

    public void setLastAlarmTime(Long lastAlarmTime) {
        this.lastAlarmTime = lastAlarmTime;
    }

    public BaselineInstance withSlaTime(Long slaTime) {
        this.slaTime = slaTime;
        return this;
    }

    /**
     * 实例承诺时间戳，单位毫秒。
     * @return slaTime
     */
    public Long getSlaTime() {
        return slaTime;
    }

    public void setSlaTime(Long slaTime) {
        this.slaTime = slaTime;
    }

    public BaselineInstance withProcessTime(Long processTime) {
        this.processTime = processTime;
        return this;
    }

    /**
     * 处理时间戳，单位毫秒。
     * @return processTime
     */
    public Long getProcessTime() {
        return processTime;
    }

    public void setProcessTime(Long processTime) {
        this.processTime = processTime;
    }

    public BaselineInstance withRecoverTime(Long recoverTime) {
        this.recoverTime = recoverTime;
        return this;
    }

    /**
     * 恢复时间戳，单位毫秒。
     * @return recoverTime
     */
    public Long getRecoverTime() {
        return recoverTime;
    }

    public void setRecoverTime(Long recoverTime) {
        this.recoverTime = recoverTime;
    }

    public BaselineInstance withIgnoreTime(Long ignoreTime) {
        this.ignoreTime = ignoreTime;
        return this;
    }

    /**
     * 忽略时间戳，单位毫秒。
     * @return ignoreTime
     */
    public Long getIgnoreTime() {
        return ignoreTime;
    }

    public void setIgnoreTime(Long ignoreTime) {
        this.ignoreTime = ignoreTime;
    }

    public BaselineInstance withProcessBuffer(Long processBuffer) {
        this.processBuffer = processBuffer;
        return this;
    }

    /**
     * 处理时长，设置处理时间所需要的时间，设置后在该时间段内将暂停事件报警，事件的处理操作记录会被记录。
     * @return processBuffer
     */
    public Long getProcessBuffer() {
        return processBuffer;
    }

    public void setProcessBuffer(Long processBuffer) {
        this.processBuffer = processBuffer;
    }

    public BaselineInstance withCreateDay(Integer createDay) {
        this.createDay = createDay;
        return this;
    }

    /**
     * 创建时间的天数，表示一年的第几天。
     * @return createDay
     */
    public Integer getCreateDay() {
        return createDay;
    }

    public void setCreateDay(Integer createDay) {
        this.createDay = createDay;
    }

    public BaselineInstance withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * 实例类型。
     * @return instanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public BaselineInstance withProcessUserId(String processUserId) {
        this.processUserId = processUserId;
        return this;
    }

    /**
     * 基线处理人用户ID。
     * @return processUserId
     */
    public String getProcessUserId() {
        return processUserId;
    }

    public void setProcessUserId(String processUserId) {
        this.processUserId = processUserId;
    }

    public BaselineInstance withProcessUserName(String processUserName) {
        this.processUserName = processUserName;
        return this;
    }

    /**
     * 基线处理人用户名称。
     * @return processUserName
     */
    public String getProcessUserName() {
        return processUserName;
    }

    public void setProcessUserName(String processUserName) {
        this.processUserName = processUserName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaselineInstance that = (BaselineInstance) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.baseline, that.baseline)
            && Objects.equals(this.baselineId, that.baselineId) && Objects.equals(this.baselineName, that.baselineName)
            && Objects.equals(this.baselineVersion, that.baselineVersion)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.dag, that.dag)
            && Objects.equals(this.status, that.status) && Objects.equals(this.buffer, that.buffer)
            && Objects.equals(this.estimateCompleteTime, that.estimateCompleteTime)
            && Objects.equals(this.expectTime, that.expectTime) && Objects.equals(this.finishStatus, that.finishStatus)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.executeTime, that.executeTime) && Objects.equals(this.errorCode, that.errorCode)
            && Objects.equals(this.errorMessage, that.errorMessage)
            && Objects.equals(this.taskInstances, that.taskInstances) && Objects.equals(this.ownerId, that.ownerId)
            && Objects.equals(this.ownerName, that.ownerName) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.domainName, that.domainName) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.firstAlarmTime, that.firstAlarmTime)
            && Objects.equals(this.lastAlarmTime, that.lastAlarmTime) && Objects.equals(this.slaTime, that.slaTime)
            && Objects.equals(this.processTime, that.processTime) && Objects.equals(this.recoverTime, that.recoverTime)
            && Objects.equals(this.ignoreTime, that.ignoreTime)
            && Objects.equals(this.processBuffer, that.processBuffer) && Objects.equals(this.createDay, that.createDay)
            && Objects.equals(this.instanceType, that.instanceType)
            && Objects.equals(this.processUserId, that.processUserId)
            && Objects.equals(this.processUserName, that.processUserName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            baseline,
            baselineId,
            baselineName,
            baselineVersion,
            priority,
            dag,
            status,
            buffer,
            estimateCompleteTime,
            expectTime,
            finishStatus,
            startTime,
            endTime,
            executeTime,
            errorCode,
            errorMessage,
            taskInstances,
            ownerId,
            ownerName,
            domainId,
            domainName,
            projectId,
            instanceId,
            workspaceId,
            firstAlarmTime,
            lastAlarmTime,
            slaTime,
            processTime,
            recoverTime,
            ignoreTime,
            processBuffer,
            createDay,
            instanceType,
            processUserId,
            processUserName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BaselineInstance {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    baseline: ").append(toIndentedString(baseline)).append("\n");
        sb.append("    baselineId: ").append(toIndentedString(baselineId)).append("\n");
        sb.append("    baselineName: ").append(toIndentedString(baselineName)).append("\n");
        sb.append("    baselineVersion: ").append(toIndentedString(baselineVersion)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    dag: ").append(toIndentedString(dag)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    buffer: ").append(toIndentedString(buffer)).append("\n");
        sb.append("    estimateCompleteTime: ").append(toIndentedString(estimateCompleteTime)).append("\n");
        sb.append("    expectTime: ").append(toIndentedString(expectTime)).append("\n");
        sb.append("    finishStatus: ").append(toIndentedString(finishStatus)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    executeTime: ").append(toIndentedString(executeTime)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    taskInstances: ").append(toIndentedString(taskInstances)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    firstAlarmTime: ").append(toIndentedString(firstAlarmTime)).append("\n");
        sb.append("    lastAlarmTime: ").append(toIndentedString(lastAlarmTime)).append("\n");
        sb.append("    slaTime: ").append(toIndentedString(slaTime)).append("\n");
        sb.append("    processTime: ").append(toIndentedString(processTime)).append("\n");
        sb.append("    recoverTime: ").append(toIndentedString(recoverTime)).append("\n");
        sb.append("    ignoreTime: ").append(toIndentedString(ignoreTime)).append("\n");
        sb.append("    processBuffer: ").append(toIndentedString(processBuffer)).append("\n");
        sb.append("    createDay: ").append(toIndentedString(createDay)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    processUserId: ").append(toIndentedString(processUserId)).append("\n");
        sb.append("    processUserName: ").append(toIndentedString(processUserName)).append("\n");
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
