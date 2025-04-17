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
 * EnableOneClickAlarmRequestBodyOneClickUpdateAlarms
 */
public class EnableOneClickAlarmRequestBodyOneClickUpdateAlarms {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_id")

    private String alarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private List<Policy> policies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<ResourcesInListResp> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private AlarmType type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

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

    /**
     * NOTIFICATION_POLICY(通知策略)
     */
    public static final class NotificationMannerEnum {

        /**
         * Enum NOTIFICATION_POLICY for value: "NOTIFICATION_POLICY"
         */
        public static final NotificationMannerEnum NOTIFICATION_POLICY =
            new NotificationMannerEnum("NOTIFICATION_POLICY");

        private static final Map<String, NotificationMannerEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NotificationMannerEnum> createStaticFields() {
            Map<String, NotificationMannerEnum> map = new HashMap<>();
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

    public EnableOneClickAlarmRequestBodyOneClickUpdateAlarms withAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /**
     * 告警规则id，以al开头，包含22个数字或字母
     * @return alarmId
     */
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public EnableOneClickAlarmRequestBodyOneClickUpdateAlarms withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 告警名称, 只能包含0-9/a-z/A-Z/_/-或汉字，长度1-128
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnableOneClickAlarmRequestBodyOneClickUpdateAlarms withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 告警描述，长度0-256
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EnableOneClickAlarmRequestBodyOneClickUpdateAlarms withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 查询服务的命名空间，各服务命名空间请参考“[服务命名空间](ces_03_0059.xml)”
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public EnableOneClickAlarmRequestBodyOneClickUpdateAlarms withPolicies(List<Policy> policies) {
        this.policies = policies;
        return this;
    }

    public EnableOneClickAlarmRequestBodyOneClickUpdateAlarms addPoliciesItem(Policy policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public EnableOneClickAlarmRequestBodyOneClickUpdateAlarms withPolicies(Consumer<List<Policy>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * 告警策略
     * @return policies
     */
    public List<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }

    public EnableOneClickAlarmRequestBodyOneClickUpdateAlarms withResources(List<ResourcesInListResp> resources) {
        this.resources = resources;
        return this;
    }

    public EnableOneClickAlarmRequestBodyOneClickUpdateAlarms addResourcesItem(ResourcesInListResp resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public EnableOneClickAlarmRequestBodyOneClickUpdateAlarms withResources(
        Consumer<List<ResourcesInListResp>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 资源列表，关联资源需要使用查询告警规则资源接口获取
     * @return resources
     */
    public List<ResourcesInListResp> getResources() {
        return resources;
    }

    public void setResources(List<ResourcesInListResp> resources) {
        this.resources = resources;
    }

    public EnableOneClickAlarmRequestBodyOneClickUpdateAlarms withType(AlarmType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public AlarmType getType() {
        return type;
    }

    public void setType(AlarmType type) {
        this.type = type;
    }

    public EnableOneClickAlarmRequestBodyOneClickUpdateAlarms withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 告警开关
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public EnableOneClickAlarmRequestBodyOneClickUpdateAlarms withNotificationEnabled(Boolean notificationEnabled) {
        this.notificationEnabled = notificationEnabled;
        return this;
    }

    /**
     * 是否开启告警通知
     * @return notificationEnabled
     */
    public Boolean getNotificationEnabled() {
        return notificationEnabled;
    }

    public void setNotificationEnabled(Boolean notificationEnabled) {
        this.notificationEnabled = notificationEnabled;
    }

    public EnableOneClickAlarmRequestBodyOneClickUpdateAlarms withAlarmNotifications(
        List<Notification> alarmNotifications) {
        this.alarmNotifications = alarmNotifications;
        return this;
    }

    public EnableOneClickAlarmRequestBodyOneClickUpdateAlarms addAlarmNotificationsItem(
        Notification alarmNotificationsItem) {
        if (this.alarmNotifications == null) {
            this.alarmNotifications = new ArrayList<>();
        }
        this.alarmNotifications.add(alarmNotificationsItem);
        return this;
    }

    public EnableOneClickAlarmRequestBodyOneClickUpdateAlarms withAlarmNotifications(
        Consumer<List<Notification>> alarmNotificationsSetter) {
        if (this.alarmNotifications == null) {
            this.alarmNotifications = new ArrayList<>();
        }
        alarmNotificationsSetter.accept(this.alarmNotifications);
        return this;
    }

    /**
     * 告警触发的动作
     * @return alarmNotifications
     */
    public List<Notification> getAlarmNotifications() {
        return alarmNotifications;
    }

    public void setAlarmNotifications(List<Notification> alarmNotifications) {
        this.alarmNotifications = alarmNotifications;
    }

    public EnableOneClickAlarmRequestBodyOneClickUpdateAlarms withOkNotifications(List<Notification> okNotifications) {
        this.okNotifications = okNotifications;
        return this;
    }

    public EnableOneClickAlarmRequestBodyOneClickUpdateAlarms addOkNotificationsItem(Notification okNotificationsItem) {
        if (this.okNotifications == null) {
            this.okNotifications = new ArrayList<>();
        }
        this.okNotifications.add(okNotificationsItem);
        return this;
    }

    public EnableOneClickAlarmRequestBodyOneClickUpdateAlarms withOkNotifications(
        Consumer<List<Notification>> okNotificationsSetter) {
        if (this.okNotifications == null) {
            this.okNotifications = new ArrayList<>();
        }
        okNotificationsSetter.accept(this.okNotifications);
        return this;
    }

    /**
     * 告警恢复触发的动作
     * @return okNotifications
     */
    public List<Notification> getOkNotifications() {
        return okNotifications;
    }

    public void setOkNotifications(List<Notification> okNotifications) {
        this.okNotifications = okNotifications;
    }

    public EnableOneClickAlarmRequestBodyOneClickUpdateAlarms withNotificationBeginTime(String notificationBeginTime) {
        this.notificationBeginTime = notificationBeginTime;
        return this;
    }

    /**
     * 告警通知开启时间
     * @return notificationBeginTime
     */
    public String getNotificationBeginTime() {
        return notificationBeginTime;
    }

    public void setNotificationBeginTime(String notificationBeginTime) {
        this.notificationBeginTime = notificationBeginTime;
    }

    public EnableOneClickAlarmRequestBodyOneClickUpdateAlarms withNotificationEndTime(String notificationEndTime) {
        this.notificationEndTime = notificationEndTime;
        return this;
    }

    /**
     * 告警通知关闭时间
     * @return notificationEndTime
     */
    public String getNotificationEndTime() {
        return notificationEndTime;
    }

    public void setNotificationEndTime(String notificationEndTime) {
        this.notificationEndTime = notificationEndTime;
    }

    public EnableOneClickAlarmRequestBodyOneClickUpdateAlarms withNotificationManner(
        NotificationMannerEnum notificationManner) {
        this.notificationManner = notificationManner;
        return this;
    }

    /**
     * NOTIFICATION_POLICY(通知策略)
     * @return notificationManner
     */
    public NotificationMannerEnum getNotificationManner() {
        return notificationManner;
    }

    public void setNotificationManner(NotificationMannerEnum notificationManner) {
        this.notificationManner = notificationManner;
    }

    public EnableOneClickAlarmRequestBodyOneClickUpdateAlarms withNotificationPolicyIds(
        List<String> notificationPolicyIds) {
        this.notificationPolicyIds = notificationPolicyIds;
        return this;
    }

    public EnableOneClickAlarmRequestBodyOneClickUpdateAlarms addNotificationPolicyIdsItem(
        String notificationPolicyIdsItem) {
        if (this.notificationPolicyIds == null) {
            this.notificationPolicyIds = new ArrayList<>();
        }
        this.notificationPolicyIds.add(notificationPolicyIdsItem);
        return this;
    }

    public EnableOneClickAlarmRequestBodyOneClickUpdateAlarms withNotificationPolicyIds(
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnableOneClickAlarmRequestBodyOneClickUpdateAlarms that =
            (EnableOneClickAlarmRequestBodyOneClickUpdateAlarms) obj;
        return Objects.equals(this.alarmId, that.alarmId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.policies, that.policies) && Objects.equals(this.resources, that.resources)
            && Objects.equals(this.type, that.type) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.notificationEnabled, that.notificationEnabled)
            && Objects.equals(this.alarmNotifications, that.alarmNotifications)
            && Objects.equals(this.okNotifications, that.okNotifications)
            && Objects.equals(this.notificationBeginTime, that.notificationBeginTime)
            && Objects.equals(this.notificationEndTime, that.notificationEndTime)
            && Objects.equals(this.notificationManner, that.notificationManner)
            && Objects.equals(this.notificationPolicyIds, that.notificationPolicyIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmId,
            name,
            description,
            namespace,
            policies,
            resources,
            type,
            enabled,
            notificationEnabled,
            alarmNotifications,
            okNotifications,
            notificationBeginTime,
            notificationEndTime,
            notificationManner,
            notificationPolicyIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnableOneClickAlarmRequestBodyOneClickUpdateAlarms {\n");
        sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    notificationEnabled: ").append(toIndentedString(notificationEnabled)).append("\n");
        sb.append("    alarmNotifications: ").append(toIndentedString(alarmNotifications)).append("\n");
        sb.append("    okNotifications: ").append(toIndentedString(okNotifications)).append("\n");
        sb.append("    notificationBeginTime: ").append(toIndentedString(notificationBeginTime)).append("\n");
        sb.append("    notificationEndTime: ").append(toIndentedString(notificationEndTime)).append("\n");
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
