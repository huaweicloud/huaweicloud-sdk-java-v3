package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** ShowTaskSetResqTasks */
public class ShowTaskSetResqTasks {

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

    private ShowTaskSetResqTaskRunInfo taskRunInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public ShowTaskSetResqTasks withBenchConcurrent(Integer benchConcurrent) {
        this.benchConcurrent = benchConcurrent;
        return this;
    }

    /** bench_concurrent minimum: 0 maximum: 2147483647
     * 
     * @return benchConcurrent */
    public Integer getBenchConcurrent() {
        return benchConcurrent;
    }

    public void setBenchConcurrent(Integer benchConcurrent) {
        this.benchConcurrent = benchConcurrent;
    }

    public ShowTaskSetResqTasks withDescription(String description) {
        this.description = description;
        return this;
    }

    /** description
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowTaskSetResqTasks withId(Integer id) {
        this.id = id;
        return this;
    }

    /** id minimum: 0 maximum: 2147483647
     * 
     * @return id */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ShowTaskSetResqTasks withName(String name) {
        this.name = name;
        return this;
    }

    /** name
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowTaskSetResqTasks withOperateMode(Integer operateMode) {
        this.operateMode = operateMode;
        return this;
    }

    /** operate_mode minimum: 0 maximum: 2147483647
     * 
     * @return operateMode */
    public Integer getOperateMode() {
        return operateMode;
    }

    public void setOperateMode(Integer operateMode) {
        this.operateMode = operateMode;
    }

    public ShowTaskSetResqTasks withTaskRunInfo(ShowTaskSetResqTaskRunInfo taskRunInfo) {
        this.taskRunInfo = taskRunInfo;
        return this;
    }

    public ShowTaskSetResqTasks withTaskRunInfo(Consumer<ShowTaskSetResqTaskRunInfo> taskRunInfoSetter) {
        if (this.taskRunInfo == null) {
            this.taskRunInfo = new ShowTaskSetResqTaskRunInfo();
            taskRunInfoSetter.accept(this.taskRunInfo);
        }

        return this;
    }

    /** Get taskRunInfo
     * 
     * @return taskRunInfo */
    public ShowTaskSetResqTaskRunInfo getTaskRunInfo() {
        return taskRunInfo;
    }

    public void setTaskRunInfo(ShowTaskSetResqTaskRunInfo taskRunInfo) {
        this.taskRunInfo = taskRunInfo;
    }

    public ShowTaskSetResqTasks withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /** update_time
     * 
     * @return updateTime */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTaskSetResqTasks showTaskSetResqTasks = (ShowTaskSetResqTasks) o;
        return Objects.equals(this.benchConcurrent, showTaskSetResqTasks.benchConcurrent)
            && Objects.equals(this.description, showTaskSetResqTasks.description)
            && Objects.equals(this.id, showTaskSetResqTasks.id) && Objects.equals(this.name, showTaskSetResqTasks.name)
            && Objects.equals(this.operateMode, showTaskSetResqTasks.operateMode)
            && Objects.equals(this.taskRunInfo, showTaskSetResqTasks.taskRunInfo)
            && Objects.equals(this.updateTime, showTaskSetResqTasks.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(benchConcurrent, description, id, name, operateMode, taskRunInfo, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskSetResqTasks {\n");
        sb.append("    benchConcurrent: ").append(toIndentedString(benchConcurrent)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    operateMode: ").append(toIndentedString(operateMode)).append("\n");
        sb.append("    taskRunInfo: ").append(toIndentedString(taskRunInfo)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
