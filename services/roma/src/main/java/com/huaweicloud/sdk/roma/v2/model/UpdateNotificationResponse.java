package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Response Object */
public class UpdateNotificationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_id")

    private Long notificationId;

    /** 订阅类型, 0:设备上线通知类型, 1:设备下线通知类型, 2:设备添加通知类型, 3:设备删除通知类型, 4:设备变更通知类型 */
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

    /** 订阅管理状态，0：启用，1：停用 */
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    public UpdateNotificationResponse withNotificationId(Long notificationId) {
        this.notificationId = notificationId;
        return this;
    }

    /** 订阅ID minimum: 0 maximum: 100
     * 
     * @return notificationId */
    public Long getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Long notificationId) {
        this.notificationId = notificationId;
    }

    public UpdateNotificationResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /** 订阅类型, 0:设备上线通知类型, 1:设备下线通知类型, 2:设备添加通知类型, 3:设备删除通知类型, 4:设备变更通知类型 minimum: 0 maximum: 4
     * 
     * @return type */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public UpdateNotificationResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /** 订阅管理状态，0：启用，1：停用 minimum: 0 maximum: 1
     * 
     * @return status */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public UpdateNotificationResponse withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /** 订阅的topic名称
     * 
     * @return topic */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public UpdateNotificationResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 实例ID
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateNotificationResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /** 应用ID
     * 
     * @return appId */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateNotificationResponse updateNotificationResponse = (UpdateNotificationResponse) o;
        return Objects.equals(this.notificationId, updateNotificationResponse.notificationId)
            && Objects.equals(this.type, updateNotificationResponse.type)
            && Objects.equals(this.status, updateNotificationResponse.status)
            && Objects.equals(this.topic, updateNotificationResponse.topic)
            && Objects.equals(this.instanceId, updateNotificationResponse.instanceId)
            && Objects.equals(this.appId, updateNotificationResponse.appId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationId, type, status, topic, instanceId, appId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNotificationResponse {\n");
        sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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
