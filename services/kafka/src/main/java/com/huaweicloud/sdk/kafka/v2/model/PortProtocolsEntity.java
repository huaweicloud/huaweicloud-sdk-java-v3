package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PortProtocolsEntity
 */
public class PortProtocolsEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_plain_enable")

    private Boolean privatePlainEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_plain_address")

    private String privatePlainAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_plain_domain_name")

    private String privatePlainDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_sasl_ssl_enable")

    private Boolean privateSaslSslEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_sasl_ssl_address")

    private String privateSaslSslAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_sasl_ssl_domain_name")

    private String privateSaslSslDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_sasl_plaintext_enable")

    private Boolean privateSaslPlaintextEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_sasl_plaintext_address")

    private String privateSaslPlaintextAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_sasl_plaintext_domain_name")

    private String privateSaslPlaintextDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_plain_enable")

    private Boolean publicPlainEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_plain_address")

    private String publicPlainAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_plain_domain_name")

    private String publicPlainDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_sasl_ssl_enable")

    private Boolean publicSaslSslEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_sasl_ssl_address")

    private String publicSaslSslAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_sasl_ssl_domain_name")

    private String publicSaslSslDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_sasl_plaintext_enable")

    private Boolean publicSaslPlaintextEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_sasl_plaintext_address")

    private String publicSaslPlaintextAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_sasl_plaintext_domain_name")

    private String publicSaslPlaintextDomainName;

    public PortProtocolsEntity withPrivatePlainEnable(Boolean privatePlainEnable) {
        this.privatePlainEnable = privatePlainEnable;
        return this;
    }

    /**
     * **参数解释**： 实例是否支持内网PLAINTEXT访问接入方式。 **取值范围**： - true：实例支持内网PLAINTEXT访问方式接入方式。 - false：实例不支持内网PLAINTEXT访问接入方式。
     * @return privatePlainEnable
     */
    public Boolean getPrivatePlainEnable() {
        return privatePlainEnable;
    }

    public void setPrivatePlainEnable(Boolean privatePlainEnable) {
        this.privatePlainEnable = privatePlainEnable;
    }

    public PortProtocolsEntity withPrivatePlainAddress(String privatePlainAddress) {
        this.privatePlainAddress = privatePlainAddress;
        return this;
    }

    /**
     * **参数解释**： Kafka内网PLAINTEXT接入方式连接地址。 **取值范围**： 不涉及
     * @return privatePlainAddress
     */
    public String getPrivatePlainAddress() {
        return privatePlainAddress;
    }

    public void setPrivatePlainAddress(String privatePlainAddress) {
        this.privatePlainAddress = privatePlainAddress;
    }

    public PortProtocolsEntity withPrivatePlainDomainName(String privatePlainDomainName) {
        this.privatePlainDomainName = privatePlainDomainName;
        return this;
    }

    /**
     * **参数解释**： 内网明文连接域名。 **取值范围**： 不涉及
     * @return privatePlainDomainName
     */
    public String getPrivatePlainDomainName() {
        return privatePlainDomainName;
    }

    public void setPrivatePlainDomainName(String privatePlainDomainName) {
        this.privatePlainDomainName = privatePlainDomainName;
    }

    public PortProtocolsEntity withPrivateSaslSslEnable(Boolean privateSaslSslEnable) {
        this.privateSaslSslEnable = privateSaslSslEnable;
        return this;
    }

    /**
     * **参数解释**： 实例是否支持内网SASL_SSL访问接入方式。 **取值范围**： - true：实例支持内网SASL_SSL访问方式接入方式。 - false：实例不支持内网SASL_SSL访问接入方式。
     * @return privateSaslSslEnable
     */
    public Boolean getPrivateSaslSslEnable() {
        return privateSaslSslEnable;
    }

    public void setPrivateSaslSslEnable(Boolean privateSaslSslEnable) {
        this.privateSaslSslEnable = privateSaslSslEnable;
    }

    public PortProtocolsEntity withPrivateSaslSslAddress(String privateSaslSslAddress) {
        this.privateSaslSslAddress = privateSaslSslAddress;
        return this;
    }

    /**
     * **参数解释**： Kafka内网SASL_SSL接入方式连接地址。 **取值范围**： 不涉及
     * @return privateSaslSslAddress
     */
    public String getPrivateSaslSslAddress() {
        return privateSaslSslAddress;
    }

    public void setPrivateSaslSslAddress(String privateSaslSslAddress) {
        this.privateSaslSslAddress = privateSaslSslAddress;
    }

    public PortProtocolsEntity withPrivateSaslSslDomainName(String privateSaslSslDomainName) {
        this.privateSaslSslDomainName = privateSaslSslDomainName;
        return this;
    }

    /**
     * **参数解释**： 内网SASL_SSL连接域名。 **取值范围**： 不涉及
     * @return privateSaslSslDomainName
     */
    public String getPrivateSaslSslDomainName() {
        return privateSaslSslDomainName;
    }

    public void setPrivateSaslSslDomainName(String privateSaslSslDomainName) {
        this.privateSaslSslDomainName = privateSaslSslDomainName;
    }

    public PortProtocolsEntity withPrivateSaslPlaintextEnable(Boolean privateSaslPlaintextEnable) {
        this.privateSaslPlaintextEnable = privateSaslPlaintextEnable;
        return this;
    }

    /**
     * **参数解释**： 实例是否支持内网SASL_PLAINTEXT访问接入方式。 **取值范围**： - true：实例支持内网SASL_PLAINTEXT访问方式接入方式。 - false：实例不支持内网SASL_PLAINTEXT访问接入方式。
     * @return privateSaslPlaintextEnable
     */
    public Boolean getPrivateSaslPlaintextEnable() {
        return privateSaslPlaintextEnable;
    }

    public void setPrivateSaslPlaintextEnable(Boolean privateSaslPlaintextEnable) {
        this.privateSaslPlaintextEnable = privateSaslPlaintextEnable;
    }

    public PortProtocolsEntity withPrivateSaslPlaintextAddress(String privateSaslPlaintextAddress) {
        this.privateSaslPlaintextAddress = privateSaslPlaintextAddress;
        return this;
    }

    /**
     * **参数解释**： Kafka内网SASL_PLAINTEXT接入方式连接地址。 **取值范围**： 不涉及
     * @return privateSaslPlaintextAddress
     */
    public String getPrivateSaslPlaintextAddress() {
        return privateSaslPlaintextAddress;
    }

    public void setPrivateSaslPlaintextAddress(String privateSaslPlaintextAddress) {
        this.privateSaslPlaintextAddress = privateSaslPlaintextAddress;
    }

    public PortProtocolsEntity withPrivateSaslPlaintextDomainName(String privateSaslPlaintextDomainName) {
        this.privateSaslPlaintextDomainName = privateSaslPlaintextDomainName;
        return this;
    }

    /**
     * **参数解释**： 内网SASL_PLAINTEXT连接域名。 **取值范围**： 不涉及
     * @return privateSaslPlaintextDomainName
     */
    public String getPrivateSaslPlaintextDomainName() {
        return privateSaslPlaintextDomainName;
    }

    public void setPrivateSaslPlaintextDomainName(String privateSaslPlaintextDomainName) {
        this.privateSaslPlaintextDomainName = privateSaslPlaintextDomainName;
    }

    public PortProtocolsEntity withPublicPlainEnable(Boolean publicPlainEnable) {
        this.publicPlainEnable = publicPlainEnable;
        return this;
    }

    /**
     * **参数解释**： 实例是否支持公网PLAINTEXT访问接入方式。 **取值范围**： - true：实例支持公网PLAINTEXT访问方式接入方式。 - false：实例不支持公网PLAINTEXT访问接入方式。
     * @return publicPlainEnable
     */
    public Boolean getPublicPlainEnable() {
        return publicPlainEnable;
    }

    public void setPublicPlainEnable(Boolean publicPlainEnable) {
        this.publicPlainEnable = publicPlainEnable;
    }

    public PortProtocolsEntity withPublicPlainAddress(String publicPlainAddress) {
        this.publicPlainAddress = publicPlainAddress;
        return this;
    }

    /**
     * **参数解释**： Kafka公网PLAINTEXT接入方式连接地址。 **取值范围**： 不涉及
     * @return publicPlainAddress
     */
    public String getPublicPlainAddress() {
        return publicPlainAddress;
    }

    public void setPublicPlainAddress(String publicPlainAddress) {
        this.publicPlainAddress = publicPlainAddress;
    }

    public PortProtocolsEntity withPublicPlainDomainName(String publicPlainDomainName) {
        this.publicPlainDomainName = publicPlainDomainName;
        return this;
    }

    /**
     * **参数解释**： 公网明文连接域名。 **取值范围**： 不涉及
     * @return publicPlainDomainName
     */
    public String getPublicPlainDomainName() {
        return publicPlainDomainName;
    }

    public void setPublicPlainDomainName(String publicPlainDomainName) {
        this.publicPlainDomainName = publicPlainDomainName;
    }

    public PortProtocolsEntity withPublicSaslSslEnable(Boolean publicSaslSslEnable) {
        this.publicSaslSslEnable = publicSaslSslEnable;
        return this;
    }

    /**
     * **参数解释**： 实例是否支持公网SASL_SSL访问接入方式。 **取值范围**： - true：实例支持内网SASL_SSL访问方式接入方式。 - false：实例不支持公网SASL_SSL访问接入方式。
     * @return publicSaslSslEnable
     */
    public Boolean getPublicSaslSslEnable() {
        return publicSaslSslEnable;
    }

    public void setPublicSaslSslEnable(Boolean publicSaslSslEnable) {
        this.publicSaslSslEnable = publicSaslSslEnable;
    }

    public PortProtocolsEntity withPublicSaslSslAddress(String publicSaslSslAddress) {
        this.publicSaslSslAddress = publicSaslSslAddress;
        return this;
    }

    /**
     * **参数解释**： Kafka公网SASL_SSL接入方式连接地址。 **取值范围**： 不涉及
     * @return publicSaslSslAddress
     */
    public String getPublicSaslSslAddress() {
        return publicSaslSslAddress;
    }

    public void setPublicSaslSslAddress(String publicSaslSslAddress) {
        this.publicSaslSslAddress = publicSaslSslAddress;
    }

    public PortProtocolsEntity withPublicSaslSslDomainName(String publicSaslSslDomainName) {
        this.publicSaslSslDomainName = publicSaslSslDomainName;
        return this;
    }

    /**
     * **参数解释**： 公网SASL_SSL连接域名。 **取值范围**： 不涉及
     * @return publicSaslSslDomainName
     */
    public String getPublicSaslSslDomainName() {
        return publicSaslSslDomainName;
    }

    public void setPublicSaslSslDomainName(String publicSaslSslDomainName) {
        this.publicSaslSslDomainName = publicSaslSslDomainName;
    }

    public PortProtocolsEntity withPublicSaslPlaintextEnable(Boolean publicSaslPlaintextEnable) {
        this.publicSaslPlaintextEnable = publicSaslPlaintextEnable;
        return this;
    }

    /**
     * **参数解释**： 实例是否支持公网SASL_PLAINTEXT访问接入方式。 **取值范围**： - true：实例支持公网SASL_PLAINTEXT访问方式接入方式。 - false：实例不支持公网SASL_PLAINTEXT访问接入方式。
     * @return publicSaslPlaintextEnable
     */
    public Boolean getPublicSaslPlaintextEnable() {
        return publicSaslPlaintextEnable;
    }

    public void setPublicSaslPlaintextEnable(Boolean publicSaslPlaintextEnable) {
        this.publicSaslPlaintextEnable = publicSaslPlaintextEnable;
    }

    public PortProtocolsEntity withPublicSaslPlaintextAddress(String publicSaslPlaintextAddress) {
        this.publicSaslPlaintextAddress = publicSaslPlaintextAddress;
        return this;
    }

    /**
     * **参数解释**： Kafka公网SASL_PLAINTEXT接入方式连接地址。 **取值范围**： 不涉及
     * @return publicSaslPlaintextAddress
     */
    public String getPublicSaslPlaintextAddress() {
        return publicSaslPlaintextAddress;
    }

    public void setPublicSaslPlaintextAddress(String publicSaslPlaintextAddress) {
        this.publicSaslPlaintextAddress = publicSaslPlaintextAddress;
    }

    public PortProtocolsEntity withPublicSaslPlaintextDomainName(String publicSaslPlaintextDomainName) {
        this.publicSaslPlaintextDomainName = publicSaslPlaintextDomainName;
        return this;
    }

    /**
     * **参数解释**： 公网SASL_PLAINTEXT连接域名。 **取值范围**： 不涉及
     * @return publicSaslPlaintextDomainName
     */
    public String getPublicSaslPlaintextDomainName() {
        return publicSaslPlaintextDomainName;
    }

    public void setPublicSaslPlaintextDomainName(String publicSaslPlaintextDomainName) {
        this.publicSaslPlaintextDomainName = publicSaslPlaintextDomainName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PortProtocolsEntity that = (PortProtocolsEntity) obj;
        return Objects.equals(this.privatePlainEnable, that.privatePlainEnable)
            && Objects.equals(this.privatePlainAddress, that.privatePlainAddress)
            && Objects.equals(this.privatePlainDomainName, that.privatePlainDomainName)
            && Objects.equals(this.privateSaslSslEnable, that.privateSaslSslEnable)
            && Objects.equals(this.privateSaslSslAddress, that.privateSaslSslAddress)
            && Objects.equals(this.privateSaslSslDomainName, that.privateSaslSslDomainName)
            && Objects.equals(this.privateSaslPlaintextEnable, that.privateSaslPlaintextEnable)
            && Objects.equals(this.privateSaslPlaintextAddress, that.privateSaslPlaintextAddress)
            && Objects.equals(this.privateSaslPlaintextDomainName, that.privateSaslPlaintextDomainName)
            && Objects.equals(this.publicPlainEnable, that.publicPlainEnable)
            && Objects.equals(this.publicPlainAddress, that.publicPlainAddress)
            && Objects.equals(this.publicPlainDomainName, that.publicPlainDomainName)
            && Objects.equals(this.publicSaslSslEnable, that.publicSaslSslEnable)
            && Objects.equals(this.publicSaslSslAddress, that.publicSaslSslAddress)
            && Objects.equals(this.publicSaslSslDomainName, that.publicSaslSslDomainName)
            && Objects.equals(this.publicSaslPlaintextEnable, that.publicSaslPlaintextEnable)
            && Objects.equals(this.publicSaslPlaintextAddress, that.publicSaslPlaintextAddress)
            && Objects.equals(this.publicSaslPlaintextDomainName, that.publicSaslPlaintextDomainName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privatePlainEnable,
            privatePlainAddress,
            privatePlainDomainName,
            privateSaslSslEnable,
            privateSaslSslAddress,
            privateSaslSslDomainName,
            privateSaslPlaintextEnable,
            privateSaslPlaintextAddress,
            privateSaslPlaintextDomainName,
            publicPlainEnable,
            publicPlainAddress,
            publicPlainDomainName,
            publicSaslSslEnable,
            publicSaslSslAddress,
            publicSaslSslDomainName,
            publicSaslPlaintextEnable,
            publicSaslPlaintextAddress,
            publicSaslPlaintextDomainName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PortProtocolsEntity {\n");
        sb.append("    privatePlainEnable: ").append(toIndentedString(privatePlainEnable)).append("\n");
        sb.append("    privatePlainAddress: ").append(toIndentedString(privatePlainAddress)).append("\n");
        sb.append("    privatePlainDomainName: ").append(toIndentedString(privatePlainDomainName)).append("\n");
        sb.append("    privateSaslSslEnable: ").append(toIndentedString(privateSaslSslEnable)).append("\n");
        sb.append("    privateSaslSslAddress: ").append(toIndentedString(privateSaslSslAddress)).append("\n");
        sb.append("    privateSaslSslDomainName: ").append(toIndentedString(privateSaslSslDomainName)).append("\n");
        sb.append("    privateSaslPlaintextEnable: ").append(toIndentedString(privateSaslPlaintextEnable)).append("\n");
        sb.append("    privateSaslPlaintextAddress: ")
            .append(toIndentedString(privateSaslPlaintextAddress))
            .append("\n");
        sb.append("    privateSaslPlaintextDomainName: ")
            .append(toIndentedString(privateSaslPlaintextDomainName))
            .append("\n");
        sb.append("    publicPlainEnable: ").append(toIndentedString(publicPlainEnable)).append("\n");
        sb.append("    publicPlainAddress: ").append(toIndentedString(publicPlainAddress)).append("\n");
        sb.append("    publicPlainDomainName: ").append(toIndentedString(publicPlainDomainName)).append("\n");
        sb.append("    publicSaslSslEnable: ").append(toIndentedString(publicSaslSslEnable)).append("\n");
        sb.append("    publicSaslSslAddress: ").append(toIndentedString(publicSaslSslAddress)).append("\n");
        sb.append("    publicSaslSslDomainName: ").append(toIndentedString(publicSaslSslDomainName)).append("\n");
        sb.append("    publicSaslPlaintextEnable: ").append(toIndentedString(publicSaslPlaintextEnable)).append("\n");
        sb.append("    publicSaslPlaintextAddress: ").append(toIndentedString(publicSaslPlaintextAddress)).append("\n");
        sb.append("    publicSaslPlaintextDomainName: ")
            .append(toIndentedString(publicSaslPlaintextDomainName))
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
