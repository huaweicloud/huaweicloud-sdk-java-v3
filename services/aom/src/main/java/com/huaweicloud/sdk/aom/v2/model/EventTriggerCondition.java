package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EventTriggerCondition
 */
public class EventTriggerCondition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_name")

    private String eventName;

    /**
     * 触发方式： - “immediately”：立即触发 - “accumulative”：累计触发
     */
    public static final class TriggerTypeEnum {

        /**
         * Enum IMMEDIATELY for value: "immediately"
         */
        public static final TriggerTypeEnum IMMEDIATELY = new TriggerTypeEnum("immediately");

        /**
         * Enum ACCUMULATIVE for value: "accumulative"
         */
        public static final TriggerTypeEnum ACCUMULATIVE = new TriggerTypeEnum("accumulative");

        private static final Map<String, TriggerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TriggerTypeEnum> createStaticFields() {
            Map<String, TriggerTypeEnum> map = new HashMap<>();
            map.put("immediately", IMMEDIATELY);
            map.put("accumulative", ACCUMULATIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TriggerTypeEnum(String value) {
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
        public static TriggerTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TriggerTypeEnum(value));
        }

        public static TriggerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TriggerTypeEnum) {
                return this.value.equals(((TriggerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private TriggerTypeEnum triggerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregation_window")

    private Long aggregationWindow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thresholds")

    private Map<String, Integer> thresholds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency")

    private String frequency;

    public EventTriggerCondition withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * 事件名称。
     * @return eventName
     */
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public EventTriggerCondition withTriggerType(TriggerTypeEnum triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * 触发方式： - “immediately”：立即触发 - “accumulative”：累计触发
     * @return triggerType
     */
    public TriggerTypeEnum getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(TriggerTypeEnum triggerType) {
        this.triggerType = triggerType;
    }

    public EventTriggerCondition withAggregationWindow(Long aggregationWindow) {
        this.aggregationWindow = aggregationWindow;
        return this;
    }

    /**
     * 统计周期。单位为秒，例如 1小时 填“3600”，当trigger_type为“immediately”时 不填。
     * @return aggregationWindow
     */
    public Long getAggregationWindow() {
        return aggregationWindow;
    }

    public void setAggregationWindow(Long aggregationWindow) {
        this.aggregationWindow = aggregationWindow;
    }

    public EventTriggerCondition withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 判断条件：“>”,“<”,“=”,“>=”,“<=”，当trigger_type为“immediately”时 不填。
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public EventTriggerCondition withThresholds(Map<String, Integer> thresholds) {
        this.thresholds = thresholds;
        return this;
    }

    public EventTriggerCondition putThresholdsItem(String key, Integer thresholdsItem) {
        if (this.thresholds == null) {
            this.thresholds = new HashMap<>();
        }
        this.thresholds.put(key, thresholdsItem);
        return this;
    }

    public EventTriggerCondition withThresholds(Consumer<Map<String, Integer>> thresholdsSetter) {
        if (this.thresholds == null) {
            this.thresholds = new HashMap<>();
        }
        thresholdsSetter.accept(this.thresholds);
        return this;
    }

    /**
     * 键值对形式，键为告警级别，值为累计次数，当trigger_type为“immediately”时 值为空。
     * @return thresholds
     */
    public Map<String, Integer> getThresholds() {
        return thresholds;
    }

    public void setThresholds(Map<String, Integer> thresholds) {
        this.thresholds = thresholds;
    }

    public EventTriggerCondition withFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * 事件类告警频率。当trigger_type为“immediately”时 不填。 - “0”：只告警一次 - “300”：每5分钟 - “600”：每10分钟： - “900”：每15分钟： - “1800”：每30分钟： - “3600”：每1小时： - “10800”：每3小时： - “21600”：每6小时： - “43200”：每12小时： - “86400”：每天：
     * @return frequency
     */
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventTriggerCondition that = (EventTriggerCondition) obj;
        return Objects.equals(this.eventName, that.eventName) && Objects.equals(this.triggerType, that.triggerType)
            && Objects.equals(this.aggregationWindow, that.aggregationWindow)
            && Objects.equals(this.operator, that.operator) && Objects.equals(this.thresholds, that.thresholds)
            && Objects.equals(this.frequency, that.frequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventName, triggerType, aggregationWindow, operator, thresholds, frequency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventTriggerCondition {\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    aggregationWindow: ").append(toIndentedString(aggregationWindow)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
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
