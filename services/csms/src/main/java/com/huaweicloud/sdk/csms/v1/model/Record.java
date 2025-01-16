package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 事件通知记录。
 */
public class Record {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_name")

    private String eventName;

    /**
     * 事件类型。 - SECRET_VERSION_CREATED:版本创建 - SECRET_VERSION_EXPIRED:版本过期 - SECRET_ROTATED:凭据轮转成功 - SECRET_DELETED:凭据删除 - SECRET_ROTATED_FAILED:凭据轮转失败
     */
    public static final class TriggerEventTypeEnum {

        /**
         * Enum SECRET_VERSION_CREATED for value: "SECRET_VERSION_CREATED"
         */
        public static final TriggerEventTypeEnum SECRET_VERSION_CREATED =
            new TriggerEventTypeEnum("SECRET_VERSION_CREATED");

        /**
         * Enum SECRET_VERSION_EXPIRED for value: "SECRET_VERSION_EXPIRED"
         */
        public static final TriggerEventTypeEnum SECRET_VERSION_EXPIRED =
            new TriggerEventTypeEnum("SECRET_VERSION_EXPIRED");

        /**
         * Enum SECRET_ROTATED for value: "SECRET_ROTATED"
         */
        public static final TriggerEventTypeEnum SECRET_ROTATED = new TriggerEventTypeEnum("SECRET_ROTATED");

        /**
         * Enum SECRET_DELETED for value: "SECRET_DELETED"
         */
        public static final TriggerEventTypeEnum SECRET_DELETED = new TriggerEventTypeEnum("SECRET_DELETED");

        /**
         * Enum SECRET_ROTATED_FAILED for value: "SECRET_ROTATED_FAILED"
         */
        public static final TriggerEventTypeEnum SECRET_ROTATED_FAILED =
            new TriggerEventTypeEnum("SECRET_ROTATED_FAILED");

