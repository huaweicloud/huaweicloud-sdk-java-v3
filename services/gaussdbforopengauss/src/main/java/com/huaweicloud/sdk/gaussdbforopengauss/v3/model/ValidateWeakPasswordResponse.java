package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ValidateWeakPasswordResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_weak_password")

    private Boolean isWeakPassword;

    public ValidateWeakPasswordResponse withIsWeakPassword(Boolean isWeakPassword) {
        this.isWeakPassword = isWeakPassword;
        return this;
    }

    /**
     * 是否为弱密码。 - 返回\"true\"，是弱密码。 - 返回\"false\"，不是弱密码。
     * @return isWeakPassword
     */
    public Boolean getIsWeakPassword() {
        return isWeakPassword;
    }

    public void setIsWeakPassword(Boolean isWeakPassword) {
        this.isWeakPassword = isWeakPassword;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ValidateWeakPasswordResponse that = (ValidateWeakPasswordResponse) obj;
        return Objects.equals(this.isWeakPassword, that.isWeakPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isWeakPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidateWeakPasswordResponse {\n");
        sb.append("    isWeakPassword: ").append(toIndentedString(isWeakPassword)).append("\n");
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
