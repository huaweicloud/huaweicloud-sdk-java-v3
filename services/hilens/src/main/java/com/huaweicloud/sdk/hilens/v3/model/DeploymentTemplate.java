package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 部署模板信息
 */
public class DeploymentTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private PodConfig configs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apps")

    private List<AppDef> apps = null;

    public DeploymentTemplate withConfigs(PodConfig configs) {
        this.configs = configs;
        return this;
    }

    public DeploymentTemplate withConfigs(Consumer<PodConfig> configsSetter) {
        if (this.configs == null) {
            this.configs = new PodConfig();
            configsSetter.accept(this.configs);
        }

        return this;
    }

    /**
     * Get configs
     * @return configs
     */
    public PodConfig getConfigs() {
        return configs;
    }

    public void setConfigs(PodConfig configs) {
        this.configs = configs;
    }

    public DeploymentTemplate withApps(List<AppDef> apps) {
        this.apps = apps;
        return this;
    }

    public DeploymentTemplate addAppsItem(AppDef appsItem) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        this.apps.add(appsItem);
        return this;
    }

    public DeploymentTemplate withApps(Consumer<List<AppDef>> appsSetter) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        appsSetter.accept(this.apps);
        return this;
    }

    /**
     * 部署应用列表
     * @return apps
     */
    public List<AppDef> getApps() {
        return apps;
    }

    public void setApps(List<AppDef> apps) {
        this.apps = apps;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeploymentTemplate deploymentTemplate = (DeploymentTemplate) o;
        return Objects.equals(this.configs, deploymentTemplate.configs)
            && Objects.equals(this.apps, deploymentTemplate.apps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configs, apps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentTemplate {\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
        sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
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
