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
 * ListAlarmsRespAlarms
 */
public class ListAlarmsRespAlarms {

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

    private List<OneClickAlarmPolicy> policies = null;

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

    public ListAlarmsRespAlarms withAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /**
     * **参数解释**： 告警规则id。     **约束限制**： 不涉及。 **取值范围**： 以al开头，后跟22个数字或字母。           **默认取值**： 不涉及。 
     * @return alarmId
     */
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public ListAlarmsRespAlarms withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 告警名称。 **约束限制**： 不涉及。 **取值范围**： 只能包含0-9/a-z/A-Z/_/-或汉字，长度[1，128]个字符。           **默认取值**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListAlarmsRespAlarms withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 告警描述。     **约束限制**： 不涉及。 **取值范围**： 长度为[0,256]个字符。        **默认取值**： 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListAlarmsRespAlarms withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**： 查询服务的命名空间，各服务命名空间请参考“[服务命名空间](ces_03_0059.xml)”。 **约束限制**： 不涉及。 **取值范围**： 格式为service.item；service和item必须是字符串，必须以字母开头，只能包含0-9/a-z/A-Z/_。字符串的长度必须在 3 到 32个字符之间。 **默认取值**： 不涉及。 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListAlarmsRespAlarms withPolicies(List<OneClickAlarmPolicy> policies) {
        this.policies = policies;
        return this;
    }

    public ListAlarmsRespAlarms addPoliciesItem(OneClickAlarmPolicy policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public ListAlarmsRespAlarms withPolicies(Consumer<List<OneClickAlarmPolicy>> policiesSetter) {
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
    public List<OneClickAlarmPolicy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<OneClickAlarmPolicy> policies) {
        this.policies = policies;
    }

    public ListAlarmsRespAlarms withResources(List<ResourcesInListResp> resources) {
        this.resources = resources;
        return this;
    }

    public ListAlarmsRespAlarms addResourcesItem(ResourcesInListResp resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ListAlarmsRespAlarms withResources(Consumer<List<ResourcesInListResp>> resourcesSetter) {
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

    public ListAlarmsRespAlarms withType(AlarmType type) {
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

    public ListAlarmsRespAlarms withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释**： 是否开启告警规则。     **约束限制**： 不涉及。 **取值范围**： 布尔值。 - true:开启。 - false:关闭。 **默认取值**： true 
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ListAlarmsRespAlarms withNotificationEnabled(Boolean notificationEnabled) {
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

    public ListAlarmsRespAlarms withAlarmNotifications(List<Notification> alarmNotifications) {
        this.alarmNotifications = alarmNotifications;
        return this;
    }

    public ListAlarmsRespAlarms addAlarmNotificationsItem(Notification alarmNotificationsItem) {
        if (this.alarmNotifications == null) {
            this.alarmNotifications = new ArrayList<>();
        }
        this.alarmNotifications.add(alarmNotificationsItem);
        return this;
    }

    public ListAlarmsRespAlarms withAlarmNotifications(Consumer<List<Notification>> alarmNotificationsSetter) {
        if (this.alarmNotifications == null) {
            this.alarmNotifications = new ArrayList<>();
        }
        alarmNotificationsSetter.accept(this.alarmNotifications);
        return this;
    }

    /**
     * **参数解释**： 触发告警时，通知组/主题订阅的信息。 **约束限制**： 不涉及。 **取值范围**： 包含的通知信息的数量最多为10个。 **默认取值**： 不涉及。 
     * @return alarmNotifications
     */
    public List<Notification> getAlarmNotifications() {
        return alarmNotifications;
    }

    public void setAlarmNotifications(List<Notification> alarmNotifications) {
        this.alarmNotifications = alarmNotifications;
    }

    public ListAlarmsRespAlarms withOkNotifications(List<Notification> okNotifications) {
        this.okNotifications = okNotifications;
        return this;
    }

    public ListAlarmsRespAlarms addOkNotificationsItem(Notification okNotificationsItem) {
        if (this.okNotifications == null) {
            this.okNotifications = new ArrayList<>();
        }
        this.okNotifications.add(okNotificationsItem);
        return this;
    }

    public ListAlarmsRespAlarms withOkNotifications(Consumer<List<Notification>> okNotificationsSetter) {
        if (this.okNotifications == null) {
            this.okNotifications = new ArrayList<>();
        }
        okNotificationsSetter.accept(this.okNotifications);
        return this;
    }

    /**
     * **参数解释**： 告警恢复时，通知组/主题订阅的信息。 **约束限制**： 不涉及。 **取值范围**： 包含的通知信息的数量最多为10个。 **默认取值**： 不涉及。 
     * @return okNotifications
     */
    public List<Notification> getOkNotifications() {
        return okNotifications;
    }

    public void setOkNotifications(List<Notification> okNotifications) {
        this.okNotifications = okNotifications;
    }

    public ListAlarmsRespAlarms withNotificationBeginTime(String notificationBeginTime) {
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

    public ListAlarmsRespAlarms withNotificationEndTime(String notificationEndTime) {
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

    public ListAlarmsRespAlarms withEffectiveTimezone(String effectiveTimezone) {
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

    public ListAlarmsRespAlarms withNotificationManner(NotificationMannerEnum notificationManner) {
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

    public ListAlarmsRespAlarms withNotificationPolicyIds(List<String> notificationPolicyIds) {
        this.notificationPolicyIds = notificationPolicyIds;
        return this;
    }

    public ListAlarmsRespAlarms addNotificationPolicyIdsItem(String notificationPolicyIdsItem) {
        if (this.notificationPolicyIds == null) {
            this.notificationPolicyIds = new ArrayList<>();
        }
        this.notificationPolicyIds.add(notificationPolicyIdsItem);
        return this;
    }

    public ListAlarmsRespAlarms withNotificationPolicyIds(Consumer<List<String>> notificationPolicyIdsSetter) {
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
        ListAlarmsRespAlarms that = (ListAlarmsRespAlarms) obj;
        return Objects.equals(this.alarmId, that.alarmId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.policies, that.policies) && Objects.equals(this.resources, that.resources)
            && Objects.equals(this.type, that.type) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.notificationEnabled, that.notificationEnabled)
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
            effectiveTimezone,
            notificationManner,
            notificationPolicyIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmsRespAlarms {\n");
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
