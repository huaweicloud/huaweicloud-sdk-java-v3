package com.huaweicloud.sdk.css.v1.model;

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
public class ListYmlsJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configurations")

    private List<ConfigurationsRsp> configurations = null;

    public ListYmlsJobResponse withConfigurations(List<ConfigurationsRsp> configurations) {
        this.configurations = configurations;
        return this;
    }

    public ListYmlsJobResponse addConfigurationsItem(ConfigurationsRsp configurationsItem) {
        if (this.configurations == null) {
            this.configurations = new ArrayList<>();
        }
        this.configurations.add(configurationsItem);
        return this;
    }

    public ListYmlsJobResponse withConfigurations(Consumer<List<ConfigurationsRsp>> configurationsSetter) {
        if (this.configurations == null) {
            this.configurations = new ArrayList<>();
        }
        configurationsSetter.accept(this.configurations);
        return this;
    }

    /**
     * 历史修改配置列表。
     * @return configurations
     */
    public List<ConfigurationsRsp> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(List<ConfigurationsRsp> configurations) {
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
        ListYmlsJobResponse listYmlsJobResponse = (ListYmlsJobResponse) o;
        return Objects.equals(this.configurations, listYmlsJobResponse.configurations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configurations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListYmlsJobResponse {\n");
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
