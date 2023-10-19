package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateProxyNewConfigRequestBody
 */
public class UpdateProxyNewConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configurations")

    private List<UpdateProxyConfigurationItem> configurations = null;

    public UpdateProxyNewConfigRequestBody withConfigurations(List<UpdateProxyConfigurationItem> configurations) {
        this.configurations = configurations;
        return this;
    }

    public UpdateProxyNewConfigRequestBody addConfigurationsItem(UpdateProxyConfigurationItem configurationsItem) {
        if (this.configurations == null) {
            this.configurations = new ArrayList<>();
        }
        this.configurations.add(configurationsItem);
        return this;
    }

    public UpdateProxyNewConfigRequestBody withConfigurations(
        Consumer<List<UpdateProxyConfigurationItem>> configurationsSetter) {
        if (this.configurations == null) {
            this.configurations = new ArrayList<>();
        }
        configurationsSetter.accept(this.configurations);
        return this;
    }

    /**
     * 修改的配置信息。
     * @return configurations
     */
    public List<UpdateProxyConfigurationItem> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(List<UpdateProxyConfigurationItem> configurations) {
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
        UpdateProxyNewConfigRequestBody that = (UpdateProxyNewConfigRequestBody) obj;
        return Objects.equals(this.configurations, that.configurations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configurations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateProxyNewConfigRequestBody {\n");
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
