package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EngineExternalEntrypoint
 */
public class EngineExternalEntrypoint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_address")

    private String externalAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_address")

    private String publicAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_endpoint")

    private Map<String, EntrypointItem> serviceEndpoint = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_service_endpoint")

    private Map<String, EntrypointItem> publicServiceEndpoint = null;

    public EngineExternalEntrypoint withExternalAddress(String externalAddress) {
        this.externalAddress = externalAddress;
        return this;
    }

    /**
     * 微服务引擎专享版暴露的IP地址。
     * @return externalAddress
     */
    public String getExternalAddress() {
        return externalAddress;
    }

    public void setExternalAddress(String externalAddress) {
        this.externalAddress = externalAddress;
    }

    public EngineExternalEntrypoint withPublicAddress(String publicAddress) {
        this.publicAddress = publicAddress;
        return this;
    }

    /**
     * 微服务引擎专享版的公网地址。
     * @return publicAddress
     */
    public String getPublicAddress() {
        return publicAddress;
    }

    public void setPublicAddress(String publicAddress) {
        this.publicAddress = publicAddress;
    }

    public EngineExternalEntrypoint withServiceEndpoint(Map<String, EntrypointItem> serviceEndpoint) {
        this.serviceEndpoint = serviceEndpoint;
        return this;
    }

    public EngineExternalEntrypoint putServiceEndpointItem(String key, EntrypointItem serviceEndpointItem) {
        if (this.serviceEndpoint == null) {
            this.serviceEndpoint = new HashMap<>();
        }
        this.serviceEndpoint.put(key, serviceEndpointItem);
        return this;
    }

    public EngineExternalEntrypoint withServiceEndpoint(Consumer<Map<String, EntrypointItem>> serviceEndpointSetter) {
        if (this.serviceEndpoint == null) {
            this.serviceEndpoint = new HashMap<>();
        }
        serviceEndpointSetter.accept(this.serviceEndpoint);
        return this;
    }

    /**
     * 微服务引擎专享版组件的访问地址。
     * @return serviceEndpoint
     */
    public Map<String, EntrypointItem> getServiceEndpoint() {
        return serviceEndpoint;
    }

    public void setServiceEndpoint(Map<String, EntrypointItem> serviceEndpoint) {
        this.serviceEndpoint = serviceEndpoint;
    }

    public EngineExternalEntrypoint withPublicServiceEndpoint(Map<String, EntrypointItem> publicServiceEndpoint) {
        this.publicServiceEndpoint = publicServiceEndpoint;
        return this;
    }

    public EngineExternalEntrypoint putPublicServiceEndpointItem(String key, EntrypointItem publicServiceEndpointItem) {
        if (this.publicServiceEndpoint == null) {
            this.publicServiceEndpoint = new HashMap<>();
        }
        this.publicServiceEndpoint.put(key, publicServiceEndpointItem);
        return this;
    }

    public EngineExternalEntrypoint withPublicServiceEndpoint(
        Consumer<Map<String, EntrypointItem>> publicServiceEndpointSetter) {
        if (this.publicServiceEndpoint == null) {
            this.publicServiceEndpoint = new HashMap<>();
        }
        publicServiceEndpointSetter.accept(this.publicServiceEndpoint);
        return this;
    }

    /**
     * 微服务引擎专享版组件的公网地址。
     * @return publicServiceEndpoint
     */
    public Map<String, EntrypointItem> getPublicServiceEndpoint() {
        return publicServiceEndpoint;
    }

    public void setPublicServiceEndpoint(Map<String, EntrypointItem> publicServiceEndpoint) {
        this.publicServiceEndpoint = publicServiceEndpoint;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EngineExternalEntrypoint engineExternalEntrypoint = (EngineExternalEntrypoint) o;
        return Objects.equals(this.externalAddress, engineExternalEntrypoint.externalAddress)
            && Objects.equals(this.publicAddress, engineExternalEntrypoint.publicAddress)
            && Objects.equals(this.serviceEndpoint, engineExternalEntrypoint.serviceEndpoint)
            && Objects.equals(this.publicServiceEndpoint, engineExternalEntrypoint.publicServiceEndpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(externalAddress, publicAddress, serviceEndpoint, publicServiceEndpoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EngineExternalEntrypoint {\n");
        sb.append("    externalAddress: ").append(toIndentedString(externalAddress)).append("\n");
        sb.append("    publicAddress: ").append(toIndentedString(publicAddress)).append("\n");
        sb.append("    serviceEndpoint: ").append(toIndentedString(serviceEndpoint)).append("\n");
        sb.append("    publicServiceEndpoint: ").append(toIndentedString(publicServiceEndpoint)).append("\n");
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
