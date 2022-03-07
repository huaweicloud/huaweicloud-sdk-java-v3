package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** PostAlarmsReqV2 */
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

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_actions")

    private List<SMNAction> alarmActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ok_actions")

    private List<SMNAction> okActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_begin_time")

    private String actionBeginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_end_time")

    private String actionEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_enabled")

    private Boolean actionEnabled;

    public PostAlarmsReqV2 withName(String name) {
        this.name = name;
        return this;
    }

    /** 告警名称, 只能包含0-9/a-z/A-Z/_/-或汉字，长度1-128
     * 
     * @return name */
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

    /** 告警规则描述
     * 
     * @return description */
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

    /** 命名空间
     * 
     * @return namespace */
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

    /** 资源分组ID
     * 
     * @return resourceGroupId */
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

    /** 资源信息
     * 
     * @return resources */
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

    /** 策略信息
     * 
     * @return policies */
    public List<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }

    public PostAlarmsReqV2 withType(String type) {
        this.type = type;
        return this;
    }

    /** 告警规则类型
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PostAlarmsReqV2 withAlarmActions(List<SMNAction> alarmActions) {
        this.alarmActions = alarmActions;
        return this;
    }

    public PostAlarmsReqV2 addAlarmActionsItem(SMNAction alarmActionsItem) {
        if (this.alarmActions == null) {
            this.alarmActions = new ArrayList<>();
        }
        this.alarmActions.add(alarmActionsItem);
        return this;
    }

    public PostAlarmsReqV2 withAlarmActions(Consumer<List<SMNAction>> alarmActionsSetter) {
        if (this.alarmActions == null) {
            this.alarmActions = new ArrayList<>();
        }
        alarmActionsSetter.accept(this.alarmActions);
        return this;
    }

    /** 告警通知
     * 
     * @return alarmActions */
    public List<SMNAction> getAlarmActions() {
        return alarmActions;
    }

    public void setAlarmActions(List<SMNAction> alarmActions) {
        this.alarmActions = alarmActions;
    }

    public PostAlarmsReqV2 withOkActions(List<SMNAction> okActions) {
        this.okActions = okActions;
        return this;
    }

    public PostAlarmsReqV2 addOkActionsItem(SMNAction okActionsItem) {
        if (this.okActions == null) {
            this.okActions = new ArrayList<>();
        }
        this.okActions.add(okActionsItem);
        return this;
    }

    public PostAlarmsReqV2 withOkActions(Consumer<List<SMNAction>> okActionsSetter) {
        if (this.okActions == null) {
            this.okActions = new ArrayList<>();
        }
        okActionsSetter.accept(this.okActions);
        return this;
    }

    /** 告警恢复通知
     * 
     * @return okActions */
    public List<SMNAction> getOkActions() {
        return okActions;
    }

    public void setOkActions(List<SMNAction> okActions) {
        this.okActions = okActions;
    }

    public PostAlarmsReqV2 withActionBeginTime(String actionBeginTime) {
        this.actionBeginTime = actionBeginTime;
        return this;
    }

    /** 告警通知开始时间
     * 
     * @return actionBeginTime */
    public String getActionBeginTime() {
        return actionBeginTime;
    }

    public void setActionBeginTime(String actionBeginTime) {
        this.actionBeginTime = actionBeginTime;
    }

    public PostAlarmsReqV2 withActionEndTime(String actionEndTime) {
        this.actionEndTime = actionEndTime;
        return this;
    }

    /** 告警通知结束时间
     * 
     * @return actionEndTime */
    public String getActionEndTime() {
        return actionEndTime;
    }

    public void setActionEndTime(String actionEndTime) {
        this.actionEndTime = actionEndTime;
    }

    public PostAlarmsReqV2 withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 企业项目ID
     * 
     * @return enterpriseProjectId */
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

    /** 告警开关
     * 
     * @return enabled */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public PostAlarmsReqV2 withActionEnabled(Boolean actionEnabled) {
        this.actionEnabled = actionEnabled;
        return this;
    }

    /** 告警通知开关
     * 
     * @return actionEnabled */
    public Boolean getActionEnabled() {
        return actionEnabled;
    }

    public void setActionEnabled(Boolean actionEnabled) {
        this.actionEnabled = actionEnabled;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostAlarmsReqV2 postAlarmsReqV2 = (PostAlarmsReqV2) o;
        return Objects.equals(this.name, postAlarmsReqV2.name)
            && Objects.equals(this.description, postAlarmsReqV2.description)
            && Objects.equals(this.namespace, postAlarmsReqV2.namespace)
            && Objects.equals(this.resourceGroupId, postAlarmsReqV2.resourceGroupId)
            && Objects.equals(this.resources, postAlarmsReqV2.resources)
            && Objects.equals(this.policies, postAlarmsReqV2.policies)
            && Objects.equals(this.type, postAlarmsReqV2.type)
            && Objects.equals(this.alarmActions, postAlarmsReqV2.alarmActions)
            && Objects.equals(this.okActions, postAlarmsReqV2.okActions)
            && Objects.equals(this.actionBeginTime, postAlarmsReqV2.actionBeginTime)
            && Objects.equals(this.actionEndTime, postAlarmsReqV2.actionEndTime)
            && Objects.equals(this.enterpriseProjectId, postAlarmsReqV2.enterpriseProjectId)
            && Objects.equals(this.enabled, postAlarmsReqV2.enabled)
            && Objects.equals(this.actionEnabled, postAlarmsReqV2.actionEnabled);
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
            alarmActions,
            okActions,
            actionBeginTime,
            actionEndTime,
            enterpriseProjectId,
            enabled,
            actionEnabled);
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
        sb.append("    alarmActions: ").append(toIndentedString(alarmActions)).append("\n");
        sb.append("    okActions: ").append(toIndentedString(okActions)).append("\n");
        sb.append("    actionBeginTime: ").append(toIndentedString(actionBeginTime)).append("\n");
        sb.append("    actionEndTime: ").append(toIndentedString(actionEndTime)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    actionEnabled: ").append(toIndentedString(actionEnabled)).append("\n");
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
