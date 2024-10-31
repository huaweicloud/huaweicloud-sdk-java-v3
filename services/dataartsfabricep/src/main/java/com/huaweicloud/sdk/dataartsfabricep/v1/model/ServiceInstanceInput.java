package com.huaweicloud.sdk.dataartsfabricep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 部署Service的请求体
 */
public class ServiceInstanceInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private SourceRef source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_id")

    private String endpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private ServiceInstanceConfig config;

    public ServiceInstanceInput withSource(SourceRef source) {
        this.source = source;
        return this;
    }

    public ServiceInstanceInput withSource(Consumer<SourceRef> sourceSetter) {
        if (this.source == null) {
            this.source = new SourceRef();
            sourceSetter.accept(this.source);
        }

        return this;
    }

    /**
     * Get source
     * @return source
     */
    public SourceRef getSource() {
        return source;
    }

    public void setSource(SourceRef source) {
        this.source = source;
    }

    public ServiceInstanceInput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 一个Service Instance的名称，只能包含中文、字母、数字、下划线、中划线、点、空格
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServiceInstanceInput withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ServiceInstanceInput withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * endpoint空间id
     * @return endpointId
     */
    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    public ServiceInstanceInput withConfig(ServiceInstanceConfig config) {
        this.config = config;
        return this;
    }

    public ServiceInstanceInput withConfig(Consumer<ServiceInstanceConfig> configSetter) {
        if (this.config == null) {
            this.config = new ServiceInstanceConfig();
            configSetter.accept(this.config);
        }

        return this;
    }

    /**
     * Get config
     * @return config
     */
    public ServiceInstanceConfig getConfig() {
        return config;
    }

    public void setConfig(ServiceInstanceConfig config) {
        this.config = config;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServiceInstanceInput that = (ServiceInstanceInput) obj;
        return Objects.equals(this.source, that.source) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.endpointId, that.endpointId)
            && Objects.equals(this.config, that.config);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, name, description, endpointId, config);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceInstanceInput {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
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
