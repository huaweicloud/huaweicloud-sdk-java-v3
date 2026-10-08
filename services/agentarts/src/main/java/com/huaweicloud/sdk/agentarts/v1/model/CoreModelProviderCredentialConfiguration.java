package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 模型提供商的凭证信息。 
 */
public class CoreModelProviderCredentialConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_configuration")

    private CoreModelProviderCredentialProviderConfiguration providerConfiguration;

    public CoreModelProviderCredentialConfiguration withProviderConfiguration(
        CoreModelProviderCredentialProviderConfiguration providerConfiguration) {
        this.providerConfiguration = providerConfiguration;
        return this;
    }

    public CoreModelProviderCredentialConfiguration withProviderConfiguration(
        Consumer<CoreModelProviderCredentialProviderConfiguration> providerConfigurationSetter) {
        if (this.providerConfiguration == null) {
            this.providerConfiguration = new CoreModelProviderCredentialProviderConfiguration();
            providerConfigurationSetter.accept(this.providerConfiguration);
        }

        return this;
    }

    /**
     * Get providerConfiguration
     * @return providerConfiguration
     */
    public CoreModelProviderCredentialProviderConfiguration getProviderConfiguration() {
        return providerConfiguration;
    }

    public void setProviderConfiguration(CoreModelProviderCredentialProviderConfiguration providerConfiguration) {
        this.providerConfiguration = providerConfiguration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreModelProviderCredentialConfiguration that = (CoreModelProviderCredentialConfiguration) obj;
        return Objects.equals(this.providerConfiguration, that.providerConfiguration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerConfiguration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreModelProviderCredentialConfiguration {\n");
        sb.append("    providerConfiguration: ").append(toIndentedString(providerConfiguration)).append("\n");
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
