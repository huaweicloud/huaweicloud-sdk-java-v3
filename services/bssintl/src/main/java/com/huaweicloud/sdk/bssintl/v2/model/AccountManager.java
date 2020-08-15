package com.huaweicloud.sdk.bssintl.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AccountManager
 */
public class AccountManager  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="account_name")
    
    private String accountName;

    public AccountManager withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    


    /**
     * |参数名称：客户经理登录名称。| |参数约束及描述：客户经理登录名称。最大长度128，必填|
     * @return accountName
     */
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountManager accountManager = (AccountManager) o;
        return Objects.equals(this.accountName, accountManager.accountName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(accountName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountManager {\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
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

