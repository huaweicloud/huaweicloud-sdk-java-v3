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
public class ListClusterSecurityConfigurationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configurations")

    private List<SecurityConfigurationParameter> configurations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListClusterSecurityConfigurationsResponse withConfigurations(
        List<SecurityConfigurationParameter> configurations) {
        this.configurations = configurations;
        return this;
    }

    public ListClusterSecurityConfigurationsResponse addConfigurationsItem(
        SecurityConfigurationParameter configurationsItem) {
        if (this.configurations == null) {
            this.configurations = new ArrayList<>();
        }
        this.configurations.add(configurationsItem);
        return this;
    }

    public ListClusterSecurityConfigurationsResponse withConfigurations(
        Consumer<List<SecurityConfigurationParameter>> configurationsSetter) {
        if (this.configurations == null) {
            this.configurations = new ArrayList<>();
        }
        configurationsSetter.accept(this.configurations);
        return this;
    }

    /**
     * **参数解释**： 参数列表。 **取值范围**： 不涉及。
     * @return configurations
     */
    public List<SecurityConfigurationParameter> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(List<SecurityConfigurationParameter> configurations) {
        this.configurations = configurations;
    }

    public ListClusterSecurityConfigurationsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 总条数。 **取值范围**： 不涉及。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListClusterSecurityConfigurationsResponse that = (ListClusterSecurityConfigurationsResponse) obj;
        return Objects.equals(this.configurations, that.configurations) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configurations, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClusterSecurityConfigurationsResponse {\n");
        sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
