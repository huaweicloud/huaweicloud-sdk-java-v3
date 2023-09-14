package com.huaweicloud.sdk.iotedge.v2.model;

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
public class CreateScheduleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_id")

    private String scheduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cycle_type")

    private String cycleType;

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

    public CreateScheduleResponse withScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }

    /**
     * 调度计划id，租户下唯一
     * @return scheduleId
     */
    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public CreateScheduleResponse withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点id
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public CreateScheduleResponse withName(String name) {
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

    public CreateScheduleResponse withCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }

    /**
     * 调度计划的循环类型
     * @return cycleType
     */
    public String getCycleType() {
        return cycleType;
    }

    public void setCycleType(String cycleType) {
        this.cycleType = cycleType;
    }

    public CreateScheduleResponse withEnabled(Boolean enabled) {
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

    public CreateScheduleResponse withStartTime(Long startTime) {
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

    public CreateScheduleResponse withEndTime(Long endTime) {
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

    public CreateScheduleResponse withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 调度计划优先级, 1-16
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

    public CreateScheduleResponse withDaily(DailyDto daily) {
        this.daily = daily;
        return this;
    }

    public CreateScheduleResponse withDaily(Consumer<DailyDto> dailySetter) {
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

    public CreateScheduleResponse withTasks(List<ScheduleTask> tasks) {
        this.tasks = tasks;
        return this;
    }

    public CreateScheduleResponse addTasksItem(ScheduleTask tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public CreateScheduleResponse withTasks(Consumer<List<ScheduleTask>> tasksSetter) {
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
        CreateScheduleResponse that = (CreateScheduleResponse) obj;
        return Objects.equals(this.scheduleId, that.scheduleId) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.cycleType, that.cycleType)
            && Objects.equals(this.enabled, that.enabled) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.daily, that.daily) && Objects.equals(this.tasks, that.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduleId, nodeId, name, cycleType, enabled, startTime, endTime, priority, daily, tasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateScheduleResponse {\n");
        sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    cycleType: ").append(toIndentedString(cycleType)).append("\n");
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
