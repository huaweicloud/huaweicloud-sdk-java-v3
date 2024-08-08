package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 用户详细信息。
 */
public class ImageAccountInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account")

    private String account;

    /**
     * 用户类型： * `USER` - 用户 * `USER_GROUP` - 用户组
     */
    public static final class AccountTypeEnum {

        /**
         * Enum USER for value: "USER"
         */
        public static final AccountTypeEnum USER = new AccountTypeEnum("USER");

        /**
         * Enum USER_GROUP for value: "USER_GROUP"
         */
        public static final AccountTypeEnum USER_GROUP = new AccountTypeEnum("USER_GROUP");

        private static final Map<String, AccountTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AccountTypeEnum> createStaticFields() {
            Map<String, AccountTypeEnum> map = new HashMap<>();
            map.put("USER", USER);
            map.put("USER_GROUP", USER_GROUP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AccountTypeEnum(String value) {
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
        public static AccountTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AccountTypeEnum(value));
        }

        public static AccountTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AccountTypeEnum) {
                return this.value.equals(((AccountTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_type")

    private AccountTypeEnum accountType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    public ImageAccountInfo withAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * 用户(组)。
     * @return account
     */
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public ImageAccountInfo withAccountType(AccountTypeEnum accountType) {
        this.accountType = accountType;
        return this;
    }

    /**
     * 用户类型： * `USER` - 用户 * `USER_GROUP` - 用户组
     * @return accountType
     */
    public AccountTypeEnum getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountTypeEnum accountType) {
        this.accountType = accountType;
    }

    public ImageAccountInfo withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 域名城。
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageAccountInfo that = (ImageAccountInfo) obj;
        return Objects.equals(this.account, that.account) && Objects.equals(this.accountType, that.accountType)
            && Objects.equals(this.domain, that.domain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account, accountType, domain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageAccountInfo {\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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
