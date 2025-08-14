package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExternalIdpConfigurationDto
 */
public class ExternalIdpConfigurationDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idp_certificate_ids")

    private List<IdpCertificateBody> idpCertificateIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idp_id")

    private String idpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idp_saml_config")

    private IdpSAMLConfig idpSamlConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_enabled")

    private Boolean isEnabled;

    public ExternalIdpConfigurationDto withIdpCertificateIds(List<IdpCertificateBody> idpCertificateIds) {
        this.idpCertificateIds = idpCertificateIds;
        return this;
    }

    public ExternalIdpConfigurationDto addIdpCertificateIdsItem(IdpCertificateBody idpCertificateIdsItem) {
        if (this.idpCertificateIds == null) {
            this.idpCertificateIds = new ArrayList<>();
        }
        this.idpCertificateIds.add(idpCertificateIdsItem);
        return this;
    }

    public ExternalIdpConfigurationDto withIdpCertificateIds(
        Consumer<List<IdpCertificateBody>> idpCertificateIdsSetter) {
        if (this.idpCertificateIds == null) {
            this.idpCertificateIds = new ArrayList<>();
        }
        idpCertificateIdsSetter.accept(this.idpCertificateIds);
        return this;
    }

    /**
     * 身份提供商证书对应的全局唯一标识符列表
     * @return idpCertificateIds
     */
    public List<IdpCertificateBody> getIdpCertificateIds() {
        return idpCertificateIds;
    }

    public void setIdpCertificateIds(List<IdpCertificateBody> idpCertificateIds) {
        this.idpCertificateIds = idpCertificateIds;
    }

    public ExternalIdpConfigurationDto withIdpId(String idpId) {
        this.idpId = idpId;
        return this;
    }

    /**
     * 身份提供商对应的全局唯一标识符（ID）
     * @return idpId
     */
    public String getIdpId() {
        return idpId;
    }

    public void setIdpId(String idpId) {
        this.idpId = idpId;
    }

    public ExternalIdpConfigurationDto withIdpSamlConfig(IdpSAMLConfig idpSamlConfig) {
        this.idpSamlConfig = idpSamlConfig;
        return this;
    }

    public ExternalIdpConfigurationDto withIdpSamlConfig(Consumer<IdpSAMLConfig> idpSamlConfigSetter) {
        if (this.idpSamlConfig == null) {
            this.idpSamlConfig = new IdpSAMLConfig();
            idpSamlConfigSetter.accept(this.idpSamlConfig);
        }

        return this;
    }

    /**
     * Get idpSamlConfig
     * @return idpSamlConfig
     */
    public IdpSAMLConfig getIdpSamlConfig() {
        return idpSamlConfig;
    }

    public void setIdpSamlConfig(IdpSAMLConfig idpSamlConfig) {
        this.idpSamlConfig = idpSamlConfig;
    }

    public ExternalIdpConfigurationDto withIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * 是否启用身份提供商
     * @return isEnabled
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExternalIdpConfigurationDto that = (ExternalIdpConfigurationDto) obj;
        return Objects.equals(this.idpCertificateIds, that.idpCertificateIds) && Objects.equals(this.idpId, that.idpId)
            && Objects.equals(this.idpSamlConfig, that.idpSamlConfig) && Objects.equals(this.isEnabled, that.isEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idpCertificateIds, idpId, idpSamlConfig, isEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalIdpConfigurationDto {\n");
        sb.append("    idpCertificateIds: ").append(toIndentedString(idpCertificateIds)).append("\n");
        sb.append("    idpId: ").append(toIndentedString(idpId)).append("\n");
        sb.append("    idpSamlConfig: ").append(toIndentedString(idpSamlConfig)).append("\n");
        sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
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
