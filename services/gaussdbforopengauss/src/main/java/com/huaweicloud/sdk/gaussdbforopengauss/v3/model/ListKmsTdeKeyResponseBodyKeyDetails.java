package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListKmsTdeKeyResponseBodyKeyDetails
 */
public class ListKmsTdeKeyResponseBodyKeyDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_key_flag")

    private String defaultKeyFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_alias")

    private String keyAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_spec")

    private String keySpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_state")

    private String keyState;

    public ListKmsTdeKeyResponseBodyKeyDetails withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * **参数解释**: 秘钥ID。 **取值范围**: 不涉及。
     * @return keyId
     */
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public ListKmsTdeKeyResponseBodyKeyDetails withDefaultKeyFlag(String defaultKeyFlag) {
        this.defaultKeyFlag = defaultKeyFlag;
        return this;
    }

    /**
     * **参数解释**: 默认主密钥标识。 **取值范围**: 默认主密钥标识为1，非默认标识为0。
     * @return defaultKeyFlag
     */
    public String getDefaultKeyFlag() {
        return defaultKeyFlag;
    }

    public void setDefaultKeyFlag(String defaultKeyFlag) {
        this.defaultKeyFlag = defaultKeyFlag;
    }

    public ListKmsTdeKeyResponseBodyKeyDetails withKeyAlias(String keyAlias) {
        this.keyAlias = keyAlias;
        return this;
    }

    /**
     * **参数解释**: 密钥别名。 **取值范围**: 不涉及。
     * @return keyAlias
     */
    public String getKeyAlias() {
        return keyAlias;
    }

    public void setKeyAlias(String keyAlias) {
        this.keyAlias = keyAlias;
    }

    public ListKmsTdeKeyResponseBodyKeyDetails withKeySpec(String keySpec) {
        this.keySpec = keySpec;
        return this;
    }

    /**
     * **参数解释**: 密钥生成算法。 **取值范围**: - AES_256 - SM4 - RSA_2048 - RSA_3072 - RSA_4096 - EC_P256 - EC_P384 - SM2 - ALL
     * @return keySpec
     */
    public String getKeySpec() {
        return keySpec;
    }

    public void setKeySpec(String keySpec) {
        this.keySpec = keySpec;
    }

    public ListKmsTdeKeyResponseBodyKeyDetails withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释**: 用户域ID。 **取值范围**: 不涉及。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ListKmsTdeKeyResponseBodyKeyDetails withKeyState(String keyState) {
        this.keyState = keyState;
        return this;
    }

    /**
     * **参数解释**: 秘钥状态。 **取值范围**: - “1”表示待激活状态。 - “2”表示启用状态。 - “3”表示禁用状态。 - “4”表示计划删除状态。 - “5”表示等待导入状态。
     * @return keyState
     */
    public String getKeyState() {
        return keyState;
    }

    public void setKeyState(String keyState) {
        this.keyState = keyState;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListKmsTdeKeyResponseBodyKeyDetails that = (ListKmsTdeKeyResponseBodyKeyDetails) obj;
        return Objects.equals(this.keyId, that.keyId) && Objects.equals(this.defaultKeyFlag, that.defaultKeyFlag)
            && Objects.equals(this.keyAlias, that.keyAlias) && Objects.equals(this.keySpec, that.keySpec)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.keyState, that.keyState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, defaultKeyFlag, keyAlias, keySpec, domainId, keyState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListKmsTdeKeyResponseBodyKeyDetails {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    defaultKeyFlag: ").append(toIndentedString(defaultKeyFlag)).append("\n");
        sb.append("    keyAlias: ").append(toIndentedString(keyAlias)).append("\n");
        sb.append("    keySpec: ").append(toIndentedString(keySpec)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    keyState: ").append(toIndentedString(keyState)).append("\n");
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
