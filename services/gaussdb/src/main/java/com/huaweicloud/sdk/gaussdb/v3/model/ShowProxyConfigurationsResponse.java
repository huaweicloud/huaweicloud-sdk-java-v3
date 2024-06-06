package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class ShowProxyConfigurationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private String totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configurations")

    private List<ProxyConfiguration> configurations = null;

    public ShowProxyConfigurationsResponse withTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 数据总数
     * @return totalCount
     */
    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public ShowProxyConfigurationsResponse withConfigurations(List<ProxyConfiguration> configurations) {
        this.configurations = configurations;
        return this;
    }

    public ShowProxyConfigurationsResponse addConfigurationsItem(ProxyConfiguration configurationsItem) {
        if (this.configurations == null) {
            this.configurations = new ArrayList<>();
        }
        this.configurations.add(configurationsItem);
        return this;
    }

    public ShowProxyConfigurationsResponse withConfigurations(Consumer<List<ProxyConfiguration>> configurationsSetter) {
        if (this.configurations == null) {
            this.configurations = new ArrayList<>();
        }
        configurationsSetter.accept(this.configurations);
        return this;
    }

    /**
     * 内核可配置的参数列表
     * @return configurations
     */
    public List<ProxyConfiguration> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(List<ProxyConfiguration> configurations) {
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
        ShowProxyConfigurationsResponse that = (ShowProxyConfigurationsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.configurations, that.configurations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, configurations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProxyConfigurationsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
