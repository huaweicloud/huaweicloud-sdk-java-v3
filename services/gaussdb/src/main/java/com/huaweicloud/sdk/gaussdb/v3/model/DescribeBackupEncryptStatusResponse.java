package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class DescribeBackupEncryptStatusResponse extends SdkResponse {

    /**
     * 备份加密状态。
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

    public DescribeBackupEncryptStatusResponse withEncryptionStatus(EncryptionStatusEnum encryptionStatus) {
        this.encryptionStatus = encryptionStatus;
        return this;
    }

    /**
     * 备份加密状态。
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
        DescribeBackupEncryptStatusResponse that = (DescribeBackupEncryptStatusResponse) obj;
        return Objects.equals(this.encryptionStatus, that.encryptionStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encryptionStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DescribeBackupEncryptStatusResponse {\n");
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
