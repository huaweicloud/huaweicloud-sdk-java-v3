package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * OperateEventReq
 */
public class OperateEventReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_instances")

    private List<EventInstance> eventInstances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    private String operationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_schedule_window")

    private EventScheduleWindow eventScheduleWindow;

    public OperateEventReq withEventInstances(List<EventInstance> eventInstances) {
        this.eventInstances = eventInstances;
        return this;
    }

    public OperateEventReq addEventInstancesItem(EventInstance eventInstancesItem) {
        if (this.eventInstances == null) {
            this.eventInstances = new ArrayList<>();
        }
        this.eventInstances.add(eventInstancesItem);
        return this;
    }

    public OperateEventReq withEventInstances(Consumer<List<EventInstance>> eventInstancesSetter) {
        if (this.eventInstances == null) {
            this.eventInstances = new ArrayList<>();
        }
        eventInstancesSetter.accept(this.eventInstances);
        return this;
    }

    /**
     * **参数解释**：  事件列表  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return eventInstances
     */
    public List<EventInstance> getEventInstances() {
        return eventInstances;
    }

    public void setEventInstances(List<EventInstance> eventInstances) {
        this.eventInstances = eventInstances;
    }

    public OperateEventReq withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * **参数解释**：  事件操作类型：cancel|execute|reservation  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return operationType
     */
    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public OperateEventReq withEventScheduleWindow(EventScheduleWindow eventScheduleWindow) {
        this.eventScheduleWindow = eventScheduleWindow;
        return this;
    }

    public OperateEventReq withEventScheduleWindow(Consumer<EventScheduleWindow> eventScheduleWindowSetter) {
        if (this.eventScheduleWindow == null) {
            this.eventScheduleWindow = new EventScheduleWindow();
            eventScheduleWindowSetter.accept(this.eventScheduleWindow);
        }

        return this;
    }

    /**
     * Get eventScheduleWindow
     * @return eventScheduleWindow
     */
    public EventScheduleWindow getEventScheduleWindow() {
        return eventScheduleWindow;
    }

    public void setEventScheduleWindow(EventScheduleWindow eventScheduleWindow) {
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
        OperateEventReq that = (OperateEventReq) obj;
        return Objects.equals(this.eventInstances, that.eventInstances)
            && Objects.equals(this.operationType, that.operationType)
            && Objects.equals(this.eventScheduleWindow, that.eventScheduleWindow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventInstances, operationType, eventScheduleWindow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperateEventReq {\n");
        sb.append("    eventInstances: ").append(toIndentedString(eventInstances)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
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
