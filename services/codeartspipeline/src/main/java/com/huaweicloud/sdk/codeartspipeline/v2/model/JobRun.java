package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 任务运行信息
 */
public class JobRun {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private Integer sequence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "async")

    private String async;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identifier")

    private String identifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "depends_on")

    private List<String> dependsOn = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private String condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private String resource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_select")

    private Boolean isSelect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private String timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_dispatch_id")

    private String lastDispatchId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "steps")

    private List<StepRun> steps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec_id")

    private String execId;

    public JobRun withId(String id) {
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

    public JobRun withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 任务类型
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public JobRun withSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

    /**
     * 序列号
     * @return sequence
     */
    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public JobRun withAsync(String async) {
        this.async = async;
        return this;
    }

    /**
     * 是否异步
     * @return async
     */
    public String getAsync() {
        return async;
    }

    public void setAsync(String async) {
        this.async = async;
    }

    public JobRun withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 任务名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobRun withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * 任务唯一标识
     * @return identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public JobRun withDependsOn(List<String> dependsOn) {
        this.dependsOn = dependsOn;
        return this;
    }

    public JobRun addDependsOnItem(String dependsOnItem) {
        if (this.dependsOn == null) {
            this.dependsOn = new ArrayList<>();
        }
        this.dependsOn.add(dependsOnItem);
        return this;
    }

    public JobRun withDependsOn(Consumer<List<String>> dependsOnSetter) {
        if (this.dependsOn == null) {
            this.dependsOn = new ArrayList<>();
        }
        dependsOnSetter.accept(this.dependsOn);
        return this;
    }

    /**
     * 依赖
     * @return dependsOn
     */
    public List<String> getDependsOn() {
        return dependsOn;
    }

    public void setDependsOn(List<String> dependsOn) {
        this.dependsOn = dependsOn;
    }

    public JobRun withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * 运行条件
     * @return condition
     */
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public JobRun withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * 执行资源
     * @return resource
     */
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public JobRun withIsSelect(Boolean isSelect) {
        this.isSelect = isSelect;
        return this;
    }

    /**
     * 是否选中
     * @return isSelect
     */
    public Boolean getIsSelect() {
        return isSelect;
    }

    public void setIsSelect(Boolean isSelect) {
        this.isSelect = isSelect;
    }

    public JobRun withTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 任务超时设置
     * @return timeout
     */
    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public JobRun withLastDispatchId(String lastDispatchId) {
        this.lastDispatchId = lastDispatchId;
        return this;
    }

    /**
     * 任务上次下发ID
     * @return lastDispatchId
     */
    public String getLastDispatchId() {
        return lastDispatchId;
    }

    public void setLastDispatchId(String lastDispatchId) {
        this.lastDispatchId = lastDispatchId;
    }

    public JobRun withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public JobRun withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 错误信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public JobRun withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public JobRun withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public JobRun withSteps(List<StepRun> steps) {
        this.steps = steps;
        return this;
    }

    public JobRun addStepsItem(StepRun stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    public JobRun withSteps(Consumer<List<StepRun>> stepsSetter) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        stepsSetter.accept(this.steps);
        return this;
    }

    /**
     * 步骤
     * @return steps
     */
    public List<StepRun> getSteps() {
        return steps;
    }

    public void setSteps(List<StepRun> steps) {
        this.steps = steps;
    }

    public JobRun withExecId(String execId) {
        this.execId = execId;
        return this;
    }

    /**
     * 任务执行ID
     * @return execId
     */
    public String getExecId() {
        return execId;
    }

    public void setExecId(String execId) {
        this.execId = execId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobRun that = (JobRun) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.category, that.category)
            && Objects.equals(this.sequence, that.sequence) && Objects.equals(this.async, that.async)
            && Objects.equals(this.name, that.name) && Objects.equals(this.identifier, that.identifier)
            && Objects.equals(this.dependsOn, that.dependsOn) && Objects.equals(this.condition, that.condition)
            && Objects.equals(this.resource, that.resource) && Objects.equals(this.isSelect, that.isSelect)
            && Objects.equals(this.timeout, that.timeout) && Objects.equals(this.lastDispatchId, that.lastDispatchId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.message, that.message)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.steps, that.steps) && Objects.equals(this.execId, that.execId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            category,
            sequence,
            async,
            name,
            identifier,
            dependsOn,
            condition,
            resource,
            isSelect,
            timeout,
            lastDispatchId,
            status,
            message,
            startTime,
            endTime,
            steps,
            execId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobRun {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
        sb.append("    async: ").append(toIndentedString(async)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    dependsOn: ").append(toIndentedString(dependsOn)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    isSelect: ").append(toIndentedString(isSelect)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    lastDispatchId: ").append(toIndentedString(lastDispatchId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        sb.append("    execId: ").append(toIndentedString(execId)).append("\n");
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
