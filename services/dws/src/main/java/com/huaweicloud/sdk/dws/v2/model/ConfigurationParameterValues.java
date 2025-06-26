package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 集群参数配置列表信息。 **取值范围**： 不涉及。
 */
public class ConfigurationParameterValues {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configurations")

    private List<ConfigurationParameterValue> configurations = null;

    public ConfigurationParameterValues withConfigurations(List<ConfigurationParameterValue> configurations) {
        this.configurations = configurations;
        return this;
    }

    public ConfigurationParameterValues addConfigurationsItem(ConfigurationParameterValue configurationsItem) {
        if (this.configurations == null) {
            this.configurations = new ArrayList<>();
        }
        this.configurations.add(configurationsItem);
        return this;
    }

    public ConfigurationParameterValues withConfigurations(
        Consumer<List<ConfigurationParameterValue>> configurationsSetter) {
        if (this.configurations == null) {
            this.configurations = new ArrayList<>();
        }
        configurationsSetter.accept(this.configurations);
        return this;
    }

    /**
     * **参数解释**： 集群参数配置列表。 **取值范围**： 不涉及。
     * @return configurations
     */
    public List<ConfigurationParameterValue> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(List<ConfigurationParameterValue> configurations) {
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
        ConfigurationParameterValues that = (ConfigurationParameterValues) obj;
        return Objects.equals(this.configurations, that.configurations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configurations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationParameterValues {\n");
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
