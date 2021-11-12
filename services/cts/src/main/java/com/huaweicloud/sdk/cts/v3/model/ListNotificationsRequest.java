package com.huaweicloud.sdk.cts.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Request Object */
public class ListNotificationsRequest {

    /** 通知类型。 */
    public static final class NotificationTypeEnum {

        /** Enum SMN for value: "smn" */
        public static final NotificationTypeEnum SMN = new NotificationTypeEnum("smn");

        /** Enum FUN for value: "fun" */
        public static final NotificationTypeEnum FUN = new NotificationTypeEnum("fun");

        private static final Map<String, NotificationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NotificationTypeEnum> createStaticFields() {
            Map<String, NotificationTypeEnum> map = new HashMap<>();
            map.put("smn", SMN);
            map.put("fun", FUN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NotificationTypeEnum(String value) {
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
        public static NotificationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            NotificationTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NotificationTypeEnum(value);
            }
            return result;
        }

        public static NotificationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            NotificationTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NotificationTypeEnum) {
                return this.value.equals(((NotificationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_type")

    private NotificationTypeEnum notificationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_name")

    private String notificationName;

    public ListNotificationsRequest withNotificationType(NotificationTypeEnum notificationType) {
        this.notificationType = notificationType;
        return this;
    }

    /** 通知类型。
     * 
     * @return notificationType */
    public NotificationTypeEnum getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(NotificationTypeEnum notificationType) {
        this.notificationType = notificationType;
    }

    public ListNotificationsRequest withNotificationName(String notificationName) {
        this.notificationName = notificationName;
        return this;
    }

    /** 标识关键操作通知名称。 在不传入该字段的情况下，将查询当前租户所有的关键操作通知。
     * 
     * @return notificationName */
    public String getNotificationName() {
        return notificationName;
    }

    public void setNotificationName(String notificationName) {
        this.notificationName = notificationName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNotificationsRequest listNotificationsRequest = (ListNotificationsRequest) o;
        return Objects.equals(this.notificationType, listNotificationsRequest.notificationType)
            && Objects.equals(this.notificationName, listNotificationsRequest.notificationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationType, notificationName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNotificationsRequest {\n");
        sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
        sb.append("    notificationName: ").append(toIndentedString(notificationName)).append("\n");
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
