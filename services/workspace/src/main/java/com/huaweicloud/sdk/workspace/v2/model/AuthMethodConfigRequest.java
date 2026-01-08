package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 认证配置请求。
 */
public class AuthMethodConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_multi_domain_authenticate_enabled")

    private Boolean isMultiDomainAuthenticateEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private AuthTypeEnum authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "radius_gateway_config")

    private RadiusGatewayConfig radiusGatewayConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "third_party_auth_config")

    private ThirdPartyAuthConfig thirdPartyAuthConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "emergency_login_mode")

    private String emergencyLoginMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "saml2_auth_config")

    private Saml2AuthConfig saml2AuthConfig;

    public AuthMethodConfigRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 认证配置id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AuthMethodConfigRequest withIsMultiDomainAuthenticateEnabled(Boolean isMultiDomainAuthenticateEnabled) {
        this.isMultiDomainAuthenticateEnabled = isMultiDomainAuthenticateEnabled;
        return this;
    }

    /**
     * 是否支持多域。
     * @return isMultiDomainAuthenticateEnabled
     */
    public Boolean getIsMultiDomainAuthenticateEnabled() {
        return isMultiDomainAuthenticateEnabled;
    }

    public void setIsMultiDomainAuthenticateEnabled(Boolean isMultiDomainAuthenticateEnabled) {
        this.isMultiDomainAuthenticateEnabled = isMultiDomainAuthenticateEnabled;
    }

    public AuthMethodConfigRequest withAuthType(AuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }

    /**
     * Get authType
     * @return authType
     */
    public AuthTypeEnum getAuthType() {
        return authType;
    }

    public void setAuthType(AuthTypeEnum authType) {
        this.authType = authType;
    }

    public AuthMethodConfigRequest withRadiusGatewayConfig(RadiusGatewayConfig radiusGatewayConfig) {
        this.radiusGatewayConfig = radiusGatewayConfig;
        return this;
    }

    public AuthMethodConfigRequest withRadiusGatewayConfig(Consumer<RadiusGatewayConfig> radiusGatewayConfigSetter) {
        if (this.radiusGatewayConfig == null) {
            this.radiusGatewayConfig = new RadiusGatewayConfig();
            radiusGatewayConfigSetter.accept(this.radiusGatewayConfig);
        }

        return this;
    }

    /**
     * Get radiusGatewayConfig
     * @return radiusGatewayConfig
     */
    public RadiusGatewayConfig getRadiusGatewayConfig() {
        return radiusGatewayConfig;
    }

    public void setRadiusGatewayConfig(RadiusGatewayConfig radiusGatewayConfig) {
        this.radiusGatewayConfig = radiusGatewayConfig;
    }

    public AuthMethodConfigRequest withThirdPartyAuthConfig(ThirdPartyAuthConfig thirdPartyAuthConfig) {
        this.thirdPartyAuthConfig = thirdPartyAuthConfig;
        return this;
    }

    public AuthMethodConfigRequest withThirdPartyAuthConfig(Consumer<ThirdPartyAuthConfig> thirdPartyAuthConfigSetter) {
        if (this.thirdPartyAuthConfig == null) {
            this.thirdPartyAuthConfig = new ThirdPartyAuthConfig();
            thirdPartyAuthConfigSetter.accept(this.thirdPartyAuthConfig);
        }

        return this;
    }

    /**
     * Get thirdPartyAuthConfig
     * @return thirdPartyAuthConfig
     */
    public ThirdPartyAuthConfig getThirdPartyAuthConfig() {
        return thirdPartyAuthConfig;
    }

    public void setThirdPartyAuthConfig(ThirdPartyAuthConfig thirdPartyAuthConfig) {
        this.thirdPartyAuthConfig = thirdPartyAuthConfig;
    }

    public AuthMethodConfigRequest withEmergencyLoginMode(String emergencyLoginMode) {
        this.emergencyLoginMode = emergencyLoginMode;
        return this;
    }

    /**
     * 应急登录模式。
     * @return emergencyLoginMode
     */
    public String getEmergencyLoginMode() {
        return emergencyLoginMode;
    }

    public void setEmergencyLoginMode(String emergencyLoginMode) {
        this.emergencyLoginMode = emergencyLoginMode;
    }

    public AuthMethodConfigRequest withSaml2AuthConfig(Saml2AuthConfig saml2AuthConfig) {
        this.saml2AuthConfig = saml2AuthConfig;
        return this;
    }

    public AuthMethodConfigRequest withSaml2AuthConfig(Consumer<Saml2AuthConfig> saml2AuthConfigSetter) {
        if (this.saml2AuthConfig == null) {
            this.saml2AuthConfig = new Saml2AuthConfig();
            saml2AuthConfigSetter.accept(this.saml2AuthConfig);
        }

        return this;
    }

    /**
     * Get saml2AuthConfig
     * @return saml2AuthConfig
     */
    public Saml2AuthConfig getSaml2AuthConfig() {
        return saml2AuthConfig;
    }

    public void setSaml2AuthConfig(Saml2AuthConfig saml2AuthConfig) {
        this.saml2AuthConfig = saml2AuthConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthMethodConfigRequest that = (AuthMethodConfigRequest) obj;
        return Objects.equals(this.id, that.id)
            && Objects.equals(this.isMultiDomainAuthenticateEnabled, that.isMultiDomainAuthenticateEnabled)
            && Objects.equals(this.authType, that.authType)
            && Objects.equals(this.radiusGatewayConfig, that.radiusGatewayConfig)
            && Objects.equals(this.thirdPartyAuthConfig, that.thirdPartyAuthConfig)
            && Objects.equals(this.emergencyLoginMode, that.emergencyLoginMode)
            && Objects.equals(this.saml2AuthConfig, that.saml2AuthConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            isMultiDomainAuthenticateEnabled,
            authType,
            radiusGatewayConfig,
            thirdPartyAuthConfig,
            emergencyLoginMode,
            saml2AuthConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthMethodConfigRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isMultiDomainAuthenticateEnabled: ")
            .append(toIndentedString(isMultiDomainAuthenticateEnabled))
            .append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    radiusGatewayConfig: ").append(toIndentedString(radiusGatewayConfig)).append("\n");
        sb.append("    thirdPartyAuthConfig: ").append(toIndentedString(thirdPartyAuthConfig)).append("\n");
        sb.append("    emergencyLoginMode: ").append(toIndentedString(emergencyLoginMode)).append("\n");
        sb.append("    saml2AuthConfig: ").append(toIndentedString(saml2AuthConfig)).append("\n");
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
