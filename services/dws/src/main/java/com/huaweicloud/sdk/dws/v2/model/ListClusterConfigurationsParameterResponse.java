package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListClusterConfigurationsParameterResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configurations")

    private List<ConfigurationParameter> configurations = null;

    public ListClusterConfigurationsParameterResponse withConfigurations(List<ConfigurationParameter> configurations) {
        this.configurations = configurations;
        return this;
    }

    public ListClusterConfigurationsParameterResponse addConfigurationsItem(ConfigurationParameter configurationsItem) {
        if (this.configurations == null) {
            this.configurations = new ArrayList<>();
        }
        this.configurations.add(configurationsItem);
        return this;
    }

    public ListClusterConfigurationsParameterResponse withConfigurations(
        Consumer<List<ConfigurationParameter>> configurationsSetter) {
        if (this.configurations == null) {
            this.configurations = new ArrayList<>();
        }
        configurationsSetter.accept(this.configurations);
        return this;
    }

    /**
     * 集群使用的参数配置信息。
     * @return configurations
     */
    public List<ConfigurationParameter> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(List<ConfigurationParameter> configurations) {
        this.configurations = configurations;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListClusterConfigurationsParameterResponse listClusterConfigurationsParameterResponse =
            (ListClusterConfigurationsParameterResponse) o;
        return Objects.equals(this.configurations, listClusterConfigurationsParameterResponse.configurations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configurations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClusterConfigurationsParameterResponse {\n");
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
