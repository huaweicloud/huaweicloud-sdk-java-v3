package com.huaweicloud.sdk.modelarts.v1.model;

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
public class ShowWorkflowScheduleListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedules")

    private List<WorkflowScheduleResp> schedules = null;

    public ShowWorkflowScheduleListResponse withSchedules(List<WorkflowScheduleResp> schedules) {
        this.schedules = schedules;
        return this;
    }

    public ShowWorkflowScheduleListResponse addSchedulesItem(WorkflowScheduleResp schedulesItem) {
        if (this.schedules == null) {
            this.schedules = new ArrayList<>();
        }
        this.schedules.add(schedulesItem);
        return this;
    }

    public ShowWorkflowScheduleListResponse withSchedules(Consumer<List<WorkflowScheduleResp>> schedulesSetter) {
        if (this.schedules == null) {
            this.schedules = new ArrayList<>();
        }
        schedulesSetter.accept(this.schedules);
        return this;
    }

    /**
     * **参数解释**：工作流定时调度列表
     * @return schedules
     */
    public List<WorkflowScheduleResp> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<WorkflowScheduleResp> schedules) {
        this.schedules = schedules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowWorkflowScheduleListResponse that = (ShowWorkflowScheduleListResponse) obj;
        return Objects.equals(this.schedules, that.schedules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWorkflowScheduleListResponse {\n");
        sb.append("    schedules: ").append(toIndentedString(schedules)).append("\n");
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
