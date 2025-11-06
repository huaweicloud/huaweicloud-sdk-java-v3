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
 * EnableOneClickAlarmRequestBody
 */
public class EnableOneClickAlarmRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "one_click_alarm_id")

    private String oneClickAlarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension_names")

    private DimensionNames dimensionNames;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_enabled")

    private Boolean notificationEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_notifications")

    private List<Notification> alarmNotifications = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ok_notifications")

    private List<Notification> okNotifications = null;

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
     * NOTIFICATION_GROUP(通知组)/TOPIC_SUBSCRIPTION(主题订阅)/NOTIFICATION_POLICY(通知策略)
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_reset")

    private Boolean isReset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled_alarm_ids")

    private List<String> enabledAlarmIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "one_click_update_alarms")

    private List<EnableOneClickAlarmRequestBodyOneClickUpdateAlarms> oneClickUpdateAlarms = null;

    public EnableOneClickAlarmRequestBody withOneClickAlarmId(String oneClickAlarmId) {
        this.oneClickAlarmId = oneClickAlarmId;
        return this;
    }

    /**
     * **参数解释**： 一键告警ID。 **约束限制**： 不涉及。 **取值范围**： 只能为字母或者数字，字符长度为[1,64] **默认取值**： 不涉及。 
     * @return oneClickAlarmId
     */
    public String getOneClickAlarmId() {
        return oneClickAlarmId;
    }

    public void setOneClickAlarmId(String oneClickAlarmId) {
        this.oneClickAlarmId = oneClickAlarmId;
    }

    public EnableOneClickAlarmRequestBody withDimensionNames(DimensionNames dimensionNames) {
        this.dimensionNames = dimensionNames;
        return this;
    }

    public EnableOneClickAlarmRequestBody withDimensionNames(Consumer<DimensionNames> dimensionNamesSetter) {
        if (this.dimensionNames == null) {
            this.dimensionNames = new DimensionNames();
            dimensionNamesSetter.accept(this.dimensionNames);
        }

        return this;
    }

    /**
     * Get dimensionNames
     * @return dimensionNames
     */
    public DimensionNames getDimensionNames() {
        return dimensionNames;
    }

    public void setDimensionNames(DimensionNames dimensionNames) {
        this.dimensionNames = dimensionNames;
    }

    public EnableOneClickAlarmRequestBody withNotificationEnabled(Boolean notificationEnabled) {
        this.notificationEnabled = notificationEnabled;
        return this;
    }

    /**
     * **参数解释**： 是否开启告警通知。     **约束限制**： 不涉及。 **取值范围**： 布尔值。 - true:开启。 - false:关闭。 **默认取值**： true 
     * @return notificationEnabled
     */
    public Boolean getNotificationEnabled() {
        return notificationEnabled;
    }

    public void setNotificationEnabled(Boolean notificationEnabled) {
        this.notificationEnabled = notificationEnabled;
    }

    public EnableOneClickAlarmRequestBody withAlarmNotifications(List<Notification> alarmNotifications) {
        this.alarmNotifications = alarmNotifications;
        return this;
    }

    public EnableOneClickAlarmRequestBody addAlarmNotificationsItem(Notification alarmNotificationsItem) {
        if (this.alarmNotifications == null) {
            this.alarmNotifications = new ArrayList<>();
        }
        this.alarmNotifications.add(alarmNotificationsItem);
        return this;
    }

    public EnableOneClickAlarmRequestBody withAlarmNotifications(
        Consumer<List<Notification>> alarmNotificationsSetter) {
        if (this.alarmNotifications == null) {
            this.alarmNotifications = new ArrayList<>();
        }
        alarmNotificationsSetter.accept(this.alarmNotifications);
        return this;
    }

    /**
     * **参数解释**： 触发告警时，通知组/主题订阅的信息。 **约束限制**： 包含的通知信息的数量最多为10个，最少为0个。 
     * @return alarmNotifications
     */
    public List<Notification> getAlarmNotifications() {
        return alarmNotifications;
    }

    public void setAlarmNotifications(List<Notification> alarmNotifications) {
        this.alarmNotifications = alarmNotifications;
    }

    public EnableOneClickAlarmRequestBody withOkNotifications(List<Notification> okNotifications) {
        this.okNotifications = okNotifications;
        return this;
    }

    public EnableOneClickAlarmRequestBody addOkNotificationsItem(Notification okNotificationsItem) {
        if (this.okNotifications == null) {
            this.okNotifications = new ArrayList<>();
        }
        this.okNotifications.add(okNotificationsItem);
        return this;
    }

    public EnableOneClickAlarmRequestBody withOkNotifications(Consumer<List<Notification>> okNotificationsSetter) {
        if (this.okNotifications == null) {
            this.okNotifications = new ArrayList<>();
        }
        okNotificationsSetter.accept(this.okNotifications);
        return this;
    }

    /**
     * **参数解释**： 告警恢复时，通知组/主题订阅的信息。 **约束限制**： 包含的通知信息的数量最多为10个，最少为0个。 
     * @return okNotifications
     */
    public List<Notification> getOkNotifications() {
        return okNotifications;
    }

    public void setOkNotifications(List<Notification> okNotifications) {
        this.okNotifications = okNotifications;
    }

    public EnableOneClickAlarmRequestBody withNotificationBeginTime(String notificationBeginTime) {
        this.notificationBeginTime = notificationBeginTime;
        return this;
    }

    /**
     * **参数解释**： 告警通知开启时间。    **约束限制**： 不涉及。 **取值范围**： 只能包含数字、“:”，长度为[1,64]个字符。           **默认取值**： 不涉及。 
     * @return notificationBeginTime
     */
    public String getNotificationBeginTime() {
        return notificationBeginTime;
    }

    public void setNotificationBeginTime(String notificationBeginTime) {
        this.notificationBeginTime = notificationBeginTime;
    }

    public EnableOneClickAlarmRequestBody withNotificationEndTime(String notificationEndTime) {
        this.notificationEndTime = notificationEndTime;
        return this;
    }

    /**
     * **参数解释**： 告警通知关闭时间。    **约束限制**： 不涉及。 **取值范围**： 只能包含数字、“:”，长度为[1,64]个字符。           **默认取值**： 不涉及。 
     * @return notificationEndTime
     */
    public String getNotificationEndTime() {
        return notificationEndTime;
    }

    public void setNotificationEndTime(String notificationEndTime) {
        this.notificationEndTime = notificationEndTime;
    }

    public EnableOneClickAlarmRequestBody withEffectiveTimezone(String effectiveTimezone) {
        this.effectiveTimezone = effectiveTimezone;
        return this;
    }

    /**
     * **参数解释**： 时区，形如：\"GMT-08:00\"、\"GMT+08:00\"、\"GMT+0:00\"。    **约束限制**： 不涉及。 **取值范围**： 长度为[1,16]个字符。           **默认取值**： 不涉及。 
     * @return effectiveTimezone
     */
    public String getEffectiveTimezone() {
        return effectiveTimezone;
    }

    public void setEffectiveTimezone(String effectiveTimezone) {
        this.effectiveTimezone = effectiveTimezone;
    }

    public EnableOneClickAlarmRequestBody withNotificationManner(NotificationMannerEnum notificationManner) {
        this.notificationManner = notificationManner;
        return this;
    }

    /**
     * NOTIFICATION_GROUP(通知组)/TOPIC_SUBSCRIPTION(主题订阅)/NOTIFICATION_POLICY(通知策略)
     * @return notificationManner
     */
    public NotificationMannerEnum getNotificationManner() {
        return notificationManner;
    }

    public void setNotificationManner(NotificationMannerEnum notificationManner) {
        this.notificationManner = notificationManner;
    }

    public EnableOneClickAlarmRequestBody withNotificationPolicyIds(List<String> notificationPolicyIds) {
        this.notificationPolicyIds = notificationPolicyIds;
        return this;
    }

    public EnableOneClickAlarmRequestBody addNotificationPolicyIdsItem(String notificationPolicyIdsItem) {
        if (this.notificationPolicyIds == null) {
            this.notificationPolicyIds = new ArrayList<>();
        }
        this.notificationPolicyIds.add(notificationPolicyIdsItem);
        return this;
    }

    public EnableOneClickAlarmRequestBody withNotificationPolicyIds(
        Consumer<List<String>> notificationPolicyIdsSetter) {
        if (this.notificationPolicyIds == null) {
            this.notificationPolicyIds = new ArrayList<>();
        }
        notificationPolicyIdsSetter.accept(this.notificationPolicyIds);
        return this;
    }

    /**
     * 关联的通知策略ID列表
     * @return notificationPolicyIds
     */
    public List<String> getNotificationPolicyIds() {
        return notificationPolicyIds;
    }

    public void setNotificationPolicyIds(List<String> notificationPolicyIds) {
        this.notificationPolicyIds = notificationPolicyIds;
    }

    public EnableOneClickAlarmRequestBody withIsReset(Boolean isReset) {
        this.isReset = isReset;
        return this;
    }

    /**
     * 是否以默认一键告警规则重置创建
     * @return isReset
     */
    public Boolean getIsReset() {
        return isReset;
    }

    public void setIsReset(Boolean isReset) {
        this.isReset = isReset;
    }

    public EnableOneClickAlarmRequestBody withEnabledAlarmIds(List<String> enabledAlarmIds) {
        this.enabledAlarmIds = enabledAlarmIds;
        return this;
    }

    public EnableOneClickAlarmRequestBody addEnabledAlarmIdsItem(String enabledAlarmIdsItem) {
        if (this.enabledAlarmIds == null) {
            this.enabledAlarmIds = new ArrayList<>();
        }
        this.enabledAlarmIds.add(enabledAlarmIdsItem);
        return this;
    }

    public EnableOneClickAlarmRequestBody withEnabledAlarmIds(Consumer<List<String>> enabledAlarmIdsSetter) {
        if (this.enabledAlarmIds == null) {
            this.enabledAlarmIds = new ArrayList<>();
        }
        enabledAlarmIdsSetter.accept(this.enabledAlarmIds);
        return this;
    }

    /**
     * **参数解释**: 开启一键告警时可选需要的开启的一键告警规则ID，默认为该服务下的所有一键告警规则ID。 **约束限制**: 数组元素个数[0,50] **取值范围**: 不涉及。 **默认取值**: 该服务下一键告警全部告警规则。 
     * @return enabledAlarmIds
     */
    public List<String> getEnabledAlarmIds() {
        return enabledAlarmIds;
    }

    public void setEnabledAlarmIds(List<String> enabledAlarmIds) {
        this.enabledAlarmIds = enabledAlarmIds;
    }

    public EnableOneClickAlarmRequestBody withOneClickUpdateAlarms(
        List<EnableOneClickAlarmRequestBodyOneClickUpdateAlarms> oneClickUpdateAlarms) {
        this.oneClickUpdateAlarms = oneClickUpdateAlarms;
        return this;
    }

    public EnableOneClickAlarmRequestBody addOneClickUpdateAlarmsItem(
        EnableOneClickAlarmRequestBodyOneClickUpdateAlarms oneClickUpdateAlarmsItem) {
        if (this.oneClickUpdateAlarms == null) {
            this.oneClickUpdateAlarms = new ArrayList<>();
        }
        this.oneClickUpdateAlarms.add(oneClickUpdateAlarmsItem);
        return this;
    }

    public EnableOneClickAlarmRequestBody withOneClickUpdateAlarms(
        Consumer<List<EnableOneClickAlarmRequestBodyOneClickUpdateAlarms>> oneClickUpdateAlarmsSetter) {
        if (this.oneClickUpdateAlarms == null) {
            this.oneClickUpdateAlarms = new ArrayList<>();
        }
        oneClickUpdateAlarmsSetter.accept(this.oneClickUpdateAlarms);
        return this;
    }

    /**
     * 打开一键告警需要同时修改告警策略及通知(当前仅支持通知策略修改)时传递的参数
     * @return oneClickUpdateAlarms
     */
    public List<EnableOneClickAlarmRequestBodyOneClickUpdateAlarms> getOneClickUpdateAlarms() {
        return oneClickUpdateAlarms;
    }

    public void setOneClickUpdateAlarms(List<EnableOneClickAlarmRequestBodyOneClickUpdateAlarms> oneClickUpdateAlarms) {
        this.oneClickUpdateAlarms = oneClickUpdateAlarms;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnableOneClickAlarmRequestBody that = (EnableOneClickAlarmRequestBody) obj;
        return Objects.equals(this.oneClickAlarmId, that.oneClickAlarmId)
            && Objects.equals(this.dimensionNames, that.dimensionNames)
            && Objects.equals(this.notificationEnabled, that.notificationEnabled)
            && Objects.equals(this.alarmNotifications, that.alarmNotifications)
            && Objects.equals(this.okNotifications, that.okNotifications)
            && Objects.equals(this.notificationBeginTime, that.notificationBeginTime)
            && Objects.equals(this.notificationEndTime, that.notificationEndTime)
            && Objects.equals(this.effectiveTimezone, that.effectiveTimezone)
            && Objects.equals(this.notificationManner, that.notificationManner)
            && Objects.equals(this.notificationPolicyIds, that.notificationPolicyIds)
            && Objects.equals(this.isReset, that.isReset) && Objects.equals(this.enabledAlarmIds, that.enabledAlarmIds)
            && Objects.equals(this.oneClickUpdateAlarms, that.oneClickUpdateAlarms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oneClickAlarmId,
            dimensionNames,
            notificationEnabled,
            alarmNotifications,
            okNotifications,
            notificationBeginTime,
            notificationEndTime,
            effectiveTimezone,
            notificationManner,
            notificationPolicyIds,
            isReset,
            enabledAlarmIds,
            oneClickUpdateAlarms);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnableOneClickAlarmRequestBody {\n");
        sb.append("    oneClickAlarmId: ").append(toIndentedString(oneClickAlarmId)).append("\n");
        sb.append("    dimensionNames: ").append(toIndentedString(dimensionNames)).append("\n");
        sb.append("    notificationEnabled: ").append(toIndentedString(notificationEnabled)).append("\n");
        sb.append("    alarmNotifications: ").append(toIndentedString(alarmNotifications)).append("\n");
        sb.append("    okNotifications: ").append(toIndentedString(okNotifications)).append("\n");
        sb.append("    notificationBeginTime: ").append(toIndentedString(notificationBeginTime)).append("\n");
        sb.append("    notificationEndTime: ").append(toIndentedString(notificationEndTime)).append("\n");
        sb.append("    effectiveTimezone: ").append(toIndentedString(effectiveTimezone)).append("\n");
        sb.append("    notificationManner: ").append(toIndentedString(notificationManner)).append("\n");
        sb.append("    notificationPolicyIds: ").append(toIndentedString(notificationPolicyIds)).append("\n");
        sb.append("    isReset: ").append(toIndentedString(isReset)).append("\n");
        sb.append("    enabledAlarmIds: ").append(toIndentedString(enabledAlarmIds)).append("\n");
        sb.append("    oneClickUpdateAlarms: ").append(toIndentedString(oneClickUpdateAlarms)).append("\n");
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
