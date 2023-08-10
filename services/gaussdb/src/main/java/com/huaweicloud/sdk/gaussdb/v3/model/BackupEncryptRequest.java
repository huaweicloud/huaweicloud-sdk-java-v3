package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * taurus支持备份加密的请求体。
 */
public class BackupEncryptRequest {

    /**
     * 加密类型。当前只支持kms。 开启加密时必传，关闭加密时不传。 不区分大小写。
     */
    public static final class TypeEnum {

        /**
         * Enum KMS for value: "kms"
         */
        public static final TypeEnum KMS = new TypeEnum("kms");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("kms", KMS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_key_id")

    private String kmsKeyId;

    /**
     * 开启或关闭加密。不区分大小写。
     */
    public static final class EncryptionStatusEnum {

        /**
         * Enum ON for value: "on"
         */
        public static final EncryptionStatusEnum ON = new EncryptionStatusEnum("on");

        /**
         * Enum OFF for value: "off"
         */
        public static final EncryptionStatusEnum OFF = new EncryptionStatusEnum("off");

        private static final Map<String, EncryptionStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EncryptionStatusEnum> createStaticFields() {
            Map<String, EncryptionStatusEnum> map = new HashMap<>();
            map.put("on", ON);
            map.put("off", OFF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EncryptionStatusEnum(String value) {
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
        public static EncryptionStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EncryptionStatusEnum(value));
        }

        public static EncryptionStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EncryptionStatusEnum) {
                return this.value.equals(((EncryptionStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encryption_status")

    private EncryptionStatusEnum encryptionStatus;

    public BackupEncryptRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 加密类型。当前只支持kms。 开启加密时必传，关闭加密时不传。 不区分大小写。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public BackupEncryptRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * kms加密ID。加密时必传，关闭加密时候不传。
     * @return kmsKeyId
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    public BackupEncryptRequest withEncryptionStatus(EncryptionStatusEnum encryptionStatus) {
        this.encryptionStatus = encryptionStatus;
        return this;
    }

    /**
     * 开启或关闭加密。不区分大小写。
     * @return encryptionStatus
     */
    public EncryptionStatusEnum getEncryptionStatus() {
        return encryptionStatus;
    }

    public void setEncryptionStatus(EncryptionStatusEnum encryptionStatus) {
        this.encryptionStatus = encryptionStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackupEncryptRequest that = (BackupEncryptRequest) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.kmsKeyId, that.kmsKeyId)
            && Objects.equals(this.encryptionStatus, that.encryptionStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, kmsKeyId, encryptionStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupEncryptRequest {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    kmsKeyId: ").append(toIndentedString(kmsKeyId)).append("\n");
        sb.append("    encryptionStatus: ").append(toIndentedString(encryptionStatus)).append("\n");
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
