package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 启停规则列表。
 */
public class TimerRuleDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private String envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apps")

    private List<AppInfo> apps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "components")

    private List<ComponentInfo> components = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_number")

    private Integer componentNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cron")

    private String cron;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_range")

    private String effectiveRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_policy")

    private String effectivePolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_execution_status")

    private String lastExecutionStatus;

    public TimerRuleDetails withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 定时启停规则ID，在创建定时启停规则时会忽略。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TimerRuleDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 定时启停规则名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TimerRuleDetails withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 定时启停规则的类型：stop/start。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TimerRuleDetails withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 定时启停规则状态（是否开启）：on/off。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TimerRuleDetails withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    /**
     * 环境ID。
     * @return envId
     */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public TimerRuleDetails withApps(List<AppInfo> apps) {
        this.apps = apps;
        return this;
    }

    public TimerRuleDetails addAppsItem(AppInfo appsItem) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        this.apps.add(appsItem);
        return this;
    }

    public TimerRuleDetails withApps(Consumer<List<AppInfo>> appsSetter) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        appsSetter.accept(this.apps);
        return this;
    }

    /**
     * 定时启停规则所包含的所有应用，只在生效范围为application的时候需要填写。
     * @return apps
     */
    public List<AppInfo> getApps() {
        return apps;
    }

    public void setApps(List<AppInfo> apps) {
        this.apps = apps;
    }

    public TimerRuleDetails withComponents(List<ComponentInfo> components) {
        this.components = components;
        return this;
    }

    public TimerRuleDetails addComponentsItem(ComponentInfo componentsItem) {
        if (this.components == null) {
            this.components = new ArrayList<>();
        }
        this.components.add(componentsItem);
        return this;
    }

    public TimerRuleDetails withComponents(Consumer<List<ComponentInfo>> componentsSetter) {
        if (this.components == null) {
            this.components = new ArrayList<>();
        }
        componentsSetter.accept(this.components);
        return this;
    }

    /**
     * 在定时启停规则所包含的所有组件，只在生效范围为component的时候需要填写。
     * @return components
     */
    public List<ComponentInfo> getComponents() {
        return components;
    }

    public void setComponents(List<ComponentInfo> components) {
        this.components = components;
    }

    public TimerRuleDetails withComponentNumber(Integer componentNumber) {
        this.componentNumber = componentNumber;
        return this;
    }

    /**
     * 定时启停规则包含的组件个数，在创建定时启停规则时会忽略。
     * @return componentNumber
     */
    public Integer getComponentNumber() {
        return componentNumber;
    }

    public void setComponentNumber(Integer componentNumber) {
        this.componentNumber = componentNumber;
    }

    public TimerRuleDetails withCron(String cron) {
        this.cron = cron;
        return this;
    }

    /**
     * cron表达式。
     * @return cron
     */
    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    public TimerRuleDetails withEffectiveRange(String effectiveRange) {
        this.effectiveRange = effectiveRange;
        return this;
    }

    /**
     * 定时启停规则生效范围: component/application/environment。
     * @return effectiveRange
     */
    public String getEffectiveRange() {
        return effectiveRange;
    }

    public void setEffectiveRange(String effectiveRange) {
        this.effectiveRange = effectiveRange;
    }

    public TimerRuleDetails withEffectivePolicy(String effectivePolicy) {
        this.effectivePolicy = effectivePolicy;
        return this;
    }

    /**
     * 定时启停规则的定时类别: onetime/periodic。
     * @return effectivePolicy
     */
    public String getEffectivePolicy() {
        return effectivePolicy;
    }

    public void setEffectivePolicy(String effectivePolicy) {
        this.effectivePolicy = effectivePolicy;
    }

    public TimerRuleDetails withLastExecutionStatus(String lastExecutionStatus) {
        this.lastExecutionStatus = lastExecutionStatus;
        return this;
    }

    /**
     * 上次执行的状态：abnormal/normal/executing，在创建定时启停规则时会忽略。
     * @return lastExecutionStatus
     */
    public String getLastExecutionStatus() {
        return lastExecutionStatus;
    }

    public void setLastExecutionStatus(String lastExecutionStatus) {
        this.lastExecutionStatus = lastExecutionStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimerRuleDetails that = (TimerRuleDetails) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.status, that.status)
            && Objects.equals(this.envId, that.envId) && Objects.equals(this.apps, that.apps)
            && Objects.equals(this.components, that.components)
            && Objects.equals(this.componentNumber, that.componentNumber) && Objects.equals(this.cron, that.cron)
            && Objects.equals(this.effectiveRange, that.effectiveRange)
            && Objects.equals(this.effectivePolicy, that.effectivePolicy)
            && Objects.equals(this.lastExecutionStatus, that.lastExecutionStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            type,
            status,
            envId,
            apps,
            components,
            componentNumber,
            cron,
            effectiveRange,
            effectivePolicy,
            lastExecutionStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimerRuleDetails {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
        sb.append("    components: ").append(toIndentedString(components)).append("\n");
        sb.append("    componentNumber: ").append(toIndentedString(componentNumber)).append("\n");
        sb.append("    cron: ").append(toIndentedString(cron)).append("\n");
        sb.append("    effectiveRange: ").append(toIndentedString(effectiveRange)).append("\n");
        sb.append("    effectivePolicy: ").append(toIndentedString(effectivePolicy)).append("\n");
        sb.append("    lastExecutionStatus: ").append(toIndentedString(lastExecutionStatus)).append("\n");
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
