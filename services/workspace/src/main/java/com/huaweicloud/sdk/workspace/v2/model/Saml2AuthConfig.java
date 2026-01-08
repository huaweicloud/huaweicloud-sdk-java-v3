package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SAML2认证配置信息。
 */
public class Saml2AuthConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_provider")

    private String identityProvider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_server_address")

    private String accessServerAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unique_user_identifier")

    private String uniqueUserIdentifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idp_metadata_info")

    private IdpMetadataInfo idpMetadataInfo;

    public Saml2AuthConfig withIdentityProvider(String identityProvider) {
        this.identityProvider = identityProvider;
        return this;
    }

    /**
     * 身份提供者名称。
     * @return identityProvider
     */
    public String getIdentityProvider() {
        return identityProvider;
    }

    public void setIdentityProvider(String identityProvider) {
        this.identityProvider = identityProvider;
    }

    public Saml2AuthConfig withAccessServerAddress(String accessServerAddress) {
        this.accessServerAddress = accessServerAddress;
        return this;
    }

    /**
     * 接入服务器地址。
     * @return accessServerAddress
     */
    public String getAccessServerAddress() {
        return accessServerAddress;
    }

    public void setAccessServerAddress(String accessServerAddress) {
        this.accessServerAddress = accessServerAddress;
    }

    public Saml2AuthConfig withUniqueUserIdentifier(String uniqueUserIdentifier) {
        this.uniqueUserIdentifier = uniqueUserIdentifier;
        return this;
    }

    /**
     * 唯一用户标识符。
     * @return uniqueUserIdentifier
     */
    public String getUniqueUserIdentifier() {
        return uniqueUserIdentifier;
    }

    public void setUniqueUserIdentifier(String uniqueUserIdentifier) {
        this.uniqueUserIdentifier = uniqueUserIdentifier;
    }

    public Saml2AuthConfig withIdpMetadataInfo(IdpMetadataInfo idpMetadataInfo) {
        this.idpMetadataInfo = idpMetadataInfo;
        return this;
    }

    public Saml2AuthConfig withIdpMetadataInfo(Consumer<IdpMetadataInfo> idpMetadataInfoSetter) {
        if (this.idpMetadataInfo == null) {
            this.idpMetadataInfo = new IdpMetadataInfo();
            idpMetadataInfoSetter.accept(this.idpMetadataInfo);
        }

        return this;
    }

    /**
     * Get idpMetadataInfo
     * @return idpMetadataInfo
     */
    public IdpMetadataInfo getIdpMetadataInfo() {
        return idpMetadataInfo;
    }

    public void setIdpMetadataInfo(IdpMetadataInfo idpMetadataInfo) {
        this.idpMetadataInfo = idpMetadataInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Saml2AuthConfig that = (Saml2AuthConfig) obj;
        return Objects.equals(this.identityProvider, that.identityProvider)
            && Objects.equals(this.accessServerAddress, that.accessServerAddress)
            && Objects.equals(this.uniqueUserIdentifier, that.uniqueUserIdentifier)
            && Objects.equals(this.idpMetadataInfo, that.idpMetadataInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identityProvider, accessServerAddress, uniqueUserIdentifier, idpMetadataInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Saml2AuthConfig {\n");
        sb.append("    identityProvider: ").append(toIndentedString(identityProvider)).append("\n");
        sb.append("    accessServerAddress: ").append(toIndentedString(accessServerAddress)).append("\n");
        sb.append("    uniqueUserIdentifier: ").append(toIndentedString(uniqueUserIdentifier)).append("\n");
        sb.append("    idpMetadataInfo: ").append(toIndentedString(idpMetadataInfo)).append("\n");
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
