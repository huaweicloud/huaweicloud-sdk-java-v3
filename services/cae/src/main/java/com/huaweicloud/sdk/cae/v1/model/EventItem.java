package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * EventItem
 */
public class EventItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 涉及对象类型。
     */
    public static final class InvolvedObjectKindEnum {

        /**
         * Enum COMPONENT for value: "Component"
         */
        public static final InvolvedObjectKindEnum COMPONENT = new InvolvedObjectKindEnum("Component");

        /**
         * Enum COMPONENTINSTANCE for value: "ComponentInstance"
         */
        public static final InvolvedObjectKindEnum COMPONENTINSTANCE = new InvolvedObjectKindEnum("ComponentInstance");

        /**
         * Enum COMPONENTSCALING for value: "ComponentScaling"
         */
        public static final InvolvedObjectKindEnum COMPONENTSCALING = new InvolvedObjectKindEnum("ComponentScaling");

        private static final Map<String, InvolvedObjectKindEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InvolvedObjectKindEnum> createStaticFields() {
            Map<String, InvolvedObjectKindEnum> map = new HashMap<>();
            map.put("Component", COMPONENT);
            map.put("ComponentInstance", COMPONENTINSTANCE);
            map.put("ComponentScaling", COMPONENTSCALING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InvolvedObjectKindEnum(String value) {
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
        public static InvolvedObjectKindEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InvolvedObjectKindEnum(value));
        }

        public static InvolvedObjectKindEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InvolvedObjectKindEnum) {
                return this.value.equals(((InvolvedObjectKindEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "involved_object_kind")

    private InvolvedObjectKindEnum involvedObjectKind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "involved_object")

    private String involvedObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    /**
     * 组件事件状态。
     */
    public static final class StatusEnum {

        /**
         * Enum WARNING for value: "Warning"
         */
        public static final StatusEnum WARNING = new StatusEnum("Warning");

        /**
         * Enum NORMAL for value: "Normal"
         */
        public static final StatusEnum NORMAL = new StatusEnum("Normal");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("Warning", WARNING);
            map.put("Normal", NORMAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public EventItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 事件名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EventItem withInvolvedObjectKind(InvolvedObjectKindEnum involvedObjectKind) {
        this.involvedObjectKind = involvedObjectKind;
        return this;
    }

    /**
     * 涉及对象类型。
     * @return involvedObjectKind
     */
    public InvolvedObjectKindEnum getInvolvedObjectKind() {
        return involvedObjectKind;
    }

    public void setInvolvedObjectKind(InvolvedObjectKindEnum involvedObjectKind) {
        this.involvedObjectKind = involvedObjectKind;
    }

    public EventItem withInvolvedObject(String involvedObject) {
        this.involvedObject = involvedObject;
        return this;
    }

    /**
     * 涉及对象。
     * @return involvedObject
     */
    public String getInvolvedObject() {
        return involvedObject;
    }

    public void setInvolvedObject(String involvedObject) {
        this.involvedObject = involvedObject;
    }

    public EventItem withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 组件事件信息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public EventItem withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public EventItem withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public EventItem withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 组件事件状态。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public EventItem withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 事件发生次数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventItem that = (EventItem) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.involvedObjectKind, that.involvedObjectKind)
            && Objects.equals(this.involvedObject, that.involvedObject) && Objects.equals(this.message, that.message)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.status, that.status) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, involvedObjectKind, involvedObject, message, createdAt, updatedAt, status, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventItem {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    involvedObjectKind: ").append(toIndentedString(involvedObjectKind)).append("\n");
        sb.append("    involvedObject: ").append(toIndentedString(involvedObject)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
