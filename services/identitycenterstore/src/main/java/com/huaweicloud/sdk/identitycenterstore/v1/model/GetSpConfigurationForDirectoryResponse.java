package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class GetSpConfigurationForDirectoryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sp_oidc_config")

    private SPOIDCConfig spOidcConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sp_saml_config")

    private SPSAMLConfig spSamlConfig;

    public GetSpConfigurationForDirectoryResponse withSpOidcConfig(SPOIDCConfig spOidcConfig) {
        this.spOidcConfig = spOidcConfig;
        return this;
    }

    public GetSpConfigurationForDirectoryResponse withSpOidcConfig(Consumer<SPOIDCConfig> spOidcConfigSetter) {
        if (this.spOidcConfig == null) {
            this.spOidcConfig = new SPOIDCConfig();
            spOidcConfigSetter.accept(this.spOidcConfig);
        }

        return this;
    }

    /**
     * Get spOidcConfig
     * @return spOidcConfig
     */
    public SPOIDCConfig getSpOidcConfig() {
        return spOidcConfig;
    }

    public void setSpOidcConfig(SPOIDCConfig spOidcConfig) {
        this.spOidcConfig = spOidcConfig;
    }

    public GetSpConfigurationForDirectoryResponse withSpSamlConfig(SPSAMLConfig spSamlConfig) {
        this.spSamlConfig = spSamlConfig;
        return this;
    }

    public GetSpConfigurationForDirectoryResponse withSpSamlConfig(Consumer<SPSAMLConfig> spSamlConfigSetter) {
        if (this.spSamlConfig == null) {
            this.spSamlConfig = new SPSAMLConfig();
            spSamlConfigSetter.accept(this.spSamlConfig);
        }

        return this;
    }

    /**
     * Get spSamlConfig
     * @return spSamlConfig
     */
    public SPSAMLConfig getSpSamlConfig() {
        return spSamlConfig;
    }

    public void setSpSamlConfig(SPSAMLConfig spSamlConfig) {
        this.spSamlConfig = spSamlConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetSpConfigurationForDirectoryResponse that = (GetSpConfigurationForDirectoryResponse) obj;
        return Objects.equals(this.spOidcConfig, that.spOidcConfig)
            && Objects.equals(this.spSamlConfig, that.spSamlConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spOidcConfig, spSamlConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetSpConfigurationForDirectoryResponse {\n");
        sb.append("    spOidcConfig: ").append(toIndentedString(spOidcConfig)).append("\n");
        sb.append("    spSamlConfig: ").append(toIndentedString(spSamlConfig)).append("\n");
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
