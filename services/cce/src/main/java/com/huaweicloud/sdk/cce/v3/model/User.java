package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * User
 */
public class User {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client-certificate-data")

    private String clientCertificateData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client-key-data")

    private String clientKeyData;

    public User withClientCertificateData(String clientCertificateData) {
        this.clientCertificateData = clientCertificateData;
        return this;
    }

    /**
     * **参数解释**： 客户端证书。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return clientCertificateData
     */
    public String getClientCertificateData() {
        return clientCertificateData;
    }

    public void setClientCertificateData(String clientCertificateData) {
        this.clientCertificateData = clientCertificateData;
    }

    public User withClientKeyData(String clientKeyData) {
        this.clientKeyData = clientKeyData;
        return this;
    }

    /**
     * **参数解释**： 包含来自TLS客户端密钥文件的PEM编码数据。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return clientKeyData
     */
    public String getClientKeyData() {
        return clientKeyData;
    }

    public void setClientKeyData(String clientKeyData) {
        this.clientKeyData = clientKeyData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User that = (User) obj;
        return Objects.equals(this.clientCertificateData, that.clientCertificateData)
            && Objects.equals(this.clientKeyData, that.clientKeyData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientCertificateData, clientKeyData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class User {\n");
        sb.append("    clientCertificateData: ").append(toIndentedString(clientCertificateData)).append("\n");
        sb.append("    clientKeyData: ").append(toIndentedString(clientKeyData)).append("\n");
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
