package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListLimitTaskResponseResult
 */
public class ListLimitTaskResponseResult {

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
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private String databases;

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
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_utilization")

    private Integer cpuUtilization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_utilization")

    private Integer memoryUtilization;

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

    private List<ShowLimitTaskNodeOption> nodeInfos = null;

    public ListLimitTaskResponseResult withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释**: 限流任务ID。 **取值范围**: 不涉及。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ListLimitTaskResponseResult withTaskScope(String taskScope) {
        this.taskScope = taskScope;
        return this;
    }

    /**
     * **参数解释**: 任务限流范围。 **取值范围**: 目前支持SQL，SESSION两种级别范围。
     * @return taskScope
     */
    public String getTaskScope() {
        return taskScope;
    }

    public void setTaskScope(String taskScope) {
        this.taskScope = taskScope;
    }

    public ListLimitTaskResponseResult withLimitType(String limitType) {
        this.limitType = limitType;
        return this;
    }

    /**
     * **参数解释**: 任务限流类型。 **取值范围**: - 当“task_scope”为SQL时，可选SQL_ID、SQL_TYPE类型。 - 当“task_scope”为SESSION时，可选SESSION_ACTIVE_MAX_COUNT类型。
     * @return limitType
     */
    public String getLimitType() {
        return limitType;
    }

    public void setLimitType(String limitType) {
        this.limitType = limitType;
    }

    public ListLimitTaskResponseResult withLimitTypeValue(String limitTypeValue) {
        this.limitTypeValue = limitTypeValue;
        return this;
    }

    /**
     * **参数解释**: 任务限流类型值。 **取值范围**: - 当“limit_type”为SQL_ID类型时，该值为选中模板的sql_id。 - 当“limit_type”为SQL_TYPE类型时，值为SQL类型，为select，update，insert，delete，merge的一种。 - 当“limit_type”为SESSION_ACTIVE_MAX_COUNT类型时，该值为CPU_OR_MEMORY。
     * @return limitTypeValue
     */
    public String getLimitTypeValue() {
        return limitTypeValue;
    }

    public void setLimitTypeValue(String limitTypeValue) {
        this.limitTypeValue = limitTypeValue;
    }

    public ListLimitTaskResponseResult withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * **参数解释**: 限流任务名。 **取值范围**: 不涉及。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ListLimitTaskResponseResult withDatabases(String databases) {
        this.databases = databases;
        return this;
    }

    /**
     * **参数解释**: 实例的数据库列表，每个数据库以英文逗号形式隔开。 **取值范围**: 不涉及。
     * @return databases
     */
    public String getDatabases() {
        return databases;
    }

    public void setDatabases(String databases) {
        this.databases = databases;
    }

    public ListLimitTaskResponseResult withSqlModel(String sqlModel) {
        this.sqlModel = sqlModel;
        return this;
    }

    /**
     * **参数解释**: SQL模板，仅当任务类型为SQL_ID时，返回该值。 **取值范围**: 不涉及。
     * @return sqlModel
     */
    public String getSqlModel() {
        return sqlModel;
    }

    public void setSqlModel(String sqlModel) {
        this.sqlModel = sqlModel;
    }

    public ListLimitTaskResponseResult withKeyWords(String keyWords) {
        this.keyWords = keyWords;
        return this;
    }

    /**
     * **参数解释**: 关键词，仅当任务类型为SQL_TYPE时，返回该值。 **取值范围**: 不涉及。
     * @return keyWords
     */
    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public ListLimitTaskResponseResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 限流任务状态。 **取值范围**: 当前支持：CREATING，UPDATING，DELETING，WAIT_EXECUTE，EXCUTING，TIME_OVER，DELETED，CREATE_FAILED，UPDATE_FAILED，DELETE_FAILED，EXCEPTION，NODE_SHUT_DOWN。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListLimitTaskResponseResult withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**: 实例ID。 **取值范围**: 不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListLimitTaskResponseResult withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * **参数解释**: 规则名。 **取值范围**: 不涉及。
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public ListLimitTaskResponseResult withParallelSize(Integer parallelSize) {
        this.parallelSize = parallelSize;
        return this;
    }

    /**
     * **参数解释**: 并发数。 **取值范围**: [0, 2147483647]
     * @return parallelSize
     */
    public Integer getParallelSize() {
        return parallelSize;
    }

    public void setParallelSize(Integer parallelSize) {
        this.parallelSize = parallelSize;
    }

    public ListLimitTaskResponseResult withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**: 限流任务开始时间。 **取值范围**: 不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListLimitTaskResponseResult withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**: 限流任务结束时间。 **取值范围**: 不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListLimitTaskResponseResult withCpuUtilization(Integer cpuUtilization) {
        this.cpuUtilization = cpuUtilization;
        return this;
    }

