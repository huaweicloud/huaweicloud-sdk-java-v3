package com.huaweicloud.sdk.ces.v2.model;

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

/** SMNAction */
public class SMNAction {

    /** 通知类型 */
    public static final class TypeEnum {

        /** Enum NOTIFICATION for value: "notification" */
        public static final TypeEnum NOTIFICATION = new TypeEnum("notification");

        /** Enum AUTOSCALING for value: "autoscaling" */
        public static final TypeEnum AUTOSCALING = new TypeEnum("autoscaling");

        /** Enum GROUPWATCH for value: "groupwatch" */
        public static final TypeEnum GROUPWATCH = new TypeEnum("groupwatch");

        /** Enum ECSRECOVERY for value: "ecsRecovery" */
        public static final TypeEnum ECSRECOVERY = new TypeEnum("ecsRecovery");

        /** Enum CONTACT for value: "contact" */
        public static final TypeEnum CONTACT = new TypeEnum("contact");

        /** Enum CONTACTGROUP for value: "contactGroup" */
        public static final TypeEnum CONTACTGROUP = new TypeEnum("contactGroup");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("notification", NOTIFICATION);
            map.put("autoscaling", AUTOSCALING);
            map.put("groupwatch", GROUPWATCH);
            map.put("ecsRecovery", ECSRECOVERY);
            map.put("contact", CONTACT);
            map.put("contactGroup", CONTACTGROUP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
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
    @JsonProperty(value = "notification_list")

    private List<String> notificationList = null;

    public SMNAction withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /** 通知类型
     * 
     * @return type */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public SMNAction withNotificationList(List<String> notificationList) {
        this.notificationList = notificationList;
        return this;
    }

    public SMNAction addNotificationListItem(String notificationListItem) {
        if (this.notificationList == null) {
            this.notificationList = new ArrayList<>();
        }
        this.notificationList.add(notificationListItem);
        return this;
    }

    public SMNAction withNotificationList(Consumer<List<String>> notificationListSetter) {
        if (this.notificationList == null) {
            this.notificationList = new ArrayList<>();
        }
        notificationListSetter.accept(this.notificationList);
        return this;
    }

    /** 告警状态发生变化时，被通知对象的列表。通知对象ID最多可以配置5个。topicUrn可从SMN获取，具体操作请参考查询Topic列表。当type为notification时，notificationList列表不能为空；当type为autoscaling时，列表必须为[]。
     * 说明：若alarm_action_enabled为true，对应的alarm_actions、insufficientdata_actions（该参数已废弃，建议无需配置）、ok_actions至少有一个不能为空。若alarm_actions、insufficientdata_actions（该参数已废弃，建议无需配置）、ok_actions同时存在时，notificationList值保持一致。
     * 
     * @return notificationList */
    public List<String> getNotificationList() {
        return notificationList;
    }

    public void setNotificationList(List<String> notificationList) {
        this.notificationList = notificationList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SMNAction smNAction = (SMNAction) o;
        return Objects.equals(this.type, smNAction.type)
            && Objects.equals(this.notificationList, smNAction.notificationList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, notificationList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SMNAction {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    notificationList: ").append(toIndentedString(notificationList)).append("\n");
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
