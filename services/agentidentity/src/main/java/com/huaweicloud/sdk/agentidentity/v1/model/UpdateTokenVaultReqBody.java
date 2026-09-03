package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 请求体用于更新 TokenVault 配置。
 */
public class UpdateTokenVaultReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_engine_configuration")

    private PolicyEngineConfiguration policyEngineConfiguration;

    public UpdateTokenVaultReqBody withPolicyEngineConfiguration(PolicyEngineConfiguration policyEngineConfiguration) {
        this.policyEngineConfiguration = policyEngineConfiguration;
        return this;
    }

    public UpdateTokenVaultReqBody withPolicyEngineConfiguration(
        Consumer<PolicyEngineConfiguration> policyEngineConfigurationSetter) {
        if (this.policyEngineConfiguration == null) {
            this.policyEngineConfiguration = new PolicyEngineConfiguration();
            policyEngineConfigurationSetter.accept(this.policyEngineConfiguration);
        }

        return this;
    }

    /**
     * Get policyEngineConfiguration
     * @return policyEngineConfiguration
     */
    public PolicyEngineConfiguration getPolicyEngineConfiguration() {
        return policyEngineConfiguration;
    }

    public void setPolicyEngineConfiguration(PolicyEngineConfiguration policyEngineConfiguration) {
        this.policyEngineConfiguration = policyEngineConfiguration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTokenVaultReqBody that = (UpdateTokenVaultReqBody) obj;
        return Objects.equals(this.policyEngineConfiguration, that.policyEngineConfiguration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyEngineConfiguration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTokenVaultReqBody {\n");
        sb.append("    policyEngineConfiguration: ").append(toIndentedString(policyEngineConfiguration)).append("\n");
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