        private static final Map<String, TriggerEventTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TriggerEventTypeEnum> createStaticFields() {
            Map<String, TriggerEventTypeEnum> map = new HashMap<>();
            map.put("SECRET_VERSION_CREATED", SECRET_VERSION_CREATED);
            map.put("SECRET_VERSION_EXPIRED", SECRET_VERSION_EXPIRED);
            map.put("SECRET_ROTATED", SECRET_ROTATED);
            map.put("SECRET_DELETED", SECRET_DELETED);
            map.put("SECRET_ROTATED_FAILED", SECRET_ROTATED_FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TriggerEventTypeEnum(String value) {
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
        public static TriggerEventTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TriggerEventTypeEnum(value));
        }

        public static TriggerEventTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TriggerEventTypeEnum) {
                return this.value.equals(((TriggerEventTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_event_type")

    private TriggerEventTypeEnum triggerEventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_name")

    private String secretName;

    /**
     * 凭据类型  - COMMON：通用凭据(默认)。用于应用系统中的各种敏感信息储存。 - RDS：RDS凭据 。专门针对RDS的凭据，用于存储RDS的账号信息。（已不支持，使用RDS-FG替代） - RDS-FG：RDS凭据 。专门针对RDS的凭据，用于存储RDS的账号信息。 - GaussDB-FG：TaurusDB凭据。专门针对TaurusDB的凭据，用于存储TaurusDB的账号信息。
     */
    public static final class SecretTypeEnum {

        /**
         * Enum COMMON for value: "COMMON"
         */
        public static final SecretTypeEnum COMMON = new SecretTypeEnum("COMMON");

        /**
         * Enum RDS_FG for value: "RDS-FG"
         */
        public static final SecretTypeEnum RDS_FG = new SecretTypeEnum("RDS-FG");

        /**
         * Enum GAUSSDB_FG for value: "GaussDB-FG"
         */
        public static final SecretTypeEnum GAUSSDB_FG = new SecretTypeEnum("GaussDB-FG");

        private static final Map<String, SecretTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SecretTypeEnum> createStaticFields() {
            Map<String, SecretTypeEnum> map = new HashMap<>();
            map.put("COMMON", COMMON);
            map.put("RDS-FG", RDS_FG);
            map.put("GaussDB-FG", GAUSSDB_FG);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SecretTypeEnum(String value) {
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
        public static SecretTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SecretTypeEnum(value));
        }

        public static SecretTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SecretTypeEnum) {
                return this.value.equals(((SecretTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_type")

    private SecretTypeEnum secretType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_target_name")

    private String notificationTargetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_target_id")

    private String notificationTargetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_content")

    private String notificationContent;

    /**
     * 事件通知状态。  - SUCCESS：事件通知成功。 - FAIL：事件通知失败。 - INVALID：事件通知配置主题信息无效或不正确，无法触发通知。
     */
    public static final class NotificationStatusEnum {

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final NotificationStatusEnum SUCCESS = new NotificationStatusEnum("SUCCESS");

        /**
         * Enum FAIL for value: "FAIL"
         */
        public static final NotificationStatusEnum FAIL = new NotificationStatusEnum("FAIL");

        /**
         * Enum INVALID for value: "INVALID"
         */
        public static final NotificationStatusEnum INVALID = new NotificationStatusEnum("INVALID");

        private static final Map<String, NotificationStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NotificationStatusEnum> createStaticFields() {
            Map<String, NotificationStatusEnum> map = new HashMap<>();
            map.put("SUCCESS", SUCCESS);
            map.put("FAIL", FAIL);
            map.put("INVALID", INVALID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NotificationStatusEnum(String value) {
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
        public static NotificationStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NotificationStatusEnum(value));
        }

        public static NotificationStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NotificationStatusEnum) {
                return this.value.equals(((NotificationStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_status")

    private NotificationStatusEnum notificationStatus;

    public Record withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * 凭据名称。
     * @return eventName
     */
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Record withTriggerEventType(TriggerEventTypeEnum triggerEventType) {
        this.triggerEventType = triggerEventType;
        return this;
    }

    /**
     * 事件类型。 - SECRET_VERSION_CREATED:版本创建 - SECRET_VERSION_EXPIRED:版本过期 - SECRET_ROTATED:凭据轮转成功 - SECRET_DELETED:凭据删除 - SECRET_ROTATED_FAILED:凭据轮转失败
     * @return triggerEventType
     */
    public TriggerEventTypeEnum getTriggerEventType() {
        return triggerEventType;
    }

    public void setTriggerEventType(TriggerEventTypeEnum triggerEventType) {
        this.triggerEventType = triggerEventType;
    }

    public Record withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 事件通知记录的创建时间，时间戳，即从1970年1月1日至该时间的总秒数。
     * minimum: 0
     * maximum: 13
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Record withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * 凭据名称。
     * @return secretName
     */
    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    public Record withSecretType(SecretTypeEnum secretType) {
        this.secretType = secretType;
        return this;
    }

    /**
     * 凭据类型  - COMMON：通用凭据(默认)。用于应用系统中的各种敏感信息储存。 - RDS：RDS凭据 。专门针对RDS的凭据，用于存储RDS的账号信息。（已不支持，使用RDS-FG替代） - RDS-FG：RDS凭据 。专门针对RDS的凭据，用于存储RDS的账号信息。 - GaussDB-FG：TaurusDB凭据。专门针对TaurusDB的凭据，用于存储TaurusDB的账号信息。
     * @return secretType
     */
    public SecretTypeEnum getSecretType() {
        return secretType;
    }

    public void setSecretType(SecretTypeEnum secretType) {
        this.secretType = secretType;
    }

    public Record withNotificationTargetName(String notificationTargetName) {
        this.notificationTargetName = notificationTargetName;
        return this;
    }

    /**
     * 事件通知的对象名称。
     * @return notificationTargetName
     */
    public String getNotificationTargetName() {
        return notificationTargetName;
    }

    public void setNotificationTargetName(String notificationTargetName) {
        this.notificationTargetName = notificationTargetName;
    }

    public Record withNotificationTargetId(String notificationTargetId) {
        this.notificationTargetId = notificationTargetId;
        return this;
    }

    /**
     * 事件通知的对象ID。
     * @return notificationTargetId
     */
    public String getNotificationTargetId() {
        return notificationTargetId;
    }

    public void setNotificationTargetId(String notificationTargetId) {
        this.notificationTargetId = notificationTargetId;
    }

    public Record withNotificationContent(String notificationContent) {
        this.notificationContent = notificationContent;
        return this;
    }

    /**
     * 事件通知的内容。
     * @return notificationContent
     */
    public String getNotificationContent() {
        return notificationContent;
    }

    public void setNotificationContent(String notificationContent) {
        this.notificationContent = notificationContent;
    }

    public Record withNotificationStatus(NotificationStatusEnum notificationStatus) {
        this.notificationStatus = notificationStatus;
        return this;
    }

    /**
     * 事件通知状态。  - SUCCESS：事件通知成功。 - FAIL：事件通知失败。 - INVALID：事件通知配置主题信息无效或不正确，无法触发通知。
     * @return notificationStatus
     */
    public NotificationStatusEnum getNotificationStatus() {
        return notificationStatus;
    }

    public void setNotificationStatus(NotificationStatusEnum notificationStatus) {
        this.notificationStatus = notificationStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Record that = (Record) obj;
        return Objects.equals(this.eventName, that.eventName)
            && Objects.equals(this.triggerEventType, that.triggerEventType)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.secretName, that.secretName)
            && Objects.equals(this.secretType, that.secretType)
            && Objects.equals(this.notificationTargetName, that.notificationTargetName)
            && Objects.equals(this.notificationTargetId, that.notificationTargetId)
            && Objects.equals(this.notificationContent, that.notificationContent)
            && Objects.equals(this.notificationStatus, that.notificationStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventName,
            triggerEventType,
            createTime,
            secretName,
            secretType,
            notificationTargetName,
            notificationTargetId,
            notificationContent,
            notificationStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Record {\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    triggerEventType: ").append(toIndentedString(triggerEventType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
        sb.append("    secretType: ").append(toIndentedString(secretType)).append("\n");
        sb.append("    notificationTargetName: ").append(toIndentedString(notificationTargetName)).append("\n");
        sb.append("    notificationTargetId: ").append(toIndentedString(notificationTargetId)).append("\n");
        sb.append("    notificationContent: ").append(toIndentedString(notificationContent)).append("\n");
        sb.append("    notificationStatus: ").append(toIndentedString(notificationStatus)).append("\n");
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
