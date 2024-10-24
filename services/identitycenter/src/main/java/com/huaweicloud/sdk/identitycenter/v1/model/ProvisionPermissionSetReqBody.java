package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ProvisionPermissionSet的请求体
 */
public class ProvisionPermissionSetReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_id")

    private String targetId;

    /**
     * 创建绑定的实体类型
     */
    public static final class TargetTypeEnum {

        /**
         * Enum ACCOUNT for value: "ACCOUNT"
         */
        public static final TargetTypeEnum ACCOUNT = new TargetTypeEnum("ACCOUNT");

        /**
         * Enum ALL_PROVISIONED_ACCOUNTS for value: "ALL_PROVISIONED_ACCOUNTS"
         */
        public static final TargetTypeEnum ALL_PROVISIONED_ACCOUNTS = new TargetTypeEnum("ALL_PROVISIONED_ACCOUNTS");

        private static final Map<String, TargetTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TargetTypeEnum> createStaticFields() {
            Map<String, TargetTypeEnum> map = new HashMap<>();
            map.put("ACCOUNT", ACCOUNT);
            map.put("ALL_PROVISIONED_ACCOUNTS", ALL_PROVISIONED_ACCOUNTS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TargetTypeEnum(String value) {
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
        public static TargetTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TargetTypeEnum(value));
        }

        public static TargetTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TargetTypeEnum) {
                return this.value.equals(((TargetTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_type")

    private TargetTypeEnum targetType;

    public ProvisionPermissionSetReqBody withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * 账号ID
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public ProvisionPermissionSetReqBody withTargetType(TargetTypeEnum targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * 创建绑定的实体类型
     * @return targetType
     */
    public TargetTypeEnum getTargetType() {
        return targetType;
    }

    public void setTargetType(TargetTypeEnum targetType) {
        this.targetType = targetType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProvisionPermissionSetReqBody that = (ProvisionPermissionSetReqBody) obj;
        return Objects.equals(this.targetId, that.targetId) && Objects.equals(this.targetType, that.targetType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetId, targetType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProvisionPermissionSetReqBody {\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
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
