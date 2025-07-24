package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AD域配置信息
 */
public class DeleteActiveDirectoryDomainRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_account")

    private String serviceAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    public DeleteActiveDirectoryDomainRequestBody withServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
        return this;
    }

    /**
     * 服务账号，在创建域服务器时指定，一般默认为administrator
     * @return serviceAccount
     */
    public String getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    public DeleteActiveDirectoryDomainRequestBody withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 账号对应密码
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteActiveDirectoryDomainRequestBody that = (DeleteActiveDirectoryDomainRequestBody) obj;
        return Objects.equals(this.serviceAccount, that.serviceAccount) && Objects.equals(this.password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceAccount, password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteActiveDirectoryDomainRequestBody {\n");
        sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
