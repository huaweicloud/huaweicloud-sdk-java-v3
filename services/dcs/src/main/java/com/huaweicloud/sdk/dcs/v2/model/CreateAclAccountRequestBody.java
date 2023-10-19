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
 * 创建ACL账号
 */
public class CreateAclAccountRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_name")

    private String accountName;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_password")

    private String accountPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public CreateAclAccountRequestBody withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * 账号名称 - 以字母开头。 - 内容由字母、数字、中划线、下划线组成。 - 长度范围[1~64]个字符。 
     * @return accountName
     */
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public CreateAclAccountRequestBody withAccountRole(AccountRoleEnum accountRole) {
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

    public CreateAclAccountRequestBody withAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }

    /**
     * 账号密码 - 输入长度为8到64位的字符串。 - 不能包含正序逆序用户名。 - 必须包含如下四种字符中的三种组合（不允许包含冒号）：   - 小写字母   - 大写字母   - 数字   - 特殊字符包括（`~!@#$%^&*()-_=+\\|{},<.>/?） 
     * @return accountPassword
     */
    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public CreateAclAccountRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 账号描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAclAccountRequestBody that = (CreateAclAccountRequestBody) obj;
        return Objects.equals(this.accountName, that.accountName) && Objects.equals(this.accountRole, that.accountRole)
            && Objects.equals(this.accountPassword, that.accountPassword)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountName, accountRole, accountPassword, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAclAccountRequestBody {\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    accountRole: ").append(toIndentedString(accountRole)).append("\n");
        sb.append("    accountPassword: ").append(toIndentedString(accountPassword)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
