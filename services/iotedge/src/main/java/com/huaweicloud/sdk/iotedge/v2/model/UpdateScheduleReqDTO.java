package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新调度计划请求结构体
 */
public class UpdateScheduleReqDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "daily")

    private DailyDto daily;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<ScheduleTask> tasks = null;

    public UpdateScheduleReqDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 调度计划名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateScheduleReqDTO withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 调度计划是否生效
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public UpdateScheduleReqDTO withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 调度计划起始时间，毫秒级别的时间戳
     * minimum: 0
     * maximum: 4828176000000
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public UpdateScheduleReqDTO withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 调度计划结束时间，毫秒级别的时间戳
     * minimum: 0
     * maximum: 4828176000000
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public UpdateScheduleReqDTO withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 调度计划优先级。
     * minimum: 1
     * maximum: 16
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public UpdateScheduleReqDTO withDaily(DailyDto daily) {
        this.daily = daily;
        return this;
    }

    public UpdateScheduleReqDTO withDaily(Consumer<DailyDto> dailySetter) {
        if (this.daily == null) {
            this.daily = new DailyDto();
            dailySetter.accept(this.daily);
        }

        return this;
    }

    /**
     * Get daily
     * @return daily
     */
    public DailyDto getDaily() {
        return daily;
    }

    public void setDaily(DailyDto daily) {
        this.daily = daily;
    }

    public UpdateScheduleReqDTO withTasks(List<ScheduleTask> tasks) {
        this.tasks = tasks;
        return this;
    }

    public UpdateScheduleReqDTO addTasksItem(ScheduleTask tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public UpdateScheduleReqDTO withTasks(Consumer<List<ScheduleTask>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * 调度任务信息
     * @return tasks
     */
    public List<ScheduleTask> getTasks() {
        return tasks;
    }

    public void setTasks(List<ScheduleTask> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateScheduleReqDTO that = (UpdateScheduleReqDTO) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.daily, that.daily)
            && Objects.equals(this.tasks, that.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, enabled, startTime, endTime, priority, daily, tasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateScheduleReqDTO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    daily: ").append(toIndentedString(daily)).append("\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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
