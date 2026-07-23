package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateCoreGatewayTargetRequestBody
 */
public class UpdateCoreGatewayTargetRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_configuration")

    private CoreGatewayTargetConfiguration targetConfiguration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credential_provider_configuration")

    private CoreGatewayCredentialProviderConfiguration credentialProviderConfiguration;

    public UpdateCoreGatewayTargetRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 更新后的目标服务名称。 **约束限制：** 同一网关内目标服务名称唯一。 **取值范围：** 长度为 1-50 个字符，匹配以字母数字开头和结尾、中间可含0到48个字母数字或短横线的字符串，符合正则条件^[a-zA-Z0-9]\\([a-zA-Z0-9-]{0,48}[a-zA-Z0-9])?$。 **默认取值：** 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateCoreGatewayTargetRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 更新后的目标服务描述。 **约束限制：** 不涉及。 **取值范围：** 长度为 0-200 个字符。 **默认取值：** 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateCoreGatewayTargetRequestBody withTargetConfiguration(
        CoreGatewayTargetConfiguration targetConfiguration) {
        this.targetConfiguration = targetConfiguration;
        return this;
    }

    public UpdateCoreGatewayTargetRequestBody withTargetConfiguration(
        Consumer<CoreGatewayTargetConfiguration> targetConfigurationSetter) {
        if (this.targetConfiguration == null) {
            this.targetConfiguration = new CoreGatewayTargetConfiguration();
            targetConfigurationSetter.accept(this.targetConfiguration);
        }

        return this;
    }

    /**
     * Get targetConfiguration
     * @return targetConfiguration
     */
    public CoreGatewayTargetConfiguration getTargetConfiguration() {
        return targetConfiguration;
    }

    public void setTargetConfiguration(CoreGatewayTargetConfiguration targetConfiguration) {
        this.targetConfiguration = targetConfiguration;
    }

    public UpdateCoreGatewayTargetRequestBody withCredentialProviderConfiguration(
        CoreGatewayCredentialProviderConfiguration credentialProviderConfiguration) {
        this.credentialProviderConfiguration = credentialProviderConfiguration;
        return this;
    }

    public UpdateCoreGatewayTargetRequestBody withCredentialProviderConfiguration(
        Consumer<CoreGatewayCredentialProviderConfiguration> credentialProviderConfigurationSetter) {
        if (this.credentialProviderConfiguration == null) {
            this.credentialProviderConfiguration = new CoreGatewayCredentialProviderConfiguration();
            credentialProviderConfigurationSetter.accept(this.credentialProviderConfiguration);
        }

        return this;
    }

    /**
     * Get credentialProviderConfiguration
     * @return credentialProviderConfiguration
     */
    public CoreGatewayCredentialProviderConfiguration getCredentialProviderConfiguration() {
        return credentialProviderConfiguration;
    }

    public void setCredentialProviderConfiguration(
        CoreGatewayCredentialProviderConfiguration credentialProviderConfiguration) {
        this.credentialProviderConfiguration = credentialProviderConfiguration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCoreGatewayTargetRequestBody that = (UpdateCoreGatewayTargetRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.targetConfiguration, that.targetConfiguration)
            && Objects.equals(this.credentialProviderConfiguration, that.credentialProviderConfiguration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, targetConfiguration, credentialProviderConfiguration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCoreGatewayTargetRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    targetConfiguration: ").append(toIndentedString(targetConfiguration)).append("\n");
        sb.append("    credentialProviderConfiguration: ")
            .append(toIndentedString(credentialProviderConfiguration))
            .append("\n");
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
