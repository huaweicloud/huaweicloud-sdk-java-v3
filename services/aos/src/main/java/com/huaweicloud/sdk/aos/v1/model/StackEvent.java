package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * StackEvent
 */
public class StackEvent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id_key")

    private String resourceIdKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id_value")

    private String resourceIdValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_key")

    private String resourceKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    /**
     * 此次事件的类型   * `LOG` - 记录状态信息，比如当前状态，目标状态等。   * `ERROR` - 记录失败信息   * `DRIFT` - 记录资源偏移信息   * `SUMMARY` - 记录资源变更结果总结   * `CREATION_IN_PROGRESS` - 正在生成   * `CREATION_FAILED` - 生成失败   * `CREATION_COMPLETE` - 生成完成   * `DELETION_IN_PROGRESS` - 正在删除   * `DELETION_FAILED` - 删除失败   * `DELETION_COMPLETE` - 已经删除   * `UPDATE_IN_PROGRESS` - 正在更新。此处的更新特指非替换式更新，如果是替换式更新，则是DELETION后CREATION，或者CREATION后DELETION，具体以何种行为进行替换式更新由Provider定义。   * `UPDATE_FAILED` - 更新失败。此处的更新特指非替换式更新，如果是替换式更新，则是DELETION后CREATION，或者CREATION后DELETION，具体以何种行为进行替换式更新由Provider定义。   * `UPDATE_COMPLETE` - 更新完成。此处的更新特指非替换式更新，如果是替换式更新，则是DELETION后CREATION，或者CREATION后DELETION，具体以何种行为进行替换式更新由Provider定义。
     */
    public static final class EventTypeEnum {

        /**
         * Enum LOG for value: "LOG"
         */
        public static final EventTypeEnum LOG = new EventTypeEnum("LOG");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final EventTypeEnum ERROR = new EventTypeEnum("ERROR");

        /**
         * Enum DRIFT for value: "DRIFT"
         */
        public static final EventTypeEnum DRIFT = new EventTypeEnum("DRIFT");

        /**
         * Enum SUMMARY for value: "SUMMARY"
         */
        public static final EventTypeEnum SUMMARY = new EventTypeEnum("SUMMARY");

        /**
         * Enum CREATION_IN_PROGRESS for value: "CREATION_IN_PROGRESS"
         */
        public static final EventTypeEnum CREATION_IN_PROGRESS = new EventTypeEnum("CREATION_IN_PROGRESS");

        /**
         * Enum CREATION_FAILED for value: "CREATION_FAILED"
         */
        public static final EventTypeEnum CREATION_FAILED = new EventTypeEnum("CREATION_FAILED");

        /**
         * Enum CREATION_COMPLETE for value: "CREATION_COMPLETE"
         */
        public static final EventTypeEnum CREATION_COMPLETE = new EventTypeEnum("CREATION_COMPLETE");

        /**
         * Enum DELETION_IN_PROGRESS for value: "DELETION_IN_PROGRESS"
         */
        public static final EventTypeEnum DELETION_IN_PROGRESS = new EventTypeEnum("DELETION_IN_PROGRESS");

        /**
         * Enum DELETION_FAILED for value: "DELETION_FAILED"
         */
        public static final EventTypeEnum DELETION_FAILED = new EventTypeEnum("DELETION_FAILED");

        /**
         * Enum DELETION_COMPLETE for value: "DELETION_COMPLETE"
         */
        public static final EventTypeEnum DELETION_COMPLETE = new EventTypeEnum("DELETION_COMPLETE");

        /**
         * Enum UPDATE_IN_PROGRESS for value: "UPDATE_IN_PROGRESS"
         */
        public static final EventTypeEnum UPDATE_IN_PROGRESS = new EventTypeEnum("UPDATE_IN_PROGRESS");

        /**
         * Enum UPDATE_FAILED for value: "UPDATE_FAILED"
         */
        public static final EventTypeEnum UPDATE_FAILED = new EventTypeEnum("UPDATE_FAILED");

        /**
         * Enum UPDATE_COMPLETE for value: "UPDATE_COMPLETE"
         */
        public static final EventTypeEnum UPDATE_COMPLETE = new EventTypeEnum("UPDATE_COMPLETE");

        private static final Map<String, EventTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EventTypeEnum> createStaticFields() {
            Map<String, EventTypeEnum> map = new HashMap<>();
            map.put("LOG", LOG);
            map.put("ERROR", ERROR);
            map.put("DRIFT", DRIFT);
            map.put("SUMMARY", SUMMARY);
            map.put("CREATION_IN_PROGRESS", CREATION_IN_PROGRESS);
            map.put("CREATION_FAILED", CREATION_FAILED);
            map.put("CREATION_COMPLETE", CREATION_COMPLETE);
            map.put("DELETION_IN_PROGRESS", DELETION_IN_PROGRESS);
            map.put("DELETION_FAILED", DELETION_FAILED);
            map.put("DELETION_COMPLETE", DELETION_COMPLETE);
            map.put("UPDATE_IN_PROGRESS", UPDATE_IN_PROGRESS);
            map.put("UPDATE_FAILED", UPDATE_FAILED);
            map.put("UPDATE_COMPLETE", UPDATE_COMPLETE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EventTypeEnum(String value) {
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
        public static EventTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EventTypeEnum(value));
        }

        public static EventTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EventTypeEnum) {
                return this.value.equals(((EventTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private EventTypeEnum eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_message")

    private String eventMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elapsed_seconds")

    private Integer elapsedSeconds;

    public StackEvent withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源的类型  以HCL格式的模板为例，resource_type 为 huaweicloud_vpc  ```hcl resource \"huaweicloud_vpc\" \"my_hello_world_vpc\" {   name = \"test_vpc\" } ```  以json格式的模板为例，resource_type 为 huaweicloud_vpc  ```json {   \"resource\": {     \"huaweicloud_vpc\": {       \"my_hello_world_vpc\": {         \"name\": \"test_vpc\"       }     }   } } ```
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public StackEvent withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源的名称，默认为资源的逻辑名称  以HCL格式的模板为例，resource_name 为 my_hello_world_vpc  ```hcl resource \"huaweicloud_vpc\" \"my_hello_world_vpc\" {   name = \"test_vpc\" } ```  以json格式的模板为例，resource_name 为 my_hello_world_vpc  ```json {   \"resource\": {     \"huaweicloud_vpc\": {       \"my_hello_world_vpc\": {         \"name\": \"test_vpc\"       }     }   } } ```
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public StackEvent withResourceIdKey(String resourceIdKey) {
        this.resourceIdKey = resourceIdKey;
        return this;
    }

    /**
     * 资源id的名称，即对应资源作为id使用的值的名称，当资源未创建的时候，不返回resource_id_key 此id由provider定义，因此不同的provider可能遵循了不同的命名规则，具体的命名规则请与provider开发者确认或阅读provider文档
     * @return resourceIdKey
     */
    public String getResourceIdKey() {
        return resourceIdKey;
    }

    public void setResourceIdKey(String resourceIdKey) {
        this.resourceIdKey = resourceIdKey;
    }

    public StackEvent withResourceIdValue(String resourceIdValue) {
        this.resourceIdValue = resourceIdValue;
        return this;
    }

    /**
     * 资源id的值，即对应资源作为id使用的值，当资源未创建的时候，不返回resource_id_value
     * @return resourceIdValue
     */
    public String getResourceIdValue() {
        return resourceIdValue;
    }

    public void setResourceIdValue(String resourceIdValue) {
        this.resourceIdValue = resourceIdValue;
    }

    public StackEvent withResourceKey(String resourceKey) {
        this.resourceKey = resourceKey;
        return this;
    }

    /**
     * 资源键，若用户在模板中使用了count或for_each则会返回resource_key  若用户在模板中使用count，则resource_key为从0开始的数字  以HCL格式的模板为例，模板中count为2，意味着将会生成两个资源，对应的resource_key分别为0和1  ```hcl resource \"huaweicloud_vpc\" \"my_hello_world_vpc\" {   count = 2   name = \"test_vpc\" } ```  以json格式的模板为例，模板中count为2，意味着将会生成两个资源，对应的resource_key分别为0和1  ```json {   \"resource\": {     \"huaweicloud_vpc\": {       \"my_hello_world_vpc\": {         \"name\": \"test_vpc\",         \"count\": 2       }     }   } } ```  若用户在模板中使用for_each，则resource_key为用户自定义的字符串  以HCL格式的模板为例，resource_key分别为vpc1和vpc2  ```hcl resource \"huaweicloud_vpc\" \"my_hello_world_vpc\" {   for_each = {     \"vpc1\" = \"test_vpc\"     \"vpc2\" = \"test_vpc\"   }   name = each.value } ```  以json格式的模板为例，resource_key分别为vpc1和vpc2  ```json {   \"resource\": {     \"huaweicloud_vpc\": {       \"my_hello_world_vpc\": {         \"for_each\": {           \"vpc1\": \"test_vpc\",           \"vpc2\": \"test_vpc\"         }         \"name\": \"${each.value}\"       }     }   } } ```
     * @return resourceKey
     */
    public String getResourceKey() {
        return resourceKey;
    }

    public void setResourceKey(String resourceKey) {
        this.resourceKey = resourceKey;
    }

    public StackEvent withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 事件发生的时间 格式遵循RFC3339，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public StackEvent withEventType(EventTypeEnum eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * 此次事件的类型   * `LOG` - 记录状态信息，比如当前状态，目标状态等。   * `ERROR` - 记录失败信息   * `DRIFT` - 记录资源偏移信息   * `SUMMARY` - 记录资源变更结果总结   * `CREATION_IN_PROGRESS` - 正在生成   * `CREATION_FAILED` - 生成失败   * `CREATION_COMPLETE` - 生成完成   * `DELETION_IN_PROGRESS` - 正在删除   * `DELETION_FAILED` - 删除失败   * `DELETION_COMPLETE` - 已经删除   * `UPDATE_IN_PROGRESS` - 正在更新。此处的更新特指非替换式更新，如果是替换式更新，则是DELETION后CREATION，或者CREATION后DELETION，具体以何种行为进行替换式更新由Provider定义。   * `UPDATE_FAILED` - 更新失败。此处的更新特指非替换式更新，如果是替换式更新，则是DELETION后CREATION，或者CREATION后DELETION，具体以何种行为进行替换式更新由Provider定义。   * `UPDATE_COMPLETE` - 更新完成。此处的更新特指非替换式更新，如果是替换式更新，则是DELETION后CREATION，或者CREATION后DELETION，具体以何种行为进行替换式更新由Provider定义。
     * @return eventType
     */
    public EventTypeEnum getEventType() {
        return eventType;
    }

    public void setEventType(EventTypeEnum eventType) {
        this.eventType = eventType;
    }

    public StackEvent withEventMessage(String eventMessage) {
        this.eventMessage = eventMessage;
        return this;
    }

    /**
     * 该资源栈事件对应的详细信息
     * @return eventMessage
     */
    public String getEventMessage() {
        return eventMessage;
    }

    public void setEventMessage(String eventMessage) {
        this.eventMessage = eventMessage;
    }

    public StackEvent withElapsedSeconds(Integer elapsedSeconds) {
        this.elapsedSeconds = elapsedSeconds;
        return this;
    }

    /**
     * 此事件执行所花的时间，以秒为单位
     * @return elapsedSeconds
     */
    public Integer getElapsedSeconds() {
        return elapsedSeconds;
    }

    public void setElapsedSeconds(Integer elapsedSeconds) {
        this.elapsedSeconds = elapsedSeconds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StackEvent that = (StackEvent) obj;
        return Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.resourceIdKey, that.resourceIdKey)
            && Objects.equals(this.resourceIdValue, that.resourceIdValue)
            && Objects.equals(this.resourceKey, that.resourceKey) && Objects.equals(this.time, that.time)
            && Objects.equals(this.eventType, that.eventType) && Objects.equals(this.eventMessage, that.eventMessage)
            && Objects.equals(this.elapsedSeconds, that.elapsedSeconds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType,
            resourceName,
            resourceIdKey,
            resourceIdValue,
            resourceKey,
            time,
            eventType,
            eventMessage,
            elapsedSeconds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StackEvent {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceIdKey: ").append(toIndentedString(resourceIdKey)).append("\n");
        sb.append("    resourceIdValue: ").append(toIndentedString(resourceIdValue)).append("\n");
        sb.append("    resourceKey: ").append(toIndentedString(resourceKey)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    eventMessage: ").append(toIndentedString(eventMessage)).append("\n");
        sb.append("    elapsedSeconds: ").append(toIndentedString(elapsedSeconds)).append("\n");
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
