package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * tasks
 */
public class Task {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bench_concurrent")

    private Integer benchConcurrent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_mode")

    private Integer operateMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_run_info")

    private TaskRunInfo taskRunInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel")

    private Boolean parallel;

    public Task withBenchConcurrent(Integer benchConcurrent) {
        this.benchConcurrent = benchConcurrent;
        return this;
    }

    /**
     * 基准并发
     * minimum: 0
     * maximum: 2147483647
     * @return benchConcurrent
     */
    public Integer getBenchConcurrent() {
        return benchConcurrent;
    }

    public void setBenchConcurrent(Integer benchConcurrent) {
        this.benchConcurrent = benchConcurrent;
    }

    public Task withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Task withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 任务Id
     * minimum: 0
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Task withName(String name) {
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

    public Task withOperateMode(Integer operateMode) {
        this.operateMode = operateMode;
        return this;
    }

    /**
     * 任务压测模式
     * minimum: 0
     * maximum: 2147483647
     * @return operateMode
     */
    public Integer getOperateMode() {
        return operateMode;
    }

    public void setOperateMode(Integer operateMode) {
        this.operateMode = operateMode;
    }

    public Task withTaskRunInfo(TaskRunInfo taskRunInfo) {
        this.taskRunInfo = taskRunInfo;
        return this;
    }

    public Task withTaskRunInfo(Consumer<TaskRunInfo> taskRunInfoSetter) {
        if (this.taskRunInfo == null) {
            this.taskRunInfo = new TaskRunInfo();
            taskRunInfoSetter.accept(this.taskRunInfo);
        }

        return this;
    }

    /**
     * Get taskRunInfo
     * @return taskRunInfo
     */
    public TaskRunInfo getTaskRunInfo() {
        return taskRunInfo;
    }

    public void setTaskRunInfo(TaskRunInfo taskRunInfo) {
        this.taskRunInfo = taskRunInfo;
    }

    public Task withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Task withParallel(Boolean parallel) {
        this.parallel = parallel;
        return this;
    }

    /**
     * 任务间用例是否并行执行
     * @return parallel
     */
    public Boolean getParallel() {
        return parallel;
    }

    public void setParallel(Boolean parallel) {
        this.parallel = parallel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Task that = (Task) obj;
        return Objects.equals(this.benchConcurrent, that.benchConcurrent)
            && Objects.equals(this.description, that.description) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.operateMode, that.operateMode)
            && Objects.equals(this.taskRunInfo, that.taskRunInfo) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.parallel, that.parallel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(benchConcurrent, description, id, name, operateMode, taskRunInfo, updateTime, parallel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Task {\n");
        sb.append("    benchConcurrent: ").append(toIndentedString(benchConcurrent)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    operateMode: ").append(toIndentedString(operateMode)).append("\n");
        sb.append("    taskRunInfo: ").append(toIndentedString(taskRunInfo)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    parallel: ").append(toIndentedString(parallel)).append("\n");
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
