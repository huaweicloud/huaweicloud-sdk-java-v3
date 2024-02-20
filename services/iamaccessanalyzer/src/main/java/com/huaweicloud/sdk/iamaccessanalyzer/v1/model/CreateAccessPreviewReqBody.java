package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateAccessPreviewReqBody
 */
public class CreateAccessPreviewReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configurations")

    private ModelConfiguration configurations;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_urn")

    private String resourceUrn;

    public CreateAccessPreviewReqBody withConfigurations(ModelConfiguration configurations) {
        this.configurations = configurations;
        return this;
    }

    public CreateAccessPreviewReqBody withConfigurations(Consumer<ModelConfiguration> configurationsSetter) {
        if (this.configurations == null) {
            this.configurations = new ModelConfiguration();
            configurationsSetter.accept(this.configurations);
        }

        return this;
    }

    /**
     * Get configurations
     * @return configurations
     */
    public ModelConfiguration getConfigurations() {
        return configurations;
    }

    public void setConfigurations(ModelConfiguration configurations) {
        this.configurations = configurations;
    }

    public CreateAccessPreviewReqBody withResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
        return this;
    }

    /**
     * 唯一的资源名称。
     * @return resourceUrn
     */
    public String getResourceUrn() {
        return resourceUrn;
    }

    public void setResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAccessPreviewReqBody that = (CreateAccessPreviewReqBody) obj;
        return Objects.equals(this.configurations, that.configurations)
            && Objects.equals(this.resourceUrn, that.resourceUrn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configurations, resourceUrn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAccessPreviewReqBody {\n");
        sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
        sb.append("    resourceUrn: ").append(toIndentedString(resourceUrn)).append("\n");
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
