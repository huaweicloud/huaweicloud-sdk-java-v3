package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 模型ID映射配置。
 */
public class CoreGatewayTargetInferenceConfigurationModelMapping {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_prefix")

    private CoreGatewayTargetInferenceConfigurationModelMappingProviderPrefix providerPrefix;

    public CoreGatewayTargetInferenceConfigurationModelMapping withProviderPrefix(
        CoreGatewayTargetInferenceConfigurationModelMappingProviderPrefix providerPrefix) {
        this.providerPrefix = providerPrefix;
        return this;
    }

    public CoreGatewayTargetInferenceConfigurationModelMapping withProviderPrefix(
        Consumer<CoreGatewayTargetInferenceConfigurationModelMappingProviderPrefix> providerPrefixSetter) {
        if (this.providerPrefix == null) {
            this.providerPrefix = new CoreGatewayTargetInferenceConfigurationModelMappingProviderPrefix();
            providerPrefixSetter.accept(this.providerPrefix);
        }

        return this;
    }

    /**
     * Get providerPrefix
     * @return providerPrefix
     */
    public CoreGatewayTargetInferenceConfigurationModelMappingProviderPrefix getProviderPrefix() {
        return providerPrefix;
    }

    public void setProviderPrefix(CoreGatewayTargetInferenceConfigurationModelMappingProviderPrefix providerPrefix) {
        this.providerPrefix = providerPrefix;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreGatewayTargetInferenceConfigurationModelMapping that =
            (CoreGatewayTargetInferenceConfigurationModelMapping) obj;
        return Objects.equals(this.providerPrefix, that.providerPrefix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerPrefix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreGatewayTargetInferenceConfigurationModelMapping {\n");
        sb.append("    providerPrefix: ").append(toIndentedString(providerPrefix)).append("\n");
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
