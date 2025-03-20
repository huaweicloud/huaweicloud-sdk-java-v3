package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 消息通知
 */
public class MessageNotification {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private String policy;

    /**
     * 通知对象类型
     */
    public static final class NotificationEndpointTypeEnum {

        /**
         * Enum USER for value: "USER"
         */
        public static final NotificationEndpointTypeEnum USER = new NotificationEndpointTypeEnum("USER");

        /**
         * Enum ON_CALL for value: "ON_CALL"
         */
        public static final NotificationEndpointTypeEnum ON_CALL = new NotificationEndpointTypeEnum("ON_CALL");

        private static final Map<String, NotificationEndpointTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NotificationEndpointTypeEnum> createStaticFields() {
            Map<String, NotificationEndpointTypeEnum> map = new HashMap<>();
            map.put("USER", USER);
            map.put("ON_CALL", ON_CALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NotificationEndpointTypeEnum(String value) {
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
        public static NotificationEndpointTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new NotificationEndpointTypeEnum(value));
        }

        public static NotificationEndpointTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NotificationEndpointTypeEnum) {
                return this.value.equals(((NotificationEndpointTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_endpoint_type")

    private NotificationEndpointTypeEnum notificationEndpointType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_scene_id")

    private String scheduleSceneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_role_id")

    private String scheduleRoleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recipients")

    private String recipients;

    /**
     * 通知渠道
     */
    public static final class ProtocolEnum {

        /**
         * Enum DEFAULT for value: "DEFAULT"
         */
        public static final ProtocolEnum DEFAULT = new ProtocolEnum("DEFAULT");

        /**
         * Enum NONE for value: "NONE"
         */
        public static final ProtocolEnum NONE = new ProtocolEnum("NONE");

        /**
         * Enum SMS for value: "SMS"
         */
        public static final ProtocolEnum SMS = new ProtocolEnum("SMS");

        /**
         * Enum EMAIL for value: "EMAIL"
         */
        public static final ProtocolEnum EMAIL = new ProtocolEnum("EMAIL");

        /**
         * Enum DINGDING for value: "DINGDING"
         */
        public static final ProtocolEnum DINGDING = new ProtocolEnum("DINGDING");

        /**
         * Enum LARK for value: "LARK"
         */
        public static final ProtocolEnum LARK = new ProtocolEnum("LARK");

        /**
         * Enum WELINK for value: "WELINK"
         */
        public static final ProtocolEnum WELINK = new ProtocolEnum("WELINK");

        /**
         * Enum CALLNOTIFY for value: "CALLNOTIFY"
         */
        public static final ProtocolEnum CALLNOTIFY = new ProtocolEnum("CALLNOTIFY");

        /**
         * Enum WECHAT for value: "WECHAT"
         */
        public static final ProtocolEnum WECHAT = new ProtocolEnum("WECHAT");

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("DEFAULT", DEFAULT);
            map.put("NONE", NONE);
            map.put("SMS", SMS);
            map.put("EMAIL", EMAIL);
            map.put("DINGDING", DINGDING);
            map.put("LARK", LARK);
            map.put("WELINK", WELINK);
            map.put("CALLNOTIFY", CALLNOTIFY);
            map.put("WECHAT", WECHAT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolEnum(String value) {
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
        public static ProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtocolEnum(value));
        }

        public static ProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtocolEnum) {
                return this.value.equals(((ProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private ProtocolEnum protocol;

    public MessageNotification withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * 通知策略
     * @return policy
     */
    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public MessageNotification withNotificationEndpointType(NotificationEndpointTypeEnum notificationEndpointType) {
        this.notificationEndpointType = notificationEndpointType;
        return this;
    }

    /**
     * 通知对象类型
     * @return notificationEndpointType
     */
    public NotificationEndpointTypeEnum getNotificationEndpointType() {
        return notificationEndpointType;
    }

    public void setNotificationEndpointType(NotificationEndpointTypeEnum notificationEndpointType) {
        this.notificationEndpointType = notificationEndpointType;
    }

    public MessageNotification withScheduleSceneId(String scheduleSceneId) {
        this.scheduleSceneId = scheduleSceneId;
        return this;
    }

    /**
     * 排班场景ID
     * @return scheduleSceneId
     */
    public String getScheduleSceneId() {
        return scheduleSceneId;
    }

    public void setScheduleSceneId(String scheduleSceneId) {
        this.scheduleSceneId = scheduleSceneId;
    }

    public MessageNotification withScheduleRoleId(String scheduleRoleId) {
        this.scheduleRoleId = scheduleRoleId;
        return this;
    }

    /**
     * 排班角色ID
     * @return scheduleRoleId
     */
    public String getScheduleRoleId() {
        return scheduleRoleId;
    }

    public void setScheduleRoleId(String scheduleRoleId) {
        this.scheduleRoleId = scheduleRoleId;
    }

    public MessageNotification withRecipients(String recipients) {
        this.recipients = recipients;
        return this;
    }

    /**
     * 消息接收人
     * @return recipients
     */
    public String getRecipients() {
        return recipients;
    }

    public void setRecipients(String recipients) {
        this.recipients = recipients;
    }

    public MessageNotification withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 通知渠道
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MessageNotification that = (MessageNotification) obj;
        return Objects.equals(this.policy, that.policy)
            && Objects.equals(this.notificationEndpointType, that.notificationEndpointType)
            && Objects.equals(this.scheduleSceneId, that.scheduleSceneId)
            && Objects.equals(this.scheduleRoleId, that.scheduleRoleId)
            && Objects.equals(this.recipients, that.recipients) && Objects.equals(this.protocol, that.protocol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policy, notificationEndpointType, scheduleSceneId, scheduleRoleId, recipients, protocol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageNotification {\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    notificationEndpointType: ").append(toIndentedString(notificationEndpointType)).append("\n");
        sb.append("    scheduleSceneId: ").append(toIndentedString(scheduleSceneId)).append("\n");
        sb.append("    scheduleRoleId: ").append(toIndentedString(scheduleRoleId)).append("\n");
        sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
