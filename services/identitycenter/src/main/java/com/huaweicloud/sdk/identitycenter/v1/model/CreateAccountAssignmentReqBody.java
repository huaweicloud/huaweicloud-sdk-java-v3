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
 * CreateAccountAssignment请求体
 */
public class CreateAccountAssignmentReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_set_id")

    private String permissionSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal_id")

    private String principalId;

    /**
     * 创建绑定的实体类型
     */
    public static final class PrincipalTypeEnum {

        /**
         * Enum USER for value: "USER"
         */
        public static final PrincipalTypeEnum USER = new PrincipalTypeEnum("USER");

        /**
         * Enum GROUP for value: "GROUP"
         */
        public static final PrincipalTypeEnum GROUP = new PrincipalTypeEnum("GROUP");

        private static final Map<String, PrincipalTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PrincipalTypeEnum> createStaticFields() {
            Map<String, PrincipalTypeEnum> map = new HashMap<>();
            map.put("USER", USER);
            map.put("GROUP", GROUP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PrincipalTypeEnum(String value) {
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
        public static PrincipalTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PrincipalTypeEnum(value));
        }

        public static PrincipalTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PrincipalTypeEnum) {
                return this.value.equals(((PrincipalTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal_type")

    private PrincipalTypeEnum principalType;

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

        private static final Map<String, TargetTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TargetTypeEnum> createStaticFields() {
            Map<String, TargetTypeEnum> map = new HashMap<>();
            map.put("ACCOUNT", ACCOUNT);
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

    public CreateAccountAssignmentReqBody withPermissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
        return this;
    }

    /**
     * 权限集唯一标识
     * @return permissionSetId
     */
    public String getPermissionSetId() {
        return permissionSetId;
    }

    public void setPermissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
    }

    public CreateAccountAssignmentReqBody withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * IAM身份中心中的一个实体身份唯一标识，例如用户或用户组
     * @return principalId
     */
    public String getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    public CreateAccountAssignmentReqBody withPrincipalType(PrincipalTypeEnum principalType) {
        this.principalType = principalType;
        return this;
    }

    /**
     * 创建绑定的实体类型
     * @return principalType
     */
    public PrincipalTypeEnum getPrincipalType() {
        return principalType;
    }

    public void setPrincipalType(PrincipalTypeEnum principalType) {
        this.principalType = principalType;
    }

    public CreateAccountAssignmentReqBody withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * 待绑定的目标实体标识.
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public CreateAccountAssignmentReqBody withTargetType(TargetTypeEnum targetType) {
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
        CreateAccountAssignmentReqBody that = (CreateAccountAssignmentReqBody) obj;
        return Objects.equals(this.permissionSetId, that.permissionSetId)
            && Objects.equals(this.principalId, that.principalId)
            && Objects.equals(this.principalType, that.principalType) && Objects.equals(this.targetId, that.targetId)
            && Objects.equals(this.targetType, that.targetType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissionSetId, principalId, principalType, targetId, targetType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAccountAssignmentReqBody {\n");
        sb.append("    permissionSetId: ").append(toIndentedString(permissionSetId)).append("\n");
        sb.append("    principalId: ").append(toIndentedString(principalId)).append("\n");
        sb.append("    principalType: ").append(toIndentedString(principalType)).append("\n");
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
