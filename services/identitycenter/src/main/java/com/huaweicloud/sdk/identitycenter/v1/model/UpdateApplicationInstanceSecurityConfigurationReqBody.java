package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateApplicationInstanceSecurityConfiguration的请求体
 */
public class UpdateApplicationInstanceSecurityConfigurationReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_config")

    private SecurityConfigDto securityConfig;

    public UpdateApplicationInstanceSecurityConfigurationReqBody withSecurityConfig(SecurityConfigDto securityConfig) {
        this.securityConfig = securityConfig;
        return this;
    }

    public UpdateApplicationInstanceSecurityConfigurationReqBody withSecurityConfig(
        Consumer<SecurityConfigDto> securityConfigSetter) {
        if (this.securityConfig == null) {
            this.securityConfig = new SecurityConfigDto();
            securityConfigSetter.accept(this.securityConfig);
        }

        return this;
    }

    /**
     * Get securityConfig
     * @return securityConfig
     */
    public SecurityConfigDto getSecurityConfig() {
        return securityConfig;
    }

    public void setSecurityConfig(SecurityConfigDto securityConfig) {
        this.securityConfig = securityConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateApplicationInstanceSecurityConfigurationReqBody that =
            (UpdateApplicationInstanceSecurityConfigurationReqBody) obj;
        return Objects.equals(this.securityConfig, that.securityConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateApplicationInstanceSecurityConfigurationReqBody {\n");
        sb.append("    securityConfig: ").append(toIndentedString(securityConfig)).append("\n");
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
