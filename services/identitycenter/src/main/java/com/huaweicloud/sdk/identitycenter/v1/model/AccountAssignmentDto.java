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
 * 创建绑定的实体类型
 */
public class AccountAssignmentDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    private String accountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_set_id")

    private String permissionSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal_id")

    private String principalId;

    /**
     * 绑定的实体类型
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

    public AccountAssignmentDto withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * 账号的唯一标识
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public AccountAssignmentDto withPermissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
        return this;
    }

    /**
     * 权限集唯一标识.
     * @return permissionSetId
     */
    public String getPermissionSetId() {
        return permissionSetId;
    }

    public void setPermissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
    }

    public AccountAssignmentDto withPrincipalId(String principalId) {
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

    public AccountAssignmentDto withPrincipalType(PrincipalTypeEnum principalType) {
        this.principalType = principalType;
        return this;
    }

    /**
     * 绑定的实体类型
     * @return principalType
     */
    public PrincipalTypeEnum getPrincipalType() {
        return principalType;
    }

    public void setPrincipalType(PrincipalTypeEnum principalType) {
        this.principalType = principalType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccountAssignmentDto that = (AccountAssignmentDto) obj;
        return Objects.equals(this.accountId, that.accountId)
            && Objects.equals(this.permissionSetId, that.permissionSetId)
            && Objects.equals(this.principalId, that.principalId)
            && Objects.equals(this.principalType, that.principalType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, permissionSetId, principalId, principalType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountAssignmentDto {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    permissionSetId: ").append(toIndentedString(permissionSetId)).append("\n");
        sb.append("    principalId: ").append(toIndentedString(principalId)).append("\n");
        sb.append("    principalType: ").append(toIndentedString(principalType)).append("\n");
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
