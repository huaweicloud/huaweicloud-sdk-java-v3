package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListConfigurationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    @JacksonXmlProperty(localName = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configurations")

    @JacksonXmlProperty(localName = "configurations")

    private List<ListConfigurationsResult> configurations = null;

    public ListConfigurationsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总记录数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListConfigurationsResponse withConfigurations(List<ListConfigurationsResult> configurations) {
        this.configurations = configurations;
        return this;
    }

    public ListConfigurationsResponse addConfigurationsItem(ListConfigurationsResult configurationsItem) {
        if (this.configurations == null) {
            this.configurations = new ArrayList<>();
        }
        this.configurations.add(configurationsItem);
        return this;
    }

    public ListConfigurationsResponse withConfigurations(
        Consumer<List<ListConfigurationsResult>> configurationsSetter) {
        if (this.configurations == null) {
            this.configurations = new ArrayList<>();
        }
        configurationsSetter.accept(this.configurations);
        return this;
    }

    /**
     * 参数模板列表。
     * @return configurations
     */
    public List<ListConfigurationsResult> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(List<ListConfigurationsResult> configurations) {
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
        ListConfigurationsResponse listConfigurationsResponse = (ListConfigurationsResponse) o;
        return Objects.equals(this.totalCount, listConfigurationsResponse.totalCount)
            && Objects.equals(this.configurations, listConfigurationsResponse.configurations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, configurations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConfigurationsResponse {\n");
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
