package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 接入点证明文档 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
 */
public class DecryptDatakeyCapsuleRequestBodyAttestationDocument {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs_signature")

    private String ecsSignature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_signature")

    private String customSignature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_public_key")

    private String customPublicKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_token")

    private String serviceToken;

    public DecryptDatakeyCapsuleRequestBodyAttestationDocument withEcsSignature(String ecsSignature) {
        this.ecsSignature = ecsSignature;
        return this;
    }

    /**
     * **参数解释：** ECS证明文档 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return ecsSignature
     */
    public String getEcsSignature() {
        return ecsSignature;
    }

    public void setEcsSignature(String ecsSignature) {
        this.ecsSignature = ecsSignature;
    }

    public DecryptDatakeyCapsuleRequestBodyAttestationDocument withCustomSignature(String customSignature) {
        this.customSignature = customSignature;
        return this;
    }

    /**
     * **参数解释：** 通用类型接入点的签名信息 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return customSignature
     */
    public String getCustomSignature() {
        return customSignature;
    }

    public void setCustomSignature(String customSignature) {
        this.customSignature = customSignature;
    }

    public DecryptDatakeyCapsuleRequestBodyAttestationDocument withCustomPublicKey(String customPublicKey) {
        this.customPublicKey = customPublicKey;
        return this;
    }

    /**
     * **参数解释：** 通用类型接入点公钥信息 **约束限制：** 格式是X509公钥格式中的Base64字符串 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return customPublicKey
     */
    public String getCustomPublicKey() {
        return customPublicKey;
    }

    public void setCustomPublicKey(String customPublicKey) {
        this.customPublicKey = customPublicKey;
    }

    public DecryptDatakeyCapsuleRequestBodyAttestationDocument withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * **参数解释：** 通用类型签名信息过期时间 **约束限制：** 时间格式是ISO 8601格式，yyyy-mm-ddTHH:MM:SSZ **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public DecryptDatakeyCapsuleRequestBodyAttestationDocument withServiceToken(String serviceToken) {
        this.serviceToken = serviceToken;
        return this;
    }

    /**
     * **参数解释：** CCE类型访问凭证 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return serviceToken
     */
    public String getServiceToken() {
        return serviceToken;
    }

    public void setServiceToken(String serviceToken) {
        this.serviceToken = serviceToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DecryptDatakeyCapsuleRequestBodyAttestationDocument that =
            (DecryptDatakeyCapsuleRequestBodyAttestationDocument) obj;
        return Objects.equals(this.ecsSignature, that.ecsSignature)
            && Objects.equals(this.customSignature, that.customSignature)
            && Objects.equals(this.customPublicKey, that.customPublicKey)
            && Objects.equals(this.expireTime, that.expireTime) && Objects.equals(this.serviceToken, that.serviceToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ecsSignature, customSignature, customPublicKey, expireTime, serviceToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DecryptDatakeyCapsuleRequestBodyAttestationDocument {\n");
        sb.append("    ecsSignature: ").append(toIndentedString(ecsSignature)).append("\n");
        sb.append("    customSignature: ").append(toIndentedString(customSignature)).append("\n");
        sb.append("    customPublicKey: ").append(toIndentedString(customPublicKey)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    serviceToken: ").append(toIndentedString(serviceToken)).append("\n");
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
