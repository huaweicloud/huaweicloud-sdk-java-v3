package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改启停规则规格信息
 */
public class UpdateTimerRuleDetails {

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
    @JsonProperty(value = "apps")

    private List<AppInfo> apps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "components")

    private List<ComponentInfo> components = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cron")

    private String cron;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_range")

    private String effectiveRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_policy")

    private String effectivePolicy;

    public UpdateTimerRuleDetails withName(String name) {
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

    public UpdateTimerRuleDetails withType(String type) {
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

    public UpdateTimerRuleDetails withStatus(String status) {
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

    public UpdateTimerRuleDetails withApps(List<AppInfo> apps) {
        this.apps = apps;
        return this;
    }

    public UpdateTimerRuleDetails addAppsItem(AppInfo appsItem) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        this.apps.add(appsItem);
        return this;
    }

    public UpdateTimerRuleDetails withApps(Consumer<List<AppInfo>> appsSetter) {
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

    public UpdateTimerRuleDetails withComponents(List<ComponentInfo> components) {
        this.components = components;
        return this;
    }

    public UpdateTimerRuleDetails addComponentsItem(ComponentInfo componentsItem) {
        if (this.components == null) {
            this.components = new ArrayList<>();
        }
        this.components.add(componentsItem);
        return this;
    }

    public UpdateTimerRuleDetails withComponents(Consumer<List<ComponentInfo>> componentsSetter) {
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

    public UpdateTimerRuleDetails withCron(String cron) {
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

    public UpdateTimerRuleDetails withEffectiveRange(String effectiveRange) {
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

    public UpdateTimerRuleDetails withEffectivePolicy(String effectivePolicy) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTimerRuleDetails that = (UpdateTimerRuleDetails) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.status, that.status) && Objects.equals(this.apps, that.apps)
            && Objects.equals(this.components, that.components) && Objects.equals(this.cron, that.cron)
            && Objects.equals(this.effectiveRange, that.effectiveRange)
            && Objects.equals(this.effectivePolicy, that.effectivePolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, status, apps, components, cron, effectiveRange, effectivePolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTimerRuleDetails {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
        sb.append("    components: ").append(toIndentedString(components)).append("\n");
        sb.append("    cron: ").append(toIndentedString(cron)).append("\n");
        sb.append("    effectiveRange: ").append(toIndentedString(effectiveRange)).append("\n");
        sb.append("    effectivePolicy: ").append(toIndentedString(effectivePolicy)).append("\n");
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
