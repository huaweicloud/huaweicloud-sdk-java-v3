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
public class ListClusterConfigurationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configurations")

    private List<ClusterConfiguration> configurations = null;

    public ListClusterConfigurationsResponse withConfigurations(List<ClusterConfiguration> configurations) {
        this.configurations = configurations;
        return this;
    }

    public ListClusterConfigurationsResponse addConfigurationsItem(ClusterConfiguration configurationsItem) {
        if (this.configurations == null) {
            this.configurations = new ArrayList<>();
        }
        this.configurations.add(configurationsItem);
        return this;
    }

    public ListClusterConfigurationsResponse withConfigurations(
        Consumer<List<ClusterConfiguration>> configurationsSetter) {
        if (this.configurations == null) {
            this.configurations = new ArrayList<>();
        }
        configurationsSetter.accept(this.configurations);
        return this;
    }

    /**
     * 集群所关联的参数组信息。
     * @return configurations
     */
    public List<ClusterConfiguration> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(List<ClusterConfiguration> configurations) {
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
        ListClusterConfigurationsResponse listClusterConfigurationsResponse = (ListClusterConfigurationsResponse) o;
        return Objects.equals(this.configurations, listClusterConfigurationsResponse.configurations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configurations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClusterConfigurationsResponse {\n");
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
