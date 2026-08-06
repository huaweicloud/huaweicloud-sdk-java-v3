package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CreateDatakeyCapsuleRequestBody
 */
public class CreateDatakeyCapsuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    /**
     * **参数解释：** 待创建的数据密钥长度 **约束限制：** 256或者128二选一 **取值范围：** - 128 - 256 **默认取值：** 不涉及
     */
    public static final class DatakeyLengthEnum {

        /**
         * Enum AES_256 for value: "AES_256"
         */
        public static final DatakeyLengthEnum AES_256 = new DatakeyLengthEnum("AES_256");

        /**
         * Enum SM4 for value: "SM4"
         */
        public static final DatakeyLengthEnum SM4 = new DatakeyLengthEnum("SM4");

        private static final Map<String, DatakeyLengthEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DatakeyLengthEnum> createStaticFields() {
            Map<String, DatakeyLengthEnum> map = new HashMap<>();
            map.put("AES_256", AES_256);
            map.put("SM4", SM4);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DatakeyLengthEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DatakeyLengthEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DatakeyLengthEnum(value));
        }

        public static DatakeyLengthEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DatakeyLengthEnum) {
                return this.value.equals(((DatakeyLengthEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datakey_length")

    private DatakeyLengthEnum datakeyLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_key")

    private String publicKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_policy")

    private String keyPolicy;

    public CreateDatakeyCapsuleRequestBody withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * **参数解释：** 密钥ID **约束限制：** UUID格式，满足正则表达式^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$ **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return keyId
     */
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public CreateDatakeyCapsuleRequestBody withDatakeyLength(DatakeyLengthEnum datakeyLength) {
        this.datakeyLength = datakeyLength;
        return this;
    }

    /**
     * **参数解释：** 待创建的数据密钥长度 **约束限制：** 256或者128二选一 **取值范围：** - 128 - 256 **默认取值：** 不涉及
     * @return datakeyLength
     */
    public DatakeyLengthEnum getDatakeyLength() {
        return datakeyLength;
    }

    public void setDatakeyLength(DatakeyLengthEnum datakeyLength) {
        this.datakeyLength = datakeyLength;
    }

    public CreateDatakeyCapsuleRequestBody withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * **参数解释：** 公钥信息，使用RSAES_OAEP_SHA_256算法加密；如果传递了public_key，KMS会使用该公钥对明文数据密钥进行加密，并返回加密后的数据密钥 **约束限制：** 仅支持RSA公钥 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return publicKey
     */
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public CreateDatakeyCapsuleRequestBody withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * **参数解释：** 密钥策略ID和内联的密钥策略二选一 **约束限制：** 仅支持RSA公钥 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public CreateDatakeyCapsuleRequestBody withKeyPolicy(String keyPolicy) {
        this.keyPolicy = keyPolicy;
        return this;
    }

    /**
     * **参数解释：** 密钥策略ID和内联的密钥策略二选一 **约束限制：** 仅支持RSA公钥 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return keyPolicy
     */
    public String getKeyPolicy() {
        return keyPolicy;
    }

    public void setKeyPolicy(String keyPolicy) {
        this.keyPolicy = keyPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDatakeyCapsuleRequestBody that = (CreateDatakeyCapsuleRequestBody) obj;
        return Objects.equals(this.keyId, that.keyId) && Objects.equals(this.datakeyLength, that.datakeyLength)
            && Objects.equals(this.publicKey, that.publicKey) && Objects.equals(this.policyId, that.policyId)
            && Objects.equals(this.keyPolicy, that.keyPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, datakeyLength, publicKey, policyId, keyPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDatakeyCapsuleRequestBody {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    datakeyLength: ").append(toIndentedString(datakeyLength)).append("\n");
        sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    keyPolicy: ").append(toIndentedString(keyPolicy)).append("\n");
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
