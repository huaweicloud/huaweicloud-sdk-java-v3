package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ResetDeviceSecretResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private String deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret")

    private String secret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_type")

    private String secretType;

    public ResetDeviceSecretResponse withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * 设备ID，用于唯一标识一个设备。在注册设备时直接指定，或者由物联网平台分配获得。由物联网平台分配时，生成规则为\"product_id\" + \"_\" + \"node_id\"拼接而成。
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public ResetDeviceSecretResponse withSecret(String secret) {
        this.secret = secret;
        return this;
    }

    /**
     * 设备密钥。
     * @return secret
     */
    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public ResetDeviceSecretResponse withSecretType(String secretType) {
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
        ResetDeviceSecretResponse that = (ResetDeviceSecretResponse) obj;
        return Objects.equals(this.deviceId, that.deviceId) && Objects.equals(this.secret, that.secret)
            && Objects.equals(this.secretType, that.secretType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceId, secret, secretType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetDeviceSecretResponse {\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
