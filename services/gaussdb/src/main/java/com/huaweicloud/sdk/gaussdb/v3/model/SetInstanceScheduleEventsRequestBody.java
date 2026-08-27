package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：  设置事件执行策略参数体。  **约束限制**：  不涉及。
 */
public class SetInstanceScheduleEventsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    private String operationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_instances")

    private List<EventInstances> eventInstances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_schedule_window")

    private Object eventScheduleWindow;

    public SetInstanceScheduleEventsRequestBody withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * **参数解释**：  事件操作类型。  **约束限制**：  不涉及。  **取值范围**：  - execute：授权立即执行。 - cancel：授权取消执行。 - reservation：授权预约执行。  **默认取值**：  不涉及。
     * @return operationType
     */
    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public SetInstanceScheduleEventsRequestBody withEventInstances(List<EventInstances> eventInstances) {
        this.eventInstances = eventInstances;
        return this;
    }

    public SetInstanceScheduleEventsRequestBody addEventInstancesItem(EventInstances eventInstancesItem) {
        if (this.eventInstances == null) {
            this.eventInstances = new ArrayList<>();
        }
        this.eventInstances.add(eventInstancesItem);
        return this;
    }

    public SetInstanceScheduleEventsRequestBody withEventInstances(
        Consumer<List<EventInstances>> eventInstancesSetter) {
        if (this.eventInstances == null) {
            this.eventInstances = new ArrayList<>();
        }
        eventInstancesSetter.accept(this.eventInstances);
        return this;
    }

    /**
     * **参数解释**：  事件信息。  **约束限制**：  批量事件个数不得超过20个。
     * @return eventInstances
     */
    public List<EventInstances> getEventInstances() {
        return eventInstances;
    }

    public void setEventInstances(List<EventInstances> eventInstances) {
        this.eventInstances = eventInstances;
    }

    public SetInstanceScheduleEventsRequestBody withEventScheduleWindow(Object eventScheduleWindow) {
        this.eventScheduleWindow = eventScheduleWindow;
        return this;
    }

    /**
     * **参数解释**：  事件执行窗口。  **约束限制**：  当operation_type为reservation时，该字段必传。
     * @return eventScheduleWindow
     */
    public Object getEventScheduleWindow() {
        return eventScheduleWindow;
    }

    public void setEventScheduleWindow(Object eventScheduleWindow) {
        this.eventScheduleWindow = eventScheduleWindow;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetInstanceScheduleEventsRequestBody that = (SetInstanceScheduleEventsRequestBody) obj;
        return Objects.equals(this.operationType, that.operationType)
            && Objects.equals(this.eventInstances, that.eventInstances)
            && Objects.equals(this.eventScheduleWindow, that.eventScheduleWindow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationType, eventInstances, eventScheduleWindow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetInstanceScheduleEventsRequestBody {\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    eventInstances: ").append(toIndentedString(eventInstances)).append("\n");
        sb.append("    eventScheduleWindow: ").append(toIndentedString(eventScheduleWindow)).append("\n");
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
