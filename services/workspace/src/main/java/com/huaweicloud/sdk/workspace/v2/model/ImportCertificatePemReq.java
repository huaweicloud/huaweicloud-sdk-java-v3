package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 导入pem证书。
 */
public class ImportCertificatePemReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "distinguished_name")

    private DistinguishedName distinguishedName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_algorithm")

    private String keyAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_id")

    private String transactionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "crl_configuration")

    private CrlConfigurationData crlConfiguration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pem_code")

    private String pemCode;

    public ImportCertificatePemReq withDistinguishedName(DistinguishedName distinguishedName) {
        this.distinguishedName = distinguishedName;
        return this;
    }

    public ImportCertificatePemReq withDistinguishedName(Consumer<DistinguishedName> distinguishedNameSetter) {
        if (this.distinguishedName == null) {
            this.distinguishedName = new DistinguishedName();
            distinguishedNameSetter.accept(this.distinguishedName);
        }

        return this;
    }

    /**
     * Get distinguishedName
     * @return distinguishedName
     */
    public DistinguishedName getDistinguishedName() {
        return distinguishedName;
    }

    public void setDistinguishedName(DistinguishedName distinguishedName) {
        this.distinguishedName = distinguishedName;
    }

    public ImportCertificatePemReq withKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
        return this;
    }

    /**
     * 密钥对生成算法 RSA-2048 RSA-3072。
     * @return keyAlgorithm
     */
    public String getKeyAlgorithm() {
        return keyAlgorithm;
    }

    public void setKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
    }

    public ImportCertificatePemReq withTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * 事务id。
     * @return transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public ImportCertificatePemReq withCrlConfiguration(CrlConfigurationData crlConfiguration) {
        this.crlConfiguration = crlConfiguration;
        return this;
    }

    public ImportCertificatePemReq withCrlConfiguration(Consumer<CrlConfigurationData> crlConfigurationSetter) {
        if (this.crlConfiguration == null) {
            this.crlConfiguration = new CrlConfigurationData();
            crlConfigurationSetter.accept(this.crlConfiguration);
        }

        return this;
    }

    /**
     * Get crlConfiguration
     * @return crlConfiguration
     */
    public CrlConfigurationData getCrlConfiguration() {
        return crlConfiguration;
    }

    public void setCrlConfiguration(CrlConfigurationData crlConfiguration) {
        this.crlConfiguration = crlConfiguration;
    }

    public ImportCertificatePemReq withPemCode(String pemCode) {
        this.pemCode = pemCode;
        return this;
    }

    /**
     * 证书pem。
     * @return pemCode
     */
    public String getPemCode() {
        return pemCode;
    }

    public void setPemCode(String pemCode) {
        this.pemCode = pemCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportCertificatePemReq that = (ImportCertificatePemReq) obj;
        return Objects.equals(this.distinguishedName, that.distinguishedName)
            && Objects.equals(this.keyAlgorithm, that.keyAlgorithm)
            && Objects.equals(this.transactionId, that.transactionId)
            && Objects.equals(this.crlConfiguration, that.crlConfiguration)
            && Objects.equals(this.pemCode, that.pemCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(distinguishedName, keyAlgorithm, transactionId, crlConfiguration, pemCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportCertificatePemReq {\n");
        sb.append("    distinguishedName: ").append(toIndentedString(distinguishedName)).append("\n");
        sb.append("    keyAlgorithm: ").append(toIndentedString(keyAlgorithm)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    crlConfiguration: ").append(toIndentedString(crlConfiguration)).append("\n");
        sb.append("    pemCode: ").append(toIndentedString(pemCode)).append("\n");
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
