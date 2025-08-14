package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateApplicationInstanceServiceProviderConfiguration的请求体
 */
public class UpdateApplicationInstanceServiceProviderConfigurationReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_provider_config")

    private ServiceProviderConfigDto serviceProviderConfig;

    public UpdateApplicationInstanceServiceProviderConfigurationReqBody withServiceProviderConfig(
        ServiceProviderConfigDto serviceProviderConfig) {
        this.serviceProviderConfig = serviceProviderConfig;
        return this;
    }

    public UpdateApplicationInstanceServiceProviderConfigurationReqBody withServiceProviderConfig(
        Consumer<ServiceProviderConfigDto> serviceProviderConfigSetter) {
        if (this.serviceProviderConfig == null) {
            this.serviceProviderConfig = new ServiceProviderConfigDto();
            serviceProviderConfigSetter.accept(this.serviceProviderConfig);
        }

        return this;
    }

    /**
     * Get serviceProviderConfig
     * @return serviceProviderConfig
     */
    public ServiceProviderConfigDto getServiceProviderConfig() {
        return serviceProviderConfig;
    }

    public void setServiceProviderConfig(ServiceProviderConfigDto serviceProviderConfig) {
        this.serviceProviderConfig = serviceProviderConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateApplicationInstanceServiceProviderConfigurationReqBody that =
            (UpdateApplicationInstanceServiceProviderConfigurationReqBody) obj;
        return Objects.equals(this.serviceProviderConfig, that.serviceProviderConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceProviderConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateApplicationInstanceServiceProviderConfigurationReqBody {\n");
        sb.append("    serviceProviderConfig: ").append(toIndentedString(serviceProviderConfig)).append("\n");
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
