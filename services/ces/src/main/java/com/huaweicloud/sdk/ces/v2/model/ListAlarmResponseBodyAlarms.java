package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** ListAlarmResponseBodyAlarms */
public class ListAlarmResponseBodyAlarms {

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

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_enabled")

    private Boolean actionEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_actions")

    private List<SMNAction> alarmActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ok_actions")

    private List<SMNAction> okActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insufficientdata_actions")

    private List<SMNAction> insufficientdataActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_begin_time")

    private String actionBeginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_end_time")

    private String actionEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "one_click_alarm_flag")

    private Integer oneClickAlarmFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public ListAlarmResponseBodyAlarms withAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /** 告警规则ID
     * 
     * @return alarmId */
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public ListAlarmResponseBodyAlarms withName(String name) {
        this.name = name;
        return this;
    }

    /** 告警规则名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListAlarmResponseBodyAlarms withDescription(String description) {
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

    public ListAlarmResponseBodyAlarms withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /** 告警规则的命名空间
     * 
     * @return namespace */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListAlarmResponseBodyAlarms withPolicies(List<Policy> policies) {
        this.policies = policies;
        return this;
    }

    public ListAlarmResponseBodyAlarms addPoliciesItem(Policy policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public ListAlarmResponseBodyAlarms withPolicies(Consumer<List<Policy>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /** 策略
     * 
     * @return policies */
    public List<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }

    public ListAlarmResponseBodyAlarms withResources(List<ResourcesInListResp> resources) {
        this.resources = resources;
        return this;
    }

    public ListAlarmResponseBodyAlarms addResourcesItem(ResourcesInListResp resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ListAlarmResponseBodyAlarms withResources(Consumer<List<ResourcesInListResp>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /** 资源
     * 
     * @return resources */
    public List<ResourcesInListResp> getResources() {
        return resources;
    }

    public void setResources(List<ResourcesInListResp> resources) {
        this.resources = resources;
    }

    public ListAlarmResponseBodyAlarms withType(String type) {
        this.type = type;
        return this;
    }

    /** 告警类型
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListAlarmResponseBodyAlarms withEnabled(Boolean enabled) {
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

    public ListAlarmResponseBodyAlarms withActionEnabled(Boolean actionEnabled) {
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

    public ListAlarmResponseBodyAlarms withAlarmActions(List<SMNAction> alarmActions) {
        this.alarmActions = alarmActions;
        return this;
    }

    public ListAlarmResponseBodyAlarms addAlarmActionsItem(SMNAction alarmActionsItem) {
        if (this.alarmActions == null) {
            this.alarmActions = new ArrayList<>();
        }
        this.alarmActions.add(alarmActionsItem);
        return this;
    }

    public ListAlarmResponseBodyAlarms withAlarmActions(Consumer<List<SMNAction>> alarmActionsSetter) {
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

    public ListAlarmResponseBodyAlarms withOkActions(List<SMNAction> okActions) {
        this.okActions = okActions;
        return this;
    }

    public ListAlarmResponseBodyAlarms addOkActionsItem(SMNAction okActionsItem) {
        if (this.okActions == null) {
            this.okActions = new ArrayList<>();
        }
        this.okActions.add(okActionsItem);
        return this;
    }

    public ListAlarmResponseBodyAlarms withOkActions(Consumer<List<SMNAction>> okActionsSetter) {
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

    public ListAlarmResponseBodyAlarms withInsufficientdataActions(List<SMNAction> insufficientdataActions) {
        this.insufficientdataActions = insufficientdataActions;
        return this;
    }

    public ListAlarmResponseBodyAlarms addInsufficientdataActionsItem(SMNAction insufficientdataActionsItem) {
        if (this.insufficientdataActions == null) {
            this.insufficientdataActions = new ArrayList<>();
        }
        this.insufficientdataActions.add(insufficientdataActionsItem);
        return this;
    }

    public ListAlarmResponseBodyAlarms withInsufficientdataActions(
        Consumer<List<SMNAction>> insufficientdataActionsSetter) {
        if (this.insufficientdataActions == null) {
            this.insufficientdataActions = new ArrayList<>();
        }
        insufficientdataActionsSetter.accept(this.insufficientdataActions);
        return this;
    }

    /** 数据不足通知
     * 
     * @return insufficientdataActions */
    public List<SMNAction> getInsufficientdataActions() {
        return insufficientdataActions;
    }

    public void setInsufficientdataActions(List<SMNAction> insufficientdataActions) {
        this.insufficientdataActions = insufficientdataActions;
    }

    public ListAlarmResponseBodyAlarms withActionBeginTime(String actionBeginTime) {
        this.actionBeginTime = actionBeginTime;
        return this;
    }

    /** 告警通知起始时间
     * 
     * @return actionBeginTime */
    public String getActionBeginTime() {
        return actionBeginTime;
    }

    public void setActionBeginTime(String actionBeginTime) {
        this.actionBeginTime = actionBeginTime;
    }

    public ListAlarmResponseBodyAlarms withActionEndTime(String actionEndTime) {
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

    public ListAlarmResponseBodyAlarms withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /** 告警更新时间，参考API规范，使用UTC时间
     * 
     * @return updateTime */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ListAlarmResponseBodyAlarms withOneClickAlarmFlag(Integer oneClickAlarmFlag) {
        this.oneClickAlarmFlag = oneClickAlarmFlag;
        return this;
    }

    /** 一键告警标志
     * 
     * @return oneClickAlarmFlag */
    public Integer getOneClickAlarmFlag() {
        return oneClickAlarmFlag;
    }

    public void setOneClickAlarmFlag(Integer oneClickAlarmFlag) {
        this.oneClickAlarmFlag = oneClickAlarmFlag;
    }

    public ListAlarmResponseBodyAlarms withEnterpriseProjectId(String enterpriseProjectId) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAlarmResponseBodyAlarms listAlarmResponseBodyAlarms = (ListAlarmResponseBodyAlarms) o;
        return Objects.equals(this.alarmId, listAlarmResponseBodyAlarms.alarmId)
            && Objects.equals(this.name, listAlarmResponseBodyAlarms.name)
            && Objects.equals(this.description, listAlarmResponseBodyAlarms.description)
            && Objects.equals(this.namespace, listAlarmResponseBodyAlarms.namespace)
            && Objects.equals(this.policies, listAlarmResponseBodyAlarms.policies)
            && Objects.equals(this.resources, listAlarmResponseBodyAlarms.resources)
            && Objects.equals(this.type, listAlarmResponseBodyAlarms.type)
            && Objects.equals(this.enabled, listAlarmResponseBodyAlarms.enabled)
            && Objects.equals(this.actionEnabled, listAlarmResponseBodyAlarms.actionEnabled)
            && Objects.equals(this.alarmActions, listAlarmResponseBodyAlarms.alarmActions)
            && Objects.equals(this.okActions, listAlarmResponseBodyAlarms.okActions)
            && Objects.equals(this.insufficientdataActions, listAlarmResponseBodyAlarms.insufficientdataActions)
            && Objects.equals(this.actionBeginTime, listAlarmResponseBodyAlarms.actionBeginTime)
            && Objects.equals(this.actionEndTime, listAlarmResponseBodyAlarms.actionEndTime)
            && Objects.equals(this.updateTime, listAlarmResponseBodyAlarms.updateTime)
            && Objects.equals(this.oneClickAlarmFlag, listAlarmResponseBodyAlarms.oneClickAlarmFlag)
            && Objects.equals(this.enterpriseProjectId, listAlarmResponseBodyAlarms.enterpriseProjectId);
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
            actionEnabled,
            alarmActions,
            okActions,
            insufficientdataActions,
            actionBeginTime,
            actionEndTime,
            updateTime,
            oneClickAlarmFlag,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmResponseBodyAlarms {\n");
        sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    actionEnabled: ").append(toIndentedString(actionEnabled)).append("\n");
        sb.append("    alarmActions: ").append(toIndentedString(alarmActions)).append("\n");
        sb.append("    okActions: ").append(toIndentedString(okActions)).append("\n");
        sb.append("    insufficientdataActions: ").append(toIndentedString(insufficientdataActions)).append("\n");
        sb.append("    actionBeginTime: ").append(toIndentedString(actionBeginTime)).append("\n");
        sb.append("    actionEndTime: ").append(toIndentedString(actionEndTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    oneClickAlarmFlag: ").append(toIndentedString(oneClickAlarmFlag)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
