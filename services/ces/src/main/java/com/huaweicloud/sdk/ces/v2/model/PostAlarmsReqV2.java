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
 * PostAlarmsReqV2
 */
public class PostAlarmsReqV2 {

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
    @JsonProperty(value = "resource_group_id")

    private String resourceGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<List<Dimension>> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private List<Policy> policies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private AlarmType type;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_enabled")

    private Boolean notificationEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_template_id")

    private String alarmTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    /**
     * 产品层级跨纬规则创建时需要指明为产品层级规则，resource_level取值为product即为产品层级跨纬规则，不填或者取值为dimension则为旧的规则类型
     */
    public static final class ResourceLevelEnum {

        /**
         * Enum PRODUCT for value: "product"
         */
        public static final ResourceLevelEnum PRODUCT = new ResourceLevelEnum("product");

        /**
         * Enum DIMENSION for value: "dimension"
         */
        public static final ResourceLevelEnum DIMENSION = new ResourceLevelEnum("dimension");

        private static final Map<String, ResourceLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceLevelEnum> createStaticFields() {
            Map<String, ResourceLevelEnum> map = new HashMap<>();
            map.put("product", PRODUCT);
            map.put("dimension", DIMENSION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceLevelEnum(String value) {
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
        public static ResourceLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceLevelEnum(value));
        }

        public static ResourceLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceLevelEnum) {
                return this.value.equals(((ResourceLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_level")

    private ResourceLevelEnum resourceLevel;

    public PostAlarmsReqV2 withName(String name) {
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

    public PostAlarmsReqV2 withDescription(String description) {
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

    public PostAlarmsReqV2 withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 查询服务的命名空间，各服务命名空间请参考“[服务命名名称](ces_03_0059.xml)”
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public PostAlarmsReqV2 withResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }

    /**
     * 资源分组ID，以rg开头，后跟22位由字母或数字组成的字符串
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public void setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public PostAlarmsReqV2 withResources(List<List<Dimension>> resources) {
        this.resources = resources;
        return this;
    }

    public PostAlarmsReqV2 addResourcesItem(List<Dimension> resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public PostAlarmsReqV2 withResources(Consumer<List<List<Dimension>>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 资源列表，告警规则类型为全部资源、资源分组时，资源维度值传空；告警规则类型为指定资源时，资源维度值必填，可以同时指定监控多个资源。
     * @return resources
     */
    public List<List<Dimension>> getResources() {
        return resources;
    }

    public void setResources(List<List<Dimension>> resources) {
        this.resources = resources;
    }

    public PostAlarmsReqV2 withPolicies(List<Policy> policies) {
        this.policies = policies;
        return this;
    }

    public PostAlarmsReqV2 addPoliciesItem(Policy policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public PostAlarmsReqV2 withPolicies(Consumer<List<Policy>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * 告警策略，当alarm_template_id字段为空时必填，不为空时不填
     * @return policies
     */
    public List<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }

    public PostAlarmsReqV2 withType(AlarmType type) {
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

    public PostAlarmsReqV2 withAlarmNotifications(List<Notification> alarmNotifications) {
        this.alarmNotifications = alarmNotifications;
        return this;
    }

    public PostAlarmsReqV2 addAlarmNotificationsItem(Notification alarmNotificationsItem) {
        if (this.alarmNotifications == null) {
            this.alarmNotifications = new ArrayList<>();
        }
        this.alarmNotifications.add(alarmNotificationsItem);
        return this;
    }

    public PostAlarmsReqV2 withAlarmNotifications(Consumer<List<Notification>> alarmNotificationsSetter) {
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

    public PostAlarmsReqV2 withOkNotifications(List<Notification> okNotifications) {
        this.okNotifications = okNotifications;
        return this;
    }

    public PostAlarmsReqV2 addOkNotificationsItem(Notification okNotificationsItem) {
        if (this.okNotifications == null) {
            this.okNotifications = new ArrayList<>();
        }
        this.okNotifications.add(okNotificationsItem);
        return this;
    }

    public PostAlarmsReqV2 withOkNotifications(Consumer<List<Notification>> okNotificationsSetter) {
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

    public PostAlarmsReqV2 withNotificationBeginTime(String notificationBeginTime) {
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

    public PostAlarmsReqV2 withNotificationEndTime(String notificationEndTime) {
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

    public PostAlarmsReqV2 withEffectiveTimezone(String effectiveTimezone) {
        this.effectiveTimezone = effectiveTimezone;
        return this;
    }

    /**
     * 时区，形如：\"GMT-08:00\"、\"GMT+08:00\"、\"GMT+0:00\"
     * @return effectiveTimezone
     */
    public String getEffectiveTimezone() {
        return effectiveTimezone;
    }

    public void setEffectiveTimezone(String effectiveTimezone) {
        this.effectiveTimezone = effectiveTimezone;
    }

    public PostAlarmsReqV2 withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public PostAlarmsReqV2 withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否开启告警规则。true:开启，false:关闭。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public PostAlarmsReqV2 withNotificationEnabled(Boolean notificationEnabled) {
        this.notificationEnabled = notificationEnabled;
        return this;
    }

    /**
     * 是否开启告警通知。true:开启，false:关闭。
     * @return notificationEnabled
     */
    public Boolean getNotificationEnabled() {
        return notificationEnabled;
    }

    public void setNotificationEnabled(Boolean notificationEnabled) {
        this.notificationEnabled = notificationEnabled;
    }

    public PostAlarmsReqV2 withAlarmTemplateId(String alarmTemplateId) {
        this.alarmTemplateId = alarmTemplateId;
        return this;
    }

    /**
     * 告警规则关联告警模板ID，如果传了，告警规则关联的策略会和告警模板策略联动变化
     * @return alarmTemplateId
     */
    public String getAlarmTemplateId() {
        return alarmTemplateId;
    }

    public void setAlarmTemplateId(String alarmTemplateId) {
        this.alarmTemplateId = alarmTemplateId;
    }

    public PostAlarmsReqV2 withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public PostAlarmsReqV2 addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public PostAlarmsReqV2 withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 租户标签列表
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    public PostAlarmsReqV2 withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * 产品层级跨纬规则创建时需要指明的规则产品名称，一般由\"服务命名空间,服务首层维度名称\"组成，如\"SYS.ECS,instance_id\"
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public PostAlarmsReqV2 withResourceLevel(ResourceLevelEnum resourceLevel) {
        this.resourceLevel = resourceLevel;
        return this;
    }

    /**
     * 产品层级跨纬规则创建时需要指明为产品层级规则，resource_level取值为product即为产品层级跨纬规则，不填或者取值为dimension则为旧的规则类型
     * @return resourceLevel
     */
    public ResourceLevelEnum getResourceLevel() {
        return resourceLevel;
    }

    public void setResourceLevel(ResourceLevelEnum resourceLevel) {
        this.resourceLevel = resourceLevel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PostAlarmsReqV2 that = (PostAlarmsReqV2) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.resourceGroupId, that.resourceGroupId)
            && Objects.equals(this.resources, that.resources) && Objects.equals(this.policies, that.policies)
            && Objects.equals(this.type, that.type) && Objects.equals(this.alarmNotifications, that.alarmNotifications)
            && Objects.equals(this.okNotifications, that.okNotifications)
            && Objects.equals(this.notificationBeginTime, that.notificationBeginTime)
            && Objects.equals(this.notificationEndTime, that.notificationEndTime)
            && Objects.equals(this.effectiveTimezone, that.effectiveTimezone)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.notificationEnabled, that.notificationEnabled)
            && Objects.equals(this.alarmTemplateId, that.alarmTemplateId) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.productName, that.productName)
            && Objects.equals(this.resourceLevel, that.resourceLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            namespace,
            resourceGroupId,
            resources,
            policies,
            type,
            alarmNotifications,
            okNotifications,
            notificationBeginTime,
            notificationEndTime,
            effectiveTimezone,
            enterpriseProjectId,
            enabled,
            notificationEnabled,
            alarmTemplateId,
            tags,
            productName,
            resourceLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostAlarmsReqV2 {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    resourceGroupId: ").append(toIndentedString(resourceGroupId)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    alarmNotifications: ").append(toIndentedString(alarmNotifications)).append("\n");
        sb.append("    okNotifications: ").append(toIndentedString(okNotifications)).append("\n");
        sb.append("    notificationBeginTime: ").append(toIndentedString(notificationBeginTime)).append("\n");
        sb.append("    notificationEndTime: ").append(toIndentedString(notificationEndTime)).append("\n");
        sb.append("    effectiveTimezone: ").append(toIndentedString(effectiveTimezone)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    notificationEnabled: ").append(toIndentedString(notificationEnabled)).append("\n");
        sb.append("    alarmTemplateId: ").append(toIndentedString(alarmTemplateId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    resourceLevel: ").append(toIndentedString(resourceLevel)).append("\n");
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
