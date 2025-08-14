package com.huaweicloud.sdk.identitycenterstore.v1.model;

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
public class CreateExternalIdPConfigurationForDirectoryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hws_sp_saml_config")

    private SPSAMLConfig hwsSpSamlConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idp_certificate_id")

    private String idpCertificateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idp_certificate_ids")

    private List<String> idpCertificateIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idp_id")

    private String idpId;

    public CreateExternalIdPConfigurationForDirectoryResponse withHwsSpSamlConfig(SPSAMLConfig hwsSpSamlConfig) {
        this.hwsSpSamlConfig = hwsSpSamlConfig;
        return this;
    }

    public CreateExternalIdPConfigurationForDirectoryResponse withHwsSpSamlConfig(
        Consumer<SPSAMLConfig> hwsSpSamlConfigSetter) {
        if (this.hwsSpSamlConfig == null) {
            this.hwsSpSamlConfig = new SPSAMLConfig();
            hwsSpSamlConfigSetter.accept(this.hwsSpSamlConfig);
        }

        return this;
    }

    /**
     * Get hwsSpSamlConfig
     * @return hwsSpSamlConfig
     */
    public SPSAMLConfig getHwsSpSamlConfig() {
        return hwsSpSamlConfig;
    }

    public void setHwsSpSamlConfig(SPSAMLConfig hwsSpSamlConfig) {
        this.hwsSpSamlConfig = hwsSpSamlConfig;
    }

    public CreateExternalIdPConfigurationForDirectoryResponse withIdpCertificateId(String idpCertificateId) {
        this.idpCertificateId = idpCertificateId;
        return this;
    }

    /**
     * 身份提供商证书全局唯一标识符（ID)
     * @return idpCertificateId
     */
    public String getIdpCertificateId() {
        return idpCertificateId;
    }

    public void setIdpCertificateId(String idpCertificateId) {
        this.idpCertificateId = idpCertificateId;
    }

    public CreateExternalIdPConfigurationForDirectoryResponse withIdpCertificateIds(List<String> idpCertificateIds) {
        this.idpCertificateIds = idpCertificateIds;
        return this;
    }

    public CreateExternalIdPConfigurationForDirectoryResponse addIdpCertificateIdsItem(String idpCertificateIdsItem) {
        if (this.idpCertificateIds == null) {
            this.idpCertificateIds = new ArrayList<>();
        }
        this.idpCertificateIds.add(idpCertificateIdsItem);
        return this;
    }

    public CreateExternalIdPConfigurationForDirectoryResponse withIdpCertificateIds(
        Consumer<List<String>> idpCertificateIdsSetter) {
        if (this.idpCertificateIds == null) {
            this.idpCertificateIds = new ArrayList<>();
        }
        idpCertificateIdsSetter.accept(this.idpCertificateIds);
        return this;
    }

    /**
     * 身份提供商证书全局唯一标识符列表
     * @return idpCertificateIds
     */
    public List<String> getIdpCertificateIds() {
        return idpCertificateIds;
    }

    public void setIdpCertificateIds(List<String> idpCertificateIds) {
        this.idpCertificateIds = idpCertificateIds;
    }

    public CreateExternalIdPConfigurationForDirectoryResponse withIdpId(String idpId) {
        this.idpId = idpId;
        return this;
    }

    /**
     * 外部身份提供商的全局唯一标识符（ID）
     * @return idpId
     */
    public String getIdpId() {
        return idpId;
    }

    public void setIdpId(String idpId) {
        this.idpId = idpId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateExternalIdPConfigurationForDirectoryResponse that =
            (CreateExternalIdPConfigurationForDirectoryResponse) obj;
        return Objects.equals(this.hwsSpSamlConfig, that.hwsSpSamlConfig)
            && Objects.equals(this.idpCertificateId, that.idpCertificateId)
            && Objects.equals(this.idpCertificateIds, that.idpCertificateIds) && Objects.equals(this.idpId, that.idpId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hwsSpSamlConfig, idpCertificateId, idpCertificateIds, idpId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateExternalIdPConfigurationForDirectoryResponse {\n");
        sb.append("    hwsSpSamlConfig: ").append(toIndentedString(hwsSpSamlConfig)).append("\n");
        sb.append("    idpCertificateId: ").append(toIndentedString(idpCertificateId)).append("\n");
        sb.append("    idpCertificateIds: ").append(toIndentedString(idpCertificateIds)).append("\n");
        sb.append("    idpId: ").append(toIndentedString(idpId)).append("\n");
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
