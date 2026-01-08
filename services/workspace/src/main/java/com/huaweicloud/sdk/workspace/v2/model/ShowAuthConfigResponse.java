package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAuthConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private String authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_multi_domain_authenticate_enabled")

    private Boolean isMultiDomainAuthenticateEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "radius_gateway_config")

    private RadiusGatewayConfigInfo radiusGatewayConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "third_party_auth_config")

    private List<ThirdPartyAuthConfig> thirdPartyAuthConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "emergency_login_mode")

    private String emergencyLoginMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "saml2_auth_config")

    private Saml2AuthConfig saml2AuthConfig;

    public ShowAuthConfigResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 认证配置ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowAuthConfigResponse withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * 认证类型 LOCAL_PASSWORD：本地密码认证模式 KERBEROS：Windows AD认证模式 LDAP：第三方LDAP模式 CLIENT_TOKEN：金审UKEY客户端Token认证模式 OAUTH2：第三方单点登录模式
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public ShowAuthConfigResponse withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 当前状态。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public ShowAuthConfigResponse withIsMultiDomainAuthenticateEnabled(Boolean isMultiDomainAuthenticateEnabled) {
        this.isMultiDomainAuthenticateEnabled = isMultiDomainAuthenticateEnabled;
        return this;
    }

    /**
     * 当前状态。
     * @return isMultiDomainAuthenticateEnabled
     */
    public Boolean getIsMultiDomainAuthenticateEnabled() {
        return isMultiDomainAuthenticateEnabled;
    }

    public void setIsMultiDomainAuthenticateEnabled(Boolean isMultiDomainAuthenticateEnabled) {
        this.isMultiDomainAuthenticateEnabled = isMultiDomainAuthenticateEnabled;
    }

    public ShowAuthConfigResponse withRadiusGatewayConfig(RadiusGatewayConfigInfo radiusGatewayConfig) {
        this.radiusGatewayConfig = radiusGatewayConfig;
        return this;
    }

    public ShowAuthConfigResponse withRadiusGatewayConfig(Consumer<RadiusGatewayConfigInfo> radiusGatewayConfigSetter) {
        if (this.radiusGatewayConfig == null) {
            this.radiusGatewayConfig = new RadiusGatewayConfigInfo();
            radiusGatewayConfigSetter.accept(this.radiusGatewayConfig);
        }

        return this;
    }

    /**
     * Get radiusGatewayConfig
     * @return radiusGatewayConfig
     */
    public RadiusGatewayConfigInfo getRadiusGatewayConfig() {
        return radiusGatewayConfig;
    }

    public void setRadiusGatewayConfig(RadiusGatewayConfigInfo radiusGatewayConfig) {
        this.radiusGatewayConfig = radiusGatewayConfig;
    }

    public ShowAuthConfigResponse withThirdPartyAuthConfig(List<ThirdPartyAuthConfig> thirdPartyAuthConfig) {
        this.thirdPartyAuthConfig = thirdPartyAuthConfig;
        return this;
    }

    public ShowAuthConfigResponse addThirdPartyAuthConfigItem(ThirdPartyAuthConfig thirdPartyAuthConfigItem) {
        if (this.thirdPartyAuthConfig == null) {
            this.thirdPartyAuthConfig = new ArrayList<>();
        }
        this.thirdPartyAuthConfig.add(thirdPartyAuthConfigItem);
        return this;
    }

    public ShowAuthConfigResponse withThirdPartyAuthConfig(
        Consumer<List<ThirdPartyAuthConfig>> thirdPartyAuthConfigSetter) {
        if (this.thirdPartyAuthConfig == null) {
            this.thirdPartyAuthConfig = new ArrayList<>();
        }
        thirdPartyAuthConfigSetter.accept(this.thirdPartyAuthConfig);
        return this;
    }

    /**
     * 第三方认证接口配置信息。
     * @return thirdPartyAuthConfig
     */
    public List<ThirdPartyAuthConfig> getThirdPartyAuthConfig() {
        return thirdPartyAuthConfig;
    }

    public void setThirdPartyAuthConfig(List<ThirdPartyAuthConfig> thirdPartyAuthConfig) {
        this.thirdPartyAuthConfig = thirdPartyAuthConfig;
    }

    public ShowAuthConfigResponse withEmergencyLoginMode(String emergencyLoginMode) {
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

    public ShowAuthConfigResponse withSaml2AuthConfig(Saml2AuthConfig saml2AuthConfig) {
        this.saml2AuthConfig = saml2AuthConfig;
        return this;
    }

    public ShowAuthConfigResponse withSaml2AuthConfig(Consumer<Saml2AuthConfig> saml2AuthConfigSetter) {
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
        ShowAuthConfigResponse that = (ShowAuthConfigResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.authType, that.authType)
            && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.isMultiDomainAuthenticateEnabled, that.isMultiDomainAuthenticateEnabled)
            && Objects.equals(this.radiusGatewayConfig, that.radiusGatewayConfig)
            && Objects.equals(this.thirdPartyAuthConfig, that.thirdPartyAuthConfig)
            && Objects.equals(this.emergencyLoginMode, that.emergencyLoginMode)
            && Objects.equals(this.saml2AuthConfig, that.saml2AuthConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            authType,
            enable,
            isMultiDomainAuthenticateEnabled,
            radiusGatewayConfig,
            thirdPartyAuthConfig,
            emergencyLoginMode,
            saml2AuthConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAuthConfigResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    isMultiDomainAuthenticateEnabled: ")
            .append(toIndentedString(isMultiDomainAuthenticateEnabled))
            .append("\n");
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
