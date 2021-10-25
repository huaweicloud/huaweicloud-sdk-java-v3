package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** CreateNotificationRequestBody */
public class CreateNotificationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    /** 通知类型 0-设备上线通知 1-设备下线通知 2-设备添加通知 3-设备删除通知 4-设备变更通知 */
    public static final class TypeEnum {

        /** Enum NUMBER_0 for value: 0l */
        public static final TypeEnum NUMBER_0 = new TypeEnum(0l);

        /** Enum NUMBER_1 for value: 1l */
        public static final TypeEnum NUMBER_1 = new TypeEnum(1l);

        /** Enum NUMBER_2 for value: 2l */
        public static final TypeEnum NUMBER_2 = new TypeEnum(2l);

        /** Enum NUMBER_3 for value: 3l */
        public static final TypeEnum NUMBER_3 = new TypeEnum(3l);

        /** Enum NUMBER_4 for value: 4l */
        public static final TypeEnum NUMBER_4 = new TypeEnum(4l);

        private static final Map<Long, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Long, TypeEnum> createStaticFields() {
            Map<Long, TypeEnum> map = new HashMap<>();
            map.put(0l, NUMBER_0);
            map.put(1l, NUMBER_1);
            map.put(2l, NUMBER_2);
            map.put(3l, NUMBER_3);
            map.put(4l, NUMBER_4);
            return Collections.unmodifiableMap(map);
        }

        private Long value;

        TypeEnum(Long value) {
            this.value = value;
        }

        @JsonValue
        public Long getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(Long value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(Long value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    /** 启停状态 0-启用 1-停用 */
    public static final class StatusEnum {

        /** Enum NUMBER_0 for value: 0l */
        public static final StatusEnum NUMBER_0 = new StatusEnum(0l);

        /** Enum NUMBER_1 for value: 1l */
        public static final StatusEnum NUMBER_1 = new StatusEnum(1l);

        private static final Map<Long, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Long, StatusEnum> createStaticFields() {
            Map<Long, StatusEnum> map = new HashMap<>();
            map.put(0l, NUMBER_0);
            map.put(1l, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Long value;

        StatusEnum(Long value) {
            this.value = value;
        }

        @JsonValue
        public Long getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(Long value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(Long value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    public CreateNotificationRequestBody withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /** 通知归属的应用ID
     * 
     * @return appId */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public CreateNotificationRequestBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /** 通知类型 0-设备上线通知 1-设备下线通知 2-设备添加通知 3-设备删除通知 4-设备变更通知 minimum: 0 maximum: 10
     * 
     * @return type */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateNotificationRequestBody withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /** 通知发送的主题名，该主题需要在MQS存在
     * 
     * @return topic */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public CreateNotificationRequestBody withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /** 启停状态 0-启用 1-停用 minimum: 0 maximum: 10
     * 
     * @return status */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateNotificationRequestBody createNotificationRequestBody = (CreateNotificationRequestBody) o;
        return Objects.equals(this.appId, createNotificationRequestBody.appId)
            && Objects.equals(this.type, createNotificationRequestBody.type)
            && Objects.equals(this.topic, createNotificationRequestBody.topic)
            && Objects.equals(this.status, createNotificationRequestBody.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, type, topic, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNotificationRequestBody {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
