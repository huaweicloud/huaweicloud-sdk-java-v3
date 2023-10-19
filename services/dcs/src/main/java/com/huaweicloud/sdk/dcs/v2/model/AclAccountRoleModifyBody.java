package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * AclAccountRoleModifyBody
 */
public class AclAccountRoleModifyBody {

    /**
     * 账号权限
     */
    public static final class AccountRoleEnum {

        /**
         * Enum READ for value: "read"
         */
        public static final AccountRoleEnum READ = new AccountRoleEnum("read");

        /**
         * Enum WRITE for value: "write"
         */
        public static final AccountRoleEnum WRITE = new AccountRoleEnum("write");

        private static final Map<String, AccountRoleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AccountRoleEnum> createStaticFields() {
            Map<String, AccountRoleEnum> map = new HashMap<>();
            map.put("read", READ);
            map.put("write", WRITE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AccountRoleEnum(String value) {
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
        public static AccountRoleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AccountRoleEnum(value));
        }

        public static AccountRoleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AccountRoleEnum) {
                return this.value.equals(((AccountRoleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_role")

    private AccountRoleEnum accountRole;

    public AclAccountRoleModifyBody withAccountRole(AccountRoleEnum accountRole) {
        this.accountRole = accountRole;
        return this;
    }

    /**
     * 账号权限
     * @return accountRole
     */
    public AccountRoleEnum getAccountRole() {
        return accountRole;
    }

    public void setAccountRole(AccountRoleEnum accountRole) {
        this.accountRole = accountRole;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AclAccountRoleModifyBody that = (AclAccountRoleModifyBody) obj;
        return Objects.equals(this.accountRole, that.accountRole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountRole);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AclAccountRoleModifyBody {\n");
        sb.append("    accountRole: ").append(toIndentedString(accountRole)).append("\n");
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
