package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateLimitTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_scope")

    private String taskScope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_type")

    private String limitType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_type_value")

    private String limitTypeValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private String databases;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_model")

    private String sqlModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_words")

    private String keyWords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel_size")

    private Integer parallelSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_utilization")

    private Integer cpuUtilization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_utilization")

    private Integer memoryUtilization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier")

    private String modifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_infos")

    private List<CreateLimitTaskNodeResult> nodeInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    public CreateLimitTaskResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 限流任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public CreateLimitTaskResponse withTaskScope(String taskScope) {
        this.taskScope = taskScope;
        return this;
    }

    /**
     * 任务限流范围，与请求参数相同。
     * @return taskScope
     */
    public String getTaskScope() {
        return taskScope;
    }

    public void setTaskScope(String taskScope) {
        this.taskScope = taskScope;
    }

    public CreateLimitTaskResponse withLimitType(String limitType) {
        this.limitType = limitType;
        return this;
    }

    /**
     * 任务限流类型，与请求参数相同。
     * @return limitType
     */
    public String getLimitType() {
        return limitType;
    }

    public void setLimitType(String limitType) {
        this.limitType = limitType;
    }

    public CreateLimitTaskResponse withLimitTypeValue(String limitTypeValue) {
        this.limitTypeValue = limitTypeValue;
        return this;
    }

    /**
     * 任务限流类型值，与请求参数相同。
     * @return limitTypeValue
     */
    public String getLimitTypeValue() {
        return limitTypeValue;
    }

    public void setLimitTypeValue(String limitTypeValue) {
        this.limitTypeValue = limitTypeValue;
    }

    public CreateLimitTaskResponse withDatabases(String databases) {
        this.databases = databases;
        return this;
    }

    /**
     * CN节点数据库组，每个数据库字符串以逗号形式隔开。
     * @return databases
     */
    public String getDatabases() {
        return databases;
    }

    public void setDatabases(String databases) {
        this.databases = databases;
    }

    public CreateLimitTaskResponse withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 限流任务名。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public CreateLimitTaskResponse withSqlModel(String sqlModel) {
        this.sqlModel = sqlModel;
        return this;
    }

    /**
     * SQL模板,仅当任务类型为SQL_ID时，返回该值且与请求参数相同。
     * @return sqlModel
     */
    public String getSqlModel() {
        return sqlModel;
    }

    public void setSqlModel(String sqlModel) {
        this.sqlModel = sqlModel;
    }

    public CreateLimitTaskResponse withKeyWords(String keyWords) {
        this.keyWords = keyWords;
        return this;
    }

    /**
     * 关键词，仅当任务类型为SQL_TYPE时，返回该值且与请求参数相同。
     * @return keyWords
     */
    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public CreateLimitTaskResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 限流任务状态，当前支持：CREATING，UPDATEING，DELETING，WAIT_EXCUTE，EXCUTING，TIME_OVER，DELETED，CREATE_FAILED，UPDATE_FAILED，DELETE_FAILED，EXCEPTION，NODE_SHUT_DOWN。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreateLimitTaskResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public CreateLimitTaskResponse withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 规则名。
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public CreateLimitTaskResponse withParallelSize(Integer parallelSize) {
        this.parallelSize = parallelSize;
        return this;
    }

    /**
     * 并发数，与请求参数相同。
     * @return parallelSize
     */
    public Integer getParallelSize() {
        return parallelSize;
    }

    public void setParallelSize(Integer parallelSize) {
        this.parallelSize = parallelSize;
    }

    public CreateLimitTaskResponse withCpuUtilization(Integer cpuUtilization) {
        this.cpuUtilization = cpuUtilization;
        return this;
    }

    /**
     * cpu利用率阈值，仅当任务类型为SESSION_ACTIVE_MAX_COUNT时，返回该值且只保留正整数。
     * @return cpuUtilization
     */
    public Integer getCpuUtilization() {
        return cpuUtilization;
    }

    public void setCpuUtilization(Integer cpuUtilization) {
        this.cpuUtilization = cpuUtilization;
    }

    public CreateLimitTaskResponse withMemoryUtilization(Integer memoryUtilization) {
        this.memoryUtilization = memoryUtilization;
        return this;
    }

    /**
     * 内存利用率阈值，仅当任务类型为SESSION_ACTIVE_MAX_COUNT时，返回该值且只保留正整数。
     * @return memoryUtilization
     */
    public Integer getMemoryUtilization() {
        return memoryUtilization;
    }

    public void setMemoryUtilization(Integer memoryUtilization) {
        this.memoryUtilization = memoryUtilization;
    }

    public CreateLimitTaskResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 限流任务开始时间，与请求参数相同，格式为yyyy-mm-ddThh:mm:ssZ，当前时间指UTC时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public CreateLimitTaskResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 限流任务结束时间，与请求参数相同，格式为yyyy-mm-ddThh:mm:ssZ，当前时间指UTC时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public CreateLimitTaskResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 创建时间为本地时间，格式为yyyy-mm-ddThh:mm:ssZ。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public CreateLimitTaskResponse withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 更新时间为本地时间，格式为yyyy-mm-ddThh:mm:ssZ。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public CreateLimitTaskResponse withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建者。
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public CreateLimitTaskResponse withModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    /**
     * 更新者。
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public CreateLimitTaskResponse withNodeInfos(List<CreateLimitTaskNodeResult> nodeInfos) {
        this.nodeInfos = nodeInfos;
        return this;
    }

    public CreateLimitTaskResponse addNodeInfosItem(CreateLimitTaskNodeResult nodeInfosItem) {
        if (this.nodeInfos == null) {
            this.nodeInfos = new ArrayList<>();
        }
        this.nodeInfos.add(nodeInfosItem);
        return this;
    }

    public CreateLimitTaskResponse withNodeInfos(Consumer<List<CreateLimitTaskNodeResult>> nodeInfosSetter) {
        if (this.nodeInfos == null) {
            this.nodeInfos = new ArrayList<>();
        }
        nodeInfosSetter.accept(this.nodeInfos);
        return this;
    }

    /**
     * CN节点信息列表，如果类型为SQLID，必返。
     * @return nodeInfos
     */
    public List<CreateLimitTaskNodeResult> getNodeInfos() {
        return nodeInfos;
    }

    public void setNodeInfos(List<CreateLimitTaskNodeResult> nodeInfos) {
        this.nodeInfos = nodeInfos;
    }

    public CreateLimitTaskResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 工作流ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateLimitTaskResponse that = (CreateLimitTaskResponse) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskScope, that.taskScope)
            && Objects.equals(this.limitType, that.limitType)
            && Objects.equals(this.limitTypeValue, that.limitTypeValue)
            && Objects.equals(this.databases, that.databases) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.sqlModel, that.sqlModel) && Objects.equals(this.keyWords, that.keyWords)
            && Objects.equals(this.status, that.status) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.ruleName, that.ruleName) && Objects.equals(this.parallelSize, that.parallelSize)
            && Objects.equals(this.cpuUtilization, that.cpuUtilization)
            && Objects.equals(this.memoryUtilization, that.memoryUtilization)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.created, that.created) && Objects.equals(this.updated, that.updated)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.modifier, that.modifier)
            && Objects.equals(this.nodeInfos, that.nodeInfos) && Objects.equals(this.jobId, that.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            taskScope,
            limitType,
            limitTypeValue,
            databases,
            taskName,
            sqlModel,
            keyWords,
            status,
            instanceId,
            ruleName,
            parallelSize,
            cpuUtilization,
            memoryUtilization,
            startTime,
            endTime,
            created,
            updated,
            creator,
            modifier,
            nodeInfos,
            jobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLimitTaskResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskScope: ").append(toIndentedString(taskScope)).append("\n");
        sb.append("    limitType: ").append(toIndentedString(limitType)).append("\n");
        sb.append("    limitTypeValue: ").append(toIndentedString(limitTypeValue)).append("\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    sqlModel: ").append(toIndentedString(sqlModel)).append("\n");
        sb.append("    keyWords: ").append(toIndentedString(keyWords)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    parallelSize: ").append(toIndentedString(parallelSize)).append("\n");
        sb.append("    cpuUtilization: ").append(toIndentedString(cpuUtilization)).append("\n");
        sb.append("    memoryUtilization: ").append(toIndentedString(memoryUtilization)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
        sb.append("    nodeInfos: ").append(toIndentedString(nodeInfos)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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
