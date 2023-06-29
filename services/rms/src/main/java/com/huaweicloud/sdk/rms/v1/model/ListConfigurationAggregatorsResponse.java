package com.huaweicloud.sdk.rms.v1.model;

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
public class ListConfigurationAggregatorsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration_aggregators")

    private List<ConfigurationAggregatorResp> configurationAggregators = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListConfigurationAggregatorsResponse withConfigurationAggregators(
        List<ConfigurationAggregatorResp> configurationAggregators) {
        this.configurationAggregators = configurationAggregators;
        return this;
    }

    public ListConfigurationAggregatorsResponse addConfigurationAggregatorsItem(
        ConfigurationAggregatorResp configurationAggregatorsItem) {
        if (this.configurationAggregators == null) {
            this.configurationAggregators = new ArrayList<>();
        }
        this.configurationAggregators.add(configurationAggregatorsItem);
        return this;
    }

    public ListConfigurationAggregatorsResponse withConfigurationAggregators(
        Consumer<List<ConfigurationAggregatorResp>> configurationAggregatorsSetter) {
        if (this.configurationAggregators == null) {
            this.configurationAggregators = new ArrayList<>();
        }
        configurationAggregatorsSetter.accept(this.configurationAggregators);
        return this;
    }

    /**
     * 资源聚合器列表。
     * @return configurationAggregators
     */
    public List<ConfigurationAggregatorResp> getConfigurationAggregators() {
        return configurationAggregators;
    }

    public void setConfigurationAggregators(List<ConfigurationAggregatorResp> configurationAggregators) {
        this.configurationAggregators = configurationAggregators;
    }

    public ListConfigurationAggregatorsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListConfigurationAggregatorsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListConfigurationAggregatorsResponse that = (ListConfigurationAggregatorsResponse) obj;
        return Objects.equals(this.configurationAggregators, that.configurationAggregators)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configurationAggregators, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConfigurationAggregatorsResponse {\n");
        sb.append("    configurationAggregators: ").append(toIndentedString(configurationAggregators)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
