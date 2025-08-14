package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateIDPReqBody
 */
public class CreateIDPReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idp_saml_metadata")

    private String idpSamlMetadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idp_certificate")

    private String idpCertificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idp_saml_config")

    private Object idpSamlConfig;

    public CreateIDPReqBody withIdpSamlMetadata(String idpSamlMetadata) {
        this.idpSamlMetadata = idpSamlMetadata;
        return this;
    }

    /**
     * 身份提供商SAML元数据，与身份提供商SAML配置二选一
     * @return idpSamlMetadata
     */
    public String getIdpSamlMetadata() {
        return idpSamlMetadata;
    }

    public void setIdpSamlMetadata(String idpSamlMetadata) {
        this.idpSamlMetadata = idpSamlMetadata;
    }

    public CreateIDPReqBody withIdpCertificate(String idpCertificate) {
        this.idpCertificate = idpCertificate;
        return this;
    }

    /**
     * 身份提供商证书，与身份提供商SAML配置联合使用
     * @return idpCertificate
     */
    public String getIdpCertificate() {
        return idpCertificate;
    }

    public void setIdpCertificate(String idpCertificate) {
        this.idpCertificate = idpCertificate;
    }

    public CreateIDPReqBody withIdpSamlConfig(Object idpSamlConfig) {
        this.idpSamlConfig = idpSamlConfig;
        return this;
    }

    public CreateIDPReqBody withIdpSamlConfig(Consumer<Object> idpSamlConfigSetter) {
        if (this.idpSamlConfig == null) {
            this.idpSamlConfig = new Object();
            idpSamlConfigSetter.accept(this.idpSamlConfig);
        }

        return this;
    }

    /**
     * 身份提供商SAML配置信息，与身份提供商SAML元数据二选一
     * @return idpSamlConfig
     */
    public Object getIdpSamlConfig() {
        return idpSamlConfig;
    }

    public void setIdpSamlConfig(Object idpSamlConfig) {
        this.idpSamlConfig = idpSamlConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateIDPReqBody that = (CreateIDPReqBody) obj;
        return Objects.equals(this.idpSamlMetadata, that.idpSamlMetadata)
            && Objects.equals(this.idpCertificate, that.idpCertificate)
            && Objects.equals(this.idpSamlConfig, that.idpSamlConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idpSamlMetadata, idpCertificate, idpSamlConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateIDPReqBody {\n");
        sb.append("    idpSamlMetadata: ").append(toIndentedString(idpSamlMetadata)).append("\n");
        sb.append("    idpCertificate: ").append(toIndentedString(idpCertificate)).append("\n");
        sb.append("    idpSamlConfig: ").append(toIndentedString(idpSamlConfig)).append("\n");
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
