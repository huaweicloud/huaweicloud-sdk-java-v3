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
public class CreateScheduleTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_tasks")

    private List<InstanceTaskDetail> instanceTasks = null;

    public CreateScheduleTaskResponse withInstanceTasks(List<InstanceTaskDetail> instanceTasks) {
        this.instanceTasks = instanceTasks;
        return this;
    }

    public CreateScheduleTaskResponse addInstanceTasksItem(InstanceTaskDetail instanceTasksItem) {
        if (this.instanceTasks == null) {
            this.instanceTasks = new ArrayList<>();
        }
        this.instanceTasks.add(instanceTasksItem);
        return this;
    }

    public CreateScheduleTaskResponse withInstanceTasks(Consumer<List<InstanceTaskDetail>> instanceTasksSetter) {
        if (this.instanceTasks == null) {
            this.instanceTasks = new ArrayList<>();
        }
        instanceTasksSetter.accept(this.instanceTasks);
        return this;
    }

    /**
     * 任务ID。
     * @return instanceTasks
     */
    public List<InstanceTaskDetail> getInstanceTasks() {
        return instanceTasks;
    }

    public void setInstanceTasks(List<InstanceTaskDetail> instanceTasks) {
        this.instanceTasks = instanceTasks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateScheduleTaskResponse that = (CreateScheduleTaskResponse) obj;
        return Objects.equals(this.instanceTasks, that.instanceTasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceTasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateScheduleTaskResponse {\n");
        sb.append("    instanceTasks: ").append(toIndentedString(instanceTasks)).append("\n");
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
