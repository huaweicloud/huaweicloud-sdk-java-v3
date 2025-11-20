package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

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
public class ListResourceConfigurationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_configurations")

    private List<ResourceConfiguration> resourceConfigurations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListResourceConfigurationsResponse withResourceConfigurations(
        List<ResourceConfiguration> resourceConfigurations) {
        this.resourceConfigurations = resourceConfigurations;
        return this;
    }

    public ListResourceConfigurationsResponse addResourceConfigurationsItem(
        ResourceConfiguration resourceConfigurationsItem) {
        if (this.resourceConfigurations == null) {
            this.resourceConfigurations = new ArrayList<>();
        }
        this.resourceConfigurations.add(resourceConfigurationsItem);
        return this;
    }

    public ListResourceConfigurationsResponse withResourceConfigurations(
        Consumer<List<ResourceConfiguration>> resourceConfigurationsSetter) {
        if (this.resourceConfigurations == null) {
            this.resourceConfigurations = new ArrayList<>();
        }
        resourceConfigurationsSetter.accept(this.resourceConfigurations);
        return this;
    }

    /**
     * 提权访问中的资源配置。
     * @return resourceConfigurations
     */
    public List<ResourceConfiguration> getResourceConfigurations() {
        return resourceConfigurations;
    }

    public void setResourceConfigurations(List<ResourceConfiguration> resourceConfigurations) {
        this.resourceConfigurations = resourceConfigurations;
    }

    public ListResourceConfigurationsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListResourceConfigurationsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListResourceConfigurationsResponse that = (ListResourceConfigurationsResponse) obj;
        return Objects.equals(this.resourceConfigurations, that.resourceConfigurations)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceConfigurations, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceConfigurationsResponse {\n");
        sb.append("    resourceConfigurations: ").append(toIndentedString(resourceConfigurations)).append("\n");
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
