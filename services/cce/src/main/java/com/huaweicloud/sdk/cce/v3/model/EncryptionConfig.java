package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * EncryptionConfig
 */
public class EncryptionConfig {

    /**
     * **参数解释**： 加密模式，取值为Default或KMS。默认为Default，即使用cce本地密钥加密。若使用KMS加密模式则使用用户自定义密钥或默认密钥加密secret资源。 若用户在创建时未填写，则集群查询接口中默认会返回Default。 **约束限制**： 不涉及 **取值范围**： 取值范围：[Default, KMS]; **默认取值**： Default
     */
    public static final class ModeEnum {

        /**
         * Enum DEFAULT for value: "Default"
         */
        public static final ModeEnum DEFAULT = new ModeEnum("Default");

        /**
         * Enum KMS for value: "KMS"
         */
        public static final ModeEnum KMS = new ModeEnum("KMS");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("Default", DEFAULT);
            map.put("KMS", KMS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
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
        public static ModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModeEnum(value));
        }

        public static ModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private ModeEnum mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kmsKeyID")

    private String kmsKeyID;

    public EncryptionConfig withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * **参数解释**： 加密模式，取值为Default或KMS。默认为Default，即使用cce本地密钥加密。若使用KMS加密模式则使用用户自定义密钥或默认密钥加密secret资源。 若用户在创建时未填写，则集群查询接口中默认会返回Default。 **约束限制**： 不涉及 **取值范围**： 取值范围：[Default, KMS]; **默认取值**： Default
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public EncryptionConfig withKmsKeyID(String kmsKeyID) {
        this.kmsKeyID = kmsKeyID;
        return this;
    }

    /**
     * **参数解释**： kms密钥ID - 集群创建API中，如果mode字段设置为Default，无需填写该字段；如果mode字段设置为KMS，则支持填写该字段。若字段为空，则默认使用KMS默认密钥进行填充，默认密钥不存在时云服务将自动为用户创建cce/default默认密钥。 用户需使用真实存在的KMS密钥，并且在集群生命周期结束前，禁止删除、禁用密钥等操作，防止集群功能异常（集群设置该密钥后不允许修改）。  - 集群查询API中，如果mode字段设置为Default，则该字段返回为空；若mode字段设置为KMS，则该字段为具体的密钥ID。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return kmsKeyID
     */
    public String getKmsKeyID() {
        return kmsKeyID;
    }

    public void setKmsKeyID(String kmsKeyID) {
        this.kmsKeyID = kmsKeyID;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EncryptionConfig that = (EncryptionConfig) obj;
        return Objects.equals(this.mode, that.mode) && Objects.equals(this.kmsKeyID, that.kmsKeyID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode, kmsKeyID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EncryptionConfig {\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    kmsKeyID: ").append(toIndentedString(kmsKeyID)).append("\n");
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
