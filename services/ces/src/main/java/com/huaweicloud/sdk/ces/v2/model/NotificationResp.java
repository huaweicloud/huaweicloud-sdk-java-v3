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

/**
 * NotificationResp
 */
public class NotificationResp {

    /**
     * **参数解释**： 通知类型。 **取值范围**： 枚举值。 - notification：SMN通知。 - contact：云账号联系人。 - contactGroup：通知组。 - autoscaling：AS通知，只在AS中使用，不推荐客户使用。 - groupwatch：已废弃，不推荐使用。 - ecsRecovery：已废弃，不推荐使用。 - iecAction：已废弃，不推荐使用。 
     */
    public static final class TypeEnum {

        /**
         * Enum NOTIFICATION for value: "notification"
         */
        public static final TypeEnum NOTIFICATION = new TypeEnum("notification");

        /**
         * Enum AUTOSCALING for value: "autoscaling"
         */
        public static final TypeEnum AUTOSCALING = new TypeEnum("autoscaling");

        /**
         * Enum GROUPWATCH for value: "groupwatch"
         */
        public static final TypeEnum GROUPWATCH = new TypeEnum("groupwatch");

        /**
         * Enum ECSRECOVERY for value: "ecsRecovery"
         */
        public static final TypeEnum ECSRECOVERY = new TypeEnum("ecsRecovery");

        /**
         * Enum CONTACT for value: "contact"
         */
        public static final TypeEnum CONTACT = new TypeEnum("contact");

        /**
         * Enum CONTACTGROUP for value: "contactGroup"
         */
        public static final TypeEnum CONTACTGROUP = new TypeEnum("contactGroup");

        /**
         * Enum IECACTION for value: "iecAction"
         */
        public static final TypeEnum IECACTION = new TypeEnum("iecAction");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("notification", NOTIFICATION);
            map.put("autoscaling", AUTOSCALING);
            map.put("groupwatch", GROUPWATCH);
            map.put("ecsRecovery", ECSRECOVERY);
            map.put("contact", CONTACT);
            map.put("contactGroup", CONTACTGROUP);
            map.put("iecAction", IECACTION);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    public NotificationResp withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 通知类型。 **取值范围**： 枚举值。 - notification：SMN通知。 - contact：云账号联系人。 - contactGroup：通知组。 - autoscaling：AS通知，只在AS中使用，不推荐客户使用。 - groupwatch：已废弃，不推荐使用。 - ecsRecovery：已废弃，不推荐使用。 - iecAction：已废弃，不推荐使用。 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public NotificationResp withNotificationList(List<String> notificationList) {
        this.notificationList = notificationList;
        return this;
    }

    public NotificationResp addNotificationListItem(String notificationListItem) {
        if (this.notificationList == null) {
            this.notificationList = new ArrayList<>();
        }
        this.notificationList.add(notificationListItem);
        return this;
    }

    public NotificationResp withNotificationList(Consumer<List<String>> notificationListSetter) {
        if (this.notificationList == null) {
            this.notificationList = new ArrayList<>();
        }
        notificationListSetter.accept(this.notificationList);
        return this;
    }

    /**
     * **参数解释**：  告警状态发生变化时，被通知对象的列表。topicUrn可从SMN获取，具体操作请参考查询Topic列表。 
     * @return notificationList
     */
    public List<String> getNotificationList() {
        return notificationList;
    }

    public void setNotificationList(List<String> notificationList) {
        this.notificationList = notificationList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NotificationResp that = (NotificationResp) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.notificationList, that.notificationList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, notificationList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotificationResp {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    notificationList: ").append(toIndentedString(notificationList)).append("\n");
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
