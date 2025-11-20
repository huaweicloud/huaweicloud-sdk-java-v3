package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateResourceConfigurationsReqBody
 */
public class CreateResourceConfigurationsReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_configurations")

    private List<ResourceConfiguration> resourceConfigurations = null;

    public CreateResourceConfigurationsReqBody withResourceConfigurations(
        List<ResourceConfiguration> resourceConfigurations) {
        this.resourceConfigurations = resourceConfigurations;
        return this;
    }

    public CreateResourceConfigurationsReqBody addResourceConfigurationsItem(
        ResourceConfiguration resourceConfigurationsItem) {
        if (this.resourceConfigurations == null) {
            this.resourceConfigurations = new ArrayList<>();
        }
        this.resourceConfigurations.add(resourceConfigurationsItem);
        return this;
    }

    public CreateResourceConfigurationsReqBody withResourceConfigurations(
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateResourceConfigurationsReqBody that = (CreateResourceConfigurationsReqBody) obj;
        return Objects.equals(this.resourceConfigurations, that.resourceConfigurations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceConfigurations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateResourceConfigurationsReqBody {\n");
        sb.append("    resourceConfigurations: ").append(toIndentedString(resourceConfigurations)).append("\n");
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
