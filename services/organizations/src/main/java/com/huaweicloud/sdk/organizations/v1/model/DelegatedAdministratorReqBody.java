package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 委托管理员相关操作的请求体。
 */
public class DelegatedAdministratorReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_principal")

    private String servicePrincipal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    private String accountId;

    public DelegatedAdministratorReqBody withServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
        return this;
    }

    /**
     * 服务主体名称。
     * @return servicePrincipal
     */
    public String getServicePrincipal() {
        return servicePrincipal;
    }

    public void setServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
    }

    public DelegatedAdministratorReqBody withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * 帐号的唯一标识符（ID）。
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DelegatedAdministratorReqBody delegatedAdministratorReqBody = (DelegatedAdministratorReqBody) o;
        return Objects.equals(this.servicePrincipal, delegatedAdministratorReqBody.servicePrincipal)
            && Objects.equals(this.accountId, delegatedAdministratorReqBody.accountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(servicePrincipal, accountId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DelegatedAdministratorReqBody {\n");
        sb.append("    servicePrincipal: ").append(toIndentedString(servicePrincipal)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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
