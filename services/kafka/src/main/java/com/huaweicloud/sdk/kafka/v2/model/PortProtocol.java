package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 设置Kafka实例的接入方式。PLAINTEXT表示明文接入，SASL_SSL或者SASL_PLAINTEXT表示密文接入。 **约束限制**： 内网访问不支持关闭，明文接入和密文接入至少开启一个。 跨VPC访问的安全协议等于内网访问的安全协议，若内网同时开启了密文访问和明文访问，则跨VPC访问的安全协议会优先使用密文访问的安全协议。
 */
public class PortProtocol {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_plain_enable")

    private Boolean privatePlainEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_sasl_ssl_enable")

    private Boolean privateSaslSslEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_sasl_plaintext_enable")

    private Boolean privateSaslPlaintextEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_plain_enable")

    private Boolean publicPlainEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_sasl_ssl_enable")

    private Boolean publicSaslSslEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_sasl_plaintext_enable")

    private Boolean publicSaslPlaintextEnable;

    public PortProtocol withPrivatePlainEnable(Boolean privatePlainEnable) {
        this.privatePlainEnable = privatePlainEnable;
        return this;
    }

    /**
     * **参数解释**： 是否开启内网明文访问连接方式。 **约束限制**： 不涉及。 **取值范围**： - true：开启内网明文访问连接方式，连接地址：ip:9092，访问协议PLAINTEXT。 - false：关闭内网明文访问。 **默认取值**： false。
     * @return privatePlainEnable
     */
    public Boolean getPrivatePlainEnable() {
        return privatePlainEnable;
    }

    public void setPrivatePlainEnable(Boolean privatePlainEnable) {
        this.privatePlainEnable = privatePlainEnable;
    }

    public PortProtocol withPrivateSaslSslEnable(Boolean privateSaslSslEnable) {
        this.privateSaslSslEnable = privateSaslSslEnable;
        return this;
    }

    /**
     * **参数解释**： 是否开启安全协议为SASL_SSL的内网密文接入方式。 **约束限制**： private_sasl_ssl_enable和private_sasl_plaintext_enable不能同时为true。 **取值范围**： - true：开启安全协议为SASL_SSL的内网密文接入方式。          - false：关闭安全协议为SASL_SSL的内网接入方式。 **默认取值**： false。
     * @return privateSaslSslEnable
     */
    public Boolean getPrivateSaslSslEnable() {
        return privateSaslSslEnable;
    }

    public void setPrivateSaslSslEnable(Boolean privateSaslSslEnable) {
        this.privateSaslSslEnable = privateSaslSslEnable;
    }

    public PortProtocol withPrivateSaslPlaintextEnable(Boolean privateSaslPlaintextEnable) {
        this.privateSaslPlaintextEnable = privateSaslPlaintextEnable;
        return this;
    }

    /**
     * **参数解释**： 是否开启安全协议为SASL_PLAINTEXT的内网密文接入方式。 **约束限制**： private_sasl_plaintext_enable和private_sasl_ssl_enable不能同时为true。 **取值范围**： - true：开启安全协议为SASL_PLAINTEXT的内网密文接入方式，连接地址：ip:9093，访问协议SASL_PLAINTEXT。     - false：关闭安全协议为SASL_PLAINTEXT的内网密文接入方式。 **默认取值**： false。
     * @return privateSaslPlaintextEnable
     */
    public Boolean getPrivateSaslPlaintextEnable() {
        return privateSaslPlaintextEnable;
    }

    public void setPrivateSaslPlaintextEnable(Boolean privateSaslPlaintextEnable) {
        this.privateSaslPlaintextEnable = privateSaslPlaintextEnable;
    }

    public PortProtocol withPublicPlainEnable(Boolean publicPlainEnable) {
        this.publicPlainEnable = publicPlainEnable;
        return this;
    }

