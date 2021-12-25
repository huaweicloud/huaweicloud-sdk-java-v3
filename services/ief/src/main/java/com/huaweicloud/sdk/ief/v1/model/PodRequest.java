package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 应用部署模板 */
public class PodRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private PodConfigs configs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affinity")

    private Affinity affinity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "init_containers")

    private List<ContainerDef> initContainers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "containers")

    private List<ContainerDef> containers = null;

    public PodRequest withConfigs(PodConfigs configs) {
        this.configs = configs;
        return this;
    }

    public PodRequest withConfigs(Consumer<PodConfigs> configsSetter) {
        if (this.configs == null) {
            this.configs = new PodConfigs();
            configsSetter.accept(this.configs);
        }

        return this;
    }

    /** Get configs
     * 
     * @return configs */
    public PodConfigs getConfigs() {
        return configs;
    }

    public void setConfigs(PodConfigs configs) {
        this.configs = configs;
    }

    public PodRequest withAffinity(Affinity affinity) {
        this.affinity = affinity;
        return this;
    }

    public PodRequest withAffinity(Consumer<Affinity> affinitySetter) {
        if (this.affinity == null) {
            this.affinity = new Affinity();
            affinitySetter.accept(this.affinity);
        }

        return this;
    }

    /** Get affinity
     * 
     * @return affinity */
    public Affinity getAffinity() {
        return affinity;
    }

    public void setAffinity(Affinity affinity) {
        this.affinity = affinity;
    }

    public PodRequest withInitContainers(List<ContainerDef> initContainers) {
        this.initContainers = initContainers;
        return this;
    }

    public PodRequest addInitContainersItem(ContainerDef initContainersItem) {
        if (this.initContainers == null) {
            this.initContainers = new ArrayList<>();
        }
        this.initContainers.add(initContainersItem);
        return this;
    }

    public PodRequest withInitContainers(Consumer<List<ContainerDef>> initContainersSetter) {
        if (this.initContainers == null) {
            this.initContainers = new ArrayList<>();
        }
        initContainersSetter.accept(this.initContainers);
        return this;
    }

    /** 应用部署init业务容器
     * 
     * @return initContainers */
    public List<ContainerDef> getInitContainers() {
        return initContainers;
    }

    public void setInitContainers(List<ContainerDef> initContainers) {
        this.initContainers = initContainers;
    }

    public PodRequest withContainers(List<ContainerDef> containers) {
        this.containers = containers;
        return this;
    }

    public PodRequest addContainersItem(ContainerDef containersItem) {
        if (this.containers == null) {
            this.containers = new ArrayList<>();
        }
        this.containers.add(containersItem);
        return this;
    }

    public PodRequest withContainers(Consumer<List<ContainerDef>> containersSetter) {
        if (this.containers == null) {
            this.containers = new ArrayList<>();
        }
        containersSetter.accept(this.containers);
        return this;
    }

    /** 应用部署业务容器
     * 
     * @return containers */
    public List<ContainerDef> getContainers() {
        return containers;
    }

    public void setContainers(List<ContainerDef> containers) {
        this.containers = containers;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PodRequest podRequest = (PodRequest) o;
        return Objects.equals(this.configs, podRequest.configs) && Objects.equals(this.affinity, podRequest.affinity)
            && Objects.equals(this.initContainers, podRequest.initContainers)
            && Objects.equals(this.containers, podRequest.containers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configs, affinity, initContainers, containers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PodRequest {\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
        sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
        sb.append("    initContainers: ").append(toIndentedString(initContainers)).append("\n");
        sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
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
