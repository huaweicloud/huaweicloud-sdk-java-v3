package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ClusterConfigurationsSpecPackages
 */
public class ClusterConfigurationsSpecPackages {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configurations")

    private List<ConfigurationItem> configurations = null;

    public ClusterConfigurationsSpecPackages withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 组件名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClusterConfigurationsSpecPackages withConfigurations(List<ConfigurationItem> configurations) {
        this.configurations = configurations;
        return this;
    }

    public ClusterConfigurationsSpecPackages addConfigurationsItem(ConfigurationItem configurationsItem) {
        if (this.configurations == null) {
            this.configurations = new ArrayList<>();
        }
        this.configurations.add(configurationsItem);
        return this;
    }

    public ClusterConfigurationsSpecPackages withConfigurations(
        Consumer<List<ConfigurationItem>> configurationsSetter) {
        if (this.configurations == null) {
            this.configurations = new ArrayList<>();
        }
        configurationsSetter.accept(this.configurations);
        return this;
    }

    /**
     * 组件配置项详情
     * @return configurations
     */
    public List<ConfigurationItem> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(List<ConfigurationItem> configurations) {
        this.configurations = configurations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterConfigurationsSpecPackages that = (ClusterConfigurationsSpecPackages) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.configurations, that.configurations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, configurations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterConfigurationsSpecPackages {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
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
