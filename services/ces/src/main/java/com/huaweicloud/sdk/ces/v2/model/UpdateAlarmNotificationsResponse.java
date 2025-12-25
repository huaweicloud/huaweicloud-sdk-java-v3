package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateAlarmNotificationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_enabled")

    private Boolean notificationEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_notifications")

    private List<NotificationResp> alarmNotifications = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ok_notifications")

    private List<NotificationResp> okNotifications = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_begin_time")

    private String notificationBeginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_end_time")

    private String notificationEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_timezone")

    private String effectiveTimezone;

    /**
     * **参数解释**： 告警的通知方式 **取值范围**： - NOTIFICATION_GROUP: 通知组 - TOPIC_SUBSCRIPTION: 主题订阅 - NOTIFICATION_POLICY：通知策略 
     */
    public static final class NotificationMannerEnum {

        /**
         * Enum NOTIFICATION_GROUP for value: "NOTIFICATION_GROUP"
         */
        public static final NotificationMannerEnum NOTIFICATION_GROUP =
            new NotificationMannerEnum("NOTIFICATION_GROUP");

        /**
         * Enum TOPIC_SUBSCRIPTION for value: "TOPIC_SUBSCRIPTION"
         */
        public static final NotificationMannerEnum TOPIC_SUBSCRIPTION =
            new NotificationMannerEnum("TOPIC_SUBSCRIPTION");

        /**
         * Enum NOTIFICATION_POLICY for value: "NOTIFICATION_POLICY"
         */
        public static final NotificationMannerEnum NOTIFICATION_POLICY =
            new NotificationMannerEnum("NOTIFICATION_POLICY");

        private static final Map<String, NotificationMannerEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NotificationMannerEnum> createStaticFields() {
            Map<String, NotificationMannerEnum> map = new HashMap<>();
            map.put("NOTIFICATION_GROUP", NOTIFICATION_GROUP);
            map.put("TOPIC_SUBSCRIPTION", TOPIC_SUBSCRIPTION);
            map.put("NOTIFICATION_POLICY", NOTIFICATION_POLICY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NotificationMannerEnum(String value) {
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
        public static NotificationMannerEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NotificationMannerEnum(value));
        }

        public static NotificationMannerEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NotificationMannerEnum) {
                return this.value.equals(((NotificationMannerEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_manner")

    private NotificationMannerEnum notificationManner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_policy_ids")

    private List<String> notificationPolicyIds = null;

    public UpdateAlarmNotificationsResponse withNotificationEnabled(Boolean notificationEnabled) {
        this.notificationEnabled = notificationEnabled;
        return this;
    }

    /**
     * **参数解释**： 是否开启告警通知。     **取值范围**： 布尔值。 - true:开启。 - false:关闭。 
     * @return notificationEnabled
     */
    public Boolean getNotificationEnabled() {
        return notificationEnabled;
    }

    public void setNotificationEnabled(Boolean notificationEnabled) {
        this.notificationEnabled = notificationEnabled;
    }

    public UpdateAlarmNotificationsResponse withAlarmNotifications(List<NotificationResp> alarmNotifications) {
        this.alarmNotifications = alarmNotifications;
        return this;
    }

    public UpdateAlarmNotificationsResponse addAlarmNotificationsItem(NotificationResp alarmNotificationsItem) {
        if (this.alarmNotifications == null) {
            this.alarmNotifications = new ArrayList<>();
        }
        this.alarmNotifications.add(alarmNotificationsItem);
        return this;
    }

    public UpdateAlarmNotificationsResponse withAlarmNotifications(
        Consumer<List<NotificationResp>> alarmNotificationsSetter) {
        if (this.alarmNotifications == null) {
            this.alarmNotifications = new ArrayList<>();
        }
        alarmNotificationsSetter.accept(this.alarmNotifications);
        return this;
    }

    /**
     * **参数解释**： 触发告警时，通知组/主题订阅的信息。 
     * @return alarmNotifications
     */
    public List<NotificationResp> getAlarmNotifications() {
        return alarmNotifications;
    }

    public void setAlarmNotifications(List<NotificationResp> alarmNotifications) {
        this.alarmNotifications = alarmNotifications;
    }

    public UpdateAlarmNotificationsResponse withOkNotifications(List<NotificationResp> okNotifications) {
        this.okNotifications = okNotifications;
        return this;
    }

    public UpdateAlarmNotificationsResponse addOkNotificationsItem(NotificationResp okNotificationsItem) {
        if (this.okNotifications == null) {
            this.okNotifications = new ArrayList<>();
        }
        this.okNotifications.add(okNotificationsItem);
        return this;
    }

    public UpdateAlarmNotificationsResponse withOkNotifications(
        Consumer<List<NotificationResp>> okNotificationsSetter) {
        if (this.okNotifications == null) {
            this.okNotifications = new ArrayList<>();
        }
        okNotificationsSetter.accept(this.okNotifications);
        return this;
    }

    /**
     * **参数解释**： 告警恢复时，通知组/主题订阅的信息。 
     * @return okNotifications
     */
    public List<NotificationResp> getOkNotifications() {
        return okNotifications;
    }

    public void setOkNotifications(List<NotificationResp> okNotifications) {
        this.okNotifications = okNotifications;
    }

    public UpdateAlarmNotificationsResponse withNotificationBeginTime(String notificationBeginTime) {
        this.notificationBeginTime = notificationBeginTime;
        return this;
    }

    /**
     * **参数解释**： 告警通知开启时间。如 00:00    **取值范围**： 只能包含数字、“:”，长度为[1,64]个字符。 
     * @return notificationBeginTime
     */
    public String getNotificationBeginTime() {
        return notificationBeginTime;
    }

    public void setNotificationBeginTime(String notificationBeginTime) {
        this.notificationBeginTime = notificationBeginTime;
    }

    public UpdateAlarmNotificationsResponse withNotificationEndTime(String notificationEndTime) {
        this.notificationEndTime = notificationEndTime;
        return this;
    }

    /**
     * **参数解释**： 告警通知关闭时间。如 08:00   **取值范围**： 只能包含数字、“:”，长度为[1,64]个字符。 
     * @return notificationEndTime
     */
    public String getNotificationEndTime() {
        return notificationEndTime;
    }

    public void setNotificationEndTime(String notificationEndTime) {
        this.notificationEndTime = notificationEndTime;
    }

    public UpdateAlarmNotificationsResponse withEffectiveTimezone(String effectiveTimezone) {
        this.effectiveTimezone = effectiveTimezone;
        return this;
    }

    /**
     * **参数解释**： 时区，形如：\"GMT-08:00\"、\"GMT+08:00\"、\"GMT+0:00\"。    **取值范围**： 长度为[1,16]个字符。 
     * @return effectiveTimezone
     */
    public String getEffectiveTimezone() {
        return effectiveTimezone;
    }

    public void setEffectiveTimezone(String effectiveTimezone) {
        this.effectiveTimezone = effectiveTimezone;
    }

    public UpdateAlarmNotificationsResponse withNotificationManner(NotificationMannerEnum notificationManner) {
        this.notificationManner = notificationManner;
        return this;
    }

    /**
     * **参数解释**： 告警的通知方式 **取值范围**： - NOTIFICATION_GROUP: 通知组 - TOPIC_SUBSCRIPTION: 主题订阅 - NOTIFICATION_POLICY：通知策略 
     * @return notificationManner
     */
    public NotificationMannerEnum getNotificationManner() {
        return notificationManner;
    }

    public void setNotificationManner(NotificationMannerEnum notificationManner) {
        this.notificationManner = notificationManner;
    }

    public UpdateAlarmNotificationsResponse withNotificationPolicyIds(List<String> notificationPolicyIds) {
        this.notificationPolicyIds = notificationPolicyIds;
        return this;
    }

    public UpdateAlarmNotificationsResponse addNotificationPolicyIdsItem(String notificationPolicyIdsItem) {
        if (this.notificationPolicyIds == null) {
            this.notificationPolicyIds = new ArrayList<>();
        }
        this.notificationPolicyIds.add(notificationPolicyIdsItem);
        return this;
    }

    public UpdateAlarmNotificationsResponse withNotificationPolicyIds(
        Consumer<List<String>> notificationPolicyIdsSetter) {
        if (this.notificationPolicyIds == null) {
            this.notificationPolicyIds = new ArrayList<>();
        }
        notificationPolicyIdsSetter.accept(this.notificationPolicyIds);
        return this;
    }

    /**
     * **参数解释**： 关联的通知策略ID列表 
     * @return notificationPolicyIds
     */
    public List<String> getNotificationPolicyIds() {
        return notificationPolicyIds;
    }

    public void setNotificationPolicyIds(List<String> notificationPolicyIds) {
        this.notificationPolicyIds = notificationPolicyIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAlarmNotificationsResponse that = (UpdateAlarmNotificationsResponse) obj;
        return Objects.equals(this.notificationEnabled, that.notificationEnabled)
            && Objects.equals(this.alarmNotifications, that.alarmNotifications)
            && Objects.equals(this.okNotifications, that.okNotifications)
            && Objects.equals(this.notificationBeginTime, that.notificationBeginTime)
            && Objects.equals(this.notificationEndTime, that.notificationEndTime)
            && Objects.equals(this.effectiveTimezone, that.effectiveTimezone)
            && Objects.equals(this.notificationManner, that.notificationManner)
            && Objects.equals(this.notificationPolicyIds, that.notificationPolicyIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationEnabled,
            alarmNotifications,
            okNotifications,
            notificationBeginTime,
            notificationEndTime,
            effectiveTimezone,
            notificationManner,
            notificationPolicyIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAlarmNotificationsResponse {\n");
        sb.append("    notificationEnabled: ").append(toIndentedString(notificationEnabled)).append("\n");
        sb.append("    alarmNotifications: ").append(toIndentedString(alarmNotifications)).append("\n");
        sb.append("    okNotifications: ").append(toIndentedString(okNotifications)).append("\n");
        sb.append("    notificationBeginTime: ").append(toIndentedString(notificationBeginTime)).append("\n");
        sb.append("    notificationEndTime: ").append(toIndentedString(notificationEndTime)).append("\n");
        sb.append("    effectiveTimezone: ").append(toIndentedString(effectiveTimezone)).append("\n");
        sb.append("    notificationManner: ").append(toIndentedString(notificationManner)).append("\n");
        sb.append("    notificationPolicyIds: ").append(toIndentedString(notificationPolicyIds)).append("\n");
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
