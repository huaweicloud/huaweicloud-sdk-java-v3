package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 纳管账号基本信息。
 */
public class AccountBaselineRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_name")

    private String accountName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    private String accountId;

    /**
     * 纳管账号类型。类型包括LOGGING，SECURITY。
     */
    public static final class AccountTypeEnum {

        /**
         * Enum LOGGING for value: "LOGGING"
         */
        public static final AccountTypeEnum LOGGING = new AccountTypeEnum("LOGGING");

        /**
         * Enum SECURITY for value: "SECURITY"
         */
        public static final AccountTypeEnum SECURITY = new AccountTypeEnum("SECURITY");

        private static final Map<String, AccountTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AccountTypeEnum> createStaticFields() {
            Map<String, AccountTypeEnum> map = new HashMap<>();
            map.put("LOGGING", LOGGING);
            map.put("SECURITY", SECURITY);
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

    public AccountBaselineRsp withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * 纳管账号名称。
     * @return accountName
     */
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public AccountBaselineRsp withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * 纳管账号的唯一标识符（ID）。
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public AccountBaselineRsp withAccountType(AccountTypeEnum accountType) {
        this.accountType = accountType;
        return this;
    }

    /**
     * 纳管账号类型。类型包括LOGGING，SECURITY。
     * @return accountType
     */
    public AccountTypeEnum getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountTypeEnum accountType) {
        this.accountType = accountType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccountBaselineRsp that = (AccountBaselineRsp) obj;
        return Objects.equals(this.accountName, that.accountName) && Objects.equals(this.accountId, that.accountId)
            && Objects.equals(this.accountType, that.accountType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountName, accountId, accountType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountBaselineRsp {\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
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
