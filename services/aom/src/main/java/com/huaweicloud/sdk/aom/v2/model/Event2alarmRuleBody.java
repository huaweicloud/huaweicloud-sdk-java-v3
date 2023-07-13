package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 事件类告警实体
 */
public class Event2alarmRuleBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Integer createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Integer updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_provider")

    private String resourceProvider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Event2alarmRuleBodyMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_policies")

    private List<Event2alarmRuleBodyTriggerPolicies> triggerPolicies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_type")

    private String alarmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_rule")

    private String actionRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inhibit_rule")

    private String inhibitRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_group_rule")

    private String routeGroupRule;

    public Event2alarmRuleBody withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户项目id
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Event2alarmRuleBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Event2alarmRuleBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Event2alarmRuleBody withCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * minimum: 0
     * maximum: 9999999999999
     * @return createTime
     */
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Event2alarmRuleBody withUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * minimum: 0
     * maximum: 9999999999999
     * @return updateTime
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public Event2alarmRuleBody withResourceProvider(String resourceProvider) {
        this.resourceProvider = resourceProvider;
        return this;
    }

    /**
     * 事件源
     * @return resourceProvider
     */
    public String getResourceProvider() {
        return resourceProvider;
    }

    public void setResourceProvider(String resourceProvider) {
        this.resourceProvider = resourceProvider;
    }

    public Event2alarmRuleBody withMetadata(Event2alarmRuleBodyMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public Event2alarmRuleBody withMetadata(Consumer<Event2alarmRuleBodyMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new Event2alarmRuleBodyMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public Event2alarmRuleBodyMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Event2alarmRuleBodyMetadata metadata) {
        this.metadata = metadata;
    }

    public Event2alarmRuleBody withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 规则是否启用
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Event2alarmRuleBody withTriggerPolicies(List<Event2alarmRuleBodyTriggerPolicies> triggerPolicies) {
        this.triggerPolicies = triggerPolicies;
        return this;
    }

    public Event2alarmRuleBody addTriggerPoliciesItem(Event2alarmRuleBodyTriggerPolicies triggerPoliciesItem) {
        if (this.triggerPolicies == null) {
            this.triggerPolicies = new ArrayList<>();
        }
        this.triggerPolicies.add(triggerPoliciesItem);
        return this;
    }

    public Event2alarmRuleBody withTriggerPolicies(
        Consumer<List<Event2alarmRuleBodyTriggerPolicies>> triggerPoliciesSetter) {
        if (this.triggerPolicies == null) {
            this.triggerPolicies = new ArrayList<>();
        }
        triggerPoliciesSetter.accept(this.triggerPolicies);
        return this;
    }

    /**
     * 触发策略
     * @return triggerPolicies
     */
    public List<Event2alarmRuleBodyTriggerPolicies> getTriggerPolicies() {
        return triggerPolicies;
    }

    public void setTriggerPolicies(List<Event2alarmRuleBodyTriggerPolicies> triggerPolicies) {
        this.triggerPolicies = triggerPolicies;
    }

    public Event2alarmRuleBody withAlarmType(String alarmType) {
        this.alarmType = alarmType;
        return this;
    }

    /**
     * 告警类型
     * @return alarmType
     */
    public String getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType;
    }

    public Event2alarmRuleBody withActionRule(String actionRule) {
        this.actionRule = actionRule;
        return this;
    }

    /**
     * 告警行动规则
     * @return actionRule
     */
    public String getActionRule() {
        return actionRule;
    }

    public void setActionRule(String actionRule) {
        this.actionRule = actionRule;
    }

    public Event2alarmRuleBody withInhibitRule(String inhibitRule) {
        this.inhibitRule = inhibitRule;
        return this;
    }

    /**
     * 告警抑制规则
     * @return inhibitRule
     */
    public String getInhibitRule() {
        return inhibitRule;
    }

    public void setInhibitRule(String inhibitRule) {
        this.inhibitRule = inhibitRule;
    }

    public Event2alarmRuleBody withRouteGroupRule(String routeGroupRule) {
        this.routeGroupRule = routeGroupRule;
        return this;
    }

    /**
     * 告警静默规则
     * @return routeGroupRule
     */
    public String getRouteGroupRule() {
        return routeGroupRule;
    }

    public void setRouteGroupRule(String routeGroupRule) {
        this.routeGroupRule = routeGroupRule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Event2alarmRuleBody that = (Event2alarmRuleBody) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.resourceProvider, that.resourceProvider)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.triggerPolicies, that.triggerPolicies)
            && Objects.equals(this.alarmType, that.alarmType) && Objects.equals(this.actionRule, that.actionRule)
            && Objects.equals(this.inhibitRule, that.inhibitRule)
            && Objects.equals(this.routeGroupRule, that.routeGroupRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId,
            name,
            description,
            createTime,
            updateTime,
            resourceProvider,
            metadata,
            enable,
            triggerPolicies,
            alarmType,
            actionRule,
            inhibitRule,
            routeGroupRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Event2alarmRuleBody {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    resourceProvider: ").append(toIndentedString(resourceProvider)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    triggerPolicies: ").append(toIndentedString(triggerPolicies)).append("\n");
        sb.append("    alarmType: ").append(toIndentedString(alarmType)).append("\n");
        sb.append("    actionRule: ").append(toIndentedString(actionRule)).append("\n");
        sb.append("    inhibitRule: ").append(toIndentedString(inhibitRule)).append("\n");
        sb.append("    routeGroupRule: ").append(toIndentedString(routeGroupRule)).append("\n");
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
