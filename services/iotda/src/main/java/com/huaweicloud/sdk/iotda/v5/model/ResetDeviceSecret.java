package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResetDeviceSecret
 */
public class ResetDeviceSecret {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret")

    private String secret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_disconnect")

    private Boolean forceDisconnect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_type")

    private String secretType;

    public ResetDeviceSecret withSecret(String secret) {
        this.secret = secret;
        return this;
    }

    /**
     * **参数说明**：设备密钥，设置该字段时平台将设备密钥重置为指定值，若不设置则由平台自动生成。 **取值范围**：长度不低于8不超过32，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return secret
     */
    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public ResetDeviceSecret withForceDisconnect(Boolean forceDisconnect) {
        this.forceDisconnect = forceDisconnect;
        return this;
    }

    /**
     * **参数说明**：是否强制断开设备的连接，当前仅限长连接。默认值false。
     * @return forceDisconnect
     */
    public Boolean getForceDisconnect() {
        return forceDisconnect;
    }

    public void setForceDisconnect(Boolean forceDisconnect) {
        this.forceDisconnect = forceDisconnect;
    }

    public ResetDeviceSecret withSecretType(String secretType) {
        this.secretType = secretType;
        return this;
    }

    /**
     * **参数说明**：重置设备秘钥的的类型。 **取值范围**： - PRIMARY：重置主秘钥。设备秘钥鉴权优先使用的密钥，当设备接入物联网平台时，平台将优先使用主密钥进行校验。 - SECONDARY：重置辅秘钥。设备的备用密钥，当主密钥校验不通过时，会启用辅密钥校验，辅密钥与主密钥有相同的效力；辅密钥对coap协议接入的设备不生效。
     * @return secretType
     */
    public String getSecretType() {
        return secretType;
    }

    public void setSecretType(String secretType) {
        this.secretType = secretType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResetDeviceSecret that = (ResetDeviceSecret) obj;
        return Objects.equals(this.secret, that.secret) && Objects.equals(this.forceDisconnect, that.forceDisconnect)
            && Objects.equals(this.secretType, that.secretType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secret, forceDisconnect, secretType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetDeviceSecret {\n");
        sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
        sb.append("    forceDisconnect: ").append(toIndentedString(forceDisconnect)).append("\n");
        sb.append("    secretType: ").append(toIndentedString(secretType)).append("\n");
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
