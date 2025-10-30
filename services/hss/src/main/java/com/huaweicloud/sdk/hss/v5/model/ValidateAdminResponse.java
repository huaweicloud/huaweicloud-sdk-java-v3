package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ValidateAdminResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_admin_account")

    private Boolean isAdminAccount;

    public ValidateAdminResponse withIsAdminAccount(Boolean isAdminAccount) {
        this.isAdminAccount = isAdminAccount;
        return this;
    }

    /**
     * 是否是管理员账号
     * @return isAdminAccount
     */
    public Boolean getIsAdminAccount() {
        return isAdminAccount;
    }

    public void setIsAdminAccount(Boolean isAdminAccount) {
        this.isAdminAccount = isAdminAccount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ValidateAdminResponse that = (ValidateAdminResponse) obj;
        return Objects.equals(this.isAdminAccount, that.isAdminAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAdminAccount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidateAdminResponse {\n");
        sb.append("    isAdminAccount: ").append(toIndentedString(isAdminAccount)).append("\n");
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
