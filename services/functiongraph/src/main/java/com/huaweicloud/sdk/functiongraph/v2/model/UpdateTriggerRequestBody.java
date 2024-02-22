package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateTriggerRequestBody
 */
public class UpdateTriggerRequestBody {

    /**
     * 触发器状态
     */
    public static final class TriggerStatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final TriggerStatusEnum ACTIVE = new TriggerStatusEnum("ACTIVE");

        /**
         * Enum DISABLED for value: "DISABLED"
         */
        public static final TriggerStatusEnum DISABLED = new TriggerStatusEnum("DISABLED");

        private static final Map<String, TriggerStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TriggerStatusEnum> createStaticFields() {
            Map<String, TriggerStatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("DISABLED", DISABLED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TriggerStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TriggerStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TriggerStatusEnum(value));
        }

        public static TriggerStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TriggerStatusEnum) {
                return this.value.equals(((TriggerStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_status")

    private TriggerStatusEnum triggerStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_data")

    private List<UpdateriggerEventData> eventData = null;

    public UpdateTriggerRequestBody withTriggerStatus(TriggerStatusEnum triggerStatus) {
        this.triggerStatus = triggerStatus;
        return this;
    }

    /**
     * 触发器状态
     * @return triggerStatus
     */
    public TriggerStatusEnum getTriggerStatus() {
        return triggerStatus;
    }

    public void setTriggerStatus(TriggerStatusEnum triggerStatus) {
        this.triggerStatus = triggerStatus;
    }

    public UpdateTriggerRequestBody withEventData(List<UpdateriggerEventData> eventData) {
        this.eventData = eventData;
        return this;
    }

    public UpdateTriggerRequestBody addEventDataItem(UpdateriggerEventData eventDataItem) {
        if (this.eventData == null) {
            this.eventData = new ArrayList<>();
        }
        this.eventData.add(eventDataItem);
        return this;
    }

    public UpdateTriggerRequestBody withEventData(Consumer<List<UpdateriggerEventData>> eventDataSetter) {
        if (this.eventData == null) {
            this.eventData = new ArrayList<>();
        }
        eventDataSetter.accept(this.eventData);
        return this;
    }

    /**
     * 触发器更新事件
     * @return eventData
     */
    public List<UpdateriggerEventData> getEventData() {
        return eventData;
    }

    public void setEventData(List<UpdateriggerEventData> eventData) {
        this.eventData = eventData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTriggerRequestBody that = (UpdateTriggerRequestBody) obj;
        return Objects.equals(this.triggerStatus, that.triggerStatus) && Objects.equals(this.eventData, that.eventData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(triggerStatus, eventData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTriggerRequestBody {\n");
        sb.append("    triggerStatus: ").append(toIndentedString(triggerStatus)).append("\n");
        sb.append("    eventData: ").append(toIndentedString(eventData)).append("\n");
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