    /**
     * **参数解释**： 是否开启公网明文访问连接方式。 **约束限制**： 开启公网明文接入前，需要先开启公网访问功能。 **取值范围**： - true：开启公网明文访问连接方式，连接地址：ip:9094，访问协议PLAINTEXT。     - false：关闭公网明文接入方式。 **默认取值**： false。
     * @return publicPlainEnable
     */
    public Boolean getPublicPlainEnable() {
        return publicPlainEnable;
    }

    public void setPublicPlainEnable(Boolean publicPlainEnable) {
        this.publicPlainEnable = publicPlainEnable;
    }

    public PortProtocol withPublicSaslSslEnable(Boolean publicSaslSslEnable) {
        this.publicSaslSslEnable = publicSaslSslEnable;
        return this;
    }

    /**
     * **参数解释**： 是否开启安全协议为SASL_SSL的公网密文接入。 **约束限制**： public_sasl_ssl_enable和public_sasl_plaintext_enable不能同时为true。 为true时，需要实例开启公网。 **取值范围**： - true：开启安全协议为SASL_SSL的公网密文接入方式，连接地址：ip:9095，访问协议：SASL_SSL。 - false：关闭安全协议为SASL_SSL的公网密文接入方式。 **默认取值**： false。
     * @return publicSaslSslEnable
     */
    public Boolean getPublicSaslSslEnable() {
        return publicSaslSslEnable;
    }

    public void setPublicSaslSslEnable(Boolean publicSaslSslEnable) {
        this.publicSaslSslEnable = publicSaslSslEnable;
    }

    public PortProtocol withPublicSaslPlaintextEnable(Boolean publicSaslPlaintextEnable) {
        this.publicSaslPlaintextEnable = publicSaslPlaintextEnable;
        return this;
    }

    /**
     * **参数解释**： 是否开启安全协议为SASL_PLAINTEXT的公网密文接入方式。 **约束限制**： public_sasl_plaintext_enable和public_sasl_ssl_enable不能同时为true。 为true时，需要实例开启公网。 **取值范围**： - true：开启安全协议为SASL_PLAINTEXT的公网密文接入方式，连接地址：ip:9095，访问协议：SASL_PLAINTEXT。           - false：关闭安全协议为SASL_PLAINTEXT的公网密文接入方式。 **默认取值**： false。
     * @return publicSaslPlaintextEnable
     */
    public Boolean getPublicSaslPlaintextEnable() {
        return publicSaslPlaintextEnable;
    }

    public void setPublicSaslPlaintextEnable(Boolean publicSaslPlaintextEnable) {
        this.publicSaslPlaintextEnable = publicSaslPlaintextEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PortProtocol that = (PortProtocol) obj;
        return Objects.equals(this.privatePlainEnable, that.privatePlainEnable)
            && Objects.equals(this.privateSaslSslEnable, that.privateSaslSslEnable)
            && Objects.equals(this.privateSaslPlaintextEnable, that.privateSaslPlaintextEnable)
            && Objects.equals(this.publicPlainEnable, that.publicPlainEnable)
            && Objects.equals(this.publicSaslSslEnable, that.publicSaslSslEnable)
            && Objects.equals(this.publicSaslPlaintextEnable, that.publicSaslPlaintextEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privatePlainEnable,
            privateSaslSslEnable,
            privateSaslPlaintextEnable,
            publicPlainEnable,
            publicSaslSslEnable,
            publicSaslPlaintextEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PortProtocol {\n");
        sb.append("    privatePlainEnable: ").append(toIndentedString(privatePlainEnable)).append("\n");
        sb.append("    privateSaslSslEnable: ").append(toIndentedString(privateSaslSslEnable)).append("\n");
        sb.append("    privateSaslPlaintextEnable: ").append(toIndentedString(privateSaslPlaintextEnable)).append("\n");
        sb.append("    publicPlainEnable: ").append(toIndentedString(publicPlainEnable)).append("\n");
        sb.append("    publicSaslSslEnable: ").append(toIndentedString(publicSaslSslEnable)).append("\n");
        sb.append("    publicSaslPlaintextEnable: ").append(toIndentedString(publicSaslPlaintextEnable)).append("\n");
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
