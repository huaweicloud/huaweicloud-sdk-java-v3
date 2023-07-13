package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PodRequest
 */
public class PodRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affinity")

    private PodAffinity affinity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apps")

    private List<AppDef> apps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private PodConfig configs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "init_containers")

    private List<AppDef> initContainers = null;

    public PodRequest withAffinity(PodAffinity affinity) {
        this.affinity = affinity;
        return this;
    }

    public PodRequest withAffinity(Consumer<PodAffinity> affinitySetter) {
        if (this.affinity == null) {
            this.affinity = new PodAffinity();
            affinitySetter.accept(this.affinity);
        }

        return this;
    }

    /**
     * Get affinity
     * @return affinity
     */
    public PodAffinity getAffinity() {
        return affinity;
    }

    public void setAffinity(PodAffinity affinity) {
        this.affinity = affinity;
    }

    public PodRequest withApps(List<AppDef> apps) {
        this.apps = apps;
        return this;
    }

    public PodRequest addAppsItem(AppDef appsItem) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        this.apps.add(appsItem);
        return this;
    }

    public PodRequest withApps(Consumer<List<AppDef>> appsSetter) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        appsSetter.accept(this.apps);
        return this;
    }

    /**
     * 应用部署业务容器或RPM程序包
     * @return apps
     */
    public List<AppDef> getApps() {
        return apps;
    }

    public void setApps(List<AppDef> apps) {
        this.apps = apps;
    }

    public PodRequest withConfigs(PodConfig configs) {
        this.configs = configs;
        return this;
    }

    public PodRequest withConfigs(Consumer<PodConfig> configsSetter) {
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

    public PodRequest withInitContainers(List<AppDef> initContainers) {
        this.initContainers = initContainers;
        return this;
    }

    public PodRequest addInitContainersItem(AppDef initContainersItem) {
        if (this.initContainers == null) {
            this.initContainers = new ArrayList<>();
        }
        this.initContainers.add(initContainersItem);
        return this;
    }

    public PodRequest withInitContainers(Consumer<List<AppDef>> initContainersSetter) {
        if (this.initContainers == null) {
            this.initContainers = new ArrayList<>();
        }
        initContainersSetter.accept(this.initContainers);
        return this;
    }

    /**
     * 应用部署初始化业务容器，容器部署有效。预留，暂不支持
     * @return initContainers
     */
    public List<AppDef> getInitContainers() {
        return initContainers;
    }

    public void setInitContainers(List<AppDef> initContainers) {
        this.initContainers = initContainers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PodRequest that = (PodRequest) obj;
        return Objects.equals(this.affinity, that.affinity) && Objects.equals(this.apps, that.apps)
            && Objects.equals(this.configs, that.configs) && Objects.equals(this.initContainers, that.initContainers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(affinity, apps, configs, initContainers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PodRequest {\n");
        sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
        sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
        sb.append("    initContainers: ").append(toIndentedString(initContainers)).append("\n");
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
