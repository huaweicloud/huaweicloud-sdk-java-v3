package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchExecuteEventsRequestBody
 */
public class BatchExecuteEventsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_instances")

    private List<EventInstanceOption> eventInstances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    private String operationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_schedule_window")

    private EventScheduleWindowOption eventScheduleWindow;

    public BatchExecuteEventsRequestBody withEventInstances(List<EventInstanceOption> eventInstances) {
        this.eventInstances = eventInstances;
        return this;
    }

    public BatchExecuteEventsRequestBody addEventInstancesItem(EventInstanceOption eventInstancesItem) {
        if (this.eventInstances == null) {
            this.eventInstances = new ArrayList<>();
        }
        this.eventInstances.add(eventInstancesItem);
        return this;
    }

    public BatchExecuteEventsRequestBody withEventInstances(Consumer<List<EventInstanceOption>> eventInstancesSetter) {
        if (this.eventInstances == null) {
            this.eventInstances = new ArrayList<>();
        }
        eventInstancesSetter.accept(this.eventInstances);
        return this;
    }

    /**
     * **参数解释**: 事件列表。 **约束限制**: 不涉及。
     * @return eventInstances
     */
    public List<EventInstanceOption> getEventInstances() {
        return eventInstances;
    }

    public void setEventInstances(List<EventInstanceOption> eventInstances) {
        this.eventInstances = eventInstances;
    }

    public BatchExecuteEventsRequestBody withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * **参数解释**: 事件操作类型。 **约束限制**: 不涉及。 **取值范围**: - cancel：取消事件 - execute：立即执行 - reservation：预约执行时间窗口 **默认取值**: 不涉及。
     * @return operationType
     */
    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public BatchExecuteEventsRequestBody withEventScheduleWindow(EventScheduleWindowOption eventScheduleWindow) {
        this.eventScheduleWindow = eventScheduleWindow;
        return this;
    }

    public BatchExecuteEventsRequestBody withEventScheduleWindow(
        Consumer<EventScheduleWindowOption> eventScheduleWindowSetter) {
        if (this.eventScheduleWindow == null) {
            this.eventScheduleWindow = new EventScheduleWindowOption();
            eventScheduleWindowSetter.accept(this.eventScheduleWindow);
        }

        return this;
    }

    /**
     * Get eventScheduleWindow
     * @return eventScheduleWindow
     */
    public EventScheduleWindowOption getEventScheduleWindow() {
        return eventScheduleWindow;
    }

    public void setEventScheduleWindow(EventScheduleWindowOption eventScheduleWindow) {
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
        BatchExecuteEventsRequestBody that = (BatchExecuteEventsRequestBody) obj;
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
        sb.append("class BatchExecuteEventsRequestBody {\n");
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