    /**
     * **参数解释**: CPU利用率阈值，仅当任务类型为SESSION_ACTIVE_MAX_COUNT时，返回该值且只保留整数部分。 **取值范围**: [0, 100)
     * @return cpuUtilization
     */
    public Integer getCpuUtilization() {
        return cpuUtilization;
    }

    public void setCpuUtilization(Integer cpuUtilization) {
        this.cpuUtilization = cpuUtilization;
    }

    public ListLimitTaskResponseResult withMemoryUtilization(Integer memoryUtilization) {
        this.memoryUtilization = memoryUtilization;
        return this;
    }

    /**
     * **参数解释**: 内存利用率阈值，仅当任务类型为SESSION_ACTIVE_MAX_COUNT时，返回该值且只保留整数部分。 **取值范围**: [0, 100)
     * @return memoryUtilization
     */
    public Integer getMemoryUtilization() {
        return memoryUtilization;
    }

    public void setMemoryUtilization(Integer memoryUtilization) {
        this.memoryUtilization = memoryUtilization;
    }

    public ListLimitTaskResponseResult withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * **参数解释**: 限流任务创建时间。 **取值范围**: 不涉及。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ListLimitTaskResponseResult withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * **参数解释**: 限流任务更新时间。 **取值范围**: 不涉及。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public ListLimitTaskResponseResult withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * **参数解释**: 创建者。 **取值范围**: 不涉及。
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ListLimitTaskResponseResult withModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    /**
     * **参数解释**: 更新者。 **取值范围**: 不涉及。
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public ListLimitTaskResponseResult withNodeInfos(List<ShowLimitTaskNodeOption> nodeInfos) {
        this.nodeInfos = nodeInfos;
        return this;
    }

    public ListLimitTaskResponseResult addNodeInfosItem(ShowLimitTaskNodeOption nodeInfosItem) {
        if (this.nodeInfos == null) {
            this.nodeInfos = new ArrayList<>();
        }
        this.nodeInfos.add(nodeInfosItem);
        return this;
    }

    public ListLimitTaskResponseResult withNodeInfos(Consumer<List<ShowLimitTaskNodeOption>> nodeInfosSetter) {
        if (this.nodeInfos == null) {
            this.nodeInfos = new ArrayList<>();
        }
        nodeInfosSetter.accept(this.nodeInfos);
        return this;
    }

    /**
     * **参数解释**: CN节点信息列表。
     * @return nodeInfos
     */
    public List<ShowLimitTaskNodeOption> getNodeInfos() {
        return nodeInfos;
    }

    public void setNodeInfos(List<ShowLimitTaskNodeOption> nodeInfos) {
        this.nodeInfos = nodeInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListLimitTaskResponseResult that = (ListLimitTaskResponseResult) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskScope, that.taskScope)
            && Objects.equals(this.limitType, that.limitType)
            && Objects.equals(this.limitTypeValue, that.limitTypeValue) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.databases, that.databases) && Objects.equals(this.sqlModel, that.sqlModel)
            && Objects.equals(this.keyWords, that.keyWords) && Objects.equals(this.status, that.status)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.ruleName, that.ruleName)
            && Objects.equals(this.parallelSize, that.parallelSize) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.cpuUtilization, that.cpuUtilization)
            && Objects.equals(this.memoryUtilization, that.memoryUtilization)
            && Objects.equals(this.created, that.created) && Objects.equals(this.updated, that.updated)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.modifier, that.modifier)
            && Objects.equals(this.nodeInfos, that.nodeInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            taskScope,
            limitType,
            limitTypeValue,
            taskName,
            databases,
            sqlModel,
            keyWords,
            status,
            instanceId,
            ruleName,
            parallelSize,
            startTime,
            endTime,
            cpuUtilization,
            memoryUtilization,
            created,
            updated,
            creator,
            modifier,
            nodeInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLimitTaskResponseResult {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskScope: ").append(toIndentedString(taskScope)).append("\n");
        sb.append("    limitType: ").append(toIndentedString(limitType)).append("\n");
        sb.append("    limitTypeValue: ").append(toIndentedString(limitTypeValue)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
        sb.append("    sqlModel: ").append(toIndentedString(sqlModel)).append("\n");
        sb.append("    keyWords: ").append(toIndentedString(keyWords)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    parallelSize: ").append(toIndentedString(parallelSize)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    cpuUtilization: ").append(toIndentedString(cpuUtilization)).append("\n");
        sb.append("    memoryUtilization: ").append(toIndentedString(memoryUtilization)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
        sb.append("    nodeInfos: ").append(toIndentedString(nodeInfos)).append("\n");
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
