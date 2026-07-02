package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class CheckScheduleTaskExistResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exist")

    private Boolean exist;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_tasks")

    private List<ScheduledTaskV3> scheduledTasks = null;

    public CheckScheduleTaskExistResponse withExist(Boolean exist) {
        this.exist = exist;
        return this;
    }

    /**
     * **参数解释**：  定时任务类型是否存在。 **取值范围**： - true：指定的定时任务类型已存在。 - false：指定的定时任务类型不存在。
     * @return exist
     */
    public Boolean getExist() {
        return exist;
    }

    public void setExist(Boolean exist) {
        this.exist = exist;
    }

    public CheckScheduleTaskExistResponse withScheduledTasks(List<ScheduledTaskV3> scheduledTasks) {
        this.scheduledTasks = scheduledTasks;
        return this;
    }

    public CheckScheduleTaskExistResponse addScheduledTasksItem(ScheduledTaskV3 scheduledTasksItem) {
        if (this.scheduledTasks == null) {
            this.scheduledTasks = new ArrayList<>();
        }
        this.scheduledTasks.add(scheduledTasksItem);
        return this;
    }

    public CheckScheduleTaskExistResponse withScheduledTasks(Consumer<List<ScheduledTaskV3>> scheduledTasksSetter) {
        if (this.scheduledTasks == null) {
            this.scheduledTasks = new ArrayList<>();
        }
        scheduledTasksSetter.accept(this.scheduledTasks);
        return this;
    }

    /**
     * **参数解释**：  定时任务详情列表。当 `exist` 为 true 时，此列表包含已存在的任务信息。  **取值范围**： 不涉及。
     * @return scheduledTasks
     */
    public List<ScheduledTaskV3> getScheduledTasks() {
        return scheduledTasks;
    }

    public void setScheduledTasks(List<ScheduledTaskV3> scheduledTasks) {
        this.scheduledTasks = scheduledTasks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckScheduleTaskExistResponse that = (CheckScheduleTaskExistResponse) obj;
        return Objects.equals(this.exist, that.exist) && Objects.equals(this.scheduledTasks, that.scheduledTasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exist, scheduledTasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckScheduleTaskExistResponse {\n");
        sb.append("    exist: ").append(toIndentedString(exist)).append("\n");
        sb.append("    scheduledTasks: ").append(toIndentedString(scheduledTasks)).append("\n");
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
