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
 * 转移密钥请求体
 */
public class TransferKeyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_keyspace_id")

    private String targetKeyspaceId;

    /**
     * **参数解释：** 转移模式 **约束限制：** ASSIGN模式仅支持对称密钥，且密钥必须未属于任何密钥空间，目标密钥空间类型需与密钥所属keystore类型匹配； **取值范围：** - ASSIGN：将密钥分配给目标密钥空间 **默认取值：** ASSIGN
     */
    public static final class TransferModeEnum {

        /**
         * Enum ASSIGN for value: "ASSIGN"
         */
        public static final TransferModeEnum ASSIGN = new TransferModeEnum("ASSIGN");

        private static final Map<String, TransferModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TransferModeEnum> createStaticFields() {
            Map<String, TransferModeEnum> map = new HashMap<>();
            map.put("ASSIGN", ASSIGN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TransferModeEnum(String value) {
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
        public static TransferModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TransferModeEnum(value));
        }

        public static TransferModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TransferModeEnum) {
                return this.value.equals(((TransferModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transfer_mode")

    private TransferModeEnum transferMode;

    public TransferKeyRequestBody withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * **参数解释：** 待转移的密钥ID **约束限制：** 满足正则表达式^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$ **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return keyId
     */
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public TransferKeyRequestBody withTargetKeyspaceId(String targetKeyspaceId) {
        this.targetKeyspaceId = targetKeyspaceId;
        return this;
    }

    /**
     * **参数解释：** 目标密钥空间ID **约束限制：** 满足正则表达式^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$ **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return targetKeyspaceId
     */
    public String getTargetKeyspaceId() {
        return targetKeyspaceId;
    }

    public void setTargetKeyspaceId(String targetKeyspaceId) {
        this.targetKeyspaceId = targetKeyspaceId;
    }

    public TransferKeyRequestBody withTransferMode(TransferModeEnum transferMode) {
        this.transferMode = transferMode;
        return this;
    }

    /**
     * **参数解释：** 转移模式 **约束限制：** ASSIGN模式仅支持对称密钥，且密钥必须未属于任何密钥空间，目标密钥空间类型需与密钥所属keystore类型匹配； **取值范围：** - ASSIGN：将密钥分配给目标密钥空间 **默认取值：** ASSIGN
     * @return transferMode
     */
    public TransferModeEnum getTransferMode() {
        return transferMode;
    }

    public void setTransferMode(TransferModeEnum transferMode) {
        this.transferMode = transferMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TransferKeyRequestBody that = (TransferKeyRequestBody) obj;
        return Objects.equals(this.keyId, that.keyId) && Objects.equals(this.targetKeyspaceId, that.targetKeyspaceId)
            && Objects.equals(this.transferMode, that.transferMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, targetKeyspaceId, transferMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransferKeyRequestBody {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    targetKeyspaceId: ").append(toIndentedString(targetKeyspaceId)).append("\n");
        sb.append("    transferMode: ").append(toIndentedString(transferMode)).append("\n");
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
