package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConfigurationContainerSpec
 */
public class ConfigurationContainerSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "containers")

    private List<ComponentContainerParameter> containers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public ConfigurationContainerSpec withContainers(List<ComponentContainerParameter> containers) {
        this.containers = containers;
        return this;
    }

    public ConfigurationContainerSpec addContainersItem(ComponentContainerParameter containersItem) {
        if (this.containers == null) {
            this.containers = new ArrayList<>();
        }
        this.containers.add(containersItem);
        return this;
    }

    public ConfigurationContainerSpec withContainers(Consumer<List<ComponentContainerParameter>> containersSetter) {
        if (this.containers == null) {
            this.containers = new ArrayList<>();
        }
        containersSetter.accept(this.containers);
        return this;
    }

    /**
     * 容器信息
     * @return containers
     */
    public List<ComponentContainerParameter> getContainers() {
        return containers;
    }

    public void setContainers(List<ComponentContainerParameter> containers) {
        this.containers = containers;
    }

    public ConfigurationContainerSpec withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 工作负载类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigurationContainerSpec that = (ConfigurationContainerSpec) obj;
        return Objects.equals(this.containers, that.containers) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(containers, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationContainerSpec {\n");
        sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
