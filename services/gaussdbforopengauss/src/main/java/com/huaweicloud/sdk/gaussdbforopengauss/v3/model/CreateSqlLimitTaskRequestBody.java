package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateSqlLimitTaskRequestBody
 */
public class CreateSqlLimitTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_scope")

    private String taskScope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_type")

    private String limitType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_type_value")

    private String limitTypeValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_words")

    private String keyWords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

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
    @JsonProperty(value = "databases")

    private String databases;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_infos")

    private List<CreateLimitTaskNodeOption> nodeInfos = null;

    public CreateSqlLimitTaskRequestBody withTaskScope(String taskScope) {
        this.taskScope = taskScope;
        return this;
    }

    /**
     * **参数解释**: 限流任务范围，目前支持SQL、SESSION级别范围。 **约束限制**: 不涉及。 **取值范围**: - SQL - SESSION  **默认取值**: 不涉及。
     * @return taskScope
     */
    public String getTaskScope() {
        return taskScope;
    }

    public void setTaskScope(String taskScope) {
        this.taskScope = taskScope;
    }

    public CreateSqlLimitTaskRequestBody withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**: 任务开始时间，如果该值小于当前时间，会取当前时间的前两分钟。 **约束限制**: 当“task_scope”为SQL时必传。 **取值范围**: 格式必须为yyyy-mm-ddThh:mm:ssZ，当前时间指UTC时间。 **默认取值**: 不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public CreateSqlLimitTaskRequestBody withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**: 任务结束时间。 **约束限制**: 当“task_scope”为SQL时必传。 **取值范围**: 大于任务开始时间，格式必须为yyyy-mm-ddThh:mm:ssZ，当前时间指UTC时间。 **默认取值**: 不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public CreateSqlLimitTaskRequestBody withLimitType(String limitType) {
        this.limitType = limitType;
        return this;
    }

    /**
     * **参数解释**: 限流类型。 **约束限制**: 不涉及。 **取值范围**: - 当“task_scope”为SQL时，可选SQL_ID、SQL_TYPE类型。 - 当“task_scope”为SESSION时，可选SESSION_ACTIVE_MAX_COUNT类型。  **默认取值**: 不涉及。
     * @return limitType
     */
    public String getLimitType() {
        return limitType;
    }

    public void setLimitType(String limitType) {
        this.limitType = limitType;
    }

    public CreateSqlLimitTaskRequestBody withLimitTypeValue(String limitTypeValue) {
        this.limitTypeValue = limitTypeValue;
        return this;
    }

    /**
     * **参数解释**: 限流类型值。 **约束限制**: 不涉及。 **取值范围**: - 当“limit_type”为SQL_ID类型时，该值为选中模板的sql_id。 - 当“limit_type”为SQL_TYPE类型时，值为SQL类型，目前支持select，update，insert，delete，merge。 - 当“limit_type”为SESSION_ACTIVE_MAX_COUNT类型时，只支持CPU_OR_MEMORY一种值。  **默认取值**: 不涉及。
     * @return limitTypeValue
     */
    public String getLimitTypeValue() {
        return limitTypeValue;
    }

    public void setLimitTypeValue(String limitTypeValue) {
        this.limitTypeValue = limitTypeValue;
    }

    public CreateSqlLimitTaskRequestBody withKeyWords(String keyWords) {
        this.keyWords = keyWords;
        return this;
    }

    /**
     * **参数解释**: 关键词。 **约束限制**: 当且仅当“limit_type”为SQL_TYPE时，必传。 **取值范围**: 多个关键词以逗号隔开，数量范围为[2，100]个，每个关键词长度范围[2，64]位，关键词不允许包含 \" 或 \\ 或 {} 或 null值以及非首尾的空格符。 **默认取值**: 不涉及。
     * @return keyWords
     */
    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public CreateSqlLimitTaskRequestBody withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * **参数解释**: 限流任务名。 **约束限制**: 不涉及。 **取值范围**: 只能为英文字母大小写，下划线，数字和$符，最大长度为100个字符。 **默认取值**: 不涉及。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public CreateSqlLimitTaskRequestBody withParallelSize(Integer parallelSize) {
        this.parallelSize = parallelSize;
        return this;
    }

    /**
     * **参数解释**: 并发数。 **约束限制**: 不涉及。 **取值范围**: 大于等于零的整数，取值范围[0, 2147483647]。 **默认取值**: 不涉及。
     * @return parallelSize
     */
    public Integer getParallelSize() {
        return parallelSize;
    }

    public void setParallelSize(Integer parallelSize) {
        this.parallelSize = parallelSize;
    }

    public CreateSqlLimitTaskRequestBody withCpuUtilization(Integer cpuUtilization) {
        this.cpuUtilization = cpuUtilization;
        return this;
    }

    /**
     * **参数解释**: CPU利用率阈值。 **约束限制**: 如果“limit_type”为SESSION_ACTIVE_MAX_COUNT，必传。不支持和内存利用率阈值同时为0，如果选择只限制CPU、内存中的其中一个，则另一个必须传值0。 **取值范围**: 整数，取值范围[0,100）。 **默认取值**: 不涉及。
     * @return cpuUtilization
     */
    public Integer getCpuUtilization() {
        return cpuUtilization;
    }

    public void setCpuUtilization(Integer cpuUtilization) {
        this.cpuUtilization = cpuUtilization;
    }

    public CreateSqlLimitTaskRequestBody withMemoryUtilization(Integer memoryUtilization) {
        this.memoryUtilization = memoryUtilization;
        return this;
    }

    /**
     * **参数解释**: 内存利用率阈值。 **约束限制**: 如果“limit_type”为SESSION_ACTIVE_MAX_COUNT，必传。不支持和CPU利用率阈值同时为0，如果选择只限制CPU、内存中的其中一个，则另一个必须传值0。 **取值范围**: 整数，取值范围[0,100）。 **默认取值**: 不涉及。
     * @return memoryUtilization
     */
    public Integer getMemoryUtilization() {
        return memoryUtilization;
    }

    public void setMemoryUtilization(Integer memoryUtilization) {
        this.memoryUtilization = memoryUtilization;
    }

    public CreateSqlLimitTaskRequestBody withDatabases(String databases) {
        this.databases = databases;
        return this;
    }

    /**
     * **参数解释**: 数据库名称，限流只对指定的数据库生效，多个数据库名称用英文逗号分割。 **约束限制**: 当“limit_type”为SQL_TYPE类型时，databases参数必选。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return databases
     */
    public String getDatabases() {
        return databases;
    }

    public void setDatabases(String databases) {
        this.databases = databases;
    }

    public CreateSqlLimitTaskRequestBody withNodeInfos(List<CreateLimitTaskNodeOption> nodeInfos) {
        this.nodeInfos = nodeInfos;
        return this;
    }

    public CreateSqlLimitTaskRequestBody addNodeInfosItem(CreateLimitTaskNodeOption nodeInfosItem) {
        if (this.nodeInfos == null) {
            this.nodeInfos = new ArrayList<>();
        }
        this.nodeInfos.add(nodeInfosItem);
        return this;
    }

    public CreateSqlLimitTaskRequestBody withNodeInfos(Consumer<List<CreateLimitTaskNodeOption>> nodeInfosSetter) {
        if (this.nodeInfos == null) {
            this.nodeInfos = new ArrayList<>();
        }
        nodeInfosSetter.accept(this.nodeInfos);
        return this;
    }

    /**
     * **参数解释**: CN节点信息列表 **约束限制**: 如果“limit_type”为SQL_ID，则“node_infos”必选。
     * @return nodeInfos
     */
    public List<CreateLimitTaskNodeOption> getNodeInfos() {
        return nodeInfos;
    }

    public void setNodeInfos(List<CreateLimitTaskNodeOption> nodeInfos) {
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
        CreateSqlLimitTaskRequestBody that = (CreateSqlLimitTaskRequestBody) obj;
        return Objects.equals(this.taskScope, that.taskScope) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.limitType, that.limitType)
            && Objects.equals(this.limitTypeValue, that.limitTypeValue) && Objects.equals(this.keyWords, that.keyWords)
            && Objects.equals(this.taskName, that.taskName) && Objects.equals(this.parallelSize, that.parallelSize)
            && Objects.equals(this.cpuUtilization, that.cpuUtilization)
            && Objects.equals(this.memoryUtilization, that.memoryUtilization)
            && Objects.equals(this.databases, that.databases) && Objects.equals(this.nodeInfos, that.nodeInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskScope,
            startTime,
            endTime,
            limitType,
            limitTypeValue,
            keyWords,
            taskName,
            parallelSize,
            cpuUtilization,
            memoryUtilization,
            databases,
            nodeInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSqlLimitTaskRequestBody {\n");
        sb.append("    taskScope: ").append(toIndentedString(taskScope)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    limitType: ").append(toIndentedString(limitType)).append("\n");
        sb.append("    limitTypeValue: ").append(toIndentedString(limitTypeValue)).append("\n");
        sb.append("    keyWords: ").append(toIndentedString(keyWords)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    parallelSize: ").append(toIndentedString(parallelSize)).append("\n");
        sb.append("    cpuUtilization: ").append(toIndentedString(cpuUtilization)).append("\n");
        sb.append("    memoryUtilization: ").append(toIndentedString(memoryUtilization)).append("\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
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
